package Y2;

import J.m;
import W1.ComponentCallbacks2C0209c;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Base64;
import android.util.Log;
import b2.AbstractC0338c;
import d3.n;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s.C1280b;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f4814k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1280b f4815l = new C1280b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f4818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3.h f4819d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f4822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D3.c f4823h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4820e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4821f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f4824i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f4825j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[LOOP:0: B:25:0x00b9->B:27:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016f  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(android.content.Context r10, Y2.i r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.g.<init>(android.content.Context, Y2.i, java.lang.String):void");
    }

    public static g c() {
        g gVar;
        synchronized (f4814k) {
            try {
                gVar = (g) f4815l.getOrDefault("[DEFAULT]", null);
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC0338c.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((B3.d) gVar.f4823h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f4814k) {
            try {
                if (f4815l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, iVarA, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g g(Context context, i iVar, String str) {
        g gVar;
        AtomicReference atomicReference = e.f4811a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f4811a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        ComponentCallbacks2C0209c.a(application);
                        ComponentCallbacks2C0209c componentCallbacks2C0209c = ComponentCallbacks2C0209c.f4292A;
                        componentCallbacks2C0209c.getClass();
                        synchronized (componentCallbacks2C0209c) {
                            componentCallbacks2C0209c.f4295y.add(eVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4814k) {
            C1280b c1280b = f4815l;
            AbstractC1332d.o("FirebaseApp name " + strTrim + " already exists!", !c1280b.containsKey(strTrim));
            AbstractC1332d.n(context, "Application context cannot be null.");
            gVar = new g(context, iVar, strTrim);
            c1280b.put(strTrim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        AbstractC1332d.o("FirebaseApp was deleted", !this.f4821f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f4819d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f4817b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f4818c.f4832b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!m.a(this.f4816a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f4817b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f4816a;
            AtomicReference atomicReference = f.f4812b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f4817b);
        Log.i("FirebaseApp", sb2.toString());
        d3.h hVar = this.f4819d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f4817b);
        AtomicReference atomicReference2 = hVar.f8197f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (hVar) {
                    map = new HashMap(hVar.f8192a);
                }
                hVar.h(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((B3.d) this.f4823h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f4817b.equals(gVar.f4817b);
    }

    public final boolean h() {
        boolean z5;
        a();
        H3.a aVar = (H3.a) this.f4822g.get();
        synchronized (aVar) {
            z5 = aVar.f1059a;
        }
        return z5;
    }

    public final int hashCode() {
        return this.f4817b.hashCode();
    }

    public final String toString() {
        C1358b c1358b = new C1358b(this);
        c1358b.c(this.f4817b, "name");
        c1358b.c(this.f4818c, "options");
        return c1358b.toString();
    }
}
