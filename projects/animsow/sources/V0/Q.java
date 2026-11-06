package v0;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1397f0 f13059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13060b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f13061c = new Rect();

    public Q(AbstractC1397f0 abstractC1397f0) {
        this.f13059a = abstractC1397f0;
    }

    public static P a(AbstractC1397f0 abstractC1397f0, int i6) {
        if (i6 == 0) {
            return new P(abstractC1397f0, 0);
        }
        if (i6 == 1) {
            return new P(abstractC1397f0, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public final int h() {
        if (Integer.MIN_VALUE == this.f13060b) {
            return 0;
        }
        return g() - this.f13060b;
    }

    public abstract int i(View view);

    public abstract int j(View view);

    public abstract void k(int i6);
}
