package W1;

import X1.AbstractC0242j;
import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4263x;

    public /* synthetic */ P(int i6, Object obj) {
        this.f4262w = i6;
        this.f4263x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f4262w;
        Object obj = this.f4263x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((Q) obj).f4271i.b(new U1.b(4));
                break;
            case 1:
                C0226u c0226u = (C0226u) obj;
                U1.f fVar = c0226u.f4353d;
                Context context = c0226u.f4352c;
                fVar.getClass();
                if (!U1.h.f3590a.getAndSet(true)) {
                    try {
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                        }
                    } catch (SecurityException e6) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e6);
                        return;
                    }
                    break;
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((E) obj).g();
                break;
            default:
                AbstractC0242j abstractC0242j = ((E) ((C0215i) obj).f4318a).f4229d;
                abstractC0242j.i(abstractC0242j.getClass().getName().concat(" disconnecting because it was signed out."));
                break;
        }
    }
}
