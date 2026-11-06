package b3;

import G3.f;
import P2.e;
import V4.v;
import a3.C0261b;
import android.text.TextUtils;
import com.onesignal.C0594t1;
import com.onesignal.E1;
import d.AbstractC0628i;
import d4.C0656a;
import d4.C0658c;
import f5.j;
import g3.C0731c;
import h5.D;
import h5.InterfaceC0784k;
import h5.r;
import j3.C0875y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import l3.h;
import l3.i;
import m2.C1018C;
import m3.F;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r3.d;
import s4.AbstractC1305a;
import w3.C1478b;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: b3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0343c implements i, InterfaceC0784k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f5930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f5931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f5932y;

    public C0343c(int i6) {
        if (i6 == 11) {
            this.f5930w = new ArrayList();
            this.f5931x = new ArrayList();
            this.f5932y = null;
        } else {
            if (i6 != 12) {
                return;
            }
            String string = UUID.randomUUID().toString();
            this.f5931x = v.f3919e;
            this.f5932y = new ArrayList();
            j jVar = j.f8462z;
            this.f5930w = e.g(string);
        }
    }

    public static void d(ArrayList arrayList, JSONArray jSONArray, a4.b bVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    String string = jSONArray.getString(i6);
                    AbstractC1305a.n(string, "influenceId");
                    arrayList.add(new C0656a(string, bVar));
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    public static void e(C0343c c0343c, d dVar) {
        f(c0343c, "X-CRASHLYTICS-GOOGLE-APP-ID", dVar.f12481a);
        f(c0343c, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        f(c0343c, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.2.0");
        f(c0343c, "Accept", "application/json");
        f(c0343c, "X-CRASHLYTICS-DEVICE-MODEL", dVar.f12482b);
        f(c0343c, "X-CRASHLYTICS-OS-BUILD-VERSION", dVar.f12483c);
        f(c0343c, "X-CRASHLYTICS-OS-DISPLAY-VERSION", dVar.f12484d);
        f(c0343c, "X-CRASHLYTICS-INSTALLATION-ID", ((C0875y) dVar.f12485e).c().f9456a);
    }

    public static void f(C0343c c0343c, String str, String str2) {
        if (str2 != null) {
            ((Map) c0343c.f5932y).put(str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        r7 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (r7.isEmpty() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r6.contains("?") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r6.endsWith("&") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r7 = "&".concat(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return d.AbstractC0628i.i(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        return r6 + "?" + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0029, code lost:
    
        if (r1.getValue() != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        r1 = java.net.URLEncoder.encode((java.lang.String) r1.getValue(), "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r7.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        r1 = (java.util.Map.Entry) r7.next();
        r0.append("&");
        r0.append((java.lang.String) r1.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r1.getValue() == null) goto L5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String j(java.lang.String r6, java.util.Map r7) throws java.io.UnsupportedEncodingException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = ""
            java.lang.String r5 = "UTF-8"
            if (r3 == 0) goto L36
        L2b:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r5)
            goto L37
        L36:
            r1 = r4
        L37:
            r0.append(r1)
            boolean r1 = r7.hasNext()
            java.lang.String r3 = "&"
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r0.append(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L36
            goto L2b
        L5e:
            java.lang.String r7 = r0.toString()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L69
            return r6
        L69:
            java.lang.String r0 = "?"
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L80
            boolean r0 = r6.endsWith(r3)
            if (r0 != 0) goto L7b
            java.lang.String r7 = r3.concat(r7)
        L7b:
            java.lang.String r6 = d.AbstractC0628i.i(r6, r7)
            return r6
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0343c.j(java.lang.String, java.util.Map):java.lang.String");
    }

    public static void m(a4.c cVar, C0261b c0261b, C0261b c0261b2, String str, C0658c c0658c) {
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            c0261b.f5012y = new JSONArray(str);
            if (c0658c != null) {
                c0658c.f8227a = c0261b;
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        c0261b2.f5012y = new JSONArray(str);
        if (c0658c != null) {
            c0658c.f8228b = c0261b2;
        }
    }

    public static C0658c n(a4.c cVar, C0261b c0261b, C0261b c0261b2, String str) {
        C0658c c0658c;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            c0261b.f5011x = new JSONArray(str);
            c0658c = new C0658c(c0261b, null);
        } else {
            if (iOrdinal != 1) {
                return null;
            }
            c0261b2.f5011x = new JSONArray(str);
            c0658c = new C0658c(null, c0261b2);
        }
        return c0658c;
    }

    public static HashMap o(d dVar) {
        HashMap map = new HashMap();
        map.put("build_version", dVar.f12488h);
        map.put("display_version", dVar.f12487g);
        map.put("source", Integer.toString(dVar.f12489i));
        String str = dVar.f12486f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // h5.InterfaceC0784k
    public final Type a() {
        return (Type) this.f5930w;
    }

    @Override // h5.InterfaceC0784k
    public final Object b(D d6) {
        Executor executor = (Executor) this.f5931x;
        return executor == null ? d6 : new r(executor, d6);
    }

    @Override // l3.i
    public final void c(h hVar, int i6) throws IOException {
        try {
            hVar.read((byte[]) this.f5930w, ((int[]) this.f5931x)[0], i6);
            int[] iArr = (int[]) this.f5931x;
            iArr[0] = iArr[0] + i6;
        } finally {
            hVar.close();
        }
    }

    public final G3.b g() {
        String str = ((Long) this.f5931x) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new G3.b((String) this.f5930w, ((Long) this.f5931x).longValue(), (f) this.f5932y);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final F h() {
        String str;
        String str2;
        String str3 = (String) this.f5930w;
        if (str3 != null && (str = (String) this.f5931x) != null && (str2 = (String) this.f5932y) != null) {
            return new F(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.f5930w) == null) {
            sb.append(" arch");
        }
        if (((String) this.f5931x) == null) {
            sb.append(" libraryName");
        }
        if (((String) this.f5932y) == null) {
            sb.append(" buildId");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }

    public final C0343c i(HashMap map) {
        C1018C c1018c = (C1018C) this.f5931x;
        String str = (String) this.f5930w;
        c1018c.getClass();
        C0343c c0343c = new C0343c();
        c0343c.f5930w = str;
        c0343c.f5931x = map;
        HashMap map2 = new HashMap();
        c0343c.f5932y = map2;
        map2.put("User-Agent", "Crashlytics Android SDK/19.2.0");
        ((Map) c0343c.f5932y).put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return c0343c;
    }

    public final void k(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f5930w;
        z3.f fVar = new z3.f(byteArrayOutputStream, map, (Map) this.f5931x, (InterfaceC1480d) this.f5932y);
        if (obj == null) {
            return;
        }
        InterfaceC1480d interfaceC1480d = (InterfaceC1480d) map.get(obj.getClass());
        if (interfaceC1480d != null) {
            interfaceC1480d.a(obj, fVar);
        } else {
            throw new C1478b("No encoder for " + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final S3.e l() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0343c.l():S3.e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220  */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v175 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            Method dump skipped, instruction units count: 1407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0343c.p():boolean");
    }

    public final JSONObject q(S3.e eVar) {
        int i6 = eVar.f3246x;
        ((C0731c) this.f5932y).g("Settings response code was: " + i6);
        if (i6 != 200 && i6 != 201 && i6 != 202 && i6 != 203) {
            C0731c c0731c = (C0731c) this.f5932y;
            StringBuilder sbL = H1.a.l("Settings request failed; (status: ", i6, ") from ");
            sbL.append((String) this.f5930w);
            c0731c.d(sbL.toString(), null);
            return null;
        }
        String str = eVar.f3245w;
        try {
            return new JSONObject(str);
        } catch (Exception e6) {
            ((C0731c) this.f5932y).h("Failed to parse settings JSON from " + ((String) this.f5930w), e6);
            ((C0731c) this.f5932y).h("Settings response " + str, null);
            return null;
        }
    }

    public final boolean r() {
        Object obj = this.f5932y;
        C0594t1 c0594t1 = (C0594t1) obj;
        ((C0594t1) obj).getClass();
        String str = E1.f7517a;
        ((C0594t1) this.f5932y).getClass();
        c0594t1.getClass();
        return E1.b(str, "PREFS_OS_OUTCOMES_V2", false);
    }

    public /* synthetic */ C0343c(Object obj, Object obj2, Object obj3) {
        this.f5932y = obj;
        this.f5930w = obj2;
        this.f5931x = obj3;
    }
}
