package M1;

import N.C0095h;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements O1.b, N1.j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f1783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1785y;

    public /* synthetic */ i(long j6, Object obj, Object obj2) {
        this.f1784x = obj;
        this.f1785y = obj2;
        this.f1783w = j6;
    }

    @Override // N1.j
    public final Object apply(Object obj) {
        String str = (String) this.f1784x;
        K1.d dVar = (K1.d) this.f1785y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        E1.c cVar = N1.l.f2100B;
        boolean zBooleanValue = ((Boolean) N1.l.n(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(dVar.f1525w)}), new C0095h(16))).booleanValue();
        long j6 = this.f1783w;
        int i6 = dVar.f1525w;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j6 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i6)});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i6));
            contentValues.put("events_dropped_count", Long.valueOf(j6));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // O1.b
    public final Object d() {
        j jVar = (j) this.f1784x;
        H1.j jVar2 = (H1.j) this.f1785y;
        long jA = ((P1.c) jVar.f1792g).a() + this.f1783w;
        N1.l lVar = (N1.l) jVar.f1788c;
        lVar.getClass();
        lVar.g(new N1.f(jA, jVar2));
        return null;
    }
}
