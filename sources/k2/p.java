package K2;

import F0.C0015b;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.xo.anilab.R;
import i.E;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends E {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f1598G = {533, 567, 850, 750};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f1599H = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0015b f1600I = new C0015b(Float.class, "animationFraction", 13);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Interpolator[] f1601A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final q f1602B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f1603C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f1604D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f1605E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public G0.c f1606F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ObjectAnimator f1607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ObjectAnimator f1608z;

    public p(Context context, q qVar) {
        super(2);
        this.f1603C = 0;
        this.f1606F = null;
        this.f1602B = qVar;
        this.f1601A = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // i.E
    public final void a() {
        ObjectAnimator objectAnimator = this.f1607y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // i.E
    public final void f() {
        m();
    }

    @Override // i.E
    public final void h(c cVar) {
        this.f1606F = cVar;
    }

    @Override // i.E
    public final void i() {
        ObjectAnimator objectAnimator = this.f1608z;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (((l) this.f9145w).isVisible()) {
            this.f1608z.setFloatValues(this.f1605E, 1.0f);
            this.f1608z.setDuration((long) ((1.0f - this.f1605E) * 1800.0f));
            this.f1608z.start();
        }
    }

    @Override // i.E
    public final void k() {
        ObjectAnimator objectAnimator = this.f1607y;
        C0015b c0015b = f1600I;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c0015b, 0.0f, 1.0f);
            this.f1607y = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f1607y.setInterpolator(null);
            this.f1607y.setRepeatCount(-1);
            this.f1607y.addListener(new o(this, 0));
        }
        if (this.f1608z == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c0015b, 1.0f);
            this.f1608z = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f1608z.setInterpolator(null);
            this.f1608z.addListener(new o(this, 1));
        }
        m();
        this.f1607y.start();
    }

    @Override // i.E
    public final void l() {
        this.f1606F = null;
    }

    public final void m() {
        this.f1603C = 0;
        Iterator it = ((List) this.f9146x).iterator();
        while (it.hasNext()) {
            ((j) it.next()).f1579c = this.f1602B.f1553c[0];
        }
    }
}
