package j3;

/* JADX INFO: renamed from: j3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0848A implements S3.q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f9447x;

    public C0848A() {
        this.f9446w = 0;
    }

    @Override // S3.q
    public final Object h() {
        throw new Q3.q(this.f9447x);
    }

    public final String toString() {
        switch (this.f9446w) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "<" + this.f9447x + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0848A(int i6, String str) {
        this.f9446w = i6;
        this.f9447x = str;
    }
}
