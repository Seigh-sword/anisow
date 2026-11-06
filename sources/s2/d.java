package S2;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.xo.anilab.R;
import d.RunnableC0632m;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f3119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f3120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final W0.d f3121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f3122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f3123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f3124m;

    public d(m mVar) {
        super(mVar);
        this.f3121j = new W0.d(3, this);
        this.f3122k = new a(this, 0);
        this.f3116e = Y2.b.z(mVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f3117f = Y2.b.z(mVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f3118g = Y2.b.A(mVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1301a.f12617a);
        this.f3119h = Y2.b.A(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1301a.f12620d);
    }

    @Override // S2.n
    public final void a() {
        if (this.f3170b.f3158L != null) {
            return;
        }
        t(u());
    }

    @Override // S2.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // S2.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // S2.n
    public final View.OnFocusChangeListener e() {
        return this.f3122k;
    }

    @Override // S2.n
    public final View.OnClickListener f() {
        return this.f3121j;
    }

    @Override // S2.n
    public final View.OnFocusChangeListener g() {
        return this.f3122k;
    }

    @Override // S2.n
    public final void m(EditText editText) {
        this.f3120i = editText;
        this.f3169a.setEndIconVisible(u());
    }

    @Override // S2.n
    public final void p(boolean z5) {
        if (this.f3170b.f3158L == null) {
            return;
        }
        t(z5);
    }

    @Override // S2.n
    public final void r() {
        final int i6 = 0;
        final int i7 = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f3119h);
        valueAnimatorOfFloat.setDuration(this.f3117f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: S2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3113b;

            {
                this.f3113b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i8 = i7;
                d dVar = this.f3113b;
                dVar.getClass();
                switch (i8) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        dVar.f3172d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f3172d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3118g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i8 = this.f3116e;
        valueAnimatorOfFloat2.setDuration(i8);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: S2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3113b;

            {
                this.f3113b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i82 = i6;
                d dVar = this.f3113b;
                dVar.getClass();
                switch (i82) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        dVar.f3172d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f3172d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3123l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f3123l.addListener(new c(this, i6));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i8);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: S2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3113b;

            {
                this.f3113b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i82 = i6;
                d dVar = this.f3113b;
                dVar.getClass();
                switch (i82) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        dVar.f3172d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f3172d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f3124m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i7));
    }

    @Override // S2.n
    public final void s() {
        EditText editText = this.f3120i;
        if (editText != null) {
            editText.post(new RunnableC0632m(16, this));
        }
    }

    public final void t(boolean z5) {
        boolean z6 = this.f3170b.d() == z5;
        if (z5 && !this.f3123l.isRunning()) {
            this.f3124m.cancel();
            this.f3123l.start();
            if (z6) {
                this.f3123l.end();
                return;
            }
            return;
        }
        if (z5) {
            return;
        }
        this.f3123l.cancel();
        this.f3124m.start();
        if (z6) {
            this.f3124m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f3120i;
        return editText != null && (editText.hasFocus() || this.f3172d.hasFocus()) && this.f3120i.getText().length() > 0;
    }
}
