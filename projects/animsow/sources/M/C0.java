package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.AbstractC0732a;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10090A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10091B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f10092C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10093D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int[] f10094E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int[] f10095F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f10096G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10097H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f10098I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f10099J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f10100K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10102x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10103y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10104z;

    public C0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10101w = true;
        this.f10102x = -1;
        this.f10103y = 0;
        this.f10090A = 8388659;
        int[] iArr = AbstractC0732a.f8576n;
        C0803c c0803cJ = C0803c.J(context, attributeSet, iArr, 0, 0);
        N.V.k(this, context, iArr, attributeSet, (TypedArray) c0803cJ.f9278y, 0);
        int iZ = c0803cJ.z(1, -1);
        if (iZ >= 0) {
            setOrientation(iZ);
        }
        int iZ2 = c0803cJ.z(0, -1);
        if (iZ2 >= 0) {
            setGravity(iZ2);
        }
        boolean zR = c0803cJ.r(2, true);
        if (!zR) {
            setBaselineAligned(zR);
        }
        this.f10092C = ((TypedArray) c0803cJ.f9278y).getFloat(4, -1.0f);
        this.f10102x = c0803cJ.z(3, -1);
        this.f10093D = c0803cJ.r(7, false);
        setDividerDrawable(c0803cJ.v(5));
        this.f10099J = c0803cJ.z(8, 0);
        this.f10100K = c0803cJ.u(6, 0);
        c0803cJ.M();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof B0;
    }

    public final void d(Canvas canvas, int i6) {
        this.f10096G.setBounds(getPaddingLeft() + this.f10100K, i6, (getWidth() - getPaddingRight()) - this.f10100K, this.f10098I + i6);
        this.f10096G.draw(canvas);
    }

    public final void e(Canvas canvas, int i6) {
        this.f10096G.setBounds(i6, getPaddingTop() + this.f10100K, this.f10097H + i6, (getHeight() - getPaddingBottom()) - this.f10100K);
        this.f10096G.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public B0 generateDefaultLayoutParams() {
        int i6 = this.f10104z;
        if (i6 == 0) {
            return new B0(-2, -2);
        }
        if (i6 == 1) {
            return new B0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public B0 generateLayoutParams(AttributeSet attributeSet) {
        return new B0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i6;
        if (this.f10102x < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i7 = this.f10102x;
        if (childCount <= i7) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i7);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f10102x == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f10103y;
        if (this.f10104z == 1 && (i6 = this.f10090A & 112) != 48) {
            if (i6 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f10091B) / 2;
            } else if (i6 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f10091B;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((B0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f10102x;
    }

    public Drawable getDividerDrawable() {
        return this.f10096G;
    }

    public int getDividerPadding() {
        return this.f10100K;
    }

    public int getDividerWidth() {
        return this.f10097H;
    }

    public int getGravity() {
        return this.f10090A;
    }

    public int getOrientation() {
        return this.f10104z;
    }

    public int getShowDividers() {
        return this.f10099J;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f10092C;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public B0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof B0 ? new B0((B0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new B0((ViewGroup.MarginLayoutParams) layoutParams) : new B0(layoutParams);
    }

    public final boolean i(int i6) {
        if (i6 == 0) {
            return (this.f10099J & 1) != 0;
        }
        if (i6 == getChildCount()) {
            return (this.f10099J & 4) != 0;
        }
        if ((this.f10099J & 2) == 0) {
            return false;
        }
        for (int i7 = i6 - 1; i7 >= 0; i7--) {
            if (getChildAt(i7).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        if (this.f10096G == null) {
            return;
        }
        int i6 = 0;
        if (this.f10104z == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i6 < virtualChildCount) {
                View childAt = getChildAt(i6);
                if (childAt != null && childAt.getVisibility() != 8 && i(i6)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((B0) childAt.getLayoutParams())).topMargin) - this.f10098I);
                }
                i6++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f10098I : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((B0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z5 = p1.f10363a;
        boolean z6 = getLayoutDirection() == 1;
        while (i6 < virtualChildCount2) {
            View childAt3 = getChildAt(i6);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i6)) {
                B0 b02 = (B0) childAt3.getLayoutParams();
                e(canvas, z6 ? childAt3.getRight() + ((LinearLayout.LayoutParams) b02).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) b02).leftMargin) - this.f10097H);
            }
            i6++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                B0 b03 = (B0) childAt4.getLayoutParams();
                if (z6) {
                    left = childAt4.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) b03).leftMargin;
                    right = (left - paddingRight) - this.f10097H;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) b03).rightMargin;
                }
            } else if (z6) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f10097H;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02a0 A[PHI: r14
      0x02a0: PHI (r14v19 int) = (r14v17 int), (r14v20 int) binds: [B:137:0x02b1, B:131:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0703 A[PHI: r7
      0x0703: PHI (r7v46 int) = (r7v42 int), (r7v47 int) binds: [B:336:0x0714, B:330:0x0700] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 2189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z5) {
        this.f10101w = z5;
    }

    public void setBaselineAlignedChildIndex(int i6) {
        if (i6 >= 0 && i6 < getChildCount()) {
            this.f10102x = i6;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f10096G) {
            return;
        }
        this.f10096G = drawable;
        if (drawable != null) {
            this.f10097H = drawable.getIntrinsicWidth();
            this.f10098I = drawable.getIntrinsicHeight();
        } else {
            this.f10097H = 0;
            this.f10098I = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i6) {
        this.f10100K = i6;
    }

    public void setGravity(int i6) {
        if (this.f10090A != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f10090A = i6;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i6) {
        int i7 = i6 & 8388615;
        int i8 = this.f10090A;
        if ((8388615 & i8) != i7) {
            this.f10090A = i7 | ((-8388616) & i8);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.f10093D = z5;
    }

    public void setOrientation(int i6) {
        if (this.f10104z != i6) {
            this.f10104z = i6;
            requestLayout();
        }
    }

    public void setShowDividers(int i6) {
        if (i6 != this.f10099J) {
            requestLayout();
        }
        this.f10099J = i6;
    }

    public void setVerticalGravity(int i6) {
        int i7 = i6 & 112;
        int i8 = this.f10090A;
        if ((i8 & 112) != i7) {
            this.f10090A = i7 | (i8 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f10092C = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
