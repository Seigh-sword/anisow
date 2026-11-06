package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f7554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f7559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f7560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f7561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f7562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H1 f7563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J3.t f7564l;

    public G1(JSONObject jSONObject) {
        jSONObject.optBoolean("enterp", false);
        jSONObject.optBoolean("require_email_auth", false);
        jSONObject.optBoolean("require_user_id_auth", false);
        this.f7554b = jSONObject.optJSONArray("chnl_lst");
        this.f7555c = jSONObject.optBoolean("fba", false);
        this.f7556d = jSONObject.optBoolean("restore_ttl_filter", true);
        this.f7553a = jSONObject.optString("android_sender_id", null);
        this.f7557e = jSONObject.optBoolean("clear_group_on_summary_click", true);
        this.f7558f = jSONObject.optBoolean("receive_receipts_enable", false);
        this.f7559g = !jSONObject.has("disable_gms_missing_prompt") ? null : Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
        this.f7560h = !jSONObject.has("unsubscribe_on_notifications_disabled") ? null : Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
        this.f7561i = !jSONObject.has("location_shared") ? null : Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
        this.f7562j = !jSONObject.has("requires_user_privacy_consent") ? null : Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
        H1 h12 = new H1();
        h12.f7574a = 1440;
        h12.f7575b = 10;
        h12.f7576c = 1440;
        h12.f7577d = 10;
        h12.f7578e = false;
        h12.f7579f = false;
        h12.f7580g = false;
        h12.f7581h = false;
        this.f7563k = h12;
        if (jSONObject.has("outcomes")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("outcomes");
            if (jSONObjectOptJSONObject.has("v2_enabled")) {
                h12.f7581h = jSONObjectOptJSONObject.optBoolean("v2_enabled");
            }
            if (jSONObjectOptJSONObject.has("direct")) {
                h12.f7578e = jSONObjectOptJSONObject.optJSONObject("direct").optBoolean("enabled");
            }
            if (jSONObjectOptJSONObject.has("indirect")) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("indirect");
                h12.f7579f = jSONObjectOptJSONObject2.optBoolean("enabled");
                if (jSONObjectOptJSONObject2.has("notification_attribution")) {
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("notification_attribution");
                    h12.f7574a = jSONObjectOptJSONObject3.optInt("minutes_since_displayed", 1440);
                    h12.f7575b = jSONObjectOptJSONObject3.optInt("limit", 10);
                }
                if (jSONObjectOptJSONObject2.has("in_app_message_attribution")) {
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("in_app_message_attribution");
                    h12.f7576c = jSONObjectOptJSONObject4.optInt("minutes_since_displayed", 1440);
                    h12.f7577d = jSONObjectOptJSONObject4.optInt("limit", 10);
                }
            }
            if (jSONObjectOptJSONObject.has("unattributed")) {
                h12.f7580g = jSONObjectOptJSONObject.optJSONObject("unattributed").optBoolean("enabled");
            }
        }
        J3.t tVar = new J3.t();
        this.f7564l = tVar;
        if (jSONObject.has("fcm")) {
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("fcm");
            tVar.f1435c = jSONObjectOptJSONObject5.optString("api_key", null);
            tVar.f1434b = jSONObjectOptJSONObject5.optString("app_id", null);
            tVar.f1433a = jSONObjectOptJSONObject5.optString("project_id", null);
        }
    }
}
