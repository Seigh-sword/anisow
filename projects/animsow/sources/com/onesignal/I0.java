package com.onesignal;

import android.content.Context;
import java.security.SecureRandom;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B0 f7582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f7583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f7584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f7587f;

    public I0(Context context) {
        this.f7583b = context;
    }

    public final Integer a() {
        return Integer.valueOf(this.f7582a.f7472c);
    }

    public final void b(B0 b02) {
        int iNextInt;
        if (b02.f7472c == 0) {
            B0 b03 = this.f7582a;
            if (b03 == null || (iNextInt = b03.f7472c) == 0) {
                iNextInt = new SecureRandom().nextInt();
            }
            b02.f7472c = iNextInt;
        }
        this.f7582a = b02;
    }

    public final String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.f7584c + ", isRestoring=" + this.f7585d + ", isNotificationToDisplay=" + this.f7586e + ", shownTimeStamp=" + this.f7587f + ", overriddenBodyFromExtender=null, overriddenTitleFromExtender=null, overriddenSound=null, overriddenFlags=null, orgFlags=null, orgSound=null, notification=" + this.f7582a + '}';
    }
}
