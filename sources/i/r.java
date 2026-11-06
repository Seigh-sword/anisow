package i;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9331w;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9331w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                new Thread(runnable).start();
                break;
            case 1:
                C1.n.f().post(runnable);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                runnable.run();
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
