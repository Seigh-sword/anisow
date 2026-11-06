package Q3;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t extends p {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Serializable f2820w;

    public t(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f2820w = bool;
    }

    public static boolean e(t tVar) {
        Serializable serializable = tVar.f2820w;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number b() {
        Serializable serializable = this.f2820w;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new S3.k((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String c() {
        Serializable serializable = this.f2820w;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        Serializable serializable = this.f2820w;
        Serializable serializable2 = tVar.f2820w;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (e(this) && e(tVar)) {
            return b().longValue() == tVar.b().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = b().doubleValue();
        double dDoubleValue2 = tVar.b().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f2820w;
        if (serializable == null) {
            return 31;
        }
        if (e(this)) {
            jDoubleToLongBits = b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public t(Number number) {
        Objects.requireNonNull(number);
        this.f2820w = number;
    }

    public t(String str) {
        Objects.requireNonNull(str);
        this.f2820w = str;
    }
}
