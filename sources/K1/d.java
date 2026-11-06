package K1;

/* JADX INFO: loaded from: classes.dex */
public enum d implements z3.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1525w;

    d(int i6) {
        this.f1525w = i6;
    }

    @Override // z3.c
    public final int a() {
        return this.f1525w;
    }
}
