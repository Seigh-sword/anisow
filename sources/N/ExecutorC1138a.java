package n;

import Z.j;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1138a implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11673w;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11673w) {
            case 1:
                C1139b.I().H(runnable);
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                runnable.run();
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                runnable.run();
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                runnable.run();
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                runnable.run();
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                runnable.run();
                break;
            case 9:
                runnable.run();
                break;
            case 10:
                runnable.run();
                break;
            case 11:
                runnable.run();
                break;
            case 12:
                runnable.run();
                break;
            case 13:
                runnable.run();
                break;
            case 14:
                runnable.run();
                break;
            case 15:
                runnable.run();
                break;
            case 16:
                runnable.run();
                break;
            case 17:
                runnable.run();
                break;
            case 18:
                runnable.run();
                break;
            case 19:
                runnable.run();
                break;
        }
    }
}
