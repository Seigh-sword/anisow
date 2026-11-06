package K3;

/* JADX INFO: loaded from: classes.dex */
public enum b implements z3.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1619w;

    b(int i6) {
        this.f1619w = i6;
    }

    @Override // z3.c
    public final int a() {
        return this.f1619w;
    }
}
