package U1;

import D.AbstractC0005f;
import D.C0013n;
import W1.I;
import W1.InterfaceC0213g;
import W1.X;
import X1.C0250s;
import X1.C0251t;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import d.AbstractC0628i;
import h0.E;
import h0.W;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3585c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f3586d = new e();

    public static AlertDialog d(Context context, int i6, X1.u uVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i6 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(X1.r.b(context, i6));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String string = context.getResources().getString(i6 != 1 ? i6 != 2 ? i6 != 3 ? R.string.ok : com.xo.anilab.R.string.common_google_play_services_enable_button : com.xo.anilab.R.string.common_google_play_services_update_button : com.xo.anilab.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, uVar);
        }
        String strC = X1.r.c(context, i6);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", AbstractC0628i.f("Creating dialog for Google Play services availability issue. ConnectionResult=", i6), new IllegalArgumentException());
        return builder.create();
    }

    public static I e(Context context, com.bumptech.glide.c cVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        I i6 = new I(cVar);
        int i7 = AbstractC0005f.f190b;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            context.registerReceiver(i6, intentFilter, i8 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(i6, intentFilter);
        }
        i6.f4248a = context;
        if (h.b(context)) {
            return i6;
        }
        cVar.R();
        i6.a();
        return null;
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof E) {
                W wC = ((E) activity).f8646P.C();
                j jVar = new j();
                AbstractC1332d.n(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f3597J0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f3598K0 = onCancelListener;
                }
                jVar.X(wC, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        AbstractC1332d.n(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f3579w = alertDialog;
        if (onCancelListener != null) {
            cVar.f3580x = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Override // U1.f
    public final Intent a(int i6, Context context, String str) {
        return super.a(i6, context, str);
    }

    @Override // U1.f
    public final int b(Context context, int i6) {
        return super.b(context, i6);
    }

    public final void c(Activity activity, int i6, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i6, new C0250s(activity, super.a(i6, activity, "d")), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        f(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i6, PendingIntent pendingIntent) {
        int i7;
        Log.w("GoogleApiAvailability", H1.a.j("GMS core API Availability. ConnectionResult=", i6, ", tag=null"), new IllegalArgumentException());
        if (i6 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i6 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i6 == 6 ? X1.r.e(context, "common_google_play_services_resolution_required_title") : X1.r.c(context, i6);
        if (strE == null) {
            strE = context.getResources().getString(com.xo.anilab.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i6 == 6 || i6 == 19) ? X1.r.d(context, "common_google_play_services_resolution_required_text", X1.r.a(context)) : X1.r.b(context, i6);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC1332d.m(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        D.t tVar = new D.t(context, null);
        tVar.f233o = true;
        tVar.d(16, true);
        tVar.f223e = D.t.b(strE);
        D.r rVar = new D.r(0);
        rVar.f218f = D.t.b(strD);
        tVar.g(rVar);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1332d.f12704m == null) {
            AbstractC1332d.f12704m = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC1332d.f12704m.booleanValue()) {
            tVar.f240v.icon = context.getApplicationInfo().icon;
            tVar.f228j = 2;
            if (AbstractC1332d.V(context)) {
                tVar.f220b.add(new C0013n(com.xo.anilab.R.drawable.common_full_open_on_phone, resources.getString(com.xo.anilab.R.string.common_open_on_phone), pendingIntent));
            } else {
                tVar.f225g = pendingIntent;
            }
        } else {
            tVar.f240v.icon = R.drawable.stat_sys_warning;
            tVar.f240v.tickerText = D.t.b(resources.getString(com.xo.anilab.R.string.common_google_play_services_notification_ticker));
            tVar.f240v.when = System.currentTimeMillis();
            tVar.f225g = pendingIntent;
            tVar.f224f = D.t.b(strD);
        }
        if (AbstractC1332d.S()) {
            AbstractC1332d.p(AbstractC1332d.S());
            synchronized (f3585c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.xo.anilab.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(B3.h.B(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            tVar.f237s = "com.google.android.gms.availability";
        }
        Notification notificationA = tVar.a();
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            h.f3590a.set(false);
            i7 = 10436;
        } else {
            i7 = 39789;
        }
        notificationManager.notify(i7, notificationA);
    }

    public final void h(Activity activity, InterfaceC0213g interfaceC0213g, int i6, X x5) {
        AlertDialog alertDialogD = d(activity, i6, new C0251t(super.a(i6, activity, "d"), interfaceC0213g), x5);
        if (alertDialogD == null) {
            return;
        }
        f(activity, alertDialogD, "GooglePlayServicesErrorDialog", x5);
    }
}
