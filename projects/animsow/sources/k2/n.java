package K2;

import F0.C0015b;
import android.animation.ObjectAnimator;
import i.E;
import j0.C0840b;
import java.util.List;
import m.C0955d;

/* JADX INFO: loaded from: classes.dex */
public final class n extends E {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0015b f1589E = new C0015b(Float.class, "animationFraction", 12);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final q f1590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f1591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f1592C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f1593D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ObjectAnimator f1594y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0840b f1595z;

    public n(q qVar) {
        super(3);
        this.f1591B = 1;
        this.f1590A = qVar;
        this.f1595z = new C0840b();
    }

    @Override // i.E
    public final void a() {
        ObjectAnimator objectAnimator = this.f1594y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // i.E
    public final void f() {
        m();
    }

    @Override // i.E
    public final void k() {
        if (this.f1594y == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1589E, 0.0f, 1.0f);
            this.f1594y = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f1594y.setInterpolator(null);
            this.f1594y.setRepeatCount(-1);
            this.f1594y.addListener(new C0955d(8, this));
        }
        m();
        this.f1594y.start();
    }

    public final void m() {
        this.f1592C = true;
        this.f1591B = 1;
        for (j jVar : (List) this.f9146x) {
            q qVar = this.f1590A;
            jVar.f1579c = qVar.f1553c[0];
            jVar.f1580d = qVar.f1557g / 2;
        }
    }

    @Override // i.E
    public final void i() {
    }

    @Override // i.E
    public final void l() {
    }

    @Override // i.E
    public final void h(c cVar) {
    }
}
