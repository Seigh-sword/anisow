package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0506v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6974a;

    static {
        int[] iArr = new int[F.values().length];
        f6974a = iArr;
        try {
            iArr[F.BITWISE_AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6974a[F.BITWISE_LEFT_SHIFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6974a[F.BITWISE_NOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6974a[F.BITWISE_OR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6974a[F.BITWISE_RIGHT_SHIFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6974a[F.BITWISE_UNSIGNED_RIGHT_SHIFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6974a[F.BITWISE_XOR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
