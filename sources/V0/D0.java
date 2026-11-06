package v0;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12994e;

    public final boolean a() {
        int i6 = this.f12990a;
        int i7 = 2;
        if ((i6 & 7) != 0) {
            int i8 = this.f12993d;
            int i9 = this.f12991b;
            if (((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 112) != 0) {
            int i10 = this.f12993d;
            int i11 = this.f12992c;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 1792) != 0) {
            int i12 = this.f12994e;
            int i13 = this.f12991b;
            if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 8) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 28672) != 0) {
            int i14 = this.f12994e;
            int i15 = this.f12992c;
            if (i14 > i15) {
                i7 = 1;
            } else if (i14 != i15) {
                i7 = 4;
            }
            if ((i6 & (i7 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
