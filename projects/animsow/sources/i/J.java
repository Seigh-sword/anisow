package i;

import N.InterfaceC0101l;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.xo.anilab.R;
import d.DialogC0639t;
import d2.AbstractC0651b;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public class J extends DialogC0639t implements InterfaceC0813m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final I f9218A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public H f9219z;

    /* JADX WARN: Type inference failed for: r2v2, types: [i.I] */
    public J(Context context, int i6) {
        int i7;
        if (i6 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i7 = typedValue.resourceId;
        } else {
            i7 = i6;
        }
        super(context, i7);
        this.f9218A = new InterfaceC0101l() { // from class: i.I
            @Override // N.InterfaceC0101l
            public final boolean d(KeyEvent keyEvent) {
                return this.f9217w.h(keyEvent);
            }
        };
        AbstractC0818s abstractC0818sE = e();
        if (i6 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i6 = typedValue2.resourceId;
        }
        ((H) abstractC0818sE).f9207q0 = i6;
        abstractC0818sE.c();
    }

    @Override // d.DialogC0639t, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        H h4 = (H) e();
        h4.v();
        ((ViewGroup) h4.f9188X.findViewById(android.R.id.content)).addView(view, layoutParams);
        h4.f9173I.a(h4.f9172H.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0651b.m(this.f9218A, getWindow().getDecorView(), this, keyEvent);
    }

    public final AbstractC0818s e() {
        if (this.f9219z == null) {
            ExecutorC0817q executorC0817q = AbstractC0818s.f9337w;
            this.f9219z = new H(getContext(), getWindow(), this, this);
        }
        return this.f9219z;
    }

    public final void f() {
        com.bumptech.glide.c.N(getWindow().getDecorView(), this);
        AbstractC1332d.p0(getWindow().getDecorView(), this);
        com.bumptech.glide.c.O(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i6) {
        H h4 = (H) e();
        h4.v();
        return h4.f9172H.findViewById(i6);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        H h4 = (H) e();
        if (h4.f9175K != null) {
            h4.z();
            h4.f9175K.getClass();
            h4.A(0);
        }
    }

    @Override // d.DialogC0639t, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().c();
    }

    @Override // d.DialogC0639t, android.app.Dialog
    public final void onStop() {
        super.onStop();
        H h4 = (H) e();
        h4.z();
        U u5 = h4.f9175K;
        if (u5 != null) {
            u5.f9254G = false;
            k.l lVar = u5.f9253F;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    @Override // d.DialogC0639t, android.app.Dialog
    public void setContentView(int i6) {
        f();
        e().g(i6);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i6) {
        super.setTitle(i6);
        e().l(getContext().getString(i6));
    }

    @Override // d.DialogC0639t, android.app.Dialog
    public void setContentView(View view) {
        f();
        e().h(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().l(charSequence);
    }

    @Override // d.DialogC0639t, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        e().k(view, layoutParams);
    }
}
