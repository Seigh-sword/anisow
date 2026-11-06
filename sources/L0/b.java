package L0;

import I0.o;
import J0.k;
import R0.i;
import S0.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d.AbstractC0628i;
import i.C0803c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements J0.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f1675z = o.y("CommandHandler");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f1676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f1677x = new HashMap();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f1678y = new Object();

    public b(Context context) {
        this.f1676w = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // J0.a
    public final void a(String str, boolean z5) {
        synchronized (this.f1678y) {
            try {
                J0.a aVar = (J0.a) this.f1677x.remove(str);
                if (aVar != null) {
                    aVar.a(str, z5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Intent intent, int i6, h hVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o.w().u(f1675z, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            d dVar = new d(this.f1676w, i6, hVar);
            ArrayList<i> arrayListG = hVar.f1697A.f1208j.n().g();
            String str = c.f1679a;
            Iterator it = arrayListG.iterator();
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            while (it.hasNext()) {
                I0.c cVar = ((i) it.next()).f2909j;
                z5 |= cVar.f1089d;
                z6 |= cVar.f1087b;
                z7 |= cVar.f1090e;
                z8 |= cVar.f1086a != 1;
                if (z5 && z6 && z7 && z8) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f5844a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f1681a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z6).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z8);
            context.sendBroadcast(intent2);
            N0.c cVar2 = dVar.f1683c;
            cVar2.b(arrayListG);
            ArrayList arrayList = new ArrayList(arrayListG.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (i iVar : arrayListG) {
                String str3 = iVar.f2900a;
                if (jCurrentTimeMillis >= iVar.a() && (!iVar.b() || cVar2.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((i) it2.next()).f2900a;
                Intent intentB = b(context, str4);
                o.w().u(d.f1680d, AbstractC0628i.j("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                hVar.e(new c.d(dVar.f1682b, hVar, intentB));
            }
            cVar2.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o.w().u(f1675z, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i6)), new Throwable[0]);
            hVar.f1697A.M();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            o.w().v(f1675z, AbstractC0628i.j("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f1678y) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        o oVarW = o.w();
                        String str5 = f1675z;
                        oVarW.u(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f1677x.containsKey(string)) {
                            o.w().u(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            e eVar = new e(this.f1676w, i6, string, hVar);
                            this.f1677x.put(string, eVar);
                            eVar.e();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    o.w().z(f1675z, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z9 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                o.w().u(f1675z, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i6)), new Throwable[0]);
                a(string2, z9);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            o.w().u(f1675z, AbstractC0628i.q("Handing stopWork work for ", string3), new Throwable[0]);
            k kVar = hVar.f1697A;
            kVar.f1209k.p(new j(kVar, string3, false));
            String str6 = a.f1674a;
            C0803c c0803cK = hVar.f1697A.f1208j.k();
            R0.e eVarD = c0803cK.D(string3);
            if (eVarD != null) {
                a.a(eVarD.f2893b, this.f1676w, string3);
                o.w().u(a.f1674a, AbstractC0628i.j("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                c0803cK.N(string3);
            }
            hVar.a(string3, false);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        String str7 = f1675z;
        o.w().u(str7, AbstractC0628i.q("Handling schedule work for ", string4), new Throwable[0]);
        WorkDatabase workDatabase = hVar.f1697A.f1208j;
        workDatabase.c();
        try {
            i iVarK = workDatabase.n().k(string4);
            if (iVarK == null) {
                o.w().z(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
            } else if (H1.a.a(iVarK.f2901b)) {
                o.w().z(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
            } else {
                long jA = iVarK.a();
                boolean zB = iVarK.b();
                Context context2 = this.f1676w;
                k kVar2 = hVar.f1697A;
                if (zB) {
                    o.w().u(str7, "Opportunistically setting an alarm for " + string4 + " at " + jA, new Throwable[0]);
                    a.b(context2, kVar2, string4, jA);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    hVar.e(new c.d(i6, hVar, intent3));
                } else {
                    o.w().u(str7, "Setting up Alarms for " + string4 + " at " + jA, new Throwable[0]);
                    a.b(context2, kVar2, string4, jA);
                }
                workDatabase.h();
            }
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
