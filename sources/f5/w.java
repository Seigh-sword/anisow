package f5;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f8492x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f8493w;

    static {
        String str = File.separator;
        AbstractC1305a.n(str, "separator");
        f8492x = str;
    }

    public w(j jVar) {
        AbstractC1305a.o(jVar, "bytes");
        this.f8493w = jVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = g5.c.a(this);
        j jVar = this.f8493w;
        if (iA == -1) {
            iA = 0;
        } else if (iA < jVar.d() && jVar.i(iA) == 92) {
            iA++;
        }
        int iD = jVar.d();
        int i6 = iA;
        while (iA < iD) {
            if (jVar.i(iA) == 47 || jVar.i(iA) == 92) {
                arrayList.add(jVar.n(i6, iA));
                i6 = iA + 1;
            }
            iA++;
        }
        if (i6 < jVar.d()) {
            arrayList.add(jVar.n(i6, jVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        j jVar = g5.c.f8535a;
        j jVar2 = g5.c.f8535a;
        j jVarO = this.f8493w;
        int iK = j.k(jVarO, jVar2);
        if (iK == -1) {
            iK = j.k(jVarO, g5.c.f8536b);
        }
        if (iK != -1) {
            jVarO = j.o(jVarO, iK + 1, 0, 2);
        } else if (g() != null && jVarO.d() == 2) {
            jVarO = j.f8462z;
        }
        return jVarO.q();
    }

    public final w c() {
        j jVar = g5.c.f8538d;
        j jVar2 = this.f8493w;
        if (AbstractC1305a.c(jVar2, jVar)) {
            return null;
        }
        j jVar3 = g5.c.f8535a;
        if (AbstractC1305a.c(jVar2, jVar3)) {
            return null;
        }
        j jVar4 = g5.c.f8536b;
        if (AbstractC1305a.c(jVar2, jVar4)) {
            return null;
        }
        j jVar5 = g5.c.f8539e;
        jVar2.getClass();
        AbstractC1305a.o(jVar5, "suffix");
        int iD = jVar2.d();
        byte[] bArr = jVar5.f8463w;
        if (jVar2.m(iD - bArr.length, jVar5, bArr.length) && (jVar2.d() == 2 || jVar2.m(jVar2.d() - 3, jVar3, 1) || jVar2.m(jVar2.d() - 3, jVar4, 1))) {
            return null;
        }
        int iK = j.k(jVar2, jVar3);
        if (iK == -1) {
            iK = j.k(jVar2, jVar4);
        }
        if (iK == 2 && g() != null) {
            if (jVar2.d() == 3) {
                return null;
            }
            return new w(j.o(jVar2, 0, 3, 1));
        }
        if (iK == 1) {
            AbstractC1305a.o(jVar4, "prefix");
            if (jVar2.m(0, jVar4, jVar4.d())) {
                return null;
            }
        }
        if (iK != -1 || g() == null) {
            return iK == -1 ? new w(jVar) : iK == 0 ? new w(j.o(jVar2, 0, 1, 1)) : new w(j.o(jVar2, 0, iK, 1));
        }
        if (jVar2.d() == 2) {
            return null;
        }
        return new w(j.o(jVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        AbstractC1305a.o(wVar, "other");
        return this.f8493w.compareTo(wVar.f8493w);
    }

    public final w d(String str) {
        AbstractC1305a.o(str, "child");
        C0710g c0710g = new C0710g();
        c0710g.c0(str);
        return g5.c.b(this, g5.c.d(c0710g, false), false);
    }

    public final File e() {
        return new File(this.f8493w.q());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && AbstractC1305a.c(((w) obj).f8493w, this.f8493w);
    }

    public final Path f() {
        Path path = Paths.get(this.f8493w.q(), new String[0]);
        AbstractC1305a.n(path, "get(toString())");
        return path;
    }

    public final Character g() {
        j jVar = g5.c.f8535a;
        j jVar2 = this.f8493w;
        if (j.g(jVar2, jVar) != -1 || jVar2.d() < 2 || jVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) jVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f8493w.hashCode();
    }

    public final String toString() {
        return this.f8493w.q();
    }
}
