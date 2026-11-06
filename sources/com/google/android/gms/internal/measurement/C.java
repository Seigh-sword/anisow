package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6453a;

    static {
        int[] iArr = new int[F.values().length];
        f6453a = iArr;
        try {
            iArr[F.FOR_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6453a[F.FOR_IN_CONST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6453a[F.FOR_IN_LET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6453a[F.FOR_LET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6453a[F.FOR_OF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6453a[F.FOR_OF_CONST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6453a[F.FOR_OF_LET.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6453a[F.WHILE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
