package N1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2088w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f2089x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2090y;

    public /* synthetic */ f(long j6, H1.j jVar) {
        this.f2089x = j6;
        this.f2090y = jVar;
    }

    @Override // N1.j
    public final Object apply(Object obj) {
        int i6 = this.f2088w;
        int i7 = 1;
        long j6 = this.f2089x;
        Object obj2 = this.f2090y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                l lVar = (l) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                lVar.getClass();
                String[] strArr = {String.valueOf(j6)};
                l.n(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new h(lVar, i7));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                H1.j jVar = (H1.j) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j6));
                String str = jVar.f934a;
                E1.d dVar = jVar.f936c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(Q1.a.a(dVar))}) < 1) {
                    contentValues.put("backend_name", jVar.f934a);
                    contentValues.put("priority", Integer.valueOf(Q1.a.a(dVar)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    public /* synthetic */ f(l lVar, long j6) {
        this.f2090y = lVar;
        this.f2089x = j6;
    }
}
