package L0;

import I0.o;
import J0.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1674a = o.y("Alarms");

    public static void a(int i6, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i6, b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        o.w().u(f1674a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i6 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j6) {
        int iE;
        WorkDatabase workDatabase = kVar.f1208j;
        C0803c c0803cK = workDatabase.k();
        R0.e eVarD = c0803cK.D(str);
        if (eVarD != null) {
            a(eVarD.f2893b, context, str);
            int i6 = eVarD.f2893b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i6, b.b(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j6, service);
                return;
            }
            return;
        }
        S0.f fVar = new S0.f(0, workDatabase);
        synchronized (S0.f.class) {
            iE = fVar.E("next_alarm_manager_id");
        }
        c0803cK.H(new R0.e(iE, str));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iE, b.b(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j6, service2);
        }
    }
}
