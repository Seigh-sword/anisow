package androidx.appcompat.widget;

import N.V;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.xo.anilab.R;
import h.AbstractC0732a;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5204y;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5204y = -1;
        int[] iArr = AbstractC0732a.f8573k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        V.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f5202w = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f5202w);
        }
    }

    private void setStacked(boolean z5) {
        if (this.f5203x != z5) {
            if (!z5 || this.f5202w) {
                this.f5203x = z5;
                setOrientation(z5 ? 1 : 0);
                setGravity(z5 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z5 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z5) {
        if (this.f5202w != z5) {
            this.f5202w = z5;
            if (!z5 && this.f5203x) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
