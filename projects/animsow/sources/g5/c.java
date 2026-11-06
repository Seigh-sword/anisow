package g5;

import d.AbstractC0628i;
import f5.C0710g;
import f5.j;
import f5.w;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f8535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f8536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f8537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f8538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f8539e;

    static {
        j jVar = j.f8462z;
        f8535a = P2.e.g("/");
        f8536b = P2.e.g("\\");
        f8537c = P2.e.g("/\\");
        f8538d = P2.e.g(".");
        f8539e = P2.e.g("..");
    }

    public static final int a(w wVar) {
        if (wVar.f8493w.d() == 0) {
            return -1;
        }
        j jVar = wVar.f8493w;
        if (jVar.i(0) != 47) {
            if (jVar.i(0) != 92) {
                if (jVar.d() <= 2 || jVar.i(1) != 58 || jVar.i(2) != 92) {
                    return -1;
                }
                char cI = (char) jVar.i(0);
                return (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) ? -1 : 3;
            }
            if (jVar.d() > 2 && jVar.i(1) == 92) {
                j jVar2 = f8536b;
                AbstractC1305a.o(jVar2, "other");
                int iF = jVar.f(2, jVar2.f8463w);
                return iF == -1 ? jVar.d() : iF;
            }
        }
        return 1;
    }

    public static final w b(w wVar, w wVar2, boolean z5) {
        AbstractC1305a.o(wVar, "<this>");
        AbstractC1305a.o(wVar2, "child");
        if (a(wVar2) != -1 || wVar2.g() != null) {
            return wVar2;
        }
        j jVarC = c(wVar);
        if (jVarC == null && (jVarC = c(wVar2)) == null) {
            jVarC = f(w.f8492x);
        }
        C0710g c0710g = new C0710g();
        c0710g.U(wVar.f8493w);
        if (c0710g.f8461x > 0) {
            c0710g.U(jVarC);
        }
        c0710g.U(wVar2.f8493w);
        return d(c0710g, z5);
    }

    public static final j c(w wVar) {
        j jVar = wVar.f8493w;
        j jVar2 = f8535a;
        if (j.g(jVar, jVar2) != -1) {
            return jVar2;
        }
        j jVar3 = f8536b;
        if (j.g(wVar.f8493w, jVar3) != -1) {
            return jVar3;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0115 A[EDGE_INSN: B:104:0x0115->B:87:0x0115 BREAK  A[LOOP:1: B:54:0x00a4->B:66:0x00d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final f5.w d(f5.C0710g r16, boolean r17) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.c.d(f5.g, boolean):f5.w");
    }

    public static final j e(byte b6) {
        if (b6 == 47) {
            return f8535a;
        }
        if (b6 == 92) {
            return f8536b;
        }
        throw new IllegalArgumentException(AbstractC0628i.f("not a directory separator: ", b6));
    }

    public static final j f(String str) {
        if (AbstractC1305a.c(str, "/")) {
            return f8535a;
        }
        if (AbstractC1305a.c(str, "\\")) {
            return f8536b;
        }
        throw new IllegalArgumentException(AbstractC0628i.q("not a directory separator: ", str));
    }
}
