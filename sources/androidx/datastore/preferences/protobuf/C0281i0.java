package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0281i0 implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0266b f5455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f5457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5458d;

    public C0281i0(C c6, String str, Object[] objArr) {
        char cCharAt;
        this.f5455a = c6;
        this.f5456b = str;
        this.f5457c = objArr;
        int iCharAt = str.charAt(0);
        if (iCharAt >= 55296) {
            int i6 = iCharAt & 8191;
            int i7 = 1;
            int i8 = 13;
            while (true) {
                int i9 = i7 + 1;
                cCharAt = str.charAt(i7);
                if (cCharAt < 55296) {
                    break;
                }
                i6 |= (cCharAt & 8191) << i8;
                i8 += 13;
                i7 = i9;
            }
            iCharAt = i6 | (cCharAt << i8);
        }
        this.f5458d = iCharAt;
    }

    public final AbstractC0266b a() {
        return this.f5455a;
    }

    public final Object[] b() {
        return this.f5457c;
    }

    public final String c() {
        return this.f5456b;
    }

    public final int d() {
        return (this.f5458d & 1) == 1 ? 1 : 2;
    }
}
