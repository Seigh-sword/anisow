package m2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: renamed from: m2.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1063o0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ G0 f11048x;

    public /* synthetic */ RunnableC1063o0(G0 g02, int i6) {
        this.f11047w = i6;
        this.f11048x = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G0 g02 = this.f11048x;
        switch (this.f11047w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g02.S();
                break;
            case 1:
                g02.r();
                if (g02.p().f10817Q.b()) {
                    g02.f().f10722I.d("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    long jA = g02.p().f10818R.a();
                    g02.p().f10818R.b(1 + jA);
                    if (jA >= 5) {
                        g02.f().f10718E.d("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        g02.p().f10817Q.a(true);
                    } else {
                        if (g02.f10626O == null) {
                            g02.f10626O = new K0(g02, (C1051k0) g02.f1668w, 2);
                        }
                        g02.f10626O.b(0L);
                    }
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                C1060n0 c1060n0 = g02.f10624M;
                C1051k0 c1051k0 = c1060n0.f11037a;
                C1042h0 c1042h0 = c1051k0.f10984F;
                C1051k0.i(c1042h0);
                c1042h0.r();
                if (c1060n0.b()) {
                    boolean zC = c1060n0.c();
                    G0 g03 = c1051k0.f10990L;
                    Y y5 = c1051k0.f10982D;
                    if (zC) {
                        C1051k0.e(y5);
                        y5.f10820T.e(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C1051k0.d(g03);
                        g03.Y("auto", "_cmpx", bundle);
                    } else {
                        C1051k0.e(y5);
                        com.bumptech.glide.k kVar = y5.f10820T;
                        String strD = kVar.d();
                        if (TextUtils.isEmpty(strD)) {
                            N n5 = c1051k0.f10983E;
                            C1051k0.i(n5);
                            n5.f10716C.d("Cache still valid but referrer not found");
                        } else {
                            long jA2 = ((y5.f10821U.a() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strD);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jA2);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C1051k0.d(g03);
                            g03.Y(str2, "_cmp", (Bundle) pair.second);
                        }
                        kVar.e(null);
                    }
                    C1051k0.e(y5);
                    y5.f10821U.b(0L);
                    break;
                }
                break;
            default:
                g02.S();
                break;
        }
    }
}
