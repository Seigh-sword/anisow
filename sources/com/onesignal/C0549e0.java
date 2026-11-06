package com.onesignal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0549e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7794d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f7795e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X1 f7796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7797g;

    public C0549e0(JSONObject jSONObject) throws JSONException {
        int i6;
        C0596u0 c0596u0;
        this.f7791a = jSONObject.optString("id", null);
        jSONObject.optString("name", null);
        this.f7793c = jSONObject.optString("url", null);
        jSONObject.optString("pageId", null);
        String strOptString = jSONObject.optString("url_target", null);
        int[] iArrC = u.h.c(3);
        int length = iArrC.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i6 = 0;
                break;
            }
            i6 = iArrC[i7];
            if (H1.a.e(i6).equalsIgnoreCase(strOptString)) {
                break;
            } else {
                i7++;
            }
        }
        this.f7792b = i6;
        if (i6 == 0) {
            this.f7792b = 1;
        }
        jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i8);
                C0587r0 c0587r0 = new C0587r0();
                c0587r0.f7964a = jSONObject2.getString("name");
                c0587r0.f7965b = jSONObject2.has("weight") ? (float) jSONObject2.getDouble("weight") : 0.0f;
                c0587r0.f7966c = jSONObject2.has("unique") && jSONObject2.getBoolean("unique");
                this.f7794d.add(c0587r0);
            }
        }
        if (jSONObject.has("tags")) {
            this.f7796f = new X1(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("prompts");
            for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                String string = jSONArray2.getString(i9);
                string.getClass();
                boolean zEquals = string.equals("push");
                ArrayList arrayList = this.f7795e;
                if (zEquals) {
                    c0596u0 = new C0596u0(0);
                } else if (string.equals("location")) {
                    c0596u0 = new C0596u0(1);
                }
                arrayList.add(c0596u0);
            }
        }
    }
}
