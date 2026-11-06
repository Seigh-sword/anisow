package S3;

/* JADX INFO: loaded from: classes.dex */
public final class e implements q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3245w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3246x;

    public /* synthetic */ e(int i6, String str) {
        this.f3246x = i6;
        this.f3245w = str;
    }

    @Override // S3.q
    public Object h() {
        int i6 = this.f3246x;
        String str = this.f3245w;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new Q3.q(str);
            default:
                throw new Q3.q(str);
        }
    }

    public /* synthetic */ e(String str, int i6) {
        this.f3246x = i6;
        this.f3245w = str;
    }
}
