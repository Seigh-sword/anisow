package com.onesignal;

import a4.C0263a;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7497b;

    public C(int i6) {
        this.f7496a = i6;
        if (i6 == 2) {
            this.f7497b = new Bundle();
            return;
        }
        if (i6 == 3) {
            this.f7497b = new PersistableBundle();
            return;
        }
        if (i6 == 4) {
            this.f7497b = new JSONObject();
            return;
        }
        if (i6 != 5) {
            this.f7497b = null;
            return;
        }
        HashMap map = new HashMap();
        this.f7497b = map;
        map.put(C0575n.class.getName(), new C0575n(1));
        ((HashMap) this.f7497b).put(C0575n.class.getName(), new C0575n(0));
    }

    public final AbstractC0581p a() {
        AbstractC0581p abstractC0581p = (AbstractC0581p) ((HashMap) this.f7497b).get(C0575n.class.getName());
        Iterator it = abstractC0581p.c().iterator();
        while (it.hasNext()) {
            if (((C0263a) it.next()).f5016a.a()) {
                return abstractC0581p;
            }
        }
        return (AbstractC0581p) ((HashMap) this.f7497b).get(C0575n.class.getName());
    }

    public final AbstractC0581p b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0263a) it.next()).f5016a.a()) {
                return (AbstractC0581p) ((HashMap) this.f7497b).get(C0575n.class.getName());
            }
        }
        return (AbstractC0581p) ((HashMap) this.f7497b).get(C0575n.class.getName());
    }

    public final String toString() {
        switch (this.f7496a) {
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "ImmutableJSONObject{jsonObject=" + ((JSONObject) this.f7497b) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C(int i6, Object obj) {
        this.f7496a = i6;
        this.f7497b = obj;
    }
}
