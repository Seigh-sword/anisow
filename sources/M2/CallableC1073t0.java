package m2;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: m2.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1073t0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC1066p0 f11106e;

    public /* synthetic */ CallableC1073t0(BinderC1066p0 binderC1066p0, String str, String str2, String str3, int i6) {
        this.f11102a = i6;
        this.f11103b = str;
        this.f11104c = str2;
        this.f11105d = str3;
        this.f11106e = binderC1066p0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6 = this.f11102a;
        String str = this.f11103b;
        String str2 = this.f11105d;
        String str3 = this.f11104c;
        BinderC1066p0 binderC1066p0 = this.f11106e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                binderC1066p0.f11055c.b0();
                C1044i c1044i = binderC1066p0.f11055c.f11272y;
                x1.x(c1044i);
                return c1044i.i0(str, str3, str2);
            case 1:
                binderC1066p0.f11055c.b0();
                C1044i c1044i2 = binderC1066p0.f11055c.f11272y;
                x1.x(c1044i2);
                return c1044i2.i0(str, str3, str2);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                binderC1066p0.f11055c.b0();
                C1044i c1044i3 = binderC1066p0.f11055c.f11272y;
                x1.x(c1044i3);
                return c1044i3.I(str, str3, str2);
            default:
                binderC1066p0.f11055c.b0();
                C1044i c1044i4 = binderC1066p0.f11055c.f11272y;
                x1.x(c1044i4);
                return c1044i4.I(str, str3, str2);
        }
    }
}
