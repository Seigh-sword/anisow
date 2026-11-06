package B0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import m.E;

/* JADX INFO: loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b[] f65w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E f66x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f67y;

    public d(Context context, String str, b[] bVarArr, E e6) {
        super(context, str, null, e6.f10110a, new c(e6, bVarArr));
        this.f66x = e6;
        this.f65w = bVarArr;
    }

    public static b b(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || bVar.f62w != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase);
        }
        return bVarArr[0];
    }

    public final synchronized A0.a c() {
        this.f67y = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f67y) {
            return b(this.f65w, writableDatabase);
        }
        close();
        return c();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f65w[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        b(this.f65w, sQLiteDatabase);
        this.f66x.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            B0.b[] r0 = r5.f65w
            B0.b r6 = b(r0, r6)
            m.E r0 = r5.f66x
            r0.getClass()
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r1 = r6.k(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L20
            r3 = 0
            if (r2 == 0) goto L22
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L20:
            r6 = move-exception
            goto L75
        L22:
            r2 = r3
        L23:
            r1.close()
            T1.j r1 = r0.f10112c
            r1.getClass()
            T1.j.h(r6)
            if (r2 != 0) goto L4f
            w0.q r2 = T1.j.k(r6)
            boolean r4 = r2.f13542c
            if (r4 == 0) goto L39
            goto L4f
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.String r1 = r2.f13541b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4f:
            r0.f(r6)
            java.lang.Object r6 = r1.f3425x
            androidx.work.impl.WorkDatabase_Impl r6 = (androidx.work.impl.WorkDatabase_Impl) r6
            int r0 = androidx.work.impl.WorkDatabase_Impl.f5836s
            java.util.List r6 = r6.f13537g
            if (r6 == 0) goto L74
            int r6 = r6.size()
        L60:
            if (r3 >= r6) goto L74
            java.lang.Object r0 = r1.f3425x
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            java.util.List r0 = r0.f13537g
            java.lang.Object r0 = r0.get(r3)
            J0.f r0 = (J0.f) r0
            r0.getClass()
            int r3 = r3 + 1
            goto L60
        L74:
            return
        L75:
            r1.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.d.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        this.f67y = true;
        this.f66x.d(b(this.f65w, sQLiteDatabase), i6, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.d.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        this.f67y = true;
        this.f66x.d(b(this.f65w, sQLiteDatabase), i6, i7);
    }
}
