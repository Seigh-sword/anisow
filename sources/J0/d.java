package J0;

import I0.o;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1181a = o.y("Schedulers");

    public static void a(I0.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        R0.k kVarN = workDatabase.n();
        workDatabase.c();
        try {
            ArrayList arrayListE = kVarN.e(bVar.f1084h);
            ArrayList arrayListD = kVarN.d();
            if (arrayListE.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    kVarN.o(((R0.i) it.next()).f2900a, jCurrentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListE.size() > 0) {
                R0.i[] iVarArr = (R0.i[]) arrayListE.toArray(new R0.i[arrayListE.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (cVar.e()) {
                        cVar.f(iVarArr);
                    }
                }
            }
            if (arrayListD.size() > 0) {
                R0.i[] iVarArr2 = (R0.i[]) arrayListD.toArray(new R0.i[arrayListD.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    c cVar2 = (c) it3.next();
                    if (!cVar2.e()) {
                        cVar2.f(iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
