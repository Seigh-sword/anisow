package s1;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12578h;

    public n(int i6) {
        this.f12578h = i6;
    }

    @Override // s1.o
    public final int a(int i6, int i7, int i8, int i9) {
        switch (this.f12578h) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (b(i6, i7, i8, i9) == 1.0f) {
                    return 2;
                }
                return o.f12579a.a(i6, i7, i8, i9);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                return 2;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return o.f12585g ? 2 : 1;
        }
    }

    @Override // s1.o
    public final float b(int i6, int i7, int i8, int i9) {
        switch (this.f12578h) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return Math.min(1.0f, o.f12579a.b(i6, i7, i8, i9));
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return Math.max(i8 / i6, i9 / i7);
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                if (o.f12585g) {
                    return Math.min(i8 / i6, i9 / i7);
                }
                return Math.max(i7 / i9, i6 / i8) != 0 ? 1.0f / Integer.highestOneBit(r3) : 1.0f;
            default:
                return 1.0f;
        }
    }
}
