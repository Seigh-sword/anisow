package Y2;

import X1.C0247o;
import android.content.Context;
import android.text.TextUtils;
import b2.AbstractC0339d;
import java.util.Arrays;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4837g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i6 = AbstractC0339d.f5920a;
        AbstractC1332d.o("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f4832b = str;
        this.f4831a = str2;
        this.f4833c = str3;
        this.f4834d = str4;
        this.f4835e = str5;
        this.f4836f = str6;
        this.f4837g = str7;
    }

    public static i a(Context context) {
        C0247o c0247o = new C0247o(context);
        String strA = c0247o.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new i(strA, c0247o.a("google_api_key"), c0247o.a("firebase_database_url"), c0247o.a("ga_trackingId"), c0247o.a("gcm_defaultSenderId"), c0247o.a("google_storage_bucket"), c0247o.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC1332d.D(this.f4832b, iVar.f4832b) && AbstractC1332d.D(this.f4831a, iVar.f4831a) && AbstractC1332d.D(this.f4833c, iVar.f4833c) && AbstractC1332d.D(this.f4834d, iVar.f4834d) && AbstractC1332d.D(this.f4835e, iVar.f4835e) && AbstractC1332d.D(this.f4836f, iVar.f4836f) && AbstractC1332d.D(this.f4837g, iVar.f4837g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4832b, this.f4831a, this.f4833c, this.f4834d, this.f4835e, this.f4836f, this.f4837g});
    }

    public final String toString() {
        C1358b c1358b = new C1358b(this);
        c1358b.c(this.f4832b, "applicationId");
        c1358b.c(this.f4831a, "apiKey");
        c1358b.c(this.f4833c, "databaseUrl");
        c1358b.c(this.f4835e, "gcmSenderId");
        c1358b.c(this.f4836f, "storageBucket");
        c1358b.c(this.f4837g, "projectId");
        return c1358b.toString();
    }
}
