package J0;

import android.content.Context;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import i.C0803c;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m2.C1018C;
import org.json.JSONObject;
import p1.C1243i;
import r3.C1275a;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f1223i;

    public static void d(String str, JSONObject jSONObject) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public final m a() {
        m mVar = new m();
        mVar.f1227C = new I0.k();
        mVar.f1236L = new T0.i();
        mVar.f1237M = null;
        mVar.f1239w = (Context) this.f1216b;
        mVar.f1226B = (C0803c) this.f1219e;
        mVar.f1229E = (Q0.a) this.f1218d;
        mVar.f1240x = (String) this.f1215a;
        mVar.f1241y = (List) this.f1222h;
        mVar.f1225A = (ListenableWorker) this.f1217c;
        mVar.f1228D = (I0.b) this.f1220f;
        WorkDatabase workDatabase = (WorkDatabase) this.f1221g;
        mVar.f1230F = workDatabase;
        mVar.f1231G = workDatabase.n();
        mVar.f1232H = workDatabase.i();
        mVar.f1233I = workDatabase.o();
        return mVar;
    }

    public final C1275a b(int i6) {
        C1275a c1275a = null;
        try {
            if (!u.h.a(2, i6)) {
                JSONObject jSONObjectX = ((K1.b) this.f1220f).x();
                if (jSONObjectX != null) {
                    C1275a c1275aQ = ((C1243i) this.f1218d).q(jSONObjectX);
                    d("Loaded cached settings: ", jSONObjectX);
                    ((C1018C) this.f1219e).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (u.h.a(3, i6) || c1275aQ.f12475c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            c1275a = c1275aQ;
                        } catch (Exception e6) {
                            e = e6;
                            c1275a = c1275aQ;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                        }
                    } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e7) {
            e = e7;
        }
        return c1275a;
    }

    public final C1275a c() {
        return (C1275a) ((AtomicReference) this.f1222h).get();
    }
}
