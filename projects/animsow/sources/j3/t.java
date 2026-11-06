package J3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1435c;

    public t(K1.b bVar) {
        this.f1433a = bVar.t("gcm.n.title");
        bVar.q("gcm.n.title");
        Object[] objArrO = bVar.o("gcm.n.title");
        if (objArrO != null) {
            String[] strArr = new String[objArrO.length];
            for (int i6 = 0; i6 < objArrO.length; i6++) {
                strArr[i6] = String.valueOf(objArrO[i6]);
            }
        }
        this.f1434b = bVar.t("gcm.n.body");
        bVar.q("gcm.n.body");
        Object[] objArrO2 = bVar.o("gcm.n.body");
        if (objArrO2 != null) {
            String[] strArr2 = new String[objArrO2.length];
            for (int i7 = 0; i7 < objArrO2.length; i7++) {
                strArr2[i7] = String.valueOf(objArrO2[i7]);
            }
        }
        bVar.t("gcm.n.icon");
        String strT = bVar.t("gcm.n.sound2");
        this.f1435c = TextUtils.isEmpty(strT) ? bVar.t("gcm.n.sound") : strT;
        bVar.t("gcm.n.tag");
        bVar.t("gcm.n.color");
        bVar.t("gcm.n.click_action");
        bVar.t("gcm.n.android_channel_id");
        String strT2 = bVar.t("gcm.n.link_android");
        strT2 = TextUtils.isEmpty(strT2) ? bVar.t("gcm.n.link") : strT2;
        if (!TextUtils.isEmpty(strT2)) {
            Uri.parse(strT2);
        }
        bVar.t("gcm.n.image");
        bVar.t("gcm.n.ticker");
        bVar.k("gcm.n.notification_priority");
        bVar.k("gcm.n.visibility");
        bVar.k("gcm.n.notification_count");
        bVar.g("gcm.n.sticky");
        bVar.g("gcm.n.local_only");
        bVar.g("gcm.n.default_sound");
        bVar.g("gcm.n.default_vibrate_timings");
        bVar.g("gcm.n.default_light_settings");
        bVar.r();
        bVar.n();
        bVar.u();
    }

    public t(String str, String str2, String str3) {
        this.f1433a = str == null ? "onesignal-shared-public" : str;
        this.f1434b = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
        this.f1435c = str3 == null ? new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
    }
}
