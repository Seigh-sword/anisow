package androidx.work.impl.background.systemalarm;

import I0.o;
import J0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d.AbstractC0628i;
import l.RunnableC0914g;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5844a = o.y("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            k.J(context).f1209k.p(new RunnableC0914g(this, intent, context, goAsync(), 1));
        } else {
            o.w().u(f5844a, AbstractC0628i.q("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
