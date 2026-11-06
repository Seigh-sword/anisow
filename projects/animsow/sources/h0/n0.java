package h0;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8856x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0734B f8857y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i6, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        super(0);
        this.f8856x = i6;
        this.f8857y = abstractComponentCallbacksC0734B;
    }

    @Override // C4.a
    public final Object b() {
        int i6 = this.f8856x;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8857y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return abstractComponentCallbacksC0734B.f();
            case 1:
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
            default:
                return abstractComponentCallbacksC0734B;
        }
    }
}
