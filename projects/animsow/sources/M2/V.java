package m2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import w1.RunnableC1473q;

/* JADX INFO: loaded from: classes.dex */
public final class V extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f10781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10783c;

    public V(x1 x1Var) {
        this.f10781a = x1Var;
    }

    public final void a() {
        x1 x1Var = this.f10781a;
        x1Var.c0();
        x1Var.g().r();
        x1Var.g().r();
        if (this.f10782b) {
            x1Var.f().f10723J.d("Unregistering connectivity change receiver");
            this.f10782b = false;
            this.f10783c = false;
            try {
                x1Var.f11248H.f11009w.unregisterReceiver(this);
            } catch (IllegalArgumentException e6) {
                x1Var.f().f10715B.c(e6, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        x1 x1Var = this.f10781a;
        x1Var.c0();
        String action = intent.getAction();
        x1Var.f().f10723J.c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            x1Var.f().f10718E.c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        Q q5 = x1Var.f11271x;
        x1.x(q5);
        boolean zA = q5.A();
        if (this.f10783c != zA) {
            this.f10783c = zA;
            x1Var.g().A(new RunnableC1473q(2, this, zA));
        }
    }
}
