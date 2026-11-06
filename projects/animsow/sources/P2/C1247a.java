package p2;

import E.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import b2.AbstractC0339d;
import b2.AbstractC0340e;
import b2.C0337b;
import d.AbstractC0628i;
import d2.C0652c;
import h0.C0733A;
import j.RunnableC0835a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k2.C0894a;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: p2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1247a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f12290n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f12291o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f12292p = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f12294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f12296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f12298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0894a f12300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0337b f12301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f12302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f12303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f12304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f12305m;

    public C1247a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f12293a = new Object();
        this.f12295c = 0;
        this.f12298f = new HashSet();
        this.f12299g = true;
        this.f12301i = C0337b.f5915a;
        this.f12303k = new HashMap();
        this.f12304l = new AtomicInteger(0);
        AbstractC1332d.h("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f12300h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f12302j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f12302j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C0733A(sb.toString());
        }
        this.f12294b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = AbstractC0340e.f5921a;
        synchronized (AbstractC0340e.class) {
            Boolean bool = AbstractC0340e.f5923c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = f.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                AbstractC0340e.f5923c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i6 = AbstractC0339d.f5920a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoF = C0652c.a(context).f(0, packageName);
                    if (applicationInfoF == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i7 = applicationInfoF.uid;
                        workSource = new WorkSource();
                        Method method2 = AbstractC0340e.f5922b;
                        try {
                            if (method2 != null) {
                                method2.invoke(workSource, Integer.valueOf(i7), packageName);
                            } else {
                                Method method3 = AbstractC0340e.f5921a;
                                if (method3 != null) {
                                    method3.invoke(workSource, Integer.valueOf(i7));
                                }
                            }
                        } catch (Exception e6) {
                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e6);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f12294b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                    Log.wtf("WakeLock", e7.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f12291o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f12292p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f12291o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f12291o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f12305m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j6) {
        this.f12304l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f12290n), 1L);
        if (j6 > 0) {
            jMax = Math.min(j6, jMax);
        }
        synchronized (this.f12293a) {
            try {
                if (!b()) {
                    this.f12300h = C0894a.f9645w;
                    this.f12294b.acquire();
                    this.f12301i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f12295c++;
                if (this.f12299g) {
                    TextUtils.isEmpty(null);
                }
                C1248b c1248b = (C1248b) this.f12303k.get(null);
                if (c1248b == null) {
                    c1248b = new C1248b();
                    this.f12303k.put(null, c1248b);
                }
                c1248b.f12306a++;
                this.f12301i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j7 > this.f12297e) {
                    this.f12297e = j7;
                    ScheduledFuture scheduledFuture = this.f12296d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f12296d = this.f12305m.schedule(new RunnableC0835a(20, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z5;
        synchronized (this.f12293a) {
            z5 = this.f12295c > 0;
        }
        return z5;
    }

    public final void c() {
        if (this.f12304l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f12302j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f12293a) {
            try {
                if (this.f12299g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f12303k.containsKey(null)) {
                    C1248b c1248b = (C1248b) this.f12303k.get(null);
                    if (c1248b != null) {
                        int i6 = c1248b.f12306a - 1;
                        c1248b.f12306a = i6;
                        if (i6 == 0) {
                            this.f12303k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f12302j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f12298f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC0628i.p(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[Catch: all -> 0x000b, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000e, B:12:0x0013, B:18:0x0020, B:19:0x002d, B:21:0x0033, B:22:0x003c, B:24:0x0046, B:25:0x004f, B:28:0x005c, B:30:0x0060, B:47:0x00a1, B:46:0x0090, B:42:0x0089, B:44:0x008d, B:45:0x008f, B:38:0x0083, B:15:0x001c, B:17:0x001e, B:27:0x0057, B:35:0x0066, B:37:0x0072, B:41:0x0088), top: B:53:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12293a
            monitor-enter(r0)
            boolean r1 = r6.b()     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            goto La3
        Le:
            boolean r1 = r6.f12299g     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            if (r1 == 0) goto L1e
            int r1 = r6.f12295c     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + (-1)
            r6.f12295c = r1     // Catch: java.lang.Throwable -> Lb
            if (r1 > 0) goto L1c
            goto L20
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L1e:
            r6.f12295c = r2     // Catch: java.lang.Throwable -> Lb
        L20:
            r6.d()     // Catch: java.lang.Throwable -> Lb
            java.util.HashMap r1 = r6.f12303k     // Catch: java.lang.Throwable -> Lb
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb
        L2d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb
            p2.b r3 = (p2.C1248b) r3     // Catch: java.lang.Throwable -> Lb
            r3.f12306a = r2     // Catch: java.lang.Throwable -> Lb
            goto L2d
        L3c:
            java.util.HashMap r1 = r6.f12303k     // Catch: java.lang.Throwable -> Lb
            r1.clear()     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.ScheduledFuture r1 = r6.f12296d     // Catch: java.lang.Throwable -> Lb
            r3 = 0
            if (r1 == 0) goto L4f
            r1.cancel(r2)     // Catch: java.lang.Throwable -> Lb
            r6.f12296d = r3     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r6.f12297e = r1     // Catch: java.lang.Throwable -> Lb
        L4f:
            android.os.PowerManager$WakeLock r1 = r6.f12294b     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L90
            android.os.PowerManager$WakeLock r1 = r6.f12294b     // Catch: java.lang.Throwable -> L63 java.lang.RuntimeException -> L65
            r1.release()     // Catch: java.lang.Throwable -> L63 java.lang.RuntimeException -> L65
            k2.a r1 = r6.f12300h     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La1
        L60:
            r6.f12300h = r3     // Catch: java.lang.Throwable -> Lb
            goto La1
        L63:
            r1 = move-exception
            goto L89
        L65:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L63
            java.lang.Class<java.lang.RuntimeException> r4 = java.lang.RuntimeException.class
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L88
            java.lang.String r2 = "WakeLock"
            java.lang.String r4 = r6.f12302j     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = " failed to release!"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L63
            android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L63
            k2.a r1 = r6.f12300h     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La1
            goto L60
        L88:
            throw r1     // Catch: java.lang.Throwable -> L63
        L89:
            k2.a r2 = r6.f12300h     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L8f
            r6.f12300h = r3     // Catch: java.lang.Throwable -> Lb
        L8f:
            throw r1     // Catch: java.lang.Throwable -> Lb
        L90:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r6.f12302j     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = " should be held!"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Lb
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> Lb
        La1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        La3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C1247a.e():void");
    }
}
