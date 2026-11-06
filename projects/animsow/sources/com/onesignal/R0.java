package com.onesignal;

import a3.C0261b;
import android.database.Cursor;
import b3.C0343c;
import d4.C0657b;
import d4.C0658c;
import java.util.ArrayList;
import java.util.Locale;
import m2.C1017B;
import org.json.JSONException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0584q f7691x;

    public /* synthetic */ R0(C0584q c0584q, int i6) {
        this.f7690w = i6;
        this.f7691x = c0584q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<C0657b> arrayList;
        Cursor cursor = null;
        switch (this.f7690w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Thread.currentThread().setPriority(10);
                C0343c c0343c = ((J3.w) this.f7691x.f7949x).l().f6239b;
                synchronized (c0343c) {
                    StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM notification n WHERE n.notification_id = channel_influence_id AND channel_type = \"");
                    Locale locale = Locale.ROOT;
                    AbstractC1305a.n(locale, "Locale.ROOT");
                    String lowerCase = "notification".toLowerCase(locale);
                    AbstractC1305a.n(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    sb.append(lowerCase);
                    sb.append("\")");
                    ((C1) ((B1) c0343c.f5931x)).b("cached_unique_outcome", sb.toString(), null);
                }
                return;
            default:
                Thread.currentThread().setPriority(10);
                C0343c c0343c2 = ((J3.w) this.f7691x.f7949x).l().f6239b;
                synchronized (c0343c2) {
                    arrayList = new ArrayList();
                    try {
                        Cursor cursorU = ((C1) ((B1) c0343c2.f5931x)).u("outcome", null, null, null, null);
                        try {
                            if (cursorU.moveToFirst()) {
                                do {
                                    a4.c cVarO = C1017B.o(cursorU.getString(cursorU.getColumnIndex("notification_influence_type")));
                                    a4.c cVarO2 = C1017B.o(cursorU.getString(cursorU.getColumnIndex("iam_influence_type")));
                                    String string = cursorU.getString(cursorU.getColumnIndex("notification_ids"));
                                    if (string == null) {
                                        string = "[]";
                                    }
                                    String string2 = cursorU.getString(cursorU.getColumnIndex("iam_ids"));
                                    if (string2 == null) {
                                        string2 = "[]";
                                    }
                                    String string3 = cursorU.getString(cursorU.getColumnIndex("name"));
                                    float f6 = cursorU.getFloat(cursorU.getColumnIndex("weight"));
                                    long j6 = cursorU.getLong(cursorU.getColumnIndex("timestamp"));
                                    try {
                                        C0261b c0261b = new C0261b();
                                        C0261b c0261b2 = new C0261b();
                                        C0658c c0658cN = C0343c.n(cVarO, c0261b, c0261b2, string);
                                        C0343c.m(cVarO2, c0261b, c0261b2, string2, c0658cN);
                                        if (c0658cN == null) {
                                            c0658cN = new C0658c(null, null);
                                        }
                                        C0658c c0658c = c0658cN;
                                        AbstractC1305a.n(string3, "name");
                                        arrayList.add(new C0657b(string3, c0658c, f6, j6));
                                    } catch (JSONException e6) {
                                        ((C0594t1) c0343c2.f5930w).getClass();
                                        C0594t1.f("Generating JSONArray from notifications ids outcome:JSON Failed.", e6);
                                    }
                                } while (cursorU.moveToNext());
                            }
                            if (!cursorU.isClosed()) {
                                cursorU.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorU;
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                for (C0657b c0657b : arrayList) {
                    C0584q c0584q = this.f7691x;
                    c0584q.getClass();
                    int iB = OSUtils.b();
                    ((J3.w) c0584q.f7949x).l().a(AbstractC0603w1.f8032d, iB, c0657b, new X1(c0584q, 10, c0657b));
                }
                return;
        }
    }
}
