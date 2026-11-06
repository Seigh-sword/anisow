package S0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f3069w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final J0.k f3070x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3071y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f3068z = I0.o.y("ForceStopRunnable");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final long f3067A = TimeUnit.DAYS.toMillis(3650);

    public e(Context context, J0.k kVar) {
        this.f3069w = context.getApplicationContext();
        this.f3070x = kVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i6 = J.b.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3067A;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.e.a():void");
    }

    public final boolean b() {
        I0.b bVar = this.f3070x.f1207i;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f3068z;
        if (zIsEmpty) {
            I0.o.w().u(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = h.a(this.f3069w, bVar);
        I0.o.w().u(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f3068z;
        J0.k kVar = this.f3070x;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                J0.j.a(this.f3069w);
                I0.o.w().u(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e6) {
                    int i6 = this.f3071y + 1;
                    this.f3071y = i6;
                    if (i6 >= 3) {
                        I0.o.w().v(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                        kVar.f1207i.getClass();
                        throw illegalStateException;
                    }
                    I0.o.w().u(str, "Retrying after " + (((long) i6) * 300), e6);
                    try {
                        Thread.sleep(((long) this.f3071y) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            kVar.L();
        }
    }
}
