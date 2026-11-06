package J3;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f1451d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1454c;

    public y(long j6, String str, String str2) {
        this.f1452a = str;
        this.f1453b = str2;
        this.f1454c = j6;
    }

    public static String a(long j6, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j6);
            return jSONObject.toString();
        } catch (JSONException e6) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e6);
            return null;
        }
    }

    public static y b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new y(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new y(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e6) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e6);
            return null;
        }
    }
}
