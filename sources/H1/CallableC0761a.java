package h1;

import com.google.android.gms.internal.measurement.O2;
import java.util.concurrent.Callable;
import m2.C1033e0;

/* JADX INFO: renamed from: h1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0761a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8940b;

    public /* synthetic */ CallableC0761a(int i6, Object obj) {
        this.f8939a = i6;
        this.f8940b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8939a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                synchronized (((C0765e) this.f8940b)) {
                    try {
                        Object obj = this.f8940b;
                        if (((C0765e) obj).f8958E != null) {
                            ((C0765e) obj).O();
                            if (((C0765e) this.f8940b).n()) {
                                ((C0765e) this.f8940b).M();
                                ((C0765e) this.f8940b).f8960G = 0;
                            }
                        }
                    } finally {
                    }
                    break;
                }
                return null;
            default:
                return new O2(((C1033e0) this.f8940b).f10894G);
        }
    }
}
