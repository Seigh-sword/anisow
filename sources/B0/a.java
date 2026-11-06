package B0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SQLiteDatabase.CursorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0.e f60b;

    public /* synthetic */ a(A0.e eVar, int i6) {
        this.f59a = i6;
        this.f60b = eVar;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i6 = this.f59a;
        A0.e eVar = this.f60b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                eVar.g(new f(sQLiteQuery));
                break;
            default:
                eVar.g(new f(sQLiteQuery));
                break;
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
