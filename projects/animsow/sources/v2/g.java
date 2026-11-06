package V2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile e f3737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f3738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f3739y;

    @Override // V2.e
    public final Object get() {
        if (!this.f3738x) {
            synchronized (this) {
                try {
                    if (!this.f3738x) {
                        e eVar = this.f3737w;
                        Objects.requireNonNull(eVar);
                        Object obj = eVar.get();
                        this.f3739y = obj;
                        this.f3738x = true;
                        this.f3737w = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f3739y;
    }

    public final String toString() {
        Object string = this.f3737w;
        if (string == null) {
            String strValueOf = String.valueOf(this.f3739y);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
