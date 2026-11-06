package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import d.AbstractC0628i;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractRunnableC0563j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f7515y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ H0 f7516z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(H0 h02, WeakReference weakReference, int i6) {
        super(0);
        this.f7516z = h02;
        this.f7514x = weakReference;
        this.f7515y = i6;
    }

    @Override // com.onesignal.AbstractRunnableC0563j, java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        super.run();
        Context context = (Context) this.f7514x.get();
        if (context == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("android_notification_id = ");
        int i6 = this.f7515y;
        String strL = AbstractC0628i.l(sb, i6, " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        H0 h02 = this.f7516z;
        if (h02.f7572g.M("notification", contentValues, strL, null) > 0) {
            String strF = AbstractC0628i.f("android_notification_id = ", i6);
            C1 c12 = h02.f7572g;
            Cursor cursorU = c12.u("notification", new String[]{"group_id"}, strF, null, null);
            if (cursorU.moveToFirst()) {
                String string = cursorU.getString(cursorU.getColumnIndex("group_id"));
                cursorU.close();
                if (string != null) {
                    try {
                        Cursor cursorA = AbstractC0571l1.A(context, c12, string, true);
                        if (!cursorA.isClosed()) {
                            cursorA.close();
                        }
                    } catch (Throwable th) {
                        AbstractC0603w1.b(EnumC0600v1.f7997y, "Error running updateSummaryNotificationAfterChildRemoved!", th);
                    }
                }
            } else {
                cursorU.close();
            }
        }
        AbstractC0571l1.Y(context);
        ((NotificationManager) context.getSystemService("notification")).cancel(i6);
    }
}
