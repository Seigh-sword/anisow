package m;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.xo.anilab.R;
import i.C0804d;
import l.ViewTreeObserverOnGlobalLayoutListenerC0912e;

/* JADX INFO: loaded from: classes.dex */
public final class T extends K0 implements V {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public CharSequence f10192Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ListAdapter f10193Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Rect f10194a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f10195b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ W f10196c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W w5, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f10196c0 = w5;
        this.f10194a0 = new Rect();
        this.f10147K = w5;
        this.f10157U = true;
        this.f10158V.setFocusable(true);
        this.f10148L = new C0804d(this, 1, w5);
    }

    @Override // m.V
    public final void d(int i6, int i7) {
        ViewTreeObserver viewTreeObserver;
        H h4 = this.f10158V;
        boolean zIsShowing = h4.isShowing();
        s();
        this.f10158V.setInputMethodMode(2);
        f();
        C0995x0 c0995x0 = this.f10161y;
        c0995x0.setChoiceMode(1);
        c0995x0.setTextDirection(i6);
        c0995x0.setTextAlignment(i7);
        W w5 = this.f10196c0;
        int selectedItemPosition = w5.getSelectedItemPosition();
        C0995x0 c0995x02 = this.f10161y;
        if (h4.isShowing() && c0995x02 != null) {
            c0995x02.setListSelectionHidden(false);
            c0995x02.setSelection(selectedItemPosition);
            if (c0995x02.getChoiceMode() != 0) {
                c0995x02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = w5.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0912e viewTreeObserverOnGlobalLayoutListenerC0912e = new ViewTreeObserverOnGlobalLayoutListenerC0912e(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0912e);
        this.f10158V.setOnDismissListener(new S(this, viewTreeObserverOnGlobalLayoutListenerC0912e));
    }

    @Override // m.V
    public final CharSequence j() {
        return this.f10192Y;
    }

    @Override // m.V
    public final void l(CharSequence charSequence) {
        this.f10192Y = charSequence;
    }

    @Override // m.K0, m.V
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f10193Z = listAdapter;
    }

    @Override // m.V
    public final void p(int i6) {
        this.f10195b0 = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            r10 = this;
            m.H r0 = r10.f10158V
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            r2 = 1
            m.W r3 = r10.f10196c0
            if (r1 == 0) goto L21
            android.graphics.Rect r4 = r3.f10213D
            r1.getPadding(r4)
            boolean r1 = m.p1.f10363a
            int r1 = r3.getLayoutDirection()
            android.graphics.Rect r4 = r3.f10213D
            if (r1 != r2) goto L1d
            int r1 = r4.right
            goto L29
        L1d:
            int r1 = r4.left
            int r1 = -r1
            goto L29
        L21:
            android.graphics.Rect r1 = r3.f10213D
            r4 = 0
            r1.right = r4
            r1.left = r4
            r1 = r4
        L29:
            int r4 = r3.getPaddingLeft()
            int r5 = r3.getPaddingRight()
            int r6 = r3.getWidth()
            int r7 = r3.f10212C
            r8 = -2
            if (r7 != r8) goto L6a
            android.widget.ListAdapter r7 = r10.f10193Z
            android.widget.SpinnerAdapter r7 = (android.widget.SpinnerAdapter) r7
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            int r0 = r3.a(r7, r0)
            android.content.Context r7 = r3.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            android.graphics.Rect r8 = r3.f10213D
            int r9 = r8.left
            int r7 = r7 - r9
            int r8 = r8.right
            int r7 = r7 - r8
            if (r0 <= r7) goto L5f
            r0 = r7
        L5f:
            int r7 = r6 - r4
            int r7 = r7 - r5
            int r0 = java.lang.Math.max(r0, r7)
        L66:
            r10.r(r0)
            goto L74
        L6a:
            r0 = -1
            if (r7 != r0) goto L71
            int r0 = r6 - r4
            int r0 = r0 - r5
            goto L66
        L71:
            r10.r(r7)
        L74:
            boolean r0 = m.p1.f10363a
            int r0 = r3.getLayoutDirection()
            if (r0 != r2) goto L85
            int r6 = r6 - r5
            int r0 = r10.f10137A
            int r6 = r6 - r0
            int r0 = r10.f10195b0
            int r6 = r6 - r0
            int r6 = r6 + r1
            goto L8a
        L85:
            int r0 = r10.f10195b0
            int r4 = r4 + r0
            int r6 = r4 + r1
        L8a:
            r10.f10138B = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.T.s():void");
    }
}
