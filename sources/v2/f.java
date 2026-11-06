package V2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f3734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile transient boolean f3735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public transient Object f3736y;

    public f(e eVar) {
        this.f3734w = eVar;
    }

    @Override // V2.e
    public final Object get() {
        if (!this.f3735x) {
            synchronized (this) {
                try {
                    if (!this.f3735x) {
                        Object obj = this.f3734w.get();
                        this.f3736y = obj;
                        this.f3735x = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f3736y;
    }

    public final String toString() {
        Object string;
        if (this.f3735x) {
            String strValueOf = String.valueOf(this.f3736y);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f3734w;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
