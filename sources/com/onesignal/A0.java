package com.onesignal;

import android.database.Cursor;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1 f7460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0594t1 f7461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0594t1 f7462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7463d = 0;

    public A0(C1 c12, C0594t1 c0594t1, C0594t1 c0594t12) {
        this.f7460a = c12;
        this.f7461b = c0594t1;
        this.f7462c = c0594t12;
    }

    public static void a(A0 a02, String str, String str2) {
        a02.getClass();
        a02.f7461b.getClass();
        C0594t1.d("Successful post for in-app message " + str + " request: " + str2);
    }

    public static void b(A0 a02, String str, int i6, String str2) {
        a02.getClass();
        StringBuilder sb = new StringBuilder("Encountered a ");
        sb.append(i6);
        sb.append(" error while attempting in-app message ");
        sb.append(str);
        String strM = AbstractC0628i.m(sb, " request: ", str2);
        a02.f7461b.getClass();
        C0594t1.e(strM);
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorU = null;
        try {
            try {
                cursorU = this.f7460a.u("in_app_message", null, null, null, null);
                if (cursorU.moveToFirst()) {
                    do {
                        String string = cursorU.getString(cursorU.getColumnIndex("message_id"));
                        String string2 = cursorU.getString(cursorU.getColumnIndex("click_ids"));
                        int i6 = cursorU.getInt(cursorU.getColumnIndex("display_quantity"));
                        long j6 = cursorU.getLong(cursorU.getColumnIndex("last_display"));
                        boolean z5 = cursorU.getInt(cursorU.getColumnIndex("displayed_in_session")) == 1;
                        JSONArray jSONArray = new JSONArray(string2);
                        HashSet hashSet = new HashSet();
                        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                            hashSet.add(jSONArray.getString(i7));
                        }
                        C0599v0 c0599v0 = new C0599v0();
                        c0599v0.f7988c = 1;
                        c0599v0.f7989d = 0L;
                        c0599v0.f7990e = false;
                        c0599v0.f7987b = i6;
                        c0599v0.f7986a = j6;
                        C0585q0 c0585q0 = new C0585q0();
                        c0585q0.f7951a = string;
                        c0585q0.f7958h = false;
                        c0585q0.f7954d = hashSet;
                        c0585q0.f7957g = z5;
                        c0585q0.f7955e = c0599v0;
                        arrayList.add(c0585q0);
                    } while (cursorU.moveToNext());
                }
            } catch (Throwable th) {
                if (0 != 0 && !cursorU.isClosed()) {
                    cursorU.close();
                }
                throw th;
            }
        } catch (JSONException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "Generating JSONArray from iam click ids:JSON Failed.", e6);
            if (cursorU != null && !cursorU.isClosed()) {
            }
        }
        if (!cursorU.isClosed()) {
            cursorU.close();
        }
        return arrayList;
    }
}
