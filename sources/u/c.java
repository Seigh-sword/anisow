package u;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1355b f12772d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f12769a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12770b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12771c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12773e = false;

    public c(P0.h hVar) {
        this.f12772d = new C1354a(this, hVar);
    }

    public final void a(d dVar, int i6) {
        this.f12772d.e(dVar.j(i6), 1.0f);
        this.f12772d.e(dVar.j(i6), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i6) {
        boolean z5;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z5 = true;
            } else {
                z5 = false;
            }
            this.f12770b = i6;
            if (z5) {
                this.f12772d.e(iVar, 1.0f);
                this.f12772d.e(iVar2, -1.0f);
                this.f12772d.e(iVar3, -1.0f);
                return;
            }
        }
        this.f12772d.e(iVar, -1.0f);
        this.f12772d.e(iVar2, 1.0f);
        this.f12772d.e(iVar3, 1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i6) {
        boolean z5;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z5 = true;
            } else {
                z5 = false;
            }
            this.f12770b = i6;
            if (z5) {
                this.f12772d.e(iVar, 1.0f);
                this.f12772d.e(iVar2, -1.0f);
                this.f12772d.e(iVar3, 1.0f);
                return;
            }
        }
        this.f12772d.e(iVar, -1.0f);
        this.f12772d.e(iVar2, 1.0f);
        this.f12772d.e(iVar3, -1.0f);
    }

    public i d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f12769a == null && this.f12770b == 0.0f && this.f12772d.k() == 0;
    }

    public final i f(boolean[] zArr, i iVar) {
        int i6;
        int iK = this.f12772d.k();
        i iVar2 = null;
        float f6 = 0.0f;
        for (int i7 = 0; i7 < iK; i7++) {
            float fA = this.f12772d.a(i7);
            if (fA < 0.0f) {
                i iVarF = this.f12772d.f(i7);
                if ((zArr == null || !zArr[iVarF.f12810x]) && iVarF != iVar && (((i6 = iVarF.f12808H) == 3 || i6 == 4) && fA < f6)) {
                    f6 = fA;
                    iVar2 = iVarF;
                }
            }
        }
        return iVar2;
    }

    public final void g(i iVar) {
        i iVar2 = this.f12769a;
        if (iVar2 != null) {
            this.f12772d.e(iVar2, -1.0f);
            this.f12769a.f12811y = -1;
            this.f12769a = null;
        }
        float fG = this.f12772d.g(iVar, true) * (-1.0f);
        this.f12769a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f12770b /= fG;
        this.f12772d.h(fG);
    }

    public final void h(d dVar, i iVar, boolean z5) {
        if (iVar == null || !iVar.f12802B) {
            return;
        }
        float fD = this.f12772d.d(iVar);
        this.f12770b = (iVar.f12801A * fD) + this.f12770b;
        this.f12772d.g(iVar, z5);
        if (z5) {
            iVar.b(this);
        }
        if (this.f12772d.k() == 0) {
            this.f12773e = true;
            dVar.f12776a = true;
        }
    }

    public void i(d dVar, c cVar, boolean z5) {
        float fI = this.f12772d.i(cVar, z5);
        this.f12770b = (cVar.f12770b * fI) + this.f12770b;
        if (z5) {
            cVar.f12769a.b(this);
        }
        if (this.f12769a == null || this.f12772d.k() != 0) {
            return;
        }
        this.f12773e = true;
        dVar.f12776a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            u.i r0 = r10.f12769a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            u.i r1 = r10.f12769a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = d.AbstractC0628i.i(r0, r1)
            float r1 = r10.f12770b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f12770b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            u.b r5 = r10.f12772d
            int r5 = r5.k()
        L40:
            if (r4 >= r5) goto L9c
            u.b r6 = r10.f12772d
            u.i r6 = r6.f(r4)
            if (r6 != 0) goto L4b
            goto L99
        L4b:
            u.b r7 = r10.f12772d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L99
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
        L64:
            java.lang.String r0 = d.AbstractC0628i.i(r0, r1)
            float r7 = r7 * r9
            goto L76
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = d.AbstractC0628i.i(r0, r1)
            goto L76
        L73:
            java.lang.String r1 = " - "
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = d.AbstractC0628i.i(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L40
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = d.AbstractC0628i.i(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.toString():java.lang.String");
    }
}
