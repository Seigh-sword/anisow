package com.onesignal;

import a3.C0261b;
import a4.C0263a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: com.onesignal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0575n extends AbstractC0581p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7895e;

    public C0575n(int i6) {
        this.f7895e = i6;
        if (i6 != 1) {
            this.f7928a = 1L;
            this.f7929b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        } else {
            this.f7928a = 60L;
            this.f7929b = "GT_UNSENT_ACTIVE_TIME";
        }
    }

    @Override // com.onesignal.AbstractC0581p
    public final void a(JSONObject jSONObject) {
        switch (this.f7895e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0584q c0584q = AbstractC0603w1.f8002C;
                ArrayList<C0263a> arrayListC = c();
                C0594t1 c0594t1 = (C0594t1) c0584q.f7950y;
                String str = "OneSignal SessionManager addSessionData with influences: " + arrayListC.toString();
                c0594t1.getClass();
                C0594t1.d(str);
                C0261b c0261b = (C0261b) c0584q.f7948w;
                c0261b.getClass();
                AbstractC1305a.o(jSONObject, "jsonObject");
                for (C0263a c0263a : arrayListC) {
                    if (c0263a.f5017b.ordinal() == 1) {
                        Z3.b bVar = (Z3.b) c0261b.i();
                        switch (bVar.f4964g) {
                            case com.bumptech.glide.d.f6312l /* 0 */:
                                break;
                            default:
                                if (c0263a.f5016a.a()) {
                                    try {
                                        jSONObject.put("direct", c0263a.f5016a.b());
                                        jSONObject.put("notification_ids", c0263a.f5018c);
                                    } catch (JSONException e6) {
                                        bVar.f4962e.getClass();
                                        C0594t1.f("Generating notification tracker addSessionData JSONObject ", e6);
                                    }
                                }
                                break;
                        }
                    }
                }
                C0594t1.d("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
                break;
        }
    }

    @Override // com.onesignal.AbstractC0581p
    public final ArrayList c() {
        switch (this.f7895e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ArrayList arrayList = new ArrayList();
                String str = E1.f7517a;
                Iterator it = E1.f("PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet()).iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(new C0263a((String) it.next()));
                    } catch (JSONException e6) {
                        AbstractC0603w1.b(EnumC0600v1.f7997y, C0575n.class.getSimpleName() + ": error generation OSInfluence from json object: " + e6, null);
                    }
                }
                return arrayList;
            default:
                return new ArrayList();
        }
    }

    @Override // com.onesignal.AbstractC0581p
    public final void e(List list) {
        switch (this.f7895e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        hashSet.add(((C0263a) it.next()).a());
                    } catch (JSONException e6) {
                        AbstractC0603w1.b(EnumC0600v1.f7997y, C0575n.class.getSimpleName() + ": error generation json object OSInfluence: " + e6, null);
                    }
                }
                E1.g(E1.f7517a, "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet);
                break;
        }
    }
}
