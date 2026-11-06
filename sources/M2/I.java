package m2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* JADX INFO: loaded from: classes.dex */
public final class I extends X {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1056m f10642y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10643z;

    public I(C1051k0 c1051k0) {
        super(c1051k0);
        this.f10642y = new C1056m(this, a(), "google_app_measurement_local.db", 1);
    }

    public static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j6 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j6;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @Override // m2.X
    public final boolean A() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[PHI: r6 r9
      0x00f5: PHI (r6v3 int) = (r6v1 int), (r6v4 int) binds: [B:73:0x010e, B:66:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r9v7 android.database.sqlite.SQLiteDatabase) = (r9v6 android.database.sqlite.SQLiteDatabase), (r9v8 android.database.sqlite.SQLiteDatabase) binds: [B:73:0x010e, B:66:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(int r17, byte[] r18) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.I.C(int, byte[]):boolean");
    }

    public final void D() {
        int iDelete;
        r();
        try {
            SQLiteDatabase sQLiteDatabaseF = F();
            if (sQLiteDatabaseF == null || (iDelete = sQLiteDatabaseF.delete("messages", null, null)) <= 0) {
                return;
            }
            f().f10723J.c(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e6) {
            f().f10715B.c(e6, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[PHI: r4
      0x0075: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x006c, B:35:0x0073, B:38:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.r()
            boolean r1 = r11.f10643z
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            android.content.Context r1 = r11.a()
            java.lang.String r3 = "google_app_measurement_local.db"
            java.io.File r1 = r1.getDatabasePath(r3)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L1c
            return r2
        L1c:
            r1 = 5
            r4 = r1
            r3 = r2
        L1f:
            if (r3 >= r1) goto L90
            r5 = 1
            r6 = 0
            android.database.sqlite.SQLiteDatabase r6 = r11.F()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            if (r6 != 0) goto L37
            r11.f10643z = r5     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            if (r6 == 0) goto L30
            r6.close()
        L30:
            return r2
        L31:
            r0 = move-exception
            goto L8a
        L33:
            r7 = move-exception
            goto L54
        L35:
            r7 = move-exception
            goto L79
        L37:
            r6.beginTransaction()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            java.lang.String[] r9 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            r9[r2] = r10     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            r6.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            r6.endTransaction()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33 android.database.sqlite.SQLiteFullException -> L35 android.database.sqlite.SQLiteDatabaseLockedException -> L6d
            r6.close()
            return r5
        L54:
            if (r6 == 0) goto L5f
            boolean r8 = r6.inTransaction()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L5f
            r6.endTransaction()     // Catch: java.lang.Throwable -> L31
        L5f:
            m2.N r8 = r11.f()     // Catch: java.lang.Throwable -> L31
            m2.P r8 = r8.f10715B     // Catch: java.lang.Throwable -> L31
            r8.c(r7, r0)     // Catch: java.lang.Throwable -> L31
            r11.f10643z = r5     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L87
            goto L75
        L6d:
            long r7 = (long) r4     // Catch: java.lang.Throwable -> L31
            android.os.SystemClock.sleep(r7)     // Catch: java.lang.Throwable -> L31
            int r4 = r4 + 20
            if (r6 == 0) goto L87
        L75:
            r6.close()
            goto L87
        L79:
            m2.N r8 = r11.f()     // Catch: java.lang.Throwable -> L31
            m2.P r8 = r8.f10715B     // Catch: java.lang.Throwable -> L31
            r8.c(r7, r0)     // Catch: java.lang.Throwable -> L31
            r11.f10643z = r5     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L87
            goto L75
        L87:
            int r3 = r3 + 1
            goto L1f
        L8a:
            if (r6 == 0) goto L8f
            r6.close()
        L8f:
            throw r0
        L90:
            m2.N r0 = r11.f()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            m2.P r0 = r0.f10718E
            r0.d(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.I.E():boolean");
    }

    public final SQLiteDatabase F() {
        if (this.f10643z) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f10642y.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f10643z = true;
        return null;
    }
}
