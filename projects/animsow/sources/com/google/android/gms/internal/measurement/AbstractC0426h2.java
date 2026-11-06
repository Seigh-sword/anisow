package com.google.android.gms.internal.measurement;

import android.net.Uri;
import s.C1280b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0426h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1280b f6834a = new C1280b();

    public static synchronized Uri a(String str) {
        Uri uri;
        C1280b c1280b = f6834a;
        uri = (Uri) c1280b.getOrDefault(str, null);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c1280b.put(str, uri);
        }
        return uri;
    }
}
