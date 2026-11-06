package androidx.datastore.preferences.protobuf;

import d.AbstractC0628i;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0297w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5525c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0287l0 f5526a = new C0287l0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5527b;

    static {
        new C0297w(0);
    }

    public C0297w() {
    }

    public static void b(AbstractC0292q abstractC0292q, K0 k02, int i6, Object obj) {
        if (k02 == K0.f5389z) {
            abstractC0292q.Q(i6, 3);
            ((AbstractC0266b) obj).c(abstractC0292q);
            abstractC0292q.Q(i6, 4);
            return;
        }
        abstractC0292q.Q(i6, k02.f5391x);
        switch (k02.ordinal()) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                abstractC0292q.J(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                abstractC0292q.H(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                abstractC0292q.U(((Long) obj).longValue());
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                abstractC0292q.U(((Long) obj).longValue());
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                abstractC0292q.L(((Integer) obj).intValue());
                return;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                abstractC0292q.J(((Long) obj).longValue());
                return;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                abstractC0292q.H(((Integer) obj).intValue());
                return;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                abstractC0292q.B(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof AbstractC0280i)) {
                    abstractC0292q.P((String) obj);
                    return;
                }
                break;
            case 9:
                ((AbstractC0266b) obj).c(abstractC0292q);
                return;
            case 10:
                abstractC0292q.N((AbstractC0266b) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC0280i)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC0292q.D(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                abstractC0292q.S(((Integer) obj).intValue());
                return;
            case 13:
                abstractC0292q.L(((Integer) obj).intValue());
                return;
            case 14:
                abstractC0292q.H(((Integer) obj).intValue());
                return;
            case 15:
                abstractC0292q.J(((Long) obj).longValue());
                return;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC0292q.S((iIntValue >> 31) ^ (iIntValue << 1));
                return;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC0292q.U((jLongValue >> 63) ^ (jLongValue << 1));
                return;
            default:
                return;
        }
        abstractC0292q.F((AbstractC0280i) obj);
    }

    public final void a() {
        C0287l0 c0287l0;
        if (this.f5527b) {
            return;
        }
        int i6 = 0;
        while (true) {
            c0287l0 = this.f5526a;
            if (i6 >= c0287l0.f5483x.size()) {
                break;
            }
            Map.Entry entryH = c0287l0.h(i6);
            if (entryH.getValue() instanceof C) {
                C c6 = (C) entryH.getValue();
                c6.getClass();
                C0277g0 c0277g0 = C0277g0.f5444c;
                c0277g0.getClass();
                c0277g0.a(c6.getClass()).h(c6);
                c6.k();
            }
            i6++;
        }
        if (!c0287l0.f5485z) {
            if (c0287l0.f5483x.size() > 0) {
                AbstractC0628i.p(c0287l0.h(0).getKey());
                throw null;
            }
            Iterator it = c0287l0.i().iterator();
            if (it.hasNext()) {
                AbstractC0628i.p(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        if (!c0287l0.f5485z) {
            c0287l0.f5484y = c0287l0.f5484y.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0287l0.f5484y);
            c0287l0.f5481B = c0287l0.f5481B.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0287l0.f5481B);
            c0287l0.f5485z = true;
        }
        this.f5527b = true;
    }

    public final Object clone() {
        C0297w c0297w = new C0297w();
        C0287l0 c0287l0 = this.f5526a;
        if (c0287l0.f5483x.size() > 0) {
            Map.Entry entryH = c0287l0.h(0);
            AbstractC0628i.p(entryH.getKey());
            entryH.getValue();
            throw null;
        }
        Iterator it = c0287l0.i().iterator();
        if (!it.hasNext()) {
            return c0297w;
        }
        Map.Entry entry = (Map.Entry) it.next();
        AbstractC0628i.p(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0297w)) {
            return false;
        }
        return this.f5526a.equals(((C0297w) obj).f5526a);
    }

    public final int hashCode() {
        return this.f5526a.hashCode();
    }

    public C0297w(int i6) {
        a();
        a();
    }
}
