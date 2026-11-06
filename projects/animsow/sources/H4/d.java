package H4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterable, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f1068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f1069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f1070y;

    public d(long j6, long j7) {
        this.f1068w = j6;
        if (j6 < j7) {
            long j8 = j7 % 1;
            long j9 = j6 % 1;
            long j10 = ((j8 < 0 ? j8 + 1 : j8) - (j9 < 0 ? j9 + 1 : j9)) % 1;
            j7 -= j10 < 0 ? j10 + 1 : j10;
        }
        this.f1069x = j7;
        this.f1070y = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f1068w, this.f1069x, this.f1070y);
    }
}
