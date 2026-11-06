package com.google.firebase.messaging;

import D3.c;
import E3.d;
import J3.D;
import J3.l;
import J3.v;
import J3.y;
import J3.z;
import N.C0089e;
import T1.b;
import T1.n;
import T1.q;
import T1.r;
import Y2.g;
import a3.InterfaceC0260a;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0460n0;
import com.google.firebase.messaging.FirebaseMessaging;
import f2.h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.C0996y;
import m2.C0;
import n.ExecutorC1138a;
import n.ThreadFactoryC1140c;
import p1.C1243i;
import q0.C1256a;
import q2.i;
import q2.s;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static C1243i f7437k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f7439m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f7440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0996y f7442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f7443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0.v f7444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f7445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f7446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0089e f7447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f7436j = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static c f7438l = new d3.g(6);

    public FirebaseMessaging(g gVar, c cVar, c cVar2, d dVar, c cVar3, A3.c cVar4) {
        gVar.a();
        Context context = gVar.f4816a;
        final C0089e c0089e = new C0089e(context);
        gVar.a();
        final C0996y c0996y = new C0996y(gVar, c0089e, new b(context), cVar, cVar2, dVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1140c("Firebase-Messaging-Task"));
        final int i6 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1140c("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1140c("Firebase-Messaging-File-Io"));
        final int i7 = 0;
        this.f7448i = false;
        f7438l = cVar3;
        this.f7440a = gVar;
        this.f7444e = new c0.v(this, cVar4);
        gVar.a();
        final Context context2 = gVar.f4816a;
        this.f7441b = context2;
        C0460n0 c0460n0 = new C0460n0();
        this.f7447h = c0089e;
        this.f7442c = c0996y;
        this.f7443d = new v(executorServiceNewSingleThreadExecutor);
        this.f7445f = scheduledThreadPoolExecutor;
        this.f7446g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c0460n0);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: J3.m

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f1420x;

            {
                this.f1420x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q2.s sVarB;
                int i8;
                int i9 = i7;
                FirebaseMessaging firebaseMessaging = this.f1420x;
                switch (i9) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (firebaseMessaging.f7444e.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f7448i) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.f7441b;
                        C0.i(context3);
                        final boolean zF = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesT = f2.h.t(context3);
                            if (!sharedPreferencesT.contains("proxy_retention") || sharedPreferencesT.getBoolean("proxy_retention", false) != zF) {
                                T1.b bVar = (T1.b) firebaseMessaging.f7442c.f10423c;
                                if (bVar.f3410c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    T1.q qVarA = T1.q.a(bVar.f3409b);
                                    synchronized (qVarA) {
                                        i8 = qVarA.f3446a;
                                        qVarA.f3446a = i8 + 1;
                                    }
                                    sVarB = qVarA.b(new T1.n(i8, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    q2.s sVar = new q2.s();
                                    sVar.k(iOException);
                                    sVarB = sVar;
                                }
                                sVarB.b(new ExecutorC1138a(19), new q2.f() { // from class: J3.s
                                    @Override // q2.f
                                    public final void c(Object obj) {
                                        SharedPreferences.Editor editorEdit = f2.h.t(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1140c("Firebase-Messaging-Topics-Io"));
        int i8 = D.f1343j;
        h.f(scheduledThreadPoolExecutor2, new Callable() { // from class: J3.C
            @Override // java.util.concurrent.Callable
            public final Object call() {
                B b6;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C0089e c0089e2 = c0089e;
                C0996y c0996y2 = c0996y;
                synchronized (B.class) {
                    try {
                        WeakReference weakReference = B.f1335b;
                        b6 = weakReference != null ? (B) weakReference.get() : null;
                        if (b6 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            B b7 = new B();
                            synchronized (b7) {
                                b7.f1336a = x.c(sharedPreferences, scheduledExecutorService);
                            }
                            B.f1335b = new WeakReference(b7);
                            b6 = b7;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new D(firebaseMessaging, c0089e2, b6, c0996y2, context3, scheduledExecutorService);
            }
        }).b(scheduledThreadPoolExecutor, new l(this, i6));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: J3.m

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f1420x;

            {
                this.f1420x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q2.s sVarB;
                int i82;
                int i9 = i6;
                FirebaseMessaging firebaseMessaging = this.f1420x;
                switch (i9) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (firebaseMessaging.f7444e.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f7448i) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.f7441b;
                        C0.i(context3);
                        final boolean zF = firebaseMessaging.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesT = f2.h.t(context3);
                            if (!sharedPreferencesT.contains("proxy_retention") || sharedPreferencesT.getBoolean("proxy_retention", false) != zF) {
                                T1.b bVar = (T1.b) firebaseMessaging.f7442c.f10423c;
                                if (bVar.f3410c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    T1.q qVarA = T1.q.a(bVar.f3409b);
                                    synchronized (qVarA) {
                                        i82 = qVarA.f3446a;
                                        qVarA.f3446a = i82 + 1;
                                    }
                                    sVarB = qVarA.b(new T1.n(i82, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    q2.s sVar = new q2.s();
                                    sVar.k(iOException);
                                    sVarB = sVar;
                                }
                                sVarB.b(new ExecutorC1138a(19), new q2.f() { // from class: J3.s
                                    @Override // q2.f
                                    public final void c(Object obj) {
                                        SharedPreferences.Editor editorEdit = f2.h.t(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(z zVar, long j6) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f7439m == null) {
                    f7439m = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1140c("TAG"));
                }
                f7439m.schedule(zVar, j6, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized C1243i c(Context context) {
        try {
            if (f7437k == null) {
                f7437k = new C1243i(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7437k;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        AbstractC1332d.n(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        i iVarJ;
        final y yVarD = d();
        if (!h(yVarD)) {
            return yVarD.f1452a;
        }
        final String strH = C0089e.h(this.f7440a);
        v vVar = this.f7443d;
        synchronized (vVar) {
            iVarJ = (i) vVar.f1439b.getOrDefault(strH, null);
            if (iVarJ == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strH);
                }
                C0996y c0996y = this.f7442c;
                iVarJ = c0996y.c(c0996y.h(C0089e.h((g) c0996y.f10421a), "*", new Bundle())).g(this.f7446g, new q2.h() { // from class: J3.n
                    @Override // q2.h
                    public final q2.s l(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.f1421w;
                        String str = strH;
                        y yVar = yVarD;
                        String str2 = (String) obj;
                        C1243i c1243iC = FirebaseMessaging.c(firebaseMessaging.f7441b);
                        Y2.g gVar = firebaseMessaging.f7440a;
                        gVar.a();
                        String strD = "[DEFAULT]".equals(gVar.f4817b) ? "" : gVar.d();
                        String strG = firebaseMessaging.f7447h.g();
                        synchronized (c1243iC) {
                            String strA = y.a(System.currentTimeMillis(), str2, strG);
                            if (strA != null) {
                                SharedPreferences.Editor editorEdit = ((SharedPreferences) c1243iC.f12254x).edit();
                                editorEdit.putString(strD + "|T|" + str + "|*", strA);
                                editorEdit.commit();
                            }
                        }
                        if (yVar == null || !str2.equals(yVar.f1452a)) {
                            Y2.g gVar2 = firebaseMessaging.f7440a;
                            gVar2.a();
                            if ("[DEFAULT]".equals(gVar2.f4817b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                                    gVar2.a();
                                    sb.append(gVar2.f4817b);
                                    Log.d("FirebaseMessaging", sb.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new C0055k(firebaseMessaging.f7441b).b(intent);
                            }
                        }
                        return f2.h.l(str2);
                    }
                }).j(vVar.f1438a, new C1256a(vVar, 4, strH));
                vVar.f1439b.put(strH, iVarJ);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strH);
            }
        }
        try {
            return (String) h.b(iVarJ);
        } catch (InterruptedException | ExecutionException e6) {
            throw new IOException(e6);
        }
    }

    public final y d() {
        y yVarB;
        C1243i c1243iC = c(this.f7441b);
        g gVar = this.f7440a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.f4817b) ? "" : gVar.d();
        String strH = C0089e.h(this.f7440a);
        synchronized (c1243iC) {
            yVarB = y.b(((SharedPreferences) c1243iC.f12254x).getString(strD + "|T|" + strH + "|*", null));
        }
        return yVarB;
    }

    public final void e() {
        s sVarI;
        int i6;
        b bVar = (b) this.f7442c.f10423c;
        if (bVar.f3410c.a() >= 241100000) {
            q qVarA = q.a(bVar.f3409b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (qVarA) {
                i6 = qVarA.f3446a;
                qVarA.f3446a = i6 + 1;
            }
            sVarI = qVarA.b(new n(i6, 5, bundle, 1)).i(r.f3450w, T1.d.f3417w);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            s sVar = new s();
            sVar.k(iOException);
            sVarI = sVar;
        }
        sVarI.b(this.f7445f, new l(this, 2));
    }

    public final boolean f() {
        Context context = this.f7441b;
        C0.i(context);
        if (!(Build.VERSION.SDK_INT >= 29)) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "GMS core is set for proxying");
        }
        if (this.f7440a.b(InterfaceC0260a.class) != null) {
            return true;
        }
        return Y2.b.l() && f7438l != null;
    }

    public final synchronized void g(long j6) {
        b(new z(this, Math.min(Math.max(30L, 2 * j6), f7436j)), j6);
        this.f7448i = true;
    }

    public final boolean h(y yVar) {
        if (yVar != null) {
            String strG = this.f7447h.g();
            if (System.currentTimeMillis() <= yVar.f1454c + y.f1451d && strG.equals(yVar.f1453b)) {
                return false;
            }
        }
        return true;
    }
}
