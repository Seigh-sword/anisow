package com.onesignal;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0574m1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7893x;

    public /* synthetic */ RunnableC0574m1(JSONObject jSONObject, int i6) {
        this.f7892w = i6;
        this.f7893x = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f7892w;
        JSONObject jSONObject = this.f7893x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0603w1.f8053s.getClass();
                C0594t1.d("Running sendTags() operation from pending task queue.");
                AbstractC0603w1.P(jSONObject);
                break;
            default:
                if (jSONObject != null) {
                    JSONObject jSONObject2 = (JSONObject) M1.d(false).f7985x;
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            Object objOpt = jSONObject.opt(next);
                            if ((objOpt instanceof JSONArray) || (objOpt instanceof JSONObject)) {
                                AbstractC0603w1.b(EnumC0600v1.f7997y, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null);
                            } else if (!jSONObject.isNull(next) && !"".equals(objOpt)) {
                                jSONObject3.put(next, objOpt.toString());
                            } else if (jSONObject2 != null && jSONObject2.has(next)) {
                                jSONObject3.put(next, "");
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (jSONObject3.toString().equals("{}")) {
                        AbstractC0603w1.f8053s.getClass();
                        C0594t1.d("Send tags ended successfully");
                    } else {
                        C0594t1 c0594t1 = AbstractC0603w1.f8053s;
                        String str = "Available tags to send: " + jSONObject3.toString();
                        c0594t1.getClass();
                        C0594t1.d(str);
                        try {
                            JSONObject jSONObjectPut = new JSONObject().put("tags", jSONObject3);
                            M1.b().w(jSONObjectPut);
                            M1.a().w(jSONObjectPut);
                            M1.c().w(jSONObjectPut);
                        } catch (JSONException e6) {
                            e6.printStackTrace();
                            return;
                        }
                    }
                } else {
                    AbstractC0603w1.f8053s.getClass();
                    C0594t1.e("Attempted to send null tags");
                }
                break;
        }
    }
}
