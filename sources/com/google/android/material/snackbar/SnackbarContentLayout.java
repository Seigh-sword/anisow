package com.google.android.material.snackbar;

import N.V;
import R2.k;
import Y2.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xo.anilab.R;
import java.util.WeakHashMap;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f7295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Button f7296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TimeInterpolator f7297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7298z;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7297y = b.A(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1301a.f12618b);
    }

    public final boolean a(int i6, int i7, int i8) {
        boolean z5;
        if (i6 != getOrientation()) {
            setOrientation(i6);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f7295w.getPaddingTop() == i7 && this.f7295w.getPaddingBottom() == i8) {
            return z5;
        }
        TextView textView = this.f7295w;
        WeakHashMap weakHashMap = V.f1964a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i7, textView.getPaddingEnd(), i8);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i7, textView.getPaddingRight(), i8);
        return true;
    }

    public Button getActionView() {
        return this.f7296x;
    }

    public TextView getMessageView() {
        return this.f7295w;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f7295w = (TextView) findViewById(R.id.snackbar_text);
        this.f7296x = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f7295w.getLayout();
        boolean z5 = layout != null && layout.getLineCount() > 1;
        if (!z5 || this.f7298z <= 0 || this.f7296x.getMeasuredWidth() <= this.f7298z) {
            if (!z5) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i6, i7);
    }

    public void setMaxInlineActionWidth(int i6) {
        this.f7298z = i6;
    }
}
