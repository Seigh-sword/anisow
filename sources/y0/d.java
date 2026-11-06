package y0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f13707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f13708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f13709y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f13710z;

    public d(int i6, int i7, String str, String str2) {
        this.f13707w = i6;
        this.f13708x = i7;
        this.f13709y = str;
        this.f13710z = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int i6 = this.f13707w - dVar.f13707w;
        return i6 == 0 ? this.f13708x - dVar.f13708x : i6;
    }
}
