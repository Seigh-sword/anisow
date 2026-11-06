package c1;

import W2.AbstractC0232a;
import W2.w;
import a0.C0257e;
import a3.C0261b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import h0.AbstractComponentCallbacksC0734B;
import h0.n0;
import j4.InterfaceC0877a;
import java.util.Map;
import k4.InterfaceC0900a;
import l4.InterfaceC0944b;
import m4.C1134g;
import m4.C1137j;
import o4.InterfaceC1229b;
import s4.InterfaceC1309e;

/* JADX INFO: renamed from: c1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0363d extends AbstractComponentCallbacksC0734B implements InterfaceC1229b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public C1137j f6179t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f6180u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public volatile C1134g f6181v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f6182w0 = new Object();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f6183x0 = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public W0.b f6184y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final c0 f6185z0;

    public C0363d() {
        InterfaceC1309e interfaceC1309eC = S3.a.C(new C0257e(new n0(1, this), 1));
        this.f6185z0 = new c0(D4.s.a(Z0.p.class), new C0360a(interfaceC1309eC, 0), new C0362c(this, interfaceC1309eC, 0), new C0361b(interfaceC1309eC, 0));
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void A(Bundle bundle) {
        super.A(bundle);
        this.f6184y0 = (W0.b) N();
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final LayoutInflater F(Bundle bundle) {
        LayoutInflater layoutInflaterF = super.F(bundle);
        return layoutInflaterF.cloneInContext(new C1137j(layoutInflaterF, this));
    }

    public final Z0.p U() {
        return (Z0.p) this.f6185z0.getValue();
    }

    public final void V() {
        if (this.f6179t0 == null) {
            this.f6179t0 = new C1137j(super.m(), this);
            ((V0.f) ((InterfaceC0877a) com.bumptech.glide.c.s(super.m(), InterfaceC0877a.class))).getClass();
            int i6 = W2.o.f4436y;
            w wVar = w.f4458F;
            if (!(wVar.f4462D <= 1)) {
                throw new IllegalStateException("Cannot bind the flag @DisableFragmentGetContextFix more than once.");
            }
            this.f6180u0 = wVar.isEmpty() ? true : ((Boolean) ((AbstractC0232a) wVar.iterator()).next()).booleanValue();
        }
    }

    @Override // o4.InterfaceC1229b
    public final Object c() {
        if (this.f6181v0 == null) {
            synchronized (this.f6182w0) {
                try {
                    if (this.f6181v0 == null) {
                        this.f6181v0 = new C1134g(this);
                    }
                } finally {
                }
            }
        }
        return this.f6181v0.c();
    }

    @Override // h0.AbstractComponentCallbacksC0734B, androidx.lifecycle.InterfaceC0309i
    public final e0 f() {
        e0 e0VarF = super.f();
        C0261b c0261bA = ((V0.d) ((InterfaceC0944b) S3.a.r(InterfaceC0944b.class, this))).f3686a.a();
        Map map = (Map) c0261bA.f5011x;
        e0VarF.getClass();
        return new l4.f(map, e0VarF, (InterfaceC0900a) c0261bA.f5012y);
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final Context m() {
        if (super.m() == null && !this.f6180u0) {
            return null;
        }
        V();
        return this.f6179t0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // h0.AbstractComponentCallbacksC0734B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.f8616a0 = r0
            m4.j r1 = r3.f6179t0
            if (r1 == 0) goto L1b
        L7:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 != 0) goto L16
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L7
        L16:
            if (r1 != r4) goto L19
            goto L1b
        L19:
            r4 = 0
            goto L1c
        L1b:
            r4 = r0
        L1c:
            if (r4 == 0) goto L31
            r3.V()
            boolean r4 = r3.f6183x0
            if (r4 != 0) goto L30
            r3.f6183x0 = r0
            java.lang.Object r4 = r3.c()
            c1.e r4 = (c1.InterfaceC0364e) r4
            r4.getClass()
        L30:
            return
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0363d.y(android.app.Activity):void");
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void z(Context context) {
        super.z(context);
        V();
        if (this.f6183x0) {
            return;
        }
        this.f6183x0 = true;
        ((InterfaceC0364e) c()).getClass();
    }
}
