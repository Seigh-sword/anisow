package m2;

import s.C1280b;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1023b implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f10847x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f10848y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C1067q f10849z;

    public /* synthetic */ RunnableC1023b(C1067q c1067q, String str, long j6, int i6) {
        this.f10846w = i6;
        this.f10847x = str;
        this.f10848y = j6;
        this.f10849z = c1067q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objValueOf;
        int i6 = this.f10846w;
        long j6 = this.f10848y;
        String str = this.f10847x;
        C1067q c1067q = this.f10849z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c1067q.r();
                AbstractC1332d.g(str);
                C1280b c1280b = c1067q.f11061y;
                if (c1280b.isEmpty()) {
                    c1067q.f11062z = j6;
                }
                Integer num = (Integer) c1280b.getOrDefault(str, null);
                if (num != null) {
                    objValueOf = Integer.valueOf(num.intValue() + 1);
                } else if (c1280b.f12534y >= 100) {
                    c1067q.f().f10718E.d("Too many ads visible");
                } else {
                    c1280b.put(str, 1);
                    c1280b = c1067q.f11060x;
                    objValueOf = Long.valueOf(j6);
                }
                c1280b.put(str, objValueOf);
                break;
            default:
                c1067q.r();
                AbstractC1332d.g(str);
                C1280b c1280b2 = c1067q.f11061y;
                Integer num2 = (Integer) c1280b2.getOrDefault(str, null);
                if (num2 == null) {
                    c1067q.f().f10715B.c(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    V0 v0C = c1067q.v().C(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c1280b2.put(str, Integer.valueOf(iIntValue));
                    } else {
                        c1280b2.remove(str);
                        C1280b c1280b3 = c1067q.f11060x;
                        Long l5 = (Long) c1280b3.getOrDefault(str, null);
                        if (l5 == null) {
                            c1067q.f().f10715B.d("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j6 - l5.longValue();
                            c1280b3.remove(str);
                            c1067q.B(str, jLongValue, v0C);
                        }
                        if (c1280b2.isEmpty()) {
                            long j7 = c1067q.f11062z;
                            if (j7 != 0) {
                                c1067q.z(j6 - j7, v0C);
                                c1067q.f11062z = 0L;
                            } else {
                                c1067q.f().f10715B.d("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
