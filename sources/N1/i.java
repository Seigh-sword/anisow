package N1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2096w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f2097x;

    public /* synthetic */ i(int i6, long j6) {
        this.f2096w = i6;
        this.f2097x = j6;
    }

    @Override // N1.j
    public final Object apply(Object obj) {
        int i6 = this.f2096w;
        long j6 = this.f2097x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (K1.h) l.n(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new i(1, j6));
            default:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new K1.h(cursor.getLong(0), j6);
        }
    }
}
