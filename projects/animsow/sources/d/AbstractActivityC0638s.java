package d;

import D.AbstractActivityC0011l;
import D.C0012m;
import D.L;
import D.M;
import D.N;
import N.InterfaceC0102m;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.InterfaceC0309i;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.xo.anilab.R;
import e.InterfaceC0659a;
import f.InterfaceC0681g;
import i.C0803c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C0921c;
import s4.AbstractC1305a;
import s4.C1314j;
import t0.AbstractC1332d;
import z0.C1523d;
import z0.C1524e;
import z0.InterfaceC1525f;

/* JADX INFO: renamed from: d.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0638s extends AbstractActivityC0011l implements j0, InterfaceC0309i, InterfaceC1525f, InterfaceC0619G, InterfaceC0681g, E.g, E.h, L, M, InterfaceC0102m {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f8125O = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public i0 f8126A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ViewTreeObserverOnDrawListenerC0633n f8127B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1314j f8128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0635p f8129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final CopyOnWriteArrayList f8130E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final CopyOnWriteArrayList f8131F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final CopyOnWriteArrayList f8132G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final CopyOnWriteArrayList f8133H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final CopyOnWriteArrayList f8134I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final CopyOnWriteArrayList f8135J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f8136K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f8137L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C1314j f8138M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C1314j f8139N;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U1.i f8140x = new U1.i();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0803c f8141y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1524e f8142z;

    public AbstractActivityC0638s() {
        int i6 = 0;
        this.f8141y = new C0803c(new RunnableC0623d(this, i6));
        C1524e c1524e = new C1524e(this);
        this.f8142z = c1524e;
        h0.E e6 = (h0.E) this;
        this.f8127B = new ViewTreeObserverOnDrawListenerC0633n(e6);
        this.f8128C = new C1314j(new C0636q(this, 2));
        new AtomicInteger();
        this.f8129D = new C0635p(e6);
        this.f8130E = new CopyOnWriteArrayList();
        this.f8131F = new CopyOnWriteArrayList();
        this.f8132G = new CopyOnWriteArrayList();
        this.f8133H = new CopyOnWriteArrayList();
        this.f8134I = new CopyOnWriteArrayList();
        this.f8135J = new CopyOnWriteArrayList();
        C0323x c0323x = this.f205w;
        if (c0323x == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        c0323x.a(new C0624e(i6, this));
        this.f205w.a(new C0624e(1, this));
        this.f205w.a(new C0629j(i6, this));
        c1524e.a();
        U.c(this);
        c1524e.f14072b.c("android:support:activity-result", new C0625f(i6, this));
        i(new C0626g(e6, i6));
        this.f8138M = new C1314j(new C0636q(this, i6));
        this.f8139N = new C1314j(new C0636q(this, 3));
    }

    @Override // androidx.lifecycle.InterfaceC0309i
    public final C0921c a() {
        C0921c c0921c = new C0921c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0921c.f9835a;
        if (application != null) {
            B3.e eVar = d0.f5619d;
            Application application2 = getApplication();
            AbstractC1305a.n(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(U.f5583a, this);
        linkedHashMap.put(U.f5584b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(U.f5585c, extras);
        }
        return c0921c;
    }

    @Override // z0.InterfaceC1525f
    public final C1523d b() {
        return this.f8142z.f14072b;
    }

    @Override // androidx.lifecycle.j0
    public final i0 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        if (this.f8126A == null) {
            C0631l c0631l = (C0631l) getLastNonConfigurationInstance();
            if (c0631l != null) {
                this.f8126A = c0631l.f8108a;
            }
            if (this.f8126A == null) {
                this.f8126A = new i0();
            }
        }
        i0 i0Var = this.f8126A;
        AbstractC1305a.l(i0Var);
        return i0Var;
    }

    public abstract e0 f();

    @Override // androidx.lifecycle.InterfaceC0321v
    public final C0323x g() {
        return this.f205w;
    }

    public final void i(InterfaceC0659a interfaceC0659a) {
        U1.i iVar = this.f8140x;
        iVar.getClass();
        Context context = (Context) iVar.f3596x;
        if (context != null) {
            interfaceC0659a.a(context);
        }
        ((Set) iVar.f3595w).add(interfaceC0659a);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i6, int i7, Intent intent) {
        if (this.f8129D.a(i6, i7, intent)) {
            return;
        }
        super.onActivityResult(i6, i7, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((C0618F) this.f8139N.getValue()).c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC1305a.o(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f8130E.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).a(configuration);
        }
    }

    @Override // D.AbstractActivityC0011l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f8142z.b(bundle);
        U1.i iVar = this.f8140x;
        iVar.getClass();
        iVar.f3596x = this;
        Iterator it = ((Set) iVar.f3595w).iterator();
        while (it.hasNext()) {
            ((InterfaceC0659a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i6 = O.f5570x;
        B3.e.u(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i6, Menu menu) {
        AbstractC1305a.o(menu, "menu");
        if (i6 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i6, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f8141y.f9278y).iterator();
        while (it.hasNext()) {
            ((h0.M) it.next()).f8668a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        AbstractC1305a.o(menuItem, "item");
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 0) {
            return this.f8141y.K();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5) {
        if (this.f8136K) {
            return;
        }
        Iterator it = this.f8133H.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).a(new C0012m(z5));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC1305a.o(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f8132G.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        AbstractC1305a.o(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f8141y.f9278y).iterator();
        while (it.hasNext()) {
            ((h0.M) it.next()).f8668a.q();
        }
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5) {
        if (this.f8137L) {
            return;
        }
        Iterator it = this.f8134I.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).a(new N(z5));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i6, View view, Menu menu) {
        AbstractC1305a.o(menu, "menu");
        if (i6 != 0) {
            return true;
        }
        super.onPreparePanel(i6, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f8141y.f9278y).iterator();
        while (it.hasNext()) {
            ((h0.M) it.next()).f8668a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        AbstractC1305a.o(strArr, "permissions");
        AbstractC1305a.o(iArr, "grantResults");
        if (this.f8129D.a(i6, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0631l c0631l;
        i0 i0Var = this.f8126A;
        if (i0Var == null && (c0631l = (C0631l) getLastNonConfigurationInstance()) != null) {
            i0Var = c0631l.f8108a;
        }
        if (i0Var == null) {
            return null;
        }
        C0631l c0631l2 = new C0631l();
        c0631l2.f8108a = i0Var;
        return c0631l2;
    }

    @Override // D.AbstractActivityC0011l, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1305a.o(bundle, "outState");
        C0323x c0323x = this.f205w;
        if (c0323x instanceof C0323x) {
            AbstractC1305a.m(c0323x, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            c0323x.g();
        }
        super.onSaveInstanceState(bundle);
        this.f8142z.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        Iterator it = this.f8131F.iterator();
        while (it.hasNext()) {
            ((M.a) it.next()).a(Integer.valueOf(i6));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f8135J.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC1332d.T()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((C0640u) this.f8128C.getValue()).a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        View decorView = getWindow().getDecorView();
        AbstractC1305a.n(decorView, "window.decorView");
        com.bumptech.glide.c.N(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1305a.n(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1305a.n(decorView3, "window.decorView");
        AbstractC1332d.p0(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1305a.n(decorView4, "window.decorView");
        com.bumptech.glide.c.O(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC1305a.n(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        AbstractC1305a.n(decorView6, "window.decorView");
        ViewTreeObserverOnDrawListenerC0633n viewTreeObserverOnDrawListenerC0633n = this.f8127B;
        viewTreeObserverOnDrawListenerC0633n.getClass();
        if (!viewTreeObserverOnDrawListenerC0633n.f8113y) {
            viewTreeObserverOnDrawListenerC0633n.f8113y = true;
            decorView6.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0633n);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i6) {
        AbstractC1305a.o(intent, "intent");
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9) throws IntentSender.SendIntentException {
        AbstractC1305a.o(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5, Configuration configuration) {
        AbstractC1305a.o(configuration, "newConfig");
        this.f8136K = true;
        try {
            super.onMultiWindowModeChanged(z5, configuration);
            this.f8136K = false;
            Iterator it = this.f8133H.iterator();
            while (it.hasNext()) {
                ((M.a) it.next()).a(new C0012m(z5));
            }
        } catch (Throwable th) {
            this.f8136K = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5, Configuration configuration) {
        AbstractC1305a.o(configuration, "newConfig");
        this.f8137L = true;
        try {
            super.onPictureInPictureModeChanged(z5, configuration);
            this.f8137L = false;
            Iterator it = this.f8134I.iterator();
            while (it.hasNext()) {
                ((M.a) it.next()).a(new N(z5));
            }
        } catch (Throwable th) {
            this.f8137L = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i6, Bundle bundle) {
        AbstractC1305a.o(intent, "intent");
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC1305a.o(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9, bundle);
    }
}
