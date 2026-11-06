package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0321v;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import z0.C1523d;
import z0.C1524e;
import z0.InterfaceC1525f;

/* JADX INFO: renamed from: d.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0639t extends Dialog implements InterfaceC0321v, InterfaceC0619G, InterfaceC1525f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0323x f8143w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1524e f8144x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0618F f8145y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0639t(Context context, int i6) {
        super(context, i6);
        AbstractC1305a.o(context, "context");
        this.f8144x = new C1524e(this);
        this.f8145y = new C0618F(new RunnableC0632m(1, this));
    }

    public static void a(DialogC0639t dialogC0639t) {
        AbstractC1305a.o(dialogC0639t, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1305a.o(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // z0.InterfaceC1525f
    public final C1523d b() {
        return this.f8144x.f14072b;
    }

    public final C0323x c() {
        C0323x c0323x = this.f8143w;
        if (c0323x != null) {
            return c0323x;
        }
        C0323x c0323x2 = new C0323x(this);
        this.f8143w = c0323x2;
        return c0323x2;
    }

    public final void d() {
        Window window = getWindow();
        AbstractC1305a.l(window);
        View decorView = window.getDecorView();
        AbstractC1305a.n(decorView, "window!!.decorView");
        com.bumptech.glide.c.N(decorView, this);
        Window window2 = getWindow();
        AbstractC1305a.l(window2);
        View decorView2 = window2.getDecorView();
        AbstractC1305a.n(decorView2, "window!!.decorView");
        com.bumptech.glide.c.O(decorView2, this);
        Window window3 = getWindow();
        AbstractC1305a.l(window3);
        View decorView3 = window3.getDecorView();
        AbstractC1305a.n(decorView3, "window!!.decorView");
        AbstractC1332d.p0(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0321v
    public final C0323x g() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f8145y.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC1305a.n(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0618F c0618f = this.f8145y;
            c0618f.getClass();
            c0618f.f8087e = onBackInvokedDispatcher;
            c0618f.d(c0618f.f8089g);
        }
        this.f8144x.b(bundle);
        c().e(EnumC0313m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC1305a.n(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f8144x.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        c().e(EnumC0313m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().e(EnumC0313m.ON_DESTROY);
        this.f8143w = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        d();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC1305a.o(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1305a.o(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
