package r3;

import J0.l;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j3.AbstractC0857g;
import j3.CallableC0865o;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.atomic.AtomicReference;
import k3.C0899e;
import org.json.JSONObject;
import p1.C1243i;
import q2.h;
import q2.j;
import q2.s;

/* JADX INFO: renamed from: r3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1276b implements h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0899e f12479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f12480x;

    public C1276b(l lVar, C0899e c0899e) {
        this.f12480x = lVar;
        this.f12479w = c0899e;
    }

    @Override // q2.h
    public final s l(Object obj) throws Throwable {
        FileWriter fileWriter;
        JSONObject jSONObject = (JSONObject) this.f12479w.f9657c.f9647w.submit(new CallableC0865o(1, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            l lVar = this.f12480x;
            C1275a c1275aQ = ((C1243i) lVar.f1218d).q(jSONObject);
            K1.b bVar = (K1.b) lVar.f1220f;
            long j6 = c1275aQ.f12475c;
            bVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j6);
                fileWriter = new FileWriter((File) bVar.f1515x);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e6) {
                        e = e6;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    AbstractC0857g.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC0857g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            AbstractC0857g.b(fileWriter, "Failed to close settings writer.");
            l.d("Loaded settings: ", jSONObject);
            String str = ((d) lVar.f1217c).f12486f;
            SharedPreferences.Editor editorEdit = ((Context) lVar.f1216b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) lVar.f1222h).set(c1275aQ);
            ((j) ((AtomicReference) lVar.f1223i).get()).c(c1275aQ);
        }
        return f2.h.l(null);
    }
}
