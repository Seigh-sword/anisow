package c4;

import a3.C0261b;
import com.onesignal.C0594t1;
import com.onesignal.InterfaceC0609y1;
import com.onesignal.Q0;
import d4.C0657b;
import d4.C0658c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: c4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0378c extends AbstractC0377b {
    @Override // c4.AbstractC0377b
    public final void a(String str, int i6, C0657b c0657b, InterfaceC0609y1 interfaceC0609y1) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C0261b c0261b;
        JSONArray jSONArray3;
        AbstractC1305a.o(str, "appId");
        AbstractC1305a.o(c0657b, "eventParams");
        a4.c cVar = a4.c.f5026y;
        C0658c c0658c = c0657b.f8224b;
        if (c0658c == null) {
            jSONArray = null;
        } else {
            C0261b c0261b2 = c0658c.f8227a;
            if (c0261b2 == null || (jSONArray3 = (JSONArray) c0261b2.f5011x) == null || jSONArray3.length() <= 0) {
                C0261b c0261b3 = c0658c.f8228b;
                if (c0261b3 != null && (jSONArray2 = (JSONArray) c0261b3.f5011x) != null && jSONArray2.length() > 0) {
                    cVar = a4.c.f5025x;
                    c0261b = c0658c.f8228b;
                }
                jSONArray = null;
            } else {
                cVar = a4.c.f5024w;
                c0261b = c0658c.f8227a;
            }
            jSONArray = (JSONArray) c0261b.f5011x;
        }
        long j6 = c0657b.f8226d;
        Q0 q02 = new Q0();
        q02.f7683a = cVar;
        q02.f7684b = jSONArray;
        q02.f7685c = c0657b.f8223a;
        q02.f7686d = j6;
        q02.f7687e = Float.valueOf(c0657b.f8225c);
        a4.c cVar2 = q02.f7683a;
        if (cVar2 == null) {
            return;
        }
        int iOrdinal = cVar2.ordinal();
        C0594t1 c0594t1 = this.f6238a;
        AbstractC0376a abstractC0376a = this.f6240c;
        if (iOrdinal == 0) {
            try {
                JSONObject jSONObjectPut = q02.a().put("app_id", str).put("device_type", i6).put("direct", true);
                AbstractC1305a.n(jSONObjectPut, "jsonObject");
                abstractC0376a.a(jSONObjectPut, interfaceC0609y1);
                return;
            } catch (JSONException e6) {
                c0594t1.getClass();
                C0594t1.f("Generating direct outcome:JSON Failed.", e6);
                return;
            }
        }
        if (iOrdinal == 1) {
            try {
                JSONObject jSONObjectPut2 = q02.a().put("app_id", str).put("device_type", i6).put("direct", false);
                AbstractC1305a.n(jSONObjectPut2, "jsonObject");
                abstractC0376a.a(jSONObjectPut2, interfaceC0609y1);
                return;
            } catch (JSONException e7) {
                c0594t1.getClass();
                C0594t1.f("Generating indirect outcome:JSON Failed.", e7);
                return;
            }
        }
        if (iOrdinal != 2) {
            return;
        }
        try {
            JSONObject jSONObjectPut3 = q02.a().put("app_id", str).put("device_type", i6);
            AbstractC1305a.n(jSONObjectPut3, "jsonObject");
            abstractC0376a.a(jSONObjectPut3, interfaceC0609y1);
        } catch (JSONException e8) {
            c0594t1.getClass();
            C0594t1.f("Generating unattributed outcome:JSON Failed.", e8);
        }
    }
}
