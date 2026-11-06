package com.onesignal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 implements ServiceConnection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Z1 f7741w;

    public Y1(Z1 z12) {
        this.f7741w = z12;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Method method;
        Z1 z12 = this.f7741w;
        try {
            Method[] methods = Class.forName("com.android.vending.billing.IInAppBillingService$Stub").getMethods();
            int length = methods.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    method = null;
                    break;
                }
                method = methods[i6];
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                    break;
                } else {
                    i6++;
                }
            }
            method.setAccessible(true);
            z12.f7750b = method.invoke(null, iBinder);
            if (z12.f7756h) {
                return;
            }
            new Thread(new D(6, z12)).start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Z1.f7747i = -99;
        this.f7741w.f7750b = null;
    }
}
