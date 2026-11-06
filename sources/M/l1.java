package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.xo.anilab.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p3.C1251c;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static l1 f10307G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static l1 f10308H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final k1 f10309A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10310B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10311C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C1251c f10312D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f10313E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f10314F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f10315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f10316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f10317y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k1 f10318z;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.k1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.k1] */
    public l1(View view, CharSequence charSequence) {
        final int i6 = 0;
        this.f10318z = new Runnable(this) { // from class: m.k1

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ l1 f10303x;

            {
                this.f10303x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i7 = i6;
                l1 l1Var = this.f10303x;
                switch (i7) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        l1Var.c(false);
                        break;
                    default:
                        l1Var.a();
                        break;
                }
            }
        };
        final int i7 = 1;
        this.f10309A = new Runnable(this) { // from class: m.k1

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ l1 f10303x;

            {
                this.f10303x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i72 = i7;
                l1 l1Var = this.f10303x;
                switch (i72) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        l1Var.c(false);
                        break;
                    default:
                        l1Var.a();
                        break;
                }
            }
        };
        this.f10315w = view;
        this.f10316x = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = N.Z.f1970a;
        this.f10317y = Build.VERSION.SDK_INT >= 28 ? N.X.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f10314F = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(l1 l1Var) {
        l1 l1Var2 = f10307G;
        if (l1Var2 != null) {
            l1Var2.f10315w.removeCallbacks(l1Var2.f10318z);
        }
        f10307G = l1Var;
        if (l1Var != null) {
            l1Var.f10315w.postDelayed(l1Var.f10318z, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        l1 l1Var = f10308H;
        View view = this.f10315w;
        if (l1Var == this) {
            f10308H = null;
            C1251c c1251c = this.f10312D;
            if (c1251c != null) {
                if (((View) c1251c.f12319c).getParent() != null) {
                    ((WindowManager) ((Context) c1251c.f12318b).getSystemService("window")).removeView((View) c1251c.f12319c);
                }
                this.f10312D = null;
                this.f10314F = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f10307G == this) {
            b(null);
        }
        view.removeCallbacks(this.f10309A);
    }

    public final void c(boolean z5) {
        int height;
        int i6;
        long longPressTimeout;
        long j6;
        long j7;
        View view = this.f10315w;
        if (view.isAttachedToWindow()) {
            b(null);
            l1 l1Var = f10308H;
            if (l1Var != null) {
                l1Var.a();
            }
            f10308H = this;
            this.f10313E = z5;
            C1251c c1251c = new C1251c(view.getContext(), 1);
            this.f10312D = c1251c;
            int width = this.f10310B;
            int i7 = this.f10311C;
            boolean z6 = this.f10313E;
            if (((View) c1251c.f12319c).getParent() != null && ((View) c1251c.f12319c).getParent() != null) {
                ((WindowManager) ((Context) c1251c.f12318b).getSystemService("window")).removeView((View) c1251c.f12319c);
            }
            ((TextView) c1251c.f12320d).setText(this.f10316x);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c1251c.f12321e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = ((Context) c1251c.f12318b).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = ((Context) c1251c.f12318b).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i7 + dimensionPixelOffset2;
                i6 = i7 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i6 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = ((Context) c1251c.f12318b).getResources().getDimensionPixelOffset(z6 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame((Rect) c1251c.f12322f);
                Rect rect = (Rect) c1251c.f12322f;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = ((Context) c1251c.f12318b).getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    ((Rect) c1251c.f12322f).set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen((int[]) c1251c.f12324h);
                view.getLocationOnScreen((int[]) c1251c.f12323g);
                int[] iArr = (int[]) c1251c.f12323g;
                int i8 = iArr[0];
                int[] iArr2 = (int[]) c1251c.f12324h;
                int i9 = i8 - iArr2[0];
                iArr[0] = i9;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (i9 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ((View) c1251c.f12319c).measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = ((View) c1251c.f12319c).getMeasuredHeight();
                int i10 = ((int[]) c1251c.f12323g)[1];
                int i11 = ((i6 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i12 = i10 + height + dimensionPixelOffset3;
                if (!z6 ? measuredHeight + i12 <= ((Rect) c1251c.f12322f).height() : i11 < 0) {
                    layoutParams.y = i11;
                } else {
                    layoutParams.y = i12;
                }
            }
            ((WindowManager) ((Context) c1251c.f12318b).getSystemService("window")).addView((View) c1251c.f12319c, (WindowManager.LayoutParams) c1251c.f12321e);
            view.addOnAttachStateChangeListener(this);
            if (this.f10313E) {
                j7 = 2500;
            } else {
                WeakHashMap weakHashMap = N.V.f1964a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j7 = j6 - longPressTimeout;
            }
            k1 k1Var = this.f10309A;
            view.removeCallbacks(k1Var);
            view.postDelayed(k1Var, j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            p3.c r4 = r3.f10312D
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f10313E
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f10315w
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f10314F = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            p3.c r4 = r3.f10312D
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f10314F
            if (r1 != 0) goto L66
            int r1 = r3.f10310B
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f10317y
            if (r1 > r2) goto L66
            int r1 = r3.f10311C
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f10310B = r4
            r3.f10311C = r5
            r3.f10314F = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.l1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f10310B = view.getWidth() / 2;
        this.f10311C = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
