package com.onesignal;

import F0.C0029p;
import a3.C0261b;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.widget.RelativeLayout;
import b3.C0343c;
import c4.AbstractC0377b;
import d4.C0656a;
import d4.C0657b;
import d4.C0658c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: com.onesignal.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0570l0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7875y;

    public /* synthetic */ RunnableC0570l0(Object obj, int i6, Object obj2) {
        this.f7873w = i6;
        this.f7875y = obj;
        this.f7874x = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        RelativeLayout relativeLayout;
        int i6 = 2;
        int i7 = 0;
        z = false;
        z = false;
        boolean z5 = false;
        switch (this.f7873w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object obj = this.f7875y;
                C0579o0 c0579o0 = (C0579o0) obj;
                Iterator it = c0579o0.f7918s.iterator();
                while (it.hasNext()) {
                    ((C0585q0) it.next()).f7957g = false;
                }
                try {
                    ((C0579o0) obj).m0((JSONArray) this.f7874x);
                    return;
                } catch (JSONException e6) {
                    c0579o0.f7906g.getClass();
                    C0594t1.f("ERROR processing InAppMessageJson JSON Response.", e6);
                    return;
                }
            case 1:
                Thread.currentThread().setPriority(10);
                C0594t1 c0594t1 = (C0594t1) ((C0584q) this.f7875y).f7949x;
                List list = (List) this.f7874x;
                c0594t1.getClass();
                if (AbstractC0603w1.f8003D == null) {
                    AbstractC0603w1.b(EnumC0600v1.f7998z, "OneSignal onSessionEnding called before init!", null);
                }
                C0584q c0584q = AbstractC0603w1.f8003D;
                if (c0584q != null) {
                    AbstractC0603w1.b(EnumC0600v1.f7992B, "OneSignal cleanOutcomes for session", null);
                    c0584q.f7948w = OSUtils.q();
                    c0584q.l();
                }
                C0584q c0584qP = AbstractC0603w1.p();
                Long lI = c0584qP.i();
                Object obj2 = c0584qP.f7949x;
                if (lI == null) {
                    ((C) obj2).b(list).j(2);
                    return;
                }
                AbstractC0581p abstractC0581pB = ((C) obj2).b(list);
                abstractC0581pB.f(lI.longValue(), list);
                abstractC0581pB.j(2);
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                F f6 = (F) this.f7875y;
                Activity activity = (Activity) this.f7874x;
                int i8 = F.f7520v;
                f6.d(activity);
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                F f7 = (F) this.f7875y;
                boolean z6 = f7.f7533k;
                Object obj3 = this.f7874x;
                if (z6 && (relativeLayout = f7.f7540r) != null) {
                    F.b(relativeLayout, F.f7521w, F.f7520v, new C0029p(f7, i6, (n2) obj3)).start();
                    return;
                }
                F.a(f7);
                n2 n2Var = (n2) obj3;
                if (n2Var != null) {
                    n2Var.b();
                    return;
                }
                return;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                ((M0) this.f7875y).b((B0) this.f7874x);
                return;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Thread.currentThread().setPriority(10);
                AbstractC0377b abstractC0377bL = ((J3.w) ((C0584q) this.f7875y).f7949x).l();
                C0657b c0657b = (C0657b) this.f7874x;
                AbstractC1305a.o(c0657b, "eventParams");
                C0343c c0343c = abstractC0377bL.f6239b;
                synchronized (c0343c) {
                    ((C0594t1) c0343c.f5930w).getClass();
                    C0594t1.d("OneSignal saveUniqueOutcomeEventParams: " + c0657b);
                    String str = c0657b.f8223a;
                    ArrayList<C0656a> arrayList = new ArrayList();
                    C0658c c0658c = c0657b.f8224b;
                    C0261b c0261b = c0658c != null ? c0658c.f8227a : null;
                    C0261b c0261b2 = c0658c != null ? c0658c.f8228b : null;
                    if (c0261b != null) {
                        JSONArray jSONArray = (JSONArray) c0261b.f5012y;
                        JSONArray jSONArray2 = (JSONArray) c0261b.f5011x;
                        C0343c.d(arrayList, jSONArray, a4.b.f5019x);
                        C0343c.d(arrayList, jSONArray2, a4.b.f5020y);
                    }
                    if (c0261b2 != null) {
                        JSONArray jSONArray3 = (JSONArray) c0261b2.f5012y;
                        JSONArray jSONArray4 = (JSONArray) c0261b2.f5011x;
                        C0343c.d(arrayList, jSONArray3, a4.b.f5019x);
                        C0343c.d(arrayList, jSONArray4, a4.b.f5020y);
                    }
                    for (C0656a c0656a : arrayList) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("channel_influence_id", c0656a.f8221a);
                        contentValues.put("channel_type", c0656a.f8222b.f5022w);
                        contentValues.put("name", str);
                        ((C1) ((B1) c0343c.f5931x)).k("cached_unique_outcome", contentValues);
                        break;
                    }
                }
                return;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                C0548e c0548e = C0554g.f7812x;
                if (c0548e != null) {
                    String str2 = (String) this.f7874x;
                    C0562i1 c0562i1 = new C0562i1(this, c0548e);
                    C0548e.f7785d.put(str2, c0562i1);
                    Activity activity2 = c0548e.f7789b;
                    if (activity2 != null) {
                        c0562i1.a(activity2);
                        return;
                    }
                    return;
                }
                return;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                if (AbstractC0603w1.j() != null) {
                    new AlertDialog.Builder(AbstractC0603w1.j()).setTitle(((EnumC0600v1) this.f7874x).toString()).setMessage((String) this.f7875y).show();
                    return;
                }
                return;
            case 9:
                ((AbstractC0571l1) this.f7874x).I((String) this.f7875y);
                return;
            case 10:
                int[] iArr = (int[]) this.f7874x;
                Object[] objArr = iArr.length > 0 && iArr[0] == 0;
                HashMap map = PermissionsActivity.f7671B;
                PermissionsActivity permissionsActivity = (PermissionsActivity) this.f7875y;
                O1 o12 = (O1) map.get(permissionsActivity.f7674w);
                if (o12 == null) {
                    throw new RuntimeException("Missing handler for permissionRequestType: " + permissionsActivity.f7674w);
                }
                if (objArr == true) {
                    o12.a();
                    return;
                }
                if (PermissionsActivity.f7673z && PermissionsActivity.f7670A && !AbstractC0571l1.T(permissionsActivity, permissionsActivity.f7675x)) {
                    z5 = true;
                }
                o12.b(z5);
                return;
            default:
                p2.h((C0585q0) this.f7874x, (C0552f0) this.f7875y);
                return;
        }
        while (i7 < 5) {
            R1 r12 = (R1) this.f7875y;
            String str3 = (String) this.f7874x;
            r12.getClass();
            EnumC0600v1 enumC0600v1 = EnumC0600v1.f7991A;
            EnumC0600v1 enumC0600v12 = EnumC0600v1.f7997y;
            try {
                String strB = r12.b(str3);
                AbstractC0603w1.b(enumC0600v1, "Device registered, push token = " + strB, null);
                r12.f7692a.getClass();
                C0594t1.c(1, strB);
                return;
            } catch (IOException e7) {
                int iD = R1.d(e7);
                Throwable cause = e7;
                while (cause.getCause() != null && cause.getCause() != cause) {
                    cause = cause.getCause();
                }
                String message = cause.getMessage();
                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"AUTHENTICATION_FAILED".equals(message)) {
                    AbstractC0603w1.b(enumC0600v12, "Error Getting FCM Token", new Exception(e7));
                    if (r12.f7694c) {
                        return;
                    }
                    r12.f7692a.getClass();
                    C0594t1.c(iD, null);
                    return;
                }
                Exception exc = new Exception(e7);
                if (i7 >= 4) {
                    AbstractC0603w1.b(enumC0600v12, "Retry count of 5 exceed! Could not get a FCM Token.", exc);
                } else {
                    AbstractC0603w1.b(enumC0600v1, "'Google Play services' returned " + message + " error. Current retry count: " + i7, exc);
                    if (i7 == 2) {
                        r12.f7692a.getClass();
                        C0594t1.c(iD, null);
                        r12.f7694c = true;
                        return;
                    }
                }
                i7++;
                try {
                    Thread.sleep(10000 * i7);
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            } catch (Throwable th) {
                Exception exc2 = new Exception(th);
                int iD2 = R1.d(th);
                AbstractC0603w1.b(enumC0600v12, "Unknown error getting FCM Token", exc2);
                r12.f7692a.getClass();
                C0594t1.c(iD2, null);
                return;
            }
        }
    }

    public /* synthetic */ RunnableC0570l0(Object obj, Object obj2, int i6) {
        this.f7873w = i6;
        this.f7874x = obj;
        this.f7875y = obj2;
    }
}
