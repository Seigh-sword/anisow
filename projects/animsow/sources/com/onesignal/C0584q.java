package com.onesignal;

import a3.C0261b;
import a4.C0263a;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import c4.AbstractC0377b;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d4.C0657b;
import d4.C0658c;
import h1.C0764d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: com.onesignal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0584q implements InterfaceC0611z0, n2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f7948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f7949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f7950y;

    public C0584q(Context context) {
        AbstractC1305a.o(context, "context");
        this.f7950y = context;
        this.f7948w = NotificationOpenedReceiver.class;
        this.f7949x = NotificationOpenedReceiverAndroid22AndOlder.class;
    }

    @Override // com.onesignal.InterfaceC0611z0, com.onesignal.InterfaceC0609y1
    public final void a(String str) {
    }

    @Override // com.onesignal.n2
    public final void b() {
        p2.f7937l = null;
        p2.g((Activity) this.f7948w, (C0552f0) this.f7950y, (C0585q0) this.f7949x);
    }

    public final void c() {
        AbstractC0603w1.f8056v.getClass();
        this.f7948w = Long.valueOf(SystemClock.elapsedRealtime());
        C0594t1 c0594t1 = (C0594t1) this.f7950y;
        String str = "Application foregrounded focus time: " + ((Long) this.f7948w);
        c0594t1.getClass();
        C0594t1.d(str);
    }

    @Override // com.onesignal.InterfaceC0611z0
    public final void d(String str) {
        ((C0579o0) this.f7950y).f7916q.remove((String) this.f7948w);
        C0585q0 c0585q0 = (C0585q0) this.f7949x;
        c0585q0.f7954d.remove((String) this.f7948w);
    }

    public final void e(int i6, String str) {
        boolean zO;
        C0263a c0263aC;
        C0594t1 c0594t1 = (C0594t1) this.f7950y;
        String strConcat = "OneSignal SessionManager attemptSessionUpgrade with entryAction: ".concat(H1.a.y(i6));
        c0594t1.getClass();
        C0594t1.d(strConcat);
        C0261b c0261b = (C0261b) this.f7948w;
        c0261b.getClass();
        AbstractC0628i.o(i6, "entryAction");
        Z3.a aVarI = u.h.a(i6, 1) ? c0261b.i() : null;
        ArrayList<Z3.a> arrayListE = ((C0261b) this.f7948w).e(i6);
        ArrayList arrayList = new ArrayList();
        if (aVarI != null) {
            c0263aC = aVarI.c();
            a4.c cVar = a4.c.f5024w;
            if (str == null) {
                str = aVarI.f4960c;
            }
            zO = o(aVarI, cVar, str, null);
        } else {
            zO = false;
            c0263aC = null;
        }
        if (zO) {
            c0594t1.getClass();
            C0594t1.d("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + arrayListE);
            arrayList.add(c0263aC);
            for (Z3.a aVar : arrayListE) {
                if (aVar.f4958a.b()) {
                    arrayList.add(aVar.c());
                    aVar.h();
                }
            }
        }
        c0594t1.getClass();
        C0594t1.d("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (Z3.a aVar2 : arrayListE) {
            a4.c cVar2 = aVar2.f4958a;
            cVar2.getClass();
            if (cVar2 == a4.c.f5026y) {
                JSONArray jSONArrayF = aVar2.f();
                if (jSONArrayF.length() > 0 && !u.h.a(i6, 3)) {
                    C0263a c0263aC2 = aVar2.c();
                    if (o(aVar2, a4.c.f5025x, null, jSONArrayF)) {
                        arrayList.add(c0263aC2);
                    }
                }
            }
        }
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        StringBuilder sb = new StringBuilder("Trackers after update attempt: ");
        C0261b c0261b2 = (C0261b) this.f7948w;
        c0261b2.getClass();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c0261b2.i());
        arrayList2.add(c0261b2.g());
        sb.append(arrayList2.toString());
        AbstractC0603w1.b(enumC0600v1, sb.toString(), null);
        n(arrayList);
    }

    public final List f() {
        Collection collectionValues = ((ConcurrentHashMap) ((C0261b) this.f7948w).f5011x).values();
        AbstractC1305a.n(collectionValues, "trackers.values");
        Collection collection = collectionValues;
        ArrayList arrayList = new ArrayList(t4.k.W(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Z3.a) it.next()).c());
        }
        return arrayList;
    }

    public final PendingIntent g(Intent intent, int i6) {
        AbstractC1305a.o(intent, "oneSignalIntent");
        return PendingIntent.getActivity((Context) this.f7950y, i6, intent, 201326592);
    }

    public final Intent h(int i6) {
        Intent intentAddFlags = new Intent((Context) this.f7950y, (Class<?>) this.f7948w).putExtra("androidNotificationId", i6).addFlags(603979776);
        AbstractC1305a.n(intentAddFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return intentAddFlags;
    }

    public final Long i() {
        if (((Long) this.f7948w) == null) {
            return null;
        }
        AbstractC0603w1.f8056v.getClass();
        long jElapsedRealtime = (long) (((SystemClock.elapsedRealtime() - ((Long) this.f7948w).longValue()) / 1000.0d) + 0.5d);
        if (jElapsedRealtime < 1 || jElapsedRealtime > 86400) {
            return null;
        }
        return Long.valueOf(jElapsedRealtime);
    }

    public final void j(int i6) {
        C0579o0 c0579o0 = (C0579o0) this.f7950y;
        c0579o0.f7919t = null;
        C0594t1 c0594t1 = c0579o0.f7906g;
        String strConcat = "IAM prompt to handle finished with result: ".concat(H1.a.z(i6));
        c0594t1.getClass();
        C0594t1.d(strConcat);
        C0585q0 c0585q0 = (C0585q0) this.f7948w;
        boolean z5 = c0585q0.f7961k;
        Object obj = this.f7949x;
        if (!z5 || i6 != 3) {
            c0579o0.q0(c0585q0, (List) obj);
            return;
        }
        c0579o0.getClass();
        String string = AbstractC0603w1.f8028b.getString(R.string.location_permission_missing_title);
        new AlertDialog.Builder(AbstractC0603w1.j()).setTitle(string).setMessage(AbstractC0603w1.f8028b.getString(R.string.location_permission_missing_message)).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC0573m0(c0579o0, c0585q0, (List) obj)).show();
    }

    public final void k(String str) {
        ((C0594t1) this.f7950y).getClass();
        C0594t1.d("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        Z3.a aVarG = ((C0261b) this.f7948w).g();
        aVarG.i(str);
        aVarG.h();
    }

    public final void l() {
        AbstractC0377b abstractC0377bL = ((J3.w) this.f7949x).l();
        Set set = (Set) this.f7948w;
        AbstractC1305a.o(set, "unattributedUniqueOutcomeEvents");
        abstractC0377bL.f6238a.getClass();
        C0594t1.d("OneSignal save unattributedUniqueOutcomeEvents: " + set);
        ((C0594t1) abstractC0377bL.f6239b.f5932y).getClass();
        E1.g(E1.f7517a, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    public final void m(String str, float f6, ArrayList arrayList) {
        AbstractC0603w1.f8056v.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int iB = OSUtils.b();
        String str2 = AbstractC0603w1.f8032d;
        Iterator it = arrayList.iterator();
        boolean z5 = false;
        C0261b c0261b = null;
        C0261b c0261b2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            EnumC0600v1 enumC0600v1 = EnumC0600v1.f7993C;
            if (!zHasNext) {
                if (c0261b == null && c0261b2 == null && !z5) {
                    AbstractC0603w1.b(enumC0600v1, "Outcomes disabled for all channels", null);
                    return;
                }
                C0657b c0657b = new C0657b(str, new C0658c(c0261b, c0261b2), f6, 0L);
                C0764d c0764d = new C0764d();
                c0764d.f8951x = this;
                c0764d.f8953z = c0657b;
                c0764d.f8949A = null;
                c0764d.f8950w = jCurrentTimeMillis;
                c0764d.f8952y = str;
                ((J3.w) this.f7949x).l().a(str2, iB, c0657b, c0764d);
                return;
            }
            C0263a c0263a = (C0263a) it.next();
            int iOrdinal = c0263a.f5016a.ordinal();
            if (iOrdinal == 0) {
                if (c0261b == null) {
                    c0261b = new C0261b(13);
                }
                int iOrdinal2 = c0263a.f5017b.ordinal();
                if (iOrdinal2 == 0) {
                    c0261b.f5012y = c0263a.f5018c;
                } else if (iOrdinal2 == 1) {
                    c0261b.f5011x = c0263a.f5018c;
                }
            } else if (iOrdinal == 1) {
                if (c0261b2 == null) {
                    c0261b2 = new C0261b(13);
                }
                int iOrdinal3 = c0263a.f5017b.ordinal();
                if (iOrdinal3 == 0) {
                    c0261b2.f5012y = c0263a.f5018c;
                } else if (iOrdinal3 == 1) {
                    c0261b2.f5011x = c0263a.f5018c;
                }
            } else if (iOrdinal == 2) {
                z5 = true;
            } else if (iOrdinal == 3) {
                AbstractC0603w1.b(enumC0600v1, "Outcomes disabled for channel: " + c0263a.f5017b, null);
                return;
            }
        }
    }

    public final void n(ArrayList arrayList) {
        ((C0594t1) this.f7950y).getClass();
        C0594t1.d("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + arrayList);
        if (arrayList.size() > 0) {
            new Thread(new RunnableC0570l0(this, 1, arrayList), "OS_END_CURRENT_SESSION").start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(Z3.a r8, a4.c r9, java.lang.String r10, org.json.JSONArray r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C0584q.o(Z3.a, a4.c, java.lang.String, org.json.JSONArray):boolean");
    }

    public C0584q(C0584q c0584q, J3.w wVar) {
        this.f7950y = c0584q;
        this.f7949x = wVar;
        this.f7948w = OSUtils.q();
        AbstractC0377b abstractC0377bL = wVar.l();
        ((C0594t1) abstractC0377bL.f6239b.f5932y).getClass();
        Set setF = E1.f("PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
        abstractC0377bL.f6238a.getClass();
        C0594t1.d("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: " + setF);
        if (setF != null) {
            this.f7948w = setF;
        }
    }

    public /* synthetic */ C0584q(C0579o0 c0579o0, Object obj, Object obj2) {
        this.f7950y = c0579o0;
        this.f7948w = obj;
        this.f7949x = obj2;
    }
}
