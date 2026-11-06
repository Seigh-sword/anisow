package W1;

import X1.AbstractC0242j;
import X1.C0244l;
import X1.C0245m;
import X1.C0248p;
import X1.C0249q;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import h2.AbstractC0772d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C0924C;
import s.C1281c;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: renamed from: W1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0211e implements Handler.Callback {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Status f4300K = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Status f4301L = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Object f4302M = new Object();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static C0211e f4303N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Context f4304A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U1.e f4305B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1358b f4306C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final AtomicInteger f4307D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final AtomicInteger f4308E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ConcurrentHashMap f4309F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1281c f4310G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1281c f4311H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.X f4312I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public volatile boolean f4313J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f4314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0248p f4316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Z1.c f4317z;

    public C0211e(Context context, Looper looper) {
        U1.e eVar = U1.e.f3586d;
        this.f4314w = 10000L;
        this.f4315x = false;
        this.f4307D = new AtomicInteger(1);
        this.f4308E = new AtomicInteger(0);
        this.f4309F = new ConcurrentHashMap(5, 0.75f, 1);
        this.f4310G = new C1281c(0);
        this.f4311H = new C1281c(0);
        this.f4313J = true;
        this.f4304A = context;
        com.google.android.gms.internal.measurement.X x5 = new com.google.android.gms.internal.measurement.X(looper, this, 0);
        this.f4312I = x5;
        this.f4305B = eVar;
        this.f4306C = new C1358b((U1.f) eVar);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1332d.f12707p == null) {
            AbstractC1332d.f12707p = Boolean.valueOf(AbstractC1332d.S() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC1332d.f12707p.booleanValue()) {
            this.f4313J = false;
        }
        x5.sendMessage(x5.obtainMessage(6));
    }

    public static Status c(C0207a c0207a, U1.b bVar) {
        return new Status(17, "API: " + c0207a.f4284b.f3706c + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f3577y, bVar);
    }

    public static C0211e e(Context context) {
        C0211e c0211e;
        HandlerThread handlerThread;
        synchronized (f4302M) {
            if (f4303N == null) {
                synchronized (X1.P.f4547h) {
                    try {
                        handlerThread = X1.P.f4549j;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            X1.P.f4549j = handlerThread2;
                            handlerThread2.start();
                            handlerThread = X1.P.f4549j;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = U1.e.f3585c;
                f4303N = new C0211e(applicationContext, looper);
            }
            c0211e = f4303N;
        }
        return c0211e;
    }

    public final boolean a() {
        if (this.f4315x) {
            return false;
        }
        C0245m.b().getClass();
        int i6 = ((SparseIntArray) this.f4306C.f12822x).get(203400000, -1);
        return i6 == -1 || i6 == 0;
    }

    public final boolean b(U1.b bVar, int i6) {
        PendingIntent activity;
        U1.e eVar = this.f4305B;
        eVar.getClass();
        Context context = this.f4304A;
        if (AbstractC0651b.u(context)) {
            return false;
        }
        boolean zB = bVar.b();
        int i7 = bVar.f3576x;
        if (zB) {
            activity = bVar.f3577y;
        } else {
            activity = null;
            Intent intentA = eVar.a(i7, context, null);
            if (intentA != null) {
                activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
            }
        }
        if (activity == null) {
            return false;
        }
        int i8 = GoogleApiActivity.f6430x;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i6);
        intent.putExtra("notify_manager", true);
        eVar.g(context, i7, PendingIntent.getActivity(context, 0, intent, AbstractC0772d.f8980a | 134217728));
        return true;
    }

    public final E d(V1.g gVar) {
        ConcurrentHashMap concurrentHashMap = this.f4309F;
        C0207a c0207a = gVar.f3714e;
        E e6 = (E) concurrentHashMap.get(c0207a);
        if (e6 == null) {
            e6 = new E(this, gVar);
            concurrentHashMap.put(c0207a, e6);
        }
        if (e6.f4229d.j()) {
            this.f4311H.add(c0207a);
        }
        e6.l();
        return e6;
    }

    public final void f(U1.b bVar, int i6) {
        if (b(bVar, i6)) {
            return;
        }
        com.google.android.gms.internal.measurement.X x5 = this.f4312I;
        x5.sendMessage(x5.obtainMessage(5, i6, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        E e6;
        U1.d[] dVarArrG;
        int i6 = message.what;
        com.google.android.gms.internal.measurement.X x5 = this.f4312I;
        ConcurrentHashMap concurrentHashMap = this.f4309F;
        switch (i6) {
            case 1:
                this.f4314w = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                x5.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    x5.sendMessageDelayed(x5.obtainMessage(12, (C0207a) it.next()), this.f4314w);
                }
                return true;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0628i.p(message.obj);
                throw null;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                for (E e7 : concurrentHashMap.values()) {
                    AbstractC1332d.e(e7.f4239n.f4312I);
                    e7.f4238m = null;
                    e7.l();
                }
                return true;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                O o3 = (O) message.obj;
                E eD = (E) concurrentHashMap.get(o3.f4261c.f3714e);
                if (eD == null) {
                    eD = d(o3.f4261c);
                }
                boolean zJ = eD.f4229d.j();
                V v5 = o3.f4259a;
                if (!zJ || this.f4308E.get() == o3.f4260b) {
                    eD.m(v5);
                } else {
                    v5.a(f4300K);
                    eD.p();
                }
                return true;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                int i7 = message.arg1;
                U1.b bVar = (U1.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        e6 = (E) it2.next();
                        if (e6.f4234i == i7) {
                        }
                    } else {
                        e6 = null;
                    }
                }
                if (e6 != null) {
                    int i8 = bVar.f3576x;
                    if (i8 == 13) {
                        this.f4305B.getClass();
                        AtomicBoolean atomicBoolean = U1.h.f3590a;
                        StringBuilder sbN = AbstractC0628i.n("Error resolution was canceled by the user, original error message: ", U1.b.e(i8), ": ");
                        sbN.append(bVar.f3578z);
                        e6.c(new Status(17, sbN.toString(), null, null));
                    } else {
                        e6.c(c(e6.f4230e, bVar));
                    }
                } else {
                    Log.wtf("GoogleApiManager", H1.a.j("Could not find API instance ", i7, " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = this.f4304A;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0209c.a((Application) context.getApplicationContext());
                    ComponentCallbacks2C0209c componentCallbacks2C0209c = ComponentCallbacks2C0209c.f4292A;
                    D d6 = new D(this);
                    componentCallbacks2C0209c.getClass();
                    synchronized (componentCallbacks2C0209c) {
                        componentCallbacks2C0209c.f4295y.add(d6);
                        break;
                    }
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0209c.f4294x;
                    boolean z5 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C0209c.f4293w;
                    if (!z5) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f4314w = 300000L;
                    }
                }
                return true;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                d((V1.g) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    E e8 = (E) concurrentHashMap.get(message.obj);
                    AbstractC1332d.e(e8.f4239n.f4312I);
                    if (e8.f4236k) {
                        e8.l();
                    }
                }
                return true;
            case 10:
                C1281c c1281c = this.f4311H;
                Iterator it3 = c1281c.iterator();
                while (it3.hasNext()) {
                    E e9 = (E) concurrentHashMap.remove((C0207a) it3.next());
                    if (e9 != null) {
                        e9.p();
                    }
                }
                c1281c.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    E e10 = (E) concurrentHashMap.get(message.obj);
                    C0211e c0211e = e10.f4239n;
                    AbstractC1332d.e(c0211e.f4312I);
                    boolean z6 = e10.f4236k;
                    if (z6) {
                        if (z6) {
                            C0211e c0211e2 = e10.f4239n;
                            com.google.android.gms.internal.measurement.X x6 = c0211e2.f4312I;
                            C0207a c0207a = e10.f4230e;
                            x6.removeMessages(11, c0207a);
                            c0211e2.f4312I.removeMessages(9, c0207a);
                            e10.f4236k = false;
                        }
                        e10.c(c0211e.f4305B.b(c0211e.f4304A, U1.f.f3587a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        e10.f4229d.i("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    E e11 = (E) concurrentHashMap.get(message.obj);
                    AbstractC1332d.e(e11.f4239n.f4312I);
                    AbstractC0242j abstractC0242j = e11.f4229d;
                    if (abstractC0242j.a() && e11.f4233h.isEmpty()) {
                        C0924C c0924c = e11.f4231f;
                        if (c0924c.f9842a.isEmpty() && c0924c.f9843b.isEmpty()) {
                            abstractC0242j.i("Timing out service connection.");
                        } else {
                            e11.i();
                        }
                    }
                }
                return true;
            case 14:
                AbstractC0628i.p(message.obj);
                throw null;
            case 15:
                F f6 = (F) message.obj;
                if (concurrentHashMap.containsKey(f6.f4240a)) {
                    E e12 = (E) concurrentHashMap.get(f6.f4240a);
                    if (e12.f4237l.contains(f6) && !e12.f4236k) {
                        if (e12.f4229d.a()) {
                            e12.f();
                        } else {
                            e12.l();
                        }
                    }
                }
                return true;
            case 16:
                F f7 = (F) message.obj;
                if (concurrentHashMap.containsKey(f7.f4240a)) {
                    E e13 = (E) concurrentHashMap.get(f7.f4240a);
                    if (e13.f4237l.remove(f7)) {
                        C0211e c0211e3 = e13.f4239n;
                        c0211e3.f4312I.removeMessages(15, f7);
                        c0211e3.f4312I.removeMessages(16, f7);
                        LinkedList linkedList = e13.f4228c;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it4 = linkedList.iterator();
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            U1.d dVar = f7.f4241b;
                            if (zHasNext) {
                                V v6 = (V) it4.next();
                                if ((v6 instanceof K) && (dVarArrG = ((K) v6).g(e13)) != null) {
                                    int length = dVarArrG.length;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= length) {
                                        }
                                        if (!AbstractC1332d.D(dVarArrG[i9], dVar)) {
                                            i9++;
                                        } else if (i9 >= 0) {
                                            arrayList.add(v6);
                                        }
                                        break;
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    V v7 = (V) arrayList.get(i10);
                                    linkedList.remove(v7);
                                    v7.b(new V1.l(dVar));
                                }
                            }
                        }
                    }
                }
                return true;
            case 17:
                C0248p c0248p = this.f4316y;
                if (c0248p != null) {
                    if (c0248p.f4638w > 0 || a()) {
                        if (this.f4317z == null) {
                            this.f4317z = new Z1.c(this.f4304A, Z1.c.f4955i, C0249q.f4640b, V1.f.f3708b);
                        }
                        this.f4317z.b(c0248p);
                    }
                    this.f4316y = null;
                }
                return true;
            case 18:
                N n5 = (N) message.obj;
                long j6 = n5.f4257c;
                C0244l c0244l = n5.f4255a;
                int i11 = n5.f4256b;
                if (j6 == 0) {
                    C0248p c0248p2 = new C0248p(i11, Arrays.asList(c0244l));
                    if (this.f4317z == null) {
                        this.f4317z = new Z1.c(this.f4304A, Z1.c.f4955i, C0249q.f4640b, V1.f.f3708b);
                    }
                    this.f4317z.b(c0248p2);
                } else {
                    C0248p c0248p3 = this.f4316y;
                    if (c0248p3 != null) {
                        List list = c0248p3.f4639x;
                        if (c0248p3.f4638w != i11 || (list != null && list.size() >= n5.f4258d)) {
                            x5.removeMessages(17);
                            C0248p c0248p4 = this.f4316y;
                            if (c0248p4 != null) {
                                if (c0248p4.f4638w > 0 || a()) {
                                    if (this.f4317z == null) {
                                        this.f4317z = new Z1.c(this.f4304A, Z1.c.f4955i, C0249q.f4640b, V1.f.f3708b);
                                    }
                                    this.f4317z.b(c0248p4);
                                }
                                this.f4316y = null;
                            }
                        } else {
                            C0248p c0248p5 = this.f4316y;
                            if (c0248p5.f4639x == null) {
                                c0248p5.f4639x = new ArrayList();
                            }
                            c0248p5.f4639x.add(c0244l);
                        }
                    }
                    if (this.f4316y == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c0244l);
                        this.f4316y = new C0248p(i11, arrayList2);
                        x5.sendMessageDelayed(x5.obtainMessage(17), n5.f4257c);
                    }
                }
                return true;
            case 19:
                this.f4315x = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i6);
                return false;
        }
    }
}
