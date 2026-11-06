package K2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends L.i {
    /* JADX WARN: Illegal instructions before constructor call */
    public f(int i6) {
        int i7 = 12;
        if (i6 != 1) {
            super(new I0.o(i7));
        } else {
            super(new V0.m(i7));
        }
    }

    @Override // L.i
    public float i(Object obj) {
        return ((g) obj).f1562K.f1578b * 10000.0f;
    }

    @Override // L.i
    public void m(Object obj, float f6) {
        g gVar = (g) obj;
        gVar.f1562K.f1578b = f6 / 10000.0f;
        gVar.invalidateSelf();
    }
}
