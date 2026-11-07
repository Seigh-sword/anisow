import {
  type CSSProperties,
  type ElementType,
  type ReactNode,
  useCallback,
  useRef,
  useState,
} from "react";

type GlassLevel = "subtle" | "regular" | "strong" | "floating";

interface GlassProps {
  children?: ReactNode;
  /** How much of the backdrop to show through. */
  level?: GlassLevel;
  /** Adds the gradient hairline. Use sparingly: it is an accent, not a border. */
  lit?: boolean;
  /** Follows the pointer with a soft specular highlight. */
  specular?: boolean;
  radius?: number | string;
  padding?: number | string;
  className?: string;
  style?: CSSProperties;
  as?: ElementType;
  onClick?: () => void;
  /** Accessible name for a clickable panel. */
  label?: string;
}

const levelClass: Record<GlassLevel, string> = {
  subtle: "glass glass--subtle",
  regular: "glass",
  strong: "glass glass--strong",
  floating: "glass glass--floating",
};

/**
 * A glass surface.
 *
 * The specular highlight is the detail that makes this feel physical rather than
 * flat: a radial gradient follows the pointer, so the sheet reads as having a
 * surface that catches light as it moves. It is pointer-only — on touch there is
 * no hover to follow, and the panel is already responding to the press.
 */
export function Glass({
  children,
  level = "regular",
  lit = false,
  specular = false,
  radius,
  padding,
  className = "",
  style,
  as: Tag = "div",
  onClick,
  label,
}: GlassProps) {
  const ref = useRef<HTMLElement | null>(null);
  const [glow, setGlow] = useState<{ x: number; y: number } | null>(null);

  const onPointerMove = useCallback((event: React.PointerEvent) => {
    if (event.pointerType !== "mouse") return;
    const node = ref.current;
    if (!node) return;
    const box = node.getBoundingClientRect();
    setGlow({
      x: ((event.clientX - box.left) / box.width) * 100,
      y: ((event.clientY - box.top) / box.height) * 100,
    });
  }, []);

  const onPointerLeave = useCallback(() => setGlow(null), []);

  const classes = [
    levelClass[level],
    lit ? "glass--lit" : "",
    onClick ? "pressable" : "",
    className,
  ]
    .filter(Boolean)
    .join(" ");

  return (
    <Tag
      ref={ref}
      className={classes}
      onPointerMove={specular ? onPointerMove : undefined}
      onPointerLeave={specular ? onPointerLeave : undefined}
      onClick={onClick}
      role={onClick ? "button" : undefined}
      aria-label={label}
      tabIndex={onClick ? 0 : undefined}
      onKeyDown={
        onClick
          ? (event: React.KeyboardEvent) => {
              if (event.key === "Enter" || event.key === " ") {
                event.preventDefault();
                onClick();
              }
            }
          : undefined
      }
      style={{
        borderRadius: radius,
        padding,
        cursor: onClick ? "pointer" : undefined,
        position: "relative",
        overflow: "hidden",
        ...style,
      }}
    >
      {specular && (
        <span
          aria-hidden
          style={{
            position: "absolute",
            inset: 0,
            pointerEvents: "none",
            opacity: glow ? 1 : 0,
            transition: "opacity 260ms ease",
            background: glow
              ? `radial-gradient(420px circle at ${glow.x}% ${glow.y}%, rgba(255,255,255,0.13), transparent 62%)`
              : undefined,
          }}
        />
      )}
      {children}
    </Tag>
  );
}
