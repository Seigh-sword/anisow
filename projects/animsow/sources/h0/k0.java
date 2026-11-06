package h0;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import android.view.View;
import b2.AbstractC0338c;
import d.AbstractC0628i;
import h1.C0764d;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import m2.C1032e;
import m2.C1051k0;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f8832A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f8833B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f8834C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f8836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f8837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f8838z;

    public /* synthetic */ k0(Object obj, int i6, Serializable serializable, Object obj2, Object obj3, Object obj4, int i7) {
        this.f8835w = i7;
        this.f8834C = obj;
        this.f8836x = i6;
        this.f8837y = serializable;
        this.f8838z = obj2;
        this.f8832A = obj3;
        this.f8833B = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m2.N n5;
        char c6;
        switch (this.f8835w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            case 1:
                m2.Y y5 = ((C1051k0) ((m2.N) this.f8834C).f1668w).f10982D;
                C1051k0.e(y5);
                if (!y5.f11239x) {
                    Log.println(6, ((m2.N) this.f8834C).E(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                m2.N n6 = (m2.N) this.f8834C;
                if (n6.f10724y == 0) {
                    C1032e c1032eN = n6.n();
                    if (c1032eN.f10884A == null) {
                        synchronized (c1032eN) {
                            try {
                                if (c1032eN.f10884A == null) {
                                    ApplicationInfo applicationInfo = c1032eN.a().getApplicationInfo();
                                    String strA = AbstractC0338c.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c1032eN.f10884A = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (c1032eN.f10884A == null) {
                                        c1032eN.f10884A = Boolean.TRUE;
                                        c1032eN.f().f10715B.d("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c1032eN.f10884A.booleanValue()) {
                        n5 = (m2.N) this.f8834C;
                        c6 = 'C';
                    } else {
                        n5 = (m2.N) this.f8834C;
                        c6 = 'c';
                    }
                    n5.f10724y = c6;
                    break;
                }
                m2.N n7 = (m2.N) this.f8834C;
                if (n7.f10725z < 0) {
                    n7.f10725z = 106000L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.f8836x);
                m2.N n8 = (m2.N) this.f8834C;
                char c7 = n8.f10724y;
                long j6 = n8.f10725z;
                String strW = m2.N.w(true, (String) this.f8837y, this.f8838z, this.f8832A, this.f8833B);
                StringBuilder sb = new StringBuilder("2");
                sb.append(cCharAt);
                sb.append(c7);
                sb.append(j6);
                String strM = AbstractC0628i.m(sb, ":", strW);
                if (strM.length() > 1024) {
                    strM = ((String) this.f8837y).substring(0, 1024);
                }
                C0764d c0764d = y5.f10802B;
                if (c0764d != null) {
                    ((m2.Y) c0764d.f8951x).r();
                    if (((m2.Y) c0764d.f8951x).A().getLong((String) c0764d.f8952y, 0L) == 0) {
                        c0764d.f();
                    }
                    if (strM == null) {
                        strM = "";
                    }
                    long j7 = ((m2.Y) c0764d.f8951x).A().getLong((String) c0764d.f8953z, 0L);
                    if (j7 <= 0) {
                        SharedPreferences.Editor editorEdit = ((m2.Y) c0764d.f8951x).A().edit();
                        editorEdit.putString((String) c0764d.f8949A, strM);
                        editorEdit.putLong((String) c0764d.f8953z, 1L);
                        editorEdit.apply();
                        return;
                    }
                    long j8 = j7 + 1;
                    i = (((m2.Y) c0764d.f8951x).q().F0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j8 ? 1 : 0;
                    SharedPreferences.Editor editorEdit2 = ((m2.Y) c0764d.f8951x).A().edit();
                    if (i != 0) {
                        editorEdit2.putString((String) c0764d.f8949A, strM);
                    }
                    editorEdit2.putLong((String) c0764d.f8953z, j8);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((m2.T) this.f8837y).g((String) this.f8833B, this.f8836x, (Throwable) this.f8838z, (byte[]) this.f8832A, (Map) this.f8834C);
                return;
        }
        while (i < this.f8836x) {
            View view = (View) ((ArrayList) this.f8837y).get(i);
            String str2 = (String) ((ArrayList) this.f8838z).get(i);
            WeakHashMap weakHashMap = N.V.f1964a;
            N.I.v(view, str2);
            N.I.v((View) ((ArrayList) this.f8832A).get(i), (String) ((ArrayList) this.f8833B).get(i));
            i++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(String str, m2.T t5, int i6, IOException iOException, byte[] bArr, Map map) {
        this(str, t5, i6, iOException, bArr, map, 0);
        this.f8835w = 2;
    }

    public k0(String str, m2.T t5, int i6, IOException iOException, byte[] bArr, Map map, int i7) {
        this.f8835w = 2;
        AbstractC1332d.m(t5);
        this.f8837y = t5;
        this.f8836x = i6;
        this.f8838z = iOException;
        this.f8832A = bArr;
        this.f8833B = str;
        this.f8834C = map;
    }
}
