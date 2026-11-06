package m2;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import d3.C0654b;
import f3.C0702c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f10530a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f10531b = {"ad_impression"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f10532c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f10533d = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f10534e = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f10535f = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f10536g = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f10537h = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f10538i = {"items"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f10539j = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static int a(int i6, int i7) {
        return G.a.d(i6, (Color.alpha(i6) * i7) / 255);
    }

    public static int b(int i6, int i7) {
        if (i7 <= 1073741823) {
            return Math.min(Math.max(i6, i7), 1073741823);
        }
        throw new IllegalArgumentException(m("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i7), 1073741823));
    }

    public static void c(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i6 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (d3.i iVar : (Set) it2.next()) {
                        for (d3.k kVar : iVar.f8199a.f8183c) {
                            if (kVar.f8206c == 0) {
                                Set<d3.i> set = (Set) map.get(new d3.j(kVar.f8204a, kVar.f8205b == 2));
                                if (set != null) {
                                    for (d3.i iVar2 : set) {
                                        iVar.f8200b.add(iVar2);
                                        iVar2.f8201c.add(iVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<d3.i> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (d3.i iVar3 : hashSet) {
                    if (iVar3.f8201c.isEmpty()) {
                        hashSet2.add(iVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    d3.i iVar4 = (d3.i) hashSet2.iterator().next();
                    hashSet2.remove(iVar4);
                    i6++;
                    for (d3.i iVar5 : iVar4.f8200b) {
                        iVar5.f8201c.remove(iVar4);
                        if (iVar5.f8201c.isEmpty()) {
                            hashSet2.add(iVar5);
                        }
                    }
                }
                if (i6 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (d3.i iVar6 : hashSet) {
                    if (!iVar6.f8201c.isEmpty() && !iVar6.f8200b.isEmpty()) {
                        arrayList2.add(iVar6.f8199a);
                    }
                }
                throw new Q3.q("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            C0654b c0654b = (C0654b) it.next();
            d3.i iVar7 = new d3.i(c0654b);
            for (d3.r rVar : c0654b.f8182b) {
                boolean z5 = !(c0654b.f8185e == 0);
                d3.j jVar = new d3.j(rVar, z5);
                if (!map.containsKey(jVar)) {
                    map.put(jVar, new HashSet());
                }
                Set set2 = (Set) map.get(jVar);
                if (!set2.isEmpty() && !z5) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set2.add(iVar7);
            }
        }
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int e(Context context, int i6, int i7) {
        Integer numValueOf;
        int iA;
        TypedValue typedValueO = o(context, i6);
        if (typedValueO != null) {
            int i8 = typedValueO.resourceId;
            if (i8 != 0) {
                Object obj = E.f.f379a;
                iA = E.b.a(context, i8);
            } else {
                iA = typedValueO.data;
            }
            numValueOf = Integer.valueOf(iA);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i7;
    }

    public static int f(View view, int i6) {
        Context context = view.getContext();
        TypedValue typedValueQ = q(i6, view.getContext(), view.getClass().getCanonicalName());
        int i7 = typedValueQ.resourceId;
        if (i7 == 0) {
            return typedValueQ.data;
        }
        Object obj = E.f.f379a;
        return E.b.a(context, i7);
    }

    public static ColorStateList g(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !B.a.r(drawable)) {
            return null;
        }
        return B.a.e(drawable).getColorStateList();
    }

    public static final C0702c h() {
        C0702c c0702c = (C0702c) Y2.g.c().b(C0702c.class);
        if (c0702c != null) {
            return c0702c;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static void i(final Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (f2.h.t(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        final boolean z5 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT < 29) {
            f2.h.l(null);
        } else {
            final q2.j jVar = new q2.j();
            new Runnable() { // from class: J3.r
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    q2.j jVar2 = jVar;
                    try {
                        if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                            SharedPreferences.Editor editorEdit = f2.h.t(context2).edit();
                            editorEdit.putBoolean("proxy_notification_initialized", true);
                            editorEdit.apply();
                            NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                            if (z5) {
                                notificationManager.setNotificationDelegate("com.google.android.gms");
                            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        } else {
                            Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        }
                        jVar2.c(null);
                    } catch (Throwable th) {
                        jVar2.c(null);
                        throw th;
                    }
                }
            }.run();
        }
    }

    public static boolean j(int i6) {
        boolean z5;
        if (i6 != 0) {
            ThreadLocal threadLocal = G.a.f639a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i6);
            int iGreen = Color.green(i6);
            int iBlue = Color.blue(i6);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d6 = ((double) iRed) / 255.0d;
            double dPow = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            double d7 = ((double) iGreen) / 255.0d;
            double dPow2 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            double d8 = ((double) iBlue) / 255.0d;
            double dPow3 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
            z5 = false;
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d9 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d9;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d9 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z5 = false;
        }
        return z5;
    }

    public static boolean k(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static int l(float f6, int i6, int i7) {
        return G.a.b(G.a.d(i7, Math.round(Color.alpha(i7) * f6)), i6);
    }

    public static String m(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i6 = 0;
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e6) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e6);
                    String name2 = e6.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i7] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i8 = 0;
        while (i6 < objArr.length && (iIndexOf = str.indexOf("%s", i8)) != -1) {
            sb3.append((CharSequence) str, i8, iIndexOf);
            sb3.append(objArr[i6]);
            i8 = iIndexOf + 2;
            i6++;
        }
        sb3.append((CharSequence) str, i8, str.length());
        if (i6 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i6]);
            for (int i9 = i6 + 1; i9 < objArr.length; i9++) {
                sb3.append(", ");
                sb3.append(objArr[i9]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static Typeface n(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, com.bumptech.glide.c.o(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static TypedValue o(Context context, int i6) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean p(Context context, int i6, boolean z5) {
        TypedValue typedValueO = o(context, i6);
        return (typedValueO == null || typedValueO.type != 18) ? z5 : typedValueO.data != 0;
    }

    public static TypedValue q(int i6, Context context, String str) {
        TypedValue typedValueO = o(context, i6);
        if (typedValueO != null) {
            return typedValueO;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i6)));
    }

    public static void r(Q3.p pVar, X3.b bVar) {
        T3.w.f3543z.c(bVar, pVar);
    }

    public static String s(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i6 = 0; i6 < iMin; i6++) {
            String str2 = strArr[i6];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i6];
            }
        }
        return null;
    }

    public static HashSet t(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static void u(N n5, SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        com.google.android.gms.internal.measurement.N n6 = com.google.android.gms.internal.measurement.N.f6643d;
        File file = new File(path);
        boolean readable = file.setReadable(false, false);
        P p5 = n5.f10718E;
        if (!readable) {
            p5.d("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            p5.d("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            p5.d("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        p5.d("Failed to turn on database write permission for owner");
    }

    public static void v(N n5, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        boolean zMoveToFirst;
        P p5 = n5.f10718E;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e6) {
            p5.b(str, e6, "Error querying for table");
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        if (!zMoveToFirst) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            HashSet hashSetT = t(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!hashSetT.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i6 = 0; i6 < strArr.length; i6 += 2) {
                    if (!hashSetT.remove(strArr[i6])) {
                        sQLiteDatabase.execSQL(strArr[i6 + 1]);
                    }
                }
            }
            if (hashSetT.isEmpty()) {
                return;
            }
            p5.b(str, TextUtils.join(", ", hashSetT), "Table has extra columns. table, columns");
        } catch (SQLiteException e7) {
            n5.f10715B.c(str, "Failed to verify columns on table that was just created");
            throw e7;
        }
    }
}
