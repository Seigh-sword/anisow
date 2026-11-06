package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2.j f6697a = new f2.j(1);

    public static SharedPreferences a(Context context, String str) {
        P p5 = str.equals("") ? new P() : null;
        if (p5 != null) {
            return p5;
        }
        f2.j jVar = f6697a;
        if (!((Boolean) jVar.get()).booleanValue()) {
            throw new IllegalArgumentException();
        }
        jVar.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            jVar.set(Boolean.TRUE);
        }
    }
}
