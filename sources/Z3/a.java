package Z3;

import a4.C0263a;
import a4.c;
import com.bumptech.glide.d;
import com.onesignal.C0594t1;
import com.onesignal.E1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f4958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f4959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K1.b f4961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0594t1 f4962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0594t1 f4963f;

    public a(K1.b bVar, C0594t1 c0594t1, C0594t1 c0594t12) {
        AbstractC1305a.o(bVar, "dataRepository");
        this.f4961d = bVar;
        this.f4962e = c0594t1;
        this.f4963f = c0594t12;
    }

    public abstract void a();

    public abstract int b();

    public final C0263a c() {
        a4.b bVar;
        c cVar;
        switch (((b) this).f4964g) {
            case d.f6312l /* 0 */:
                bVar = a4.b.f5019x;
                break;
            default:
                bVar = a4.b.f5020y;
                break;
        }
        c cVar2 = c.f5027z;
        C0263a c0263a = new C0263a(bVar, cVar2, null);
        if (this.f4958a == null) {
            g();
        }
        c cVar3 = this.f4958a;
        if (cVar3 != null) {
            cVar2 = cVar3;
        }
        boolean zB = cVar2.b();
        K1.b bVar2 = this.f4961d;
        if (zB) {
            ((C0594t1) bVar2.f1515x).getClass();
            if (E1.b(E1.f7517a, "PREFS_OS_DIRECT_ENABLED", false)) {
                c0263a.f5018c = new JSONArray().put(this.f4960c);
                cVar = c.f5024w;
                c0263a.f5016a = cVar;
            }
        } else {
            cVar = c.f5025x;
            if (cVar2 == cVar) {
                ((C0594t1) bVar2.f1515x).getClass();
                if (E1.b(E1.f7517a, "PREFS_OS_INDIRECT_ENABLED", false)) {
                    c0263a.f5018c = this.f4959b;
                    c0263a.f5016a = cVar;
                }
            } else {
                ((C0594t1) bVar2.f1515x).getClass();
                if (E1.b(E1.f7517a, "PREFS_OS_UNATTRIBUTED_ENABLED", false)) {
                    cVar = c.f5026y;
                    c0263a.f5016a = cVar;
                }
            }
        }
        return c0263a;
    }

    public abstract String d();

    public abstract JSONArray e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!AbstractC1305a.c(getClass(), obj.getClass()))) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4958a == aVar.f4958a && AbstractC1305a.c(aVar.d(), d());
    }

    public final JSONArray f() {
        int iC;
        C0594t1 c0594t1 = this.f4962e;
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArrayE = e();
            c0594t1.getClass();
            C0594t1.d("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: " + jSONArrayE);
            b bVar = (b) this;
            int i6 = bVar.f4964g;
            K1.b bVar2 = bVar.f4961d;
            switch (i6) {
                case d.f6312l /* 0 */:
                    ((C0594t1) bVar2.f1515x).getClass();
                    iC = E1.c(1440, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW");
                    break;
                default:
                    ((C0594t1) bVar2.f1515x).getClass();
                    iC = E1.c(1440, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW");
                    break;
            }
            long j6 = ((long) (iC * 60)) * 1000;
            this.f4963f.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int length = jSONArrayE.length();
            for (int i7 = 0; i7 < length; i7++) {
                JSONObject jSONObject = jSONArrayE.getJSONObject(i7);
                if (jCurrentTimeMillis - jSONObject.getLong("time") <= j6) {
                    jSONArray.put(jSONObject.getString(d()));
                }
            }
        } catch (JSONException e6) {
            c0594t1.getClass();
            C0594t1.f("Generating tracker getLastReceivedIds JSONObject ", e6);
        }
        return jSONArray;
    }

    public abstract void g();

    public final void h() {
        this.f4960c = null;
        JSONArray jSONArrayF = f();
        this.f4959b = jSONArrayF;
        this.f4958a = jSONArrayF.length() > 0 ? c.f5025x : c.f5026y;
        a();
        String str = "OneSignal OSChannelTracker resetAndInitInfluence: " + d() + " finish with influenceType: " + this.f4958a;
        this.f4962e.getClass();
        C0594t1.d(str);
    }

    public final int hashCode() {
        c cVar = this.f4958a;
        return d().hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }

    public final void i(String str) {
        JSONArray jSONArray;
        String str2 = "OneSignal OSChannelTracker for: " + d() + " saveLastId: " + str;
        this.f4962e.getClass();
        C0594t1.d(str2);
        if (str == null || str.length() == 0) {
            return;
        }
        b bVar = (b) this;
        C0594t1 c0594t1 = bVar.f4962e;
        int i6 = bVar.f4964g;
        switch (i6) {
            case d.f6312l /* 0 */:
                try {
                    JSONArray jSONArrayE = bVar.e();
                    try {
                        JSONArray jSONArray2 = new JSONArray();
                        int length = jSONArrayE.length();
                        for (int i7 = 0; i7 < length; i7++) {
                            if (!AbstractC1305a.c(str, jSONArrayE.getJSONObject(i7).getString(bVar.d()))) {
                                jSONArray2.put(jSONArrayE.getJSONObject(i7));
                            }
                        }
                        jSONArrayE = jSONArray2;
                    } catch (JSONException e6) {
                        c0594t1.getClass();
                        C0594t1.f("Generating tracker lastChannelObjectReceived get JSONObject ", e6);
                    }
                    jSONArray = jSONArrayE;
                } catch (JSONException e7) {
                    c0594t1.getClass();
                    C0594t1.f("Generating IAM tracker getLastChannelObjects JSONObject ", e7);
                    jSONArray = new JSONArray();
                }
                break;
            default:
                try {
                    jSONArray = bVar.e();
                } catch (JSONException e8) {
                    c0594t1.getClass();
                    C0594t1.f("Generating Notification tracker getLastChannelObjects JSONObject ", e8);
                    jSONArray = new JSONArray();
                }
                break;
        }
        C0594t1.d("OneSignal OSChannelTracker for: " + d() + " saveLastId with lastChannelObjectsReceived: " + jSONArray);
        try {
            C0594t1 c0594t12 = this.f4963f;
            JSONObject jSONObjectPut = new JSONObject().put(d(), str);
            c0594t12.getClass();
            jSONArray.put(jSONObjectPut.put("time", System.currentTimeMillis()));
            if (jSONArray.length() > b()) {
                JSONArray jSONArray3 = new JSONArray();
                int length2 = jSONArray.length();
                for (int length3 = jSONArray.length() - b(); length3 < length2; length3++) {
                    try {
                        jSONArray3.put(jSONArray.get(length3));
                    } catch (JSONException e9) {
                        C0594t1.f("Generating tracker lastChannelObjectsReceived get JSONObject ", e9);
                    }
                }
                jSONArray = jSONArray3;
            }
            C0594t1.d("OneSignal OSChannelTracker for: " + d() + " with channelObjectToSave: " + jSONArray);
            K1.b bVar2 = bVar.f4961d;
            switch (i6) {
                case d.f6312l /* 0 */:
                    bVar2.getClass();
                    ((C0594t1) bVar2.f1515x).getClass();
                    E1.g(E1.f7517a, "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
                    break;
                default:
                    bVar2.getClass();
                    ((C0594t1) bVar2.f1515x).getClass();
                    E1.g(E1.f7517a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
                    break;
            }
        } catch (JSONException e10) {
            C0594t1.f("Generating tracker newInfluenceId JSONObject ", e10);
        }
    }

    public final String toString() {
        return "OSChannelTracker{tag=" + d() + ", influenceType=" + this.f4958a + ", indirectIds=" + this.f4959b + ", directId=" + this.f4960c + '}';
    }
}
