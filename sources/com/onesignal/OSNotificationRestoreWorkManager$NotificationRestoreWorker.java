package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class OSNotificationRestoreWorkManager$NotificationRestoreWorker extends Worker {
    public OSNotificationRestoreWorkManager$NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final I0.n g() {
        Context context = AbstractC0603w1.f8028b;
        Context context2 = this.f5824w;
        if (context == null) {
            AbstractC0603w1.B(context2);
        }
        if (!OSUtils.a()) {
            return new I0.k();
        }
        if (N0.f7647c) {
            return new I0.k();
        }
        N0.f7647c = true;
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7991A;
        Cursor cursorJ = null;
        AbstractC0603w1.b(enumC0600v1, "Restoring notifications", null);
        C1 c1C = C1.c(context2);
        StringBuilder sbK = C1.K();
        StatusBarNotification[] statusBarNotificationArrL = AbstractC0571l1.l(context2);
        if (statusBarNotificationArrL.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : statusBarNotificationArrL) {
                arrayList.add(Integer.valueOf(statusBarNotification.getId()));
            }
            sbK.append(" AND android_notification_id NOT IN (");
            sbK.append(TextUtils.join(",", arrayList));
            sbK.append(")");
        }
        AbstractC0603w1.b(enumC0600v1, "Querying DB for notifications to restore: " + sbK.toString(), null);
        try {
            cursorJ = c1C.J("notification", N0.f7645a, sbK.toString(), null, "_id DESC", V.f7714a);
            N0.b(context2, cursorJ, 200);
            AbstractC0571l1.Y(context2);
        } catch (Throwable th) {
            try {
                AbstractC0603w1.b(EnumC0600v1.f7997y, "Error restoring notification records! ", th);
                if (cursorJ != null && !cursorJ.isClosed()) {
                }
            } catch (Throwable th2) {
                if (cursorJ != null && !cursorJ.isClosed()) {
                    cursorJ.close();
                }
                throw th2;
            }
        }
        if (!cursorJ.isClosed()) {
            cursorJ.close();
        }
        return new I0.m(I0.g.f1099c);
    }
}
