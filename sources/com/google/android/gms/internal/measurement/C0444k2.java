package com.google.android.gms.internal.measurement;

import android.util.Log;
import d.AbstractC0628i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0444k2 extends AbstractC0420g2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6858k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0444k2(C0450l2 c0450l2, String str, Object obj, int i6) {
        super(c0450l2, str, obj);
        this.f6858k = i6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0420g2
    public final Object c(Object obj) {
        String strI = this.f6822b;
        C0450l2 c0450l2 = this.f6821a;
        switch (this.f6858k) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String str = c0450l2.f6869d;
                if (str == null || !str.isEmpty()) {
                    strI = AbstractC0628i.i(str, strI);
                }
                Log.e("PhenotypeFlag", "Invalid long value for " + strI + ": " + String.valueOf(obj));
                return null;
            case 1:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String str2 = c0450l2.f6869d;
                if (str2 == null || !str2.isEmpty()) {
                    strI = AbstractC0628i.i(str2, strI);
                }
                Log.e("PhenotypeFlag", "Invalid double value for " + strI + ": " + String.valueOf(obj));
                return null;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (R1.f6672c.matcher(str3).matches()) {
                        return Boolean.TRUE;
                    }
                    if (R1.f6673d.matcher(str3).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String str4 = c0450l2.f6869d;
                if (str4 == null || !str4.isEmpty()) {
                    strI = AbstractC0628i.i(str4, strI);
                }
                Log.e("PhenotypeFlag", "Invalid boolean value for " + strI + ": " + String.valueOf(obj));
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }
}
