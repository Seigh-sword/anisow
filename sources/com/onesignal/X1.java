package com.onesignal;

import W1.C0229x;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import b3.C0343c;
import c4.AbstractC0377b;
import com.google.android.gms.common.api.GoogleApiClient;
import d4.C0657b;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class X1 implements InterfaceC0611z0, InterfaceC0609y1, n2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static AtomicLong f7730A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static AtomicLong f7731B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static B0 f7732C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static Class f7733z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f7735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f7736y;

    public X1(C0229x c0229x) {
        this.f7734w = 2;
        this.f7736y = c0229x;
        this.f7735x = C0229x.class;
    }

    public static String f(B0 b02) {
        if (b02.f7474e.isEmpty() || b02.f7475f.isEmpty()) {
            String str = b02.f7476g;
            return str != null ? str.substring(0, Math.min(10, str.length())) : "";
        }
        return b02.f7474e + " - " + b02.f7475f;
    }

    public static Method i(Class cls) {
        try {
            return cls.getMethod("logEvent", String.class, Bundle.class);
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static boolean n(Number number, Number number2, int i6) {
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        switch (u.h.b(i6)) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (dDoubleValue2 <= dDoubleValue) {
                    break;
                }
                break;
            case 1:
                if (dDoubleValue2 >= dDoubleValue) {
                    break;
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (dDoubleValue2 != dDoubleValue) {
                    break;
                }
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (dDoubleValue2 == dDoubleValue) {
                    break;
                }
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                if (dDoubleValue2 >= dDoubleValue && dDoubleValue2 != dDoubleValue) {
                    break;
                }
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                if (dDoubleValue2 <= dDoubleValue && dDoubleValue2 != dDoubleValue) {
                    break;
                }
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0603w1.b(EnumC0600v1.f7997y, "Attempted to use an invalid operator with a numeric value: ".concat(H1.a.f(i6)), null);
                break;
        }
        return false;
    }

    public static boolean o(String str, String str2, int i6) {
        int iB = u.h.b(i6);
        if (iB == 2) {
            return str.equals(str2);
        }
        if (iB == 3) {
            return !str.equals(str2);
        }
        AbstractC0603w1.b(EnumC0600v1.f7997y, "Attempted to use an invalid operator for a string trigger comparison: ".concat(H1.a.f(i6)), null);
        return false;
    }

    @Override // com.onesignal.InterfaceC0611z0, com.onesignal.InterfaceC0609y1
    public final void a(String str) {
        switch (this.f7734w) {
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return;
            default:
                AbstractC0377b abstractC0377bL = ((J3.w) ((C0584q) this.f7735x).f7949x).l();
                C0657b c0657b = (C0657b) this.f7736y;
                AbstractC1305a.o(c0657b, "outcomeEvent");
                C0343c c0343c = abstractC0377bL.f6239b;
                synchronized (c0343c) {
                    ((C1) ((B1) c0343c.f5931x)).b("outcome", "timestamp = ?", new String[]{String.valueOf(c0657b.f8226d)});
                }
                return;
        }
    }

    @Override // com.onesignal.n2
    public final void b() {
        p2 p2Var = (p2) this.f7735x;
        p2Var.f7946i = false;
        synchronized (p2Var.f7938a) {
            p2Var.f7940c = null;
        }
        n2 n2Var = (n2) this.f7736y;
        if (n2Var != null) {
            n2Var.b();
        }
    }

    @Override // com.onesignal.InterfaceC0609y1
    public final void c(int i6, String str) {
    }

    @Override // com.onesignal.InterfaceC0611z0
    public final void d(String str) {
        ((C0579o0) this.f7735x).f7915p.remove((String) this.f7736y);
    }

    public final void e() {
        try {
            ((Class) this.f7735x).getMethod("connect", new Class[0]).invoke((GoogleApiClient) this.f7736y, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final Object g(Context context) {
        Method method;
        if (this.f7736y == null) {
            try {
                method = f7733z.getMethod("getInstance", Context.class);
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
                method = null;
            }
            try {
                this.f7736y = method.invoke(null, context);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f7736y;
    }

    public final boolean h() {
        Context context = (Context) this.f7735x;
        AbstractC1305a.o(context, "context");
        Bundle bundleC = OSUtils.c(context);
        return (AbstractC1305a.c("DISABLE", bundleC != null ? bundleC.getString("com.onesignal.NotificationOpened.DEFAULT") : null) ^ true) && j() == null;
    }

    public final Uri j() {
        Context context = (Context) this.f7735x;
        AbstractC1305a.o(context, "context");
        if (!(!AbstractC1305a.c("DISABLE", OSUtils.c(context) != null ? r0.getString("com.onesignal.NotificationOpened.DEFAULT") : null))) {
            return null;
        }
        Context context2 = (Context) this.f7735x;
        AbstractC1305a.o(context2, "context");
        Bundle bundleC = OSUtils.c(context2);
        if (bundleC != null && bundleC.getBoolean("com.onesignal.suppressLaunchURLs")) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(((JSONObject) this.f7736y).optString("custom"));
        if (jSONObject.has("u")) {
            String strOptString = jSONObject.optString("u");
            if (!AbstractC1305a.c(strOptString, "")) {
                AbstractC1305a.n(strOptString, "url");
                int length = strOptString.length() - 1;
                int i6 = 0;
                boolean z5 = false;
                while (i6 <= length) {
                    char cCharAt = strOptString.charAt(!z5 ? i6 : length);
                    boolean z6 = cCharAt < ' ' || cCharAt == ' ';
                    if (z5) {
                        if (!z6) {
                            break;
                        }
                        length--;
                    } else if (z6) {
                        i6++;
                    } else {
                        z5 = true;
                    }
                }
                return Uri.parse(strOptString.subSequence(i6, length + 1).toString());
            }
        }
        return null;
    }

    public final GoogleApiClient k() {
        return (GoogleApiClient) this.f7736y;
    }

    public final JSONObject l() {
        switch (this.f7734w) {
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("from", ((C0543c0) this.f7736y).a());
                    jSONObject.put("to", ((C0543c0) this.f7735x).a());
                    break;
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
                return jSONObject;
            case 11:
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("from", ((S0) this.f7736y).a());
                    jSONObject2.put("to", ((S0) this.f7735x).a());
                    break;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return jSONObject2;
            case 12:
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("from", ((V0) this.f7736y).a());
                    jSONObject3.put("to", ((V0) this.f7735x).a());
                    break;
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
                return jSONObject3;
            default:
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("from", ((OSSubscriptionState) this.f7736y).d());
                    jSONObject4.put("to", ((OSSubscriptionState) this.f7735x).d());
                    break;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return jSONObject4;
        }
    }

    public final void m(L0 l02) {
        try {
            Object objG = g((Context) this.f7735x);
            Method methodI = i(f7733z);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            B0 b02 = l02.f7620c;
            bundle.putString("notification_id", b02.f7473d);
            bundle.putString("campaign", f(b02));
            methodI.invoke(objG, "os_notification_received", bundle);
            if (f7730A == null) {
                f7730A = new AtomicLong();
            }
            AtomicLong atomicLong = f7730A;
            AbstractC0603w1.f8056v.getClass();
            atomicLong.set(System.currentTimeMillis());
            f7732C = b02;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final String toString() {
        switch (this.f7734w) {
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return l().toString();
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "OSInAppMessageTag{adds=" + ((JSONObject) this.f7736y) + ", removes=" + ((JSONArray) this.f7735x) + '}';
            case 11:
                return l().toString();
            case 12:
                return l().toString();
            case 13:
                return l().toString();
            default:
                return super.toString();
        }
    }

    public X1(Context context) {
        this.f7734w = 0;
        this.f7735x = context;
    }

    public X1(Context context, JSONObject jSONObject) {
        this.f7734w = 9;
        AbstractC1305a.o(context, "context");
        AbstractC1305a.o(jSONObject, "fcmPayload");
        this.f7735x = context;
        this.f7736y = jSONObject;
    }

    public X1(C0579o0 c0579o0) {
        this.f7734w = 15;
        this.f7735x = new ConcurrentHashMap();
        this.f7736y = new C0540b0(c0579o0);
    }

    public X1(C0544c1 c0544c1, h0.W w5) {
        this.f7734w = 14;
        this.f7735x = c0544c1;
        this.f7736y = w5;
    }

    public /* synthetic */ X1(Object obj, int i6, Object obj2) {
        this.f7734w = i6;
        this.f7735x = obj;
        this.f7736y = obj2;
    }

    public /* synthetic */ X1(Object obj, Object obj2, int i6) {
        this.f7734w = i6;
        this.f7736y = obj;
        this.f7735x = obj2;
    }

    public X1(JSONObject jSONObject) {
        this.f7734w = 7;
        this.f7736y = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.f7735x = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : null;
    }
}
