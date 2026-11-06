package K3;

/* JADX INFO: loaded from: classes.dex */
public enum a implements z3.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1615w;

    a(int i6) {
        this.f1615w = i6;
    }

    @Override // z3.c
    public final int a() {
        return this.f1615w;
    }
}
