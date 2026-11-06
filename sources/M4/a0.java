package M4;

import java.lang.reflect.InvocationTargetException;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends f0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f1873A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f1874B;

    public a0(int i6, Object obj) {
        this.f1873A = i6;
        this.f1874B = obj;
    }

    @Override // M4.Y
    public final void d(Throwable th) throws IllegalAccessException, InvocationTargetException {
        int i6 = this.f1873A;
        Object obj = this.f1874B;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((Y) obj).d(th);
                break;
            case 1:
                Object objK = k().K();
                ((C0063h) obj).o(objK instanceof r ? S3.a.m(((r) objK).f1916a) : B.t(objK));
                break;
            default:
                ((InterfaceC1427e) obj).o(C1316l.f12640a);
                break;
        }
    }
}
