package t;

/* JADX INFO: renamed from: t.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1319b extends Throwable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12647w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1319b(int i6, String str) {
        super(str);
        this.f12647w = i6;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f12647w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                synchronized (this) {
                }
                return this;
            case 1:
                synchronized (this) {
                }
                return this;
            default:
                synchronized (this) {
                }
                return this;
        }
    }
}
