package J3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.Callable;
import n.ExecutorC1138a;
import n3.C1154a;
import q2.InterfaceC1258a;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: J3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1413c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static K f1414d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorC1138a f1416b = new ExecutorC1138a(14);

    public C0055k(Context context) {
        this.f1415a = context;
    }

    public static q2.s a(Context context, Intent intent, boolean z5) {
        K k5;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f1413c) {
            try {
                if (f1414d == null) {
                    f1414d = new K(context);
                }
                k5 = f1414d;
            } finally {
            }
        }
        if (!z5) {
            return k5.b(intent).i(new ExecutorC1138a(16), new C1154a(9));
        }
        if (w.k().n(context)) {
            synchronized (H.f1365b) {
                try {
                    H.a(context);
                    int i6 = 0;
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        H.f1366c.a(H.f1364a);
                    }
                    q2.s sVarB = k5.b(intent);
                    G g4 = new G(i6, intent);
                    sVarB.getClass();
                    sVarB.f12375b.k(new q2.p(q2.k.f12352a, g4));
                    sVarB.p();
                } finally {
                }
            }
        } else {
            k5.b(intent);
        }
        return f2.h.l(-1);
    }

    public final q2.s b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zS = AbstractC1332d.S();
        final Context context = this.f1415a;
        boolean z5 = zS && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z6 = (intent.getFlags() & 268435456) != 0;
        if (z5 && !z6) {
            return a(context, intent, z6);
        }
        Callable callable = new Callable() { // from class: J3.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                String str3;
                int i6;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                w wVarK = w.k();
                wVarK.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((Queue) wVarK.f1444d).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (wVarK) {
                    try {
                        Object obj = wVarK.f1441a;
                        if (((String) obj) != null) {
                            str = (String) obj;
                        } else {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        str3 = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        str3 = serviceInfo.name;
                                    }
                                    wVarK.f1441a = str3;
                                    str = (String) wVarK.f1441a;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (wVarK.n(context2)) {
                        componentNameStartService = H.c(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i6 = 404;
                    } else {
                        i6 = -1;
                    }
                } catch (IllegalStateException e6) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e6);
                    i6 = 402;
                } catch (SecurityException e7) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e7);
                    i6 = 401;
                }
                return Integer.valueOf(i6);
            }
        };
        ExecutorC1138a executorC1138a = this.f1416b;
        return f2.h.f(executorC1138a, callable).j(executorC1138a, new InterfaceC1258a() { // from class: J3.j
            @Override // q2.InterfaceC1258a
            public final Object b(q2.i iVar) {
                if (!AbstractC1332d.S() || ((Integer) iVar.d()).intValue() != 402) {
                    return iVar;
                }
                return C0055k.a(context, intent, z6).i(new ExecutorC1138a(15), new C1154a(8));
            }
        });
    }
}
