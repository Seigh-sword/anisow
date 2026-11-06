package a4;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: a4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0263a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f5016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f5018c;

    public C0263a(b bVar, c cVar, JSONArray jSONArray) {
        AbstractC1305a.o(bVar, "influenceChannel");
        AbstractC1305a.o(cVar, "influenceType");
        this.f5017b = bVar;
        this.f5016a = cVar;
        this.f5018c = jSONArray;
    }

    public final String a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("influence_channel", this.f5017b.f5022w).put("influence_type", this.f5016a.toString());
        JSONArray jSONArray = this.f5018c;
        String string = jSONObjectPut.put("influence_ids", jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        AbstractC1305a.n(string, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!AbstractC1305a.c(C0263a.class, obj.getClass()))) {
            return false;
        }
        C0263a c0263a = (C0263a) obj;
        return this.f5017b == c0263a.f5017b && this.f5016a == c0263a.f5016a;
    }

    public final int hashCode() {
        return this.f5016a.hashCode() + (this.f5017b.hashCode() * 31);
    }

    public final String toString() {
        return "SessionInfluence{influenceChannel=" + this.f5017b + ", influenceType=" + this.f5016a + ", ids=" + this.f5018c + '}';
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0263a(java.lang.String r8) throws org.json.JSONException {
        /*
            r7 = this;
            java.lang.String r0 = "jsonString"
            s4.AbstractC1305a.o(r8, r0)
            r7.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            java.lang.String r8 = "influence_channel"
            java.lang.String r8 = r0.getString(r8)
            java.lang.String r1 = "influence_type"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "influence_ids"
            java.lang.String r0 = r0.getString(r2)
            r2 = 0
            if (r8 == 0) goto L3d
            a4.b[] r3 = a4.b.values()
            int r4 = r3.length
        L27:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L39
            r5 = r3[r4]
            r5.getClass()
            java.lang.String r6 = r5.f5022w
            boolean r6 = s4.AbstractC1305a.c(r6, r8)
            if (r6 == 0) goto L27
            goto L3a
        L39:
            r5 = r2
        L3a:
            if (r5 == 0) goto L3d
            goto L3f
        L3d:
            a4.b r5 = a4.b.f5020y
        L3f:
            r7.f5017b = r5
            a4.c r8 = m2.C1017B.o(r1)
            r7.f5016a = r8
            java.lang.String r8 = "ids"
            s4.AbstractC1305a.n(r0, r8)
            int r8 = r0.length()
            if (r8 != 0) goto L53
            goto L58
        L53:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r0)
        L58:
            r7.f5018c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C0263a.<init>(java.lang.String):void");
    }
}
