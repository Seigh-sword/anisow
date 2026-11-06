package a0;

import W.C0183b;
import androidx.datastore.preferences.protobuf.AbstractC0280i;
import androidx.datastore.preferences.protobuf.AbstractC0292q;
import androidx.datastore.preferences.protobuf.C0282j;
import androidx.datastore.preferences.protobuf.C0291p;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.H;
import f5.C0709f;
import f5.x;
import f5.y;
import h0.C0733A;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import s4.AbstractC1305a;
import t4.n;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Y.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f4995a = new k();

    public final C0254b a(y yVar) throws C0183b {
        f fVar;
        Object objValueOf;
        try {
            Z.f fVarR = Z.f.r(yVar.I());
            C0254b c0254b = new C0254b(false);
            g[] gVarArr = (g[]) Arrays.copyOf(new g[0], 0);
            AbstractC1305a.o(gVarArr, "pairs");
            c0254b.c();
            if (gVarArr.length > 0) {
                g gVar = gVarArr[0];
                throw null;
            }
            Map mapP = fVarR.p();
            AbstractC1305a.n(mapP, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapP.entrySet()) {
                String str = (String) entry.getKey();
                Z.j jVar = (Z.j) entry.getValue();
                AbstractC1305a.n(str, "name");
                AbstractC1305a.n(jVar, "value");
                int iF = jVar.F();
                switch (iF == 0 ? -1 : j.f4994a[u.h.b(iF)]) {
                    case -1:
                        throw new C0183b("Value case is null.", null);
                    case com.bumptech.glide.d.f6312l /* 0 */:
                    default:
                        throw new C0733A();
                    case 1:
                        fVar = new f(str);
                        objValueOf = Boolean.valueOf(jVar.w());
                        break;
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                        fVar = new f(str);
                        objValueOf = Float.valueOf(jVar.A());
                        break;
                    case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                        fVar = new f(str);
                        objValueOf = Double.valueOf(jVar.z());
                        break;
                    case Z.j.LONG_FIELD_NUMBER /* 4 */:
                        fVar = new f(str);
                        objValueOf = Integer.valueOf(jVar.B());
                        break;
                    case Z.j.STRING_FIELD_NUMBER /* 5 */:
                        fVar = new f(str);
                        objValueOf = Long.valueOf(jVar.C());
                        break;
                    case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        fVar = new f(str);
                        objValueOf = jVar.D();
                        AbstractC1305a.n(objValueOf, "value.string");
                        break;
                    case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        fVar = new f(str);
                        E eQ = jVar.E().q();
                        AbstractC1305a.n(eQ, "value.stringSet.stringsList");
                        objValueOf = n.m0(eQ);
                        break;
                    case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                        fVar = new f(str);
                        AbstractC0280i abstractC0280iX = jVar.x();
                        int size = abstractC0280iX.size();
                        if (size == 0) {
                            objValueOf = F.f5370b;
                        } else {
                            byte[] bArr = new byte[size];
                            abstractC0280iX.f(size, bArr);
                            objValueOf = bArr;
                        }
                        AbstractC1305a.n(objValueOf, "value.bytes.toByteArray()");
                        break;
                    case 9:
                        throw new C0183b("Value not set.", null);
                }
                c0254b.d(fVar, objValueOf);
            }
            return new C0254b(new LinkedHashMap(c0254b.a()), true);
        } catch (H e6) {
            throw new C0183b("Unable to parse preferences proto.", e6);
        }
    }

    public final void b(Object obj, x xVar) {
        Z.i iVarG;
        Map mapA = ((h) obj).a();
        Z.d dVarQ = Z.f.q();
        for (Map.Entry entry : mapA.entrySet()) {
            f fVar = (f) entry.getKey();
            Object value = entry.getValue();
            String str = fVar.f4990a;
            if (value instanceof Boolean) {
                iVarG = Z.j.G();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                iVarG.e();
                Z.j.t((Z.j) iVarG.f5359x, zBooleanValue);
            } else if (value instanceof Float) {
                iVarG = Z.j.G();
                float fFloatValue = ((Number) value).floatValue();
                iVarG.e();
                Z.j.u((Z.j) iVarG.f5359x, fFloatValue);
            } else if (value instanceof Double) {
                iVarG = Z.j.G();
                double dDoubleValue = ((Number) value).doubleValue();
                iVarG.e();
                Z.j.r((Z.j) iVarG.f5359x, dDoubleValue);
            } else if (value instanceof Integer) {
                iVarG = Z.j.G();
                int iIntValue = ((Number) value).intValue();
                iVarG.e();
                Z.j.v((Z.j) iVarG.f5359x, iIntValue);
            } else if (value instanceof Long) {
                iVarG = Z.j.G();
                long jLongValue = ((Number) value).longValue();
                iVarG.e();
                Z.j.o((Z.j) iVarG.f5359x, jLongValue);
            } else if (value instanceof String) {
                iVarG = Z.j.G();
                iVarG.e();
                Z.j.p((Z.j) iVarG.f5359x, (String) value);
            } else if (value instanceof Set) {
                iVarG = Z.j.G();
                Z.g gVarR = Z.h.r();
                AbstractC1305a.m(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                gVarR.e();
                Z.h.o((Z.h) gVarR.f5359x, (Set) value);
                iVarG.e();
                Z.j.q((Z.j) iVarG.f5359x, (Z.h) gVarR.a());
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                iVarG = Z.j.G();
                byte[] bArr = (byte[]) value;
                C0282j c0282j = AbstractC0280i.f5452x;
                C0282j c0282jE = AbstractC0280i.e(bArr, 0, bArr.length);
                iVarG.e();
                Z.j.s((Z.j) iVarG.f5359x, c0282jE);
            }
            Z.j jVar = (Z.j) iVarG.a();
            dVarQ.getClass();
            str.getClass();
            dVarQ.e();
            Z.f.o((Z.f) dVarQ.f5359x).put(str, jVar);
        }
        Z.f fVar2 = (Z.f) dVarQ.a();
        C0709f c0709fC = xVar.c();
        int iB = fVar2.b(null);
        Logger logger = AbstractC0292q.f5503d;
        if (iB > 4096) {
            iB = 4096;
        }
        C0291p c0291p = new C0291p(c0709fC, iB);
        fVar2.c(c0291p);
        if (c0291p.f5498h > 0) {
            c0291p.a0();
        }
    }
}
