package N3;

/* JADX INFO: renamed from: N3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0133t implements y3.f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2270w;

    EnumC0133t(int i6) {
        this.f2270w = i6;
    }

    @Override // y3.f
    public final int a() {
        return this.f2270w;
    }
}
