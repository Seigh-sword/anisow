package y2;

import N.I;
import N.V;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.xo.anilab.R;
import i.J;
import i.ViewOnClickListenerC0802b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.J0;

/* JADX INFO: renamed from: y2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1506h extends J {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BottomSheetBehavior f13803B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public FrameLayout f13804C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public CoordinatorLayout f13805D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public FrameLayout f13806E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f13807F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f13808G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13809H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1505g f13810I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f13811J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public I2.g f13812K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C1504f f13813L;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f13803B == null) {
            i();
        }
        super.cancel();
    }

    public final void i() {
        if (this.f13804C == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f13804C = frameLayout;
            this.f13805D = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f13804C.findViewById(R.id.design_bottom_sheet);
            this.f13806E = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorA = BottomSheetBehavior.A(frameLayout2);
            this.f13803B = bottomSheetBehaviorA;
            C1504f c1504f = this.f13813L;
            ArrayList arrayList = bottomSheetBehaviorA.f7074W;
            if (!arrayList.contains(c1504f)) {
                arrayList.add(c1504f);
            }
            this.f13803B.F(this.f13807F);
            this.f13812K = new I2.g(this.f13803B, this.f13806E);
        }
    }

    public final FrameLayout j(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f13804C.findViewById(R.id.coordinator);
        if (i6 != 0 && view == null) {
            view = getLayoutInflater().inflate(i6, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f13811J) {
            FrameLayout frameLayout = this.f13806E;
            K1.b bVar = new K1.b(9, this);
            WeakHashMap weakHashMap = V.f1964a;
            I.u(frameLayout, bVar);
        }
        this.f13806E.removeAllViews();
        FrameLayout frameLayout2 = this.f13806E;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ViewOnClickListenerC0802b(2, this));
        V.l(this.f13806E, new C1503e(0, this));
        this.f13806E.setOnTouchListener(new J0(1, this));
        return this.f13804C;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z5 = this.f13811J && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f13804C;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z5);
            }
            CoordinatorLayout coordinatorLayout = this.f13805D;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z5);
            }
            com.bumptech.glide.d.w(window, !z5);
            C1505g c1505g = this.f13810I;
            if (c1505g != null) {
                c1505g.e(window);
            }
        }
        I2.g gVar = this.f13812K;
        if (gVar == null) {
            return;
        }
        boolean z6 = this.f13807F;
        View view = gVar.f1148c;
        I2.d dVar = gVar.f1146a;
        if (z6) {
            if (dVar != null) {
                dVar.b(gVar.f1147b, view, false);
            }
        } else if (dVar != null) {
            dVar.c(view);
        }
    }

    @Override // i.J, d.DialogC0639t, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        I2.d dVar;
        C1505g c1505g = this.f13810I;
        if (c1505g != null) {
            c1505g.e(null);
        }
        I2.g gVar = this.f13812K;
        if (gVar == null || (dVar = gVar.f1146a) == null) {
            return;
        }
        dVar.c(gVar.f1148c);
    }

    @Override // d.DialogC0639t, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f13803B;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f7063L != 5) {
            return;
        }
        bottomSheetBehavior.H(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z5) {
        I2.g gVar;
        super.setCancelable(z5);
        if (this.f13807F != z5) {
            this.f13807F = z5;
            BottomSheetBehavior bottomSheetBehavior = this.f13803B;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z5);
            }
            if (getWindow() == null || (gVar = this.f13812K) == null) {
                return;
            }
            boolean z6 = this.f13807F;
            View view = gVar.f1148c;
            I2.d dVar = gVar.f1146a;
            if (z6) {
                if (dVar != null) {
                    dVar.b(gVar.f1147b, view, false);
                }
            } else if (dVar != null) {
                dVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z5) {
        super.setCanceledOnTouchOutside(z5);
        if (z5 && !this.f13807F) {
            this.f13807F = true;
        }
        this.f13808G = z5;
        this.f13809H = true;
    }

    @Override // i.J, d.DialogC0639t, android.app.Dialog
    public final void setContentView(int i6) {
        super.setContentView(j(null, i6, null));
    }

    @Override // i.J, d.DialogC0639t, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(j(view, 0, null));
    }

    @Override // i.J, d.DialogC0639t, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(j(view, 0, layoutParams));
    }
}
