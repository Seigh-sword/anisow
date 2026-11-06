package m2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b2.C0337b;
import com.google.android.gms.internal.measurement.AbstractC0426h2;
import com.google.android.gms.internal.measurement.C0393c;
import com.google.android.gms.internal.measurement.C0431i1;
import com.google.android.gms.internal.measurement.C0449l1;
import com.google.android.gms.internal.measurement.C0461n1;
import com.google.android.gms.internal.measurement.C0473p1;
import com.google.android.gms.internal.measurement.C0479q1;
import com.google.android.gms.internal.measurement.C0484r1;
import com.google.android.gms.internal.measurement.C0487r4;
import com.google.android.gms.internal.measurement.C0502u1;
import com.google.android.gms.internal.measurement.C0508v1;
import com.google.android.gms.internal.measurement.C0526y1;
import com.google.android.gms.internal.measurement.C0532z1;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.H2;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.N4;
import com.google.android.gms.internal.measurement.Q2;
import com.google.android.gms.internal.measurement.Q4;
import com.google.android.gms.internal.measurement.R2;
import com.google.android.gms.internal.measurement.Y1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class H1 extends t1 {
    public static Bundle A(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0508v1 c0508v1 = (C0508v1) it.next();
            String strE = c0508v1.E();
            if (c0508v1.H()) {
                bundle.putDouble(strE, c0508v1.p());
            } else if (c0508v1.I()) {
                bundle.putFloat(strE, c0508v1.w());
            } else if (c0508v1.L()) {
                bundle.putString(strE, c0508v1.F());
            } else if (c0508v1.J()) {
                bundle.putLong(strE, c0508v1.B());
            }
        }
        return bundle;
    }

    public static Bundle B(Map map, boolean z5) {
        String string;
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                string = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                string = obj.toString();
            } else if (z5) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    arrayList2.add(B((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str, string);
        }
        return bundle;
    }

    public static C0508v1 E(C0484r1 c0484r1, String str) {
        for (C0508v1 c0508v1 : c0484r1.E()) {
            if (c0508v1.E().equals(str)) {
                return c0508v1;
            }
        }
        return null;
    }

    public static H2 F(H2 h22, byte[] bArr) throws Q2 {
        C2 c2H;
        C2 c22 = C2.f6454a;
        if (c22 == null) {
            synchronized (C2.class) {
                try {
                    c2H = C2.f6454a;
                    if (c2H == null) {
                        c2H = F2.h();
                        C2.f6454a = c2H;
                    }
                } finally {
                }
            }
            c22 = c2H;
        }
        h22.getClass();
        if (c22 != null) {
            h22.j(bArr, bArr.length, c22);
            return h22;
        }
        h22.j(bArr, bArr.length, C2.f6455b);
        return h22;
    }

    public static String H(boolean z5, boolean z6, boolean z7) {
        StringBuilder sb = new StringBuilder();
        if (z5) {
            sb.append("Dynamic ");
        }
        if (z6) {
            sb.append("Sequence ");
        }
        if (z7) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static ArrayList I(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i6 = 0; i6 < length; i6++) {
            long j6 = 0;
            for (int i7 = 0; i7 < 64; i7++) {
                int i8 = (i6 << 6) + i7;
                if (i8 < bitSet.length()) {
                    if (bitSet.get(i8)) {
                        j6 |= 1 << i7;
                    }
                }
            }
            arrayList.add(Long.valueOf(j6));
        }
        return arrayList;
    }

    public static HashMap J(Bundle bundle, boolean z5) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z6 = obj instanceof Parcelable[];
            if (z6 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z5) {
                    ArrayList arrayList = new ArrayList();
                    if (z6) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(J((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList2.get(i6);
                            i6++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(J((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(J((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static C1076v L(C0393c c0393c) {
        Object obj;
        Bundle bundleB = B(c0393c.f6772c, true);
        String string = (!bundleB.containsKey("_o") || (obj = bundleB.get("_o")) == null) ? "app" : obj.toString();
        String strS = C0.s(c0393c.f6770a, C0.f10530a, C0.f10532c);
        if (strS == null) {
            strS = c0393c.f6770a;
        }
        return new C1076v(strS, new C1074u(bundleB), string, c0393c.f6771b);
    }

    public static void N(int i6, StringBuilder sb) {
        for (int i7 = 0; i7 < i6; i7++) {
            sb.append("  ");
        }
    }

    public static void O(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void P(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                O(builder, str3, string, set);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(C0479q1 c0479q1, String str, Long l5) {
        List listQ = c0479q1.q();
        int i6 = 0;
        while (true) {
            if (i6 >= listQ.size()) {
                i6 = -1;
                break;
            } else if (str.equals(((C0508v1) listQ.get(i6)).E())) {
                break;
            } else {
                i6++;
            }
        }
        C0502u1 c0502u1D = C0508v1.D();
        c0502u1D.l(str);
        if (l5 instanceof Long) {
            c0502u1D.k(l5.longValue());
        } else if (l5 instanceof String) {
            c0502u1D.m((String) l5);
        } else if (l5 instanceof Double) {
            double dDoubleValue = ((Double) l5).doubleValue();
            c0502u1D.i();
            C0508v1.q((C0508v1) c0502u1D.f6602x, dDoubleValue);
        }
        if (i6 < 0) {
            c0479q1.k(c0502u1D);
        } else {
            c0479q1.i();
            C0484r1.u((C0484r1) c0479q1.f6602x, i6, (C0508v1) c0502u1D.e());
        }
    }

    public static void U(StringBuilder sb, int i6, String str, com.google.android.gms.internal.measurement.J0 j02) {
        if (j02 == null) {
            return;
        }
        N(i6, sb);
        sb.append(str);
        sb.append(" {\n");
        if (j02.w()) {
            V(sb, i6, "comparison_type", H1.a.t(j02.p()));
        }
        if (j02.y()) {
            V(sb, i6, "match_as_float", Boolean.valueOf(j02.v()));
        }
        if (j02.x()) {
            V(sb, i6, "comparison_value", j02.s());
        }
        if (j02.A()) {
            V(sb, i6, "min_comparison_value", j02.u());
        }
        if (j02.z()) {
            V(sb, i6, "max_comparison_value", j02.t());
        }
        N(i6, sb);
        sb.append("}\n");
    }

    public static void V(StringBuilder sb, int i6, String str, Object obj) {
        if (obj == null) {
            return;
        }
        N(i6 + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static void W(StringBuilder sb, String str, com.google.android.gms.internal.measurement.D1 d12) {
        if (d12 == null) {
            return;
        }
        N(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (d12.s() != 0) {
            N(4, sb);
            sb.append("results: ");
            int i6 = 0;
            for (Long l5 : d12.E()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(l5);
                i6 = i7;
            }
            sb.append('\n');
        }
        if (d12.y() != 0) {
            N(4, sb);
            sb.append("status: ");
            int i8 = 0;
            for (Long l6 : d12.G()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(l6);
                i8 = i9;
            }
            sb.append('\n');
        }
        if (d12.p() != 0) {
            N(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i10 = 0;
            for (C0473p1 c0473p1 : d12.D()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(c0473p1.v() ? Integer.valueOf(c0473p1.p()) : null);
                sb.append(":");
                sb.append(c0473p1.u() ? Long.valueOf(c0473p1.s()) : null);
                i10 = i11;
            }
            sb.append("}\n");
        }
        if (d12.v() != 0) {
            N(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i12 = 0;
            for (com.google.android.gms.internal.measurement.F1 f12 : d12.F()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(f12.w() ? Integer.valueOf(f12.t()) : null);
                sb.append(": [");
                Iterator it = f12.v().iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i15 = i14 + 1;
                    if (i14 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i14 = i15;
                }
                sb.append("]");
                i12 = i13;
            }
            sb.append("}\n");
        }
        N(3, sb);
        sb.append("}\n");
    }

    public static boolean X(int i6, N2 n22) {
        if (i6 < (n22.size() << 6)) {
            return ((1 << (i6 % 64)) & ((Long) n22.get(i6 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable Z(C0484r1 c0484r1, String str) {
        C0508v1 c0508v1E = E(c0484r1, str);
        if (c0508v1E == null) {
            return null;
        }
        if (c0508v1E.L()) {
            return c0508v1E.F();
        }
        if (c0508v1E.J()) {
            return Long.valueOf(c0508v1E.B());
        }
        if (c0508v1E.H()) {
            return Double.valueOf(c0508v1E.p());
        }
        if (c0508v1E.z() > 0) {
            return c0((R2) c0508v1E.G());
        }
        return null;
    }

    public static boolean a0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] c0(R2 r22) {
        ArrayList arrayList = new ArrayList();
        Iterator it = r22.iterator();
        while (it.hasNext()) {
            C0508v1 c0508v1 = (C0508v1) it.next();
            if (c0508v1 != null) {
                Bundle bundle = new Bundle();
                for (C0508v1 c0508v12 : c0508v1.G()) {
                    if (c0508v12.L()) {
                        bundle.putString(c0508v12.E(), c0508v12.F());
                    } else if (c0508v12.J()) {
                        bundle.putLong(c0508v12.E(), c0508v12.B());
                    } else if (c0508v12.H()) {
                        bundle.putDouble(c0508v12.E(), c0508v12.p());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static int y(C0532z1 c0532z1, String str) {
        for (int i6 = 0; i6 < ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).t1(); i6++) {
            if (str.equals(((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).e0(i6).C())) {
                return i6;
            }
        }
        return -1;
    }

    public final Parcelable C(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (Y1.b unused) {
            f().f10715B.d("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final C0484r1 D(C1072t c1072t) {
        C0479q1 c0479q1C = C0484r1.C();
        c0479q1C.i();
        C0484r1.s(c1072t.f11100e, (C0484r1) c0479q1C.f6602x);
        C1074u c1074u = c1072t.f11101f;
        c1074u.getClass();
        Bundle bundle = c1074u.f11108w;
        for (String str : bundle.keySet()) {
            C0502u1 c0502u1D = C0508v1.D();
            c0502u1D.l(str);
            Object obj = bundle.get(str);
            AbstractC1332d.m(obj);
            R(c0502u1D, obj);
            c0479q1C.k(c0502u1D);
        }
        if (n().D(null, AbstractC1078w.f11194h1)) {
            String str2 = c1072t.f11098c;
            if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
                C0502u1 c0502u1D2 = C0508v1.D();
                c0502u1D2.l("_o");
                c0502u1D2.m(str2);
                c0479q1C.l((C0508v1) c0502u1D2.e());
            }
        }
        return (C0484r1) c0479q1C.e();
    }

    public final String G(C0526y1 c0526y1) {
        C0449l1 c0449l1B2;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        Q4.a();
        if (n().D(null, AbstractC1078w.f11227w0) && c0526y1.p() > 0) {
            q();
            if (K1.u0(c0526y1.r().e2())) {
                if (c0526y1.C()) {
                    V(sb, 0, "upload_subdomain", c0526y1.z());
                }
                if (c0526y1.B()) {
                    V(sb, 0, "sgtm_join_id", c0526y1.y());
                }
            }
        }
        for (com.google.android.gms.internal.measurement.A1 a12 : c0526y1.A()) {
            if (a12 != null) {
                N(1, sb);
                sb.append("bundle {\n");
                if (a12.A0()) {
                    V(sb, 1, "protocol_version", Integer.valueOf(a12.e1()));
                }
                ((N4) K4.f6621x.get()).getClass();
                if (n().D(a12.e2(), AbstractC1078w.f11225v0) && a12.D0()) {
                    V(sb, 1, "session_stitching_token", a12.R());
                }
                V(sb, 1, "platform", a12.P());
                if (a12.v0()) {
                    V(sb, 1, "gmp_version", Long.valueOf(a12.N1()));
                }
                if (a12.I0()) {
                    V(sb, 1, "uploading_gmp_version", Long.valueOf(a12.Z1()));
                }
                if (a12.t0()) {
                    V(sb, 1, "dynamite_version", Long.valueOf(a12.G1()));
                }
                if (a12.m0()) {
                    V(sb, 1, "config_version", Long.valueOf(a12.y1()));
                }
                V(sb, 1, "gmp_app_id", a12.M());
                V(sb, 1, "admob_app_id", a12.d2());
                V(sb, 1, "app_id", a12.e2());
                V(sb, 1, "app_version", a12.F());
                if (a12.b0()) {
                    V(sb, 1, "app_version_major", Integer.valueOf(a12.d0()));
                }
                V(sb, 1, "firebase_instance_id", a12.L());
                if (a12.r0()) {
                    V(sb, 1, "dev_cert_hash", Long.valueOf(a12.C1()));
                }
                V(sb, 1, "app_store", a12.E());
                if (a12.H0()) {
                    V(sb, 1, "upload_timestamp_millis", Long.valueOf(a12.X1()));
                }
                if (a12.E0()) {
                    V(sb, 1, "start_timestamp_millis", Long.valueOf(a12.T1()));
                }
                if (a12.u0()) {
                    V(sb, 1, "end_timestamp_millis", Long.valueOf(a12.K1()));
                }
                if (a12.z0()) {
                    V(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(a12.R1()));
                }
                if (a12.y0()) {
                    V(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(a12.P1()));
                }
                V(sb, 1, "app_instance_id", a12.D());
                V(sb, 1, "resettable_device_id", a12.Q());
                V(sb, 1, "ds_id", a12.K());
                if (a12.x0()) {
                    V(sb, 1, "limited_ad_tracking", Boolean.valueOf(a12.Y()));
                }
                V(sb, 1, "os_version", a12.O());
                V(sb, 1, "device_model", a12.J());
                V(sb, 1, "user_default_language", a12.S());
                if (a12.G0()) {
                    V(sb, 1, "time_zone_offset_minutes", Integer.valueOf(a12.o1()));
                }
                if (a12.l0()) {
                    V(sb, 1, "bundle_sequential_index", Integer.valueOf(a12.J0()));
                }
                Q4.a();
                q();
                if (K1.u0(a12.e2()) && n().D(null, AbstractC1078w.f11227w0) && a12.q0()) {
                    V(sb, 1, "delivery_index", Integer.valueOf(a12.S0()));
                }
                if (a12.C0()) {
                    V(sb, 1, "service_upload", Boolean.valueOf(a12.Z()));
                }
                V(sb, 1, "health_monitor", a12.N());
                if (a12.B0()) {
                    V(sb, 1, "retry_counter", Integer.valueOf(a12.j1()));
                }
                if (a12.o0()) {
                    V(sb, 1, "consent_signals", a12.H());
                }
                if (a12.w0()) {
                    V(sb, 1, "is_dma_region", Boolean.valueOf(a12.X()));
                }
                if (a12.p0()) {
                    V(sb, 1, "core_platform_services", a12.I());
                }
                if (a12.n0()) {
                    V(sb, 1, "consent_diagnostics", a12.G());
                }
                if (a12.F0()) {
                    V(sb, 1, "target_os_version", Long.valueOf(a12.V1()));
                }
                J4.a();
                if (n().D(a12.e2(), AbstractC1078w.f11133G0)) {
                    V(sb, 1, "ad_services_version", Integer.valueOf(a12.p()));
                    if (a12.c0() && (c0449l1B2 = a12.b2()) != null) {
                        N(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        V(sb, 2, "eligible", Boolean.valueOf(c0449l1B2.z()));
                        V(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c0449l1B2.C()));
                        V(sb, 2, "pre_r", Boolean.valueOf(c0449l1B2.D()));
                        V(sb, 2, "r_extensions_too_old", Boolean.valueOf(c0449l1B2.E()));
                        V(sb, 2, "adservices_extension_too_old", Boolean.valueOf(c0449l1B2.x()));
                        V(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(c0449l1B2.v()));
                        V(sb, 2, "measurement_manager_disabled", Boolean.valueOf(c0449l1B2.B()));
                        N(2, sb);
                        sb.append("}\n");
                    }
                }
                C0487r4.a();
                if (n().D(null, AbstractC1078w.f11159T0) && a12.a0()) {
                    C0431i1 c0431i1A2 = a12.a2();
                    N(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (c0431i1A2.P()) {
                        V(sb, 2, "deep_link_gclid", c0431i1A2.J());
                    }
                    if (c0431i1A2.O()) {
                        V(sb, 2, "deep_link_gbraid", c0431i1A2.I());
                    }
                    if (c0431i1A2.N()) {
                        V(sb, 2, "deep_link_gad_source", c0431i1A2.F());
                    }
                    if (c0431i1A2.Q()) {
                        V(sb, 2, "deep_link_session_millis", Long.valueOf(c0431i1A2.p()));
                    }
                    if (c0431i1A2.U()) {
                        V(sb, 2, "market_referrer_gclid", c0431i1A2.M());
                    }
                    if (c0431i1A2.T()) {
                        V(sb, 2, "market_referrer_gbraid", c0431i1A2.L());
                    }
                    if (c0431i1A2.S()) {
                        V(sb, 2, "market_referrer_gad_source", c0431i1A2.K());
                    }
                    if (c0431i1A2.R()) {
                        V(sb, 2, "market_referrer_click_millis", Long.valueOf(c0431i1A2.t()));
                    }
                    N(2, sb);
                    sb.append("}\n");
                }
                R2<com.google.android.gms.internal.measurement.H1> r2V = a12.V();
                if (r2V != null) {
                    for (com.google.android.gms.internal.measurement.H1 h12 : r2V) {
                        if (h12 != null) {
                            N(2, sb);
                            sb.append("user_property {\n");
                            V(sb, 2, "set_timestamp_millis", h12.H() ? Long.valueOf(h12.A()) : null);
                            V(sb, 2, "name", o().g(h12.C()));
                            V(sb, 2, "string_value", h12.D());
                            V(sb, 2, "int_value", h12.G() ? Long.valueOf(h12.y()) : null);
                            V(sb, 2, "double_value", h12.E() ? Double.valueOf(h12.p()) : null);
                            N(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                R2<C0461n1> r2T = a12.T();
                if (r2T != null) {
                    for (C0461n1 c0461n1 : r2T) {
                        if (c0461n1 != null) {
                            N(2, sb);
                            sb.append("audience_membership {\n");
                            if (c0461n1.y()) {
                                V(sb, 2, "audience_id", Integer.valueOf(c0461n1.p()));
                            }
                            if (c0461n1.z()) {
                                V(sb, 2, "new_audience", Boolean.valueOf(c0461n1.x()));
                            }
                            W(sb, "current_data", c0461n1.v());
                            if (c0461n1.A()) {
                                W(sb, "previous_data", c0461n1.w());
                            }
                            N(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                R2<C0484r1> r2U = a12.U();
                if (r2U != null) {
                    for (C0484r1 c0484r1 : r2U) {
                        if (c0484r1 != null) {
                            N(2, sb);
                            sb.append("event {\n");
                            V(sb, 2, "name", o().b(c0484r1.D()));
                            if (c0484r1.H()) {
                                V(sb, 2, "timestamp_millis", Long.valueOf(c0484r1.B()));
                            }
                            if (c0484r1.G()) {
                                V(sb, 2, "previous_timestamp_millis", Long.valueOf(c0484r1.A()));
                            }
                            if (c0484r1.F()) {
                                V(sb, 2, "count", Integer.valueOf(c0484r1.p()));
                            }
                            if (c0484r1.y() != 0) {
                                T(sb, 2, c0484r1.E());
                            }
                            N(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                N(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public final List K(N2 n22, List list) {
        int i6;
        ArrayList arrayList = new ArrayList(n22);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                f().f10718E.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    f().f10718E.b(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i7 = size2;
            i6 = size;
            size = i7;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i6);
    }

    public final r1 M(String str, C0532z1 c0532z1, C0479q1 c0479q1, String str2) {
        String strValueOf;
        String strValueOf2;
        int iIndexOf;
        J4.a();
        if (!n().D(str, AbstractC1078w.f11133G0)) {
            return null;
        }
        ((C0337b) h()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = n().A(str, AbstractC1078w.f11190g0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        v1 v1Var = this.f11112x.f11246F;
        String strM = v1Var.u().M(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(v1Var.n().A(str, AbstractC1078w.f11170Z));
        builder.authority(TextUtils.isEmpty(strM) ? v1Var.n().A(str, AbstractC1078w.f11173a0) : strM + "." + v1Var.n().A(str, AbstractC1078w.f11173a0));
        builder.path(v1Var.n().A(str, AbstractC1078w.f11176b0));
        O(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).M(), setUnmodifiableSet);
        O(builder, "gmp_version", "106000", setUnmodifiableSet);
        String strD = ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).D();
        C1032e c1032eN = n();
        E e6 = AbstractC1078w.f11139J0;
        if (c1032eN.D(str, e6) && u().N(str)) {
            strD = "";
        }
        O(builder, "app_instance_id", strD, setUnmodifiableSet);
        O(builder, "rdid", ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).Q(), setUnmodifiableSet);
        O(builder, "bundle_id", c0532z1.z(), setUnmodifiableSet);
        String strP = c0479q1.p();
        String strS = C0.s(strP, C0.f10532c, C0.f10530a);
        if (!TextUtils.isEmpty(strS)) {
            strP = strS;
        }
        O(builder, "app_event_name", strP, setUnmodifiableSet);
        O(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).d0()), setUnmodifiableSet);
        String strO = ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).O();
        if (n().D(str, e6) && u().O(str) && !TextUtils.isEmpty(strO) && (iIndexOf = strO.indexOf(".")) != -1) {
            strO = strO.substring(0, iIndexOf);
        }
        O(builder, "os_version", strO, setUnmodifiableSet);
        O(builder, "timestamp", String.valueOf(c0479q1.o()), setUnmodifiableSet);
        if (((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).Y()) {
            O(builder, "lat", "1", setUnmodifiableSet);
        }
        O(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).p()), setUnmodifiableSet);
        O(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        O(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        O(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C0508v1> listQ = c0479q1.q();
        Bundle bundle = new Bundle();
        for (C0508v1 c0508v1 : listQ) {
            String strE = c0508v1.E();
            if (c0508v1.H()) {
                strValueOf2 = String.valueOf(c0508v1.p());
            } else if (c0508v1.I()) {
                strValueOf2 = String.valueOf(c0508v1.w());
            } else if (c0508v1.L()) {
                strValueOf2 = c0508v1.F();
            } else if (c0508v1.J()) {
                strValueOf2 = String.valueOf(c0508v1.B());
            }
            bundle.putString(strE, strValueOf2);
        }
        P(builder, n().A(str, AbstractC1078w.f11187f0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.H1> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).V());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.H1 h12 : listUnmodifiableList) {
            String strC = h12.C();
            if (h12.E()) {
                strValueOf = String.valueOf(h12.p());
            } else if (h12.F()) {
                strValueOf = String.valueOf(h12.u());
            } else if (h12.I()) {
                strValueOf = h12.D();
            } else if (h12.G()) {
                strValueOf = String.valueOf(h12.y());
            }
            bundle2.putString(strC, strValueOf);
        }
        P(builder, n().A(str, AbstractC1078w.f11184e0).split("\\|"), bundle2, setUnmodifiableSet);
        O(builder, "dma", ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).X() ? "1" : "0", setUnmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).I().isEmpty()) {
            O(builder, "dma_cps", ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).I(), setUnmodifiableSet);
        }
        if (n().D(null, AbstractC1078w.f11143L0) && ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).a0()) {
            C0431i1 c0431i1A2 = ((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x).a2();
            if (!c0431i1A2.J().isEmpty()) {
                O(builder, "dl_gclid", c0431i1A2.J(), setUnmodifiableSet);
            }
            if (!c0431i1A2.I().isEmpty()) {
                O(builder, "dl_gbraid", c0431i1A2.I(), setUnmodifiableSet);
            }
            if (!c0431i1A2.F().isEmpty()) {
                O(builder, "dl_gs", c0431i1A2.F(), setUnmodifiableSet);
            }
            if (c0431i1A2.p() > 0) {
                O(builder, "dl_ss_ts", String.valueOf(c0431i1A2.p()), setUnmodifiableSet);
            }
            if (!c0431i1A2.M().isEmpty()) {
                O(builder, "mr_gclid", c0431i1A2.M(), setUnmodifiableSet);
            }
            if (!c0431i1A2.L().isEmpty()) {
                O(builder, "mr_gbraid", c0431i1A2.L(), setUnmodifiableSet);
            }
            if (!c0431i1A2.K().isEmpty()) {
                O(builder, "mr_gs", c0431i1A2.K(), setUnmodifiableSet);
            }
            if (c0431i1A2.t() > 0) {
                O(builder, "mr_click_ts", String.valueOf(c0431i1A2.t()), setUnmodifiableSet);
            }
        }
        return new r1(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final void R(C0502u1 c0502u1, Object obj) {
        c0502u1.i();
        C0508v1.C((C0508v1) c0502u1.f6602x);
        c0502u1.i();
        C0508v1.x((C0508v1) c0502u1.f6602x);
        c0502u1.i();
        C0508v1.v((C0508v1) c0502u1.f6602x);
        c0502u1.i();
        C0508v1.A((C0508v1) c0502u1.f6602x);
        if (obj instanceof String) {
            c0502u1.m((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c0502u1.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c0502u1.i();
            C0508v1.q((C0508v1) c0502u1.f6602x, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            f().f10715B.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C0502u1 c0502u1D = C0508v1.D();
                for (String str : bundle.keySet()) {
                    C0502u1 c0502u1D2 = C0508v1.D();
                    c0502u1D2.l(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c0502u1D2.k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c0502u1D2.m((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c0502u1D2.i();
                        C0508v1.q((C0508v1) c0502u1D2.f6602x, dDoubleValue2);
                    }
                    c0502u1D.i();
                    C0508v1.s((C0508v1) c0502u1D.f6602x, (C0508v1) c0502u1D2.e());
                }
                if (((C0508v1) c0502u1D.f6602x).z() > 0) {
                    arrayList.add((C0508v1) c0502u1D.e());
                }
            }
        }
        c0502u1.i();
        C0508v1.u((C0508v1) c0502u1.f6602x, arrayList);
    }

    public final void S(StringBuilder sb, int i6, com.google.android.gms.internal.measurement.G0 g02) {
        if (g02 == null) {
            return;
        }
        N(i6, sb);
        sb.append("filter {\n");
        if (g02.v()) {
            V(sb, i6, "complement", Boolean.valueOf(g02.u()));
        }
        if (g02.x()) {
            V(sb, i6, "param_name", o().f(g02.t()));
        }
        if (g02.y()) {
            int i7 = i6 + 1;
            com.google.android.gms.internal.measurement.M0 m0S = g02.s();
            if (m0S != null) {
                N(i7, sb);
                sb.append("string_filter");
                sb.append(" {\n");
                if (m0S.y()) {
                    V(sb, i7, "match_type", H1.a.u(m0S.q()));
                }
                if (m0S.x()) {
                    V(sb, i7, "expression", m0S.t());
                }
                if (m0S.w()) {
                    V(sb, i7, "case_sensitive", Boolean.valueOf(m0S.v()));
                }
                if (m0S.p() > 0) {
                    N(i6 + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str : m0S.u()) {
                        N(i6 + 3, sb);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                N(i7, sb);
                sb.append("}\n");
            }
        }
        if (g02.w()) {
            U(sb, i6 + 1, "number_filter", g02.r());
        }
        N(i6, sb);
        sb.append("}\n");
    }

    public final void T(StringBuilder sb, int i6, R2 r22) {
        if (r22 == null) {
            return;
        }
        int i7 = i6 + 1;
        Iterator it = r22.iterator();
        while (it.hasNext()) {
            C0508v1 c0508v1 = (C0508v1) it.next();
            if (c0508v1 != null) {
                N(i7, sb);
                sb.append("param {\n");
                V(sb, i7, "name", c0508v1.K() ? o().f(c0508v1.E()) : null);
                V(sb, i7, "string_value", c0508v1.L() ? c0508v1.F() : null);
                V(sb, i7, "int_value", c0508v1.J() ? Long.valueOf(c0508v1.B()) : null);
                V(sb, i7, "double_value", c0508v1.H() ? Double.valueOf(c0508v1.p()) : null);
                if (c0508v1.z() > 0) {
                    T(sb, i7, (R2) c0508v1.G());
                }
                N(i7, sb);
                sb.append("}\n");
            }
        }
    }

    public final boolean Y(long j6, long j7) {
        if (j6 == 0 || j7 <= 0) {
            return true;
        }
        ((C0337b) h()).getClass();
        return Math.abs(System.currentTimeMillis() - j6) > j7;
    }

    public final byte[] b0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e6) {
            f().f10715B.c(e6, "Failed to gzip content");
            throw e6;
        }
    }

    public final byte[] d0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i6 = gZIPInputStream.read(bArr2);
                if (i6 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i6);
            }
        } catch (IOException e6) {
            f().f10715B.c(e6, "Failed to ungzip content");
            throw e6;
        }
    }

    public final ArrayList e0() {
        Context context = this.f11112x.f11248H.f11009w;
        List list = AbstractC1078w.f11172a;
        Y1 y1A = Y1.a(context.getContentResolver(), AbstractC0426h2.a("com.google.android.gms.measurement"), new c0.p(1));
        Map mapEmptyMap = y1A == null ? Collections.emptyMap() : y1A.c();
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) AbstractC1078w.f11154R.a(null)).intValue();
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int i6 = Integer.parseInt((String) entry.getValue());
                    if (i6 != 0) {
                        arrayList.add(Integer.valueOf(i6));
                        if (arrayList.size() >= iIntValue) {
                            f().f10718E.c(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e6) {
                    f().f10718E.c(e6, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // m2.t1
    public final boolean x() {
        return false;
    }

    public final long z(byte[] bArr) {
        AbstractC1332d.m(bArr);
        q().r();
        MessageDigest messageDigestE0 = K1.E0();
        if (messageDigestE0 != null) {
            return K1.z(messageDigestE0.digest(bArr));
        }
        f().f10715B.d("Failed to get MD5");
        return 0L;
    }
}
