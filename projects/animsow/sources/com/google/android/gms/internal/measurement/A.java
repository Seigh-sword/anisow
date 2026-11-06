package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6439a;

    static {
        int[] iArr = new int[F.values().length];
        f6439a = iArr;
        try {
            iArr[F.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6439a[F.NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6439a[F.OR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
