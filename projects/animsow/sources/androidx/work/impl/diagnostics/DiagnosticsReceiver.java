package androidx.work.impl.diagnostics;

import I0.o;
import I0.p;
import J0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5852a = o.y("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f5852a;
        o.w().u(str, "Requesting diagnostics", new Throwable[0]);
        try {
            k.J(context).H(Collections.singletonList(new p(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e6) {
            o.w().v(str, "WorkManager is not initialized", e6);
        }
    }
}
