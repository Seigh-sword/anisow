package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f7747i = -99;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f7748j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y1 f7749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f7751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f7752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f7753e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7756h = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f7754f = new ArrayList();

    public Z1(Context context) {
        this.f7755g = true;
        this.f7753e = context;
        try {
            JSONArray jSONArray = new JSONArray(E1.e("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                this.f7754f.add(jSONArray.get(i6).toString());
            }
            boolean z5 = jSONArray.length() == 0;
            this.f7755g = z5;
            if (z5) {
                this.f7755g = E1.b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        b();
    }

    public static void a(Z1 z12, ArrayList arrayList, ArrayList arrayList2) {
        Method method;
        z12.getClass();
        try {
            int i6 = 2;
            if (z12.f7752d == null) {
                Method[] methods = f7748j.getMethods();
                int length = methods.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i7];
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Class<?> returnType = method.getReturnType();
                    if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                        break;
                    } else {
                        i7++;
                    }
                }
                z12.f7752d = method;
                method.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) z12.f7752d.invoke(z12.f7750b, 3, z12.f7753e.getPackageName(), "inapp", bundle);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap map = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal bigDecimalDivide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", bigDecimalDivide.toString());
                    map.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (map.containsKey(str)) {
                        jSONArray.put(map.get(str));
                    }
                }
                if (jSONArray.length() > 0) {
                    AbstractC0603w1.O(jSONArray, z12.f7755g, new T0(z12, i6, arrayList2));
                }
            }
        } catch (Throwable th) {
            AbstractC0603w1.b(EnumC0600v1.f7998z, "Failed to track IAP purchases", th);
        }
    }

    public final void b() {
        if (this.f7749a != null) {
            if (this.f7750b == null || this.f7756h) {
                return;
            }
            new Thread(new D(6, this)).start();
            return;
        }
        this.f7749a = new Y1(this);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.f7753e.bindService(intent, this.f7749a, 1);
    }
}
