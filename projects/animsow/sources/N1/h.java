package N1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f2095x;

    public /* synthetic */ h(l lVar, int i6) {
        this.f2094w = i6;
        this.f2095x = lVar;
    }

    @Override // N1.j
    public final Object apply(Object obj) {
        int i6 = this.f2094w;
        l lVar = this.f2095x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                lVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((P1.c) lVar.f2103x).a()).execute();
                break;
            case 1:
                Cursor cursor = (Cursor) obj;
                lVar.getClass();
                while (cursor.moveToNext()) {
                    lVar.g(new M1.i(cursor.getInt(0), cursor.getString(1), K1.d.MESSAGE_TOO_OLD));
                }
                break;
            default:
                Cursor cursor2 = (Cursor) obj;
                lVar.getClass();
                while (cursor2.moveToNext()) {
                    lVar.g(new M1.i(cursor2.getInt(0), cursor2.getString(1), K1.d.MAX_RETRIES_REACHED));
                }
                break;
        }
        return null;
    }
}
