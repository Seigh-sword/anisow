package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.xo.anilab.R;
import java.util.HashSet;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class X implements O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f7725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f7727c;

    static {
        X x5 = new X();
        f7725a = new HashSet();
        PermissionsActivity.f7671B.put("NOTIFICATION", x5);
        boolean z5 = false;
        if (Build.VERSION.SDK_INT > 32) {
            Context context = AbstractC0603w1.f8028b;
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion > 32) {
                    z5 = true;
                }
            } catch (PackageManager.NameNotFoundException e6) {
                e6.printStackTrace();
            }
        }
        f7727c = z5;
    }

    public static void c(boolean z5) {
        HashSet<C0593t0> hashSet = f7725a;
        for (C0593t0 c0593t0 : hashSet) {
            c0593t0.getClass();
            c0593t0.f7977a.j(z5 ? 1 : 2);
        }
        hashSet.clear();
    }

    public static boolean d() {
        Activity activityJ = AbstractC0603w1.j();
        if (activityJ == null) {
            return false;
        }
        String string = activityJ.getString(R.string.notification_permission_name_for_title);
        AbstractC1305a.n(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = activityJ.getString(R.string.notification_permission_settings_message);
        AbstractC1305a.n(string2, "activity.getString(R.str…mission_settings_message)");
        AbstractC0571l1.U(activityJ, string, string2, new N(1, activityJ));
        return true;
    }

    @Override // com.onesignal.O1
    public final void a() {
        S0 s0L = AbstractC0603w1.l(AbstractC0603w1.f8028b);
        s0L.getClass();
        boolean zA = OSUtils.a();
        boolean z5 = s0L.f7699x != zA;
        s0L.f7699x = zA;
        if (z5) {
            s0L.f7698w.h(s0L);
        }
        c(true);
    }

    @Override // com.onesignal.O1
    public final void b(boolean z5) {
        if (z5 && d()) {
            return;
        }
        c(false);
    }
}
