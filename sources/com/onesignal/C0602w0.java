package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0602w0 extends JSONObject {
    public C0602w0(String str) throws JSONException {
        put("userId", str);
    }

    public C0602w0(String str, int i6, String str2, String str3, String str4, boolean z5) throws JSONException {
        put("app_id", str);
        put("device_type", i6);
        put("player_id", str2);
        put("click_id", str3);
        put("variant_id", str4);
        if (z5) {
            put("first_click", true);
        }
    }

    public C0602w0(String str, String str2, String str3, int i6) throws JSONException {
        put("app_id", str);
        put("player_id", str2);
        put("variant_id", str3);
        put("device_type", i6);
        put("first_impression", true);
    }

    public C0602w0(String str, String str2, String str3, int i6, String str4) throws JSONException {
        put("app_id", str);
        put("player_id", str2);
        put("variant_id", str3);
        put("device_type", i6);
        put("page_id", str4);
    }
}
