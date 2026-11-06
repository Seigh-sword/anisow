package com.onesignal;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends AbstractRunnableC0563j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f7544x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ G0 f7545y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ H0 f7546z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(H0 h02, String str, G0 g02) {
        super(0);
        this.f7546z = h02;
        this.f7544x = str;
        this.f7545y = g02;
    }

    @Override // com.onesignal.AbstractRunnableC0563j, java.lang.Runnable
    public final void run() {
        boolean z5;
        super.run();
        String str = this.f7544x;
        H0 h02 = this.f7546z;
        Cursor cursorU = h02.f7572g.u("notification", new String[]{"notification_id"}, "notification_id = ?", new String[]{str}, null);
        boolean zMoveToFirst = cursorU.moveToFirst();
        cursorU.close();
        if (zMoveToFirst) {
            h02.f7573h.getClass();
            C0594t1.d("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + str);
            z5 = true;
        } else {
            z5 = false;
        }
        this.f7545y.a(z5);
    }
}
