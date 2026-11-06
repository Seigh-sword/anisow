package h1;

import android.content.SharedPreferences;
import android.util.Log;
import b2.C0337b;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C0396c2;
import com.google.android.gms.internal.measurement.C0484r1;
import com.onesignal.AbstractC0603w1;
import com.onesignal.C0584q;
import com.onesignal.D;
import com.onesignal.EnumC0600v1;
import com.onesignal.InterfaceC0609y1;
import com.onesignal.RunnableC0570l0;
import d.AbstractC0628i;
import d4.C0657b;
import d4.C0658c;
import j1.InterfaceC0845c;
import j1.i;
import j1.m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import l1.k;
import m2.AbstractC1078w;
import m2.Y;
import m2.x1;
import n1.C1146b;
import n1.InterfaceC1145a;

/* JADX INFO: renamed from: h1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0764d implements InterfaceC1145a, InterfaceC0609y1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f8949A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f8950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f8951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f8952y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f8953z;

    public C0764d(x1 x1Var) {
        this.f8951x = x1Var;
    }

    @Override // com.onesignal.InterfaceC0609y1
    public final void a(String str) {
        C0584q c0584q = (C0584q) this.f8951x;
        C0657b c0657b = (C0657b) this.f8953z;
        c0584q.getClass();
        C0658c c0658c = c0657b.f8224b;
        if (c0658c == null || (c0658c.f8227a == null && c0658c.f8228b == null)) {
            c0584q.l();
        } else {
            new Thread(new RunnableC0570l0(c0584q, 6, c0657b), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
        }
        AbstractC0628i.p(this.f8949A);
    }

    public final synchronized C0765e b() {
        try {
            if (((C0765e) this.f8951x) == null) {
                this.f8951x = C0765e.u((File) this.f8953z, this.f8950w);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C0765e) this.f8951x;
    }

    @Override // com.onesignal.InterfaceC0609y1
    public final void c(int i6, String str) {
        new Thread(new D(3, this), "OS_SAVE_OUTCOMES").start();
        AbstractC0603w1.b(EnumC0600v1.f7998z, "Sending outcome with name: " + ((String) this.f8952y) + " failed with status code: " + i6 + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start", null);
        AbstractC0628i.p(this.f8949A);
    }

    public final void d(A1 a12) {
        this.f8952y = a12;
    }

    public final boolean e(long j6, C0484r1 c0484r1) {
        if (((List) this.f8949A) == null) {
            this.f8949A = new ArrayList();
        }
        if (((List) this.f8953z) == null) {
            this.f8953z = new ArrayList();
        }
        if (!((List) this.f8949A).isEmpty() && ((((C0484r1) ((List) this.f8949A).get(0)).B() / 1000) / 60) / 60 != ((c0484r1.B() / 1000) / 60) / 60) {
            return false;
        }
        long jA = this.f8950w + ((long) c0484r1.a(null));
        ((x1) this.f8951x).Q();
        if (jA >= Math.max(0, ((Integer) AbstractC1078w.f11198j.a(null)).intValue())) {
            return false;
        }
        this.f8950w = jA;
        ((List) this.f8949A).add(c0484r1);
        ((List) this.f8953z).add(Long.valueOf(j6));
        int size = ((List) this.f8949A).size();
        ((x1) this.f8951x).Q();
        return size < Math.max(1, ((Integer) AbstractC1078w.f11201k.a(null)).intValue());
    }

    public final void f() {
        ((Y) this.f8951x).r();
        ((C0337b) ((Y) this.f8951x).h()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = ((Y) this.f8951x).A().edit();
        editorEdit.remove((String) this.f8953z);
        editorEdit.remove((String) this.f8949A);
        editorEdit.putLong((String) this.f8952y, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @Override // n1.InterfaceC1145a
    public final File h(i iVar) {
        String strI = ((C0396c2) this.f8952y).I(iVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strI + " for for Key: " + iVar);
        }
        try {
            C0764d c0764dL = b().l(strI);
            if (c0764dL != null) {
                return ((File[]) c0764dL.f8949A)[0];
            }
            return null;
        } catch (IOException e6) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e6);
            return null;
        }
    }

    @Override // n1.InterfaceC1145a
    public final void q(i iVar, k kVar) {
        C1146b c1146b;
        C0765e c0765eB;
        boolean z5;
        String strI = ((C0396c2) this.f8952y).I(iVar);
        C0396c2 c0396c2 = (C0396c2) this.f8949A;
        synchronized (c0396c2) {
            c1146b = (C1146b) ((Map) c0396c2.f6775x).get(strI);
            if (c1146b == null) {
                L3.c cVar = (L3.c) c0396c2.f6776y;
                synchronized (((Queue) cVar.f1734x)) {
                    c1146b = (C1146b) ((Queue) cVar.f1734x).poll();
                }
                if (c1146b == null) {
                    c1146b = new C1146b();
                }
                ((Map) c0396c2.f6775x).put(strI, c1146b);
            }
            c1146b.f11686b++;
        }
        c1146b.f11685a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strI + " for for Key: " + iVar);
            }
            try {
                c0765eB = b();
            } catch (IOException e6) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e6);
                }
            }
            if (c0765eB.l(strI) != null) {
                return;
            }
            com.bumptech.glide.k kVarH = c0765eB.h(strI);
            if (kVarH == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strI));
            }
            try {
                if (((InterfaceC0845c) kVar.f9916a).m(kVar.f9917b, kVarH.c(), (m) kVar.f9918c)) {
                    C0765e.b((C0765e) kVarH.f6359z, kVarH, true);
                    kVarH.f6356w = true;
                }
                if (!z5) {
                    try {
                        kVarH.b();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!kVarH.f6356w) {
                    try {
                        kVarH.b();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((C0396c2) this.f8949A).N(strI);
        }
    }
}
