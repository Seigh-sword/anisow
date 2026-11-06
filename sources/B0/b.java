package B0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.C0396c2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements A0.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f61x = new String[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SQLiteDatabase f62w;

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f62w = sQLiteDatabase;
    }

    public final void b() {
        this.f62w.beginTransaction();
    }

    public final void c() {
        this.f62w.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f62w.close();
    }

    public final void g(String str) {
        this.f62w.execSQL(str);
    }

    public final Cursor h(A0.e eVar) {
        return this.f62w.rawQueryWithFactory(new a(eVar, 0), eVar.k(), f61x, null);
    }

    public final Cursor k(String str) {
        return h(new C0396c2(str));
    }

    public final void l() {
        this.f62w.setTransactionSuccessful();
    }
}
