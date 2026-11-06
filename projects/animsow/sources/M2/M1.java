package m2;

import com.google.android.gms.internal.measurement.C0386a4;
import com.google.android.gms.internal.measurement.I2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.D1 f10708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f10709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f10710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f10711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1280b f10712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L1 f10713h;

    public M1(L1 l12, String str) {
        this.f10713h = l12;
        this.f10706a = str;
        this.f10707b = true;
        this.f10709d = new BitSet();
        this.f10710e = new BitSet();
        this.f10711f = new C1280b();
        this.f10712g = new C1280b();
    }

    public final void a(O1 o12) {
        int iT;
        I2 i22 = o12.f10743h;
        int i6 = o12.f10742g;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                iT = ((com.google.android.gms.internal.measurement.E0) i22).t();
                break;
            default:
                iT = ((com.google.android.gms.internal.measurement.L0) i22).p();
                break;
        }
        Boolean bool = o12.f10857c;
        if (bool != null) {
            this.f10710e.set(iT, bool.booleanValue());
        }
        Boolean bool2 = o12.f10858d;
        if (bool2 != null) {
            this.f10709d.set(iT, bool2.booleanValue());
        }
        if (o12.f10859e != null) {
            Integer numValueOf = Integer.valueOf(iT);
            Map map = this.f10711f;
            Long l5 = (Long) map.get(numValueOf);
            long jLongValue = o12.f10859e.longValue() / 1000;
            if (l5 == null || jLongValue > l5.longValue()) {
                map.put(Integer.valueOf(iT), Long.valueOf(jLongValue));
            }
        }
        if (o12.f10860f != null) {
            C1280b c1280b = this.f10712g;
            List arrayList = (List) c1280b.getOrDefault(Integer.valueOf(iT), null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1280b.put(Integer.valueOf(iT), arrayList);
            }
            switch (i6) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    break;
                default:
                    arrayList.clear();
                    break;
            }
            C0386a4.a();
            L1 l12 = this.f10713h;
            C1032e c1032eN = l12.n();
            E e6 = AbstractC1078w.f11211o0;
            String str = this.f10706a;
            if (c1032eN.D(str, e6)) {
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (((com.google.android.gms.internal.measurement.E0) o12.f10743h).B()) {
                            arrayList.clear();
                        }
                        break;
                }
            }
            C0386a4.a();
            boolean zD = l12.n().D(str, e6);
            Long l6 = o12.f10860f;
            if (!zD) {
                arrayList.add(Long.valueOf(l6.longValue() / 1000));
                return;
            }
            long jLongValue2 = l6.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public M1(L1 l12, String str, com.google.android.gms.internal.measurement.D1 d12, BitSet bitSet, BitSet bitSet2, C1280b c1280b, C1280b c1280b2) {
        this.f10713h = l12;
        this.f10706a = str;
        this.f10709d = bitSet;
        this.f10710e = bitSet2;
        this.f10711f = c1280b;
        this.f10712g = new C1280b();
        for (Integer num : (s.h) c1280b2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c1280b2.getOrDefault(num, null));
            this.f10712g.put(num, arrayList);
        }
        this.f10707b = false;
        this.f10708c = d12;
    }
}
