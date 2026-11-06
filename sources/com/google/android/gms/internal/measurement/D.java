package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6458a;

    static {
        int[] iArr = new int[F.values().length];
        f6458a = iArr;
        try {
            iArr[F.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6458a[F.DIVIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6458a[F.MODULUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6458a[F.MULTIPLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6458a[F.NEGATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6458a[F.POST_DECREMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6458a[F.POST_INCREMENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6458a[F.PRE_DECREMENT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f6458a[F.PRE_INCREMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f6458a[F.SUBTRACT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
