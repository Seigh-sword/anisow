package Z;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0280i;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0281i0;
import androidx.datastore.preferences.protobuf.C0282j;
import androidx.datastore.preferences.protobuf.InterfaceC0273e0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends C {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC0273e0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        C.m(j.class, jVar);
    }

    public static i G() {
        return (i) ((A) DEFAULT_INSTANCE.f(5));
    }

    public static void o(j jVar, long j6) {
        jVar.valueCase_ = 4;
        jVar.value_ = Long.valueOf(j6);
    }

    public static void p(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        jVar.valueCase_ = 5;
        jVar.value_ = str;
    }

    public static void q(j jVar, h hVar) {
        jVar.getClass();
        jVar.value_ = hVar;
        jVar.valueCase_ = 6;
    }

    public static void r(j jVar, double d6) {
        jVar.valueCase_ = 7;
        jVar.value_ = Double.valueOf(d6);
    }

    public static void s(j jVar, C0282j c0282j) {
        jVar.getClass();
        jVar.valueCase_ = 8;
        jVar.value_ = c0282j;
    }

    public static void t(j jVar, boolean z5) {
        jVar.valueCase_ = 1;
        jVar.value_ = Boolean.valueOf(z5);
    }

    public static void u(j jVar, float f6) {
        jVar.valueCase_ = 2;
        jVar.value_ = Float.valueOf(f6);
    }

    public static void v(j jVar, int i6) {
        jVar.valueCase_ = 3;
        jVar.value_ = Integer.valueOf(i6);
    }

    public static j y() {
        return DEFAULT_INSTANCE;
    }

    public final float A() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int B() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long C() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String D() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final h E() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.p();
    }

    public final int F() {
        switch (this.valueCase_) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object f(int i6) {
        switch (u.h.b(i6)) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new C0281i0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001်\u0000\u0002ဴ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဳ\u0000\bွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", h.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new j();
            case LONG_FIELD_NUMBER /* 4 */:
                return new i(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0273e0 b6 = PARSER;
                if (b6 == null) {
                    synchronized (j.class) {
                        try {
                            b6 = PARSER;
                            if (b6 == null) {
                                b6 = new B();
                                PARSER = b6;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return b6;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean w() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final AbstractC0280i x() {
        return this.valueCase_ == 8 ? (AbstractC0280i) this.value_ : AbstractC0280i.f5452x;
    }

    public final double z() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
