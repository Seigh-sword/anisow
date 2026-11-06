package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements M2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f6650a = new O0();

    @Override // com.google.android.gms.internal.measurement.M2
    public final boolean d(int i6) {
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
            case 1:
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return true;
            default:
                return false;
        }
    }
}
