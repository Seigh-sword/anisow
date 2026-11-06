package K3;

/* JADX INFO: loaded from: classes.dex */
public enum c implements z3.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1622w;

    c(int i6) {
        this.f1622w = i6;
    }

    @Override // z3.c
    public final int a() {
        return this.f1622w;
    }
}
