package p1;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f12282d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12285c;

    static {
        char[] cArr = C1.n.f134a;
        f12282d = new ArrayDeque(0);
    }

    public static v a(Object obj) {
        v vVar;
        ArrayDeque arrayDeque = f12282d;
        synchronized (arrayDeque) {
            vVar = (v) arrayDeque.poll();
        }
        if (vVar == null) {
            vVar = new v();
        }
        vVar.f12285c = obj;
        vVar.f12284b = 0;
        vVar.f12283a = 0;
        return vVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f12284b == vVar.f12284b && this.f12283a == vVar.f12283a && this.f12285c.equals(vVar.f12285c);
    }

    public final int hashCode() {
        return this.f12285c.hashCode() + (((this.f12283a * 31) + this.f12284b) * 31);
    }
}
