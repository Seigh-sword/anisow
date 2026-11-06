package v0;

/* JADX INFO: renamed from: v0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1409s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f13229b = new int[10];

    public final int a() {
        if ((this.f13228a & 128) != 0) {
            return this.f13229b[7];
        }
        return 65535;
    }

    public final void b(int i6, int i7) {
        if (i6 >= 0) {
            int[] iArr = this.f13229b;
            if (i6 >= iArr.length) {
                return;
            }
            this.f13228a = (1 << i6) | this.f13228a;
            iArr[i6] = i7;
        }
    }
}
