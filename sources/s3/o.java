package S3;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Map.Entry {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public o f3267A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f3268B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f3269C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Object f3270D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f3271E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f3272w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o f3273x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f3274y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f3275z;

    public o(boolean z5) {
        this.f3268B = null;
        this.f3269C = z5;
        this.f3267A = this;
        this.f3275z = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f3268B;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f3270D;
        Object value = entry.getValue();
        if (obj3 == null) {
            if (value != null) {
                return false;
            }
        } else if (!obj3.equals(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3268B;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3270D;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3268B;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3270D;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f3269C) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f3270D;
        this.f3270D = obj;
        return obj2;
    }

    public final String toString() {
        return this.f3268B + "=" + this.f3270D;
    }

    public o(boolean z5, o oVar, Object obj, o oVar2, o oVar3) {
        this.f3272w = oVar;
        this.f3268B = obj;
        this.f3269C = z5;
        this.f3271E = 1;
        this.f3275z = oVar2;
        this.f3267A = oVar3;
        oVar3.f3275z = this;
        oVar2.f3267A = this;
    }
}
