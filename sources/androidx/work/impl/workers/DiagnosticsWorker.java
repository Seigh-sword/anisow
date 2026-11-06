package androidx.work.impl.workers;

import H1.a;
import I0.g;
import I0.m;
import I0.n;
import I0.o;
import J0.k;
import R0.c;
import R0.e;
import R0.i;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import f2.h;
import i.C0803c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import t0.AbstractC1332d;
import w0.p;
import w0.r;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f5865C = o.y("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String h(c cVar, c cVar2, C0803c c0803c, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            e eVarD = c0803c.D(iVar.f2900a);
            Integer numValueOf = eVarD != null ? Integer.valueOf(eVarD.f2893b) : null;
            String str = iVar.f2900a;
            cVar.getClass();
            r rVarB = r.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                rVarB.h(1);
            } else {
                rVarB.l(1, str);
            }
            p pVar = cVar.f2888a;
            pVar.b();
            Cursor cursorG = pVar.g(rVarB);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                rVarB.n();
                ArrayList arrayListC = cVar2.c(iVar.f2900a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListC);
                sb.append("\n" + iVar.f2900a + "\t " + iVar.f2902c + "\t " + numValueOf + "\t " + a.s(iVar.f2901b) + "\t " + strJoin + "\t " + strJoin2 + "\t");
            } catch (Throwable th) {
                cursorG.close();
                rVarB.n();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final n g() throws Throwable {
        r rVar;
        ArrayList arrayList;
        C0803c c0803c;
        c cVar;
        c cVar2;
        int i6;
        WorkDatabase workDatabase = k.J(this.f5824w).f1208j;
        R0.k kVarN = workDatabase.n();
        c cVarL = workDatabase.l();
        c cVarO = workDatabase.o();
        C0803c c0803cK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        kVarN.getClass();
        r rVarB = r.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        rVarB.c(1, jCurrentTimeMillis);
        ((p) kVarN.f2919a).b();
        Cursor cursorG = ((p) kVarN.f2919a).g(rVarB);
        try {
            int iQ = h.q(cursorG, "required_network_type");
            int iQ2 = h.q(cursorG, "requires_charging");
            int iQ3 = h.q(cursorG, "requires_device_idle");
            int iQ4 = h.q(cursorG, "requires_battery_not_low");
            int iQ5 = h.q(cursorG, "requires_storage_not_low");
            int iQ6 = h.q(cursorG, "trigger_content_update_delay");
            int iQ7 = h.q(cursorG, "trigger_max_content_delay");
            int iQ8 = h.q(cursorG, "content_uri_triggers");
            int iQ9 = h.q(cursorG, "id");
            int iQ10 = h.q(cursorG, "state");
            int iQ11 = h.q(cursorG, "worker_class_name");
            int iQ12 = h.q(cursorG, "input_merger_class_name");
            int iQ13 = h.q(cursorG, "input");
            int iQ14 = h.q(cursorG, "output");
            rVar = rVarB;
            try {
                int iQ15 = h.q(cursorG, "initial_delay");
                int iQ16 = h.q(cursorG, "interval_duration");
                int iQ17 = h.q(cursorG, "flex_duration");
                int iQ18 = h.q(cursorG, "run_attempt_count");
                int iQ19 = h.q(cursorG, "backoff_policy");
                int iQ20 = h.q(cursorG, "backoff_delay_duration");
                int iQ21 = h.q(cursorG, "period_start_time");
                int iQ22 = h.q(cursorG, "minimum_retention_duration");
                int iQ23 = h.q(cursorG, "schedule_requested_at");
                int iQ24 = h.q(cursorG, "run_in_foreground");
                int iQ25 = h.q(cursorG, "out_of_quota_policy");
                int i7 = iQ14;
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!cursorG.moveToNext()) {
                        break;
                    }
                    String string = cursorG.getString(iQ9);
                    String string2 = cursorG.getString(iQ11);
                    int i8 = iQ11;
                    I0.c cVar3 = new I0.c();
                    int i9 = iQ;
                    cVar3.f1086a = AbstractC1332d.P(cursorG.getInt(iQ));
                    cVar3.f1087b = cursorG.getInt(iQ2) != 0;
                    cVar3.f1088c = cursorG.getInt(iQ3) != 0;
                    cVar3.f1089d = cursorG.getInt(iQ4) != 0;
                    cVar3.f1090e = cursorG.getInt(iQ5) != 0;
                    int i10 = iQ9;
                    cVar3.f1091f = cursorG.getLong(iQ6);
                    cVar3.f1092g = cursorG.getLong(iQ7);
                    cVar3.f1093h = AbstractC1332d.a(cursorG.getBlob(iQ8));
                    i iVar = new i(string, string2);
                    iVar.f2901b = AbstractC1332d.R(cursorG.getInt(iQ10));
                    iVar.f2903d = cursorG.getString(iQ12);
                    iVar.f2904e = g.a(cursorG.getBlob(iQ13));
                    int i11 = i7;
                    iVar.f2905f = g.a(cursorG.getBlob(i11));
                    int i12 = iQ10;
                    i7 = i11;
                    int i13 = iQ15;
                    iVar.f2906g = cursorG.getLong(i13);
                    int i14 = iQ12;
                    int i15 = iQ16;
                    iVar.f2907h = cursorG.getLong(i15);
                    int i16 = iQ13;
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
                    iQ22 = i22;
                    int i23 = iQ23;
                    iVar.f2915p = cursorG.getLong(i23);
                    int i24 = iQ24;
                    iVar.f2916q = cursorG.getInt(i24) != 0;
                    int i25 = iQ25;
                    iVar.f2917r = AbstractC1332d.Q(cursorG.getInt(i25));
                    iVar.f2909j = cVar3;
                    arrayList.add(iVar);
                    iQ25 = i25;
                    iQ10 = i12;
                    iQ12 = i14;
                    iQ23 = i23;
                    iQ = i9;
                    arrayList2 = arrayList;
                    iQ24 = i24;
                    iQ15 = i13;
                    iQ11 = i8;
                    iQ9 = i10;
                    iQ20 = i20;
                    iQ13 = i16;
                    iQ16 = i15;
                    iQ18 = i18;
                    iQ19 = i19;
                }
                cursorG.close();
                rVar.n();
                ArrayList arrayListF = kVarN.f();
                ArrayList arrayListD = kVarN.d();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = f5865C;
                if (zIsEmpty) {
                    c0803c = c0803cK;
                    cVar = cVarL;
                    cVar2 = cVarO;
                    i6 = 0;
                } else {
                    i6 = 0;
                    o.w().x(str, "Recently completed work:\n\n", new Throwable[0]);
                    c0803c = c0803cK;
                    cVar = cVarL;
                    cVar2 = cVarO;
                    o.w().x(str, h(cVar, cVar2, c0803c, arrayList), new Throwable[0]);
                }
                if (!arrayListF.isEmpty()) {
                    o.w().x(str, "Running work:\n\n", new Throwable[i6]);
                    o.w().x(str, h(cVar, cVar2, c0803c, arrayListF), new Throwable[i6]);
                }
                if (!arrayListD.isEmpty()) {
                    o.w().x(str, "Enqueued work:\n\n", new Throwable[i6]);
                    o.w().x(str, h(cVar, cVar2, c0803c, arrayListD), new Throwable[i6]);
                }
                return new m(g.f1099c);
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
}
