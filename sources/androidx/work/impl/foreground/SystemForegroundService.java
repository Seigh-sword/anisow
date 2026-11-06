package androidx.work.impl.foreground;

import I0.o;
import J0.k;
import K.a;
import Q0.b;
import Q0.c;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0324y;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0324y implements b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f5853B = o.y("SystemFgService");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public NotificationManager f5854A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f5855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c f5857z;

    public final void a() {
        this.f5855x = new Handler(Looper.getMainLooper());
        this.f5854A = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f5857z = cVar;
        if (cVar.f2780E == null) {
            cVar.f2780E = this;
        } else {
            o.w().v(c.f2775F, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0324y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0324y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5857z.g();
    }

    @Override // androidx.lifecycle.AbstractServiceC0324y, android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i7) {
        super.onStartCommand(intent, i6, i7);
        boolean z5 = this.f5856y;
        String str = f5853B;
        int i8 = 0;
        if (z5) {
            o.w().x(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5857z.g();
            a();
            this.f5856y = false;
        }
        if (intent == null) {
            return 3;
        }
        c cVar = this.f5857z;
        cVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = c.f2775F;
        k kVar = cVar.f2781w;
        if (zEquals) {
            o.w().x(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            cVar.f2782x.p(new a(cVar, kVar.f1208j, intent.getStringExtra("KEY_WORKSPEC_ID"), 6));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                o.w().x(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                    return 3;
                }
                UUID uuidFromString = UUID.fromString(stringExtra);
                kVar.getClass();
                kVar.f1209k.p(new S0.a(kVar, uuidFromString, i8));
                return 3;
            }
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            o.w().x(str2, "Stopping foreground service", new Throwable[0]);
            b bVar = cVar.f2780E;
            if (bVar == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
            systemForegroundService.f5856y = true;
            o.w().u(str, "All commands completed.", new Throwable[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        cVar.f(intent);
        return 3;
    }
}
