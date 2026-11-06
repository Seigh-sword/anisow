package M1;

import N.C0095h;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N1.d f1765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1766c;

    public d(Context context, N1.d dVar, b bVar) {
        this.f1764a = context;
        this.f1765b = dVar;
        this.f1766c = bVar;
    }

    public final void a(H1.j jVar, int i6, boolean z5) {
        Context context = this.f1764a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(jVar.f934a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        E1.d dVar = jVar.f936c;
        adler32.update(byteBufferAllocate.putInt(Q1.a.a(dVar)).array());
        byte[] bArr = jVar.f935b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z5) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i7 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i7 >= i6) {
                        AbstractC1332d.z("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseB = ((N1.l) this.f1765b).b();
        String strValueOf = String.valueOf(Q1.a.a(dVar));
        String str = jVar.f934a;
        Long l5 = (Long) N1.l.n(sQLiteDatabaseB.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf}), new C0095h(12));
        long jLongValue = l5.longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        b bVar = this.f1766c;
        builder.setMinimumLatency(bVar.a(dVar, jLongValue, i6));
        Set set = ((c) bVar.f1760b.get(dVar)).f1763c;
        if (set.contains(e.f1767w)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(e.f1769y)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(e.f1768x)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i6);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", Q1.a.a(dVar));
        if (bArr != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, jLongValue, i6)), l5, Integer.valueOf(i6)};
        String strJ = AbstractC1332d.J("JobInfoScheduler");
        if (Log.isLoggable(strJ, 3)) {
            Log.d(strJ, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
