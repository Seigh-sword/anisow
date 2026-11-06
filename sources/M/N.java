package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.xo.anilab.R;
import h.AbstractC0732a;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public final class N extends I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f10164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f10165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f10166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f10167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10169i;

    public N(SeekBar seekBar) {
        super(seekBar);
        this.f10166f = null;
        this.f10167g = null;
        this.f10168h = false;
        this.f10169i = false;
        this.f10164d = seekBar;
    }

    @Override // m.I
    public final void a(AttributeSet attributeSet, int i6) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f10164d;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC0732a.f8569g;
        C0803c c0803cJ = C0803c.J(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        N.V.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) c0803cJ.f9278y, R.attr.seekBarStyle);
        Drawable drawableW = c0803cJ.w(0);
        if (drawableW != null) {
            seekBar.setThumb(drawableW);
        }
        Drawable drawableV = c0803cJ.v(1);
        Drawable drawable = this.f10165e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f10165e = drawableV;
        if (drawableV != null) {
            drawableV.setCallback(seekBar);
            H.b.b(drawableV, seekBar.getLayoutDirection());
            if (drawableV.isStateful()) {
                drawableV.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (c0803cJ.G(3)) {
            this.f10167g = AbstractC0983r0.b(c0803cJ.z(3, -1), this.f10167g);
            this.f10169i = true;
        }
        if (c0803cJ.G(2)) {
            this.f10166f = c0803cJ.s(2);
            this.f10168h = true;
        }
        c0803cJ.M();
        c();
    }

    public final void c() {
        Drawable drawable = this.f10165e;
        if (drawable != null) {
            if (this.f10168h || this.f10169i) {
                Drawable drawableMutate = drawable.mutate();
                this.f10165e = drawableMutate;
                if (this.f10168h) {
                    H.a.h(drawableMutate, this.f10166f);
                }
                if (this.f10169i) {
                    H.a.i(this.f10165e, this.f10167g);
                }
                if (this.f10165e.isStateful()) {
                    this.f10165e.setState(this.f10164d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f10165e != null) {
            int max = this.f10164d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f10165e.getIntrinsicWidth();
                int intrinsicHeight = this.f10165e.getIntrinsicHeight();
                int i6 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i7 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f10165e.setBounds(-i6, -i7, i6, i7);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i8 = 0; i8 <= max; i8++) {
                    this.f10165e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
