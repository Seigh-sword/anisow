package Q3;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p implements Iterable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f2817w = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f2817w.equals(this.f2817w));
    }

    public final int hashCode() {
        return this.f2817w.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2817w.iterator();
    }
}
