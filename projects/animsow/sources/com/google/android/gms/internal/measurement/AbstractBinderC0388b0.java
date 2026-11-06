package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e2.InterfaceC0663a;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0388b0 extends H implements Y {
    public static Y asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof Y ? (Y) iInterfaceQueryLocalInterface : new C0382a0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final boolean b(int i6, Parcel parcel, Parcel parcel2) {
        boolean z5;
        InterfaceC0394c0 c0406e0 = null;
        InterfaceC0394c0 c0406e02 = null;
        InterfaceC0394c0 c0406e03 = null;
        InterfaceC0394c0 c0406e04 = null;
        InterfaceC0400d0 c0412f0 = null;
        InterfaceC0400d0 c0412f02 = null;
        InterfaceC0400d0 c0412f03 = null;
        InterfaceC0394c0 c0406e05 = null;
        InterfaceC0394c0 c0406e06 = null;
        InterfaceC0394c0 c0406e07 = null;
        InterfaceC0394c0 c0406e08 = null;
        InterfaceC0394c0 c0406e09 = null;
        InterfaceC0394c0 c0406e010 = null;
        InterfaceC0424h0 c0418g0 = null;
        InterfaceC0394c0 c0406e011 = null;
        InterfaceC0394c0 c0406e012 = null;
        InterfaceC0394c0 c0406e013 = null;
        InterfaceC0394c0 c0406e014 = null;
        InterfaceC0394c0 c0406e015 = null;
        switch (i6) {
            case 1:
                InterfaceC0663a interfaceC0663aE = e2.b.e(parcel.readStrongBinder());
                C0436j0 c0436j0 = (C0436j0) G.a(parcel, C0436j0.CREATOR);
                long j6 = parcel.readLong();
                G.d(parcel);
                initialize(interfaceC0663aE, c0436j0, j6);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) G.a(parcel, Bundle.CREATOR);
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                G.d(parcel);
                logEvent(string, string2, bundle, z6, z7, j7);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) G.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e0 = iInterfaceQueryLocalInterface instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface : new C0406e0(strongBinder);
                }
                long j8 = parcel.readLong();
                G.d(parcel);
                logEventAndBundle(string3, string4, bundle2, c0406e0, j8);
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC0663a interfaceC0663aE2 = e2.b.e(parcel.readStrongBinder());
                ClassLoader classLoader = G.f6599a;
                boolean z8 = parcel.readInt() != 0;
                long j9 = parcel.readLong();
                G.d(parcel);
                setUserProperty(string5, string6, interfaceC0663aE2, z8, j9);
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = G.f6599a;
                z5 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e015 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface2 : new C0406e0(strongBinder2);
                }
                G.d(parcel);
                getUserProperties(string7, string8, z5, c0406e015);
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e014 = iInterfaceQueryLocalInterface3 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface3 : new C0406e0(strongBinder3);
                }
                G.d(parcel);
                getMaxUserProperties(string9, c0406e014);
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                String string10 = parcel.readString();
                long j10 = parcel.readLong();
                G.d(parcel);
                setUserId(string10, j10);
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                Bundle bundle3 = (Bundle) G.a(parcel, Bundle.CREATOR);
                long j11 = parcel.readLong();
                G.d(parcel);
                setConditionalUserProperty(bundle3, j11);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) G.a(parcel, Bundle.CREATOR);
                G.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e013 = iInterfaceQueryLocalInterface4 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface4 : new C0406e0(strongBinder4);
                }
                G.d(parcel);
                getConditionalUserProperties(string13, string14, c0406e013);
                break;
            case 11:
                ClassLoader classLoader3 = G.f6599a;
                z5 = parcel.readInt() != 0;
                long j12 = parcel.readLong();
                G.d(parcel);
                setMeasurementEnabled(z5, j12);
                break;
            case 12:
                long j13 = parcel.readLong();
                G.d(parcel);
                resetAnalyticsData(j13);
                break;
            case 13:
                long j14 = parcel.readLong();
                G.d(parcel);
                setMinimumSessionDuration(j14);
                break;
            case 14:
                long j15 = parcel.readLong();
                G.d(parcel);
                setSessionTimeoutDuration(j15);
                break;
            case 15:
                InterfaceC0663a interfaceC0663aE3 = e2.b.e(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j16 = parcel.readLong();
                G.d(parcel);
                setCurrentScreen(interfaceC0663aE3, string15, string16, j16);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e012 = iInterfaceQueryLocalInterface5 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface5 : new C0406e0(strongBinder5);
                }
                G.d(parcel);
                getCurrentScreenName(c0406e012);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e011 = iInterfaceQueryLocalInterface6 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface6 : new C0406e0(strongBinder6);
                }
                G.d(parcel);
                getCurrentScreenClass(c0406e011);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c0418g0 = iInterfaceQueryLocalInterface7 instanceof InterfaceC0424h0 ? (InterfaceC0424h0) iInterfaceQueryLocalInterface7 : new C0418g0(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                G.d(parcel);
                setInstanceIdProvider(c0418g0);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e010 = iInterfaceQueryLocalInterface8 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface8 : new C0406e0(strongBinder8);
                }
                G.d(parcel);
                getCachedAppInstanceId(c0406e010);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e09 = iInterfaceQueryLocalInterface9 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface9 : new C0406e0(strongBinder9);
                }
                G.d(parcel);
                getAppInstanceId(c0406e09);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e08 = iInterfaceQueryLocalInterface10 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface10 : new C0406e0(strongBinder10);
                }
                G.d(parcel);
                getGmpAppId(c0406e08);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e07 = iInterfaceQueryLocalInterface11 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface11 : new C0406e0(strongBinder11);
                }
                G.d(parcel);
                generateEventId(c0406e07);
                break;
            case 23:
                String string17 = parcel.readString();
                long j17 = parcel.readLong();
                G.d(parcel);
                beginAdUnitExposure(string17, j17);
                break;
            case 24:
                String string18 = parcel.readString();
                long j18 = parcel.readLong();
                G.d(parcel);
                endAdUnitExposure(string18, j18);
                break;
            case 25:
                InterfaceC0663a interfaceC0663aE4 = e2.b.e(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                G.d(parcel);
                onActivityStarted(interfaceC0663aE4, j19);
                break;
            case 26:
                InterfaceC0663a interfaceC0663aE5 = e2.b.e(parcel.readStrongBinder());
                long j20 = parcel.readLong();
                G.d(parcel);
                onActivityStopped(interfaceC0663aE5, j20);
                break;
            case 27:
                InterfaceC0663a interfaceC0663aE6 = e2.b.e(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) G.a(parcel, Bundle.CREATOR);
                long j21 = parcel.readLong();
                G.d(parcel);
                onActivityCreated(interfaceC0663aE6, bundle5, j21);
                break;
            case 28:
                InterfaceC0663a interfaceC0663aE7 = e2.b.e(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                G.d(parcel);
                onActivityDestroyed(interfaceC0663aE7, j22);
                break;
            case 29:
                InterfaceC0663a interfaceC0663aE8 = e2.b.e(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                G.d(parcel);
                onActivityPaused(interfaceC0663aE8, j23);
                break;
            case 30:
                InterfaceC0663a interfaceC0663aE9 = e2.b.e(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                G.d(parcel);
                onActivityResumed(interfaceC0663aE9, j24);
                break;
            case 31:
                InterfaceC0663a interfaceC0663aE10 = e2.b.e(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e06 = iInterfaceQueryLocalInterface12 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface12 : new C0406e0(strongBinder12);
                }
                long j25 = parcel.readLong();
                G.d(parcel);
                onActivitySaveInstanceState(interfaceC0663aE10, c0406e06, j25);
                break;
            case 32:
                Bundle bundle6 = (Bundle) G.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e05 = iInterfaceQueryLocalInterface13 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface13 : new C0406e0(strongBinder13);
                }
                long j26 = parcel.readLong();
                G.d(parcel);
                performAction(bundle6, c0406e05, j26);
                break;
            case 33:
                int i7 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC0663a interfaceC0663aE11 = e2.b.e(parcel.readStrongBinder());
                InterfaceC0663a interfaceC0663aE12 = e2.b.e(parcel.readStrongBinder());
                InterfaceC0663a interfaceC0663aE13 = e2.b.e(parcel.readStrongBinder());
                G.d(parcel);
                logHealthData(i7, string19, interfaceC0663aE11, interfaceC0663aE12, interfaceC0663aE13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c0412f03 = iInterfaceQueryLocalInterface14 instanceof InterfaceC0400d0 ? (InterfaceC0400d0) iInterfaceQueryLocalInterface14 : new C0412f0(strongBinder14);
                }
                G.d(parcel);
                setEventInterceptor(c0412f03);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c0412f02 = iInterfaceQueryLocalInterface15 instanceof InterfaceC0400d0 ? (InterfaceC0400d0) iInterfaceQueryLocalInterface15 : new C0412f0(strongBinder15);
                }
                G.d(parcel);
                registerOnMeasurementEventListener(c0412f02);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c0412f0 = iInterfaceQueryLocalInterface16 instanceof InterfaceC0400d0 ? (InterfaceC0400d0) iInterfaceQueryLocalInterface16 : new C0412f0(strongBinder16);
                }
                G.d(parcel);
                unregisterOnMeasurementEventListener(c0412f0);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(G.f6599a);
                G.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e04 = iInterfaceQueryLocalInterface17 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface17 : new C0406e0(strongBinder17);
                }
                int i8 = parcel.readInt();
                G.d(parcel);
                getTestFlag(c0406e04, i8);
                break;
            case 39:
                ClassLoader classLoader4 = G.f6599a;
                z5 = parcel.readInt() != 0;
                G.d(parcel);
                setDataCollectionEnabled(z5);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e03 = iInterfaceQueryLocalInterface18 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface18 : new C0406e0(strongBinder18);
                }
                G.d(parcel);
                isDataCollectionEnabled(c0406e03);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) G.a(parcel, Bundle.CREATOR);
                G.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j27 = parcel.readLong();
                G.d(parcel);
                clearMeasurementEnabled(j27);
                break;
            case 44:
                Bundle bundle8 = (Bundle) G.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                G.d(parcel);
                setConsent(bundle8, j28);
                break;
            case 45:
                Bundle bundle9 = (Bundle) G.a(parcel, Bundle.CREATOR);
                long j29 = parcel.readLong();
                G.d(parcel);
                setConsentThirdParty(bundle9, j29);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0406e02 = iInterfaceQueryLocalInterface19 instanceof InterfaceC0394c0 ? (InterfaceC0394c0) iInterfaceQueryLocalInterface19 : new C0406e0(strongBinder19);
                }
                G.d(parcel);
                getSessionId(c0406e02);
                break;
            case 48:
                Intent intent = (Intent) G.a(parcel, Intent.CREATOR);
                G.d(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
