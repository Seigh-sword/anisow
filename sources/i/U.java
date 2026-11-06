package i;

import N.C0090e0;
import N.V;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import h.AbstractC0732a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.InterfaceC0879b;
import m.InterfaceC0959f;
import m.InterfaceC0982q0;
import m.i1;

/* JADX INFO: loaded from: classes.dex */
public final class U extends com.bumptech.glide.d implements InterfaceC0959f {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final AccelerateInterpolator f9246L = new AccelerateInterpolator();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final DecelerateInterpolator f9247M = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9248A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9249B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9250C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f9251D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9252E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public k.l f9253F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9254G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9255H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final S f9256I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final S f9257J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final L3.c f9258K;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f9259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f9260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ActionBarOverlayLayout f9261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ActionBarContainer f9262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0982q0 f9263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ActionBarContextView f9264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f9265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public T f9267v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public T f9268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC0879b f9269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f9271z;

    public U(Activity activity, boolean z5) {
        new ArrayList();
        this.f9271z = new ArrayList();
        this.f9248A = 0;
        this.f9249B = true;
        this.f9252E = true;
        this.f9256I = new S(this, 0);
        this.f9257J = new S(this, 1);
        this.f9258K = new L3.c(1, this);
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z5) {
            return;
        }
        this.f9265t = decorView.findViewById(R.id.content);
    }

    public final void A(boolean z5) {
        C0090e0 c0090e0L;
        C0090e0 c0090e0L2;
        if (z5) {
            if (!this.f9251D) {
                this.f9251D = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9261p;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                G(false);
            }
        } else if (this.f9251D) {
            this.f9251D = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9261p;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            G(false);
        }
        if (!this.f9262q.isLaidOut()) {
            if (z5) {
                ((i1) this.f9263r).f10283a.setVisibility(4);
                this.f9264s.setVisibility(0);
                return;
            } else {
                ((i1) this.f9263r).f10283a.setVisibility(0);
                this.f9264s.setVisibility(8);
                return;
            }
        }
        if (z5) {
            i1 i1Var = (i1) this.f9263r;
            c0090e0L = V.a(i1Var.f10283a);
            c0090e0L.a(0.0f);
            c0090e0L.c(100L);
            c0090e0L.d(new k.k(i1Var, 4));
            c0090e0L2 = this.f9264s.l(0, 200L);
        } else {
            i1 i1Var2 = (i1) this.f9263r;
            C0090e0 c0090e0A = V.a(i1Var2.f10283a);
            c0090e0A.a(1.0f);
            c0090e0A.c(200L);
            c0090e0A.d(new k.k(i1Var2, 0));
            c0090e0L = this.f9264s.l(8, 100L);
            c0090e0L2 = c0090e0A;
        }
        k.l lVar = new k.l();
        ArrayList arrayList = lVar.f9626a;
        arrayList.add(c0090e0L);
        View view = (View) c0090e0L.f1987a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0090e0L2.f1987a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0090e0L2);
        lVar.b();
    }

    public final Context B() {
        if (this.f9260o == null) {
            TypedValue typedValue = new TypedValue();
            this.f9259n.getTheme().resolveAttribute(com.xo.anilab.R.attr.actionBarWidgetTheme, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                this.f9260o = new ContextThemeWrapper(this.f9259n, i6);
            } else {
                this.f9260o = this.f9259n;
            }
        }
        return this.f9260o;
    }

    public final void C(View view) {
        InterfaceC0982q0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.xo.anilab.R.id.decor_content_parent);
        this.f9261p = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.xo.anilab.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0982q0) {
            wrapper = (InterfaceC0982q0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f9263r = wrapper;
        this.f9264s = (ActionBarContextView) view.findViewById(com.xo.anilab.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.xo.anilab.R.id.action_bar_container);
        this.f9262q = actionBarContainer;
        InterfaceC0982q0 interfaceC0982q0 = this.f9263r;
        if (interfaceC0982q0 == null || this.f9264s == null || actionBarContainer == null) {
            throw new IllegalStateException(U.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((i1) interfaceC0982q0).f10283a.getContext();
        this.f9259n = context;
        if ((((i1) this.f9263r).f10284b & 4) != 0) {
            this.f9266u = true;
        }
        int i6 = context.getApplicationInfo().targetSdkVersion;
        this.f9263r.getClass();
        E(context.getResources().getBoolean(com.xo.anilab.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f9259n.obtainStyledAttributes(null, AbstractC0732a.f8563a, com.xo.anilab.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9261p;
            if (!actionBarOverlayLayout2.f5163C) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f9255H = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f9262q;
            WeakHashMap weakHashMap = V.f1964a;
            N.I.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void D(boolean z5) {
        if (this.f9266u) {
            return;
        }
        int i6 = z5 ? 4 : 0;
        i1 i1Var = (i1) this.f9263r;
        int i7 = i1Var.f10284b;
        this.f9266u = true;
        i1Var.a((i6 & 4) | (i7 & (-5)));
    }

    public final void E(boolean z5) {
        if (z5) {
            this.f9262q.setTabContainer(null);
            ((i1) this.f9263r).getClass();
        } else {
            ((i1) this.f9263r).getClass();
            this.f9262q.setTabContainer(null);
        }
        this.f9263r.getClass();
        ((i1) this.f9263r).f10283a.setCollapsible(false);
        this.f9261p.setHasNonEmbeddedTabs(false);
    }

    public final void F(CharSequence charSequence) {
        i1 i1Var = (i1) this.f9263r;
        if (i1Var.f10289g) {
            return;
        }
        i1Var.f10290h = charSequence;
        if ((i1Var.f10284b & 8) != 0) {
            Toolbar toolbar = i1Var.f10283a;
            toolbar.setTitle(charSequence);
            if (i1Var.f10289g) {
                V.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void G(boolean z5) {
        boolean z6 = this.f9251D || !this.f9250C;
        final L3.c cVar = this.f9258K;
        View view = this.f9265t;
        if (!z6) {
            if (this.f9252E) {
                this.f9252E = false;
                k.l lVar = this.f9253F;
                if (lVar != null) {
                    lVar.a();
                }
                int i6 = this.f9248A;
                S s5 = this.f9256I;
                if (i6 != 0 || (!this.f9254G && !z5)) {
                    s5.c();
                    return;
                }
                this.f9262q.setAlpha(1.0f);
                this.f9262q.setTransitioning(true);
                k.l lVar2 = new k.l();
                float f6 = -this.f9262q.getHeight();
                if (z5) {
                    this.f9262q.getLocationInWindow(new int[]{0, 0});
                    f6 -= r12[1];
                }
                C0090e0 c0090e0A = V.a(this.f9262q);
                c0090e0A.e(f6);
                final View view2 = (View) c0090e0A.f1987a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener(view2, cVar) { // from class: N.c0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ L3.c f1976a;

                        {
                            this.f1976a = cVar;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((i.U) this.f1976a.f1734x).f9262q.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z7 = lVar2.f9630e;
                ArrayList arrayList = lVar2.f9626a;
                if (!z7) {
                    arrayList.add(c0090e0A);
                }
                if (this.f9249B && view != null) {
                    C0090e0 c0090e0A2 = V.a(view);
                    c0090e0A2.e(f6);
                    if (!lVar2.f9630e) {
                        arrayList.add(c0090e0A2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f9246L;
                boolean z8 = lVar2.f9630e;
                if (!z8) {
                    lVar2.f9628c = accelerateInterpolator;
                }
                if (!z8) {
                    lVar2.f9627b = 250L;
                }
                if (!z8) {
                    lVar2.f9629d = s5;
                }
                this.f9253F = lVar2;
                lVar2.b();
                return;
            }
            return;
        }
        if (this.f9252E) {
            return;
        }
        this.f9252E = true;
        k.l lVar3 = this.f9253F;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f9262q.setVisibility(0);
        int i7 = this.f9248A;
        S s6 = this.f9257J;
        if (i7 == 0 && (this.f9254G || z5)) {
            this.f9262q.setTranslationY(0.0f);
            float f7 = -this.f9262q.getHeight();
            if (z5) {
                this.f9262q.getLocationInWindow(new int[]{0, 0});
                f7 -= r12[1];
            }
            this.f9262q.setTranslationY(f7);
            k.l lVar4 = new k.l();
            C0090e0 c0090e0A3 = V.a(this.f9262q);
            c0090e0A3.e(0.0f);
            final View view3 = (View) c0090e0A3.f1987a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener(view3, cVar) { // from class: N.c0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ L3.c f1976a;

                    {
                        this.f1976a = cVar;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((i.U) this.f1976a.f1734x).f9262q.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z9 = lVar4.f9630e;
            ArrayList arrayList2 = lVar4.f9626a;
            if (!z9) {
                arrayList2.add(c0090e0A3);
            }
            if (this.f9249B && view != null) {
                view.setTranslationY(f7);
                C0090e0 c0090e0A4 = V.a(view);
                c0090e0A4.e(0.0f);
                if (!lVar4.f9630e) {
                    arrayList2.add(c0090e0A4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f9247M;
            boolean z10 = lVar4.f9630e;
            if (!z10) {
                lVar4.f9628c = decelerateInterpolator;
            }
            if (!z10) {
                lVar4.f9627b = 250L;
            }
            if (!z10) {
                lVar4.f9629d = s6;
            }
            this.f9253F = lVar4;
            lVar4.b();
        } else {
            this.f9262q.setAlpha(1.0f);
            this.f9262q.setTranslationY(0.0f);
            if (this.f9249B && view != null) {
                view.setTranslationY(0.0f);
            }
            s6.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9261p;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = V.f1964a;
            N.G.c(actionBarOverlayLayout);
        }
    }

    public U(Dialog dialog) {
        new ArrayList();
        this.f9271z = new ArrayList();
        this.f9248A = 0;
        this.f9249B = true;
        this.f9252E = true;
        this.f9256I = new S(this, 0);
        this.f9257J = new S(this, 1);
        this.f9258K = new L3.c(1, this);
        C(dialog.getWindow().getDecorView());
    }
}
