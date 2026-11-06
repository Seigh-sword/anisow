package D0;

import J3.G;
import M4.J;
import android.view.animation.Animation;
import androidx.lifecycle.U;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c1.C0365f;
import c1.C0367h;
import c1.C0370k;
import c1.C0373n;
import c1.t;
import com.android.app.activities.CategoryActivity;
import com.android.app.activities.PostActivity;
import g1.C0720f;
import g1.C0721g;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f283b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i6) {
        this.f282a = i6;
        this.f283b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        int i6 = this.f282a;
        SwipeRefreshLayout swipeRefreshLayout = this.f283b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!swipeRefreshLayout.f5820y) {
                    swipeRefreshLayout.f();
                } else {
                    swipeRefreshLayout.f5808U.setAlpha(255);
                    swipeRefreshLayout.f5808U.start();
                    if (swipeRefreshLayout.f5813c0 && (jVar = swipeRefreshLayout.f5819x) != null) {
                        G g4 = (G) jVar;
                        int i7 = g4.f1362w;
                        Object obj = g4.f1363x;
                        switch (i7) {
                            case 1:
                                CategoryActivity categoryActivity = (CategoryActivity) obj;
                                int i8 = CategoryActivity.f6265g0;
                                AbstractC1305a.o(categoryActivity, "this$0");
                                categoryActivity.q();
                                break;
                            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            default:
                                t tVar = (t) obj;
                                int i9 = t.f6226I0;
                                AbstractC1305a.o(tVar, "this$0");
                                tVar.X();
                                break;
                            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                                PostActivity postActivity = (PostActivity) obj;
                                int i10 = PostActivity.f6281j0;
                                AbstractC1305a.o(postActivity, "this$0");
                                postActivity.q();
                                break;
                            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                                C0365f c0365f = (C0365f) obj;
                                int i11 = C0365f.E0;
                                AbstractC1305a.o(c0365f, "this$0");
                                c0365f.W();
                                break;
                            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                                C0367h c0367h = (C0367h) obj;
                                int i12 = C0367h.f6192F0;
                                AbstractC1305a.o(c0367h, "this$0");
                                C0721g c0721g = (C0721g) c0367h.f6195C0.getValue();
                                c0721g.getClass();
                                S3.a.B(U.e(c0721g), J.f1852b, null, new C0720f(c0721g, null), 2);
                                break;
                            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                C0370k c0370k = (C0370k) obj;
                                int i13 = C0370k.E0;
                                AbstractC1305a.o(c0370k, "this$0");
                                c0370k.X();
                                break;
                            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                C0373n c0373n = (C0373n) obj;
                                int i14 = C0373n.E0;
                                AbstractC1305a.o(c0373n, "this$0");
                                c0373n.X();
                                break;
                        }
                    }
                    swipeRefreshLayout.f5796I = swipeRefreshLayout.f5802O.getTop();
                }
                break;
            default:
                swipeRefreshLayout.getClass();
                g gVar = new g(swipeRefreshLayout, 1);
                swipeRefreshLayout.f5810W = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout.f5802O;
                aVar.f246w = null;
                aVar.clearAnimation();
                swipeRefreshLayout.f5802O.startAnimation(swipeRefreshLayout.f5810W);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
