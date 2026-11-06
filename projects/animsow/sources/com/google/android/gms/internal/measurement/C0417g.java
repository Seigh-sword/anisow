package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0417g implements InterfaceC0459n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Double f6815w;

    public C0417g(Double d6) {
        if (d6 == null) {
            this.f6815w = Double.valueOf(Double.NaN);
        } else {
            this.f6815w = d6;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Boolean c() {
        Double d6 = this.f6815w;
        return Boolean.valueOf((Double.isNaN(d6.doubleValue()) || d6.doubleValue() == 0.0d) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0417g) {
            return this.f6815w.equals(((C0417g) obj).f6815w);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n f() {
        return new C0417g(this.f6815w);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final String g() {
        Double d6 = this.f6815w;
        if (Double.isNaN(d6.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d6.doubleValue())) {
            return d6.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d6.doubleValue());
        BigDecimal bigDecimal = (bigDecimalValueOf.signum() == 0 || bigDecimalValueOf.signum() == 0) ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i6 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i6 >= 0 || i6 <= -7) && (i6 < 0 || i6 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.f6815w.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n j(String str, P0.h hVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C0471p(g());
        }
        throw new IllegalArgumentException(g() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Double p() {
        return this.f6815w;
    }

    public final String toString() {
        return g();
    }
}
