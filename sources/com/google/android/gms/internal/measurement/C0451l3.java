package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0451l3 implements InterfaceC0397c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0403d3 f6873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6876d;

    public C0451l3(I2 i22, String str, Object[] objArr) {
        this.f6873a = i22;
        this.f6874b = str;
        this.f6875c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6876d = cCharAt;
            return;
        }
        int i6 = cCharAt & 8191;
        int i7 = 1;
        int i8 = 13;
        while (true) {
            int i9 = i7 + 1;
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 55296) {
                this.f6876d = i6 | (cCharAt2 << i8);
                return;
            } else {
                i6 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i7 = i9;
            }
        }
    }

    public final InterfaceC0403d3 a() {
        return this.f6873a;
    }

    public final int b() {
        int i6 = this.f6876d;
        if ((i6 & 1) != 0) {
            return 1;
        }
        return (i6 & 4) == 4 ? 3 : 2;
    }

    public final String c() {
        return this.f6874b;
    }

    public final Object[] d() {
        return this.f6875c;
    }
}
