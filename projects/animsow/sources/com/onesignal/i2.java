package com.onesignal;

import android.os.Handler;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L1 f7843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7844c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a2 f7852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a2 f7853l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7842a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7845d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f7846e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedQueue f7847f = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f7848g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f7849h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C f7850i = new C(6, this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7851j = false;

    public i2(L1 l12) {
        this.f7843b = l12;
    }

    public static boolean a(i2 i2Var, int i6, String str, String str2) {
        i2Var.getClass();
        if (i6 != 400 || str == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errors")) {
                return jSONObject.optString("errors").contains(str2);
            }
            return false;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return false;
        }
    }

    public static void b(i2 i2Var) {
        i2Var.n().m("logoutEmail");
        i2Var.f7853l.m("email_auth_hash");
        i2Var.f7853l.n("parent_player_id");
        i2Var.f7853l.n("email");
        i2Var.f7853l.i();
        i2Var.i().m("email_auth_hash");
        i2Var.i().n("parent_player_id");
        String strOptString = ((JSONObject) i2Var.i().f().f7497b).optString("email");
        i2Var.i().n("email");
        M1.a().x();
        AbstractC0603w1.b(EnumC0600v1.f7991A, "Device successfully logged out of email: " + strOptString, null);
    }

    public static void c(i2 i2Var) {
        i2Var.getClass();
        AbstractC0603w1.b(EnumC0600v1.f7998z, "Creating new player based on missing player_id noted above.", null);
        i2Var.u();
        i2Var.A(null);
        i2Var.v();
    }

    public static void d(i2 i2Var, int i6) {
        boolean zHasMessages;
        D d6 = null;
        if (i6 == 403) {
            i2Var.getClass();
            AbstractC0603w1.b(EnumC0600v1.f7996x, "403 error updating player, omitting further retries!", null);
        } else {
            h2 h2VarL = i2Var.l();
            synchronized (h2VarL.f7832x) {
                try {
                    boolean z5 = h2VarL.f7833y < 3;
                    boolean zHasMessages2 = h2VarL.f7832x.hasMessages(0);
                    if (z5 && !zHasMessages2) {
                        h2VarL.f7833y = h2VarL.f7833y + 1;
                        Handler handler = h2VarL.f7832x;
                        if (h2VarL.f7831w == 0) {
                            d6 = new D(7, h2VarL);
                        }
                        handler.postDelayed(d6, r2 * 15000);
                    }
                    zHasMessages = h2VarL.f7832x.hasMessages(0);
                } finally {
                }
            }
            if (zHasMessages) {
                return;
            }
        }
        i2Var.h();
    }

    public abstract void A(String str);

    public final void B(K k5) {
        a2 a2VarO = o();
        a2VarO.getClass();
        try {
            HashMap map = new HashMap();
            map.put("lat", k5.f7602a);
            map.put("long", k5.f7603b);
            map.put("loc_acc", k5.f7604c);
            map.put("loc_type", k5.f7605d);
            a2.l(a2VarO.f7765c, map);
            HashMap map2 = new HashMap();
            map2.put("loc_bg", k5.f7606e);
            map2.put("loc_time_stamp", k5.f7607f);
            a2.l(a2VarO.f7764b, map2);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public abstract void e(JSONObject jSONObject);

    public final void f() {
        a2 a2VarN = n();
        a2VarN.getClass();
        try {
            HashMap map = new HashMap();
            map.put("lat", null);
            map.put("long", null);
            map.put("loc_acc", null);
            map.put("loc_type", null);
            map.put("loc_bg", null);
            map.put("loc_time_stamp", null);
            a2.l(a2VarN.f7765c, map);
            HashMap map2 = new HashMap();
            map2.put("loc_bg", null);
            map2.put("loc_time_stamp", null);
            a2.l(a2VarN.f7764b, map2);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        n().i();
    }

    public abstract void g(JSONObject jSONObject);

    public final void h() {
        JSONObject jSONObjectB = i().b(this.f7853l, false);
        if (jSONObjectB != null) {
            g(jSONObjectB);
        }
        if (((JSONObject) n().d().f7497b).optBoolean("logoutEmail", false)) {
            ArrayList arrayList = AbstractC0603w1.f8026a;
        }
    }

    public final a2 i() {
        if (this.f7852k == null) {
            synchronized (this.f7842a) {
                try {
                    if (this.f7852k == null) {
                        this.f7852k = q("CURRENT_STATE");
                    }
                } finally {
                }
            }
        }
        return this.f7852k;
    }

    public abstract String j();

    public abstract EnumC0600v1 k();

    public final h2 l() {
        h2 h2Var;
        synchronized (this.f7850i) {
            try {
                if (!this.f7849h.containsKey(0)) {
                    this.f7849h.put(0, new h2(this, 0));
                }
                h2Var = (h2) this.f7849h.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return h2Var;
    }

    public final String m() {
        return ((JSONObject) n().f().f7497b).optString("identifier", null);
    }

    public final a2 n() {
        if (this.f7853l == null) {
            synchronized (this.f7842a) {
                try {
                    if (this.f7853l == null) {
                        this.f7853l = q("TOSYNC_STATE");
                    }
                } finally {
                }
            }
        }
        return this.f7853l;
    }

    public final a2 o() {
        b2 b2Var;
        if (this.f7853l == null) {
            a2 a2VarI = i();
            a2VarI.getClass();
            switch (((b2) a2VarI).f7772f) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    b2Var = new b2(0, "TOSYNC_STATE", false);
                    break;
                case 1:
                    b2Var = new b2(1, "TOSYNC_STATE", false);
                    break;
                default:
                    b2Var = new b2(2, "TOSYNC_STATE", false);
                    break;
            }
            try {
                b2Var.f7764b = a2VarI.e();
                b2Var.f7765c = a2VarI.g();
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            this.f7853l = b2Var;
        }
        v();
        return this.f7853l;
    }

    public final void p() {
        if (this.f7852k == null) {
            synchronized (this.f7842a) {
                try {
                    if (this.f7852k == null) {
                        this.f7852k = q("CURRENT_STATE");
                    }
                } finally {
                }
            }
        }
        n();
    }

    public abstract b2 q(String str);

    public abstract void r(JSONObject jSONObject);

    public final boolean s() {
        boolean z5;
        if (this.f7853l == null) {
            return false;
        }
        synchronized (this.f7842a) {
            z5 = i().b(this.f7853l, (((JSONObject) n().d().f7497b).optBoolean("session") || j() == null) && !this.f7851j) != null;
            this.f7853l.i();
        }
        return z5;
    }

    public final void t() {
        boolean z5 = !this.f7844c;
        this.f7844c = true;
        if (z5) {
            v();
        }
    }

    public final void u() {
        a2 a2VarI = i();
        JSONObject jSONObject = new JSONObject();
        a2VarI.getClass();
        synchronized (a2.f7761d) {
            a2VarI.f7765c = jSONObject;
        }
        i().i();
    }

    public abstract void v();

    public final void w(JSONObject jSONObject) {
        o().c(jSONObject);
    }

    public final void x() {
        try {
            synchronized (this.f7842a) {
                o().k(Boolean.TRUE, "session");
                o().i();
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public final void y(boolean z5) {
        JSONObject jSONObjectJ;
        this.f7845d.set(true);
        String strJ = j();
        if (!((JSONObject) n().d().f7497b).optBoolean("logoutEmail", false) || strJ == null) {
            if (this.f7852k == null) {
                p();
            }
            boolean z6 = !z5 && (((JSONObject) n().d().f7497b).optBoolean("session") || j() == null) && !this.f7851j;
            synchronized (this.f7842a) {
                try {
                    JSONObject jSONObjectB = i().b(n(), z6);
                    a2 a2VarN = n();
                    a2 a2VarI = i();
                    a2VarI.getClass();
                    synchronized (a2.f7761d) {
                        jSONObjectJ = AbstractC0571l1.j(a2VarI.f7764b, a2VarN.f7764b, null, null);
                    }
                    AbstractC0603w1.b(EnumC0600v1.f7992B, "UserStateSynchronizer internalSyncUserState from session call: " + z6 + " jsonBody: " + jSONObjectB, null);
                    if (jSONObjectB == null) {
                        i().j(jSONObjectJ, null);
                        M1.d(false);
                        AbstractC0628i.p(this.f7846e.poll());
                        AbstractC0628i.p(this.f7847f.poll());
                        ((JSONObject) M1.b().n().d().f7497b).optString("language", null);
                        AbstractC0628i.p(this.f7848g.poll());
                    } else {
                        n().i();
                        if (z6) {
                            String strJ2 = strJ == null ? "players" : AbstractC0628i.j("players/", strJ, "/on_session");
                            this.f7851j = true;
                            e(jSONObjectB);
                            AbstractC0571l1.D(strJ2, "POST", jSONObjectB, new g2(this, jSONObjectJ, jSONObjectB, strJ), 120000, null);
                        } else if (strJ == null) {
                            AbstractC0603w1.b(k(), "Error updating the user record because of the null user id", null);
                            AbstractC0628i.p(this.f7846e.poll());
                            AbstractC0628i.p(this.f7847f.poll());
                            AbstractC0628i.p(this.f7848g.poll());
                        } else {
                            AbstractC0571l1.D("players/".concat(strJ), "PUT", jSONObjectB, new F1(this, jSONObjectB, jSONObjectJ), 120000, null);
                        }
                    }
                } finally {
                }
            }
        } else {
            String strJ3 = AbstractC0628i.j("players/", strJ, "/email_logout");
            JSONObject jSONObject = new JSONObject();
            try {
                C cD = i().d();
                if (((JSONObject) cD.f7497b).has("email_auth_hash")) {
                    jSONObject.put("email_auth_hash", ((JSONObject) cD.f7497b).optString("email_auth_hash"));
                }
                C cF = i().f();
                if (((JSONObject) cF.f7497b).has("parent_player_id")) {
                    jSONObject.put("parent_player_id", ((JSONObject) cF.f7497b).optString("parent_player_id"));
                }
                jSONObject.put("app_id", ((JSONObject) cF.f7497b).optString("app_id"));
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            AbstractC0571l1.D(strJ3, "POST", jSONObject, new C0578o(2, this), 120000, null);
        }
        this.f7845d.set(false);
    }

    public final void z(JSONObject jSONObject) {
        o().c(jSONObject);
    }
}
