package t;

/* JADX INFO: renamed from: t.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1326i extends AbstractC1324g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C1327j f12672D;

    public C1326i(C1327j c1327j) {
        this.f12672D = c1327j;
    }

    @Override // t.AbstractC1324g
    public final String g() {
        C1325h c1325h = (C1325h) this.f12672D.f12673w.get();
        if (c1325h == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c1325h.f12668a + "]";
    }
}
