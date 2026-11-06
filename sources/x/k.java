package x;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f13634k = new int[2];

    public static void m(int[] iArr, int i6, int i7, int i8, int i9, float f6, int i10) {
        int i11 = i7 - i6;
        int i12 = i9 - i8;
        if (i10 != -1) {
            if (i10 == 0) {
                iArr[0] = (int) ((i12 * f6) + 0.5f);
                iArr[1] = i12;
                return;
            } else {
                if (i10 != 1) {
                    return;
                }
                iArr[0] = i11;
                iArr[1] = (int) ((i11 * f6) + 0.5f);
                return;
            }
        }
        int i13 = (int) ((i12 * f6) + 0.5f);
        int i14 = (int) ((i11 / f6) + 0.5f);
        if (i13 <= i11) {
            iArr[0] = i13;
            iArr[1] = i12;
        } else if (i14 <= i12) {
            iArr[0] = i11;
            iArr[1] = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0233, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(x.d r24) {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k.a(x.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    @Override // x.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k.d():void");
    }

    @Override // x.p
    public final void e() {
        f fVar = this.f13660h;
        if (fVar.f13629j) {
            this.f13654b.f13364Y = fVar.f13626g;
        }
    }

    @Override // x.p
    public final void f() {
        this.f13655c = null;
        this.f13660h.c();
        this.f13661i.c();
        this.f13657e.c();
        this.f13659g = false;
    }

    @Override // x.p
    public final boolean k() {
        return this.f13656d != 3 || this.f13654b.f13399r == 0;
    }

    public final void n() {
        this.f13659g = false;
        f fVar = this.f13660h;
        fVar.c();
        fVar.f13629j = false;
        f fVar2 = this.f13661i;
        fVar2.c();
        fVar2.f13629j = false;
        this.f13657e.f13629j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f13654b.f13381h0;
    }
}
