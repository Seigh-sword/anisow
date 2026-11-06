package w0;

/* JADX INFO: renamed from: w0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1447b extends t {
    public abstract void d(B0.g gVar, Object obj);

    public final void e(Object obj) {
        B0.g gVarA = a();
        try {
            d(gVarA, obj);
            gVarA.f76x.executeInsert();
        } finally {
            c(gVarA);
        }
    }
}
