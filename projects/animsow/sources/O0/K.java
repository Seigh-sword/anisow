package o0;

/* JADX INFO: loaded from: classes.dex */
public final class K implements v0.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f11786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0.O f11787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11791f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11792g = 1;

    public K(h1 h1Var, h1 h1Var2, v0.O o3) {
        this.f11786a = h1Var2;
        this.f11787b = o3;
        G0 g02 = (G0) h1Var;
        this.f11788c = g02.f11765c;
        this.f11789d = g02.f11766d;
        this.f11790e = g02.f11764b;
    }

    @Override // v0.O
    public final void a(int i6, int i7) {
        int i8;
        int i9 = i6 + i7;
        int i10 = this.f11790e;
        EnumC1201o enumC1201o = EnumC1201o.f12043w;
        h1 h1Var = this.f11786a;
        v0.O o3 = this.f11787b;
        if (i9 >= i10 && this.f11792g != 3) {
            int iMin = Math.min(((G0) h1Var).f11766d - this.f11789d, i7);
            i8 = iMin >= 0 ? iMin : 0;
            int i11 = i7 - i8;
            if (i8 > 0) {
                this.f11792g = 2;
                o3.d(this.f11788c + i6, i8, enumC1201o);
                this.f11789d += i8;
            }
            if (i11 > 0) {
                o3.a(i6 + i8 + this.f11788c, i11);
            }
        } else if (i6 <= 0 && this.f11791f != 3) {
            int iMin2 = Math.min(((G0) h1Var).f11765c - this.f11788c, i7);
            i8 = iMin2 >= 0 ? iMin2 : 0;
            int i12 = i7 - i8;
            if (i12 > 0) {
                o3.a(this.f11788c, i12);
            }
            if (i8 > 0) {
                this.f11791f = 2;
                o3.d(this.f11788c, i8, enumC1201o);
                this.f11788c += i8;
            }
        } else {
            o3.a(i6 + this.f11788c, i7);
        }
        this.f11790e -= i7;
    }

    @Override // v0.O
    public final void b(int i6, int i7) {
        int i8 = this.f11790e;
        EnumC1201o enumC1201o = EnumC1201o.f12044x;
        v0.O o3 = this.f11787b;
        if (i6 >= i8 && this.f11792g != 2) {
            int iMin = Math.min(i7, this.f11789d);
            if (iMin > 0) {
                this.f11792g = 3;
                o3.d(this.f11788c + i6, iMin, enumC1201o);
                this.f11789d -= iMin;
            }
            int i9 = i7 - iMin;
            if (i9 > 0) {
                o3.b(i6 + iMin + this.f11788c, i9);
            }
        } else if (i6 <= 0 && this.f11791f != 2) {
            int iMin2 = Math.min(i7, this.f11788c);
            if (iMin2 > 0) {
                this.f11791f = 3;
                o3.d((0 - iMin2) + this.f11788c, iMin2, enumC1201o);
                this.f11788c -= iMin2;
            }
            int i10 = i7 - iMin2;
            if (i10 > 0) {
                o3.b(this.f11788c, i10);
            }
        } else {
            o3.b(i6 + this.f11788c, i7);
        }
        this.f11790e += i7;
    }

    @Override // v0.O
    public final void c(int i6, int i7) {
        int i8 = this.f11788c;
        this.f11787b.c(i6 + i8, i7 + i8);
    }

    @Override // v0.O
    public final void d(int i6, int i7, Object obj) {
        this.f11787b.d(i6 + this.f11788c, i7, obj);
    }
}
