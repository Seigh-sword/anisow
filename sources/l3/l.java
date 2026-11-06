package l3;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K1.b f10060a;

    static {
        y3.d dVar = new y3.d();
        C0938a c0938a = C0938a.f10024a;
        dVar.a(l.class, c0938a);
        dVar.a(C0939b.class, c0938a);
        f10060a = new K1.b(19, dVar);
    }

    public static C0939b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j6 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new C0939b(string, string2, string3, string4, j6);
    }
}
