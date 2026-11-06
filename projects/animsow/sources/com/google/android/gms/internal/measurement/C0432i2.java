package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import s.C1280b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0432i2 implements V2.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Context f6836w;

    @Override // V2.e
    public final Object get() {
        V2.c cVarD;
        Context contextCreateDeviceProtectedStorageContext = this.f6836w;
        V2.c cVar = AbstractC0408e2.f6790a;
        if (cVar == null) {
            synchronized (AbstractC0408e2.class) {
                try {
                    cVar = AbstractC0408e2.f6790a;
                    if (cVar == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        C1280b c1280b = AbstractC0426h2.f6834a;
                        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                            if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                            }
                            cVarD = J2.d(contextCreateDeviceProtectedStorageContext);
                        } else {
                            cVarD = V2.a.f3732w;
                        }
                        AbstractC0408e2.f6790a = cVarD;
                        cVar = cVarD;
                    }
                } finally {
                }
            }
        }
        return cVar;
    }
}
