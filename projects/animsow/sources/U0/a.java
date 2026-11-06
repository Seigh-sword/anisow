package U0;

import H1.q;
import Z.j;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.d;
import i.C0803c;
import java.util.concurrent.Executor;
import m2.G0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f3571x;

    public a() {
        this.f3570w = 3;
        this.f3571x = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i6 = this.f3570w;
        Object obj = this.f3571x;
        switch (i6) {
            case d.f6312l /* 0 */:
                ((Handler) ((C0803c) obj).f9278y).post(runnable);
                break;
            case 1:
                ((Executor) obj).execute(new q(runnable));
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                ((G0) obj).g().A(runnable);
                break;
            default:
                ((Handler) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ a(int i6, Object obj) {
        this.f3570w = i6;
        this.f3571x = obj;
    }
}
