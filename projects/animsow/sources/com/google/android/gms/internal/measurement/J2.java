package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import d.AbstractC0628i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J2 implements InterfaceC0391b3, InterfaceC0427h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J2 f6610a = new J2();

    public J2(J2 j22) {
        Object obj = AbstractC0420g2.f6817g;
    }

    public static int c(C0475p3 c0475p3) {
        return c0475p3.a();
    }

    public static V2.c d(Context context) {
        File file;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            V2.c dVar = V2.a.f3732w;
            try {
                file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            } catch (RuntimeException e6) {
                Log.e("HermeticFileOverrides", "no data dir", e6);
            }
            V2.c dVar2 = file.exists() ? new V2.d(file) : dVar;
            if (dVar2.b()) {
                dVar = new V2.d(e(context, (File) dVar2.a()));
            }
            return dVar;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static C0384a2 e(Context context, File file) {
        BufferedReader bufferedReader;
        s.k kVar;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                kVar = new s.k();
                map = new HashMap();
            } finally {
            }
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                C0384a2 c0384a2 = new C0384a2(kVar);
                bufferedReader.close();
                return c0384a2;
            }
            String[] strArrSplit = line.split(" ", 3);
            if (strArrSplit.length != 3) {
                Log.e("HermeticFileOverrides", "Invalid: " + line);
            } else {
                String str = new String(strArrSplit[0]);
                String strDecode = Uri.decode(new String(strArrSplit[1]));
                String strDecode2 = (String) map.get(strArrSplit[2]);
                if (strDecode2 == null) {
                    String str2 = new String(strArrSplit[2]);
                    strDecode2 = Uri.decode(str2);
                    if (strDecode2.length() < 1024 || strDecode2 == str2) {
                        map.put(str2, strDecode2);
                    }
                }
                s.k kVar2 = (s.k) kVar.getOrDefault(str, null);
                if (kVar2 == null) {
                    kVar2 = new s.k();
                    kVar.put(str, kVar2);
                }
                kVar2.put(strDecode, strDecode2);
            }
            throw new RuntimeException(e6);
        }
    }

    public static C0385a3 f(Object obj, Object obj2) {
        C0385a3 c0385a3 = (C0385a3) obj;
        C0385a3 c0385a32 = (C0385a3) obj2;
        if (!c0385a32.isEmpty()) {
            if (!c0385a3.f6761w) {
                if (c0385a3.isEmpty()) {
                    c0385a3 = new C0385a3();
                } else {
                    C0385a3 c0385a33 = new C0385a3(c0385a3);
                    c0385a33.f6761w = true;
                    c0385a3 = c0385a33;
                }
            }
            c0385a3.d();
            if (!c0385a32.isEmpty()) {
                c0385a3.putAll(c0385a32);
            }
        }
        return c0385a3;
    }

    public static String g(ContentResolver contentResolver, String str) throws X1 {
        Uri uri = R1.f6670a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new X1("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new X1("ContentProvider query returned null cursor");
                    }
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(1);
                        cursorQuery.close();
                        return string;
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return null;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e6) {
                throw new X1("ContentProvider query failed", e6);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public static HashMap h(ContentResolver contentResolver, String[] strArr, J2 j22) throws X1 {
        Uri uri = R1.f6671b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new X1("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new X1("ContentProvider query returned null cursor");
                    }
                    HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
                    while (cursorQuery.moveToNext()) {
                        map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new X1("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    return map;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } finally {
                contentProviderClientAcquireUnstableContentProviderClient.release();
            }
        } catch (RemoteException e6) {
            throw new X1("ContentProvider query failed", e6);
        }
    }

    public static void i(Object obj) {
        AbstractC0628i.p(obj);
        throw new NoSuchMethodError();
    }

    public static void j(Object obj, Object obj2) {
        C0385a3 c0385a3 = (C0385a3) obj;
        AbstractC0628i.p(obj2);
        if (c0385a3.isEmpty()) {
            return;
        }
        Iterator it = c0385a3.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }

    public static C0385a3 k() {
        C0385a3 c0385a3 = C0385a3.f6760x;
        if (c0385a3.isEmpty()) {
            return new C0385a3();
        }
        C0385a3 c0385a32 = new C0385a3(c0385a3);
        c0385a32.f6761w = true;
        return c0385a32;
    }

    public static void l(long j6, Object obj) {
        AbstractC0485r2 abstractC0485r2 = (AbstractC0485r2) ((R2) AbstractC0492s3.r(j6, obj));
        if (abstractC0485r2.f6940w) {
            abstractC0485r2.f6940w = false;
        }
    }

    public static void m(Object obj) {
        ((C0385a3) obj).f6761w = false;
    }

    public static C0385a3 n(Object obj) {
        return (C0385a3) obj;
    }

    public static C0475p3 o(Object obj) {
        return ((I2) obj).zzb;
    }

    public static void p(Object obj) {
        C0475p3 c0475p3 = ((I2) obj).zzb;
        if (c0475p3.f6927e) {
            c0475p3.f6927e = false;
        }
    }

    public static boolean q(Object obj) {
        return !((C0385a3) obj).f6761w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0391b3
    public boolean a(Class cls) {
        return I2.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0391b3
    public InterfaceC0397c3 b(Class cls) {
        if (!I2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC0397c3) I2.d(cls.asSubclass(I2.class)).e(3);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }
}
