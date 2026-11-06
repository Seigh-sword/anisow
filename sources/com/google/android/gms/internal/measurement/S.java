package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class S implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6676a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f6677b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6678c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f6679d;

    public S(P p5) {
        this.f6679d = p5;
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f6678c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f6676a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        boolean z5 = this.f6676a;
        P p5 = this.f6679d;
        if (z5) {
            p5.f6655a.clear();
        }
        Set setKeySet = p5.f6655a.keySet();
        HashSet hashSet = this.f6677b;
        setKeySet.removeAll(hashSet);
        HashMap map = this.f6678c;
        for (Map.Entry entry : map.entrySet()) {
            p5.f6655a.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : p5.f6656b) {
            Set setKeySet2 = map.keySet();
            if (hashSet == null) {
                throw new NullPointerException("set1");
            }
            if (setKeySet2 == null) {
                throw new NullPointerException("set2");
            }
            W2.x xVar = new W2.x(new W2.y(hashSet, setKeySet2));
            while (xVar.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(p5, (String) xVar.next());
            }
        }
        return (!this.f6676a && hashSet.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z5) {
        a(Boolean.valueOf(z5), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f6) {
        a(Float.valueOf(f6), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i6) {
        a(Integer.valueOf(i6), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j6) {
        a(Long.valueOf(j6), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str2, str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(set, str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f6677b.add(str);
        return this;
    }
}
