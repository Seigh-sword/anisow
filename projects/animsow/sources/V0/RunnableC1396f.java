package v0;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0487r4;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import m2.AbstractC1078w;
import m2.C1032e;
import m2.C1051k0;
import m2.C1060n0;
import m2.K1;
import m2.S0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: v0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1396f implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f13103A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f13104B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f13107y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f13108z;

    public /* synthetic */ RunnableC1396f(S0 s02, int i6, IOException iOException, byte[] bArr, Map map) {
        this.f13105w = 1;
        this.f13107y = s02;
        this.f13106x = i6;
        this.f13108z = iOException;
        this.f13103A = bArr;
        this.f13104B = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13105w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C1399h) this.f13104B).f13132c.execute(new RunnableC1403l(this, 3, AbstractC1414x.e(new C1394e(this))));
                break;
            default:
                S0 s02 = (S0) this.f13107y;
                int i6 = this.f13106x;
                Exception exc = (Exception) this.f13108z;
                byte[] bArr = (byte[]) this.f13103A;
                C1051k0 c1051k0 = ((C1060n0) s02.f10763z).f11037a;
                C1032e c1032e = c1051k0.f10981C;
                m2.N n5 = c1051k0.f10983E;
                if ((i6 == 200 || i6 == 204 || i6 == 304) && exc == null) {
                    m2.Y y5 = c1051k0.f10982D;
                    C1051k0.e(y5);
                    y5.f10817Q.a(true);
                    if (bArr == null || bArr.length == 0) {
                        C1051k0.i(n5);
                        n5.f10722I.d("Deferred Deep Link response empty.");
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String strOptString = jSONObject.optString("deeplink", "");
                            if (TextUtils.isEmpty(strOptString)) {
                                C1051k0.i(n5);
                                n5.f10722I.d("Deferred Deep Link is empty.");
                            } else {
                                String strOptString2 = jSONObject.optString("gclid", "");
                                String strOptString3 = jSONObject.optString("gbraid", "");
                                String strOptString4 = jSONObject.optString("gad_source", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                Bundle bundle = new Bundle();
                                C0487r4.a();
                                m2.E e6 = AbstractC1078w.f11157S0;
                                boolean zD = c1032e.D(null, e6);
                                K1 k12 = c1051k0.f10986H;
                                if (!zD) {
                                    C1051k0.e(k12);
                                    if (!k12.y0(strOptString)) {
                                        C1051k0.i(n5);
                                        n5.f10718E.b(strOptString2, strOptString, "Deferred Deep Link validation failed. gclid, deep link");
                                    }
                                } else {
                                    C1051k0.e(k12);
                                    if (!k12.y0(strOptString)) {
                                        C1051k0.i(n5);
                                        n5.f10718E.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                                    } else {
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            bundle.putString("gbraid", strOptString3);
                                        }
                                        if (!TextUtils.isEmpty(strOptString4)) {
                                            bundle.putString("gad_source", strOptString4);
                                        }
                                    }
                                }
                                C0487r4.a();
                                c1032e.D(null, e6);
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                c1051k0.f10990L.Y("auto", "_cmp", bundle);
                                C1051k0.e(k12);
                                if (!TextUtils.isEmpty(strOptString)) {
                                    try {
                                        SharedPreferences.Editor editorEdit = k12.a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                        editorEdit.putString("deeplink", strOptString);
                                        editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                        if (editorEdit.commit()) {
                                            k12.a().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                        }
                                    } catch (RuntimeException e7) {
                                        k12.f().f10715B.c(e7, "Failed to persist Deferred Deep Link. exception");
                                        return;
                                    }
                                }
                            }
                        } catch (JSONException e8) {
                            C1051k0.i(n5);
                            n5.f10715B.c(e8, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                } else {
                    C1051k0.i(n5);
                    n5.f10718E.b(Integer.valueOf(i6), exc, "Network Request for Deferred Deep Link failed. response, exception");
                }
                break;
        }
    }

    public RunnableC1396f(C1399h c1399h, List list, List list2, int i6) {
        this.f13105w = 0;
        this.f13104B = c1399h;
        this.f13107y = list;
        this.f13108z = list2;
        this.f13106x = i6;
        this.f13103A = null;
    }
}
