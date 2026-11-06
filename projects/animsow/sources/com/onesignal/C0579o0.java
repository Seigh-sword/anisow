package com.onesignal;

import a3.C0261b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b4.C0344a;
import d.AbstractC0628i;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0579o0 extends AbstractC0571l1 implements InterfaceC0537a0, InterfaceC0541b1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0564j0 f7904A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object f7905z = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0594t1 f7906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0550e1 f7907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0344a f7908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0544c1 f7909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A0 f7910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final X1 f7911l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f7913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f7914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f7915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f7916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f7917r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Date f7924y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f7918s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC0590s0 f7919t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7920u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f7921v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0552f0 f7922w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7923x = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f7912m = new ArrayList();

    static {
        C0564j0 c0564j0 = new C0564j0();
        c0564j0.add("android");
        c0564j0.add("app");
        c0564j0.add("all");
        f7904A = c0564j0;
    }

    public C0579o0(C1 c12, C0550e1 c0550e1, C0594t1 c0594t1, C0594t1 c0594t12, C0344a c0344a) {
        Date date = null;
        this.f7924y = null;
        this.f7907h = c0550e1;
        Set setQ = OSUtils.q();
        this.f7913n = setQ;
        this.f7917r = new ArrayList();
        Set setQ2 = OSUtils.q();
        this.f7914o = setQ2;
        Set setQ3 = OSUtils.q();
        this.f7915p = setQ3;
        Set setQ4 = OSUtils.q();
        this.f7916q = setQ4;
        this.f7911l = new X1(this);
        this.f7909j = new C0544c1(this);
        this.f7908i = c0344a;
        this.f7906g = c0594t1;
        if (this.f7910k == null) {
            this.f7910k = new A0(c12, c0594t1, c0594t12);
        }
        A0 a02 = this.f7910k;
        this.f7910k = a02;
        a02.getClass();
        String str = E1.f7517a;
        a02.f7462c.getClass();
        Set setF = E1.f("PREFS_OS_DISPLAYED_IAMS", null);
        if (setF != null) {
            setQ.addAll(setF);
        }
        A0 a03 = this.f7910k;
        a03.getClass();
        a03.f7462c.getClass();
        Set setF2 = E1.f("PREFS_OS_IMPRESSIONED_IAMS", null);
        if (setF2 != null) {
            setQ2.addAll(setF2);
        }
        A0 a04 = this.f7910k;
        a04.getClass();
        a04.f7462c.getClass();
        Set setF3 = E1.f("PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
        if (setF3 != null) {
            setQ3.addAll(setF3);
        }
        A0 a05 = this.f7910k;
        a05.getClass();
        a05.f7462c.getClass();
        Set setF4 = E1.f("PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
        if (setF4 != null) {
            setQ4.addAll(setF4);
        }
        A0 a06 = this.f7910k;
        a06.getClass();
        a06.f7462c.getClass();
        String strE = E1.e(str, "PREFS_OS_LAST_TIME_IAM_DISMISSED", null);
        if (strE != null) {
            try {
                date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(strE);
            } catch (ParseException e6) {
                AbstractC0603w1.b(EnumC0600v1.f7997y, e6.getLocalizedMessage(), null);
            }
        }
        if (date != null) {
            this.f7924y = date;
        }
        h0();
    }

    public static C0552f0 Z(C0579o0 c0579o0, JSONObject jSONObject, C0585q0 c0585q0) {
        c0579o0.getClass();
        C0552f0 c0552f0 = new C0552f0();
        c0552f0.f7803b = true;
        c0552f0.f7804c = true;
        c0552f0.f7802a = jSONObject.optString("html");
        double dOptDouble = jSONObject.optDouble("display_duration");
        c0552f0.f7807f = Double.valueOf(dOptDouble);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("styles");
        boolean zOptBoolean = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("remove_height_margin", false) : false;
        c0552f0.f7803b = !zOptBoolean;
        c0552f0.f7804c = !(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("remove_width_margin", false) : false);
        c0552f0.f7805d = zOptBoolean;
        c0585q0.f7956f = dOptDouble;
        return c0552f0;
    }

    public static void g0(C0549e0 c0549e0) {
        String str = c0549e0.f7793c;
        if (str == null || str.isEmpty()) {
            return;
        }
        String str2 = c0549e0.f7793c;
        int i6 = c0549e0.f7792b;
        if (i6 == 2) {
            AbstractC0603w1.f8028b.startActivity(OSUtils.r(Uri.parse(str2.trim())));
            return;
        }
        if (i6 == 1) {
            A1 a12 = new A1();
            a12.f7465x = str2;
            a12.f7466y = true;
            Context context = AbstractC0603w1.f8028b;
            a12.f7464w = context.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty("com.android.chrome")) {
                intent.setPackage("com.android.chrome");
            }
            context.bindService(intent, a12, 33);
        }
    }

    @Override // com.onesignal.InterfaceC0537a0
    public void a() {
        this.f7906g.getClass();
        C0594t1.d("messageTriggerConditionChanged called");
        f0();
    }

    public final void a0() {
        synchronized (this.f7917r) {
            try {
                if (!this.f7909j.b()) {
                    this.f7906g.getClass();
                    C0594t1.i("In app message not showing due to system condition not correct");
                    return;
                }
                C0594t1 c0594t1 = this.f7906g;
                String str = "displayFirstIAMOnQueue: " + this.f7917r;
                c0594t1.getClass();
                C0594t1.d(str);
                if (this.f7917r.size() > 0 && !i0()) {
                    this.f7906g.getClass();
                    C0594t1.d("No IAM showing currently, showing first item in the queue!");
                    d0((C0585q0) this.f7917r.get(0));
                } else {
                    C0594t1 c0594t12 = this.f7906g;
                    String str2 = "In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + i0();
                    c0594t12.getClass();
                    C0594t1.d(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b0(C0585q0 c0585q0, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            String str = "IAM showing prompts from IAM: " + c0585q0.toString();
            this.f7906g.getClass();
            C0594t1.d(str);
            int i6 = p2.f7936k;
            AbstractC0603w1.b(EnumC0600v1.f7992B, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + p2.f7937l, null);
            p2 p2Var = p2.f7937l;
            if (p2Var != null) {
                p2Var.f(null);
            }
            q0(c0585q0, arrayList);
        }
    }

    public final void c0(C0585q0 c0585q0) {
        C0584q c0584q = AbstractC0603w1.f8002C;
        ((C0594t1) c0584q.f7950y).getClass();
        C0594t1.d("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        ((C0261b) c0584q.f7948w).g().h();
        if (this.f7919t != null) {
            this.f7906g.getClass();
            C0594t1.d("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.f7920u = false;
        synchronized (this.f7917r) {
            if (c0585q0 != null) {
                try {
                    if (!c0585q0.f7961k && this.f7917r.size() > 0) {
                        if (!this.f7917r.contains(c0585q0)) {
                            this.f7906g.getClass();
                            C0594t1.d("Message already removed from the queue!");
                            return;
                        }
                        String str = ((C0585q0) this.f7917r.remove(0)).f7951a;
                        this.f7906g.getClass();
                        C0594t1.d("In app message with id: " + str + ", dismissed (removed) from the queue!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f7917r.size() > 0) {
                C0594t1 c0594t1 = this.f7906g;
                String str2 = "In app message on queue available: " + ((C0585q0) this.f7917r.get(0)).f7951a;
                c0594t1.getClass();
                C0594t1.d(str2);
                d0((C0585q0) this.f7917r.get(0));
            } else {
                this.f7906g.getClass();
                C0594t1.d("In app message dismissed evaluating messages");
                f0();
            }
        }
    }

    public final void d0(C0585q0 c0585q0) {
        String str;
        this.f7920u = true;
        int i6 = 0;
        this.f7923x = false;
        if (c0585q0.f7962l) {
            this.f7923x = true;
            AbstractC0603w1.u(new C0558h0(this, false, c0585q0));
        }
        A0 a02 = this.f7910k;
        String str2 = AbstractC0603w1.f8032d;
        String str3 = c0585q0.f7951a;
        String strS0 = s0(c0585q0);
        C0561i0 c0561i0 = new C0561i0(this, c0585q0, i6);
        a02.getClass();
        if (strS0 == null) {
            String strQ = AbstractC0628i.q("Unable to find a variant for in-app message ", str3);
            a02.f7461b.getClass();
            C0594t1.e(strQ);
            str = null;
        } else {
            str = "in_app_messages/" + str3 + "/variants/" + strS0 + "/html?app_id=" + str2;
        }
        new Thread(new RunnableC0576n0(str, new C0608y0(a02, c0561i0, i6), (String) null), "OS_REST_ASYNC_GET").start();
    }

    public void e0(String str) {
        int i6 = 1;
        this.f7920u = true;
        C0585q0 c0585q0 = new C0585q0();
        c0585q0.f7951a = "";
        c0585q0.f7955e = new C0599v0();
        c0585q0.f7957g = false;
        c0585q0.f7958h = false;
        c0585q0.f7961k = true;
        this.f7923x = true;
        AbstractC0603w1.u(new C0558h0(this, true, c0585q0));
        A0 a02 = this.f7910k;
        String str2 = AbstractC0603w1.f8032d;
        C0561i0 c0561i0 = new C0561i0(this, c0585q0, i6);
        a02.getClass();
        new Thread(new RunnableC0576n0("in_app_messages/device_preview?preview_id=" + str + "&app_id=" + str2, new C0608y0(a02, c0561i0, i6), (String) null), "OS_REST_ASYNC_GET").start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0235, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0235, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015f A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:27:0x0080, B:29:0x0086, B:33:0x008b, B:47:0x00d1, B:59:0x0102, B:82:0x0154, B:84:0x015c, B:86:0x015f, B:89:0x0168, B:62:0x011f, B:79:0x014a, B:80:0x0151, B:67:0x012a, B:70:0x0131, B:71:0x0138, B:37:0x0098, B:39:0x00ab, B:41:0x00b3, B:43:0x00b5, B:46:0x00c1), top: B:214:0x0080 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0() {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C0579o0.f0():void");
    }

    public void h0() {
        C0567k0 c0567k0 = new C0567k0(this, 0);
        C0550e1 c0550e1 = this.f7907h;
        c0550e1.a(c0567k0);
        c0550e1.c();
    }

    public boolean i0() {
        return this.f7920u;
    }

    public final void j0(String str) {
        String strQ = AbstractC0628i.q("messageDynamicTriggerCompleted called with triggerId: ", str);
        this.f7906g.getClass();
        C0594t1.d(strQ);
        HashSet<String> hashSet = new HashSet();
        hashSet.add(str);
        for (C0585q0 c0585q0 : this.f7912m) {
            if (!c0585q0.f7958h && this.f7918s.contains(c0585q0)) {
                this.f7911l.getClass();
                ArrayList arrayList = c0585q0.f7953c;
                if (arrayList != null) {
                    for (String str2 : hashSet) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            for (C0559h1 c0559h1 : (ArrayList) it.next()) {
                                if (str2.equals(c0559h1.f7828c) || str2.equals(c0559h1.f7826a)) {
                                    C0594t1.d("Trigger changed for message: " + c0585q0.toString());
                                    c0585q0.f7958h = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void k0(C0585q0 c0585q0) {
        l0(c0585q0, false);
    }

    public final void l0(C0585q0 c0585q0, boolean z5) {
        boolean z6 = c0585q0.f7961k;
        C0594t1 c0594t1 = this.f7906g;
        if (!z6) {
            String str = c0585q0.f7951a;
            Set set = this.f7913n;
            set.add(str);
            if (!z5) {
                A0 a02 = this.f7910k;
                a02.getClass();
                String str2 = E1.f7517a;
                a02.f7462c.getClass();
                E1.g(str2, "PREFS_OS_DISPLAYED_IAMS", set);
                this.f7924y = new Date();
                AbstractC0603w1.f8056v.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                C0599v0 c0599v0 = c0585q0.f7955e;
                c0599v0.f7986a = jCurrentTimeMillis;
                c0599v0.f7987b++;
                c0585q0.f7958h = false;
                c0585q0.f7957g = true;
                AbstractC0571l1.Q(new C0555g0(this, c0585q0), "OS_IAM_DB_ACCESS");
                int iIndexOf = this.f7918s.indexOf(c0585q0);
                if (iIndexOf != -1) {
                    this.f7918s.set(iIndexOf, c0585q0);
                } else {
                    this.f7918s.add(c0585q0);
                }
                String str3 = "persistInAppMessageForRedisplay: " + c0585q0.toString() + " with msg array data: " + this.f7918s.toString();
                c0594t1.getClass();
                C0594t1.d(str3);
            }
            String str4 = "OSInAppMessageController messageWasDismissed dismissedMessages: " + set.toString();
            c0594t1.getClass();
            C0594t1.d(str4);
        }
        if (this.f7919t == null) {
            c0594t1.getClass();
            C0594t1.h("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
        }
        c0(c0585q0);
    }

    public final void m0(JSONArray jSONArray) {
        synchronized (f7905z) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    C0585q0 c0585q0 = new C0585q0(jSONArray.getJSONObject(i6));
                    if (c0585q0.f7951a != null) {
                        arrayList.add(c0585q0);
                    }
                }
                this.f7912m = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
        f0();
    }

    public final void n0(C0585q0 c0585q0) {
        synchronized (this.f7917r) {
            try {
                if (!this.f7917r.contains(c0585q0)) {
                    this.f7917r.add(c0585q0);
                    C0594t1 c0594t1 = this.f7906g;
                    String str = "In app message with id: " + c0585q0.f7951a + ", added to the queue";
                    c0594t1.getClass();
                    C0594t1.d(str);
                }
                a0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o0(JSONArray jSONArray) {
        A0 a02 = this.f7910k;
        String string = jSONArray.toString();
        a02.getClass();
        String str = E1.f7517a;
        a02.f7462c.getClass();
        E1.g(str, "PREFS_OS_CACHED_IAMS", string);
        RunnableC0570l0 runnableC0570l0 = new RunnableC0570l0(this, 0, jSONArray);
        synchronized (f7905z) {
            try {
                if (p0()) {
                    this.f7906g.getClass();
                    C0594t1.d("Delaying task due to redisplay data not retrieved yet");
                    this.f7907h.a(runnableC0570l0);
                } else {
                    runnableC0570l0.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p0() {
        boolean z5;
        synchronized (f7905z) {
            try {
                z5 = this.f7918s == null && this.f7907h.b();
            } finally {
            }
        }
        return z5;
    }

    public final void q0(C0585q0 c0585q0, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0590s0 abstractC0590s0 = (AbstractC0590s0) it.next();
            if (!abstractC0590s0.f7968a) {
                this.f7919t = abstractC0590s0;
                break;
            }
        }
        AbstractC0590s0 abstractC0590s02 = this.f7919t;
        C0594t1 c0594t1 = this.f7906g;
        if (abstractC0590s02 == null) {
            String str = "No IAM prompt to handle, dismiss message: " + c0585q0.f7951a;
            c0594t1.getClass();
            C0594t1.d(str);
            k0(c0585q0);
        }
        String str2 = "IAM prompt to handle: " + this.f7919t.toString();
        c0594t1.getClass();
        C0594t1.d(str2);
        AbstractC0590s0 abstractC0590s03 = this.f7919t;
        abstractC0590s03.f7968a = true;
        C0584q c0584q = new C0584q(this, c0585q0, list);
        switch (((C0596u0) abstractC0590s03).f7982b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0593t0 c0593t0 = new C0593t0(c0584q);
                ArrayList arrayList = AbstractC0603w1.f8026a;
                X.f7725a.add(c0593t0);
                if (OSUtils.a()) {
                    X.c(true);
                    break;
                } else if (!X.f7727c) {
                    X.d();
                    break;
                } else if (!PermissionsActivity.f7672y) {
                    PermissionsActivity.f7673z = true;
                    N1 n12 = new N1("NOTIFICATION", "android.permission.POST_NOTIFICATIONS", X.class);
                    boolean z5 = PermissionsActivity.f7672y;
                    C0548e c0548e = C0554g.f7812x;
                    if (c0548e != null) {
                        C0548e.f7785d.put("com.onesignal.PermissionsActivity", n12);
                        Activity activity = c0548e.f7789b;
                        if (activity != null) {
                            n12.a(activity);
                        }
                    }
                    break;
                }
                break;
            default:
                AbstractC0603w1.J(c0584q, true);
                break;
        }
    }

    public final String r0(String str) {
        String str2 = this.f7921v;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n\n<script>\n    setPlayerTags(" + str2 + ");\n</script>");
        return sb.toString();
    }

    public final String s0(C0585q0 c0585q0) {
        String strJ = this.f7908i.f5934a.j();
        for (String str : f7904A) {
            if (c0585q0.f7952b.containsKey(str)) {
                HashMap map = (HashMap) c0585q0.f7952b.get(str);
                if (!map.containsKey(strJ)) {
                    strJ = "default";
                }
                return (String) map.get(strJ);
            }
        }
        return null;
    }
}
