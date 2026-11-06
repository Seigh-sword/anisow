package H4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f1071w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f1072x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1073y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f1074z;

    public e(long j6, long j7, long j8) {
        this.f1071w = j8;
        this.f1072x = j7;
        boolean z5 = true;
        if (j8 <= 0 ? j6 < j7 : j6 > j7) {
            z5 = false;
        }
        this.f1073y = z5;
        this.f1074z = z5 ? j6 : j7;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        long j6 = this.f1074z;
        if (j6 != this.f1072x) {
            this.f1074z = this.f1071w + j6;
        } else {
            if (!this.f1073y) {
                throw new NoSuchElementException();
            }
            this.f1073y = false;
        }
        return Long.valueOf(j6);
    }

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1073y;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
