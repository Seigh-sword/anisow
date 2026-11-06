package x2;

import J2.e;
import N.V;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.o;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f13676g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f13677h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int f13678i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f13679j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f13680k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ArrayList f13681l0;

    public b(Context context) {
        super(context);
        this.f13681l0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f13676g0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f13677h0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f13678i0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f13679j0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int i10 = i8 - i6;
        int i11 = i9 - i7;
        int measuredWidth = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = V.f1964a;
                if (getLayoutDirection() == 1) {
                    int i13 = i10 - measuredWidth;
                    childAt.layout(i13 - childAt.getMeasuredWidth(), 0, i13, i11);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i11);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        o menu = getMenu();
        int size = View.MeasureSpec.getSize(i6);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f13681l0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i7);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        boolean z5 = labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3;
        int i10 = this.f13678i0;
        if (z5 && this.f13680k0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.f13679j0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i11 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f13677h0 * i11), Math.min(iMax, i10));
            int i12 = size - iMin;
            int iMin2 = Math.min(i12 / (i11 != 0 ? i11 : 1), this.f13676g0);
            int i13 = i12 - (i11 * iMin2);
            int i14 = 0;
            while (i14 < childCount) {
                if (getChildAt(i14).getVisibility() != 8) {
                    i9 = i14 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i13 > 0) {
                        i9++;
                        i13--;
                    }
                } else {
                    i9 = 0;
                }
                arrayList.add(Integer.valueOf(i9));
                i14++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), i10);
            int i15 = size - (size2 * iMin3);
            for (int i16 = 0; i16 < childCount; i16++) {
                if (getChildAt(i16).getVisibility() == 8) {
                    i8 = 0;
                } else if (i15 > 0) {
                    i8 = iMin3 + 1;
                    i15--;
                } else {
                    i8 = iMin3;
                }
                arrayList.add(Integer.valueOf(i8));
            }
        }
        int measuredWidth = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i17)).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth = childAt2.getMeasuredWidth() + measuredWidth;
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z5) {
        this.f13680k0 = z5;
    }
}
