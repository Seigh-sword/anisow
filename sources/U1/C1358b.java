package u1;

import C1.n;
import N.C0;
import N.InterfaceC0107s;
import T1.r;
import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.lifecycle.C0323x;
import c0.x;
import com.bumptech.glide.o;
import com.google.android.gms.internal.measurement.C0393c;
import com.google.android.gms.internal.measurement.C0396c2;
import com.google.android.gms.internal.measurement.C0417g;
import com.google.android.gms.internal.measurement.C0465o;
import com.google.android.gms.internal.measurement.C0488s;
import com.google.android.gms.internal.measurement.C0516w3;
import com.google.android.gms.internal.measurement.F;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.InterfaceC0459n;
import com.google.android.gms.internal.measurement.J2;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.X1;
import h0.W;
import i.C0803c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import m1.C1010h;
import m2.AbstractC1078w;
import m2.C1052k1;
import m2.G0;
import m2.RunnableC1061n1;
import m2.r1;
import q2.InterfaceC1258a;
import s.C1280b;
import t0.AbstractC1332d;
import v0.C1389b0;
import w1.C1464h;
import w1.C1466j;
import w1.InterfaceC1468l;
import w1.InterfaceC1470n;
import x1.C1488d;

/* JADX INFO: renamed from: u1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1358b implements InterfaceC1470n, C1.g, InterfaceC1258a, InterfaceC0107s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f12822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f12823y;

    public C1358b(int i6) {
        this.f12821w = i6;
        if (i6 == 12) {
            this.f12823y = new HashMap();
            return;
        }
        if (i6 == 19) {
            this.f12822x = new TreeMap();
            this.f12823y = new TreeMap();
            return;
        }
        if (i6 == 20) {
            this.f12822x = new HashMap();
            this.f12823y = new C0488s(6);
            n(new C0488s(0));
            n(new C0488s(1));
            n(new C0488s(2));
            n(new C0488s(3));
            n(new C0488s(4));
            n(new C0488s(5));
            n(new C0488s(7));
            return;
        }
        switch (i6) {
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                this.f12822x = new ArrayList();
                this.f12823y = new HashMap();
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                this.f12822x = new AtomicReference();
                this.f12823y = new C1280b();
                break;
        }
    }

    @Override // C1.g
    public final Object a() {
        return (ConnectivityManager) ((Context) this.f12822x).getSystemService("connectivity");
    }

    @Override // q2.InterfaceC1258a
    public final Object b(q2.i iVar) {
        Bundle bundle;
        T1.b bVar = (T1.b) this.f12822x;
        Bundle bundle2 = (Bundle) this.f12823y;
        bVar.getClass();
        return (iVar.f() && (bundle = (Bundle) iVar.d()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).g(r.f3450w, T1.c.f3416x) : iVar;
    }

    public final void c(Object obj, String str) {
        ((List) this.f12822x).add(str + "=" + String.valueOf(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.cct.CctBackendFactory d(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C1358b.d(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public final synchronized List e(String str) {
        List arrayList;
        try {
            if (!((List) this.f12822x).contains(str)) {
                ((List) this.f12822x).add(str);
            }
            arrayList = (List) ((Map) this.f12823y).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((Map) this.f12823y).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final o f(Context context, com.bumptech.glide.b bVar, C0323x c0323x, W w5, boolean z5) {
        n.a();
        n.a();
        o oVar = (o) ((Map) this.f12822x).get(c0323x);
        if (oVar != null) {
            return oVar;
        }
        C1464h c1464h = new C1464h(c0323x);
        o oVarL = ((InterfaceC1468l) this.f12823y).l(bVar, c1464h, new C1358b(this, w5, 1), context);
        ((Map) this.f12822x).put(c0323x, oVarL);
        c1464h.p(new C1466j(this, c0323x));
        if (z5) {
            oVarL.i();
        }
        return oVarL;
    }

    public final synchronized ArrayList g(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((List) this.f12822x).iterator();
        while (it.hasNext()) {
            List<C1488d> list = (List) ((Map) this.f12823y).get((String) it.next());
            if (list != null) {
                for (C1488d c1488d : list) {
                    if (c1488d.f13671a.isAssignableFrom(cls) && cls2.isAssignableFrom(c1488d.f13672b) && !arrayList.contains(c1488d.f13672b)) {
                        arrayList.add(c1488d.f13672b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final byte[] h(int i6) {
        Object obj = this.f12823y;
        return ((C1010h) obj) == null ? new byte[i6] : (byte[]) ((C1010h) obj).c(i6, byte[].class);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Throwable r8) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C1358b.i(java.lang.Throwable):void");
    }

    public final int j(Context context, V1.b bVar) {
        AbstractC1332d.m(context);
        AbstractC1332d.m(bVar);
        int iM = bVar.m();
        int iB = ((SparseIntArray) this.f12822x).get(iM, -1);
        if (iB == -1) {
            iB = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= ((SparseIntArray) this.f12822x).size()) {
                    iB = -1;
                    break;
                }
                int iKeyAt = ((SparseIntArray) this.f12822x).keyAt(i6);
                if (iKeyAt > iM && ((SparseIntArray) this.f12822x).get(iKeyAt) == 0) {
                    break;
                }
                i6++;
            }
            if (iB == -1) {
                iB = ((U1.f) this.f12823y).b(context, iM);
            }
            ((SparseIntArray) this.f12822x).put(iM, iB);
        }
        return iB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x082f, code lost:
    
        if (r13.c().booleanValue() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x087d, code lost:
    
        if (r13.c().booleanValue() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0919, code lost:
    
        if (((com.google.android.gms.internal.measurement.C0423h) r2).f6833x.equals("break") == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:?, code lost:
    
        return r12.j((com.google.android.gms.internal.measurement.InterfaceC0459n) r0.get(1));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0ae3  */
    /* JADX WARN: Type inference failed for: r12v0, types: [P0.h] */
    /* JADX WARN: Type inference failed for: r12v137, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r12v178 */
    /* JADX WARN: Type inference failed for: r12v179 */
    /* JADX WARN: Type inference failed for: r12v67, types: [P0.h] */
    /* JADX WARN: Type inference failed for: r12v94, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r13v103, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r13v109, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r13v113, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r13v18, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r13v195, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r13v198, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r13v209 */
    /* JADX WARN: Type inference failed for: r13v235, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r13v242, types: [com.google.android.gms.internal.measurement.m] */
    /* JADX WARN: Type inference failed for: r13v246 */
    /* JADX WARN: Type inference failed for: r13v288, types: [com.google.android.gms.internal.measurement.p] */
    /* JADX WARN: Type inference failed for: r13v294 */
    /* JADX WARN: Type inference failed for: r13v295 */
    /* JADX WARN: Type inference failed for: r13v39, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r13v62, types: [com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.n, com.google.android.gms.internal.measurement.o] */
    /* JADX WARN: Type inference failed for: r13v74, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v52, types: [com.google.android.gms.internal.measurement.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0459n k(P0.h r12, com.google.android.gms.internal.measurement.InterfaceC0459n r13) {
        /*
            Method dump skipped, instruction units count: 3406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C1358b.k(P0.h, com.google.android.gms.internal.measurement.n):com.google.android.gms.internal.measurement.n");
    }

    public final Object l() {
        String str;
        C0396c2 c0396c2 = (C0396c2) this.f12822x;
        String str2 = (String) this.f12823y;
        ContentResolver contentResolver = ((Context) c0396c2.f6775x).getContentResolver();
        V1 v12 = (V1) S1.f6680a;
        if (contentResolver == null) {
            v12.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (v12) {
            try {
                int i6 = 1;
                if (v12.f6709b == null) {
                    v12.f6708a.set(false);
                    v12.f6709b = new HashMap(16, 1.0f);
                    v12.f6714g = new Object();
                    contentResolver.registerContentObserver(R1.f6670a, true, new x(v12, i6));
                } else if (v12.f6708a.getAndSet(false)) {
                    v12.f6709b.clear();
                    v12.f6710c.clear();
                    v12.f6711d.clear();
                    v12.f6712e.clear();
                    v12.f6713f.clear();
                    v12.f6714g = new Object();
                    v12.f6715h = false;
                }
                Object obj = v12.f6714g;
                String str3 = null;
                if (!v12.f6709b.containsKey(str2)) {
                    for (String str4 : v12.f6716i) {
                        if (str2.startsWith(str4)) {
                            if (!v12.f6715h) {
                                String[] strArr = v12.f6716i;
                                try {
                                    J2 j22 = v12.f6717j;
                                    J2 j23 = new J2();
                                    j22.getClass();
                                    HashMap mapH = J2.h(contentResolver, strArr, j23);
                                    if (!mapH.isEmpty()) {
                                        Set setKeySet = mapH.keySet();
                                        setKeySet.removeAll(v12.f6710c.keySet());
                                        setKeySet.removeAll(v12.f6711d.keySet());
                                        setKeySet.removeAll(v12.f6712e.keySet());
                                        setKeySet.removeAll(v12.f6713f.keySet());
                                    }
                                    if (!mapH.isEmpty()) {
                                        if (v12.f6709b.isEmpty()) {
                                            v12.f6709b = mapH;
                                        } else {
                                            v12.f6709b.putAll(mapH);
                                        }
                                    }
                                    v12.f6715h = true;
                                } catch (X1 unused) {
                                }
                                if (v12.f6709b.containsKey(str2) && (str = (String) v12.f6709b.get(str2)) != null) {
                                    str3 = str;
                                }
                            }
                        }
                    }
                    try {
                        v12.f6717j.getClass();
                        String strG = J2.g(contentResolver, str2);
                        if (strG != null && strG.equals(null)) {
                            strG = null;
                        }
                        synchronized (v12) {
                            try {
                                if (obj == v12.f6714g) {
                                    v12.f6709b.put(str2, strG);
                                }
                            } finally {
                            }
                        }
                        if (strG != null) {
                            return strG;
                        }
                        return null;
                    } catch (X1 unused2) {
                        return null;
                    }
                }
                String str5 = (String) v12.f6709b.get(str2);
                if (str5 != null) {
                    str3 = str5;
                }
                return str3;
            } finally {
            }
        }
    }

    public final void m(P0.h hVar, C0803c c0803c) {
        C0516w3 c0516w3 = new C0516w3(c0803c);
        for (Integer num : ((TreeMap) this.f12822x).keySet()) {
            C0393c c0393c = (C0393c) ((C0393c) c0803c.f9278y).clone();
            InterfaceC0459n interfaceC0459nA = ((C0465o) ((TreeMap) this.f12822x).get(num)).a(hVar, Collections.singletonList(c0516w3));
            int iQ = interfaceC0459nA instanceof C0417g ? F2.q(interfaceC0459nA.p().doubleValue()) : -1;
            if (iQ == 2 || iQ == -1) {
                c0803c.f9278y = c0393c;
            }
        }
        Iterator it = ((TreeMap) this.f12823y).keySet().iterator();
        while (it.hasNext()) {
            InterfaceC0459n interfaceC0459nA2 = ((C0465o) ((TreeMap) this.f12823y).get((Integer) it.next())).a(hVar, Collections.singletonList(c0516w3));
            if (interfaceC0459nA2 instanceof C0417g) {
                F2.q(interfaceC0459nA2.p().doubleValue());
            }
        }
    }

    public final void n(C0488s c0488s) {
        Iterator it = c0488s.f6963a.iterator();
        while (it.hasNext()) {
            ((Map) this.f12822x).put(((F) it.next()).toString(), c0488s);
        }
    }

    public final void o() {
        switch (this.f12821w) {
            case 25:
                SparseArray sparseArrayB = ((G0) this.f12823y).p().B();
                r1 r1Var = (r1) this.f12822x;
                sparseArrayB.put(r1Var.f11075y, Long.valueOf(r1Var.f11074x));
                ((G0) this.f12823y).p().v(sparseArrayB);
                break;
            default:
                ((C1052k1) this.f12823y).r();
                RunnableC1061n1 runnableC1061n1 = (RunnableC1061n1) this.f12822x;
                if (runnableC1061n1 != null) {
                    ((C1052k1) this.f12823y).f11016y.removeCallbacks(runnableC1061n1);
                }
                ((C1052k1) this.f12823y).p().f10816P.a(false);
                C1052k1 c1052k1 = (C1052k1) this.f12823y;
                c1052k1.r();
                c1052k1.f11017z = false;
                if (((C1052k1) this.f12823y).n().D(null, AbstractC1078w.f11141K0) && ((C1052k1) this.f12823y).u().f10620I) {
                    ((C1052k1) this.f12823y).f().f10723J.d("Retrying trigger URI registration in foreground");
                    ((C1052k1) this.f12823y).u().U();
                    break;
                }
                break;
        }
    }

    @Override // N.InterfaceC0107s
    public final C0 p(View view, C0 c02) {
        H2.o oVar = (H2.o) this.f12822x;
        C1389b0 c1389b0 = (C1389b0) this.f12823y;
        C1389b0 c1389b02 = new C1389b0();
        c1389b02.f13084a = c1389b0.f13084a;
        c1389b02.f13085b = c1389b0.f13085b;
        c1389b02.f13086c = c1389b0.f13086c;
        c1389b02.f13087d = c1389b0.f13087d;
        return oVar.f(view, c02, c1389b02);
    }

    public final String toString() {
        switch (this.f12821w) {
            case 17:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f12823y.getClass().getSimpleName());
                sb.append('{');
                int size = ((List) this.f12822x).size();
                for (int i6 = 0; i6 < size; i6++) {
                    sb.append((String) ((List) this.f12822x).get(i6));
                    if (i6 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C1358b(B2.f fVar, B2.f fVar2) {
        this.f12821w = 27;
        fVar.getClass();
        fVar2.getClass();
        if (0.0f > 0.0f) {
            throw new IllegalArgumentException();
        }
        this.f12822x = fVar;
        this.f12823y = fVar2;
    }

    public C1358b(U1.f fVar) {
        this.f12821w = 18;
        this.f12822x = new SparseIntArray();
        AbstractC1332d.m(fVar);
        this.f12823y = fVar;
    }

    public C1358b(Context context) {
        this.f12821w = 11;
        this.f12823y = null;
        this.f12822x = context;
    }

    public C1358b(IBinder iBinder) throws RemoteException {
        this.f12821w = 13;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f12822x = new Messenger(iBinder);
            this.f12823y = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f12823y = new T1.h(iBinder);
            this.f12822x = null;
        }
    }

    public /* synthetic */ C1358b(Object obj) {
        this.f12821w = 17;
        AbstractC1332d.m(obj);
        this.f12823y = obj;
        this.f12822x = new ArrayList();
    }

    public /* synthetic */ C1358b(Object obj, int i6, Object obj2) {
        this.f12821w = i6;
        this.f12822x = obj;
        this.f12823y = obj2;
    }

    public /* synthetic */ C1358b(Object obj, Object obj2, int i6) {
        this.f12821w = i6;
        this.f12823y = obj;
        this.f12822x = obj2;
    }

    public C1358b(C1052k1 c1052k1) {
        this.f12821w = 26;
        this.f12823y = c1052k1;
    }

    public C1358b(InterfaceC1468l interfaceC1468l) {
        this.f12821w = 2;
        this.f12822x = new HashMap();
        this.f12823y = interfaceC1468l;
    }
}
