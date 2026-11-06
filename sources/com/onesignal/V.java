package com.onesignal;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7714a = Integer.toString(49);

    public static void a(Context context, int i6) {
        StatusBarNotification[] statusBarNotificationArrL = AbstractC0571l1.l(context);
        int length = (statusBarNotificationArrL.length - 49) + i6;
        if (length < 1) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrL) {
            if ((statusBarNotification.getNotification().flags & 512) == 0) {
                treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
            }
        }
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC0603w1.L(((Integer) ((Map.Entry) it.next()).getValue()).intValue());
            length--;
            if (length <= 0) {
                return;
            }
        }
    }
}
