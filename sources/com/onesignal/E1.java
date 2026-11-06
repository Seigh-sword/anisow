package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f7518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D1 f7519c;

    static {
        String simpleName = AbstractC0603w1.class.getSimpleName();
        f7517a = simpleName;
        HashMap map = new HashMap();
        f7518b = map;
        map.put(simpleName, new HashMap());
        f7518b.put("GTPlayerPurchases", new HashMap());
        f7518b.put("OneSignalTriggers", new HashMap());
        D1 d12 = new D1("OSH_WritePrefs");
        d12.f7511x = 0L;
        f7519c = d12;
    }

    public static Object a(String str, String str2, Class cls, Object obj) {
        HashMap map = (HashMap) f7518b.get(str);
        synchronized (map) {
            try {
                if (cls.equals(Object.class) && map.containsKey(str2)) {
                    return Boolean.TRUE;
                }
                Object obj2 = map.get(str2);
                if (obj2 == null && !map.containsKey(str2)) {
                    SharedPreferences sharedPreferencesD = d(str);
                    if (sharedPreferencesD == null) {
                        return obj;
                    }
                    if (cls.equals(String.class)) {
                        return sharedPreferencesD.getString(str2, (String) obj);
                    }
                    if (cls.equals(Boolean.class)) {
                        return Boolean.valueOf(sharedPreferencesD.getBoolean(str2, ((Boolean) obj).booleanValue()));
                    }
                    if (cls.equals(Integer.class)) {
                        return Integer.valueOf(sharedPreferencesD.getInt(str2, ((Integer) obj).intValue()));
                    }
                    if (cls.equals(Long.class)) {
                        return Long.valueOf(sharedPreferencesD.getLong(str2, ((Long) obj).longValue()));
                    }
                    if (cls.equals(Set.class)) {
                        return sharedPreferencesD.getStringSet(str2, (Set) obj);
                    }
                    if (cls.equals(Object.class)) {
                        return Boolean.valueOf(sharedPreferencesD.contains(str2));
                    }
                    return null;
                }
                return obj2;
            } finally {
            }
        }
    }

    public static boolean b(String str, String str2, boolean z5) {
        return ((Boolean) a(str, str2, Boolean.class, Boolean.valueOf(z5))).booleanValue();
    }

    public static int c(int i6, String str) {
        return ((Integer) a(f7517a, str, Integer.class, Integer.valueOf(i6))).intValue();
    }

    public static synchronized SharedPreferences d(String str) {
        Context context = AbstractC0603w1.f8028b;
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        AbstractC0603w1.b(EnumC0600v1.f7998z, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
        return null;
    }

    public static String e(String str, String str2, String str3) {
        return (String) a(str, str2, String.class, str3);
    }

    public static Set f(String str, HashSet hashSet) {
        return (Set) a(f7517a, str, Set.class, hashSet);
    }

    public static void g(String str, String str2, Object obj) {
        HashMap map = (HashMap) f7518b.get(str);
        synchronized (map) {
            map.put(str2, obj);
        }
        i();
    }

    public static void h(String str, String str2, boolean z5) {
        g(str, str2, Boolean.valueOf(z5));
    }

    public static void i() {
        D1 d12 = f7519c;
        synchronized (d12) {
            if (AbstractC0603w1.f8028b == null) {
                return;
            }
            if (!d12.f7512y) {
                d12.start();
                d12.f7512y = true;
            }
            d12.a();
        }
    }
}
