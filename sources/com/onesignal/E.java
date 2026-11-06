package com.onesignal;

import android.view.animation.Animation;
import java.util.Set;
import org.json.JSONException;
import r.C1267a;

/* JADX INFO: loaded from: classes.dex */
public final class E implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f7513a;

    public E(F f6, C1267a c1267a) {
        this.f7513a = f6;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j2 j2Var = this.f7513a.f7542t;
        if (j2Var != null) {
            C0579o0 c0579o0Q = AbstractC0603w1.q();
            C0585q0 c0585q0 = j2Var.f7856a.f7942e;
            c0579o0Q.f7906g.getClass();
            C0594t1.h("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
            if (c0585q0.f7961k) {
                return;
            }
            String str = c0585q0.f7951a;
            Set set = c0579o0Q.f7914o;
            if (set.contains(str)) {
                return;
            }
            set.add(c0585q0.f7951a);
            String strS0 = c0579o0Q.s0(c0585q0);
            if (strS0 == null) {
                return;
            }
            A0 a02 = c0579o0Q.f7910k;
            String str2 = AbstractC0603w1.f8032d;
            String strV = AbstractC0603w1.v();
            int iB = OSUtils.b();
            String str3 = c0585q0.f7951a;
            C0561i0 c0561i0 = new C0561i0(c0579o0Q, c0585q0, 2);
            a02.getClass();
            try {
                AbstractC0571l1.J("in_app_messages/" + str3 + "/impression", new C0602w0(str2, strV, strS0, iB), new C0605x0(a02, set, c0561i0, 2));
            } catch (JSONException e6) {
                e6.printStackTrace();
                a02.f7461b.getClass();
                C0594t1.e("Unable to execute in-app message impression HTTP request due to invalid JSON");
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
