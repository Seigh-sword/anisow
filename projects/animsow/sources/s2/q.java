package S2;

import N.V;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C0964h0;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f3179A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f3180B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f3184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f3185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f3187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f3188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f3189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f3191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f3192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f3193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f3196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0964h0 f3198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f3199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3200t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3201u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f3202v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f3203w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0964h0 f3205y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3206z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3187g = context;
        this.f3188h = textInputLayout;
        this.f3193m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f3181a = Y2.b.z(context, R.attr.motionDurationShort4, 217);
        this.f3182b = Y2.b.z(context, R.attr.motionDurationMedium4, 167);
        this.f3183c = Y2.b.z(context, R.attr.motionDurationShort4, 167);
        this.f3184d = Y2.b.A(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC1301a.f12620d);
        LinearInterpolator linearInterpolator = AbstractC1301a.f12617a;
        this.f3185e = Y2.b.A(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f3186f = Y2.b.A(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i6) {
        if (this.f3189i == null && this.f3191k == null) {
            Context context = this.f3187g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3189i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3189i;
            TextInputLayout textInputLayout = this.f3188h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3191k = new FrameLayout(context);
            this.f3189i.addView(this.f3191k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i6 == 0 || i6 == 1) {
            this.f3191k.setVisibility(0);
            this.f3191k.addView(textView);
        } else {
            this.f3189i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3189i.setVisibility(0);
        this.f3190j++;
    }

    public final void b() {
        if (this.f3189i != null) {
            TextInputLayout textInputLayout = this.f3188h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3187g;
                boolean zV = f2.h.v(context);
                LinearLayout linearLayout = this.f3189i;
                WeakHashMap weakHashMap = V.f1964a;
                int paddingStart = editText.getPaddingStart();
                if (zV) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zV) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zV) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f3192l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z5, TextView textView, int i6, int i7, int i8) {
        if (textView == null || !z5) {
            return;
        }
        if (i6 == i8 || i6 == i7) {
            boolean z6 = i8 == i6;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z6 ? 1.0f : 0.0f);
            int i9 = this.f3183c;
            objectAnimatorOfFloat.setDuration(z6 ? this.f3182b : i9);
            objectAnimatorOfFloat.setInterpolator(z6 ? this.f3185e : this.f3186f);
            if (i6 == i8 && i7 != 0) {
                objectAnimatorOfFloat.setStartDelay(i9);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i8 != i6 || i7 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f3193m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f3181a);
            objectAnimatorOfFloat2.setInterpolator(this.f3184d);
            objectAnimatorOfFloat2.setStartDelay(i9);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i6) {
        if (i6 == 1) {
            return this.f3198r;
        }
        if (i6 != 2) {
            return null;
        }
        return this.f3205y;
    }

    public final void f() {
        this.f3196p = null;
        c();
        if (this.f3194n == 1) {
            this.f3195o = (!this.f3204x || TextUtils.isEmpty(this.f3203w)) ? 0 : 2;
        }
        i(this.f3194n, this.f3195o, h(this.f3198r, ""));
    }

    public final void g(TextView textView, int i6) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3189i;
        if (linearLayout == null) {
            return;
        }
        if ((i6 == 0 || i6 == 1) && (frameLayout = this.f3191k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i7 = this.f3190j - 1;
        this.f3190j = i7;
        LinearLayout linearLayout2 = this.f3189i;
        if (i7 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = V.f1964a;
        TextInputLayout textInputLayout = this.f3188h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f3195o == this.f3194n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i6, int i7, boolean z5) {
        TextView textViewE;
        TextView textViewE2;
        if (i6 == i7) {
            return;
        }
        if (z5) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3192l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3204x, this.f3205y, 2, i6, i7);
            d(arrayList, this.f3197q, this.f3198r, 1, i6, i7);
            f2.h.C(animatorSet, arrayList);
            animatorSet.addListener(new o(this, i7, e(i6), i6, e(i7)));
            animatorSet.start();
        } else if (i6 != i7) {
            if (i7 != 0 && (textViewE2 = e(i7)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i6 != 0 && (textViewE = e(i6)) != null) {
                textViewE.setVisibility(4);
                if (i6 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f3194n = i7;
        }
        TextInputLayout textInputLayout = this.f3188h;
        textInputLayout.r();
        textInputLayout.u(z5, false);
        textInputLayout.x();
    }
}
