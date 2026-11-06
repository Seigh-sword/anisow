package W1;

import X1.C0239g;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import d.AbstractC0628i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import s.C1280b;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: W1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0229x extends GoogleApiClient implements J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f4374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X1.w f4375c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f4378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Looper f4379g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f4381i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HandlerC0227v f4384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U1.e f4385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public I f4386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f4387o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0239g f4389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f4390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f2.h f4391s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f4393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f4394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final S f4395w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public L f4376d = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f4380h = new LinkedList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4382j = 120000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f4383k = 5000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Set f4388p = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0215i f4392t = new C0215i();

    public C0229x(Context context, ReentrantLock reentrantLock, Looper looper, C0239g c0239g, U1.e eVar, Z1.b bVar, C1280b c1280b, ArrayList arrayList, ArrayList arrayList2, C1280b c1280b2, int i6, int i7, ArrayList arrayList3) {
        this.f4394v = null;
        C0215i c0215i = new C0215i(this);
        this.f4378f = context;
        this.f4374b = reentrantLock;
        this.f4375c = new X1.w(looper, c0215i);
        this.f4379g = looper;
        this.f4384l = new HandlerC0227v(this, looper, 0);
        this.f4385m = eVar;
        this.f4377e = i6;
        if (i6 >= 0) {
            this.f4394v = Integer.valueOf(i7);
        }
        this.f4390r = c1280b;
        this.f4387o = c1280b2;
        this.f4393u = arrayList3;
        this.f4395w = new S();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V1.i iVar = (V1.i) it.next();
            X1.w wVar = this.f4375c;
            wVar.getClass();
            AbstractC1332d.m(iVar);
            synchronized (wVar.f4653E) {
                try {
                    if (wVar.f4655x.contains(iVar)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(iVar) + " is already registered");
                    } else {
                        wVar.f4655x.add(iVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (wVar.f4654w.a()) {
                com.google.android.gms.internal.measurement.X x5 = wVar.f4652D;
                x5.sendMessage(x5.obtainMessage(1, iVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.f4375c.a((V1.j) it2.next());
        }
        this.f4389q = c0239g;
        this.f4391s = bVar;
    }

    public static int f(Collection collection, boolean z5) {
        Iterator it = collection.iterator();
        boolean zJ = false;
        while (it.hasNext()) {
            zJ |= ((V1.b) it.next()).j();
        }
        return zJ ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void g(C0229x c0229x) {
        c0229x.f4374b.lock();
        try {
            if (c0229x.f4381i) {
                c0229x.j();
            }
        } finally {
            c0229x.f4374b.unlock();
        }
    }

    @Override // W1.J
    public final void a(Bundle bundle) {
        if (!this.f4380h.isEmpty()) {
            AbstractC0628i.p(this.f4380h.remove());
            throw null;
        }
        X1.w wVar = this.f4375c;
        if (Looper.myLooper() != wVar.f4652D.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (wVar.f4653E) {
            try {
                AbstractC1332d.p(!wVar.f4651C);
                wVar.f4652D.removeMessages(1);
                wVar.f4651C = true;
                AbstractC1332d.p(wVar.f4656y.isEmpty());
                ArrayList<V1.i> arrayList = new ArrayList(wVar.f4655x);
                int i6 = wVar.f4650B.get();
                for (V1.i iVar : arrayList) {
                    if (!wVar.f4649A || !wVar.f4654w.a() || wVar.f4650B.get() != i6) {
                        break;
                    } else if (!wVar.f4656y.contains(iVar)) {
                        iVar.D(bundle);
                    }
                }
                wVar.f4656y.clear();
                wVar.f4651C = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W1.J
    public final void b(U1.b bVar) {
        U1.e eVar = this.f4385m;
        Context context = this.f4378f;
        int i6 = bVar.f3576x;
        eVar.getClass();
        AtomicBoolean atomicBoolean = U1.h.f3590a;
        if (i6 != 18 && (i6 != 1 || !U1.h.b(context))) {
            h();
        }
        if (this.f4381i) {
            return;
        }
        X1.w wVar = this.f4375c;
        if (Looper.myLooper() != wVar.f4652D.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        wVar.f4652D.removeMessages(1);
        synchronized (wVar.f4653E) {
            try {
                ArrayList<V1.j> arrayList = new ArrayList(wVar.f4657z);
                int i7 = wVar.f4650B.get();
                for (V1.j jVar : arrayList) {
                    if (!wVar.f4649A || wVar.f4650B.get() != i7) {
                        break;
                    } else if (wVar.f4657z.contains(jVar)) {
                        jVar.e(bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        X1.w wVar2 = this.f4375c;
        wVar2.f4649A = false;
        wVar2.f4650B.incrementAndGet();
    }

    @Override // W1.J
    public final void c(int i6) {
        if (i6 == 1) {
            if (!this.f4381i) {
                this.f4381i = true;
                if (this.f4386n == null) {
                    try {
                        U1.e eVar = this.f4385m;
                        Context applicationContext = this.f4378f.getApplicationContext();
                        C0228w c0228w = new C0228w(this);
                        eVar.getClass();
                        this.f4386n = U1.e.e(applicationContext, c0228w);
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC0227v handlerC0227v = this.f4384l;
                handlerC0227v.sendMessageDelayed(handlerC0227v.obtainMessage(1), this.f4382j);
                HandlerC0227v handlerC0227v2 = this.f4384l;
                handlerC0227v2.sendMessageDelayed(handlerC0227v2.obtainMessage(2), this.f4383k);
            }
            i6 = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f4395w.f4272a.toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        X1.w wVar = this.f4375c;
        if (Looper.myLooper() != wVar.f4652D.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        wVar.f4652D.removeMessages(1);
        synchronized (wVar.f4653E) {
            try {
                wVar.f4651C = true;
                ArrayList<V1.i> arrayList = new ArrayList(wVar.f4655x);
                int i7 = wVar.f4650B.get();
                for (V1.i iVar : arrayList) {
                    if (!wVar.f4649A || wVar.f4650B.get() != i7) {
                        break;
                    } else if (wVar.f4655x.contains(iVar)) {
                        iVar.b(i6);
                    }
                }
                wVar.f4656y.clear();
                wVar.f4651C = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        X1.w wVar2 = this.f4375c;
        wVar2.f4649A = false;
        wVar2.f4650B.incrementAndGet();
        if (i6 == 2) {
            j();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        Lock lock = this.f4374b;
        lock.lock();
        try {
            int i6 = 2;
            boolean z5 = false;
            if (this.f4377e >= 0) {
                AbstractC1332d.o("Sign-in mode should have been set explicitly by auto-manage.", this.f4394v != null);
            } else {
                Integer num = this.f4394v;
                if (num == null) {
                    this.f4394v = Integer.valueOf(f(this.f4387o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f4394v;
            AbstractC1332d.m(num2);
            int iIntValue = num2.intValue();
            lock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i6 = iIntValue;
                    }
                    AbstractC1332d.d("Illegal sign-in mode: " + i6, z5);
                    i(i6);
                    j();
                    lock.unlock();
                    return;
                }
                i6 = iIntValue;
                AbstractC1332d.d("Illegal sign-in mode: " + i6, z5);
                i(i6);
                j();
                lock.unlock();
                return;
            } finally {
                lock.unlock();
            }
            z5 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean d() {
        L l5 = this.f4376d;
        return l5 != null && l5.d();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock = this.f4374b;
        lock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f4395w.f4272a.toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            L l5 = this.f4376d;
            if (l5 != null) {
                l5.a();
            }
            Object obj = this.f4392t.f4318a;
            Iterator it = ((Set) obj).iterator();
            if (it.hasNext()) {
                AbstractC0628i.p(it.next());
                throw null;
            }
            ((Set) obj).clear();
            LinkedList linkedList = this.f4380h;
            Iterator it2 = linkedList.iterator();
            if (it2.hasNext()) {
                AbstractC0628i.p(it2.next());
                throw null;
            }
            linkedList.clear();
            if (this.f4376d != null) {
                h();
                X1.w wVar = this.f4375c;
                wVar.f4649A = false;
                wVar.f4650B.incrementAndGet();
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f4378f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f4381i);
        printWriter.append(" mWorkQueue.size()=").print(this.f4380h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f4395w.f4272a.size());
        L l5 = this.f4376d;
        if (l5 != null) {
            l5.c(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean h() {
        if (!this.f4381i) {
            return false;
        }
        this.f4381i = false;
        this.f4384l.removeMessages(2);
        this.f4384l.removeMessages(1);
        I i6 = this.f4386n;
        if (i6 != null) {
            i6.a();
            this.f4386n = null;
        }
        return true;
    }

    public final void i(int i6) {
        Integer num = this.f4394v;
        if (num == null) {
            this.f4394v = Integer.valueOf(i6);
        } else if (num.intValue() != i6) {
            int iIntValue = this.f4394v.intValue();
            String str = iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb = new StringBuilder("Cannot use sign-in mode: ");
            sb.append(i6 != 1 ? i6 != 2 ? i6 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED");
            sb.append(". Mode was already set to ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f4376d != null) {
            return;
        }
        Map map = this.f4387o;
        Iterator it = map.values().iterator();
        boolean zJ = false;
        while (it.hasNext()) {
            zJ |= ((V1.b) it.next()).j();
        }
        int iIntValue2 = this.f4394v.intValue();
        if (iIntValue2 != 1) {
            if (iIntValue2 == 2 && zJ) {
                C1280b c1280b = new C1280b();
                C1280b c1280b2 = new C1280b();
                for (Map.Entry entry : map.entrySet()) {
                    V1.b bVar = (V1.b) entry.getValue();
                    bVar.getClass();
                    boolean zJ2 = bVar.j();
                    V1.c cVar = (V1.c) entry.getKey();
                    if (zJ2) {
                        c1280b.put(cVar, bVar);
                    } else {
                        c1280b2.put(cVar, bVar);
                    }
                }
                AbstractC1332d.o("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c1280b.isEmpty());
                C1280b c1280b3 = new C1280b();
                C1280b c1280b4 = new C1280b();
                Map map2 = this.f4390r;
                for (V1.d dVar : map2.keySet()) {
                    V1.c cVar2 = dVar.f3705b;
                    if (c1280b.containsKey(cVar2)) {
                        c1280b3.put(dVar, (Boolean) map2.get(dVar));
                    } else {
                        if (!c1280b2.containsKey(cVar2)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        c1280b4.put(dVar, (Boolean) map2.get(dVar));
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f4393u;
                int size = arrayList3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Y y5 = (Y) arrayList3.get(i7);
                    if (c1280b3.containsKey(y5.f4280c)) {
                        arrayList.add(y5);
                    } else {
                        if (!c1280b4.containsKey(y5.f4280c)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList2.add(y5);
                    }
                }
                this.f4376d = new C0218l(this.f4378f, this, this.f4374b, this.f4379g, this.f4385m, c1280b, c1280b2, this.f4389q, this.f4391s, null, arrayList, arrayList2, c1280b3, c1280b4);
                return;
            }
        } else if (!zJ) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.f4376d = new A(this.f4378f, this, this.f4374b, this.f4379g, this.f4385m, this.f4387o, this.f4389q, this.f4390r, this.f4391s, this.f4393u, this);
    }

    public final void j() {
        this.f4375c.f4649A = true;
        L l5 = this.f4376d;
        AbstractC1332d.m(l5);
        l5.e();
    }
}
