package o0;

import java.util.ArrayList;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends m3.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11830c;

    public Q0(int i6, int i7, ArrayList arrayList) {
        this.f11828a = arrayList;
        this.f11829b = i6;
        this.f11830c = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q0) {
            Q0 q02 = (Q0) obj;
            if (AbstractC1305a.c(this.f11828a, q02.f11828a) && this.f11829b == q02.f11829b && this.f11830c == q02.f11830c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11830c) + Integer.hashCode(this.f11829b) + this.f11828a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
        List list = this.f11828a;
        sb.append(list.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(t4.n.c0(list));
        sb.append("\n                    |   last item: ");
        sb.append(t4.n.h0(list));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f11829b);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f11830c);
        sb.append("\n                    |)\n                    |");
        return S3.a.Q(sb.toString());
    }
}
