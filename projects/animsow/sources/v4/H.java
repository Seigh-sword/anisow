package V4;

import f5.C0710g;

/* JADX INFO: loaded from: classes.dex */
public final class H extends J {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f3790A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3791x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f3792y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f5.i f3793z;

    public H(t tVar, long j6, C0710g c0710g) {
        this.f3790A = tVar;
        this.f3792y = j6;
        this.f3793z = c0710g;
    }

    @Override // V4.J
    public final long b() {
        return this.f3792y;
    }

    @Override // V4.J
    public final t c() {
        int i6 = this.f3791x;
        Object obj = this.f3790A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (t) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                try {
                    return t.a(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }

    @Override // V4.J
    public final f5.i g() {
        return this.f3793z;
    }

    public H(String str, long j6, f5.y yVar) {
        this.f3790A = str;
        this.f3792y = j6;
        this.f3793z = yVar;
    }
}
