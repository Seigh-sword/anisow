package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import d.AbstractC0628i;
import java.util.Iterator;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SharedPreferencesOnSharedPreferenceChangeListenerC0456m2 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6882b;

    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC0456m2(int i6, Object obj) {
        this.f6881a = i6;
        this.f6882b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f6881a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0462n2 c0462n2 = (C0462n2) this.f6882b;
                synchronized (c0462n2.f6901z) {
                    c0462n2.f6896A = null;
                    c0462n2.f6899x.run();
                    break;
                }
                synchronized (c0462n2) {
                    try {
                        Iterator it = c0462n2.f6897B.iterator();
                        if (it.hasNext()) {
                            AbstractC0628i.p(it.next());
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                m2.G0 g02 = (m2.G0) this.f6882b;
                g02.getClass();
                if ("IABTCF_TCString".equals(str)) {
                    g02.f().f10723J.d("IABTCF_TCString change picked up in listener.");
                    m2.K0 k02 = g02.f10628Q;
                    AbstractC1332d.m(k02);
                    k02.b(500L);
                    return;
                }
                return;
        }
    }
}
