package R4;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class x extends D4.i implements C4.p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x f3045y = new x(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x f3046z = new x(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final x f3044A = new x(2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i6) {
        super(2);
        this.f3047x = i6;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f3047x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return obj;
            case 1:
                AbstractC0628i.p(obj);
                return null;
            default:
                return (z) obj;
        }
    }
}
