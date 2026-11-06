package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0408e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile V2.c f6790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J2 f6791b = new J2();

    public static int a(int i6) {
        return (-(i6 & 1)) ^ (i6 >>> 1);
    }

    public static long b(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }
}
