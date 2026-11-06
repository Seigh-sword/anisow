package com.onesignal;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.onesignal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0566k extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0572m f7858y;

    public C0566k(C0572m c0572m) {
        this.f7858y = c0572m;
    }

    @Override // com.bumptech.glide.c
    public final void I(View view, float f6, float f7) {
        C c6;
        C0572m c0572m = this.f7858y;
        C0569l c0569l = c0572m.f7888z;
        int i6 = c0569l.f7864b;
        if (!c0572m.f7887y) {
            if (c0569l.f7868f == 1) {
                if (this.f7857x > c0569l.f7872j || f7 > c0569l.f7870h) {
                    i6 = c0569l.f7871i;
                    c0572m.f7887y = true;
                    c6 = c0572m.f7885w;
                    if (c6 != null) {
                        j2 j2Var = ((F) c6.f7497b).f7542t;
                        if (j2Var != null) {
                            C0579o0 c0579o0Q = AbstractC0603w1.q();
                            C0585q0 c0585q0 = j2Var.f7856a.f7942e;
                            c0579o0Q.f7906g.getClass();
                            C0594t1.h("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
                        }
                        ((F) c6.f7497b).f(null);
                    }
                }
            } else if (this.f7857x < c0569l.f7872j || f7 < c0569l.f7870h) {
                i6 = c0569l.f7871i;
                c0572m.f7887y = true;
                c6 = c0572m.f7885w;
                if (c6 != null) {
                    j2 j2Var2 = ((F) c6.f7497b).f7542t;
                    if (j2Var2 != null) {
                        C0579o0 c0579o0Q2 = AbstractC0603w1.q();
                        C0585q0 c0585q02 = j2Var2.f7856a.f7942e;
                        c0579o0Q2.f7906g.getClass();
                        C0594t1.h("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
                    }
                    ((F) c6.f7497b).f(null);
                }
            }
        }
        if (c0572m.f7886x.o(c0572m.f7888z.f7866d, i6)) {
            WeakHashMap weakHashMap = N.V.f1964a;
            c0572m.postInvalidateOnAnimation();
        }
    }

    @Override // com.bumptech.glide.c
    public final boolean Q(View view, int i6) {
        return true;
    }

    @Override // com.bumptech.glide.c
    public final int p(View view, int i6) {
        return this.f7858y.f7888z.f7866d;
    }

    @Override // com.bumptech.glide.c
    public final int q(View view, int i6) {
        C c6;
        C c7;
        C0572m c0572m = this.f7858y;
        C0569l c0569l = c0572m.f7888z;
        if (c0569l.f7869g) {
            return c0569l.f7864b;
        }
        this.f7857x = i6;
        if (c0569l.f7868f == 1) {
            if (i6 >= c0569l.f7865c && (c7 = c0572m.f7885w) != null) {
                ((F) c7.f7497b).f7535m = true;
            }
            int i7 = c0569l.f7864b;
            if (i6 < i7) {
                return i7;
            }
        } else {
            if (i6 <= c0569l.f7865c && (c6 = c0572m.f7885w) != null) {
                ((F) c6.f7497b).f7535m = true;
            }
            int i8 = c0569l.f7864b;
            if (i6 > i8) {
                return i8;
            }
        }
        return i6;
    }
}
