package J0;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import x0.AbstractC1484a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1484a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1192c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1193d;

    public h(Context context) {
        super(9, 10);
        this.f1193d = context;
    }

    @Override // x0.AbstractC1484a
    public final void a(B0.b bVar) {
        int i6 = this.f1192c;
        Context context = this.f1193d;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (this.f13664b >= 10) {
                    bVar.f62w.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                boolean zContains = sharedPreferences.contains("reschedule_needed");
                SQLiteDatabase sQLiteDatabase = bVar.f62w;
                if (zContains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j7 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.b();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j6)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j7)});
                        sharedPreferences.edit().clear().apply();
                        bVar.l();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i7 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i8 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.b();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i8)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.l();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context, int i6, int i7) {
        super(i6, i7);
        this.f1193d = context;
    }
}
