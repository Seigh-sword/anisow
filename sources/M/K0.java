package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import d2.AbstractC0651b;
import h.AbstractC0732a;
import java.lang.reflect.Method;
import l.InterfaceC0905E;

/* JADX INFO: loaded from: classes.dex */
public class K0 implements InterfaceC0905E {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Method f10135W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Method f10136X;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10138B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10139C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f10141E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f10142F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f10143G;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public H0 f10146J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public View f10147K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public AdapterView.OnItemClickListener f10148L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f10149M;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Handler f10154R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Rect f10156T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f10157U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final H f10158V;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f10159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f10160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0995x0 f10161y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f10162z = -2;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10137A = -2;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f10140D = 1002;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10144H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f10145I = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final D0 f10150N = new D0(this, 2);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final J0 f10151O = new J0(0, this);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final I0 f10152P = new I0(this);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final D0 f10153Q = new D0(this, 1);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Rect f10155S = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f10135W = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f10136X = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public K0(Context context, AttributeSet attributeSet, int i6, int i7) {
        int resourceId;
        this.f10159w = context;
        this.f10154R = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8577o, i6, i7);
        this.f10138B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f10139C = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f10141E = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        H h4 = new H(context, attributeSet, i6, i7);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8581s, i6, i7);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            T.l.c(h4, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        h4.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0651b.p(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f10158V = h4;
        h4.setInputMethodMode(1);
    }

    @Override // l.InterfaceC0905E
    public final boolean a() {
        return this.f10158V.isShowing();
    }

    public final void b(int i6) {
        this.f10138B = i6;
    }

    public final int c() {
        return this.f10138B;
    }

    @Override // l.InterfaceC0905E
    public final void dismiss() {
        H h4 = this.f10158V;
        h4.dismiss();
        h4.setContentView(null);
        this.f10161y = null;
        this.f10154R.removeCallbacks(this.f10150N);
    }

    @Override // l.InterfaceC0905E
    public final void f() {
        int i6;
        int paddingBottom;
        C0995x0 c0995x0;
        C0995x0 c0995x02 = this.f10161y;
        H h4 = this.f10158V;
        Context context = this.f10159w;
        if (c0995x02 == null) {
            C0995x0 c0995x0Q = q(context, !this.f10157U);
            this.f10161y = c0995x0Q;
            c0995x0Q.setAdapter(this.f10160x);
            this.f10161y.setOnItemClickListener(this.f10148L);
            this.f10161y.setFocusable(true);
            this.f10161y.setFocusableInTouchMode(true);
            this.f10161y.setOnItemSelectedListener(new E0(this));
            this.f10161y.setOnScrollListener(this.f10152P);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f10149M;
            if (onItemSelectedListener != null) {
                this.f10161y.setOnItemSelectedListener(onItemSelectedListener);
            }
            h4.setContentView(this.f10161y);
        }
        Drawable background = h4.getBackground();
        Rect rect = this.f10155S;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i6 = rect.bottom + i7;
            if (!this.f10141E) {
                this.f10139C = -i7;
            }
        } else {
            rect.setEmpty();
            i6 = 0;
        }
        int iA = F0.a(h4, this.f10147K, this.f10139C, h4.getInputMethodMode() == 2);
        int i8 = this.f10162z;
        if (i8 == -1) {
            paddingBottom = iA + i6;
        } else {
            int i9 = this.f10137A;
            int iA2 = this.f10161y.a(i9 != -2 ? i9 != -1 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f10161y.getPaddingBottom() + this.f10161y.getPaddingTop() + i6 : 0);
        }
        boolean z5 = this.f10158V.getInputMethodMode() == 2;
        T.l.d(h4, this.f10140D);
        if (h4.isShowing()) {
            if (this.f10147K.isAttachedToWindow()) {
                int width = this.f10137A;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f10147K.getWidth();
                }
                if (i8 == -1) {
                    i8 = z5 ? paddingBottom : -1;
                    int i10 = this.f10137A;
                    if (z5) {
                        h4.setWidth(i10 == -1 ? -1 : 0);
                        h4.setHeight(0);
                    } else {
                        h4.setWidth(i10 == -1 ? -1 : 0);
                        h4.setHeight(-1);
                    }
                } else if (i8 == -2) {
                    i8 = paddingBottom;
                }
                h4.setOutsideTouchable(true);
                View view = this.f10147K;
                int i11 = this.f10138B;
                int i12 = this.f10139C;
                if (width < 0) {
                    width = -1;
                }
                h4.update(view, i11, i12, width, i8 < 0 ? -1 : i8);
                return;
            }
            return;
        }
        int width2 = this.f10137A;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f10147K.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = paddingBottom;
        }
        h4.setWidth(width2);
        h4.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f10135W;
            if (method != null) {
                try {
                    method.invoke(h4, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            G0.b(h4, true);
        }
        h4.setOutsideTouchable(true);
        h4.setTouchInterceptor(this.f10151O);
        if (this.f10143G) {
            T.l.c(h4, this.f10142F);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f10136X;
            if (method2 != null) {
                try {
                    method2.invoke(h4, this.f10156T);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            G0.a(h4, this.f10156T);
        }
        h4.showAsDropDown(this.f10147K, this.f10138B, this.f10139C, this.f10144H);
        this.f10161y.setSelection(-1);
        if ((!this.f10157U || this.f10161y.isInTouchMode()) && (c0995x0 = this.f10161y) != null) {
            c0995x0.setListSelectionHidden(true);
            c0995x0.requestLayout();
        }
        if (this.f10157U) {
            return;
        }
        this.f10154R.post(this.f10153Q);
    }

    public final int g() {
        if (this.f10141E) {
            return this.f10139C;
        }
        return 0;
    }

    public final Drawable i() {
        return this.f10158V.getBackground();
    }

    @Override // l.InterfaceC0905E
    public final C0995x0 k() {
        return this.f10161y;
    }

    public final void m(Drawable drawable) {
        this.f10158V.setBackgroundDrawable(drawable);
    }

    public final void n(int i6) {
        this.f10139C = i6;
        this.f10141E = true;
    }

    public void o(ListAdapter listAdapter) {
        H0 h02 = this.f10146J;
        if (h02 == null) {
            this.f10146J = new H0(this);
        } else {
            ListAdapter listAdapter2 = this.f10160x;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(h02);
            }
        }
        this.f10160x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f10146J);
        }
        C0995x0 c0995x0 = this.f10161y;
        if (c0995x0 != null) {
            c0995x0.setAdapter(this.f10160x);
        }
    }

    public C0995x0 q(Context context, boolean z5) {
        return new C0995x0(context, z5);
    }

    public final void r(int i6) {
        Drawable background = this.f10158V.getBackground();
        if (background == null) {
            this.f10137A = i6;
            return;
        }
        Rect rect = this.f10155S;
        background.getPadding(rect);
        this.f10137A = rect.left + rect.right + i6;
    }
}
