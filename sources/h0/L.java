package h0;

import android.util.Log;
import d.AbstractC0641v;
import d.RunnableC0632m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0641v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8666d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(W0.b bVar) {
        super(true);
        this.f8667e = bVar;
    }

    @Override // d.AbstractC0641v
    public final void a() {
        switch (this.f8666d) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                Object obj = this.f8667e;
                if (zIsLoggable) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + ((W) obj));
                }
                W w5 = (W) obj;
                w5.getClass();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + w5.f8702h);
                }
                C0736a c0736a = w5.f8702h;
                if (c0736a != null) {
                    c0736a.f8753r = false;
                    RunnableC0632m runnableC0632m = new RunnableC0632m(9, w5);
                    if (c0736a.f8751p == null) {
                        c0736a.f8751p = new ArrayList();
                    }
                    c0736a.f8751p.add(runnableC0632m);
                    w5.f8702h.d(false, true);
                    w5.f8703i = true;
                    w5.z(true);
                    w5.E();
                    w5.f8703i = false;
                    w5.f8702h = null;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(W w5) {
        super(false);
        this.f8667e = w5;
    }
}
