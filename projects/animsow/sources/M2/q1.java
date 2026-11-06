package m2;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f11067b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11068a;

    public q1(HashMap map) {
        HashMap map2 = new HashMap();
        this.f11068a = map2;
        map2.putAll(map);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = f11067b;
        for (int i6 = 0; i6 < 6; i6++) {
            String str = strArr[i6];
            HashMap map = this.f11068a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    public final int b() {
        try {
            String str = (String) this.f11068a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            return a().equalsIgnoreCase(((q1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
