package B3;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f93b;

    public /* synthetic */ c(d dVar, int i6) {
        this.f92a = i6;
        this.f93b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f92a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                d dVar = this.f93b;
                synchronized (dVar) {
                    try {
                        i iVar = (i) dVar.f94a.get();
                        ArrayList arrayListC = iVar.c();
                        iVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i6 = 0; i6 < arrayListC.size(); i6++) {
                            a aVar = (a) arrayListC.get(i6);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f88a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f89b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th2) {
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return string;
            default:
                d dVar2 = this.f93b;
                synchronized (dVar2) {
                    ((i) dVar2.f94a.get()).h(((L3.b) dVar2.f96c.get()).a(), System.currentTimeMillis());
                    break;
                }
                return null;
        }
    }
}
