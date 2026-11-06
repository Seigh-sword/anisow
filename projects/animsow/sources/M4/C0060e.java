package M4;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: M4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0060e implements InterfaceC0061f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1882b;

    public /* synthetic */ C0060e(int i6, Object obj) {
        this.f1881a = i6;
        this.f1882b = obj;
    }

    public final String toString() {
        int i6 = this.f1881a;
        Object obj = this.f1882b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((C4.l) obj).getClass().getSimpleName() + '@' + B.d(this) + ']';
            default:
                return "DisposeOnCancel[" + ((K) obj) + ']';
        }
    }
}
