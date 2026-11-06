package R0;

import H1.m;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Map;
import t0.AbstractC1332d;
import w0.p;
import w0.r;
import w0.t;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f2926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f2927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f2928j;

    public k(p pVar) {
        this.f2919a = pVar;
        this.f2920b = new b(this, pVar, 5);
        this.f2921c = new j(pVar, 0);
        this.f2922d = new j(pVar, 1);
        this.f2923e = new j(pVar, 2);
        this.f2924f = new j(pVar, 3);
        this.f2925g = new j(pVar, 4);
        this.f2926h = new j(pVar, 5);
        this.f2927i = new j(pVar, 6);
        this.f2928j = new j(pVar, 7);
    }

    public final void a(String str, String str2) {
        Map map = (Map) this.f2924f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final H1.i b() {
        String strI = ((String) this.f2919a) == null ? " transportName" : "";
        if (((m) this.f2921c) == null) {
            strI = strI.concat(" encodedPayload");
        }
        if (((Long) this.f2922d) == null) {
            strI = AbstractC0628i.i(strI, " eventMillis");
        }
        if (((Long) this.f2923e) == null) {
            strI = AbstractC0628i.i(strI, " uptimeMillis");
        }
        if (((Map) this.f2924f) == null) {
            strI = AbstractC0628i.i(strI, " autoMetadata");
        }
        if (strI.isEmpty()) {
            return new H1.i((String) this.f2919a, (Integer) this.f2920b, (m) this.f2921c, ((Long) this.f2922d).longValue(), ((Long) this.f2923e).longValue(), (Map) this.f2924f, (Integer) this.f2925g, (String) this.f2926h, (byte[]) this.f2927i, (byte[]) this.f2928j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public final void c(String str) {
        ((p) this.f2919a).b();
        B0.g gVarA = ((t) this.f2921c).a();
        if (str == null) {
            gVarA.h(1);
        } else {
            gVarA.k(1, str);
        }
        ((p) this.f2919a).c();
        try {
            gVarA.l();
            ((p) this.f2919a).h();
        } finally {
            ((p) this.f2919a).f();
            ((t) this.f2921c).c(gVarA);
        }
    }

    public final ArrayList d() throws Throwable {
        r rVar;
        r rVarB = r.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        rVarB.c(1, 200);
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            int iQ = f2.h.q(cursorG, "required_network_type");
            int iQ2 = f2.h.q(cursorG, "requires_charging");
            int iQ3 = f2.h.q(cursorG, "requires_device_idle");
            int iQ4 = f2.h.q(cursorG, "requires_battery_not_low");
            int iQ5 = f2.h.q(cursorG, "requires_storage_not_low");
            int iQ6 = f2.h.q(cursorG, "trigger_content_update_delay");
            int iQ7 = f2.h.q(cursorG, "trigger_max_content_delay");
            int iQ8 = f2.h.q(cursorG, "content_uri_triggers");
            int iQ9 = f2.h.q(cursorG, "id");
            int iQ10 = f2.h.q(cursorG, "state");
            int iQ11 = f2.h.q(cursorG, "worker_class_name");
            int iQ12 = f2.h.q(cursorG, "input_merger_class_name");
            int iQ13 = f2.h.q(cursorG, "input");
            int iQ14 = f2.h.q(cursorG, "output");
            rVar = rVarB;
            try {
                int iQ15 = f2.h.q(cursorG, "initial_delay");
                int iQ16 = f2.h.q(cursorG, "interval_duration");
                int iQ17 = f2.h.q(cursorG, "flex_duration");
                int iQ18 = f2.h.q(cursorG, "run_attempt_count");
                int iQ19 = f2.h.q(cursorG, "backoff_policy");
                int iQ20 = f2.h.q(cursorG, "backoff_delay_duration");
                int iQ21 = f2.h.q(cursorG, "period_start_time");
                int iQ22 = f2.h.q(cursorG, "minimum_retention_duration");
                int iQ23 = f2.h.q(cursorG, "schedule_requested_at");
                int iQ24 = f2.h.q(cursorG, "run_in_foreground");
                int iQ25 = f2.h.q(cursorG, "out_of_quota_policy");
                int i6 = iQ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iQ9);
                    int i7 = iQ9;
                    String string2 = cursorG.getString(iQ11);
                    int i8 = iQ11;
                    I0.c cVar = new I0.c();
                    int i9 = iQ;
                    cVar.f1086a = AbstractC1332d.P(cursorG.getInt(iQ));
                    cVar.f1087b = cursorG.getInt(iQ2) != 0;
                    cVar.f1088c = cursorG.getInt(iQ3) != 0;
                    cVar.f1089d = cursorG.getInt(iQ4) != 0;
                    cVar.f1090e = cursorG.getInt(iQ5) != 0;
                    int i10 = iQ2;
                    int i11 = iQ3;
                    cVar.f1091f = cursorG.getLong(iQ6);
                    cVar.f1092g = cursorG.getLong(iQ7);
                    cVar.f1093h = AbstractC1332d.a(cursorG.getBlob(iQ8));
                    i iVar = new i(string, string2);
                    iVar.f2901b = AbstractC1332d.R(cursorG.getInt(iQ10));
                    iVar.f2903d = cursorG.getString(iQ12);
                    iVar.f2904e = I0.g.a(cursorG.getBlob(iQ13));
                    int i12 = i6;
                    iVar.f2905f = I0.g.a(cursorG.getBlob(i12));
                    i6 = i12;
                    int i13 = iQ15;
                    iVar.f2906g = cursorG.getLong(i13);
                    int i14 = iQ13;
                    int i15 = iQ16;
                    iVar.f2907h = cursorG.getLong(i15);
                    int i16 = iQ4;
                    int i17 = iQ17;
                    iVar.f2908i = cursorG.getLong(i17);
                    int i18 = iQ18;
                    iVar.f2910k = cursorG.getInt(i18);
                    int i19 = iQ19;
                    iVar.f2911l = AbstractC1332d.O(cursorG.getInt(i19));
                    iQ17 = i17;
                    int i20 = iQ20;
                    iVar.f2912m = cursorG.getLong(i20);
                    int i21 = iQ21;
                    iVar.f2913n = cursorG.getLong(i21);
                    iQ21 = i21;
                    int i22 = iQ22;
                    iVar.f2914o = cursorG.getLong(i22);
                    int i23 = iQ23;
                    iVar.f2915p = cursorG.getLong(i23);
                    int i24 = iQ24;
                    iVar.f2916q = cursorG.getInt(i24) != 0;
                    int i25 = iQ25;
                    iVar.f2917r = AbstractC1332d.Q(cursorG.getInt(i25));
                    iVar.f2909j = cVar;
                    arrayList.add(iVar);
                    iQ25 = i25;
                    iQ2 = i10;
                    iQ13 = i14;
                    iQ15 = i13;
                    iQ16 = i15;
                    iQ18 = i18;
                    iQ23 = i23;
                    iQ9 = i7;
                    iQ11 = i8;
                    iQ = i9;
                    iQ24 = i24;
                    iQ22 = i22;
                    iQ3 = i11;
                    iQ20 = i20;
                    iQ4 = i16;
                    iQ19 = i19;
                }
                cursorG.close();
                rVar.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                rVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rVar = rVarB;
        }
    }

    public final ArrayList e(int i6) throws Throwable {
        r rVar;
        r rVarB = r.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        rVarB.c(1, i6);
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            int iQ = f2.h.q(cursorG, "required_network_type");
            int iQ2 = f2.h.q(cursorG, "requires_charging");
            int iQ3 = f2.h.q(cursorG, "requires_device_idle");
            int iQ4 = f2.h.q(cursorG, "requires_battery_not_low");
            int iQ5 = f2.h.q(cursorG, "requires_storage_not_low");
            int iQ6 = f2.h.q(cursorG, "trigger_content_update_delay");
            int iQ7 = f2.h.q(cursorG, "trigger_max_content_delay");
            int iQ8 = f2.h.q(cursorG, "content_uri_triggers");
            int iQ9 = f2.h.q(cursorG, "id");
            int iQ10 = f2.h.q(cursorG, "state");
            int iQ11 = f2.h.q(cursorG, "worker_class_name");
            int iQ12 = f2.h.q(cursorG, "input_merger_class_name");
            int iQ13 = f2.h.q(cursorG, "input");
            int iQ14 = f2.h.q(cursorG, "output");
            rVar = rVarB;
            try {
                int iQ15 = f2.h.q(cursorG, "initial_delay");
                int iQ16 = f2.h.q(cursorG, "interval_duration");
                int iQ17 = f2.h.q(cursorG, "flex_duration");
                int iQ18 = f2.h.q(cursorG, "run_attempt_count");
                int iQ19 = f2.h.q(cursorG, "backoff_policy");
                int iQ20 = f2.h.q(cursorG, "backoff_delay_duration");
                int iQ21 = f2.h.q(cursorG, "period_start_time");
                int iQ22 = f2.h.q(cursorG, "minimum_retention_duration");
                int iQ23 = f2.h.q(cursorG, "schedule_requested_at");
                int iQ24 = f2.h.q(cursorG, "run_in_foreground");
                int iQ25 = f2.h.q(cursorG, "out_of_quota_policy");
                int i7 = iQ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iQ9);
                    int i8 = iQ9;
                    String string2 = cursorG.getString(iQ11);
                    int i9 = iQ11;
                    I0.c cVar = new I0.c();
                    int i10 = iQ;
                    cVar.f1086a = AbstractC1332d.P(cursorG.getInt(iQ));
                    cVar.f1087b = cursorG.getInt(iQ2) != 0;
                    cVar.f1088c = cursorG.getInt(iQ3) != 0;
                    cVar.f1089d = cursorG.getInt(iQ4) != 0;
                    cVar.f1090e = cursorG.getInt(iQ5) != 0;
                    int i11 = iQ2;
                    int i12 = iQ3;
                    cVar.f1091f = cursorG.getLong(iQ6);
                    cVar.f1092g = cursorG.getLong(iQ7);
                    cVar.f1093h = AbstractC1332d.a(cursorG.getBlob(iQ8));
                    i iVar = new i(string, string2);
                    iVar.f2901b = AbstractC1332d.R(cursorG.getInt(iQ10));
                    iVar.f2903d = cursorG.getString(iQ12);
                    iVar.f2904e = I0.g.a(cursorG.getBlob(iQ13));
                    int i13 = i7;
                    iVar.f2905f = I0.g.a(cursorG.getBlob(i13));
                    int i14 = iQ15;
                    i7 = i13;
                    iVar.f2906g = cursorG.getLong(i14);
                    int i15 = iQ13;
                    int i16 = iQ16;
                    iVar.f2907h = cursorG.getLong(i16);
                    int i17 = iQ4;
                    int i18 = iQ17;
                    iVar.f2908i = cursorG.getLong(i18);
                    int i19 = iQ18;
                    iVar.f2910k = cursorG.getInt(i19);
                    int i20 = iQ19;
                    iVar.f2911l = AbstractC1332d.O(cursorG.getInt(i20));
                    iQ17 = i18;
                    int i21 = iQ20;
                    iVar.f2912m = cursorG.getLong(i21);
                    int i22 = iQ21;
                    iVar.f2913n = cursorG.getLong(i22);
                    iQ21 = i22;
                    int i23 = iQ22;
                    iVar.f2914o = cursorG.getLong(i23);
                    int i24 = iQ23;
                    iVar.f2915p = cursorG.getLong(i24);
                    int i25 = iQ24;
                    iVar.f2916q = cursorG.getInt(i25) != 0;
                    int i26 = iQ25;
                    iVar.f2917r = AbstractC1332d.Q(cursorG.getInt(i26));
                    iVar.f2909j = cVar;
                    arrayList.add(iVar);
                    iQ2 = i11;
                    iQ25 = i26;
                    iQ13 = i15;
                    iQ15 = i14;
                    iQ16 = i16;
                    iQ18 = i19;
                    iQ23 = i24;
                    iQ9 = i8;
                    iQ11 = i9;
                    iQ = i10;
                    iQ24 = i25;
                    iQ22 = i23;
                    iQ3 = i12;
                    iQ20 = i21;
                    iQ4 = i17;
                    iQ19 = i20;
                }
                cursorG.close();
                rVar.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                rVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rVar = rVarB;
        }
    }

    public final ArrayList f() throws Throwable {
        r rVar;
        r rVarB = r.b(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            int iQ = f2.h.q(cursorG, "required_network_type");
            int iQ2 = f2.h.q(cursorG, "requires_charging");
            int iQ3 = f2.h.q(cursorG, "requires_device_idle");
            int iQ4 = f2.h.q(cursorG, "requires_battery_not_low");
            int iQ5 = f2.h.q(cursorG, "requires_storage_not_low");
            int iQ6 = f2.h.q(cursorG, "trigger_content_update_delay");
            int iQ7 = f2.h.q(cursorG, "trigger_max_content_delay");
            int iQ8 = f2.h.q(cursorG, "content_uri_triggers");
            int iQ9 = f2.h.q(cursorG, "id");
            int iQ10 = f2.h.q(cursorG, "state");
            int iQ11 = f2.h.q(cursorG, "worker_class_name");
            int iQ12 = f2.h.q(cursorG, "input_merger_class_name");
            int iQ13 = f2.h.q(cursorG, "input");
            int iQ14 = f2.h.q(cursorG, "output");
            rVar = rVarB;
            try {
                int iQ15 = f2.h.q(cursorG, "initial_delay");
                int iQ16 = f2.h.q(cursorG, "interval_duration");
                int iQ17 = f2.h.q(cursorG, "flex_duration");
                int iQ18 = f2.h.q(cursorG, "run_attempt_count");
                int iQ19 = f2.h.q(cursorG, "backoff_policy");
                int iQ20 = f2.h.q(cursorG, "backoff_delay_duration");
                int iQ21 = f2.h.q(cursorG, "period_start_time");
                int iQ22 = f2.h.q(cursorG, "minimum_retention_duration");
                int iQ23 = f2.h.q(cursorG, "schedule_requested_at");
                int iQ24 = f2.h.q(cursorG, "run_in_foreground");
                int iQ25 = f2.h.q(cursorG, "out_of_quota_policy");
                int i6 = iQ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iQ9);
                    int i7 = iQ9;
                    String string2 = cursorG.getString(iQ11);
                    int i8 = iQ11;
                    I0.c cVar = new I0.c();
                    int i9 = iQ;
                    cVar.f1086a = AbstractC1332d.P(cursorG.getInt(iQ));
                    cVar.f1087b = cursorG.getInt(iQ2) != 0;
                    cVar.f1088c = cursorG.getInt(iQ3) != 0;
                    cVar.f1089d = cursorG.getInt(iQ4) != 0;
                    cVar.f1090e = cursorG.getInt(iQ5) != 0;
                    int i10 = iQ2;
                    int i11 = iQ3;
                    cVar.f1091f = cursorG.getLong(iQ6);
                    cVar.f1092g = cursorG.getLong(iQ7);
                    cVar.f1093h = AbstractC1332d.a(cursorG.getBlob(iQ8));
                    i iVar = new i(string, string2);
                    iVar.f2901b = AbstractC1332d.R(cursorG.getInt(iQ10));
                    iVar.f2903d = cursorG.getString(iQ12);
                    iVar.f2904e = I0.g.a(cursorG.getBlob(iQ13));
                    int i12 = i6;
                    iVar.f2905f = I0.g.a(cursorG.getBlob(i12));
                    i6 = i12;
                    int i13 = iQ15;
                    iVar.f2906g = cursorG.getLong(i13);
                    int i14 = iQ13;
                    int i15 = iQ16;
                    iVar.f2907h = cursorG.getLong(i15);
                    int i16 = iQ4;
                    int i17 = iQ17;
                    iVar.f2908i = cursorG.getLong(i17);
                    int i18 = iQ18;
                    iVar.f2910k = cursorG.getInt(i18);
                    int i19 = iQ19;
                    iVar.f2911l = AbstractC1332d.O(cursorG.getInt(i19));
                    iQ17 = i17;
                    int i20 = iQ20;
                    iVar.f2912m = cursorG.getLong(i20);
                    int i21 = iQ21;
                    iVar.f2913n = cursorG.getLong(i21);
                    iQ21 = i21;
                    int i22 = iQ22;
                    iVar.f2914o = cursorG.getLong(i22);
                    int i23 = iQ23;
                    iVar.f2915p = cursorG.getLong(i23);
                    int i24 = iQ24;
                    iVar.f2916q = cursorG.getInt(i24) != 0;
                    int i25 = iQ25;
                    iVar.f2917r = AbstractC1332d.Q(cursorG.getInt(i25));
                    iVar.f2909j = cVar;
                    arrayList.add(iVar);
                    iQ25 = i25;
                    iQ2 = i10;
                    iQ13 = i14;
                    iQ15 = i13;
                    iQ16 = i15;
                    iQ18 = i18;
                    iQ23 = i23;
                    iQ9 = i7;
                    iQ11 = i8;
                    iQ = i9;
                    iQ24 = i24;
                    iQ22 = i22;
                    iQ3 = i11;
                    iQ20 = i20;
                    iQ4 = i16;
                    iQ19 = i19;
                }
                cursorG.close();
                rVar.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                rVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rVar = rVarB;
        }
    }

    public final ArrayList g() {
        r rVar;
        r rVarB = r.b(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            int iQ = f2.h.q(cursorG, "required_network_type");
            int iQ2 = f2.h.q(cursorG, "requires_charging");
            int iQ3 = f2.h.q(cursorG, "requires_device_idle");
            int iQ4 = f2.h.q(cursorG, "requires_battery_not_low");
            int iQ5 = f2.h.q(cursorG, "requires_storage_not_low");
            int iQ6 = f2.h.q(cursorG, "trigger_content_update_delay");
            int iQ7 = f2.h.q(cursorG, "trigger_max_content_delay");
            int iQ8 = f2.h.q(cursorG, "content_uri_triggers");
            int iQ9 = f2.h.q(cursorG, "id");
            int iQ10 = f2.h.q(cursorG, "state");
            int iQ11 = f2.h.q(cursorG, "worker_class_name");
            int iQ12 = f2.h.q(cursorG, "input_merger_class_name");
            int iQ13 = f2.h.q(cursorG, "input");
            int iQ14 = f2.h.q(cursorG, "output");
            rVar = rVarB;
            try {
                int iQ15 = f2.h.q(cursorG, "initial_delay");
                int iQ16 = f2.h.q(cursorG, "interval_duration");
                int iQ17 = f2.h.q(cursorG, "flex_duration");
                int iQ18 = f2.h.q(cursorG, "run_attempt_count");
                int iQ19 = f2.h.q(cursorG, "backoff_policy");
                int iQ20 = f2.h.q(cursorG, "backoff_delay_duration");
                int iQ21 = f2.h.q(cursorG, "period_start_time");
                int iQ22 = f2.h.q(cursorG, "minimum_retention_duration");
                int iQ23 = f2.h.q(cursorG, "schedule_requested_at");
                int iQ24 = f2.h.q(cursorG, "run_in_foreground");
                int iQ25 = f2.h.q(cursorG, "out_of_quota_policy");
                int i6 = iQ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iQ9);
                    int i7 = iQ9;
                    String string2 = cursorG.getString(iQ11);
                    int i8 = iQ11;
                    I0.c cVar = new I0.c();
                    int i9 = iQ;
                    cVar.f1086a = AbstractC1332d.P(cursorG.getInt(iQ));
                    cVar.f1087b = cursorG.getInt(iQ2) != 0;
                    cVar.f1088c = cursorG.getInt(iQ3) != 0;
                    cVar.f1089d = cursorG.getInt(iQ4) != 0;
                    cVar.f1090e = cursorG.getInt(iQ5) != 0;
                    int i10 = iQ2;
                    int i11 = iQ3;
                    cVar.f1091f = cursorG.getLong(iQ6);
                    cVar.f1092g = cursorG.getLong(iQ7);
                    cVar.f1093h = AbstractC1332d.a(cursorG.getBlob(iQ8));
                    i iVar = new i(string, string2);
                    iVar.f2901b = AbstractC1332d.R(cursorG.getInt(iQ10));
                    iVar.f2903d = cursorG.getString(iQ12);
                    iVar.f2904e = I0.g.a(cursorG.getBlob(iQ13));
                    int i12 = i6;
                    iVar.f2905f = I0.g.a(cursorG.getBlob(i12));
                    i6 = i12;
                    int i13 = iQ15;
                    iVar.f2906g = cursorG.getLong(i13);
                    int i14 = iQ13;
                    int i15 = iQ16;
                    iVar.f2907h = cursorG.getLong(i15);
                    int i16 = iQ4;
                    int i17 = iQ17;
                    iVar.f2908i = cursorG.getLong(i17);
                    int i18 = iQ18;
                    iVar.f2910k = cursorG.getInt(i18);
                    int i19 = iQ19;
                    iVar.f2911l = AbstractC1332d.O(cursorG.getInt(i19));
                    iQ17 = i17;
                    int i20 = iQ20;
                    iVar.f2912m = cursorG.getLong(i20);
                    int i21 = iQ21;
                    iVar.f2913n = cursorG.getLong(i21);
                    iQ21 = i21;
                    int i22 = iQ22;
                    iVar.f2914o = cursorG.getLong(i22);
                    int i23 = iQ23;
                    iVar.f2915p = cursorG.getLong(i23);
                    int i24 = iQ24;
                    iVar.f2916q = cursorG.getInt(i24) != 0;
                    int i25 = iQ25;
                    iVar.f2917r = AbstractC1332d.Q(cursorG.getInt(i25));
                    iVar.f2909j = cVar;
                    arrayList.add(iVar);
                    iQ25 = i25;
                    iQ2 = i10;
                    iQ13 = i14;
                    iQ15 = i13;
                    iQ16 = i15;
                    iQ18 = i18;
                    iQ23 = i23;
                    iQ9 = i7;
                    iQ11 = i8;
                    iQ = i9;
                    iQ24 = i24;
                    iQ22 = i22;
                    iQ3 = i11;
                    iQ20 = i20;
                    iQ4 = i16;
                    iQ19 = i19;
                }
                cursorG.close();
                rVar.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                rVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rVar = rVarB;
        }
    }

    public final int h(String str) {
        r rVarB = r.b(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            return cursorG.moveToFirst() ? AbstractC1332d.R(cursorG.getInt(0)) : 0;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final ArrayList i(String str) {
        r rVarB = r.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final ArrayList j(String str) {
        r rVarB = r.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final i k(String str) {
        r rVar;
        i iVar;
        r rVarB = r.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            int iQ = f2.h.q(cursorG, "required_network_type");
            int iQ2 = f2.h.q(cursorG, "requires_charging");
            int iQ3 = f2.h.q(cursorG, "requires_device_idle");
            int iQ4 = f2.h.q(cursorG, "requires_battery_not_low");
            int iQ5 = f2.h.q(cursorG, "requires_storage_not_low");
            int iQ6 = f2.h.q(cursorG, "trigger_content_update_delay");
            int iQ7 = f2.h.q(cursorG, "trigger_max_content_delay");
            int iQ8 = f2.h.q(cursorG, "content_uri_triggers");
            int iQ9 = f2.h.q(cursorG, "id");
            int iQ10 = f2.h.q(cursorG, "state");
            int iQ11 = f2.h.q(cursorG, "worker_class_name");
            int iQ12 = f2.h.q(cursorG, "input_merger_class_name");
            int iQ13 = f2.h.q(cursorG, "input");
            int iQ14 = f2.h.q(cursorG, "output");
            rVar = rVarB;
            try {
                int iQ15 = f2.h.q(cursorG, "initial_delay");
                int iQ16 = f2.h.q(cursorG, "interval_duration");
                int iQ17 = f2.h.q(cursorG, "flex_duration");
                int iQ18 = f2.h.q(cursorG, "run_attempt_count");
                int iQ19 = f2.h.q(cursorG, "backoff_policy");
                int iQ20 = f2.h.q(cursorG, "backoff_delay_duration");
                int iQ21 = f2.h.q(cursorG, "period_start_time");
                int iQ22 = f2.h.q(cursorG, "minimum_retention_duration");
                int iQ23 = f2.h.q(cursorG, "schedule_requested_at");
                int iQ24 = f2.h.q(cursorG, "run_in_foreground");
                int iQ25 = f2.h.q(cursorG, "out_of_quota_policy");
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iQ9);
                    String string2 = cursorG.getString(iQ11);
                    I0.c cVar = new I0.c();
                    cVar.f1086a = AbstractC1332d.P(cursorG.getInt(iQ));
                    cVar.f1087b = cursorG.getInt(iQ2) != 0;
                    cVar.f1088c = cursorG.getInt(iQ3) != 0;
                    cVar.f1089d = cursorG.getInt(iQ4) != 0;
                    cVar.f1090e = cursorG.getInt(iQ5) != 0;
                    cVar.f1091f = cursorG.getLong(iQ6);
                    cVar.f1092g = cursorG.getLong(iQ7);
                    cVar.f1093h = AbstractC1332d.a(cursorG.getBlob(iQ8));
                    iVar = new i(string, string2);
                    iVar.f2901b = AbstractC1332d.R(cursorG.getInt(iQ10));
                    iVar.f2903d = cursorG.getString(iQ12);
                    iVar.f2904e = I0.g.a(cursorG.getBlob(iQ13));
                    iVar.f2905f = I0.g.a(cursorG.getBlob(iQ14));
                    iVar.f2906g = cursorG.getLong(iQ15);
                    iVar.f2907h = cursorG.getLong(iQ16);
                    iVar.f2908i = cursorG.getLong(iQ17);
                    iVar.f2910k = cursorG.getInt(iQ18);
                    iVar.f2911l = AbstractC1332d.O(cursorG.getInt(iQ19));
                    iVar.f2912m = cursorG.getLong(iQ20);
                    iVar.f2913n = cursorG.getLong(iQ21);
                    iVar.f2914o = cursorG.getLong(iQ22);
                    iVar.f2915p = cursorG.getLong(iQ23);
                    iVar.f2916q = cursorG.getInt(iQ24) != 0;
                    iVar.f2917r = AbstractC1332d.Q(cursorG.getInt(iQ25));
                    iVar.f2909j = cVar;
                } else {
                    iVar = null;
                }
                cursorG.close();
                rVar.n();
                return iVar;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                rVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rVar = rVarB;
        }
    }

    public final ArrayList l(String str) {
        r rVarB = r.b(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            int iQ = f2.h.q(cursorG, "id");
            int iQ2 = f2.h.q(cursorG, "state");
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                h hVar = new h();
                hVar.f2898a = cursorG.getString(iQ);
                hVar.f2899b = AbstractC1332d.R(cursorG.getInt(iQ2));
                arrayList.add(hVar);
            }
            return arrayList;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final boolean m() {
        boolean z5 = false;
        r rVarB = r.b(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        ((p) this.f2919a).b();
        Cursor cursorG = ((p) this.f2919a).g(rVarB);
        try {
            if (cursorG.moveToFirst()) {
                if (cursorG.getInt(0) != 0) {
                    z5 = true;
                }
            }
            return z5;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final void n(String str) {
        ((p) this.f2919a).b();
        B0.g gVarA = ((t) this.f2924f).a();
        if (str == null) {
            gVarA.h(1);
        } else {
            gVarA.k(1, str);
        }
        ((p) this.f2919a).c();
        try {
            gVarA.f76x.executeUpdateDelete();
            ((p) this.f2919a).h();
        } finally {
            ((p) this.f2919a).f();
            ((t) this.f2924f).c(gVarA);
        }
    }

    public final void o(String str, long j6) {
        ((p) this.f2919a).b();
        B0.g gVarA = ((t) this.f2926h).a();
        gVarA.g(1, j6);
        if (str == null) {
            gVarA.h(2);
        } else {
            gVarA.k(2, str);
        }
        ((p) this.f2919a).c();
        try {
            gVarA.f76x.executeUpdateDelete();
            ((p) this.f2919a).h();
        } finally {
            ((p) this.f2919a).f();
            ((t) this.f2926h).c(gVarA);
        }
    }

    public final void p(String str) {
        ((p) this.f2919a).b();
        B0.g gVarA = ((t) this.f2925g).a();
        if (str == null) {
            gVarA.h(1);
        } else {
            gVarA.k(1, str);
        }
        ((p) this.f2919a).c();
        try {
            gVarA.f76x.executeUpdateDelete();
            ((p) this.f2919a).h();
        } finally {
            ((p) this.f2919a).f();
            ((t) this.f2925g).c(gVarA);
        }
    }

    public final void q(m mVar) {
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.f2921c = mVar;
    }

    public final void r(String str, I0.g gVar) throws Throwable {
        ((p) this.f2919a).b();
        B0.g gVarA = ((t) this.f2922d).a();
        byte[] bArrB = I0.g.b(gVar);
        if (bArrB == null) {
            gVarA.h(1);
        } else {
            gVarA.b(1, bArrB);
        }
        if (str == null) {
            gVarA.h(2);
        } else {
            gVarA.k(2, str);
        }
        ((p) this.f2919a).c();
        try {
            gVarA.l();
            ((p) this.f2919a).h();
        } finally {
            ((p) this.f2919a).f();
            ((t) this.f2922d).c(gVarA);
        }
    }

    public final void s(String str, long j6) {
        ((p) this.f2919a).b();
        B0.g gVarA = ((t) this.f2923e).a();
        gVarA.g(1, j6);
        if (str == null) {
            gVarA.h(2);
        } else {
            gVarA.k(2, str);
        }
        ((p) this.f2919a).c();
        try {
            gVarA.l();
            ((p) this.f2919a).h();
        } finally {
            ((p) this.f2919a).f();
            ((t) this.f2923e).c(gVarA);
        }
    }

    public final void t(int i6, String... strArr) {
        ((p) this.f2919a).b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            sb.append("?");
            if (i7 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        p pVar = (p) this.f2919a;
        pVar.a();
        pVar.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((B0.b) pVar.f13533c.C()).f62w.compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, AbstractC1332d.r0(i6));
        int i8 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i8);
            } else {
                sQLiteStatementCompileStatement.bindString(i8, str);
            }
            i8++;
        }
        ((p) this.f2919a).c();
        try {
            sQLiteStatementCompileStatement.executeUpdateDelete();
            ((p) this.f2919a).h();
        } finally {
            ((p) this.f2919a).f();
        }
    }
}
