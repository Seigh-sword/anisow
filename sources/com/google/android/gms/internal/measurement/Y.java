package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import e2.InterfaceC0663a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface Y extends IInterface {
    void beginAdUnitExposure(String str, long j6);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j6);

    void endAdUnitExposure(String str, long j6);

    void generateEventId(InterfaceC0394c0 interfaceC0394c0);

    void getAppInstanceId(InterfaceC0394c0 interfaceC0394c0);

    void getCachedAppInstanceId(InterfaceC0394c0 interfaceC0394c0);

    void getConditionalUserProperties(String str, String str2, InterfaceC0394c0 interfaceC0394c0);

    void getCurrentScreenClass(InterfaceC0394c0 interfaceC0394c0);

    void getCurrentScreenName(InterfaceC0394c0 interfaceC0394c0);

    void getGmpAppId(InterfaceC0394c0 interfaceC0394c0);

    void getMaxUserProperties(String str, InterfaceC0394c0 interfaceC0394c0);

    void getSessionId(InterfaceC0394c0 interfaceC0394c0);

    void getTestFlag(InterfaceC0394c0 interfaceC0394c0, int i6);

    void getUserProperties(String str, String str2, boolean z5, InterfaceC0394c0 interfaceC0394c0);

    void initForTests(Map map);

    void initialize(InterfaceC0663a interfaceC0663a, C0436j0 c0436j0, long j6);

    void isDataCollectionEnabled(InterfaceC0394c0 interfaceC0394c0);

    void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z6, long j6);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0394c0 interfaceC0394c0, long j6);

    void logHealthData(int i6, String str, InterfaceC0663a interfaceC0663a, InterfaceC0663a interfaceC0663a2, InterfaceC0663a interfaceC0663a3);

    void onActivityCreated(InterfaceC0663a interfaceC0663a, Bundle bundle, long j6);

    void onActivityDestroyed(InterfaceC0663a interfaceC0663a, long j6);

    void onActivityPaused(InterfaceC0663a interfaceC0663a, long j6);

    void onActivityResumed(InterfaceC0663a interfaceC0663a, long j6);

    void onActivitySaveInstanceState(InterfaceC0663a interfaceC0663a, InterfaceC0394c0 interfaceC0394c0, long j6);

    void onActivityStarted(InterfaceC0663a interfaceC0663a, long j6);

    void onActivityStopped(InterfaceC0663a interfaceC0663a, long j6);

    void performAction(Bundle bundle, InterfaceC0394c0 interfaceC0394c0, long j6);

    void registerOnMeasurementEventListener(InterfaceC0400d0 interfaceC0400d0);

    void resetAnalyticsData(long j6);

    void setConditionalUserProperty(Bundle bundle, long j6);

    void setConsent(Bundle bundle, long j6);

    void setConsentThirdParty(Bundle bundle, long j6);

    void setCurrentScreen(InterfaceC0663a interfaceC0663a, String str, String str2, long j6);

    void setDataCollectionEnabled(boolean z5);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC0400d0 interfaceC0400d0);

    void setInstanceIdProvider(InterfaceC0424h0 interfaceC0424h0);

    void setMeasurementEnabled(boolean z5, long j6);

    void setMinimumSessionDuration(long j6);

    void setSessionTimeoutDuration(long j6);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j6);

    void setUserProperty(String str, String str2, InterfaceC0663a interfaceC0663a, boolean z5, long j6);

    void unregisterOnMeasurementEventListener(InterfaceC0400d0 interfaceC0400d0);
}
