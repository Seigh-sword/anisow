package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.google.android.gms.location.LocationListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class OSUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7658a = {401, 402, 403, 404, 410};

    public static boolean a() {
        try {
            return D.E.a(new D.K(AbstractC0603w1.f8028b).f188b);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static int b() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return 2;
        } catch (ClassNotFoundException unused) {
            if (h() && s("com.google.android.gms")) {
                return 1;
            }
            if (k() && g() && o()) {
                return 13;
            }
            return (!s("com.google.android.gms") && s("com.huawei.hwid")) ? 13 : 1;
        }
    }

    public static Bundle c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "Manifest application info not found", e6);
            return null;
        }
    }

    public static Integer d() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) AbstractC0603w1.f8028b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public static Uri f(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if ((!((str == null || str.matches("^[0-9]")) ? false : true) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) && (identifier = resources.getIdentifier("onesignal_default_sound", "raw", packageName)) == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("android.resource://");
        sb.append(packageName);
        sb.append("/");
        sb.append(identifier);
        return Uri.parse(sb.toString());
    }

    public static boolean g() {
        return j() && m();
    }

    public static boolean h() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean i() {
        try {
            return opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean j() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean k() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean l() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean m() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static int n(Context context, String str) {
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7996x;
        int iB = b();
        try {
            UUID.fromString(str);
            Integer num = null;
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                AbstractC0603w1.b(EnumC0600v1.f7997y, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com", null);
            }
            int iIntValue = 1;
            if (iB == 1) {
                if (!h()) {
                    AbstractC0603w1.b(enumC0600v1, "The Firebase FCM library is missing! Please make sure to include it in your project.", null);
                    num = -4;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    int i6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
                } catch (PackageManager.NameNotFoundException e6) {
                    e6.printStackTrace();
                }
            }
            return iIntValue;
        } catch (Throwable th) {
            AbstractC0603w1.b(enumC0600v1, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    public static boolean o() {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(AbstractC0603w1.f8028b) == 0;
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    public static boolean p() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    public static Set q() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Intent r(Uri uri) {
        Intent intentMakeMainSelectorActivity;
        int i6 = 3;
        int i7 = 0;
        if (uri.getScheme() != null) {
            String scheme = uri.getScheme();
            int[] iArrC = u.h.c(3);
            int length = iArrC.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                int i9 = iArrC[i8];
                if (H1.a.g(i9).equalsIgnoreCase(scheme)) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
        }
        if (i7 != 0) {
            i6 = i7;
        } else if (!uri.toString().contains("://")) {
            uri = Uri.parse("http://" + uri.toString());
        }
        if (u.h.b(i6) != 0) {
            intentMakeMainSelectorActivity = new Intent("android.intent.action.VIEW", uri);
        } else {
            intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intentMakeMainSelectorActivity.setData(uri);
        }
        intentMakeMainSelectorActivity.addFlags(268435456);
        return intentMakeMainSelectorActivity;
    }

    public static boolean s(String str) {
        try {
            return AbstractC0603w1.f8028b.getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static long[] t(JSONObject jSONObject) {
        try {
            Object objOpt = jSONObject.opt("vib_pt");
            JSONArray jSONArray = objOpt instanceof String ? new JSONArray((String) objOpt) : (JSONArray) objOpt;
            long[] jArr = new long[jSONArray.length()];
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                jArr[i6] = jSONArray.optLong(i6);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void u(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
