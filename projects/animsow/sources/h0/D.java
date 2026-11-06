package h0;

import N.InterfaceC0102m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0323x;
import d.AbstractC0628i;
import d.C0618F;
import d.InterfaceC0619G;
import f.InterfaceC0681g;
import i.AbstractActivityC0812l;
import i.C0803c;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import s4.AbstractC1305a;
import z0.C1523d;
import z0.InterfaceC1525f;

/* JADX INFO: loaded from: classes.dex */
public final class D extends com.bumptech.glide.c implements E.g, E.h, D.L, D.M, androidx.lifecycle.j0, InterfaceC0619G, InterfaceC0681g, InterfaceC1525f, a0, InterfaceC0102m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final W f8640A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ E f8641B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Activity f8642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f8643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f8644z;

    public D(AbstractActivityC0812l abstractActivityC0812l) {
        this.f8641B = abstractActivityC0812l;
        Handler handler = new Handler();
        this.f8642x = abstractActivityC0812l;
        this.f8643y = abstractActivityC0812l;
        this.f8644z = handler;
        this.f8640A = new W();
    }

    @Override // com.bumptech.glide.c
    public final View A(int i6) {
        return this.f8641B.findViewById(i6);
    }

    @Override // com.bumptech.glide.c
    public final boolean D() {
        Window window = this.f8641B.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public final void S(M m5) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(m5, "provider");
        C0803c c0803c = e6.f8141y;
        ((CopyOnWriteArrayList) c0803c.f9278y).add(m5);
        ((Runnable) c0803c.f9277x).run();
    }

    public final void T(M.a aVar) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(aVar, "listener");
        e6.f8130E.add(aVar);
    }

    public final void U(J j6) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(j6, "listener");
        e6.f8133H.add(j6);
    }

    public final void V(J j6) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(j6, "listener");
        e6.f8134I.add(j6);
    }

    public final void W(J j6) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(j6, "listener");
        e6.f8131F.add(j6);
    }

    public final C0618F X() {
        return (C0618F) this.f8641B.f8139N.getValue();
    }

    public final void Y(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, Intent intent, int i6) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "fragment");
        AbstractC1305a.o(intent, "intent");
        if (i6 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
        }
        Object obj = E.f.f379a;
        this.f8643y.startActivity(intent, null);
    }

    public final void Z(M m5) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(m5, "provider");
        C0803c c0803c = e6.f8141y;
        ((CopyOnWriteArrayList) c0803c.f9278y).remove(m5);
        AbstractC0628i.p(((Map) c0803c.f9279z).remove(m5));
        ((Runnable) c0803c.f9277x).run();
    }

    public final void a0(J j6) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(j6, "listener");
        e6.f8130E.remove(j6);
    }

    @Override // z0.InterfaceC1525f
    public final C1523d b() {
        return this.f8641B.f8142z.f14072b;
    }

    public final void b0(J j6) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(j6, "listener");
        e6.f8133H.remove(j6);
    }

    public final void c0(J j6) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(j6, "listener");
        e6.f8134I.remove(j6);
    }

    @Override // h0.a0
    public final void d() {
        this.f8641B.getClass();
    }

    public final void d0(J j6) {
        E e6 = this.f8641B;
        e6.getClass();
        AbstractC1305a.o(j6, "listener");
        e6.f8131F.remove(j6);
    }

    @Override // androidx.lifecycle.j0
    public final androidx.lifecycle.i0 e() {
        return this.f8641B.e();
    }

    @Override // androidx.lifecycle.InterfaceC0321v
    public final C0323x g() {
        return this.f8641B.f8647Q;
    }
}
