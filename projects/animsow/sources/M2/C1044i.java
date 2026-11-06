package m2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import b2.C0337b;
import com.google.android.gms.internal.measurement.C0484r1;
import com.google.android.gms.internal.measurement.C0508v1;
import com.google.android.gms.internal.measurement.C0520x1;
import com.google.android.gms.internal.measurement.C0526y1;
import com.google.android.gms.internal.measurement.C0532z1;
import com.google.android.gms.internal.measurement.Q4;
import com.google.android.gms.internal.measurement.R2;
import d.AbstractC0628i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.AbstractC1332d;
import v0.C1401j;

/* JADX INFO: renamed from: m2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1044i extends t1 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f10939B = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f10940C = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f10941D = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f10942E = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f10943F = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String[] f10944G = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String[] f10945H = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String[] f10946I = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String[] f10947J = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String[] f10948K = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1401j f10949A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1056m f10950z;

    public C1044i(x1 x1Var) {
        super(x1Var);
        this.f10949A = new C1401j(h());
        this.f10950z = new C1056m(this, a(), "google_app_measurement.db", 0);
    }

    public static void N(ContentValues contentValues, Object obj) {
        AbstractC1332d.g("value");
        AbstractC1332d.m(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.z()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3a
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            m2.N r3 = r6.f()     // Catch: java.lang.Throwable -> L1a
            m2.P r3 = r3.f10715B     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r2, r4)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.A():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "events_snapshot"
            r12.v0(r0, r13)
            java.lang.String r1 = "name"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.z()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            java.lang.String r4 = "events"
            r11 = 0
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            java.lang.Object[] r1 = r1.toArray(r5)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            r5 = r1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            r10 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            if (r1 != 0) goto L33
            r2.close()
            return
        L33:
            java.lang.String r1 = r2.getString(r11)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            if (r1 == 0) goto L49
            java.lang.String r3 = "events"
            m2.s r1 = r12.p0(r3, r13, r1)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            if (r1 == 0) goto L49
            r12.U(r0, r1)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            goto L49
        L45:
            r13 = move-exception
            goto L68
        L47:
            r0 = move-exception
            goto L53
        L49:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L47
            if (r1 != 0) goto L33
            r2.close()
            return
        L53:
            m2.N r1 = r12.f()     // Catch: java.lang.Throwable -> L45
            m2.P r1 = r1.f10715B     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "Error creating snapshot. appId"
            m2.O r13 = m2.N.x(r13)     // Catch: java.lang.Throwable -> L45
            r1.b(r13, r0, r3)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L67
            r2.close()
        L67:
            return
        L68:
            if (r2 == 0) goto L6d
            r2.close()
        L6d:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.A0(java.lang.String):void");
    }

    public final long B(com.google.android.gms.internal.measurement.A1 a12) {
        r();
        v();
        AbstractC1332d.g(a12.e2());
        byte[] bArrC = a12.c();
        long jZ = s().z(bArrC);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a12.e2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jZ));
        contentValues.put("metadata", bArrC);
        try {
            z().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jZ;
        } catch (SQLiteException e6) {
            N nF = f();
            nF.f10715B.b(N.x(a12.e2()), e6, "Error storing raw event metadata. appId");
            throw e6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.B0(java.lang.String):void");
    }

    public final long C(String str) {
        AbstractC1332d.g(str);
        r();
        v();
        try {
            return z().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, n().x(str, AbstractC1078w.f11214q))))});
        } catch (SQLiteException e6) {
            f().f10715B.b(N.x(str), e6, "Error deleting over the limit events. appId");
            return 0L;
        }
    }

    public final boolean C0(String str) {
        Q4.a();
        return n().D(null, AbstractC1078w.f11122A0) && h0(AbstractC0628i.q("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", f0()), new String[]{str}) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long D(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.z()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L1c
            r4 = 0
            long r3 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r3
        L18:
            r3 = move-exception
            goto L2c
        L1a:
            r4 = move-exception
            goto L20
        L1c:
            r1.close()
            return r5
        L20:
            m2.N r5 = r2.f()     // Catch: java.lang.Throwable -> L18
            m2.P r5 = r5.f10715B     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Database error"
            r5.b(r3, r4, r6)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L2c:
            if (r1 == 0) goto L31
            r1.close()
        L31:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.D(java.lang.String, java.lang.String[], long):long");
    }

    public final void D0() {
        v();
        z().endTransaction();
    }

    public final Object E(Cursor cursor, int i6) {
        int type = cursor.getType(i6);
        if (type == 0) {
            f().f10715B.d("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i6));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i6));
        }
        if (type == 3) {
            return cursor.getString(i6);
        }
        if (type == 4) {
            f().f10715B.d("Loaded invalid blob type value, ignoring it");
            return null;
        }
        N nF = f();
        nF.f10715B.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    public final void E0() {
        r();
        v();
        if (e0()) {
            x1 x1Var = this.f11112x;
            long jA = x1Var.f11245E.f10964A.a();
            ((C0337b) h()).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) AbstractC1078w.f11232z.a(null)).longValue()) {
                x1Var.f11245E.f10964A.b(jElapsedRealtime);
                r();
                v();
                if (e0()) {
                    SQLiteDatabase sQLiteDatabaseZ = z();
                    ((C0337b) h()).getClass();
                    int iDelete = sQLiteDatabaseZ.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) AbstractC1078w.f11129E.a(null)).longValue())});
                    if (iDelete > 0) {
                        N nF = f();
                        nF.f10723J.c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String F(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r4.r()
            r4.v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.z()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L3f
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r1 != 0) goto L35
            m2.N r6 = r4.f()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            m2.P r6 = r6.f10723J     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.d(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r5.close()
            return r0
        L30:
            r6 = move-exception
            r0 = r5
            goto L52
        L33:
            r6 = move-exception
            goto L41
        L35:
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r5.close()
            return r6
        L3d:
            r6 = move-exception
            goto L52
        L3f:
            r6 = move-exception
            r5 = r0
        L41:
            m2.N r1 = r4.f()     // Catch: java.lang.Throwable -> L30
            m2.P r1 = r1.f10715B     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting expired configs"
            r1.c(r6, r2)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L51
            r5.close()
        L51:
            return r0
        L52:
            if (r0 == 0) goto L57
            r0.close()
        L57:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.F(long):java.lang.String");
    }

    public final void F0() {
        v();
        z().setTransactionSuccessful();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String G(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.z()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r5 == 0) goto L1c
            r5 = 0
            java.lang.String r4 = r1.getString(r5)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r4
        L18:
            r4 = move-exception
            goto L2e
        L1a:
            r5 = move-exception
            goto L22
        L1c:
            r1.close()
            java.lang.String r4 = ""
            return r4
        L22:
            m2.N r0 = r3.f()     // Catch: java.lang.Throwable -> L18
            m2.P r0 = r0.f10715B     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "Database error"
            r0.b(r4, r5, r2)     // Catch: java.lang.Throwable -> L18
            throw r5     // Catch: java.lang.Throwable -> L18
        L2e:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.G(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public final List H(String str, int i6, int i7) {
        P p5;
        String str2;
        O oX;
        byte[] bArrD0;
        long jY;
        long jY2;
        r();
        v();
        int i8 = 1;
        AbstractC1332d.c(i6 > 0);
        AbstractC1332d.c(i7 > 0);
        AbstractC1332d.g(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = z().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i6));
                if (!cursorQuery.moveToFirst()) {
                    List listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j6 = cursorQuery.getLong(0);
                    try {
                        bArrD0 = s().d0(cursorQuery.getBlob(i8));
                    } catch (IOException e6) {
                        e = e6;
                        p5 = f().f10715B;
                        str2 = "Failed to unzip queued bundle. appId";
                        oX = N.x(str);
                    }
                    if (!arrayList.isEmpty() && bArrD0.length + length > i7) {
                        break;
                    }
                    try {
                        C0532z1 c0532z1 = (C0532z1) H1.F(com.google.android.gms.internal.measurement.A1.c2(), bArrD0);
                        if (!arrayList.isEmpty()) {
                            com.google.android.gms.internal.measurement.A1 a12 = (com.google.android.gms.internal.measurement.A1) ((Pair) arrayList.get(0)).first;
                            com.google.android.gms.internal.measurement.A1 a13 = (com.google.android.gms.internal.measurement.A1) c0532z1.e();
                            if (!a12.H().equals(a13.H()) || !a12.G().equals(a13.G()) || a12.X() != a13.X() || !a12.I().equals(a13.I())) {
                                break;
                            }
                            Iterator it = a12.V().iterator();
                            while (true) {
                                jY = -1;
                                if (!it.hasNext()) {
                                    jY2 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.H1 h12 = (com.google.android.gms.internal.measurement.H1) it.next();
                                if ("_npa".equals(h12.C())) {
                                    jY2 = h12.y();
                                    break;
                                }
                            }
                            Iterator it2 = a13.V().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                com.google.android.gms.internal.measurement.H1 h13 = (com.google.android.gms.internal.measurement.H1) it2.next();
                                if ("_npa".equals(h13.C())) {
                                    jY = h13.y();
                                    break;
                                }
                            }
                            if (jY2 != jY) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            int i9 = cursorQuery.getInt(2);
                            c0532z1.i();
                            com.google.android.gms.internal.measurement.A1.q1((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x, i9);
                        }
                        length += bArrD0.length;
                        arrayList.add(Pair.create((com.google.android.gms.internal.measurement.A1) c0532z1.e(), Long.valueOf(j6)));
                    } catch (IOException e7) {
                        e = e7;
                        p5 = f().f10715B;
                        str2 = "Failed to merge queued bundle. appId";
                        oX = N.x(str);
                        p5.b(oX, e, str2);
                    }
                    if (!cursorQuery.moveToNext() || length > i7) {
                        break;
                    }
                    i8 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e8) {
                f().f10715B.b(N.x(str), e8, "Error querying bundles. appId");
                List listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List I(String str, String str2, String str3) {
        AbstractC1332d.g(str);
        r();
        v();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return J(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        f().f10715B.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List J(java.lang.String r41, java.lang.String[] r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.J(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final C1050k K(long j6, String str, long j7, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) throws Throwable {
        C1050k c1050k;
        SQLiteDatabase sQLiteDatabaseZ;
        Cursor cursorQuery;
        AbstractC1332d.g(str);
        r();
        v();
        String[] strArr = {str};
        C1050k c1050k2 = new C1050k();
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseZ = z();
                c1050k = c1050k2;
                try {
                    cursorQuery = sQLiteDatabaseZ.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                } catch (SQLiteException e6) {
                    e = e6;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            c1050k = c1050k2;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                f().f10718E.c(N.x(str), "Not updating daily counts, app is not known. appId");
                cursorQuery.close();
                return c1050k;
            }
            if (cursorQuery.getLong(0) == j6) {
                c1050k.f10972b = cursorQuery.getLong(1);
                c1050k.f10971a = cursorQuery.getLong(2);
                c1050k.f10973c = cursorQuery.getLong(3);
                c1050k.f10974d = cursorQuery.getLong(4);
                c1050k.f10975e = cursorQuery.getLong(5);
                c1050k.f10976f = cursorQuery.getLong(6);
                c1050k.f10977g = cursorQuery.getLong(7);
            }
            if (z5) {
                c1050k.f10972b += j7;
            }
            if (z6) {
                c1050k.f10971a += j7;
            }
            if (z7) {
                c1050k.f10973c += j7;
            }
            if (z8) {
                c1050k.f10974d += j7;
            }
            if (z9) {
                c1050k.f10975e += j7;
            }
            if (z10) {
                c1050k.f10976f += j7;
            }
            if (z11) {
                c1050k.f10977g += j7;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j6));
            contentValues.put("daily_public_events_count", Long.valueOf(c1050k.f10971a));
            contentValues.put("daily_events_count", Long.valueOf(c1050k.f10972b));
            contentValues.put("daily_conversions_count", Long.valueOf(c1050k.f10973c));
            contentValues.put("daily_error_events_count", Long.valueOf(c1050k.f10974d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(c1050k.f10975e));
            contentValues.put("daily_realtime_dcu_count", Long.valueOf(c1050k.f10976f));
            contentValues.put("daily_registered_triggers_count", Long.valueOf(c1050k.f10977g));
            sQLiteDatabaseZ.update("apps", contentValues, "app_id=?", strArr);
            cursorQuery.close();
            return c1050k;
        } catch (SQLiteException e8) {
            e = e8;
            cursor = cursorQuery;
            f().f10715B.b(N.x(str), e, "Error updating daily counts. appId");
            if (cursor != null) {
                cursor.close();
            }
            return c1050k;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C1050k L(long j6, String str, boolean z5, boolean z6, boolean z7, boolean z8) {
        return K(j6, str, 1L, false, false, z5, false, z6, z7, z8);
    }

    public final void M(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseZ = z();
            if (contentValues.getAsString("app_id") == null) {
                f().f10717D.c(N.x("app_id"), "Value of the primary key is not set.");
            } else if (sQLiteDatabaseZ.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && sQLiteDatabaseZ.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                f().f10715B.b(N.x("consent_settings"), N.x("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e6) {
            f().f10715B.e("Error storing into table. key", N.x("consent_settings"), N.x("app_id"), e6);
        }
    }

    public final void O(com.google.android.gms.internal.measurement.A1 a12, boolean z5) {
        O oX;
        P p5;
        String str;
        r();
        v();
        AbstractC1332d.g(a12.e2());
        AbstractC1332d.p(a12.u0());
        E0();
        ((C0337b) h()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jK1 = a12.K1();
        E e6 = AbstractC1078w.f11129E;
        if (jK1 < jCurrentTimeMillis - ((Long) e6.a(null)).longValue() || a12.K1() > ((Long) e6.a(null)).longValue() + jCurrentTimeMillis) {
            N nF = f();
            nF.f10718E.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", N.x(a12.e2()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(a12.K1()));
        }
        try {
            byte[] bArrB0 = s().b0(a12.c());
            N nF2 = f();
            nF2.f10723J.c(Integer.valueOf(bArrB0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", a12.e2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(a12.K1()));
            contentValues.put("data", bArrB0);
            contentValues.put("has_realtime", Integer.valueOf(z5 ? 1 : 0));
            if (a12.B0()) {
                contentValues.put("retry_count", Integer.valueOf(a12.j1()));
            }
            try {
                if (z().insert("queue", null, contentValues) == -1) {
                    f().f10715B.c(N.x(a12.e2()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e7) {
                e = e7;
                N nF3 = f();
                oX = N.x(a12.e2());
                p5 = nF3.f10715B;
                str = "Error storing bundle. appId";
                p5.b(oX, e, str);
            }
        } catch (IOException e8) {
            e = e8;
            N nF4 = f();
            oX = N.x(a12.e2());
            p5 = nF4.f10715B;
            str = "Data loss. Failed to serialize bundle. appId";
        }
    }

    public final void P(Long l5) {
        r();
        v();
        Q4.a();
        if (n().D(null, AbstractC1078w.f11122A0) && e0()) {
            if (h0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l5 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                f().f10718E.d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                z().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l5 + " AND retry_count < 2147483647");
            } catch (SQLiteException e6) {
                f().f10715B.c(e6, "Error incrementing retry count. error");
            }
        }
    }

    public final void Q(String str, Bundle bundle) {
        C1044i c1044i = this;
        r();
        v();
        C1053l c1053l = new C1053l(c1044i, str);
        List<C1047j> listA = c1053l.a();
        while (!listA.isEmpty()) {
            for (C1047j c1047j : listA) {
                H1 h1S = s();
                C0484r1 c0484r1 = c1047j.f10961d;
                Bundle bundle2 = new Bundle();
                for (C0508v1 c0508v1 : c0484r1.E()) {
                    if (c0508v1.H()) {
                        bundle2.putDouble(c0508v1.E(), c0508v1.p());
                    } else if (c0508v1.I()) {
                        bundle2.putFloat(c0508v1.E(), c0508v1.w());
                    } else if (c0508v1.J()) {
                        bundle2.putLong(c0508v1.E(), c0508v1.B());
                    } else if (c0508v1.L()) {
                        bundle2.putString(c0508v1.E(), c0508v1.F());
                    } else if (c0508v1.G().isEmpty()) {
                        h1S.f().f10715B.c(c0508v1, "Unexpected parameter type for parameter");
                    } else {
                        bundle2.putParcelableArray(c0508v1.E(), H1.c0((R2) c0508v1.G()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String str2 = string == null ? "" : string;
                q().J(bundle2, bundle);
                C1051k0 c1051k0 = (C1051k0) c1044i.f1668w;
                C0484r1 c0484r12 = c1047j.f10961d;
                C1072t c1072t = new C1072t(c1051k0, str2, str, c0484r12.D(), c0484r12.B(), c0484r12.A(), bundle2);
                long j6 = c1047j.f10958a;
                r();
                v();
                String str3 = c1072t.f11096a;
                AbstractC1332d.g(str3);
                byte[] bArrC = s().D(c1072t).c();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", c1072t.f11097b);
                contentValues.put("timestamp", Long.valueOf(c1072t.f11099d));
                contentValues.put("metadata_fingerprint", Long.valueOf(c1047j.f10959b));
                contentValues.put("data", bArrC);
                contentValues.put("realtime", Integer.valueOf(c1047j.f10960c ? 1 : 0));
                try {
                    long jUpdate = z().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j6)});
                    if (jUpdate != 1) {
                        f().f10715B.b(N.x(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                    }
                } catch (SQLiteException e6) {
                    f().f10715B.b(N.x(str3), e6, "Error updating raw event. appId");
                }
                c1044i = this;
            }
            listA = c1053l.a();
            c1044i = this;
        }
    }

    public final void R(String str, C0526y1 c0526y1, String str2, Map map, int i6) {
        int iDelete;
        r();
        v();
        AbstractC1332d.m(c0526y1);
        AbstractC1332d.g(str);
        Q4.a();
        if (n().D(null, AbstractC1078w.f11122A0)) {
            r();
            v();
            if (e0()) {
                x1 x1Var = this.f11112x;
                long jA = x1Var.f11245E.f10965B.a();
                ((C0337b) h()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (Math.abs(jElapsedRealtime - jA) > ((Long) AbstractC1078w.f11232z.a(null)).longValue()) {
                    x1Var.f11245E.f10965B.b(jElapsedRealtime);
                    r();
                    v();
                    if (e0() && (iDelete = z().delete("upload_queue", f0(), new String[0])) > 0) {
                        f().f10723J.c(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            byte[] bArrC = c0526y1.c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", bArrC);
            contentValues.put("upload_uri", str2);
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            if (size > 0) {
                sb.append((CharSequence) arrayList.get(0));
                int i7 = 1;
                while (i7 < size) {
                    sb.append((CharSequence) "\r\n");
                    Object obj = arrayList.get(i7);
                    i7++;
                    sb.append((CharSequence) obj);
                }
            }
            contentValues.put("upload_headers", sb.toString());
            contentValues.put("upload_type", Integer.valueOf(u.h.b(i6)));
            ((C0337b) h()).getClass();
            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            try {
                if (z().insert("upload_queue", null, contentValues) == -1) {
                    f().f10715B.c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
                }
            } catch (SQLiteException e6) {
                f().f10715B.b(str, e6, "Error storing MeasurementBatch to upload_queue. appId");
            }
        }
    }

    public final void S(String str, Long l5, long j6, C0484r1 c0484r1) {
        r();
        v();
        AbstractC1332d.m(c0484r1);
        AbstractC1332d.g(str);
        byte[] bArrC = c0484r1.c();
        N nF = f();
        nF.f10723J.b(o().b(str), Integer.valueOf(bArrC.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l5);
        contentValues.put("children_to_process", Long.valueOf(j6));
        contentValues.put("main_event", bArrC);
        try {
            if (z().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                f().f10715B.c(N.x(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e6) {
            N nF2 = f();
            nF2.f10715B.b(N.x(str), e6, "Error storing complex main event. appId");
        }
    }

    public final void T(String str, String str2) {
        AbstractC1332d.g(str);
        AbstractC1332d.g(str2);
        r();
        v();
        try {
            z().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e6) {
            N nF = f();
            nF.f10715B.e("Error deleting conditional property", N.x(str), o().g(str2), e6);
        }
    }

    public final void U(String str, C1070s c1070s) {
        AbstractC1332d.m(c1070s);
        r();
        v();
        ContentValues contentValues = new ContentValues();
        String str2 = c1070s.f11076a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c1070s.f11077b);
        contentValues.put("lifetime_count", Long.valueOf(c1070s.f11078c));
        contentValues.put("current_bundle_count", Long.valueOf(c1070s.f11079d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c1070s.f11081f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c1070s.f11082g));
        contentValues.put("last_bundled_day", c1070s.f11083h);
        contentValues.put("last_sampled_complex_event_id", c1070s.f11084i);
        contentValues.put("last_sampling_rate", c1070s.f11085j);
        contentValues.put("current_session_count", Long.valueOf(c1070s.f11080e));
        Boolean bool = c1070s.f11086k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (z().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                f().f10715B.c(N.x(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e6) {
            f().f10715B.b(N.x(str2), e6, "Error storing event aggregates. appId");
        }
    }

    public final void V(String str, C1085z0 c1085z0) {
        AbstractC1332d.m(str);
        r();
        v();
        l0(str, u0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c1085z0.m());
        M(contentValues);
    }

    public final void W(String str, r1 r1Var) {
        r();
        v();
        AbstractC1332d.g(str);
        ((C0337b) h()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        E e6 = AbstractC1078w.f11193h0;
        long jLongValue = jCurrentTimeMillis - ((Long) e6.a(null)).longValue();
        long j6 = r1Var.f11074x;
        if (j6 < jLongValue || j6 > ((Long) e6.a(null)).longValue() + jCurrentTimeMillis) {
            N nF = f();
            nF.f10718E.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", N.x(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j6));
        }
        f().f10723J.d("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", r1Var.f11073w);
        contentValues.put("source", Integer.valueOf(r1Var.f11075y));
        contentValues.put("timestamp_millis", Long.valueOf(j6));
        try {
            if (z().insert("trigger_uris", null, contentValues) == -1) {
                f().f10715B.c(N.x(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e7) {
            N nF2 = f();
            nF2.f10715B.b(N.x(str), e7, "Error storing trigger URI. appId");
        }
    }

    public final void X(List list) {
        r();
        v();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (e0()) {
            String strJ = AbstractC0628i.j("(", TextUtils.join(",", list), ")");
            if (h0("SELECT COUNT(1) FROM queue WHERE rowid IN " + strJ + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                f().f10718E.d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                z().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strJ + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e6) {
                f().f10715B.c(e6, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(m2.F r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.Y(m2.F, boolean):void");
    }

    public final boolean Z(String str, int i6, com.google.android.gms.internal.measurement.E0 e02) {
        v();
        r();
        AbstractC1332d.g(str);
        AbstractC1332d.m(e02);
        if (e02.w().isEmpty()) {
            f().f10718E.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", N.x(str), Integer.valueOf(i6), String.valueOf(e02.C() ? Integer.valueOf(e02.t()) : null));
            return false;
        }
        byte[] bArrC = e02.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i6));
        contentValues.put("filter_id", e02.C() ? Integer.valueOf(e02.t()) : null);
        contentValues.put("event_name", e02.w());
        contentValues.put("session_scoped", e02.D() ? Boolean.valueOf(e02.A()) : null);
        contentValues.put("data", bArrC);
        try {
            if (z().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            f().f10715B.c(N.x(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e6) {
            f().f10715B.b(N.x(str), e6, "Error storing event filter. appId");
            return false;
        }
    }

    public final boolean a0(String str, int i6, com.google.android.gms.internal.measurement.L0 l02) {
        v();
        r();
        AbstractC1332d.g(str);
        AbstractC1332d.m(l02);
        if (l02.t().isEmpty()) {
            f().f10718E.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", N.x(str), Integer.valueOf(i6), String.valueOf(l02.x() ? Integer.valueOf(l02.p()) : null));
            return false;
        }
        byte[] bArrC = l02.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i6));
        contentValues.put("filter_id", l02.x() ? Integer.valueOf(l02.p()) : null);
        contentValues.put("property_name", l02.t());
        contentValues.put("session_scoped", l02.y() ? Boolean.valueOf(l02.w()) : null);
        contentValues.put("data", bArrC);
        try {
            if (z().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            f().f10715B.c(N.x(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e6) {
            f().f10715B.b(N.x(str), e6, "Error storing property filter. appId");
            return false;
        }
    }

    public final boolean b0(C1029d c1029d) {
        r();
        v();
        String str = c1029d.f10871w;
        AbstractC1332d.m(str);
        if (r0(str, c1029d.f10873y.f10636x) == null && h0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c1029d.f10872x);
        contentValues.put("name", c1029d.f10873y.f10636x);
        Object objA = c1029d.f10873y.a();
        AbstractC1332d.m(objA);
        N(contentValues, objA);
        contentValues.put("active", Boolean.valueOf(c1029d.f10864A));
        contentValues.put("trigger_event_name", c1029d.f10865B);
        contentValues.put("trigger_timeout", Long.valueOf(c1029d.f10867D));
        q();
        contentValues.put("timed_out_event", K1.g0(c1029d.f10866C));
        contentValues.put("creation_timestamp", Long.valueOf(c1029d.f10874z));
        q();
        contentValues.put("triggered_event", K1.g0(c1029d.f10868E));
        contentValues.put("triggered_timestamp", Long.valueOf(c1029d.f10873y.f10637y));
        contentValues.put("time_to_live", Long.valueOf(c1029d.f10869F));
        q();
        contentValues.put("expired_event", K1.g0(c1029d.f10870G));
        try {
            if (z().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            f().f10715B.c(N.x(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e6) {
            N nF = f();
            nF.f10715B.b(N.x(str), e6, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean c0(C1072t c1072t, long j6, boolean z5) {
        r();
        v();
        String str = c1072t.f11096a;
        AbstractC1332d.g(str);
        byte[] bArrC = s().D(c1072t).c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", c1072t.f11097b);
        contentValues.put("timestamp", Long.valueOf(c1072t.f11099d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j6));
        contentValues.put("data", bArrC);
        contentValues.put("realtime", Integer.valueOf(z5 ? 1 : 0));
        try {
            if (z().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            f().f10715B.c(N.x(str), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e6) {
            N nF = f();
            nF.f10715B.b(N.x(str), e6, "Error storing raw event. appId");
            return false;
        }
    }

    public final boolean d0(I1 i12) {
        r();
        v();
        String str = i12.f10647a;
        String str2 = i12.f10649c;
        I1 i1R0 = r0(str, str2);
        String str3 = i12.f10648b;
        if (i1R0 == null) {
            if (K1.x0(str2)) {
                if (h0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(n().x(str, AbstractC1078w.f11136I), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && h0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(i12.f10650d));
        N(contentValues, i12.f10651e);
        try {
            if (z().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            f().f10715B.c(N.x(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e6) {
            f().f10715B.b(N.x(str), e6, "Error storing user property. appId");
            return true;
        }
    }

    public final boolean e0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final String f0() {
        ((C0337b) h()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return "(" + ("(upload_type = 1 AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + ((Long) AbstractC1078w.f11130F.a(null)).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != 1 AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + ((Long) AbstractC1078w.f11129E.a(null)).longValue() + " AS INTEGER)))") + ")";
    }

    public final long g0(String str) {
        long jD;
        AbstractC1332d.g(str);
        AbstractC1332d.g("first_open_count");
        r();
        v();
        SQLiteDatabase sQLiteDatabaseZ = z();
        sQLiteDatabaseZ.beginTransaction();
        long j6 = 0;
        try {
            try {
                jD = D("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
            } finally {
                sQLiteDatabaseZ.endTransaction();
            }
        } catch (SQLiteException e6) {
            e = e6;
        }
        if (jD == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (sQLiteDatabaseZ.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                f().f10715B.b(N.x(str), "first_open_count", "Failed to insert column (got -1). appId");
                return -1L;
            }
            jD = 0;
            f().f10715B.e("Error inserting column. appId", N.x(str), "first_open_count", e);
            sQLiteDatabaseZ.endTransaction();
            return j6;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + jD));
            if (sQLiteDatabaseZ.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                f().f10715B.b(N.x(str), "first_open_count", "Failed to update column (got 0). appId");
                return -1L;
            }
            sQLiteDatabaseZ.setTransactionSuccessful();
            return jD;
        } catch (SQLiteException e7) {
            long j7 = jD;
            e = e7;
            j6 = j7;
        }
    }

    public final long h0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = z().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j6 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j6;
            } catch (SQLiteException e6) {
                f().f10715B.b(str, e6, "Database error");
                throw e6;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        f().f10715B.c(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List i0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.i0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void j0(String str, Bundle bundle) {
        r();
        v();
        byte[] bArrC = s().D(new C1072t((C1051k0) this.f1668w, "", str, "dep", 0L, 0L, bundle)).c();
        N nF = f();
        nF.f10723J.b(o().b(str), Integer.valueOf(bArrC.length), "Saving default event parameters, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrC);
        try {
            if (z().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                f().f10715B.c(N.x(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e6) {
            N nF2 = f();
            nF2.f10715B.b(N.x(str), e6, "Error storing default event parameters. appId");
        }
    }

    public final void k0(String str, ArrayList arrayList) {
        AbstractC1332d.g(str);
        v();
        r();
        SQLiteDatabase sQLiteDatabaseZ = z();
        try {
            long jH0 = h0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, n().x(str, AbstractC1078w.f11134H)));
            if (jH0 <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                Integer num = (Integer) arrayList.get(i6);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseZ.delete("audience_filter_values", AbstractC0628i.j("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", AbstractC0628i.j("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e6) {
            f().f10715B.b(N.x(str), e6, "Database error querying filters. appId");
        }
    }

    public final void l0(String str, C1085z0 c1085z0) {
        AbstractC1332d.m(str);
        AbstractC1332d.m(c1085z0);
        r();
        v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c1085z0.m());
        contentValues.put("consent_source", Integer.valueOf(c1085z0.f11287b));
        M(contentValues);
    }

    public final long m0(String str) {
        AbstractC1332d.g(str);
        r();
        v();
        return D("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long n0(String str) {
        AbstractC1332d.g(str);
        return D("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m2.C1029d o0(java.lang.String r36, java.lang.String r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.o0(java.lang.String, java.lang.String):m2.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m2.C1070s p0(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.p0(java.lang.String, java.lang.String, java.lang.String):m2.s");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03dd A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x041d A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TRY_LEAVE, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0446 A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0478 A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TRY_LEAVE, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049a A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TRY_ENTER, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04a9 A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TRY_LEAVE, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04d0 A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TRY_LEAVE, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02fa A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0383 A[Catch: all -> 0x0165, SQLiteException -> 0x016a, TRY_LEAVE, TryCatch #4 {all -> 0x0165, blocks: (B:4:0x0136, B:8:0x0140, B:10:0x0149, B:12:0x0158, B:20:0x0175, B:22:0x0189, B:25:0x019d, B:27:0x01de, B:32:0x01e8, B:36:0x0232, B:38:0x0261, B:49:0x0283, B:53:0x0299, B:55:0x02a4, B:56:0x02b6, B:58:0x02c3, B:62:0x02eb, B:64:0x02fa, B:66:0x0303, B:68:0x030b, B:78:0x032c, B:80:0x033f, B:91:0x0364, B:93:0x0383, B:100:0x03a1, B:104:0x03ae, B:106:0x03b4, B:116:0x03d5, B:126:0x0402, B:135:0x043a, B:137:0x0446, B:139:0x044e, B:144:0x0472, B:146:0x0478, B:151:0x049a, B:153:0x04a9, B:161:0x04c7, B:163:0x04d0, B:129:0x041d, B:119:0x03dd, B:123:0x03e6, B:60:0x02cf, B:52:0x0295, B:35:0x022d, B:24:0x0195, B:19:0x016e, B:182:0x04fd), top: B:195:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m2.F q0(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.q0(java.lang.String):m2.F");
    }

    public final I1 r0(String str, String str2) {
        Cursor cursorQuery;
        AbstractC1332d.g(str);
        AbstractC1332d.g(str2);
        r();
        v();
        Cursor cursor = null;
        try {
            cursorQuery = z().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j6 = cursorQuery.getLong(0);
                    Object objE = E(cursorQuery, 1);
                    if (objE == null) {
                        cursorQuery.close();
                        return null;
                    }
                    I1 i12 = new I1(str, cursorQuery.getString(2), str2, j6, objE);
                    if (cursorQuery.moveToNext()) {
                        f().f10715B.c(N.x(str), "Got multiple records for user property, expected one. appId");
                    }
                    cursorQuery.close();
                    return i12;
                } catch (SQLiteException e6) {
                    e = e6;
                    f().f10715B.e("Error querying user property. appId", N.x(str), o().g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
            th = th;
            cursor = cursorQuery;
        } catch (SQLiteException e7) {
            e = e7;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final C1085z0 s0(String str) {
        AbstractC1332d.m(str);
        r();
        v();
        return C1085z0.d(100, G("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final void t0(String str, String str2) {
        AbstractC1332d.g(str);
        AbstractC1332d.g(str2);
        r();
        v();
        try {
            z().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e6) {
            N nF = f();
            nF.f10715B.e("Error deleting user property. appId", N.x(str), o().g(str2), e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m2.C1085z0 u0(java.lang.String r5) {
        /*
            r4 = this;
            t0.AbstractC1332d.m(r5)
            r4.r()
            r4.v()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.z()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            if (r0 != 0) goto L32
            m2.N r0 = r4.f()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            m2.P r0 = r0.f10723J     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "No data found"
            r0.d(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
        L29:
            r5.close()
            goto L53
        L2d:
            r0 = move-exception
            r1 = r5
            goto L59
        L30:
            r0 = move-exception
            goto L45
        L32:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            m2.z0 r1 = m2.C1085z0.d(r2, r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            goto L29
        L41:
            r0 = move-exception
            goto L59
        L43:
            r0 = move-exception
            r5 = r1
        L45:
            m2.N r2 = r4.f()     // Catch: java.lang.Throwable -> L2d
            m2.P r2 = r2.f10715B     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Error querying database."
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L53
            goto L29
        L53:
            if (r1 != 0) goto L58
            m2.z0 r5 = m2.C1085z0.f11285c
            return r5
        L58:
            return r1
        L59:
            if (r1 == 0) goto L5e
            r1.close()
        L5e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.u0(java.lang.String):m2.z0");
    }

    public final void v0(String str, String str2) {
        AbstractC1332d.g(str2);
        r();
        v();
        try {
            z().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e6) {
            N nF = f();
            nF.f10715B.b(N.x(str2), e6, "Error deleting snapshot. appId");
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0095: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:150), block:B:16:0x0095 */
    public final E1 w0(String str) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        AbstractC1332d.g(str);
        r();
        v();
        Q4.a();
        Cursor cursor2 = null;
        try {
            if (!n().D(null, AbstractC1078w.f11122A0)) {
                return null;
            }
            try {
                cursorQuery = z().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + f0(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(3);
                    if (TextUtils.isEmpty(string)) {
                        f().f10722I.d("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                        cursorQuery.close();
                        return null;
                    }
                    try {
                        C0520x1 c0520x1 = (C0520x1) H1.F(C0526y1.v(), cursorQuery.getBlob(2));
                        int i6 = u.h.c(3)[cursorQuery.getInt(5)];
                        if ((i6 == 3 || i6 == 1) && cursorQuery.getInt(6) > 0) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = Collections.unmodifiableList(((C0526y1) c0520x1.f6602x).A()).iterator();
                            while (it.hasNext()) {
                                C0532z1 c0532z1 = (C0532z1) ((com.google.android.gms.internal.measurement.A1) it.next()).l();
                                int i7 = cursorQuery.getInt(6);
                                c0532z1.i();
                                com.google.android.gms.internal.measurement.A1.q1((com.google.android.gms.internal.measurement.A1) c0532z1.f6602x, i7);
                                arrayList.add((com.google.android.gms.internal.measurement.A1) c0532z1.e());
                            }
                            c0520x1.i();
                            C0526y1.w((C0526y1) c0520x1.f6602x);
                            c0520x1.i();
                            C0526y1.u((C0526y1) c0520x1.f6602x, arrayList);
                        }
                        HashMap map = new HashMap();
                        String string2 = cursorQuery.getString(4);
                        if (string2 != null) {
                            String[] strArrSplit = string2.split("\r\n");
                            int length = strArrSplit.length;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length) {
                                    break;
                                }
                                String str2 = strArrSplit[i8];
                                if (str2.isEmpty()) {
                                    break;
                                }
                                String[] strArrSplit2 = str2.split("=", 2);
                                if (strArrSplit2.length != 2) {
                                    f().f10715B.c(str2, "Invalid upload header: ");
                                    break;
                                }
                                map.put(strArrSplit2[0], strArrSplit2[1]);
                                i8++;
                            }
                        }
                        long j6 = cursorQuery.getLong(0);
                        C0526y1 c0526y1 = (C0526y1) c0520x1.e();
                        E1 e12 = new E1();
                        e12.f10561a = j6;
                        e12.f10562b = c0526y1;
                        e12.f10563c = string;
                        e12.f10564d = map;
                        e12.f10565e = i6;
                        cursorQuery.close();
                        return e12;
                    } catch (IOException e6) {
                        f().f10715B.b(str, e6, "Failed to queued MeasurementBatch from upload_queue. appId");
                        cursorQuery.close();
                        return null;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    f().f10715B.b(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (SQLiteException e8) {
                e = e8;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
        }
    }

    @Override // m2.t1
    public final boolean x() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List x0(java.lang.String r16) throws java.lang.Throwable {
        /*
            r15 = this;
            t0.AbstractC1332d.g(r16)
            r15.r()
            r15.v()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r15.z()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L46
            r1.close()
            return r0
        L46:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L52
            java.lang.String r2 = ""
        L52:
            r5 = r2
            goto L5a
        L54:
            r0 = move-exception
            r2 = r15
            goto La7
        L57:
            r0 = move-exception
            r2 = r15
            goto L8e
        L5a:
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r2 = r15
            java.lang.Object r9 = r15.E(r1, r14)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            if (r9 != 0) goto L79
            m2.N r3 = r15.f()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            m2.P r3 = r3.f10715B     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            m2.O r5 = m2.N.x(r16)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r3.c(r5, r4)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            goto L84
        L75:
            r0 = move-exception
            goto La7
        L77:
            r0 = move-exception
            goto L8e
        L79:
            m2.I1 r10 = new m2.I1     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r0.add(r10)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
        L84:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            if (r3 != 0) goto L46
            r1.close()
            return r0
        L8e:
            m2.N r3 = r15.f()     // Catch: java.lang.Throwable -> L75
            m2.P r3 = r3.f10715B     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Error querying user properties. appId"
            m2.O r5 = m2.N.x(r16)     // Catch: java.lang.Throwable -> L75
            r3.b(r5, r0, r4)     // Catch: java.lang.Throwable -> L75
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto La6
            r1.close()
        La6:
            return r0
        La7:
            if (r1 == 0) goto Lac
            r1.close()
        Lac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1044i.x0(java.lang.String):java.util.List");
    }

    public final long y() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = z().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j6 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j6;
            } catch (SQLiteException e6) {
                f().f10715B.c(e6, "Error querying raw events");
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void y0() {
        v();
        z().beginTransaction();
    }

    public final SQLiteDatabase z() {
        r();
        try {
            return this.f10950z.getWritableDatabase();
        } catch (SQLiteException e6) {
            f().f10718E.c(e6, "Error opening database");
            throw e6;
        }
    }

    public final void z0(String str) {
        r();
        v();
        try {
            z().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e6) {
            f().f10715B.c(e6, "Error clearing default event params");
        }
    }
}
