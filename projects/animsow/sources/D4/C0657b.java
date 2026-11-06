package d4;

import a3.C0261b;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0657b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0658c f8224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8226d;

    public C0657b(String str, C0658c c0658c, float f6, long j6) {
        AbstractC1305a.o(str, "outcomeId");
        this.f8223a = str;
        this.f8224b = c0658c;
        this.f8225c = f6;
        this.f8226d = j6;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", this.f8223a);
        C0658c c0658c = this.f8224b;
        if (c0658c != null) {
            JSONObject jSONObject = new JSONObject();
            C0261b c0261b = c0658c.f8227a;
            if (c0261b != null) {
                jSONObject.put("direct", c0261b.r());
            }
            C0261b c0261b2 = c0658c.f8228b;
            if (c0261b2 != null) {
                jSONObject.put("indirect", c0261b2.r());
            }
            jSONObjectPut.put("sources", jSONObject);
        }
        float f6 = 0;
        float f7 = this.f8225c;
        if (f7 > f6) {
            jSONObjectPut.put("weight", Float.valueOf(f7));
        }
        long j6 = this.f8226d;
        if (j6 > 0) {
            jSONObjectPut.put("timestamp", j6);
        }
        AbstractC1305a.n(jSONObjectPut, "json");
        return jSONObjectPut;
    }

    public final String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f8223a + "', outcomeSource=" + this.f8224b + ", weight=" + this.f8225c + ", timestamp=" + this.f8226d + '}';
    }
}
