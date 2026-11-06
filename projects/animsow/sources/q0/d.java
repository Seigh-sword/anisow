package Q0;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Notification f2786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f2787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f2788z;

    public d(SystemForegroundService systemForegroundService, int i6, Notification notification, int i7) {
        this.f2788z = systemForegroundService;
        this.f2785w = i6;
        this.f2786x = notification;
        this.f2787y = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = Build.VERSION.SDK_INT;
        Notification notification = this.f2786x;
        int i7 = this.f2785w;
        SystemForegroundService systemForegroundService = this.f2788z;
        if (i6 >= 29) {
            systemForegroundService.startForeground(i7, notification, this.f2787y);
        } else {
            systemForegroundService.startForeground(i7, notification);
        }
    }
}
