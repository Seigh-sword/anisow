package h0;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class G implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8656w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f8657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8658y;

    public G(H h4, c0 c0Var) {
        this.f8658y = h4;
        this.f8657x = c0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i6 = this.f8656w;
        Object obj = this.f8658y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0 c0Var = this.f8657x;
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
                c0Var.k();
                u0.m((ViewGroup) abstractComponentCallbacksC0734B.f8618c0.getParent(), ((H) obj).f8659w).l();
                break;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = N.V.f1964a;
                N.G.c(view2);
                break;
        }
    }

    public G(c0 c0Var, View view) {
        this.f8657x = c0Var;
        this.f8658y = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
