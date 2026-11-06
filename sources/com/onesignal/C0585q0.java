package com.onesignal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0585q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f7954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0599v0 f7955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f7956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7957g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7958h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Date f7960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7962l;

    public C0585q0(JSONObject jSONObject) throws JSONException {
        Date date;
        long jIntValue;
        String string;
        int i6;
        int i7;
        this.f7951a = jSONObject.getString("id");
        this.f7955e = new C0599v0();
        int i8 = 0;
        JSONObject jSONObject2 = jSONObject.getJSONObject("variants");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
            HashMap map2 = new HashMap();
            Iterator<String> itKeys2 = jSONObject3.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                map2.put(next2, jSONObject3.getString(next2));
            }
            map.put(next, map2);
        }
        this.f7952b = map;
        JSONArray jSONArray = jSONObject.getJSONArray("triggers");
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < jSONArray.length()) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i9);
            ArrayList arrayList2 = new ArrayList();
            int i10 = i8;
            while (i10 < jSONArray2.length()) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i10);
                C0559h1 c0559h1 = new C0559h1();
                c0559h1.f7826a = jSONObject4.getString("id");
                String string2 = jSONObject4.getString("kind");
                int[] iArrC = u.h.c(4);
                int length = iArrC.length;
                while (true) {
                    if (i8 >= length) {
                        i6 = 4;
                        break;
                    }
                    int i11 = iArrC[i8];
                    if (H1.a.h(i11).equalsIgnoreCase(string2)) {
                        i6 = i11;
                        break;
                    }
                    i8++;
                }
                c0559h1.f7827b = i6;
                c0559h1.f7828c = jSONObject4.optString("property", null);
                String string3 = jSONObject4.getString("operator");
                int[] iArrC2 = u.h.c(9);
                int length2 = iArrC2.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i7 = 3;
                        break;
                    }
                    i7 = iArrC2[i12];
                    if (H1.a.f(i7).equalsIgnoreCase(string3)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                c0559h1.f7829d = i7;
                c0559h1.f7830e = jSONObject4.opt("value");
                arrayList2.add(c0559h1);
                i10++;
                i8 = 0;
            }
            arrayList.add(arrayList2);
            i9++;
            i8 = 0;
        }
        this.f7953c = arrayList;
        this.f7954d = new HashSet();
        try {
            string = jSONObject.getString("end_time");
        } catch (JSONException unused) {
        }
        if (string.equals("null")) {
            date = null;
        } else {
            try {
                date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(string);
            } catch (ParseException e6) {
                e6.printStackTrace();
                date = null;
            }
        }
        this.f7960j = date;
        if (jSONObject.has("has_liquid")) {
            this.f7962l = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("redisplay");
            C0599v0 c0599v0 = new C0599v0();
            c0599v0.f7986a = -1L;
            c0599v0.f7987b = 0;
            c0599v0.f7988c = 1;
            c0599v0.f7989d = 0L;
            c0599v0.f7990e = true;
            Object obj = jSONObject5.get("limit");
            Object obj2 = jSONObject5.get("delay");
            if (obj instanceof Integer) {
                c0599v0.f7988c = ((Integer) obj).intValue();
            }
            if (!(obj2 instanceof Long)) {
                jIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : jIntValue;
                this.f7955e = c0599v0;
            }
            jIntValue = ((Long) obj2).longValue();
            c0599v0.f7989d = jIntValue;
            this.f7955e = c0599v0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0585q0.class != obj.getClass()) {
            return false;
        }
        return this.f7951a.equals(((C0585q0) obj).f7951a);
    }

    public final int hashCode() {
        return this.f7951a.hashCode();
    }

    public final String toString() {
        return "OSInAppMessage{messageId='" + this.f7951a + "', variants=" + this.f7952b + ", triggers=" + this.f7953c + ", clickedClickIds=" + this.f7954d + ", redisplayStats=" + this.f7955e + ", displayDuration=" + this.f7956f + ", displayedInSession=" + this.f7957g + ", triggerChanged=" + this.f7958h + ", actionTaken=" + this.f7959i + ", isPreview=" + this.f7961k + ", endTime=" + this.f7960j + ", hasLiquid=" + this.f7962l + '}';
    }
}
