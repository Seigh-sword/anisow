package I0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1118a = o.y("WorkerFactory");

    public static ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f1118a;
        ListenableWorker listenableWorker = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            o.w().v(str2, AbstractC0628i.q("Invalid class: ", str), th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                listenableWorker = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                o.w().v(str2, AbstractC0628i.q("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.f5827z) {
            return listenableWorker;
        }
        throw new IllegalStateException("WorkerFactory (" + x.class.getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
