package androidx.fragment.app;

import N.C0;
import N.G;
import N.V;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.xo.anilab.R;
import d.AbstractC0628i;
import g0.AbstractC0714a;
import h0.AbstractComponentCallbacksC0734B;
import h0.C0736a;
import h0.D;
import h0.E;
import h0.N;
import h0.W;
import h0.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f5538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f5539x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f5540y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5541z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC1305a.o(context, "context");
        this.f5538w = new ArrayList();
        this.f5539x = new ArrayList();
        this.f5541z = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0714a.f8509b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f5539x.contains(view)) {
            this.f5538w.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        AbstractC1305a.o(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0734B ? (AbstractComponentCallbacksC0734B) tag : null) != null) {
            super.addView(view, i6, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0 c0G;
        AbstractC1305a.o(windowInsets, "insets");
        C0 c0G2 = C0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5540y;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC1305a.n(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c0G = C0.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = V.f1964a;
            WindowInsets windowInsetsF = c0G2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = G.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    c0G2 = C0.g(this, windowInsetsB);
                }
            }
            c0G = c0G2;
        }
        if (!c0G.f1943a.m()) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                WeakHashMap weakHashMap2 = V.f1964a;
                WindowInsets windowInsetsF2 = c0G.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = G.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        C0.g(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC1305a.o(canvas, "canvas");
        if (this.f5541z) {
            Iterator it = this.f5538w.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        AbstractC1305a.o(canvas, "canvas");
        AbstractC1305a.o(view, "child");
        if (this.f5541z) {
            ArrayList arrayList = this.f5538w;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC1305a.o(view, "view");
        this.f5539x.remove(view);
        if (this.f5538w.remove(view)) {
            this.f5541z = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0734B> F getFragment() {
        E e6;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B;
        W wC;
        View view = this;
        while (true) {
            e6 = null;
            if (view == null) {
                abstractComponentCallbacksC0734B = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0734B = tag instanceof AbstractComponentCallbacksC0734B ? (AbstractComponentCallbacksC0734B) tag : null;
            if (abstractComponentCallbacksC0734B != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0734B == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof E) {
                    e6 = (E) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (e6 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            wC = e6.f8646P.C();
        } else {
            if (!abstractComponentCallbacksC0734B.s()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0734B + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            wC = abstractComponentCallbacksC0734B.l();
        }
        return (F) wC.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC1305a.o(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC1305a.n(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC1305a.o(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i6) {
        View childAt = getChildAt(i6);
        AbstractC1305a.n(childAt, "view");
        a(childAt);
        super.removeViewAt(i6);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC1305a.o(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            AbstractC1305a.n(childAt, "view");
            a(childAt);
        }
        super.removeViews(i6, i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            AbstractC1305a.n(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i6, i7);
    }

    public final void setDrawDisappearingViewsLast(boolean z5) {
        this.f5541z = z5;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC1305a.o(onApplyWindowInsetsListener, "listener");
        this.f5540y = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC1305a.o(view, "view");
        if (view.getParent() == this) {
            this.f5539x.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, W w5) {
        View view;
        super(context, attributeSet);
        AbstractC1305a.o(context, "context");
        AbstractC1305a.o(attributeSet, "attrs");
        AbstractC1305a.o(w5, "fm");
        this.f5538w = new ArrayList();
        this.f5539x = new ArrayList();
        this.f5541z = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0714a.f8509b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BC = w5.C(id);
        if (classAttribute != null && abstractComponentCallbacksC0734BC == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0628i.j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            N nH = w5.H();
            context.getClassLoader();
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BA = nH.a(classAttribute);
            AbstractC1305a.n(abstractComponentCallbacksC0734BA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0734BA.f8609T = id;
            abstractComponentCallbacksC0734BA.f8610U = id;
            abstractComponentCallbacksC0734BA.f8611V = string;
            abstractComponentCallbacksC0734BA.f8605P = w5;
            D d6 = w5.f8717w;
            abstractComponentCallbacksC0734BA.f8606Q = d6;
            abstractComponentCallbacksC0734BA.f8616a0 = true;
            if ((d6 == null ? null : d6.f8642x) != null) {
                abstractComponentCallbacksC0734BA.f8616a0 = true;
            }
            C0736a c0736a = new C0736a(w5);
            c0736a.f8750o = true;
            abstractComponentCallbacksC0734BA.f8617b0 = this;
            abstractComponentCallbacksC0734BA.f8601L = true;
            c0736a.e(getId(), abstractComponentCallbacksC0734BA, string, 1);
            if (c0736a.f8742g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0736a.f8752q.A(c0736a, true);
        }
        for (c0 c0Var : w5.f8697c.h()) {
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
            if (abstractComponentCallbacksC0734B.f8610U == getId() && (view = abstractComponentCallbacksC0734B.f8618c0) != null && view.getParent() == null) {
                abstractComponentCallbacksC0734B.f8617b0 = this;
                c0Var.b();
                c0Var.k();
            }
        }
    }
}
