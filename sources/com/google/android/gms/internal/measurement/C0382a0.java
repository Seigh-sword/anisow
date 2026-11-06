package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import e2.InterfaceC0663a;
import h2.AbstractC0769a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0382a0 extends AbstractC0769a implements Y {
    @Override // com.google.android.gms.internal.measurement.Y
    public final void beginAdUnitExposure(String str, long j6) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j6);
        F(parcelB, 23);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        G.c(parcelB, bundle);
        F(parcelB, 9);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void clearMeasurementEnabled(long j6) {
        Parcel parcelB = b();
        parcelB.writeLong(j6);
        F(parcelB, 43);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void endAdUnitExposure(String str, long j6) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j6);
        F(parcelB, 24);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void generateEventId(InterfaceC0394c0 interfaceC0394c0) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0394c0);
        F(parcelB, 22);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void getCachedAppInstanceId(InterfaceC0394c0 interfaceC0394c0) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0394c0);
        F(parcelB, 19);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void getConditionalUserProperties(String str, String str2, InterfaceC0394c0 interfaceC0394c0) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        G.b(parcelB, interfaceC0394c0);
        F(parcelB, 10);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void getCurrentScreenClass(InterfaceC0394c0 interfaceC0394c0) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0394c0);
        F(parcelB, 17);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void getCurrentScreenName(InterfaceC0394c0 interfaceC0394c0) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0394c0);
        F(parcelB, 16);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void getGmpAppId(InterfaceC0394c0 interfaceC0394c0) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0394c0);
        F(parcelB, 21);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void getMaxUserProperties(String str, InterfaceC0394c0 interfaceC0394c0) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        G.b(parcelB, interfaceC0394c0);
        F(parcelB, 6);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void getUserProperties(String str, String str2, boolean z5, InterfaceC0394c0 interfaceC0394c0) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ClassLoader classLoader = G.f6599a;
        parcelB.writeInt(z5 ? 1 : 0);
        G.b(parcelB, interfaceC0394c0);
        F(parcelB, 5);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void initialize(InterfaceC0663a interfaceC0663a, C0436j0 c0436j0, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        G.c(parcelB, c0436j0);
        parcelB.writeLong(j6);
        F(parcelB, 1);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z6, long j6) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        G.c(parcelB, bundle);
        parcelB.writeInt(z5 ? 1 : 0);
        parcelB.writeInt(z6 ? 1 : 0);
        parcelB.writeLong(j6);
        F(parcelB, 2);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void logHealthData(int i6, String str, InterfaceC0663a interfaceC0663a, InterfaceC0663a interfaceC0663a2, InterfaceC0663a interfaceC0663a3) {
        Parcel parcelB = b();
        parcelB.writeInt(i6);
        parcelB.writeString(str);
        G.b(parcelB, interfaceC0663a);
        G.b(parcelB, interfaceC0663a2);
        G.b(parcelB, interfaceC0663a3);
        F(parcelB, 33);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void onActivityCreated(InterfaceC0663a interfaceC0663a, Bundle bundle, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        G.c(parcelB, bundle);
        parcelB.writeLong(j6);
        F(parcelB, 27);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void onActivityDestroyed(InterfaceC0663a interfaceC0663a, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        parcelB.writeLong(j6);
        F(parcelB, 28);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void onActivityPaused(InterfaceC0663a interfaceC0663a, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        parcelB.writeLong(j6);
        F(parcelB, 29);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void onActivityResumed(InterfaceC0663a interfaceC0663a, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        parcelB.writeLong(j6);
        F(parcelB, 30);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void onActivitySaveInstanceState(InterfaceC0663a interfaceC0663a, InterfaceC0394c0 interfaceC0394c0, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        G.b(parcelB, interfaceC0394c0);
        parcelB.writeLong(j6);
        F(parcelB, 31);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void onActivityStarted(InterfaceC0663a interfaceC0663a, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        parcelB.writeLong(j6);
        F(parcelB, 25);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void onActivityStopped(InterfaceC0663a interfaceC0663a, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        parcelB.writeLong(j6);
        F(parcelB, 26);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void registerOnMeasurementEventListener(InterfaceC0400d0 interfaceC0400d0) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0400d0);
        F(parcelB, 35);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void setConditionalUserProperty(Bundle bundle, long j6) {
        Parcel parcelB = b();
        G.c(parcelB, bundle);
        parcelB.writeLong(j6);
        F(parcelB, 8);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void setCurrentScreen(InterfaceC0663a interfaceC0663a, String str, String str2, long j6) {
        Parcel parcelB = b();
        G.b(parcelB, interfaceC0663a);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeLong(j6);
        F(parcelB, 15);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void setDataCollectionEnabled(boolean z5) {
        Parcel parcelB = b();
        ClassLoader classLoader = G.f6599a;
        parcelB.writeInt(z5 ? 1 : 0);
        F(parcelB, 39);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void setMeasurementEnabled(boolean z5, long j6) {
        Parcel parcelB = b();
        ClassLoader classLoader = G.f6599a;
        parcelB.writeInt(z5 ? 1 : 0);
        parcelB.writeLong(j6);
        F(parcelB, 11);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public final void setUserProperty(String str, String str2, InterfaceC0663a interfaceC0663a, boolean z5, long j6) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        G.b(parcelB, interfaceC0663a);
        parcelB.writeInt(z5 ? 1 : 0);
        parcelB.writeLong(j6);
        F(parcelB, 4);
    }
}
