package m3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: m3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1102h0 extends I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11523b;

    public C1102h0(String str, String str2) {
        this.f11522a = str;
        this.f11523b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return this.f11522a.equals(((C1102h0) i02).f11522a) && this.f11523b.equals(((C1102h0) i02).f11523b);
    }

    public final int hashCode() {
        return ((this.f11522a.hashCode() ^ 1000003) * 1000003) ^ this.f11523b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f11522a);
        sb.append(", variantId=");
        return AbstractC0628i.m(sb, this.f11523b, "}");
    }
}
