package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class C1 extends SQLiteOpenHelper implements B1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f7501w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f7502x = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static C1 f7503y;

    public static StringBuilder K() {
        AbstractC0603w1.f8056v.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (jCurrentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        AbstractC0603w1.f8057w.getClass();
        if (E1.b(E1.f7517a, "OS_RESTORE_TTL_FILTER", true)) {
            sb.append(" AND expire_time > " + jCurrentTimeMillis);
        }
        return sb;
    }

    public static void L(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e6) {
            e6.printStackTrace();
        }
    }

    public static void N(SQLiteDatabase sQLiteDatabase) {
        AbstractC1305a.o(sQLiteDatabase, "db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                sQLiteDatabase.execSQL("DROP TABLE outcome;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
            } catch (SQLiteException e6) {
                e6.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public static C1 c(Context context) {
        if (f7503y == null) {
            synchronized (f7501w) {
                try {
                    if (f7503y == null) {
                        f7503y = new C1(context.getApplicationContext(), "OneSignal.db", null, 8);
                    }
                } finally {
                }
            }
        }
        return f7503y;
    }

    public static void n(SQLiteDatabase sQLiteDatabase, int i6) {
        if (i6 < 2) {
            L(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
            L(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
        }
        if (i6 < 3) {
            L(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
            L(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
            L(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
        }
        if (i6 < 4) {
            L(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
        }
        if (i6 < 5) {
            L(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
            N(sQLiteDatabase);
        }
        if (i6 == 5) {
            N(sQLiteDatabase);
        }
        if (i6 < 7) {
            L(sQLiteDatabase, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
        }
        if (i6 < 8) {
            AbstractC1305a.o(sQLiteDatabase, "db");
            try {
                try {
                    sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                    sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                    sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                    sQLiteDatabase.execSQL("INSERT INTO outcome(_id,name,timestamp,notification_ids,weight,notification_influence_type) SELECT _id,name,timestamp,notification_ids,weight,session FROM outcome_aux;");
                    sQLiteDatabase.execSQL("DROP TABLE outcome_aux;");
                } catch (SQLiteException e6) {
                    e6.printStackTrace();
                }
                sQLiteDatabase.execSQL("COMMIT;");
                try {
                    try {
                        sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                        sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                        sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(_id,name,channel_influence_id) SELECT _id,name,notification_id FROM cached_unique_outcome_notification;");
                        sQLiteDatabase.execSQL("UPDATE cached_unique_outcome SET channel_type = 'notification';");
                        sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
                    } catch (SQLiteException e7) {
                        e7.printStackTrace();
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public final Cursor J(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        Cursor cursorQuery;
        synchronized (f7501w) {
            cursorQuery = h().query(str, strArr, str2, strArr2, null, null, str3, str4);
        }
        return cursorQuery;
    }

    public final int M(String str, ContentValues contentValues, String str2, String[] strArr) {
        String str3;
        String str4;
        int iUpdate = 0;
        if (contentValues.toString().isEmpty()) {
            return 0;
        }
        synchronized (f7501w) {
            SQLiteDatabase sQLiteDatabaseH = h();
            try {
                try {
                    sQLiteDatabaseH.beginTransaction();
                    iUpdate = sQLiteDatabaseH.update(str, contentValues, str2, strArr);
                    sQLiteDatabaseH.setTransactionSuccessful();
                } catch (SQLiteException e6) {
                    C0594t1.f("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e6);
                    if (sQLiteDatabaseH != null) {
                        try {
                            sQLiteDatabaseH.endTransaction();
                        } catch (SQLiteException e7) {
                            e = e7;
                            str3 = "Error closing transaction! ";
                            C0594t1.f(str3, e);
                        } catch (IllegalStateException e8) {
                            e = e8;
                            str3 = "Error closing transaction! ";
                            C0594t1.f(str3, e);
                        }
                    }
                } catch (IllegalStateException e9) {
                    C0594t1.f("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e9);
                    if (sQLiteDatabaseH != null) {
                        try {
                            sQLiteDatabaseH.endTransaction();
                        } catch (SQLiteException e10) {
                            e = e10;
                            str3 = "Error closing transaction! ";
                            C0594t1.f(str3, e);
                        } catch (IllegalStateException e11) {
                            e = e11;
                            str3 = "Error closing transaction! ";
                            C0594t1.f(str3, e);
                        }
                    }
                }
                try {
                    sQLiteDatabaseH.endTransaction();
                } catch (SQLiteException e12) {
                    e = e12;
                    str3 = "Error closing transaction! ";
                    C0594t1.f(str3, e);
                } catch (IllegalStateException e13) {
                    e = e13;
                    str3 = "Error closing transaction! ";
                    C0594t1.f(str3, e);
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseH != null) {
                    try {
                        sQLiteDatabaseH.endTransaction();
                    } catch (SQLiteException e14) {
                        e = e14;
                        str4 = "Error closing transaction! ";
                        C0594t1.f(str4, e);
                        throw th;
                    } catch (IllegalStateException e15) {
                        e = e15;
                        str4 = "Error closing transaction! ";
                        C0594t1.f(str4, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
        return iUpdate;
    }

    public final void b(String str, String str2, String[] strArr) {
        String str3;
        String str4;
        synchronized (f7501w) {
            SQLiteDatabase sQLiteDatabaseH = h();
            try {
                try {
                    try {
                        sQLiteDatabaseH.beginTransaction();
                        sQLiteDatabaseH.delete(str, str2, strArr);
                        sQLiteDatabaseH.setTransactionSuccessful();
                    } catch (IllegalStateException e6) {
                        C0594t1.f("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e6);
                        if (sQLiteDatabaseH != null) {
                            try {
                                sQLiteDatabaseH.endTransaction();
                            } catch (SQLiteException e7) {
                                e = e7;
                                str3 = "Error closing transaction! ";
                                C0594t1.f(str3, e);
                            } catch (IllegalStateException e8) {
                                e = e8;
                                str3 = "Error closing transaction! ";
                                C0594t1.f(str3, e);
                            }
                        }
                    }
                } catch (SQLiteException e9) {
                    C0594t1.f("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e9);
                    if (sQLiteDatabaseH != null) {
                        try {
                            sQLiteDatabaseH.endTransaction();
                        } catch (SQLiteException e10) {
                            e = e10;
                            str3 = "Error closing transaction! ";
                            C0594t1.f(str3, e);
                        } catch (IllegalStateException e11) {
                            e = e11;
                            str3 = "Error closing transaction! ";
                            C0594t1.f(str3, e);
                        }
                    }
                }
                try {
                    sQLiteDatabaseH.endTransaction();
                } catch (SQLiteException e12) {
                    e = e12;
                    str3 = "Error closing transaction! ";
                    C0594t1.f(str3, e);
                } catch (IllegalStateException e13) {
                    e = e13;
                    str3 = "Error closing transaction! ";
                    C0594t1.f(str3, e);
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseH != null) {
                    try {
                        sQLiteDatabaseH.endTransaction();
                    } catch (SQLiteException e14) {
                        e = e14;
                        str4 = "Error closing transaction! ";
                        C0594t1.f(str4, e);
                        throw th;
                    } catch (IllegalStateException e15) {
                        e = e15;
                        str4 = "Error closing transaction! ";
                        C0594t1.f(str4, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public final SQLiteDatabase g() {
        SQLiteDatabase writableDatabase;
        synchronized (f7501w) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } finally {
                }
            } catch (SQLiteCantOpenDatabaseException e6) {
                throw e6;
            } catch (SQLiteDatabaseLockedException e7) {
                throw e7;
            }
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018 A[Catch: all -> 0x000b, LOOP:0: B:21:0x0005->B:17:0x0018, LOOP_END, TryCatch #2 {all -> 0x000b, blocks: (B:5:0x0005, B:6:0x0009, B:15:0x0013, B:17:0x0018, B:18:0x001f), top: B:21:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.sqlite.SQLiteDatabase h() {
        /*
            r5 = this;
            java.lang.Object r0 = com.onesignal.C1.f7501w
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L5:
            android.database.sqlite.SQLiteDatabase r1 = r5.g()     // Catch: java.lang.Throwable -> Lb android.database.sqlite.SQLiteDatabaseLockedException -> Ld android.database.sqlite.SQLiteCantOpenDatabaseException -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L20
        Ld:
            r3 = move-exception
            goto L10
        Lf:
            r3 = move-exception
        L10:
            if (r1 != 0) goto L13
            r1 = r3
        L13:
            int r2 = r2 + 1
            r3 = 5
            if (r2 >= r3) goto L1f
            int r3 = r2 * 400
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lb
            android.os.SystemClock.sleep(r3)     // Catch: java.lang.Throwable -> Lb
            goto L5
        L1f:
            throw r1     // Catch: java.lang.Throwable -> Lb
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C1.h():android.database.sqlite.SQLiteDatabase");
    }

    public final void k(String str, ContentValues contentValues) {
        String str2;
        String str3;
        synchronized (f7501w) {
            SQLiteDatabase sQLiteDatabaseH = h();
            try {
                try {
                    sQLiteDatabaseH.beginTransaction();
                    sQLiteDatabaseH.insert(str, null, contentValues);
                    sQLiteDatabaseH.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseH.endTransaction();
                    } catch (SQLiteException e6) {
                        e = e6;
                        str2 = "Error closing transaction! ";
                        C0594t1.f(str2, e);
                    } catch (IllegalStateException e7) {
                        e = e7;
                        str2 = "Error closing transaction! ";
                        C0594t1.f(str2, e);
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabaseH != null) {
                        try {
                            sQLiteDatabaseH.endTransaction();
                        } catch (SQLiteException e8) {
                            e = e8;
                            str3 = "Error closing transaction! ";
                            C0594t1.f(str3, e);
                            throw th;
                        } catch (IllegalStateException e9) {
                            e = e9;
                            str3 = "Error closing transaction! ";
                            C0594t1.f(str3, e);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (SQLiteException e10) {
                C0594t1.f("Error inserting on table: " + str + " with nullColumnHack: null and values: " + contentValues, e10);
                if (sQLiteDatabaseH != null) {
                    try {
                        sQLiteDatabaseH.endTransaction();
                    } catch (SQLiteException e11) {
                        e = e11;
                        str2 = "Error closing transaction! ";
                        C0594t1.f(str2, e);
                    } catch (IllegalStateException e12) {
                        e = e12;
                        str2 = "Error closing transaction! ";
                        C0594t1.f(str2, e);
                    }
                }
            } catch (IllegalStateException e13) {
                C0594t1.f("Error under inserting transaction under table: " + str + " with nullColumnHack: null and values: " + contentValues, e13);
                if (sQLiteDatabaseH != null) {
                    try {
                        sQLiteDatabaseH.endTransaction();
                    } catch (SQLiteException e14) {
                        e = e14;
                        str2 = "Error closing transaction! ";
                        C0594t1.f(str2, e);
                    } catch (IllegalStateException e15) {
                        e = e15;
                        str2 = "Error closing transaction! ";
                        C0594t1.f(str2, e);
                    }
                }
            }
        }
    }

    public final void l(ContentValues contentValues) {
        String str;
        String str2;
        synchronized (f7501w) {
            SQLiteDatabase sQLiteDatabaseH = h();
            try {
                try {
                    try {
                        sQLiteDatabaseH.beginTransaction();
                        sQLiteDatabaseH.insertOrThrow("notification", null, contentValues);
                        sQLiteDatabaseH.setTransactionSuccessful();
                    } catch (IllegalStateException e6) {
                        C0594t1.f("Error under inserting or throw transaction under table: notification with nullColumnHack: null and values: " + contentValues, e6);
                        if (sQLiteDatabaseH != null) {
                            try {
                                sQLiteDatabaseH.endTransaction();
                            } catch (SQLiteException e7) {
                                e = e7;
                                str = "Error closing transaction! ";
                                C0594t1.f(str, e);
                            } catch (IllegalStateException e8) {
                                e = e8;
                                str = "Error closing transaction! ";
                                C0594t1.f(str, e);
                            }
                        }
                    }
                } catch (SQLiteException e9) {
                    C0594t1.f("Error inserting or throw on table: notification with nullColumnHack: null and values: " + contentValues, e9);
                    if (sQLiteDatabaseH != null) {
                        try {
                            sQLiteDatabaseH.endTransaction();
                        } catch (SQLiteException e10) {
                            e = e10;
                            str = "Error closing transaction! ";
                            C0594t1.f(str, e);
                        } catch (IllegalStateException e11) {
                            e = e11;
                            str = "Error closing transaction! ";
                            C0594t1.f(str, e);
                        }
                    }
                }
                try {
                    sQLiteDatabaseH.endTransaction();
                } catch (SQLiteException e12) {
                    e = e12;
                    str = "Error closing transaction! ";
                    C0594t1.f(str, e);
                } catch (IllegalStateException e13) {
                    e = e13;
                    str = "Error closing transaction! ";
                    C0594t1.f(str, e);
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseH != null) {
                    try {
                        sQLiteDatabaseH.endTransaction();
                    } catch (SQLiteException e14) {
                        e = e14;
                        str2 = "Error closing transaction! ";
                        C0594t1.f(str2, e);
                        throw th;
                    } catch (IllegalStateException e15) {
                        e = e15;
                        str2 = "Error closing transaction! ";
                        C0594t1.f(str2, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f7501w) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
                String[] strArr = f7502x;
                for (int i6 = 0; i6 < 6; i6++) {
                    sQLiteDatabase.execSQL(strArr[i6]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        AbstractC0603w1.b(EnumC0600v1.f7998z, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null);
        synchronized (f7501w) {
            try {
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
                try {
                    ArrayList<String> arrayList = new ArrayList(cursorRawQuery.getCount());
                    while (cursorRawQuery.moveToNext()) {
                        arrayList.add(cursorRawQuery.getString(0));
                    }
                    for (String str : arrayList) {
                        if (!str.startsWith("sqlite_")) {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                        }
                    }
                    cursorRawQuery.close();
                    onCreate(sQLiteDatabase);
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        AbstractC0603w1.b(EnumC0600v1.f7992B, H1.a.k("OneSignal Database onUpgrade from: ", i6, " to: ", i7), null);
        synchronized (f7501w) {
            try {
                n(sQLiteDatabase, i6);
            } catch (SQLiteException e6) {
                AbstractC0603w1.b(EnumC0600v1.f7997y, "Error in upgrade, migration may have already run! Skipping!", e6);
            }
        }
    }

    public final Cursor u(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        Cursor cursorQuery;
        synchronized (f7501w) {
            cursorQuery = h().query(str, strArr, str2, strArr2, null, null, str3);
        }
        return cursorQuery;
    }
}
