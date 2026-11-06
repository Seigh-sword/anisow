package W2;

import java.util.Map;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Map.Entry {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f4407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4408x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f4409y;

    public e(g gVar, int i6) {
        this.f4409y = gVar;
        Object obj = g.f4411F;
        this.f4407w = gVar.i()[i6];
        this.f4408x = i6;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C0.d(getKey(), entry.getKey()) && C0.d(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    public final void d() {
        int i6 = this.f4408x;
        Object obj = this.f4407w;
        g gVar = this.f4409y;
        if (i6 != -1 && i6 < gVar.size()) {
            if (C0.d(obj, gVar.i()[this.f4408x])) {
                return;
            }
        }
        Object obj2 = g.f4411F;
        this.f4408x = gVar.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4407w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        g gVar = this.f4409y;
        Map mapB = gVar.b();
        if (mapB != null) {
            return mapB.get(this.f4407w);
        }
        d();
        int i6 = this.f4408x;
        if (i6 == -1) {
            return null;
        }
        return gVar.j()[i6];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        g gVar = this.f4409y;
        Map mapB = gVar.b();
        Object obj2 = this.f4407w;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        d();
        int i6 = this.f4408x;
        if (i6 == -1) {
            gVar.put(obj2, obj);
            return null;
        }
        Object obj3 = gVar.j()[i6];
        gVar.j()[this.f4408x] = obj;
        return obj3;
    }
}
