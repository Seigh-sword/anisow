package u;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f12801A;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f12808H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12810x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12811y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12812z = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f12802B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float[] f12803C = new float[9];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final float[] f12804D = new float[9];

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public c[] f12805E = new c[16];

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f12806F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f12807G = 0;

    public i(int i6) {
        this.f12808H = i6;
    }

    public final void a(c cVar) {
        int i6 = 0;
        while (true) {
            int i7 = this.f12806F;
            if (i6 >= i7) {
                c[] cVarArr = this.f12805E;
                if (i7 >= cVarArr.length) {
                    this.f12805E = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f12805E;
                int i8 = this.f12806F;
                cVarArr2[i8] = cVar;
                this.f12806F = i8 + 1;
                return;
            }
            if (this.f12805E[i6] == cVar) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final void b(c cVar) {
        int i6 = this.f12806F;
        int i7 = 0;
        while (i7 < i6) {
            if (this.f12805E[i7] == cVar) {
                while (i7 < i6 - 1) {
                    c[] cVarArr = this.f12805E;
                    int i8 = i7 + 1;
                    cVarArr[i7] = cVarArr[i8];
                    i7 = i8;
                }
                this.f12806F--;
                return;
            }
            i7++;
        }
    }

    public final void c() {
        this.f12808H = 5;
        this.f12812z = 0;
        this.f12810x = -1;
        this.f12811y = -1;
        this.f12801A = 0.0f;
        this.f12802B = false;
        int i6 = this.f12806F;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f12805E[i7] = null;
        }
        this.f12806F = 0;
        this.f12807G = 0;
        this.f12809w = false;
        Arrays.fill(this.f12804D, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12810x - ((i) obj).f12810x;
    }

    public final void d(d dVar, float f6) {
        this.f12801A = f6;
        this.f12802B = true;
        int i6 = this.f12806F;
        this.f12811y = -1;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f12805E[i7].h(dVar, this, false);
        }
        this.f12806F = 0;
    }

    public final void e(d dVar, c cVar) {
        int i6 = this.f12806F;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f12805E[i7].i(dVar, cVar, false);
        }
        this.f12806F = 0;
    }

    public final String toString() {
        return "" + this.f12810x;
    }
}
