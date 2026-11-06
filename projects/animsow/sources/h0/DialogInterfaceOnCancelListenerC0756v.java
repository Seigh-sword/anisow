package h0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d.DialogC0639t;
import j.RunnableC0835a;
import o.C1160c;
import o.C1164g;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: h0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0756v extends AbstractComponentCallbacksC0734B implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f8909C0;
    public Dialog E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f8911F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f8912G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f8913H0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Handler f8915t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final RunnableC0835a f8916u0 = new RunnableC0835a(7, this);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final r f8917v0 = new r(this);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0753s f8918w0 = new DialogInterfaceOnDismissListenerC0753s(this);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f8919x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f8920y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f8921z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f8907A0 = true;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f8908B0 = -1;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final C0754t f8910D0 = new C0754t(this);

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f8914I0 = false;

    @Override // h0.AbstractComponentCallbacksC0734B
    public void A(Bundle bundle) {
        super.A(bundle);
        this.f8915t0 = new Handler();
        this.f8907A0 = this.f8610U == 0;
        if (bundle != null) {
            this.f8919x0 = bundle.getInt("android:style", 0);
            this.f8920y0 = bundle.getInt("android:theme", 0);
            this.f8921z0 = bundle.getBoolean("android:cancelable", true);
            this.f8907A0 = bundle.getBoolean("android:showsDialog", this.f8907A0);
            this.f8908B0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void D() {
        this.f8616a0 = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            this.f8911F0 = true;
            dialog.setOnDismissListener(null);
            this.E0.dismiss();
            if (!this.f8912G0) {
                onDismiss(this.E0);
            }
            this.E0 = null;
            this.f8914I0 = false;
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void E() {
        this.f8616a0 = true;
        if (!this.f8913H0 && !this.f8912G0) {
            this.f8912G0 = true;
        }
        C0754t c0754t = this.f8910D0;
        androidx.lifecycle.E e6 = this.f8629n0;
        e6.getClass();
        androidx.lifecycle.E.a("removeObserver");
        androidx.lifecycle.C c6 = (androidx.lifecycle.C) e6.f5551b.c(c0754t);
        if (c6 == null) {
            return;
        }
        c6.c();
        c6.a(false);
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final LayoutInflater F(Bundle bundle) {
        LayoutInflater layoutInflaterF = super.F(bundle);
        boolean z5 = this.f8907A0;
        if (!z5 || this.f8909C0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                StringBuilder sb = !this.f8907A0 ? new StringBuilder("mShowsDialog = false: ") : new StringBuilder("mCreatingDialog = true: ");
                sb.append(str);
                Log.d("FragmentManager", sb.toString());
            }
            return layoutInflaterF;
        }
        if (z5 && !this.f8914I0) {
            try {
                this.f8909C0 = true;
                Dialog dialogV = V();
                this.E0 = dialogV;
                if (this.f8907A0) {
                    W(dialogV, this.f8919x0);
                    Context contextM = m();
                    if (contextM instanceof Activity) {
                        this.E0.setOwnerActivity((Activity) contextM);
                    }
                    this.E0.setCancelable(this.f8921z0);
                    this.E0.setOnCancelListener(this.f8917v0);
                    this.E0.setOnDismissListener(this.f8918w0);
                    this.f8914I0 = true;
                } else {
                    this.E0 = null;
                }
                this.f8909C0 = false;
            } catch (Throwable th) {
                this.f8909C0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.E0;
        return dialog != null ? layoutInflaterF.cloneInContext(dialog.getContext()) : layoutInflaterF;
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public void H(Bundle bundle) {
        Dialog dialog = this.E0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i6 = this.f8919x0;
        if (i6 != 0) {
            bundle.putInt("android:style", i6);
        }
        int i7 = this.f8920y0;
        if (i7 != 0) {
            bundle.putInt("android:theme", i7);
        }
        boolean z5 = this.f8921z0;
        if (!z5) {
            bundle.putBoolean("android:cancelable", z5);
        }
        boolean z6 = this.f8907A0;
        if (!z6) {
            bundle.putBoolean("android:showsDialog", z6);
        }
        int i8 = this.f8908B0;
        if (i8 != -1) {
            bundle.putInt("android:backStackId", i8);
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public void I() {
        this.f8616a0 = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            this.f8911F0 = false;
            dialog.show();
            View decorView = this.E0.getWindow().getDecorView();
            com.bumptech.glide.c.N(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC1332d.p0(decorView, this);
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public void J() {
        this.f8616a0 = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void L(Bundle bundle) {
        Bundle bundle2;
        this.f8616a0 = true;
        if (this.E0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.E0.onRestoreInstanceState(bundle2);
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.M(layoutInflater, viewGroup, bundle);
        if (this.f8618c0 != null || this.E0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.E0.onRestoreInstanceState(bundle2);
    }

    public final void U(boolean z5, boolean z6) {
        if (this.f8912G0) {
            return;
        }
        this.f8912G0 = true;
        this.f8913H0 = false;
        Dialog dialog = this.E0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.E0.dismiss();
            if (!z6) {
                if (Looper.myLooper() == this.f8915t0.getLooper()) {
                    onDismiss(this.E0);
                } else {
                    this.f8915t0.post(this.f8916u0);
                }
            }
        }
        this.f8911F0 = true;
        if (this.f8908B0 >= 0) {
            W wO = o();
            int i6 = this.f8908B0;
            if (i6 < 0) {
                throw new IllegalArgumentException(AbstractC0628i.f("Bad id: ", i6));
            }
            wO.x(new U(wO, i6), z5);
            this.f8908B0 = -1;
            return;
        }
        C0736a c0736a = new C0736a(o());
        c0736a.f8750o = true;
        c0736a.g(this);
        if (z5) {
            c0736a.d(true, true);
        } else {
            c0736a.d(false, true);
        }
    }

    public Dialog V() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0639t(O(), this.f8920y0);
    }

    public void W(Dialog dialog, int i6) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void X(W w5, String str) {
        this.f8912G0 = false;
        this.f8913H0 = true;
        w5.getClass();
        C0736a c0736a = new C0736a(w5);
        c0736a.f8750o = true;
        c0736a.e(0, this, str, 1);
        c0736a.d(false, true);
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final com.bumptech.glide.c h() {
        return new C0755u(this, new C0759y(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8911F0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        U(true, true);
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void w() {
        this.f8616a0 = true;
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void z(Context context) {
        Object obj;
        super.z(context);
        C0754t c0754t = this.f8910D0;
        androidx.lifecycle.E e6 = this.f8629n0;
        e6.getClass();
        androidx.lifecycle.E.a("observeForever");
        androidx.lifecycle.A a6 = new androidx.lifecycle.A(e6, c0754t);
        C1164g c1164g = e6.f5551b;
        C1160c c1160cB = c1164g.b(c0754t);
        if (c1160cB != null) {
            obj = c1160cB.f11707x;
        } else {
            C1160c c1160c = new C1160c(c0754t, a6);
            c1164g.f11718z++;
            C1160c c1160c2 = c1164g.f11716x;
            if (c1160c2 == null) {
                c1164g.f11715w = c1160c;
            } else {
                c1160c2.f11708y = c1160c;
                c1160c.f11709z = c1160c2;
            }
            c1164g.f11716x = c1160c;
            obj = null;
        }
        androidx.lifecycle.C c6 = (androidx.lifecycle.C) obj;
        if (c6 instanceof androidx.lifecycle.B) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c6 == null) {
            a6.a(true);
        }
        if (this.f8913H0) {
            return;
        }
        this.f8912G0 = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
