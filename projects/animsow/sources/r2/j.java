package R2;

import N.V;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.xo.anilab.R;
import j0.C0840b;
import j0.C0841c;
import java.util.List;
import java.util.WeakHashMap;
import l1.I;
import m2.C0;
import s2.AbstractC1301a;
import y2.C1503e;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f2974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f2975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f2976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f2977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f2978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f2979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f2980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2981k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f2989s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0840b f2965u = AbstractC1301a.f12618b;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f2966v = AbstractC1301a.f12617a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0841c f2967w = AbstractC1301a.f12620d;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f2969y = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f2970z = j.class.getSimpleName();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Handler f2968x = new Handler(Looper.getMainLooper(), new I(1));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f2982l = new f(this, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f2990t = new g(this);

    public j(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f2977g = viewGroup;
        this.f2980j = snackbarContentLayout2;
        this.f2978h = context;
        H2.m.c(context, H2.m.f1055a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f2969y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        i iVar = (i) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f2979i = iVar;
        iVar.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = iVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f7296x.setTextColor(C0.l(actionTextColorAlpha, C0.f(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f7296x.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(iVar.getMaxInlineActionWidth());
        iVar.addView(snackbarContentLayout);
        WeakHashMap weakHashMap = V.f1964a;
        iVar.setAccessibilityLiveRegion(1);
        iVar.setImportantForAccessibility(1);
        iVar.setFitsSystemWindows(true);
        N.I.u(iVar, new K1.b(12, this));
        V.l(iVar, new C1503e(4, this));
        this.f2989s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f2973c = Y2.b.z(context, R.attr.motionDurationLong2, 250);
        this.f2971a = Y2.b.z(context, R.attr.motionDurationLong2, 150);
        this.f2972b = Y2.b.z(context, R.attr.motionDurationMedium1, 75);
        this.f2974d = Y2.b.A(context, R.attr.motionEasingEmphasizedInterpolator, f2966v);
        this.f2976f = Y2.b.A(context, R.attr.motionEasingEmphasizedInterpolator, f2967w);
        this.f2975e = Y2.b.A(context, R.attr.motionEasingEmphasizedInterpolator, f2965u);
    }

    public final void a(int i6) {
        m mVar;
        n nVarB = n.b();
        g gVar = this.f2990t;
        synchronized (nVarB.f2997a) {
            try {
                if (nVarB.c(gVar)) {
                    mVar = nVarB.f2999c;
                } else {
                    m mVar2 = nVarB.f3000d;
                    if (mVar2 != null && gVar != null && mVar2.f2993a.get() == gVar) {
                        mVar = nVarB.f3000d;
                    }
                }
                nVarB.a(mVar, i6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        n nVarB = n.b();
        g gVar = this.f2990t;
        synchronized (nVarB.f2997a) {
            try {
                if (nVarB.c(gVar)) {
                    nVarB.f2999c = null;
                    if (nVarB.f3000d != null) {
                        nVarB.g();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f2979i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f2979i);
        }
    }

    public final void c() {
        n nVarB = n.b();
        g gVar = this.f2990t;
        synchronized (nVarB.f2997a) {
            try {
                if (nVarB.c(gVar)) {
                    nVarB.f(nVarB.f2999c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z5 = true;
        AccessibilityManager accessibilityManager = this.f2989s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z5 = false;
        }
        i iVar = this.f2979i;
        if (z5) {
            iVar.post(new f(this, 2));
            return;
        }
        if (iVar.getParent() != null) {
            iVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        i iVar = this.f2979i;
        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
        boolean z5 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f2970z;
        if (!z5) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (iVar.f2959F == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (iVar.getParent() == null) {
            return;
        }
        int i6 = this.f2983m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = iVar.f2959F;
        int i7 = rect.bottom + i6;
        int i8 = rect.left + this.f2984n;
        int i9 = rect.right + this.f2985o;
        int i10 = rect.top;
        boolean z6 = (marginLayoutParams.bottomMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9 && marginLayoutParams.topMargin == i10) ? false : true;
        if (z6) {
            marginLayoutParams.bottomMargin = i7;
            marginLayoutParams.leftMargin = i8;
            marginLayoutParams.rightMargin = i9;
            marginLayoutParams.topMargin = i10;
            iVar.requestLayout();
        }
        if ((z6 || this.f2987q != this.f2986p) && Build.VERSION.SDK_INT >= 29 && this.f2986p > 0) {
            ViewGroup.LayoutParams layoutParams2 = iVar.getLayoutParams();
            if ((layoutParams2 instanceof B.e) && (((B.e) layoutParams2).f37a instanceof SwipeDismissBehavior)) {
                f fVar = this.f2982l;
                iVar.removeCallbacks(fVar);
                iVar.post(fVar);
            }
        }
    }
}
