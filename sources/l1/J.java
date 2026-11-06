package l1;

import android.os.SystemClock;
import android.util.Log;
import j1.EnumC0843a;
import j1.InterfaceC0845c;
import java.util.Collections;
import n1.InterfaceC1145a;

/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC0934h, InterfaceC0933g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile Object f9872A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile p1.w f9873B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile C0932f f9874C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0935i f9875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC0933g f9876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile int f9877y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile C0931e f9878z;

    public J(C0935i c0935i, InterfaceC0933g interfaceC0933g) {
        this.f9875w = c0935i;
        this.f9876x = interfaceC0933g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // l1.InterfaceC0934h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f9872A
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r6.f9872A
            r6.f9872A = r1
            boolean r0 = r6.e(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            return r2
        L11:
            r0 = move-exception
            java.lang.String r3 = "SourceGenerator"
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r3, r4)
            if (r4 == 0) goto L20
            java.lang.String r4 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r3, r4, r0)
        L20:
            l1.e r0 = r6.f9878z
            if (r0 == 0) goto L2d
            l1.e r0 = r6.f9878z
            boolean r0 = r0.a()
            if (r0 == 0) goto L2d
            return r2
        L2d:
            r6.f9878z = r1
            r6.f9873B = r1
            r0 = 0
        L32:
            if (r0 != 0) goto La1
            int r1 = r6.f9877y
            l1.i r3 = r6.f9875w
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto La1
            l1.i r1 = r6.f9875w
            java.util.ArrayList r1 = r1.b()
            int r3 = r6.f9877y
            int r4 = r3 + 1
            r6.f9877y = r4
            java.lang.Object r1 = r1.get(r3)
            p1.w r1 = (p1.w) r1
            r6.f9873B = r1
            p1.w r1 = r6.f9873B
            if (r1 == 0) goto L32
            l1.i r1 = r6.f9875w
            l1.p r1 = r1.f9913p
            p1.w r3 = r6.f9873B
            com.bumptech.glide.load.data.e r3 = r3.f12288c
            j1.a r3 = r3.d()
            l1.o r1 = (l1.o) r1
            int r1 = r1.f9959d
            switch(r1) {
                case 1: goto L7b;
                case 2: goto L72;
                default: goto L6d;
            }
        L6d:
            j1.a r1 = j1.EnumC0843a.f9425x
            if (r3 != r1) goto L7b
            goto L8b
        L72:
            j1.a r1 = j1.EnumC0843a.f9426y
            if (r3 == r1) goto L7b
            j1.a r1 = j1.EnumC0843a.f9422A
            if (r3 == r1) goto L7b
            goto L8b
        L7b:
            l1.i r1 = r6.f9875w
            p1.w r3 = r6.f9873B
            com.bumptech.glide.load.data.e r3 = r3.f12288c
            java.lang.Class r3 = r3.b()
            l1.D r1 = r1.c(r3)
            if (r1 == 0) goto L32
        L8b:
            p1.w r0 = r6.f9873B
            p1.w r1 = r6.f9873B
            com.bumptech.glide.load.data.e r1 = r1.f12288c
            l1.i r3 = r6.f9875w
            com.bumptech.glide.g r3 = r3.f9912o
            com.google.android.gms.internal.measurement.c2 r4 = new com.google.android.gms.internal.measurement.c2
            r5 = 20
            r4.<init>(r6, r0, r5)
            r1.e(r3, r4)
            r0 = r2
            goto L32
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.J.a():boolean");
    }

    @Override // l1.InterfaceC0933g
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // l1.InterfaceC0933g
    public final void c(j1.i iVar, Object obj, com.bumptech.glide.load.data.e eVar, EnumC0843a enumC0843a, j1.i iVar2) {
        this.f9876x.c(iVar, obj, eVar, this.f9873B.f12288c.d(), iVar);
    }

    @Override // l1.InterfaceC0934h
    public final void cancel() {
        p1.w wVar = this.f9873B;
        if (wVar != null) {
            wVar.f12288c.cancel();
        }
    }

    @Override // l1.InterfaceC0933g
    public final void d(j1.i iVar, Exception exc, com.bumptech.glide.load.data.e eVar, EnumC0843a enumC0843a) {
        this.f9876x.d(iVar, exc, eVar, this.f9873B.f12288c.d());
    }

    public final boolean e(Object obj) throws Throwable {
        int i6 = C1.h.f123b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z5 = false;
        try {
            com.bumptech.glide.load.data.g gVarF = this.f9875w.f9900c.a().f(obj);
            Object objA = gVarF.a();
            InterfaceC0845c interfaceC0845cE = this.f9875w.e(objA);
            k kVar = new k(interfaceC0845cE, objA, this.f9875w.f9906i);
            j1.i iVar = this.f9873B.f12286a;
            C0935i c0935i = this.f9875w;
            C0932f c0932f = new C0932f(iVar, c0935i.f9911n);
            InterfaceC1145a interfaceC1145aB = c0935i.f9905h.b();
            interfaceC1145aB.q(c0932f, kVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c0932f + ", data: " + obj + ", encoder: " + interfaceC0845cE + ", duration: " + C1.h.a(jElapsedRealtimeNanos));
            }
            if (interfaceC1145aB.h(c0932f) != null) {
                this.f9874C = c0932f;
                this.f9878z = new C0931e(Collections.singletonList(this.f9873B.f12286a), this.f9875w, this);
                this.f9873B.f12288c.c();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f9874C + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f9876x.c(this.f9873B.f12286a, gVarF.a(), this.f9873B.f12288c, this.f9873B.f12288c.d(), this.f9873B.f12286a);
                return false;
            } catch (Throwable th) {
                th = th;
                z5 = true;
                if (!z5) {
                    this.f9873B.f12288c.c();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
