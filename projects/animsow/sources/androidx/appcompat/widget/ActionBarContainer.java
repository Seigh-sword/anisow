package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.xo.anilab.R;
import h.AbstractC0732a;
import m.C0951b;
import m.U0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f5129A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Drawable f5130B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f5131C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5132D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f5133E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f5135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f5136y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f5137z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0951b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8563a);
        boolean z5 = false;
        this.f5137z = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f5129A = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f5133E = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f5131C = true;
            this.f5130B = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f5131C ? !(this.f5137z != null || this.f5129A != null) : this.f5130B == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5137z;
        if (drawable != null && drawable.isStateful()) {
            this.f5137z.setState(getDrawableState());
        }
        Drawable drawable2 = this.f5129A;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f5129A.setState(getDrawableState());
        }
        Drawable drawable3 = this.f5130B;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f5130B.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5137z;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5129A;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f5130B;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f5135x = findViewById(R.id.action_bar);
        this.f5136y = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f5134w || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        boolean z6;
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z5, i6, i7, i8, i9);
        if (this.f5131C) {
            Drawable drawable2 = this.f5130B;
            if (drawable2 == null) {
                return;
            } else {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f5137z != null) {
                if (this.f5135x.getVisibility() == 0) {
                    drawable = this.f5137z;
                    left = this.f5135x.getLeft();
                    top = this.f5135x.getTop();
                    right = this.f5135x.getRight();
                    view = this.f5135x;
                } else {
                    View view2 = this.f5136y;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f5137z.setBounds(0, 0, 0, 0);
                        z6 = true;
                    } else {
                        drawable = this.f5137z;
                        left = this.f5136y.getLeft();
                        top = this.f5136y.getTop();
                        right = this.f5136y.getRight();
                        view = this.f5136y;
                    }
                }
                drawable.setBounds(left, top, right, view.getBottom());
                z6 = true;
            } else {
                z6 = false;
            }
            this.f5132D = false;
            if (!z6) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        if (this.f5135x == null && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE && (i8 = this.f5133E) >= 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i8, View.MeasureSpec.getSize(i7)), Integer.MIN_VALUE);
        }
        super.onMeasure(i6, i7);
        if (this.f5135x == null) {
            return;
        }
        View.MeasureSpec.getMode(i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f5137z;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f5137z);
        }
        this.f5137z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f5135x;
            if (view != null) {
                this.f5137z.setBounds(view.getLeft(), this.f5135x.getTop(), this.f5135x.getRight(), this.f5135x.getBottom());
            }
        }
        boolean z5 = false;
        if (!this.f5131C ? !(this.f5137z != null || this.f5129A != null) : this.f5130B == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5130B;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f5130B);
        }
        this.f5130B = drawable;
        boolean z5 = this.f5131C;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f5130B) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? !(this.f5137z != null || this.f5129A != null) : this.f5130B == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f5129A;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f5129A);
        }
        this.f5129A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5132D && this.f5129A != null) {
                throw null;
            }
        }
        boolean z5 = false;
        if (!this.f5131C ? !(this.f5137z != null || this.f5129A != null) : this.f5130B == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z5) {
        this.f5134w = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z5 = i6 == 0;
        Drawable drawable = this.f5137z;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f5129A;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f5130B;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5137z;
        boolean z5 = this.f5131C;
        return (drawable == drawable2 && !z5) || (drawable == this.f5129A && this.f5132D) || ((drawable == this.f5130B && z5) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }

    public void setTabContainer(U0 u02) {
    }
}
