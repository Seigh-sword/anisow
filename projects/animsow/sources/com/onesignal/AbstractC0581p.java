package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0581p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f7930c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7931d = new AtomicBoolean();

    public static JSONObject b(long j6) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("app_id", AbstractC0603w1.t(AbstractC0603w1.f8028b)).put("type", 1).put("state", "ping").put("active_time", j6).put("device_type", OSUtils.b());
        try {
            AbstractC0603w1.f8009J.getClass();
            jSONObjectPut.put("net_type", OSUtils.d());
        } catch (Throwable unused) {
        }
        return jSONObjectPut;
    }

    public abstract void a(JSONObject jSONObject);

    public abstract ArrayList c();

    public final long d() {
        if (this.f7930c == null) {
            String str = E1.f7517a;
            Long l5 = (Long) E1.a(E1.f7517a, this.f7929b, Long.class, 0L);
            l5.longValue();
            this.f7930c = l5;
        }
        AbstractC0603w1.b(EnumC0600v1.f7992B, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f7930c, null);
        return this.f7930c.longValue();
    }

    public abstract void e(List list);

    public final void f(long j6, List list) {
        AbstractC0603w1.b(EnumC0600v1.f7992B, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString(), null);
        long jD = d() + j6;
        e(list);
        g(jD);
    }

    public final void g(long j6) {
        this.f7930c = Long.valueOf(j6);
        AbstractC0603w1.b(EnumC0600v1.f7992B, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f7930c, null);
        String str = E1.f7517a;
        E1.g(E1.f7517a, this.f7929b, Long.valueOf(j6));
    }

    public final void h(long j6) {
        try {
            AbstractC0603w1.b(EnumC0600v1.f7992B, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j6, null);
            JSONObject jSONObjectB = b(j6);
            a(jSONObjectB);
            i(AbstractC0603w1.v(), jSONObjectB);
            if (!TextUtils.isEmpty(AbstractC0603w1.f8042i)) {
                i(AbstractC0603w1.o(), b(j6));
            }
            if (!TextUtils.isEmpty(AbstractC0603w1.f8044j)) {
                i(AbstractC0603w1.s(), b(j6));
            }
            e(new ArrayList());
        } catch (JSONException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "Generating on_focus:JSON Failed.", e6);
        }
    }

    public final void i(String str, JSONObject jSONObject) {
        AbstractC0571l1.D(AbstractC0628i.j("players/", str, "/on_focus"), "POST", jSONObject, new C0578o(0, this), 120000, null);
    }

    public final void j(int i6) {
        if (!(AbstractC0603w1.v() != null)) {
            AbstractC0603w1.b(EnumC0600v1.f7998z, getClass().getSimpleName().concat(":sendUnsentTimeNow not possible due to user id null"), null);
        }
        C0575n c0575n = (C0575n) this;
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        EnumC0600v1 enumC0600v12 = EnumC0600v1.f7993C;
        switch (c0575n.f7895e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0603w1.b(enumC0600v1, C0575n.class.getSimpleName() + " sendTime with: " + H1.a.G(i6), null);
                if (!u.h.a(i6, 2)) {
                    Z0 z0C = Z0.c();
                    Context context = AbstractC0603w1.f8028b;
                    z0C.getClass();
                    AbstractC0603w1.b(enumC0600v12, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
                    z0C.d(context, 30000L);
                } else {
                    c0575n.k();
                }
                break;
            default:
                AbstractC0603w1.b(enumC0600v1, C0575n.class.getSimpleName() + " sendTime with: " + H1.a.G(i6), null);
                if (!u.h.a(i6, 2) && c0575n.d() >= c0575n.f7928a) {
                    Z0 z0C2 = Z0.c();
                    Context context2 = AbstractC0603w1.f8028b;
                    z0C2.getClass();
                    AbstractC0603w1.b(enumC0600v12, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
                    z0C2.d(context2, 30000L);
                }
                break;
        }
    }

    public final void k() {
        if (this.f7931d.get()) {
            return;
        }
        synchronized (this.f7931d) {
            try {
                this.f7931d.set(true);
                if (d() >= this.f7928a) {
                    h(d());
                }
                this.f7931d.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
