package v0;

/* JADX INFO: renamed from: v0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1400i implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f13137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13138b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13139c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13140d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13141e = null;

    public C1400i(O o3) {
        this.f13137a = o3;
    }

    @Override // v0.O
    public final void a(int i6, int i7) {
        int i8;
        if (this.f13138b == 2 && (i8 = this.f13139c) >= i6 && i8 <= i6 + i7) {
            this.f13140d += i7;
            this.f13139c = i6;
        } else {
            e();
            this.f13139c = i6;
            this.f13140d = i7;
            this.f13138b = 2;
        }
    }

    @Override // v0.O
    public final void b(int i6, int i7) {
        int i8;
        if (this.f13138b == 1 && i6 >= (i8 = this.f13139c)) {
            int i9 = this.f13140d;
            if (i6 <= i8 + i9) {
                this.f13140d = i9 + i7;
                this.f13139c = Math.min(i6, i8);
                return;
            }
        }
        e();
        this.f13139c = i6;
        this.f13140d = i7;
        this.f13138b = 1;
    }

    @Override // v0.O
    public final void c(int i6, int i7) {
        e();
        this.f13137a.c(i6, i7);
    }

    @Override // v0.O
    public final void d(int i6, int i7, Object obj) {
        int i8;
        if (this.f13138b == 3) {
            int i9 = this.f13139c;
            int i10 = this.f13140d;
            if (i6 <= i9 + i10 && (i8 = i6 + i7) >= i9 && this.f13141e == obj) {
                this.f13139c = Math.min(i6, i9);
                this.f13140d = Math.max(i10 + i9, i8) - this.f13139c;
                return;
            }
        }
        e();
        this.f13139c = i6;
        this.f13140d = i7;
        this.f13141e = obj;
        this.f13138b = 3;
    }

    public final void e() {
        int i6 = this.f13138b;
        if (i6 == 0) {
            return;
        }
        O o3 = this.f13137a;
        if (i6 == 1) {
            o3.b(this.f13139c, this.f13140d);
        } else if (i6 == 2) {
            o3.a(this.f13139c, this.f13140d);
        } else if (i6 == 3) {
            o3.d(this.f13139c, this.f13140d, this.f13141e);
        }
        this.f13141e = null;
        this.f13138b = 0;
    }
}
