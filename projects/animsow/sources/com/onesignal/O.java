package com.onesignal;

import android.app.Activity;
import com.xo.anilab.R;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class O implements O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7651a = 0;

    static {
        PermissionsActivity.f7671B.put("LOCATION", new O());
    }

    @Override // com.onesignal.O1
    public final void a() {
        M.i(true, 1);
        M.j();
    }

    @Override // com.onesignal.O1
    public final void b(boolean z5) {
        Activity activityJ;
        M.i(true, 2);
        if (z5 && (activityJ = AbstractC0603w1.j()) != null) {
            String string = activityJ.getString(R.string.location_permission_name_for_title);
            AbstractC1305a.n(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = activityJ.getString(R.string.location_permission_settings_message);
            AbstractC1305a.n(string2, "activity.getString(R.str…mission_settings_message)");
            AbstractC0571l1.U(activityJ, string, string2, new N(0, activityJ));
        }
        M.c();
    }
}
