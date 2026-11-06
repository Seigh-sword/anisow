package B0;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import m.E;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f63a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f64b;

    public c(E e6, b[] bVarArr) {
        this.f63a = e6;
        this.f64b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b bVarB = d.b(this.f64b, sQLiteDatabase);
        this.f63a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVarB.f62w.getPath());
        SQLiteDatabase sQLiteDatabase2 = bVarB.f62w;
        if (sQLiteDatabase2.isOpen()) {
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = sQLiteDatabase2.getAttachedDbs();
                } catch (Throwable th) {
                    if (attachedDbs != null) {
                        Iterator<Pair<String, String>> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            E.b((String) it.next().second);
                        }
                    } else {
                        E.b(sQLiteDatabase2.getPath());
                    }
                    throw th;
                }
            } catch (SQLiteException unused) {
            }
            try {
                bVarB.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                Iterator<Pair<String, String>> it2 = attachedDbs.iterator();
                while (it2.hasNext()) {
                    E.b((String) it2.next().second);
                }
                return;
            }
        }
        E.b(sQLiteDatabase2.getPath());
    }
}
