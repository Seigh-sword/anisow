package S3;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Number {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3259w;

    public k(String str) {
        this.f3259w = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f3259w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        Object obj2 = ((k) obj).f3259w;
        String str = this.f3259w;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f3259w);
    }

    public final int hashCode() {
        return this.f3259w.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f3259w;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f3259w;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f3259w;
    }
}
