package o0;

import d.AbstractC0628i;
import java.util.Arrays;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y1 f12161d = new y1(0, t4.p.f12756w);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12164c;

    public y1(int i6, List list) {
        AbstractC1305a.o(list, "data");
        this.f12162a = new int[]{i6};
        this.f12163b = list;
        this.f12164c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y1.class != obj.getClass()) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Arrays.equals(this.f12162a, y1Var.f12162a) && AbstractC1305a.c(this.f12163b, y1Var.f12163b) && this.f12164c == y1Var.f12164c && AbstractC1305a.c(null, null);
    }

    public final int hashCode() {
        return (((this.f12163b.hashCode() + (Arrays.hashCode(this.f12162a) * 31)) * 31) + this.f12164c) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.f12162a));
        sb.append(", data=");
        sb.append(this.f12163b);
        sb.append(", hintOriginalPageOffset=");
        return AbstractC0628i.l(sb, this.f12164c, ", hintOriginalIndices=null)");
    }
}
