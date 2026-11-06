package com.onesignal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import p.BinderC1230a;

/* JADX INFO: loaded from: classes.dex */
public final class A1 implements ServiceConnection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f7464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f7465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7466y;

    @Override // android.content.ServiceConnection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.e eVar;
        p.b bVar;
        Parcel parcelObtain;
        a.c cVar;
        Parcel parcelObtain2;
        Parcel parcelObtain3;
        if (this.f7464w == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i6 = a.d.f4980c;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a.e)) {
                a.c cVar2 = new a.c();
                cVar2.f4979c = iBinder;
                eVar = cVar2;
            } else {
                eVar = (a.e) iInterfaceQueryLocalInterface;
            }
        }
        try {
            cVar = (a.c) eVar;
            cVar.getClass();
            parcelObtain2 = Parcel.obtain();
            parcelObtain3 = Parcel.obtain();
        } catch (RemoteException unused) {
        }
        try {
            parcelObtain2.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain2.writeLong(0L);
            cVar.f4979c.transact(2, parcelObtain2, parcelObtain3, 0);
            parcelObtain3.readException();
            parcelObtain3.readInt();
            parcelObtain3.recycle();
            parcelObtain2.recycle();
            BinderC1230a binderC1230a = new BinderC1230a();
            binderC1230a.attachInterface(binderC1230a, "android.support.customtabs.ICustomTabsCallback");
            new Handler(Looper.getMainLooper());
            try {
                a.c cVar3 = (a.c) eVar;
                cVar3.getClass();
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain = Parcel.obtain();
                try {
                    parcelObtain4.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain4.writeStrongBinder(binderC1230a);
                    if (!cVar3.f4979c.transact(3, parcelObtain4, parcelObtain, 0)) {
                        int i7 = a.d.f4980c;
                    }
                    parcelObtain.readException();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
            if (parcelObtain.readInt() != 0) {
                bVar = new p.b();
                bVar.f12205a = new Object();
                bVar.f12206b = eVar;
                bVar.f12207c = binderC1230a;
                bVar.f12208d = componentName;
                bVar.f12209e = null;
            } else {
                bVar = null;
            }
            if (bVar == null) {
                return;
            }
            Uri uri = Uri.parse(this.f7465x);
            Bundle bundle = new Bundle();
            PendingIntent pendingIntent = (PendingIntent) bVar.f12209e;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            try {
                a.e eVar2 = (a.e) bVar.f12206b;
                a.b bVar2 = (a.b) bVar.f12207c;
                a.c cVar4 = (a.c) eVar2;
                cVar4.getClass();
                Parcel parcelObtain5 = Parcel.obtain();
                Parcel parcelObtain6 = Parcel.obtain();
                try {
                    parcelObtain5.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain5.writeStrongBinder(bVar2 != null ? bVar2.asBinder() : null);
                    if (uri != null) {
                        parcelObtain5.writeInt(1);
                        uri.writeToParcel(parcelObtain5, 0);
                    } else {
                        parcelObtain5.writeInt(0);
                    }
                    parcelObtain5.writeInt(1);
                    bundle.writeToParcel(parcelObtain5, 0);
                    parcelObtain5.writeTypedList(null);
                    if (!cVar4.f4979c.transact(4, parcelObtain5, parcelObtain6, 0)) {
                        int i8 = a.d.f4980c;
                    }
                    parcelObtain6.readException();
                    parcelObtain6.readInt();
                    parcelObtain6.recycle();
                    parcelObtain5.recycle();
                } catch (Throwable th) {
                    throw th;
                }
            } catch (RemoteException unused3) {
            }
            if (this.f7466y) {
                Intent intent = new Intent("android.intent.action.VIEW");
                J3.w wVar = new J3.w(1);
                intent.setPackage(((ComponentName) bVar.f12208d).getPackageName());
                IBinder iBinderAsBinder = ((a.b) bVar.f12207c).asBinder();
                PendingIntent pendingIntent2 = (PendingIntent) bVar.f12209e;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("android.support.customtabs.extra.SESSION", iBinderAsBinder);
                if (pendingIntent2 != null) {
                    bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent2);
                }
                intent.putExtras(bundle2);
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle3);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                Integer num = (Integer) wVar.f1441a;
                Integer num2 = (Integer) wVar.f1442b;
                Integer num3 = (Integer) wVar.f1443c;
                Integer num4 = (Integer) wVar.f1444d;
                Bundle bundle4 = new Bundle();
                if (num != null) {
                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
                }
                if (num2 != null) {
                    bundle4.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
                }
                if (num3 != null) {
                    bundle4.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
                }
                if (num4 != null) {
                    bundle4.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
                }
                intent.putExtras(bundle4);
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                intent.setData(uri);
                intent.addFlags(268435456);
                AbstractC0603w1.f8028b.startActivity(intent, null);
            }
        } finally {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
