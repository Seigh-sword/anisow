package m2;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;
import p1.C1243i;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Bundle f10645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ G0 f10646y;

    public /* synthetic */ I0(G0 g02, Bundle bundle, int i6) {
        this.f10644w = i6;
        this.f10646y = g02;
        this.f10645x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleS;
        Bundle bundle = this.f10645x;
        G0 g02 = this.f10646y;
        switch (this.f10644w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g02.getClass();
                if (bundle.isEmpty()) {
                    bundleS = bundle;
                } else {
                    bundleS = g02.p().f10822V.s();
                    if (g02.n().D(null, AbstractC1078w.f11191g1)) {
                        bundleS = new Bundle(bundleS);
                    }
                    Iterator<String> it = bundle.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        C1243i c1243i = g02.f10629R;
                        if (zHasNext) {
                            String next = it.next();
                            Object obj = bundle.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                g02.q();
                                if (K1.a0(obj)) {
                                    g02.q();
                                    K1.V(c1243i, null, 27, null, null, 0);
                                }
                                g02.f().f10720G.b(next, obj, "Invalid default event parameter type. Name, value");
                            } else if (K1.w0(next)) {
                                g02.f().f10720G.c(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundleS.remove(next);
                            } else if (g02.q().c0("param", next, g02.n().t(null, false), obj)) {
                                g02.q().K(bundleS, next, obj);
                            }
                        } else {
                            g02.q();
                            int i6 = g02.n().q().h0(201500000) ? 100 : 25;
                            if (bundleS.size() > i6) {
                                int i7 = 0;
                                for (String str : new TreeSet(bundleS.keySet())) {
                                    i7++;
                                    if (i7 > i6) {
                                        bundleS.remove(str);
                                    }
                                }
                                g02.q();
                                K1.V(c1243i, null, 26, null, null, 0);
                                g02.f().f10720G.d("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                        }
                    }
                }
                g02.p().f10822V.u(bundleS);
                if (!bundle.isEmpty() || g02.n().D(null, AbstractC1078w.f11185e1)) {
                    Y0 y0W = g02.w();
                    y0W.r();
                    y0W.y();
                    y0W.B(new K.a(y0W, y0W.N(false), bundleS, 18));
                }
                break;
            case 1:
                g02.r();
                g02.y();
                AbstractC1332d.m(bundle);
                String string = bundle.getString("name");
                AbstractC1332d.g(string);
                if (!((C1051k0) g02.f1668w).j()) {
                    g02.f().f10723J.d("Conditional property not cleared since app measurement is disabled");
                } else {
                    G1 g12 = new G1(string, "", 0L, null);
                    try {
                        K1 k1Q = g02.q();
                        bundle.getString("app_id");
                        g02.w().D(new C1029d(bundle.getString("app_id"), "", g12, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), k1Q.G(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                g02.r();
                g02.y();
                AbstractC1332d.m(bundle);
                String string2 = bundle.getString("name");
                String string3 = bundle.getString("origin");
                AbstractC1332d.g(string2);
                AbstractC1332d.g(string3);
                AbstractC1332d.m(bundle.get("value"));
                if (!((C1051k0) g02.f1668w).j()) {
                    g02.f().f10723J.d("Conditional property not set since app measurement is disabled");
                } else {
                    G1 g13 = new G1(string2, string3, bundle.getLong("triggered_timestamp"), bundle.get("value"));
                    try {
                        K1 k1Q2 = g02.q();
                        bundle.getString("app_id");
                        C1076v c1076vG = k1Q2.G(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string3, 0L, true);
                        K1 k1Q3 = g02.q();
                        bundle.getString("app_id");
                        C1076v c1076vG2 = k1Q3.G(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string3, 0L, true);
                        K1 k1Q4 = g02.q();
                        bundle.getString("app_id");
                        g02.w().D(new C1029d(bundle.getString("app_id"), string3, g13, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c1076vG2, bundle.getLong("trigger_timeout"), c1076vG, bundle.getLong("time_to_live"), k1Q4.G(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string3, 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
