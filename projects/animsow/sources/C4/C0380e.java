package c4;

import com.onesignal.C0594t1;
import com.onesignal.InterfaceC0609y1;
import d4.C0657b;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: c4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0380e extends AbstractC0377b {
    @Override // c4.AbstractC0377b
    public final void a(String str, int i6, C0657b c0657b, InterfaceC0609y1 interfaceC0609y1) {
        AbstractC1305a.o(str, "appId");
        AbstractC1305a.o(c0657b, "event");
        try {
            JSONObject jSONObjectPut = c0657b.a().put("app_id", str).put("device_type", i6);
            AbstractC0376a abstractC0376a = this.f6240c;
            AbstractC1305a.n(jSONObjectPut, "jsonObject");
            abstractC0376a.a(jSONObjectPut, interfaceC0609y1);
        } catch (JSONException e6) {
            this.f6238a.getClass();
            C0594t1.f("Generating indirect outcome:JSON Failed.", e6);
        }
    }
}
