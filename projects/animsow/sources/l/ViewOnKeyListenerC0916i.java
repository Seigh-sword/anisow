package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0995x0;
import m.M0;
import m.P0;

/* JADX INFO: renamed from: l.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0916i extends w implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f9713A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f9714B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Handler f9715C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0912e f9718F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0913f f9719G;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public View f9723K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View f9724L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f9725M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f9726N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f9727O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f9728P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f9729Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f9731S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public z f9732T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ViewTreeObserver f9733U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public PopupWindow.OnDismissListener f9734V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f9735W;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f9736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f9738z;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f9716D = new ArrayList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f9717E = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final L3.c f9720H = new L3.c(2, this);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9721I = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f9722J = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f9730R = false;

    public ViewOnKeyListenerC0916i(Context context, View view, int i6, int i7, boolean z5) {
        this.f9718F = new ViewTreeObserverOnGlobalLayoutListenerC0912e(i, this);
        this.f9719G = new ViewOnAttachStateChangeListenerC0913f(i, this);
        this.f9736x = context;
        this.f9723K = view;
        this.f9738z = i6;
        this.f9713A = i7;
        this.f9714B = z5;
        this.f9725M = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f9737y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9715C = new Handler();
    }

    @Override // l.InterfaceC0905E
    public final boolean a() {
        ArrayList arrayList = this.f9717E;
        return arrayList.size() > 0 && ((C0915h) arrayList.get(0)).f9710a.f10158V.isShowing();
    }

    @Override // l.InterfaceC0901A
    public final void c(o oVar, boolean z5) {
        ArrayList arrayList = this.f9717E;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (oVar == ((C0915h) arrayList.get(i6)).f9711b) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 < 0) {
            return;
        }
        int i7 = i6 + 1;
        if (i7 < arrayList.size()) {
            ((C0915h) arrayList.get(i7)).f9711b.c(false);
        }
        C0915h c0915h = (C0915h) arrayList.remove(i6);
        c0915h.f9711b.r(this);
        boolean z6 = this.f9735W;
        P0 p02 = c0915h.f9710a;
        if (z6) {
            M0.b(p02.f10158V, null);
            p02.f10158V.setAnimationStyle(0);
        }
        p02.dismiss();
        int size2 = arrayList.size();
        this.f9725M = size2 > 0 ? ((C0915h) arrayList.get(size2 - 1)).f9712c : this.f9723K.getLayoutDirection() == 1 ? 0 : 1;
        if (size2 != 0) {
            if (z5) {
                ((C0915h) arrayList.get(0)).f9711b.c(false);
                return;
            }
            return;
        }
        dismiss();
        z zVar = this.f9732T;
        if (zVar != null) {
            zVar.c(oVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f9733U;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f9733U.removeGlobalOnLayoutListener(this.f9718F);
            }
            this.f9733U = null;
        }
        this.f9724L.removeOnAttachStateChangeListener(this.f9719G);
        this.f9734V.onDismiss();
    }

    @Override // l.InterfaceC0905E
    public final void dismiss() {
        ArrayList arrayList = this.f9717E;
        int size = arrayList.size();
        if (size > 0) {
            C0915h[] c0915hArr = (C0915h[]) arrayList.toArray(new C0915h[size]);
            for (int i6 = size - 1; i6 >= 0; i6--) {
                C0915h c0915h = c0915hArr[i6];
                if (c0915h.f9710a.f10158V.isShowing()) {
                    c0915h.f9710a.dismiss();
                }
            }
        }
    }

    @Override // l.InterfaceC0901A
    public final boolean e() {
        return false;
    }

    @Override // l.InterfaceC0905E
    public final void f() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f9716D;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y((o) it.next());
        }
        arrayList.clear();
        View view = this.f9723K;
        this.f9724L = view;
        if (view != null) {
            boolean z5 = this.f9733U == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f9733U = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f9718F);
            }
            this.f9724L.addOnAttachStateChangeListener(this.f9719G);
        }
    }

    @Override // l.InterfaceC0901A
    public final Parcelable g() {
        return null;
    }

    @Override // l.InterfaceC0901A
    public final boolean i(SubMenuC0907G subMenuC0907G) {
        for (C0915h c0915h : this.f9717E) {
            if (subMenuC0907G == c0915h.f9711b) {
                c0915h.f9710a.f10161y.requestFocus();
                return true;
            }
        }
        if (!subMenuC0907G.hasVisibleItems()) {
            return false;
        }
        o(subMenuC0907G);
        z zVar = this.f9732T;
        if (zVar != null) {
            zVar.f(subMenuC0907G);
        }
        return true;
    }

    @Override // l.InterfaceC0901A
    public final void j(z zVar) {
        this.f9732T = zVar;
    }

    @Override // l.InterfaceC0905E
    public final C0995x0 k() {
        ArrayList arrayList = this.f9717E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0915h) arrayList.get(arrayList.size() - 1)).f9710a.f10161y;
    }

    @Override // l.InterfaceC0901A
    public final void n(boolean z5) {
        Iterator it = this.f9717E.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0915h) it.next()).f9710a.f10161y.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.w
    public final void o(o oVar) {
        oVar.b(this, this.f9736x);
        if (a()) {
            y(oVar);
        } else {
            this.f9716D.add(oVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0915h c0915h;
        ArrayList arrayList = this.f9717E;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                c0915h = null;
                break;
            }
            c0915h = (C0915h) arrayList.get(i6);
            if (!c0915h.f9710a.f10158V.isShowing()) {
                break;
            } else {
                i6++;
            }
        }
        if (c0915h != null) {
            c0915h.f9711b.c(false);
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
        if (this.f9723K != view) {
            this.f9723K = view;
            this.f9722J = Gravity.getAbsoluteGravity(this.f9721I, view.getLayoutDirection());
        }
    }

    @Override // l.w
    public final void r(boolean z5) {
        this.f9730R = z5;
    }

    @Override // l.w
    public final void s(int i6) {
        if (this.f9721I != i6) {
            this.f9721I = i6;
            this.f9722J = Gravity.getAbsoluteGravity(i6, this.f9723K.getLayoutDirection());
        }
    }

    @Override // l.w
    public final void t(int i6) {
        this.f9726N = true;
        this.f9728P = i6;
    }

    @Override // l.w
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f9734V = onDismissListener;
    }

    @Override // l.w
    public final void v(boolean z5) {
        this.f9731S = z5;
    }

    @Override // l.w
    public final void w(int i6) {
        this.f9727O = true;
        this.f9729Q = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(l.o r18) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnKeyListenerC0916i.y(l.o):void");
    }

    @Override // l.InterfaceC0901A
    public final void h(Parcelable parcelable) {
    }
}
