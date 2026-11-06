package Z;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0277g0;
import androidx.datastore.preferences.protobuf.C0281i0;
import androidx.datastore.preferences.protobuf.C0286l;
import androidx.datastore.preferences.protobuf.C0289n;
import androidx.datastore.preferences.protobuf.C0294t;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.InterfaceC0273e0;
import androidx.datastore.preferences.protobuf.InterfaceC0283j0;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.s0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends C {
    private static final f DEFAULT_INSTANCE;
    private static volatile InterfaceC0273e0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private U preferences_ = U.f5412x;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        C.m(f.class, fVar);
    }

    public static U o(f fVar) {
        U u5 = fVar.preferences_;
        if (!u5.f5413w) {
            fVar.preferences_ = u5.d();
        }
        return fVar.preferences_;
    }

    public static d q() {
        return (d) ((A) DEFAULT_INSTANCE.f(5));
    }

    public static f r(InputStream inputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0286l c0286l = new C0286l(inputStream);
        C0294t c0294tA = C0294t.a();
        C cL = fVar.l();
        try {
            C0277g0 c0277g0 = C0277g0.f5444c;
            c0277g0.getClass();
            InterfaceC0283j0 interfaceC0283j0A = c0277g0.a(cL.getClass());
            C0289n c0289n = c0286l.f5489d;
            if (c0289n == null) {
                c0289n = new C0289n();
                c0289n.f5492c = 0;
                Charset charset = F.f5369a;
                c0289n.f5493d = c0286l;
                c0286l.f5489d = c0289n;
            }
            interfaceC0283j0A.b(cL, c0289n, c0294tA);
            interfaceC0283j0A.h(cL);
            if (C.i(cL, true)) {
                return (f) cL;
            }
            throw new H(new s0().getMessage());
        } catch (H e6) {
            if (e6.f5372w) {
                throw new H(e6.getMessage(), e6);
            }
            throw e6;
        } catch (s0 e7) {
            throw new H(e7.getMessage());
        } catch (IOException e8) {
            if (e8.getCause() instanceof H) {
                throw ((H) e8.getCause());
            }
            throw new H(e8.getMessage(), e8);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof H) {
                throw ((H) e9.getCause());
            }
            throw e9;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object f(int i6) {
        switch (u.h.b(i6)) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0281i0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f4912a});
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return new f();
            case j.LONG_FIELD_NUMBER /* 4 */:
                return new d(DEFAULT_INSTANCE);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0273e0 b6 = PARSER;
                if (b6 == null) {
                    synchronized (f.class) {
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

    public final Map p() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
