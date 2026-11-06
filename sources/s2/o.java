package S2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import m.C0964h0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f3176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f3177e;

    public o(q qVar, int i6, TextView textView, int i7, TextView textView2) {
        this.f3177e = qVar;
        this.f3173a = i6;
        this.f3174b = textView;
        this.f3175c = i7;
        this.f3176d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0964h0 c0964h0;
        int i6 = this.f3173a;
        q qVar = this.f3177e;
        qVar.f3194n = i6;
        qVar.f3192l = null;
        TextView textView = this.f3174b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f3175c == 1 && (c0964h0 = qVar.f3198r) != null) {
                c0964h0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f3176d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f3176d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
