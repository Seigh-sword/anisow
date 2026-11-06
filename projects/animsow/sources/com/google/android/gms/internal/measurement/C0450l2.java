package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0450l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f6867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6872g;

    public C0450l2(String str, Uri uri, String str2, String str3, boolean z5, boolean z6, boolean z7, boolean z8, V2.b bVar) {
        this.f6866a = str;
        this.f6867b = uri;
        this.f6868c = str2;
        this.f6869d = str3;
        this.f6870e = z5;
        this.f6871f = z6;
        this.f6872g = z8;
    }

    public final C0444k2 a(String str, long j6) {
        Long lValueOf = Long.valueOf(j6);
        Object obj = AbstractC0420g2.f6817g;
        return new C0444k2(this, str, lValueOf, 0);
    }

    public final C0444k2 b(String str, String str2) {
        Object obj = AbstractC0420g2.f6817g;
        return new C0444k2(this, str, str2, 3);
    }

    public final C0444k2 c(String str, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Object obj = AbstractC0420g2.f6817g;
        return new C0444k2(this, str, boolValueOf, 2);
    }
}
