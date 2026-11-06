package W1;

import X1.C0239g;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import d.AbstractC0628i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import s.C1280b;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: W1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218l implements L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0229x f4324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f4325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A f4326e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f4328g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lock f4332k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f4327f = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U1.b f4329h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public U1.b f4330i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4331j = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4333l = 0;

    public C0218l(Context context, C0229x c0229x, Lock lock, Looper looper, U1.e eVar, C1280b c1280b, C1280b c1280b2, C0239g c0239g, f2.h hVar, V1.b bVar, ArrayList arrayList, ArrayList arrayList2, C1280b c1280b3, C1280b c1280b4) {
        this.f4324c = c0229x;
        this.f4332k = lock;
        this.f4325d = new A(context, c0229x, lock, looper, eVar, c1280b2, null, c1280b4, null, arrayList2, new a0(this, 0));
        this.f4326e = new A(context, c0229x, lock, looper, eVar, c1280b, c0239g, c1280b3, hVar, arrayList, new a0(this, 1));
        C1280b c1280b5 = new C1280b();
        Iterator it = ((s.h) c1280b2.keySet()).iterator();
        while (it.hasNext()) {
            c1280b5.put((V1.c) it.next(), this.f4325d);
        }
        Iterator it2 = ((s.h) c1280b.keySet()).iterator();
        while (it2.hasNext()) {
            c1280b5.put((V1.c) it2.next(), this.f4326e);
        }
        Collections.unmodifiableMap(c1280b5);
    }

    public static void g(C0218l c0218l) {
        U1.b bVar;
        U1.b bVar2;
        U1.b bVar3;
        U1.b bVar4 = c0218l.f4329h;
        boolean z5 = bVar4 != null && bVar4.c();
        A a6 = c0218l.f4325d;
        if (!z5) {
            U1.b bVar5 = c0218l.f4329h;
            A a7 = c0218l.f4326e;
            if (bVar5 != null && (bVar2 = c0218l.f4330i) != null && bVar2.c()) {
                a7.a();
                U1.b bVar6 = c0218l.f4329h;
                AbstractC1332d.m(bVar6);
                c0218l.b(bVar6);
                return;
            }
            U1.b bVar7 = c0218l.f4329h;
            if (bVar7 == null || (bVar = c0218l.f4330i) == null) {
                return;
            }
            if (a7.f4222n < a6.f4222n) {
                bVar7 = bVar;
            }
            c0218l.b(bVar7);
            return;
        }
        U1.b bVar8 = c0218l.f4330i;
        if (!(bVar8 != null && bVar8.c()) && ((bVar3 = c0218l.f4330i) == null || bVar3.f3576x != 4)) {
            if (bVar3 != null) {
                if (c0218l.f4333l == 1) {
                    c0218l.f();
                    return;
                } else {
                    c0218l.b(bVar3);
                    a6.a();
                    return;
                }
            }
            return;
        }
        int i6 = c0218l.f4333l;
        if (i6 == 1) {
            c0218l.f();
        } else if (i6 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            C0229x c0229x = c0218l.f4324c;
            AbstractC1332d.m(c0229x);
            c0229x.a(c0218l.f4328g);
            c0218l.f();
        }
        c0218l.f4333l = 0;
    }

    @Override // W1.L
    public final void a() {
        this.f4330i = null;
        this.f4329h = null;
        this.f4333l = 0;
        this.f4325d.a();
        this.f4326e.a();
        f();
    }

    public final void b(U1.b bVar) {
        int i6 = this.f4333l;
        if (i6 == 1) {
            f();
        } else if (i6 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f4324c.b(bVar);
            f();
        }
        this.f4333l = 0;
    }

    @Override // W1.L
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f4326e.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f4325d.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // W1.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r4 = this;
            java.util.concurrent.locks.Lock r0 = r4.f4332k
            r0.lock()
            W1.A r0 = r4.f4325d     // Catch: java.lang.Throwable -> L27
            W1.y r0 = r0.f4221m     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0 instanceof W1.C0221o     // Catch: java.lang.Throwable -> L27
            r1 = 0
            if (r0 == 0) goto L29
            W1.A r0 = r4.f4326e     // Catch: java.lang.Throwable -> L27
            W1.y r0 = r0.f4221m     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0 instanceof W1.C0221o     // Catch: java.lang.Throwable -> L27
            r2 = 1
            if (r0 != 0) goto L20
            U1.b r0 = r4.f4330i     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L22
            int r0 = r0.f3576x     // Catch: java.lang.Throwable -> L27
            r3 = 4
            if (r0 != r3) goto L22
        L20:
            r1 = r2
            goto L29
        L22:
            int r0 = r4.f4333l     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L29
            goto L20
        L27:
            r0 = move-exception
            goto L2f
        L29:
            java.util.concurrent.locks.Lock r0 = r4.f4332k
            r0.unlock()
            return r1
        L2f:
            java.util.concurrent.locks.Lock r1 = r4.f4332k
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.C0218l.d():boolean");
    }

    @Override // W1.L
    public final void e() {
        this.f4333l = 2;
        this.f4331j = false;
        this.f4330i = null;
        this.f4329h = null;
        this.f4325d.e();
        this.f4326e.e();
    }

    public final void f() {
        Set set = this.f4327f;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
        set.clear();
    }
}
