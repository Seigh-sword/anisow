package D4;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n implements I4.d {
    @Override // D4.b
    public final I4.a a() {
        s.f378a.getClass();
        return this;
    }

    public final void e() {
        if (this.f373C) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        I4.a aVarD = d();
        if (aVarD == this) {
            throw new B4.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((l) ((I4.d) ((I4.f) aVarD))).e();
    }

    @Override // C4.l
    public final Object j(Object obj) {
        e();
        throw null;
    }
}
