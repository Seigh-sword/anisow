package i;

import N.C0090e0;
import N.V;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.xo.anilab.R;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.AbstractC0880c;
import k.C0882e;
import k.C0883f;

/* JADX INFO: renamed from: i.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0800B implements Window.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ H f9135A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Window.Callback f9136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9139z;

    public WindowCallbackC0800B(H h4, Window.Callback callback) {
        this.f9135A = h4;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f9136w = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f9137x = true;
            callback.onContentChanged();
        } finally {
            this.f9137x = false;
        }
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f9136w.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f9136w.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f9136w.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f9136w.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f9138y;
        Window.Callback callback = this.f9136w;
        return z5 ? callback.dispatchKeyEvent(keyEvent) : this.f9135A.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        T t5;
        l.o oVar;
        if (this.f9136w.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        H h4 = this.f9135A;
        h4.z();
        U u5 = h4.f9175K;
        if (u5 != null && (t5 = u5.f9267v) != null && (oVar = t5.f9245z) != null) {
            oVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
            if (oVar.performShortcut(keyCode, keyEvent, 0)) {
                return true;
            }
        }
        G g4 = h4.f9200j0;
        if (g4 != null && h4.E(g4, keyEvent.getKeyCode(), keyEvent)) {
            G g6 = h4.f9200j0;
            if (g6 == null) {
                return true;
            }
            g6.f9159l = true;
            return true;
        }
        if (h4.f9200j0 == null) {
            G gY = h4.y(0);
            h4.F(gY, keyEvent);
            boolean zE = h4.E(gY, keyEvent.getKeyCode(), keyEvent);
            gY.f9158k = false;
            if (zE) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f9136w.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f9136w.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f9136w.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f9136w.onDetachedFromWindow();
    }

    public final boolean f(int i6, Menu menu) {
        return this.f9136w.onMenuOpened(i6, menu);
    }

    public final void g(int i6, Menu menu) {
        this.f9136w.onPanelClosed(i6, menu);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z5) {
        k.o.a(this.f9136w, z5);
    }

    public final void i(List list, Menu menu, int i6) {
        k.n.a(this.f9136w, list, menu, i6);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f9136w.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z5) {
        this.f9136w.onWindowFocusChanged(z5);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f9137x) {
            this.f9136w.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i6, Menu menu) {
        if (i6 != 0 || (menu instanceof l.o)) {
            return this.f9136w.onCreatePanelMenu(i6, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i6) {
        return this.f9136w.onCreatePanelView(i6);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        return this.f9136w.onMenuItemSelected(i6, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i6, Menu menu) {
        f(i6, menu);
        H h4 = this.f9135A;
        if (i6 == 108) {
            h4.z();
            U u5 = h4.f9175K;
            if (u5 != null && true != u5.f9270y) {
                u5.f9270y = true;
                ArrayList arrayList = u5.f9271z;
                if (arrayList.size() > 0) {
                    AbstractC0628i.p(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            h4.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i6, Menu menu) {
        if (this.f9139z) {
            this.f9136w.onPanelClosed(i6, menu);
            return;
        }
        g(i6, menu);
        H h4 = this.f9135A;
        if (i6 != 108) {
            if (i6 != 0) {
                h4.getClass();
                return;
            }
            G gY = h4.y(i6);
            if (gY.f9160m) {
                h4.r(gY, false);
                return;
            }
            return;
        }
        h4.z();
        U u5 = h4.f9175K;
        if (u5 == null || !u5.f9270y) {
            return;
        }
        u5.f9270y = false;
        ArrayList arrayList = u5.f9271z;
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC0628i.p(arrayList.get(0));
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i6, View view, Menu menu) {
        l.o oVar = menu instanceof l.o ? (l.o) menu : null;
        if (i6 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f9777x = true;
        }
        boolean zOnPreparePanel = this.f9136w.onPreparePanel(i6, view, menu);
        if (oVar != null) {
            oVar.f9777x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i6) {
        l.o oVar = this.f9135A.y(0).f9155h;
        if (oVar != null) {
            i(list, oVar, i6);
        } else {
            i(list, menu, i6);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f9136w.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.m.a(this.f9136w, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i6) {
        ViewGroup viewGroup;
        H h4 = this.f9135A;
        if (!h4.f9186V || i6 != 0) {
            return k.m.b(this.f9136w, callback, i6);
        }
        Context context = h4.f9171G;
        P0.h hVar = new P0.h();
        hVar.f2408b = context;
        hVar.f2407a = callback;
        hVar.f2409c = new ArrayList();
        hVar.f2410d = new s.k();
        AbstractC0880c abstractC0880c = h4.f9181Q;
        if (abstractC0880c != null) {
            abstractC0880c.a();
        }
        x xVar = new x(h4, hVar);
        h4.z();
        U u5 = h4.f9175K;
        if (u5 != null) {
            T t5 = u5.f9267v;
            if (t5 != null) {
                t5.a();
            }
            u5.f9261p.setHideOnContentScrollEnabled(false);
            u5.f9264s.e();
            T t6 = new T(u5, u5.f9264s.getContext(), xVar);
            l.o oVar = t6.f9245z;
            oVar.w();
            try {
                if (t6.f9241A.a(t6, oVar)) {
                    u5.f9267v = t6;
                    t6.g();
                    u5.f9264s.c(t6);
                    u5.A(true);
                } else {
                    t6 = null;
                }
                h4.f9181Q = t6;
            } finally {
                oVar.v();
            }
        }
        if (h4.f9181Q == null) {
            C0090e0 c0090e0 = h4.f9185U;
            if (c0090e0 != null) {
                c0090e0.b();
            }
            AbstractC0880c abstractC0880c2 = h4.f9181Q;
            if (abstractC0880c2 != null) {
                abstractC0880c2.a();
            }
            if (h4.f9174J != null) {
                boolean z5 = h4.f9204n0;
            }
            if (h4.f9182R == null) {
                boolean z6 = h4.f9196f0;
                Context context2 = h4.f9171G;
                if (z6) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context2.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C0882e c0882e = new C0882e(context2, 0);
                        c0882e.getTheme().setTo(themeNewTheme);
                        context2 = c0882e;
                    }
                    h4.f9182R = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    h4.f9183S = popupWindow;
                    T.l.d(popupWindow, 2);
                    h4.f9183S.setContentView(h4.f9182R);
                    h4.f9183S.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    h4.f9182R.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    h4.f9183S.setHeight(-2);
                    h4.f9184T = new RunnableC0819t(h4, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) h4.f9188X.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        h4.z();
                        U u6 = h4.f9175K;
                        Context contextB = u6 != null ? u6.B() : null;
                        if (contextB != null) {
                            context2 = contextB;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        h4.f9182R = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (h4.f9182R != null) {
                C0090e0 c0090e02 = h4.f9185U;
                if (c0090e02 != null) {
                    c0090e02.b();
                }
                h4.f9182R.e();
                Context context3 = h4.f9182R.getContext();
                ActionBarContextView actionBarContextView = h4.f9182R;
                C0883f c0883f = new C0883f();
                c0883f.f9578y = context3;
                c0883f.f9579z = actionBarContextView;
                c0883f.f9574A = xVar;
                l.o oVar2 = new l.o(actionBarContextView.getContext());
                oVar2.f9765l = 1;
                c0883f.f9577D = oVar2;
                oVar2.f9758e = c0883f;
                if (xVar.f9347a.a(c0883f, oVar2)) {
                    c0883f.g();
                    h4.f9182R.c(c0883f);
                    h4.f9181Q = c0883f;
                    if (h4.f9187W && (viewGroup = h4.f9188X) != null && viewGroup.isLaidOut()) {
                        h4.f9182R.setAlpha(0.0f);
                        C0090e0 c0090e0A = V.a(h4.f9182R);
                        c0090e0A.a(1.0f);
                        h4.f9185U = c0090e0A;
                        c0090e0A.d(new w(1, h4));
                    } else {
                        h4.f9182R.setAlpha(1.0f);
                        h4.f9182R.setVisibility(0);
                        if (h4.f9182R.getParent() instanceof View) {
                            View view = (View) h4.f9182R.getParent();
                            WeakHashMap weakHashMap = V.f1964a;
                            N.G.c(view);
                        }
                    }
                    if (h4.f9183S != null) {
                        h4.f9172H.getDecorView().post(h4.f9184T);
                    }
                } else {
                    h4.f9181Q = null;
                }
            }
            h4.H();
            h4.f9181Q = h4.f9181Q;
        }
        h4.H();
        AbstractC0880c abstractC0880c3 = h4.f9181Q;
        if (abstractC0880c3 != null) {
            return hVar.e(abstractC0880c3);
        }
        return null;
    }
}
