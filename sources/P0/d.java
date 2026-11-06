package P0;

import I0.o;
import android.content.Context;
import i.C0803c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import m.RunnableC0969k;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f2394f = o.y("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0803c f2395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2397c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2398d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2399e;

    public d(Context context, C0803c c0803c) {
        this.f2396b = context.getApplicationContext();
        this.f2395a = c0803c;
    }

    public abstract Object a();

    public final void b(O0.c cVar) {
        synchronized (this.f2397c) {
            try {
                if (this.f2398d.remove(cVar) && this.f2398d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f2397c) {
            try {
                Object obj2 = this.f2399e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f2399e = obj;
                    ((Executor) this.f2395a.f9279z).execute(new RunnableC0969k(this, 10, new ArrayList(this.f2398d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
