package H3;

import E.c;
import E.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1059a;

    public a(Context context, String str) {
        boolean z5;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = f.f379a;
        Context contextA = c.a(context);
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        boolean z6 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z5 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = contextA.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z6 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z5 = z6;
        }
        this.f1059a = z5;
    }
}
