package P3;

import M4.InterfaceC0080z;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2530A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ h f2531B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Map f2532C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C4.p f2533D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C4.p f2534E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Map map, C4.p pVar, C4.p pVar2, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2531B = hVar;
        this.f2532C = map;
        this.f2533D = pVar;
        this.f2534E = pVar2;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((g) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new g(this.f2531B, this.f2532C, this.f2533D, this.f2534E, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2530A;
        C4.p pVar = this.f2534E;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                URLConnection uRLConnectionOpenConnection = h.a(this.f2531B).openConnection();
                AbstractC1305a.m(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f2532C.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    C4.p pVar2 = this.f2533D;
                    this.f2530A = 1;
                    if (pVar2.h(jSONObject, this) == enumC1481a) {
                        return enumC1481a;
                    }
                } else {
                    String str = "Bad response code: " + responseCode;
                    this.f2530A = 2;
                    if (pVar.h(str, this) == enumC1481a) {
                        return enumC1481a;
                    }
                }
            } else {
                if (i6 != 1 && i6 != 2 && i6 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = e6.toString();
            }
            this.f2530A = 3;
            if (pVar.h(message, this) == enumC1481a) {
                return enumC1481a;
            }
        }
        return C1316l.f12640a;
    }
}
