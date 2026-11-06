package I1;

import android.content.Context;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P1.a f1122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P1.a f1123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1124d;

    public b(Context context, P1.a aVar, P1.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f1121a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f1122b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f1123c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f1124d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1121a.equals(((b) cVar).f1121a)) {
            b bVar = (b) cVar;
            if (this.f1122b.equals(bVar.f1122b) && this.f1123c.equals(bVar.f1123c) && this.f1124d.equals(bVar.f1124d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f1121a.hashCode() ^ 1000003) * 1000003) ^ this.f1122b.hashCode()) * 1000003) ^ this.f1123c.hashCode()) * 1000003) ^ this.f1124d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f1121a);
        sb.append(", wallClock=");
        sb.append(this.f1122b);
        sb.append(", monotonicClock=");
        sb.append(this.f1123c);
        sb.append(", backendName=");
        return AbstractC0628i.m(sb, this.f1124d, "}");
    }
}
