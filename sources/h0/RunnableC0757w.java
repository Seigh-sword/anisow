package h0;

import android.view.ViewGroup;

/* JADX INFO: renamed from: h0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0757w implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0734B f8923x;

    public /* synthetic */ RunnableC0757w(int i6, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        this.f8922w = i6;
        this.f8923x = abstractComponentCallbacksC0734B;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        W w5;
        int i6 = this.f8922w;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8923x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (abstractComponentCallbacksC0734B.f8621f0 != null) {
                    abstractComponentCallbacksC0734B.j().getClass();
                }
                break;
            default:
                if (abstractComponentCallbacksC0734B.f8618c0 != null && (viewGroup = abstractComponentCallbacksC0734B.f8617b0) != null && (w5 = abstractComponentCallbacksC0734B.f8605P) != null) {
                    u0 u0VarM = u0.m(viewGroup, w5);
                    u0VarM.o();
                    u0VarM.i();
                    break;
                }
                break;
        }
    }
}
