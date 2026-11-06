package z;

import java.util.Arrays;

/* JADX INFO: renamed from: z.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1517h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f13931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f13932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f13934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f13935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f13937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f13938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f13940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f13941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13942l;

    public final void a(int i6, float f6) {
        int i7 = this.f13936f;
        int[] iArr = this.f13934d;
        if (i7 >= iArr.length) {
            this.f13934d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f13935e;
            this.f13935e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f13934d;
        int i8 = this.f13936f;
        iArr2[i8] = i6;
        float[] fArr2 = this.f13935e;
        this.f13936f = i8 + 1;
        fArr2[i8] = f6;
    }

    public final void b(int i6, int i7) {
        int i8 = this.f13933c;
        int[] iArr = this.f13931a;
        if (i8 >= iArr.length) {
            this.f13931a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f13932b;
            this.f13932b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f13931a;
        int i9 = this.f13933c;
        iArr3[i9] = i6;
        int[] iArr4 = this.f13932b;
        this.f13933c = i9 + 1;
        iArr4[i9] = i7;
    }

    public final void c(int i6, String str) {
        int i7 = this.f13939i;
        int[] iArr = this.f13937g;
        if (i7 >= iArr.length) {
            this.f13937g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f13938h;
            this.f13938h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f13937g;
        int i8 = this.f13939i;
        iArr2[i8] = i6;
        String[] strArr2 = this.f13938h;
        this.f13939i = i8 + 1;
        strArr2[i8] = str;
    }

    public final void d(int i6, boolean z5) {
        int i7 = this.f13942l;
        int[] iArr = this.f13940j;
        if (i7 >= iArr.length) {
            this.f13940j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f13941k;
            this.f13941k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f13940j;
        int i8 = this.f13942l;
        iArr2[i8] = i6;
        boolean[] zArr2 = this.f13941k;
        this.f13942l = i8 + 1;
        zArr2[i8] = z5;
    }
}
