package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0518x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6991a;

    static {
        int[] iArr = new int[F.values().length];
        f6991a = iArr;
        try {
            iArr[F.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6991a[F.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6991a[F.GREATER_THAN_EQUALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6991a[F.IDENTITY_EQUALS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6991a[F.IDENTITY_NOT_EQUALS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6991a[F.LESS_THAN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6991a[F.LESS_THAN_EQUALS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6991a[F.NOT_EQUALS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
