package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.xo.anilab.R;
import m.C0995x0;
import m.P0;

/* JADX INFO: renamed from: l.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0906F extends w implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f9659A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f9660B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f9661C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f9662D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final P0 f9663E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0912e f9664F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0913f f9665G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public PopupWindow.OnDismissListener f9666H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public View f9667I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public View f9668J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public z f9669K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ViewTreeObserver f9670L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f9671M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f9672N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f9673O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f9674P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f9675Q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f9676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f9677y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f9678z;

    public ViewOnKeyListenerC0906F(int i6, int i7, Context context, View view, o oVar, boolean z5) {
        int i8 = 1;
        this.f9664F = new ViewTreeObserverOnGlobalLayoutListenerC0912e(i8, this);
        this.f9665G = new ViewOnAttachStateChangeListenerC0913f(i8, this);
        this.f9676x = context;
        this.f9677y = oVar;
        this.f9659A = z5;
        this.f9678z = new l(oVar, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f9661C = i6;
        this.f9662D = i7;
        Resources resources = context.getResources();
        this.f9660B = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9667I = view;
        this.f9663E = new P0(context, null, i6, i7);
        oVar.b(this, context);
    }

    @Override // l.InterfaceC0905E
    public final boolean a() {
        return !this.f9671M && this.f9663E.f10158V.isShowing();
    }

    @Override // l.InterfaceC0901A
    public final void c(o oVar, boolean z5) {
        if (oVar != this.f9677y) {
            return;
        }
        dismiss();
        z zVar = this.f9669K;
        if (zVar != null) {
            zVar.c(oVar, z5);
        }
    }

    @Override // l.InterfaceC0905E
    public final void dismiss() {
        if (a()) {
            this.f9663E.dismiss();
        }
    }

    @Override // l.InterfaceC0901A
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.InterfaceC0905E
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.f9671M || (view = this.f9667I) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f9668J = view;
        P0 p02 = this.f9663E;
        p02.f10158V.setOnDismissListener(this);
        p02.f10148L = this;
        p02.f10157U = true;
        p02.f10158V.setFocusable(true);
        View view2 = this.f9668J;
        boolean z5 = this.f9670L == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9670L = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9664F);
        }
        view2.addOnAttachStateChangeListener(this.f9665G);
        p02.f10147K = view2;
        p02.f10144H = this.f9674P;
        boolean z6 = this.f9672N;
        Context context = this.f9676x;
        l lVar = this.f9678z;
        if (!z6) {
            this.f9673O = w.p(lVar, context, this.f9660B);
            this.f9672N = true;
        }
        p02.r(this.f9673O);
        p02.f10158V.setInputMethodMode(2);
        Rect rect = this.f9820w;
        p02.f10156T = rect != null ? new Rect(rect) : null;
        p02.f();
        C0995x0 c0995x0 = p02.f10161y;
        c0995x0.setOnKeyListener(this);
        if (this.f9675Q) {
            o oVar = this.f9677y;
            if (oVar.f9766m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0995x0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(oVar.f9766m);
                }
                frameLayout.setEnabled(false);
                c0995x0.addHeaderView(frameLayout, null, false);
            }
        }
        p02.o(lVar);
        p02.f();
    }

    @Override // l.InterfaceC0901A
    public final Parcelable g() {
        return null;
    }

    @Override // l.InterfaceC0901A
    public final boolean i(SubMenuC0907G subMenuC0907G) {
        if (subMenuC0907G.hasVisibleItems()) {
            View view = this.f9668J;
            y yVar = new y(this.f9661C, this.f9662D, this.f9676x, view, subMenuC0907G, this.f9659A);
            z zVar = this.f9669K;
            yVar.f9830i = zVar;
            w wVar = yVar.f9831j;
            if (wVar != null) {
                wVar.j(zVar);
            }
            boolean zX = w.x(subMenuC0907G);
            yVar.f9829h = zX;
            w wVar2 = yVar.f9831j;
            if (wVar2 != null) {
                wVar2.r(zX);
            }
            yVar.f9832k = this.f9666H;
            this.f9666H = null;
            this.f9677y.c(false);
            P0 p02 = this.f9663E;
            int width = p02.f10138B;
            int iG = p02.g();
            if ((Gravity.getAbsoluteGravity(this.f9674P, this.f9667I.getLayoutDirection()) & 7) == 5) {
                width += this.f9667I.getWidth();
            }
            if (!yVar.b()) {
                if (yVar.f9827f != null) {
                    yVar.d(width, iG, true, true);
                }
            }
            z zVar2 = this.f9669K;
            if (zVar2 != null) {
                zVar2.f(subMenuC0907G);
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC0901A
    public final void j(z zVar) {
        this.f9669K = zVar;
    }

    @Override // l.InterfaceC0905E
    public final C0995x0 k() {
        return this.f9663E.f10161y;
    }

    @Override // l.InterfaceC0901A
    public final void n(boolean z5) {
        this.f9672N = false;
        l lVar = this.f9678z;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9671M = true;
        this.f9677y.c(true);
        ViewTreeObserver viewTreeObserver = this.f9670L;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9670L = this.f9668J.getViewTreeObserver();
            }
            this.f9670L.removeGlobalOnLayoutListener(this.f9664F);
            this.f9670L = null;
        }
        this.f9668J.removeOnAttachStateChangeListener(this.f9665G);
        PopupWindow.OnDismissListener onDismissListener = this.f9666H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i6 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.w
    public final void q(View view) {
        this.f9667I = view;
    }

    @Override // l.w
    public final void r(boolean z5) {
        this.f9678z.f9749c = z5;
    }

    @Override // l.w
    public final void s(int i6) {
        this.f9674P = i6;
    }

    @Override // l.w
    public final void t(int i6) {
        this.f9663E.f10138B = i6;
    }

    @Override // l.w
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f9666H = onDismissListener;
    }

    @Override // l.w
    public final void v(boolean z5) {
        this.f9675Q = z5;
    }

    @Override // l.w
    public final void w(int i6) {
        this.f9663E.n(i6);
    }

    @Override // l.InterfaceC0901A
    public final void h(Parcelable parcelable) {
    }

    @Override // l.w
    public final void o(o oVar) {
    }
}
