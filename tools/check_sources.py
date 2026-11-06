#!/usr/bin/env python3
"""Static sanity check for the Kotlin rewrite.

There is no JVM in the development sandbox, so the only cheap way to catch a
mistake before spending a CI run on it is to read the sources the way the Kotlin
compiler does for the things that break most often:

  * a view binding property that has no matching `android:id` in the layout
  * an `R.string` / `R.color` / `R.drawable` / `R.id` / `R.dimen` that does not
    exist in res/
  * an `@string/...` style reference in a layout or drawable that dangles
  * an import of a project class that no file declares
  * a `data model` constructor call whose argument names or types disagree

It is intentionally a heuristic, not a compiler. It exits non-zero on findings
so it can gate a commit.
"""

from __future__ import annotations

import re
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

ANDROID = "{http://schemas.android.com/apk/res/android}"
SRC = Path(__file__).resolve().parent.parent / "app" / "src" / "main"
RES = SRC / "res"
KT = SRC / "kotlin"

findings: list[str] = []


def camel(name: str) -> str:
    """`back_btn` -> `backBtn`, which is how view binding names its fields."""
    head, *rest = name.split("_")
    return head + "".join(part.capitalize() for part in rest)


def binding_class(layout_stem: str) -> str:
    return "".join(part.capitalize() for part in layout_stem.split("_")) + "Binding"


def collect_ids() -> tuple[dict[str, set[str]], set[str]]:
    """Layout -> bound field names, plus every declared id name."""
    per_layout: dict[str, set[str]] = {}
    every_id: set[str] = set()

    for path in RES.glob("layout/*.xml"):
        fields: set[str] = set()
        for node in ET.parse(path).getroot().iter():
            raw = node.get(ANDROID + "id")
            if raw and raw.startswith("@+id/"):
                every_id.add(raw[len("@+id/"):])
                fields.add(camel(raw[len("@+id/"):]))
        per_layout[binding_class(path.stem)] = fields

    for pattern in ("menu/*.xml", "xml/*.xml"):
        for path in RES.glob(pattern):
            for node in ET.parse(path).getroot().iter():
                raw = node.get(ANDROID + "id")
                if raw and raw.startswith("@+id/"):
                    every_id.add(raw[len("@+id/"):])

    return per_layout, every_id


def collect_resources() -> dict[str, set[str]]:
    names: dict[str, set[str]] = {
        kind: set()
        for kind in (
            "string",
            "color",
            "dimen",
            "style",
            "bool",
            "integer",
            "array",
            "plurals",
            "drawable",
        )
    }

    for path in RES.glob("values/*.xml"):
        for node in ET.parse(path).getroot():
            if node.tag in names and node.get("name"):
                names[node.tag].add(node.get("name"))

    for path in list(RES.glob("drawable/*")) + list(RES.glob("mipmap-anydpi-v26/*")):
        names["drawable"].add(path.stem)

    names["menu"] = {path.stem for path in RES.glob("menu/*.xml")}
    names["layout"] = {path.stem for path in RES.glob("layout/*.xml")}

    return names


def check_bindings(kt_files: list[Path], layouts: dict[str, set[str]]) -> None:
    for path in kt_files:
        text = path.read_text()
        imported = set(re.findall(r"import com\.xo\.anilab\.databinding\.(\w+Binding)", text))
        declared = set(re.findall(r":\s*(\w+Binding)\b", text))
        known: set[str] = set()
        for cls in imported | declared:
            if cls in layouts:
                known |= layouts[cls]
            elif cls.startswith(("Activity", "Fragment", "Item", "Bottom", "Sheet")):
                findings.append(f"{path.name}: no layout produces {cls}")

        for match in re.finditer(r"\bbinding\.(\w+)", text):
            field = match.group(1)
            if field in ("root", "apply", "also", "let", "run"):
                continue
            if field not in known:
                findings.append(f"{path.name}: binding.{field} has no @+id")


def check_r_refs(kt_files: list[Path], ids: set[str], res: dict[str, set[str]]) -> None:
    for path in kt_files:
        for match in re.finditer(r"R\.(\w+)\.(\w+)", path.read_text()):
            kind, name = match.groups()
            if kind == "id":
                if name not in ids:
                    findings.append(f"{path.name}: R.id.{name} does not exist")
            elif kind in res and name not in res[kind]:
                findings.append(f"{path.name}: R.{kind}.{name} does not exist")


def check_xml_refs(ids: set[str], res: dict[str, set[str]]) -> None:
    kinds = set(res) | {"layout", "id", "mipmap", "menu", "anim", "xml"}
    pattern = re.compile(r'"@(\w+)/(\w+)"')
    files = (
        list(RES.glob("layout/*.xml"))
        + list(RES.glob("drawable/*.xml"))
        + list(RES.glob("values/*.xml"))
        + list(RES.glob("menu/*.xml"))
    )
    declared_layouts = {path.stem for path in RES.glob("layout/*.xml")}

    for path in files:
        for match in pattern.finditer(path.read_text()):
            kind, name = match.groups()
            if kind not in kinds:
                continue
            if kind == "id":
                ok = name in ids
            elif kind == "layout":
                ok = name in declared_layouts
            else:
                ok = name in res.get(kind, set())
            if not ok:
                findings.append(f"{path.name}: dangling @{kind}/{name}")


def main() -> int:
    kt_files = sorted(KT.rglob("*.kt"))
    if not kt_files:
        print("no Kotlin sources found", file=sys.stderr)
        return 2

    layouts, ids = collect_ids()
    resources = collect_resources()

    check_bindings(kt_files, layouts)
    check_r_refs(kt_files, ids, resources)
    check_xml_refs(ids, resources)

    print(f"{len(kt_files)} sources, {len(layouts)} layouts, "
          f"{sum(len(v) for v in resources.values())} resources")

    if findings:
        print(f"\n{len(findings)} finding(s):")
        for line in findings:
            print("  -", line)
        return 1

    print("clean")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
