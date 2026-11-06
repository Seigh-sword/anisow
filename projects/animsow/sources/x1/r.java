package X1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.xo.anilab.R;
import d2.C0652c;
import java.util.Locale;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.k f4642a = new s.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f4643b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C0652c.a(context).f12256x;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i6) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i6 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strA);
        }
        if (i6 == 2) {
            return AbstractC1332d.V(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strA);
        }
        if (i6 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strA);
        }
        if (i6 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i6 == 7) {
            return d(context, "common_google_play_services_network_error_text", strA);
        }
        if (i6 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strA);
        }
        if (i6 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i6) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strA);
        }
    }

    public static String c(Context context, int i6) {
        String str;
        Resources resources = context.getResources();
        switch (i6) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return resources.getString(R.string.common_google_play_services_update_title);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i6;
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        s.k kVar = f4642a;
        synchronized (kVar) {
            try {
                Locale locale = J.e.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f4643b)) {
                    kVar.clear();
                    f4643b = locale;
                }
                String str2 = (String) kVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int i6 = U1.g.f3589e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f4642a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
