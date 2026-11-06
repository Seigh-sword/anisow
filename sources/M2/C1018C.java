package m2;

import V4.InterfaceC0179j;
import com.google.android.gms.internal.measurement.C0493s4;
import com.google.android.gms.internal.measurement.C0505u4;
import com.google.android.gms.internal.measurement.InterfaceC0511v4;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONException;
import org.json.JSONObject;
import r3.C1275a;

/* JADX INFO: renamed from: m2.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1018C implements InterfaceC1019D, r3.c, S3.q, b4.b, InterfaceC0179j, b5.C {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10529w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1018C() {
        this(2);
        this.f10529w = 2;
    }

    @Override // m2.InterfaceC1019D
    public final Object a() {
        ((C0505u4) ((InterfaceC0511v4) C0493s4.f6958x.get())).getClass();
        Boolean bool = (Boolean) C0505u4.f6973b.a();
        bool.getClass();
        return bool;
    }

    @Override // r3.c
    public final C1275a c(C1018C c1018c, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        N.r rVar = jSONObject.has("session") ? new N.r(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new N.r(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        l1.l lVar = new l1.l(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j6 = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            c1018c.getClass();
            jCurrentTimeMillis = (j6 * 1000) + System.currentTimeMillis();
        }
        return new C1275a(jCurrentTimeMillis, rVar, lVar, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // S3.q
    public final Object h() {
        switch (this.f10529w) {
            case 13:
                return new TreeSet();
            case 14:
                return new ArrayDeque();
            case 15:
                return new ConcurrentSkipListMap();
            case 16:
                return new TreeMap();
            default:
                return new S3.p(true);
        }
    }

    @Override // b4.b
    public final String j() {
        String language;
        language = Locale.getDefault().getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "zh":
                return language + "-" + Locale.getDefault().getCountry();
            default:
                return language;
        }
    }

    public /* synthetic */ C1018C(int i6) {
        this.f10529w = i6;
    }
}
