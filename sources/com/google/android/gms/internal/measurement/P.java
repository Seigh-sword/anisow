package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class P implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6655a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f6656b = new HashSet();

    public final Object a(Object obj, String str) {
        Object obj2 = this.f6655a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f6655a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new S(this);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.f6655a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z5) {
        return ((Boolean) a(Boolean.valueOf(z5), str)).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f6) {
        return ((Float) a(Float.valueOf(f6), str)).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i6) {
        return ((Integer) a(Integer.valueOf(i6), str)).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j6) {
        return ((Long) a(Long.valueOf(j6), str)).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) a(str2, str);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) a(set, str);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6656b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6656b.remove(onSharedPreferenceChangeListener);
    }
}
