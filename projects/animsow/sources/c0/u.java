package c0;

import d0.C0646a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6145a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0351B f6146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0351B f6147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0351B f6148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f6152h;

    public u(C0351B c0351b, boolean z5, int[] iArr) {
        this.f6146b = c0351b;
        this.f6147c = c0351b;
        this.f6151g = z5;
        this.f6152h = iArr;
    }

    public final void a() {
        this.f6145a = 1;
        this.f6147c = this.f6146b;
        this.f6150f = 0;
    }

    public final boolean b() {
        int[] iArr;
        C0646a c0646aC = this.f6147c.f6097b.c();
        int iA = c0646aC.a(6);
        if ((iA == 0 || c0646aC.f8160b.get(iA + c0646aC.f8159a) == 0) && this.f6149e != 65039) {
            return this.f6151g && ((iArr = this.f6152h) == null || Arrays.binarySearch(iArr, this.f6147c.f6097b.a(0)) < 0);
        }
        return true;
    }
}
