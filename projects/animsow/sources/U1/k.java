package U1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.X;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class k extends X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3601b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f3601b = eVar;
        this.f3600a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i6 = message.what;
        if (i6 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i6);
            return;
        }
        int i7 = f.f3587a;
        e eVar = this.f3601b;
        Context context = this.f3600a;
        int iB = eVar.b(context, i7);
        AtomicBoolean atomicBoolean = h.f3590a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = eVar.a(iB, context, "n");
            eVar.g(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
