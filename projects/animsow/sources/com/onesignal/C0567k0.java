package com.onesignal;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.onesignal.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0567k0 extends AbstractRunnableC0563j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractC0571l1 f7860y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0567k0(AbstractC0571l1 abstractC0571l1, int i6) {
        super(0);
        this.f7859x = i6;
        this.f7860y = abstractC0571l1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [long] */
    @Override // com.onesignal.AbstractRunnableC0563j, java.lang.Runnable
    public final void run() {
        Cursor cursorU;
        switch (this.f7859x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                super.run();
                synchronized (C0579o0.f7905z) {
                    AbstractC0571l1 abstractC0571l1 = this.f7860y;
                    ((C0579o0) abstractC0571l1).f7918s = ((C0579o0) abstractC0571l1).f7910k.c();
                    C0594t1 c0594t1 = ((C0579o0) this.f7860y).f7906g;
                    String str = "Retrieved IAMs from DB redisplayedInAppMessages: " + ((C0579o0) this.f7860y).f7918s.toString();
                    c0594t1.getClass();
                    C0594t1.d(str);
                    break;
                }
                return;
            case 1:
                super.run();
                A0 a02 = ((C0579o0) this.f7860y).f7910k;
                synchronized (a02) {
                    String[] strArr = {"message_id", "click_ids"};
                    ?? CurrentTimeMillis = (System.currentTimeMillis() / 1000) - 15552000;
                    String[] strArr2 = {String.valueOf((long) CurrentTimeMillis)};
                    Set setQ = OSUtils.q();
                    Set setQ2 = OSUtils.q();
                    ?? r12 = 0;
                    try {
                        try {
                            cursorU = a02.f7460a.u("in_app_message", strArr, "last_display < ?", strArr2, null);
                        } catch (Throwable th) {
                            th = th;
                            r12 = CurrentTimeMillis;
                            if (r12 != 0 && !r12.isClosed()) {
                                r12.close();
                            }
                            throw th;
                        }
                    } catch (JSONException e6) {
                        e = e6;
                        cursorU = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r12 != 0) {
                            r12.close();
                        }
                        throw th;
                    }
                    if (cursorU != null) {
                        try {
                        } catch (JSONException e7) {
                            e = e7;
                            e.printStackTrace();
                            if (cursorU != null && !cursorU.isClosed()) {
                                cursorU.close();
                            }
                        }
                        if (cursorU.getCount() != 0) {
                            if (cursorU.moveToFirst()) {
                                do {
                                    String string = cursorU.getString(cursorU.getColumnIndex("message_id"));
                                    String string2 = cursorU.getString(cursorU.getColumnIndex("click_ids"));
                                    setQ.add(string);
                                    JSONArray jSONArray = new JSONArray(string2);
                                    HashSet hashSet = new HashSet();
                                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                                        hashSet.add(jSONArray.getString(i6));
                                    }
                                    setQ2.addAll(hashSet);
                                } while (cursorU.moveToNext());
                            }
                            if (!cursorU.isClosed()) {
                                cursorU.close();
                            }
                            a02.f7460a.b("in_app_message", "last_display < ?", strArr2);
                            if (setQ != null && setQ.size() > 0) {
                                String str2 = E1.f7517a;
                                Set setF = E1.f("PREFS_OS_DISPLAYED_IAMS", null);
                                Set setF2 = E1.f("PREFS_OS_IMPRESSIONED_IAMS", null);
                                if (setF != null && setF.size() > 0) {
                                    setF.removeAll(setQ);
                                    E1.g(str2, "PREFS_OS_DISPLAYED_IAMS", setF);
                                }
                                if (setF2 != null && setF2.size() > 0) {
                                    setF2.removeAll(setQ);
                                    E1.g(str2, "PREFS_OS_IMPRESSIONED_IAMS", setF2);
                                }
                            }
                            if (setQ2 != null && setQ2.size() > 0) {
                                String str3 = E1.f7517a;
                                Set setF3 = E1.f("PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
                                if (setF3 != null && setF3.size() > 0) {
                                    setF3.removeAll(setQ2);
                                    E1.g(str3, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", setF3);
                                }
                            }
                        }
                    }
                    AbstractC0603w1.b(EnumC0600v1.f7992B, "Attempted to clean 6 month old IAM data, but none exists!", null);
                    if (cursorU != null && !cursorU.isClosed()) {
                        cursorU.close();
                    }
                    break;
                }
                return;
            default:
                super.run();
                AbstractC0603w1.f8056v.getClass();
                ((H0) this.f7860y).f7572g.b("notification", "created_time < ?", new String[]{String.valueOf((System.currentTimeMillis() / 1000) - 604800)});
                return;
        }
    }
}
