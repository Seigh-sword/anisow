package D;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import b.AbstractBinderC0327b;
import b.C0326a;
import b.InterfaceC0328c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f180y = new HashMap();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashSet f181z = new HashSet();

    public I(Context context) {
        this.f178w = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f179x = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(D.H r8) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D.I.a(D.H):void");
    }

    public final void b(H h4) {
        Handler handler = this.f179x;
        ComponentName componentName = h4.f173a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i6 = h4.f177e;
        int i7 = i6 + 1;
        h4.f177e = i7;
        if (i7 <= 6) {
            int i8 = (1 << i6) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i8 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i8);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = h4.f176d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(h4.f177e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i6 = message.what;
        InterfaceC0328c interfaceC0328c = null;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        return false;
                    }
                    H h4 = (H) this.f180y.get((ComponentName) message.obj);
                    if (h4 != null) {
                        a(h4);
                    }
                    return true;
                }
                H h6 = (H) this.f180y.get((ComponentName) message.obj);
                if (h6 != null) {
                    if (h6.f174b) {
                        this.f178w.unbindService(this);
                        h6.f174b = false;
                    }
                    h6.f175c = null;
                }
                return true;
            }
            G g4 = (G) message.obj;
            ComponentName componentName = g4.f171a;
            IBinder iBinder = g4.f172b;
            H h7 = (H) this.f180y.get(componentName);
            if (h7 != null) {
                int i7 = AbstractBinderC0327b.f5867c;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0328c.f5868a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0328c)) {
                        C0326a c0326a = new C0326a();
                        c0326a.f5866c = iBinder;
                        interfaceC0328c = c0326a;
                    } else {
                        interfaceC0328c = (InterfaceC0328c) iInterfaceQueryLocalInterface;
                    }
                }
                h7.f175c = interfaceC0328c;
                h7.f177e = 0;
                a(h7);
            }
            return true;
        }
        J j6 = (J) message.obj;
        String string = Settings.Secure.getString(this.f178w.getContentResolver(), "enabled_notification_listeners");
        synchronized (K.f182c) {
            if (string != null) {
                try {
                    if (!string.equals(K.f183d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        K.f184e = hashSet2;
                        K.f183d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = K.f184e;
        }
        if (!hashSet.equals(this.f181z)) {
            this.f181z = hashSet;
            List<ResolveInfo> listQueryIntentServices = this.f178w.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            for (ComponentName componentName3 : hashSet3) {
                if (!this.f180y.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f180y.put(componentName3, new H(componentName3));
                }
            }
            Iterator it = this.f180y.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    H h8 = (H) entry.getValue();
                    if (h8.f174b) {
                        this.f178w.unbindService(this);
                        h8.f174b = false;
                    }
                    h8.f175c = null;
                    it.remove();
                }
            }
        }
        for (H h9 : this.f180y.values()) {
            h9.f176d.add(j6);
            a(h9);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f179x.obtainMessage(1, new G(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f179x.obtainMessage(2, componentName).sendToTarget();
    }
}
