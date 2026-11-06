package i;

import N.C0;
import N.C0090e0;
import N.V;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import h.AbstractC0732a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0880c;
import k.C0882e;
import k.C0887j;
import l.C0918k;
import m.C0947B;
import m.C0965i;
import m.C0976n0;
import m.C0977o;
import m.C0992w;
import m.C0998z;
import m.InterfaceC0980p0;
import m.InterfaceC0982q0;
import m.W;
import m.d1;
import m.i1;
import m.m1;
import m.o1;
import m.p1;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0818s implements l.m, LayoutInflater.Factory2 {
    public static final s.k E0 = new s.k();

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final int[] f9164F0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final boolean f9165G0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Rect f9166A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public M f9167B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public OnBackInvokedDispatcher f9168C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public OnBackInvokedCallback f9169D0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Object f9170F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Context f9171G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Window f9172H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public WindowCallbackC0800B f9173I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final InterfaceC0813m f9174J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public U f9175K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C0887j f9176L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CharSequence f9177M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public InterfaceC0980p0 f9178N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public v f9179O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0820u f9180P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public AbstractC0880c f9181Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ActionBarContextView f9182R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public PopupWindow f9183S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public RunnableC0819t f9184T;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f9187W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ViewGroup f9188X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f9189Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public View f9190Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f9191a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f9192b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f9193c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f9194d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f9195e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f9196f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f9197g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f9198h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public G[] f9199i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public G f9200j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f9201k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f9202l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f9203m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f9204n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Configuration f9205o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f9206p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f9207q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f9208r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f9209s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public C f9210t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public C f9211u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f9212v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f9213w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f9215y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Rect f9216z0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0090e0 f9185U = null;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final boolean f9186V = true;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final RunnableC0819t f9214x0 = new RunnableC0819t(this, 0);

    public H(Context context, Window window, InterfaceC0813m interfaceC0813m, Object obj) {
        AbstractActivityC0812l abstractActivityC0812l;
        this.f9206p0 = -100;
        this.f9171G = context;
        this.f9174J = interfaceC0813m;
        this.f9170F = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0812l)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0812l = (AbstractActivityC0812l) context;
                    break;
                }
            }
            abstractActivityC0812l = null;
            if (abstractActivityC0812l != null) {
                this.f9206p0 = ((H) abstractActivityC0812l.k()).f9206p0;
            }
        }
        if (this.f9206p0 == -100) {
            s.k kVar = E0;
            Integer num = (Integer) kVar.getOrDefault(this.f9170F.getClass().getName(), null);
            if (num != null) {
                this.f9206p0 = num.intValue();
                kVar.remove(this.f9170F.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0998z.c();
    }

    public static J.i o(Context context) {
        J.i iVar;
        J.i iVar2;
        if (Build.VERSION.SDK_INT >= 33 || (iVar = AbstractC0818s.f9339y) == null) {
            return null;
        }
        J.i iVarB = z.b(context.getApplicationContext().getResources().getConfiguration());
        J.j jVar = iVar.f1166a;
        if (((J.k) jVar).f1167a.isEmpty()) {
            iVar2 = J.i.f1165b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i6 = 0;
            while (i6 < ((J.k) iVarB.f1166a).f1167a.size() + ((J.k) jVar).f1167a.size()) {
                Locale locale = i6 < ((J.k) jVar).f1167a.size() ? ((J.k) jVar).f1167a.get(i6) : ((J.k) iVarB.f1166a).f1167a.get(i6 - ((J.k) jVar).f1167a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i6++;
            }
            iVar2 = new J.i(new J.k(J.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return ((J.k) iVar2.f1166a).f1167a.isEmpty() ? iVarB : iVar2;
    }

    public static Configuration s(Context context, int i6, J.i iVar, Configuration configuration, boolean z5) {
        int i7 = i6 != 1 ? i6 != 2 ? z5 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i7 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            z.d(configuration2, iVar);
        }
        return configuration2;
    }

    public final void A(int i6) {
        this.f9213w0 = (1 << i6) | this.f9213w0;
        if (this.f9212v0) {
            return;
        }
        View decorView = this.f9172H.getDecorView();
        WeakHashMap weakHashMap = V.f1964a;
        decorView.postOnAnimation(this.f9214x0);
        this.f9212v0 = true;
    }

    public final int B(Context context, int i6) {
        if (i6 == -100) {
            return -1;
        }
        if (i6 != -1) {
            if (i6 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return x(context).e();
            }
            if (i6 != 1 && i6 != 2) {
                if (i6 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f9211u0 == null) {
                    this.f9211u0 = new C(this, context);
                }
                return this.f9211u0.e();
            }
        }
        return i6;
    }

    public final boolean C() {
        InterfaceC0982q0 interfaceC0982q0;
        d1 d1Var;
        boolean z5 = this.f9201k0;
        this.f9201k0 = false;
        G gY = y(0);
        if (gY.f9160m) {
            if (!z5) {
                r(gY, true);
            }
            return true;
        }
        AbstractC0880c abstractC0880c = this.f9181Q;
        if (abstractC0880c != null) {
            abstractC0880c.a();
            return true;
        }
        z();
        U u5 = this.f9175K;
        if (u5 == null || (interfaceC0982q0 = u5.f9263r) == null || (d1Var = ((i1) interfaceC0982q0).f10283a.f5251k0) == null || d1Var.f10264x == null) {
            return false;
        }
        d1 d1Var2 = ((i1) interfaceC0982q0).f10283a.f5251k0;
        l.q qVar = d1Var2 == null ? null : d1Var2.f10264x;
        if (qVar != null) {
            qVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r3.f9742B.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(i.G r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.H.D(i.G, android.view.KeyEvent):void");
    }

    public final boolean E(G g4, int i6, KeyEvent keyEvent) {
        l.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((g4.f9158k || F(g4, keyEvent)) && (oVar = g4.f9155h) != null) {
            return oVar.performShortcut(i6, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(G g4, KeyEvent keyEvent) {
        InterfaceC0980p0 interfaceC0980p0;
        InterfaceC0980p0 interfaceC0980p02;
        Resources.Theme themeNewTheme;
        InterfaceC0980p0 interfaceC0980p03;
        InterfaceC0980p0 interfaceC0980p04;
        if (this.f9204n0) {
            return false;
        }
        if (g4.f9158k) {
            return true;
        }
        G g6 = this.f9200j0;
        if (g6 != null && g6 != g4) {
            r(g6, false);
        }
        Window.Callback callback = this.f9172H.getCallback();
        int i6 = g4.f9148a;
        if (callback != null) {
            g4.f9154g = callback.onCreatePanelView(i6);
        }
        boolean z5 = i6 == 0 || i6 == 108;
        if (z5 && (interfaceC0980p04 = this.f9178N) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0980p04;
            actionBarOverlayLayout.k();
            ((i1) actionBarOverlayLayout.f5161A).f10294l = true;
        }
        if (g4.f9154g == null) {
            l.o oVar = g4.f9155h;
            if (oVar == null || g4.f9162o) {
                if (oVar == null) {
                    Context context = this.f9171G;
                    if ((i6 == 0 || i6 == 108) && this.f9178N != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.xo.anilab.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.xo.anilab.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.xo.anilab.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C0882e c0882e = new C0882e(context, 0);
                            c0882e.getTheme().setTo(themeNewTheme);
                            context = c0882e;
                        }
                    }
                    l.o oVar2 = new l.o(context);
                    oVar2.f9758e = this;
                    l.o oVar3 = g4.f9155h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(g4.f9156i);
                        }
                        g4.f9155h = oVar2;
                        C0918k c0918k = g4.f9156i;
                        if (c0918k != null) {
                            oVar2.b(c0918k, oVar2.f9754a);
                        }
                    }
                    if (g4.f9155h == null) {
                        return false;
                    }
                }
                if (z5 && (interfaceC0980p02 = this.f9178N) != null) {
                    if (this.f9179O == null) {
                        this.f9179O = new v(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC0980p02).l(g4.f9155h, this.f9179O);
                }
                g4.f9155h.w();
                if (!callback.onCreatePanelMenu(i6, g4.f9155h)) {
                    l.o oVar4 = g4.f9155h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(g4.f9156i);
                        }
                        g4.f9155h = null;
                    }
                    if (z5 && (interfaceC0980p0 = this.f9178N) != null) {
                        ((ActionBarOverlayLayout) interfaceC0980p0).l(null, this.f9179O);
                    }
                    return false;
                }
                g4.f9162o = false;
            }
            g4.f9155h.w();
            Bundle bundle = g4.f9163p;
            if (bundle != null) {
                g4.f9155h.s(bundle);
                g4.f9163p = null;
            }
            if (!callback.onPreparePanel(0, g4.f9154g, g4.f9155h)) {
                if (z5 && (interfaceC0980p03 = this.f9178N) != null) {
                    ((ActionBarOverlayLayout) interfaceC0980p03).l(null, this.f9179O);
                }
                g4.f9155h.v();
                return false;
            }
            g4.f9155h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            g4.f9155h.v();
        }
        g4.f9158k = true;
        g4.f9159l = false;
        this.f9200j0 = g4;
        return true;
    }

    public final void G() {
        if (this.f9187W) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedCallback onBackInvokedCallbackB;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z5 = false;
            if (this.f9168C0 != null && (y(0).f9160m || this.f9181Q != null)) {
                z5 = true;
            }
            if (z5 && this.f9169D0 == null) {
                onBackInvokedCallbackB = AbstractC0799A.b(this.f9168C0, this);
            } else {
                if (z5 || (onBackInvokedCallback = this.f9169D0) == null) {
                    return;
                }
                AbstractC0799A.c(this.f9168C0, onBackInvokedCallback);
                onBackInvokedCallbackB = null;
            }
            this.f9169D0 = onBackInvokedCallbackB;
        }
    }

    public final int I(C0 c02, Rect rect) {
        boolean z5;
        boolean z6;
        int i6;
        int iD = c02 != null ? c02.d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f9182R;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9182R.getLayoutParams();
            if (this.f9182R.isShown()) {
                if (this.f9216z0 == null) {
                    this.f9216z0 = new Rect();
                    this.f9166A0 = new Rect();
                }
                Rect rect2 = this.f9216z0;
                Rect rect3 = this.f9166A0;
                if (c02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c02.b(), c02.d(), c02.c(), c02.a());
                }
                ViewGroup viewGroup = this.f9188X;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z7 = p1.f10363a;
                    o1.a(viewGroup, rect2, rect3);
                } else {
                    if (!p1.f10363a) {
                        p1.f10363a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            p1.f10364b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                p1.f10364b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = p1.f10364b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect2, rect3);
                        } catch (Exception e6) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e6);
                        }
                    }
                }
                int i7 = rect2.top;
                int i8 = rect2.left;
                int i9 = rect2.right;
                ViewGroup viewGroup2 = this.f9188X;
                WeakHashMap weakHashMap = V.f1964a;
                C0 c0A = N.J.a(viewGroup2);
                int iB = c0A == null ? 0 : c0A.b();
                int iC = c0A == null ? 0 : c0A.c();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z6 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z6 = true;
                }
                Context context = this.f9171G;
                if (i7 <= 0 || this.f9190Z != null) {
                    View view = this.f9190Z;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            this.f9190Z.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(context);
                    this.f9190Z = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    this.f9188X.addView(this.f9190Z, -1, layoutParams);
                }
                View view3 = this.f9190Z;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f9190Z;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        Object obj = E.f.f379a;
                        i6 = com.xo.anilab.R.color.abc_decor_view_status_guard_light;
                    } else {
                        Object obj2 = E.f.f379a;
                        i6 = com.xo.anilab.R.color.abc_decor_view_status_guard;
                    }
                    view4.setBackgroundColor(E.b.a(context, i6));
                }
                if (!this.f9195e0 && z) {
                    iD = 0;
                }
                z5 = z;
                z = z6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z5 = false;
            } else {
                z5 = false;
                z = false;
            }
            if (z) {
                this.f9182R.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f9190Z;
        if (view5 != null) {
            view5.setVisibility(z5 ? 0 : 8);
        }
        return iD;
    }

    @Override // i.AbstractC0818s
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f9171G);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof H) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // i.AbstractC0818s
    public final void c() throws IllegalAccessException {
        String strG;
        this.f9202l0 = true;
        m(false, true);
        w();
        Object obj = this.f9170F;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strG = M4.B.g(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new IllegalArgumentException(e6);
                }
            } catch (IllegalArgumentException unused) {
                strG = null;
            }
            if (strG != null) {
                U u5 = this.f9175K;
                if (u5 == null) {
                    this.f9215y0 = true;
                } else {
                    u5.D(true);
                }
            }
            synchronized (AbstractC0818s.f9335D) {
                AbstractC0818s.e(this);
                AbstractC0818s.f9334C.add(new WeakReference(this));
            }
        }
        this.f9205o0 = new Configuration(this.f9171G.getResources().getConfiguration());
        this.f9203m0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // i.AbstractC0818s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9170F
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = i.AbstractC0818s.f9335D
            monitor-enter(r0)
            i.AbstractC0818s.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f9212v0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f9172H
            android.view.View r0 = r0.getDecorView()
            i.t r1 = r3.f9214x0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f9204n0 = r0
            int r0 = r3.f9206p0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f9170F
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            s.k r0 = i.H.E0
            java.lang.Object r1 = r3.f9170F
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f9206p0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            s.k r0 = i.H.E0
            java.lang.Object r1 = r3.f9170F
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            i.C r0 = r3.f9210t0
            if (r0 == 0) goto L63
            r0.b()
        L63:
            i.C r0 = r3.f9211u0
            if (r0 == 0) goto L6a
            r0.b()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.H.d():void");
    }

    @Override // i.AbstractC0818s
    public final boolean f(int i6) {
        if (i6 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i6 = 108;
        } else if (i6 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i6 = 109;
        }
        if (this.f9197g0 && i6 == 108) {
            return false;
        }
        if (this.f9193c0 && i6 == 1) {
            this.f9193c0 = false;
        }
        if (i6 == 1) {
            G();
            this.f9197g0 = true;
            return true;
        }
        if (i6 == 2) {
            G();
            this.f9191a0 = true;
            return true;
        }
        if (i6 == 5) {
            G();
            this.f9192b0 = true;
            return true;
        }
        if (i6 == 10) {
            G();
            this.f9195e0 = true;
            return true;
        }
        if (i6 == 108) {
            G();
            this.f9193c0 = true;
            return true;
        }
        if (i6 != 109) {
            return this.f9172H.requestFeature(i6);
        }
        G();
        this.f9194d0 = true;
        return true;
    }

    @Override // i.AbstractC0818s
    public final void g(int i6) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f9188X.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f9171G).inflate(i6, viewGroup);
        this.f9173I.a(this.f9172H.getCallback());
    }

    @Override // i.AbstractC0818s
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f9188X.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f9173I.a(this.f9172H.getCallback());
    }

    @Override // l.m
    public final boolean i(l.o oVar, MenuItem menuItem) {
        G g4;
        Window.Callback callback = this.f9172H.getCallback();
        if (callback != null && !this.f9204n0) {
            l.o oVarK = oVar.k();
            G[] gArr = this.f9199i0;
            int length = gArr != null ? gArr.length : 0;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    g4 = gArr[i6];
                    if (g4 != null && g4.f9155h == oVarK) {
                        break;
                    }
                    i6++;
                } else {
                    g4 = null;
                    break;
                }
            }
            if (g4 != null) {
                return callback.onMenuItemSelected(g4.f9148a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // l.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(l.o r6) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.H.j(l.o):void");
    }

    @Override // i.AbstractC0818s
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f9188X.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f9173I.a(this.f9172H.getCallback());
    }

    @Override // i.AbstractC0818s
    public final void l(CharSequence charSequence) {
        this.f9177M = charSequence;
        InterfaceC0980p0 interfaceC0980p0 = this.f9178N;
        if (interfaceC0980p0 != null) {
            interfaceC0980p0.setWindowTitle(charSequence);
            return;
        }
        U u5 = this.f9175K;
        if (u5 != null) {
            u5.F(charSequence);
            return;
        }
        TextView textView = this.f9189Y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(boolean r17, boolean r18) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.H.m(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f9172H
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof i.WindowCallbackC0800B
            if (r2 != 0) goto L7a
            i.B r1 = new i.B
            r1.<init>(r7, r0)
            r7.f9173I = r1
            r8.setCallback(r1)
            int[] r0 = i.H.f9164F0
            android.content.Context r1 = r7.f9171G
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            m.z r4 = m.C0998z.a()
            monitor-enter(r4)
            m.R0 r5 = r4.f10429a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.f(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f9172H = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f9168C0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f9169D0
            if (r0 == 0) goto L5f
            i.AbstractC0799A.c(r8, r0)
            r7.f9169D0 = r2
        L5f:
            java.lang.Object r8 = r7.f9170F
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = i.AbstractC0799A.a(r8)
            r7.f9168C0 = r8
            goto L76
        L74:
            r7.f9168C0 = r2
        L76:
            r7.H()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.H.n(android.view.Window):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View k5;
        M m5;
        if (this.f9167B0 == null) {
            int[] iArr = AbstractC0732a.f8572j;
            Context context2 = this.f9171G;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                m5 = new M();
            } else {
                try {
                    this.f9167B0 = (M) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    m5 = new M();
                    this.f9167B0 = m5;
                }
            }
            this.f9167B0 = m5;
        }
        M m6 = this.f9167B0;
        int i6 = m1.f10333a;
        m6.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8586x, 0, 0);
        byte b6 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context c0882e = (resourceId == 0 || ((context instanceof C0882e) && ((C0882e) context).f9569a == resourceId)) ? context : new C0882e(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b6 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b6 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b6 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b6 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b6 = -1;
                }
                break;
            case -658531749:
                b6 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b6 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b6 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b6 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b6 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b6 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b6 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b6 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b6 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b6 = -1;
                break;
        }
        View view2 = null;
        switch (b6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                k5 = new m.K(c0882e, attributeSet);
                break;
            case 1:
                k5 = new C0992w(c0882e, attributeSet);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                k5 = new m.G(c0882e, attributeSet);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                k5 = m6.e(c0882e, attributeSet);
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                k5 = new m.D(c0882e, attributeSet, com.xo.anilab.R.attr.imageButtonStyle);
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                k5 = new m.M(c0882e, attributeSet);
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                k5 = new W(c0882e, attributeSet);
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                k5 = m6.d(c0882e, attributeSet);
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                k5 = new C0976n0(c0882e, attributeSet);
                break;
            case 9:
                k5 = new m.F(c0882e, attributeSet, 0);
                break;
            case 10:
                k5 = m6.a(c0882e, attributeSet);
                break;
            case 11:
                k5 = m6.c(c0882e, attributeSet);
                break;
            case 12:
                k5 = new C0947B(c0882e, attributeSet);
                break;
            case 13:
                k5 = m6.b(c0882e, attributeSet);
                break;
            default:
                k5 = null;
                break;
        }
        if (k5 == null && context != c0882e) {
            Object[] objArr = m6.f9231a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0882e;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr = M.f9229g;
                        if (i7 < 3) {
                            View viewF = m6.f(c0882e, str, strArr[i7]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i7++;
                            }
                        }
                    }
                } else {
                    View viewF2 = m6.f(c0882e, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            k5 = view2;
        }
        if (k5 != null) {
            Context context3 = k5.getContext();
            if ((context3 instanceof ContextWrapper) && k5.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, M.f9225c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    k5.setOnClickListener(new L(k5, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c0882e.obtainStyledAttributes(attributeSet, M.f9226d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z5 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = V.f1964a;
                    new N.D(com.xo.anilab.R.id.tag_accessibility_heading, 3).b(k5, Boolean.valueOf(z5));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c0882e.obtainStyledAttributes(attributeSet, M.f9227e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    V.m(k5, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c0882e.obtainStyledAttributes(attributeSet, M.f9228f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z6 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = V.f1964a;
                    new N.D(com.xo.anilab.R.id.tag_screen_reader_focusable, 0).b(k5, Boolean.valueOf(z6));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return k5;
    }

    public final void p(int i6, G g4, l.o oVar) {
        if (oVar == null) {
            if (g4 == null && i6 >= 0) {
                G[] gArr = this.f9199i0;
                if (i6 < gArr.length) {
                    g4 = gArr[i6];
                }
            }
            if (g4 != null) {
                oVar = g4.f9155h;
            }
        }
        if ((g4 == null || g4.f9160m) && !this.f9204n0) {
            WindowCallbackC0800B windowCallbackC0800B = this.f9173I;
            Window.Callback callback = this.f9172H.getCallback();
            windowCallbackC0800B.getClass();
            try {
                windowCallbackC0800B.f9139z = true;
                callback.onPanelClosed(i6, oVar);
            } finally {
                windowCallbackC0800B.f9139z = false;
            }
        }
    }

    public final void q(l.o oVar) {
        C0977o c0977o;
        if (this.f9198h0) {
            return;
        }
        this.f9198h0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f9178N;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.f5161A).f10283a.f5257w;
        if (actionMenuView != null && (c0977o = actionMenuView.f5193P) != null) {
            c0977o.f();
            C0965i c0965i = c0977o.f10354Q;
            if (c0965i != null && c0965i.b()) {
                c0965i.f9831j.dismiss();
            }
        }
        Window.Callback callback = this.f9172H.getCallback();
        if (callback != null && !this.f9204n0) {
            callback.onPanelClosed(108, oVar);
        }
        this.f9198h0 = false;
    }

    public final void r(G g4, boolean z5) {
        F f6;
        InterfaceC0980p0 interfaceC0980p0;
        C0977o c0977o;
        if (z5 && g4.f9148a == 0 && (interfaceC0980p0 = this.f9178N) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0980p0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.f5161A).f10283a.f5257w;
            if (actionMenuView != null && (c0977o = actionMenuView.f5193P) != null && c0977o.k()) {
                q(g4.f9155h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f9171G.getSystemService("window");
        if (windowManager != null && g4.f9160m && (f6 = g4.f9152e) != null) {
            windowManager.removeView(f6);
            if (z5) {
                p(g4.f9148a, g4, null);
            }
        }
        g4.f9158k = false;
        g4.f9159l = false;
        g4.f9160m = false;
        g4.f9153f = null;
        g4.f9161n = true;
        if (this.f9200j0 == g4) {
            this.f9200j0 = null;
        }
        if (g4.f9148a == 0) {
            H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.H.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i6) {
        G gY = y(i6);
        if (gY.f9155h != null) {
            Bundle bundle = new Bundle();
            gY.f9155h.t(bundle);
            if (bundle.size() > 0) {
                gY.f9163p = bundle;
            }
            gY.f9155h.w();
            gY.f9155h.clear();
        }
        gY.f9162o = true;
        gY.f9161n = true;
        if ((i6 == 108 || i6 == 0) && this.f9178N != null) {
            G gY2 = y(0);
            gY2.f9158k = false;
            F(gY2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.f9187W) {
            return;
        }
        int[] iArr = AbstractC0732a.f8572j;
        Context context = this.f9171G;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.f9196f0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.f9172H.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f9197g0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.f9195e0 ? com.xo.anilab.R.layout.abc_screen_simple_overlay_action_mode : com.xo.anilab.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f9196f0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.xo.anilab.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f9194d0 = false;
            this.f9193c0 = false;
        } else if (this.f9193c0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.xo.anilab.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0882e(context, typedValue.resourceId) : context).inflate(com.xo.anilab.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0980p0 interfaceC0980p0 = (InterfaceC0980p0) viewGroup.findViewById(com.xo.anilab.R.id.decor_content_parent);
            this.f9178N = interfaceC0980p0;
            interfaceC0980p0.setWindowCallback(this.f9172H.getCallback());
            if (this.f9194d0) {
                ((ActionBarOverlayLayout) this.f9178N).j(109);
            }
            if (this.f9191a0) {
                ((ActionBarOverlayLayout) this.f9178N).j(2);
            }
            if (this.f9192b0) {
                ((ActionBarOverlayLayout) this.f9178N).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f9193c0 + ", windowActionBarOverlay: " + this.f9194d0 + ", android:windowIsFloating: " + this.f9196f0 + ", windowActionModeOverlay: " + this.f9195e0 + ", windowNoTitle: " + this.f9197g0 + " }");
        }
        C0820u c0820u = new C0820u(this);
        WeakHashMap weakHashMap = V.f1964a;
        N.I.u(viewGroup, c0820u);
        if (this.f9178N == null) {
            this.f9189Y = (TextView) viewGroup.findViewById(com.xo.anilab.R.id.title);
        }
        boolean z5 = p1.f10363a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e6) {
            e = e6;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e7) {
            e = e7;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.xo.anilab.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f9172H.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f9172H.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0820u(this));
        this.f9188X = viewGroup;
        Object obj = this.f9170F;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f9177M;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0980p0 interfaceC0980p02 = this.f9178N;
            if (interfaceC0980p02 != null) {
                interfaceC0980p02.setWindowTitle(title);
            } else {
                U u5 = this.f9175K;
                if (u5 != null) {
                    u5.F(title);
                } else {
                    TextView textView = this.f9189Y;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f9188X.findViewById(R.id.content);
        View decorView = this.f9172H.getDecorView();
        contentFrameLayout2.f5207C.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f9187W = true;
        G gY = y(0);
        if (this.f9204n0 || gY.f9155h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f9172H == null) {
            Object obj = this.f9170F;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f9172H == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final E x(Context context) {
        if (this.f9210t0 == null) {
            if (C0803c.f9275A == null) {
                Context applicationContext = context.getApplicationContext();
                C0803c.f9275A = new C0803c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f9210t0 = new C(this, C0803c.f9275A);
        }
        return this.f9210t0;
    }

    public final G y(int i6) {
        G[] gArr = this.f9199i0;
        if (gArr == null || gArr.length <= i6) {
            G[] gArr2 = new G[i6 + 1];
            if (gArr != null) {
                System.arraycopy(gArr, 0, gArr2, 0, gArr.length);
            }
            this.f9199i0 = gArr2;
            gArr = gArr2;
        }
        G g4 = gArr[i6];
        if (g4 != null) {
            return g4;
        }
        G g6 = new G();
        g6.f9148a = i6;
        g6.f9161n = false;
        gArr[i6] = g6;
        return g6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            r3 = this;
            r3.v()
            boolean r0 = r3.f9193c0
            if (r0 == 0) goto L33
            i.U r0 = r3.f9175K
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            java.lang.Object r0 = r3.f9170F
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            i.U r1 = new i.U
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f9194d0
            r1.<init>(r0, r2)
        L1b:
            r3.f9175K = r1
            goto L2a
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2a
            i.U r1 = new i.U
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L1b
        L2a:
            i.U r0 = r3.f9175K
            if (r0 == 0) goto L33
            boolean r1 = r3.f9215y0
            r0.D(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.H.z():void");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
