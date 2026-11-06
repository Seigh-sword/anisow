package h0;

import android.util.Log;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: h0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0747l implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s0 f8840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0750o f8841y;

    public /* synthetic */ RunnableC0747l(s0 s0Var, C0750o c0750o, int i6) {
        this.f8839w = i6;
        this.f8840x = s0Var;
        this.f8841y = c0750o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f8839w;
        C0750o c0750o = this.f8841y;
        s0 s0Var = this.f8840x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(s0Var, "$operation");
                AbstractC1305a.o(c0750o, "this$0");
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + s0Var + " has completed");
                }
                s0Var.c(c0750o);
                break;
            default:
                AbstractC1305a.o(s0Var, "$operation");
                AbstractC1305a.o(c0750o, "this$0");
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + s0Var + " has completed");
                }
                s0Var.c(c0750o);
                break;
        }
    }
}
