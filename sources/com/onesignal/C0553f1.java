package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: com.onesignal.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0553f1 extends C0550e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f7809f = new HashSet(Arrays.asList("getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f7810e;

    public C0553f1(C c6, C0594t1 c0594t1) {
        super(c0594t1);
        this.f7810e = c6;
    }

    public final boolean d(String str) {
        return ((G1) this.f7810e.f7497b) == null && f7809f.contains(str);
    }
}
