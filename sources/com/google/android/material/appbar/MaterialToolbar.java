package com.google.android.material.appbar;

import B.h;
import H2.m;
import N.I;
import N.V;
import P2.g;
import U2.a;
import Y2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l.o;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f7029v0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Integer f7030q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f7031r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f7032s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ImageView.ScaleType f7033t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Boolean f7034u0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayE = m.e(context2, attributeSet, AbstractC1274a.f12471y, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayE.hasValue(2)) {
            setNavigationIconTint(typedArrayE.getColor(2, -1));
        }
        this.f7031r0 = typedArrayE.getBoolean(4, false);
        this.f7032s0 = typedArrayE.getBoolean(3, false);
        int i6 = typedArrayE.getInt(1, -1);
        if (i6 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f7029v0;
            if (i6 < scaleTypeArr.length) {
                this.f7033t0 = scaleTypeArr[i6];
            }
        }
        if (typedArrayE.hasValue(0)) {
            this.f7034u0 = Boolean.valueOf(typedArrayE.getBoolean(0, false));
        }
        typedArrayE.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : C0.g(background);
        if (colorStateListValueOf != null) {
            g gVar = new g();
            gVar.n(colorStateListValueOf);
            gVar.k(context2);
            WeakHashMap weakHashMap = V.f1964a;
            gVar.m(I.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f7033t0;
    }

    public Integer getNavigationIconTint() {
        return this.f7030q0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i6) {
        Menu menu = getMenu();
        boolean z5 = menu instanceof o;
        if (z5) {
            ((o) menu).w();
        }
        super.m(i6);
        if (z5) {
            ((o) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            b.B(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z5, i6, i7, i8, i9);
        int i10 = 0;
        ImageView imageView2 = null;
        if (this.f7031r0 || this.f7032s0) {
            ArrayList arrayListD = m.d(this, getTitle());
            boolean zIsEmpty = arrayListD.isEmpty();
            h hVar = m.f1057c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListD, hVar);
            ArrayList arrayListD2 = m.d(this, getSubtitle());
            TextView textView2 = arrayListD2.isEmpty() ? null : (TextView) Collections.max(arrayListD2, hVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i11 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f7031r0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f7032s0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i10 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i10);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i10++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f7034u0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f7033t0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).m(f6);
        }
    }

    public void setLogoAdjustViewBounds(boolean z5) {
        Boolean bool = this.f7034u0;
        if (bool == null || bool.booleanValue() != z5) {
            this.f7034u0 = Boolean.valueOf(z5);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f7033t0 != scaleType) {
            this.f7033t0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f7030q0 != null) {
            drawable = drawable.mutate();
            H.a.g(drawable, this.f7030q0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i6) {
        this.f7030q0 = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z5) {
        if (this.f7032s0 != z5) {
            this.f7032s0 = z5;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z5) {
        if (this.f7031r0 != z5) {
            this.f7031r0 = z5;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i6 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i7 = measuredWidth2 + i6;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i6, 0), Math.max(i7 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i6 += iMax;
            i7 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i7 - i6, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i6, textView.getTop(), i7, textView.getBottom());
    }
}
