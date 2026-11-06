package W1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class I extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.c f4249b;

    public I(com.bumptech.glide.c cVar) {
        this.f4249b = cVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f4248a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f4248a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f4249b.R();
            a();
        }
    }
}
