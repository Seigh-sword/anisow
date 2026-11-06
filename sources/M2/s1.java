package m2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends t1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p1 f11093A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Integer f11094B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AlarmManager f11095z;

    public s1(x1 x1Var) {
        super(x1Var);
        this.f11095z = (AlarmManager) a().getSystemService("alarm");
    }

    public final AbstractC1059n A() {
        if (this.f11093A == null) {
            this.f11093A = new p1(this, this.f11112x.f11248H, 1);
        }
        return this.f11093A;
    }

    @Override // m2.t1
    public final boolean x() {
        AlarmManager alarmManager = this.f11095z;
        if (alarmManager != null) {
            Context contextA = a();
            alarmManager.cancel(PendingIntent.getBroadcast(contextA, 0, new Intent().setClassName(contextA, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.V.f6707a));
        }
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(z());
        }
        return false;
    }

    public final void y() {
        v();
        f().f10723J.d("Unscheduling upload");
        AlarmManager alarmManager = this.f11095z;
        if (alarmManager != null) {
            Context contextA = a();
            alarmManager.cancel(PendingIntent.getBroadcast(contextA, 0, new Intent().setClassName(contextA, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.V.f6707a));
        }
        A().a();
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(z());
        }
    }

    public final int z() {
        if (this.f11094B == null) {
            this.f11094B = Integer.valueOf(("measurement" + a().getPackageName()).hashCode());
        }
        return this.f11094B.intValue();
    }
}
