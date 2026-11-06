package W2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0232a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f4422y;

    public i(k kVar, int i6) {
        super(kVar.size(), i6);
        this.f4422y = kVar;
    }

    @Override // W2.AbstractC0232a
    public final Object b(int i6) {
        return this.f4422y.get(i6);
    }
}
