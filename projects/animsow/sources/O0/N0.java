package o0;

import java.util.ArrayList;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends m3.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11816d;

    public N0(int i6, ArrayList arrayList, int i7, int i8) {
        this.f11813a = i6;
        this.f11814b = arrayList;
        this.f11815c = i7;
        this.f11816d = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N0) {
            N0 n02 = (N0) obj;
            if (this.f11813a == n02.f11813a && AbstractC1305a.c(this.f11814b, n02.f11814b) && this.f11815c == n02.f11815c && this.f11816d == n02.f11816d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11816d) + Integer.hashCode(this.f11815c) + this.f11814b.hashCode() + Integer.hashCode(this.f11813a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
        List list = this.f11814b;
        sb.append(list.size());
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.f11813a);
        sb.append("\n                    |   first item: ");
        sb.append(t4.n.c0(list));
        sb.append("\n                    |   last item: ");
        sb.append(t4.n.h0(list));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f11815c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f11816d);
        sb.append("\n                    |)\n                    |");
        return S3.a.Q(sb.toString());
    }
}
