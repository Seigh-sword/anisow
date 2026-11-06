package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends H implements InterfaceC0394c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f6750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6751d;

    public Z() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f6750c = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object s(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L39
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L39
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Z.s(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final boolean b(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) G.a(parcel, Bundle.CREATOR);
        G.d(parcel);
        d(bundle);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0394c0
    public final void d(Bundle bundle) {
        synchronized (this.f6750c) {
            try {
                try {
                    this.f6750c.set(bundle);
                    this.f6751d = true;
                } finally {
                    this.f6750c.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle e(long j6) {
        Bundle bundle;
        synchronized (this.f6750c) {
            if (!this.f6751d) {
                try {
                    this.f6750c.wait(j6);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f6750c.get();
        }
        return bundle;
    }
}
