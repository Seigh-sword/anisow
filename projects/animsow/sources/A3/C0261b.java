package a3;

import Q3.A;
import Q3.n;
import S3.q;
import S3.z;
import V4.G;
import V4.I;
import V4.J;
import V4.t;
import Y2.g;
import Z.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import b3.C0343c;
import com.onesignal.C0594t1;
import d.AbstractC0628i;
import f5.i;
import h5.D;
import h5.InterfaceC0785l;
import h5.InterfaceC0790q;
import h5.d0;
import j3.AbstractC0857g;
import j3.C0863m;
import j3.C0871u;
import j3.CallableC0861k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C1243i;
import p3.C1249a;
import p3.C1251c;
import q2.h;
import q2.s;
import r3.C1275a;
import s4.AbstractC1305a;
import w3.C1479c;
import z3.C1531a;
import z3.e;

/* JADX INFO: renamed from: a3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0261b implements h, q, InterfaceC0790q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f5011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f5012y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0261b() {
        this(new JSONArray(), new JSONArray(), 13);
        this.f5010w = 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a3.C0261b a(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            a3.b r2 = new a3.b     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 9
            r2.<init>(r5, r0, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0261b.a(android.content.Context):a3.b");
    }

    public final C1479c b() {
        return new C1479c((String) this.f5011x, ((Map) this.f5012y) == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap((Map) this.f5012y)));
    }

    public final void c(Throwable th) {
        try {
            ((InterfaceC0785l) this.f5011x).b((D) this.f5012y, th);
        } catch (Throwable th2) {
            d0.n(th2);
            th2.printStackTrace();
        }
    }

    public final void d() {
        try {
            C1251c c1251c = (C1251c) this.f5012y;
            String str = (String) this.f5011x;
            c1251c.getClass();
            new File((File) c1251c.f12320d, str).createNewFile();
        } catch (IOException e6) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + ((String) this.f5011x), e6);
        }
    }

    public final ArrayList e(int i6) {
        AbstractC0628i.o(i6, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (u.h.a(i6, 3)) {
            return arrayList;
        }
        Z3.a aVarI = u.h.a(i6, 2) ? i() : null;
        if (aVarI != null) {
            arrayList.add(aVarI);
        }
        arrayList.add(g());
        return arrayList;
    }

    public final File f() {
        if (((File) this.f5011x) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f5011x) == null) {
                        g gVar = (g) this.f5012y;
                        gVar.a();
                        this.f5011x = new File(gVar.f4816a.getFilesDir(), "PersistedInstallation." + ((g) this.f5012y).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f5011x;
    }

    public final Z3.a g() {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f5011x;
        String str = Y3.a.f4838a;
        Object obj = concurrentHashMap.get(Y3.a.f4838a);
        AbstractC1305a.l(obj);
        return (Z3.a) obj;
    }

    @Override // S3.q
    public final Object h() {
        try {
            return z.f3292a.a((Class) this.f5011x);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to create instance of " + ((Class) this.f5011x) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e6);
        }
    }

    public final Z3.a i() {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f5011x;
        String str = Y3.a.f4838a;
        Object obj = concurrentHashMap.get(Y3.a.f4839b);
        AbstractC1305a.l(obj);
        return (Z3.a) obj;
    }

    public final C0343c j() {
        String str;
        if (((C0343c) this.f5012y) == null) {
            C0343c c0343c = new C0343c();
            c0343c.f5932y = this;
            int iD = AbstractC0857g.d((Context) this.f5011x, "com.google.firebase.crashlytics.unity_version", "string");
            if (iD != 0) {
                c0343c.f5930w = "Unity";
                c0343c.f5931x = ((Context) this.f5011x).getResources().getString(iD);
                str = "Unity Editor version is: " + ((String) c0343c.f5931x);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", str, null);
                }
                this.f5012y = c0343c;
            } else if (((Context) this.f5011x).getAssets() == null) {
                c0343c.f5930w = null;
                c0343c.f5931x = null;
                this.f5012y = c0343c;
            } else {
                try {
                    InputStream inputStreamOpen = ((Context) this.f5011x).getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    c0343c.f5930w = "Flutter";
                    c0343c.f5931x = null;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        str = "Development platform is: Flutter";
                        Log.v("FirebaseCrashlytics", str, null);
                    }
                } catch (IOException unused) {
                    c0343c.f5930w = null;
                    c0343c.f5931x = null;
                }
                this.f5012y = c0343c;
            }
        }
        return (C0343c) this.f5012y;
    }

    @Override // h5.InterfaceC0790q
    public final Object k(Object obj) {
        Charset charsetForName;
        J j6 = (J) obj;
        n nVar = (n) this.f5011x;
        I i6 = j6.f3798w;
        if (i6 == null) {
            i iVarG = j6.g();
            t tVarC = j6.c();
            if (tVarC != null) {
                charsetForName = StandardCharsets.UTF_8;
                try {
                    String str = tVarC.f3916c;
                    if (str != null) {
                        charsetForName = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            } else {
                charsetForName = StandardCharsets.UTF_8;
            }
            i6 = new I(iVarG, charsetForName);
            j6.f3798w = i6;
        }
        nVar.getClass();
        X3.a aVar = new X3.a(i6);
        aVar.f4685x = false;
        try {
            Object objB = ((A) this.f5012y).b(aVar);
            if (aVar.W() == 10) {
                return objB;
            }
            throw new Q3.q("JSON document was not fully consumed.");
        } finally {
            j6.close();
        }
    }

    @Override // q2.h
    public final s l(Object obj) {
        switch (this.f5010w) {
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                if (((C1275a) obj) == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return f2.h.l(null);
                }
                q2.i[] iVarArr = new q2.i[2];
                iVarArr[0] = C0863m.a(((CallableC0861k) this.f5012y).f9482f);
                CallableC0861k callableC0861k = (CallableC0861k) this.f5012y;
                C0863m c0863m = callableC0861k.f9482f;
                iVarArr[1] = c0863m.f9498m.t(callableC0861k.f9481e ? (String) this.f5011x : null, c0863m.f9490e.f9655a);
                return f2.h.J(Arrays.asList(iVarArr));
            default:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    C0871u c0871u = ((C0863m) this.f5012y).f9487b;
                    if (zBooleanValue) {
                        ((q2.j) c0871u.f9547h).c(null);
                        return ((q2.i) this.f5011x).g(((C0863m) this.f5012y).f9490e.f9655a, new C1243i(22, this));
                    }
                    c0871u.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = C1251c.s(((File) ((C0863m) this.f5012y).f9492g.f12320d).listFiles(C0863m.f9485r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                C1251c c1251c = ((C1249a) ((C0863m) this.f5012y).f9498m.f12319c).f12313b;
                C1249a.a(C1251c.s(((File) c1251c.f12322f).listFiles()));
                C1249a.a(C1251c.s(((File) c1251c.f12323g).listFiles()));
                C1249a.a(C1251c.s(((File) c1251c.f12324h).listFiles()));
                ((C0863m) this.f5012y).f9502q.c(null);
                return f2.h.l(null);
        }
    }

    public final void m(F3.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f620a);
            jSONObject.put("Status", aVar.f621b.ordinal());
            jSONObject.put("AuthToken", aVar.f622c);
            jSONObject.put("RefreshToken", aVar.f623d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f625f);
            jSONObject.put("ExpiresInSecs", aVar.f624e);
            jSONObject.put("FisError", aVar.f626g);
            g gVar = (g) this.f5012y;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f4816a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(f())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final void n(int i6, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i6 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            h3.b bVar = (h3.b) ("clx".equals(bundle2.getString("_o")) ? this.f5011x : this.f5012y);
            if (bVar == null) {
                return;
            }
            bVar.n(string, bundle2);
        }
    }

    public final void o(G g4) {
        try {
            try {
                ((InterfaceC0785l) this.f5011x).a((D) this.f5012y, ((D) this.f5012y).e(g4));
            } catch (Throwable th) {
                d0.n(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            d0.n(th2);
            c(th2);
        }
    }

    public final F3.a p() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(f());
            while (true) {
                try {
                    int i6 = fileInputStream.read(bArr, 0, 16384);
                    if (i6 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i6);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i7 = F3.a.f619h;
        C1251c c1251c = new C1251c(12);
        c1251c.f12323g = 0L;
        c1251c.v(F3.c.f632w);
        c1251c.f12322f = 0L;
        c1251c.f12318b = strOptString;
        c1251c.v(F3.c.values()[iOptInt]);
        c1251c.f12320d = strOptString2;
        c1251c.f12321e = strOptString3;
        c1251c.f12323g = Long.valueOf(jOptLong);
        c1251c.f12322f = Long.valueOf(jOptLong2);
        c1251c.f12324h = strOptString4;
        return c1251c.j();
    }

    public final void q() {
        try {
            ((FileLock) this.f5012y).release();
            ((FileChannel) this.f5011x).close();
        } catch (IOException e6) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e6);
        }
    }

    public final JSONObject r() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification_ids", (JSONArray) this.f5011x).put("in_app_message_ids", (JSONArray) this.f5012y);
        AbstractC1305a.n(jSONObjectPut, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return jSONObjectPut;
    }

    public final void s(C1531a c1531a) {
        if (((Map) this.f5012y) == null) {
            this.f5012y = new HashMap();
        }
        ((Map) this.f5012y).put(e.class, c1531a);
    }

    public final String toString() {
        switch (this.f5010w) {
            case 13:
                return "OSOutcomeSourceBody{notificationIds=" + ((JSONArray) this.f5011x) + ", inAppMessagesIds=" + ((JSONArray) this.f5012y) + '}';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0261b(int i6) {
        this();
        this.f5010w = i6;
        if (i6 == 6) {
            this.f5011x = new AtomicInteger();
            this.f5012y = new AtomicInteger();
        } else {
            if (i6 != 13) {
                return;
            }
        }
    }

    public /* synthetic */ C0261b(int i6, Object obj) {
        this.f5010w = i6;
        this.f5011x = obj;
        this.f5012y = null;
    }

    public C0261b(g gVar) {
        this.f5010w = 10;
        this.f5012y = gVar;
    }

    public C0261b(C0594t1 c0594t1, C0594t1 c0594t12, C0594t1 c0594t13) {
        this.f5010w = 12;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f5011x = concurrentHashMap;
        K1.b bVar = new K1.b(c0594t1);
        this.f5012y = bVar;
        concurrentHashMap.put(Y3.a.f4838a, new Z3.b(bVar, c0594t12, c0594t13, 0));
        ((ConcurrentHashMap) this.f5011x).put(Y3.a.f4839b, new Z3.b((K1.b) this.f5012y, c0594t12, c0594t13, 1));
    }

    public /* synthetic */ C0261b(Object obj, int i6, Object obj2) {
        this.f5010w = i6;
        this.f5011x = obj2;
        this.f5012y = obj;
    }

    public /* synthetic */ C0261b(Object obj, Object obj2, int i6) {
        this.f5010w = i6;
        this.f5011x = obj;
        this.f5012y = obj2;
    }
}
