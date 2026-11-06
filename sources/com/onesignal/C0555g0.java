package com.onesignal;

import android.content.ContentValues;
import java.util.Date;

/* JADX INFO: renamed from: com.onesignal.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0555g0 extends AbstractRunnableC0563j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0585q0 f7814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0579o0 f7815y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555g0(C0579o0 c0579o0, C0585q0 c0585q0) {
        super(0);
        this.f7815y = c0579o0;
        this.f7814x = c0585q0;
    }

    @Override // com.onesignal.AbstractRunnableC0563j, java.lang.Runnable
    public final void run() {
        super.run();
        A0 a02 = this.f7815y.f7910k;
        C0585q0 c0585q0 = this.f7814x;
        synchronized (a02) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", c0585q0.f7951a);
            contentValues.put("display_quantity", Integer.valueOf(c0585q0.f7955e.f7987b));
            contentValues.put("last_display", Long.valueOf(c0585q0.f7955e.f7986a));
            contentValues.put("click_ids", c0585q0.f7954d.toString());
            contentValues.put("displayed_in_session", Boolean.valueOf(c0585q0.f7957g));
            if (a02.f7460a.M("in_app_message", contentValues, "message_id = ?", new String[]{c0585q0.f7951a}) == 0) {
                a02.f7460a.k("in_app_message", contentValues);
            }
        }
        C0579o0 c0579o0 = this.f7815y;
        A0 a03 = c0579o0.f7910k;
        Date date = c0579o0.f7924y;
        a03.getClass();
        String string = date != null ? date.toString() : null;
        String str = E1.f7517a;
        a03.f7462c.getClass();
        E1.g(str, "PREFS_OS_LAST_TIME_IAM_DISMISSED", string);
    }
}
