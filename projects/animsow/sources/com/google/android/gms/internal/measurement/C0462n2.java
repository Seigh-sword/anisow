package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Map;
import s.C1280b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0462n2 implements InterfaceC0390b2 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C1280b f6895C = new C1280b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile Map f6896A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f6897B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SharedPreferences f6898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Runnable f6899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC0456m2 f6900y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f6901z;

    public C0462n2(SharedPreferences sharedPreferences, RunnableC0438j2 runnableC0438j2) {
        SharedPreferencesOnSharedPreferenceChangeListenerC0456m2 sharedPreferencesOnSharedPreferenceChangeListenerC0456m2 = new SharedPreferencesOnSharedPreferenceChangeListenerC0456m2(0, this);
        this.f6900y = sharedPreferencesOnSharedPreferenceChangeListenerC0456m2;
        this.f6901z = new Object();
        this.f6897B = new ArrayList();
        this.f6898w = sharedPreferences;
        this.f6899x = runnableC0438j2;
        sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC0456m2);
    }

    public static synchronized void a() {
        try {
            for (C0462n2 c0462n2 : (s.j) f6895C.values()) {
                c0462n2.f6898w.unregisterOnSharedPreferenceChangeListener(c0462n2.f6900y);
            }
            f6895C.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0390b2
    public final Object b(String str) {
        Map<String, ?> map = this.f6896A;
        if (map == null) {
            synchronized (this.f6901z) {
                try {
                    map = this.f6896A;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f6898w.getAll();
                            this.f6896A = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
