package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import d2.AbstractC0651b;
import h.AbstractC0732a;
import i.C0803c;

/* JADX INFO: renamed from: m.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0994x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f10403b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f10404c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10405d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10406e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f10408g;

    public /* synthetic */ C0994x(TextView textView, int i6) {
        this.f10402a = i6;
        this.f10408g = textView;
    }

    public final void a() {
        TextView textView = this.f10408g;
        Drawable drawableA = T.c.a((CompoundButton) textView);
        if (drawableA != null) {
            if (this.f10405d || this.f10406e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f10405d) {
                    H.a.h(drawableMutate, this.f10403b);
                }
                if (this.f10406e) {
                    H.a.i(drawableMutate, this.f10404c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f10408g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f10405d || this.f10406e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f10405d) {
                    H.a.h(drawableMutate, this.f10403b);
                }
                if (this.f10406e) {
                    H.a.i(drawableMutate, this.f10404c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public final void c(AttributeSet attributeSet, int i6) {
        C0803c c0803cJ;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int i7 = this.f10402a;
        TextView textView = this.f10408g;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                CheckedTextView checkedTextView = (CheckedTextView) textView;
                Context context = checkedTextView.getContext();
                int[] iArr = AbstractC0732a.f8574l;
                c0803cJ = C0803c.J(context, attributeSet, iArr, i6, 0);
                N.V.k(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) c0803cJ.f9278y, i6);
                try {
                    if (c0803cJ.G(1) && (iB2 = c0803cJ.B(1, 0)) != 0) {
                        try {
                            ((CheckedTextView) textView).setCheckMarkDrawable(AbstractC0651b.p(((CheckedTextView) textView).getContext(), iB2));
                        } catch (Resources.NotFoundException unused) {
                            if (c0803cJ.G(0)) {
                                ((CheckedTextView) textView).setCheckMarkDrawable(AbstractC0651b.p(((CheckedTextView) textView).getContext(), iB));
                            }
                        }
                        break;
                    } else if (c0803cJ.G(0) && (iB = c0803cJ.B(0, 0)) != 0) {
                        ((CheckedTextView) textView).setCheckMarkDrawable(AbstractC0651b.p(((CheckedTextView) textView).getContext(), iB));
                    }
                    if (c0803cJ.G(2)) {
                        ((CheckedTextView) textView).setCheckMarkTintList(c0803cJ.s(2));
                    }
                    if (c0803cJ.G(3)) {
                        ((CheckedTextView) textView).setCheckMarkTintMode(AbstractC0983r0.b(c0803cJ.z(3, -1), null));
                        break;
                    }
                    return;
                } finally {
                }
            default:
                CompoundButton compoundButton = (CompoundButton) textView;
                Context context2 = compoundButton.getContext();
                int[] iArr2 = AbstractC0732a.f8575m;
                c0803cJ = C0803c.J(context2, attributeSet, iArr2, i6, 0);
                N.V.k(compoundButton, compoundButton.getContext(), iArr2, attributeSet, (TypedArray) c0803cJ.f9278y, i6);
                try {
                    if (c0803cJ.G(1) && (iB4 = c0803cJ.B(1, 0)) != 0) {
                        try {
                            ((CompoundButton) textView).setButtonDrawable(AbstractC0651b.p(((CompoundButton) textView).getContext(), iB4));
                        } catch (Resources.NotFoundException unused2) {
                            if (c0803cJ.G(0)) {
                                ((CompoundButton) textView).setButtonDrawable(AbstractC0651b.p(((CompoundButton) textView).getContext(), iB3));
                            }
                        }
                        break;
                    } else if (c0803cJ.G(0) && (iB3 = c0803cJ.B(0, 0)) != 0) {
                        ((CompoundButton) textView).setButtonDrawable(AbstractC0651b.p(((CompoundButton) textView).getContext(), iB3));
                    }
                    if (c0803cJ.G(2)) {
                        T.b.c((CompoundButton) textView, c0803cJ.s(2));
                    }
                    if (c0803cJ.G(3)) {
                        T.b.d((CompoundButton) textView, AbstractC0983r0.b(c0803cJ.z(3, -1), null));
                        break;
                    }
                    return;
                } finally {
                }
        }
    }
}
