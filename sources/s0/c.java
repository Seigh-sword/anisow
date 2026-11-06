package S0;

import I0.u;
import W1.C0226u;
import W1.HandlerC0227v;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.measurement.C0396c2;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f3063x;

    public c() {
        this.f3062w = 0;
        this.f3063x = new C0396c2(14);
    }

    public static void a(J0.k kVar, String str) {
        WorkDatabase workDatabase = kVar.f1208j;
        R0.k kVarN = workDatabase.n();
        R0.c cVarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iH = kVarN.h(str2);
            if (iH != 3 && iH != 4) {
                kVarN.t(6, str2);
            }
            linkedList.addAll(cVarI.a(str2));
        }
        J0.b bVar = kVar.f1211m;
        synchronized (bVar.f1176G) {
            try {
                I0.o.w().u(J0.b.f1169H, "Processor cancelling " + str, new Throwable[0]);
                bVar.f1174E.add(str);
                J0.m mVar = (J0.m) bVar.f1171B.remove(str);
                boolean z5 = mVar != null;
                if (mVar == null) {
                    mVar = (J0.m) bVar.f1172C.remove(str);
                }
                J0.b.c(str, mVar);
                if (z5) {
                    bVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = kVar.f1210l.iterator();
        while (it.hasNext()) {
            ((J0.c) it.next()).b(str);
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f3062w;
        Object obj = this.f3063x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    c();
                    ((C0396c2) obj).R(u.f1110f);
                    return;
                } catch (Throwable th) {
                    ((C0396c2) obj).R(new I0.r(th));
                    return;
                }
            case 1:
                C0226u c0226u = (C0226u) obj;
                Lock lock = c0226u.f4351b;
                Lock lock2 = c0226u.f4351b;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            d();
                        }
                    } finally {
                        lock2.unlock();
                    }
                    break;
                } catch (RuntimeException e6) {
                    HandlerC0227v handlerC0227v = ((C0226u) obj).f4350a.f4215g;
                    handlerC0227v.sendMessage(handlerC0227v.obtainMessage(2, e6));
                }
                return;
            default:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName((String) obj);
                try {
                    b();
                    return;
                } finally {
                    Thread.currentThread().setName(name);
                }
        }
    }

    public /* synthetic */ c(C0226u c0226u) {
        this.f3062w = 1;
        this.f3063x = c0226u;
    }

    public c(String str, Object[] objArr) {
        this.f3062w = 2;
        byte[] bArr = W4.b.f4484a;
        this.f3063x = String.format(Locale.US, str, objArr);
    }
}
