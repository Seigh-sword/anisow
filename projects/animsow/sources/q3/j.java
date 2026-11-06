package Q3;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2806a;

    public j(int i6) {
        this.f2806a = i6;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) {
        switch (this.f2806a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (aVar.W() != 9) {
                    return Double.valueOf(aVar.N());
                }
                aVar.S();
                return null;
            default:
                if (aVar.W() != 9) {
                    return Float.valueOf((float) aVar.N());
                }
                aVar.S();
                return null;
        }
    }

    @Override // Q3.A
    public final /* bridge */ /* synthetic */ void c(X3.b bVar, Object obj) throws IOException {
        switch (this.f2806a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                d(bVar, (Number) obj);
                break;
            default:
                d(bVar, (Number) obj);
                break;
        }
    }

    public final void d(X3.b bVar, Number number) throws IOException {
        switch (this.f2806a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    n.a(dDoubleValue);
                    bVar.M(dDoubleValue);
                } else {
                    bVar.J();
                }
                break;
            default:
                if (number != null) {
                    float fFloatValue = number.floatValue();
                    n.a(fFloatValue);
                    if (!(number instanceof Float)) {
                        number = Float.valueOf(fFloatValue);
                    }
                    bVar.P(number);
                } else {
                    bVar.J();
                }
                break;
        }
    }
}
