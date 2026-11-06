package m2;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1072t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1074u f11101f;

    public C1072t(C1051k0 c1051k0, String str, String str2, String str3, long j6, long j7, Bundle bundle) {
        C1074u c1074u;
        AbstractC1332d.g(str2);
        AbstractC1332d.g(str3);
        this.f11096a = str2;
        this.f11097b = str3;
        this.f11098c = TextUtils.isEmpty(str) ? null : str;
        this.f11099d = j6;
        this.f11100e = j7;
        if (j7 != 0 && j7 > j6) {
            N n5 = c1051k0.f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(N.x(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle.isEmpty()) {
            c1074u = new C1074u(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    N n6 = c1051k0.f10983E;
                    C1051k0.i(n6);
                    n6.f10715B.d("Param name can't be null");
                } else {
                    K1 k12 = c1051k0.f10986H;
                    C1051k0.e(k12);
                    Object objK0 = k12.k0(bundle2.get(next), next);
                    if (objK0 == null) {
                        N n7 = c1051k0.f10983E;
                        C1051k0.i(n7);
                        n7.f10718E.c(c1051k0.f10987I.f(next), "Param value can't be null");
                    } else {
                        K1 k13 = c1051k0.f10986H;
                        C1051k0.e(k13);
                        k13.K(bundle2, next, objK0);
                    }
                }
                it.remove();
            }
            c1074u = new C1074u(bundle2);
        }
        this.f11101f = c1074u;
    }

    public final C1072t a(C1051k0 c1051k0, long j6) {
        return new C1072t(c1051k0, this.f11098c, this.f11096a, this.f11097b, this.f11099d, j6, this.f11101f);
    }

    public final String toString() {
        return "Event{appId='" + this.f11096a + "', name='" + this.f11097b + "', params=" + String.valueOf(this.f11101f) + "}";
    }

    public C1072t(C1051k0 c1051k0, String str, String str2, String str3, long j6, long j7, C1074u c1074u) {
        AbstractC1332d.g(str2);
        AbstractC1332d.g(str3);
        AbstractC1332d.m(c1074u);
        this.f11096a = str2;
        this.f11097b = str3;
        this.f11098c = TextUtils.isEmpty(str) ? null : str;
        this.f11099d = j6;
        this.f11100e = j7;
        if (j7 != 0 && j7 > j6) {
            N n5 = c1051k0.f10983E;
            C1051k0.i(n5);
            n5.f10718E.b(N.x(str2), N.x(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f11101f = c1074u;
    }
}
