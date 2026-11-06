package j3;

import a3.C0261b;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import d.AbstractC0628i;
import g3.C0730b;
import g3.C0731c;
import g3.InterfaceC0729a;
import h3.InterfaceC0773a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k3.AbstractC0895a;
import k3.C0899e;
import l3.C0941d;
import l3.C0942e;
import m3.C1106j0;
import m3.C1112m0;
import m3.C1114n0;
import m3.C1116o0;
import m3.C1118p0;
import m3.J;
import m3.K;
import m3.L;
import m3.N;
import m3.O0;
import m3.P0;
import n3.C1156c;
import p3.C1249a;
import p3.C1251c;

/* JADX INFO: renamed from: j3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0863m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0858h f9485r = new C0858h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0871u f9487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0261b f9488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1251c f9489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0899e f9490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0875y f9491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1251c f9492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.support.v4.media.b f9493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0942e f9494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC0729a f9495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0773a f9496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0860j f9497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1251c f9498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0870t f9499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q2.j f9500o = new q2.j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q2.j f9501p = new q2.j();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q2.j f9502q = new q2.j();

    public C0863m(Context context, C0875y c0875y, C0871u c0871u, C1251c c1251c, C0261b c0261b, android.support.v4.media.b bVar, C1251c c1251c2, C0942e c0942e, C1251c c1251c3, InterfaceC0729a interfaceC0729a, InterfaceC0773a interfaceC0773a, C0860j c0860j, C0899e c0899e) {
        new AtomicBoolean(false);
        this.f9486a = context;
        this.f9491f = c0875y;
        this.f9487b = c0871u;
        this.f9492g = c1251c;
        this.f9488c = c0261b;
        this.f9493h = bVar;
        this.f9489d = c1251c2;
        this.f9494i = c0942e;
        this.f9495j = interfaceC0729a;
        this.f9496k = interfaceC0773a;
        this.f9497l = c0860j;
        this.f9498m = c1251c3;
        this.f9490e = c0899e;
    }

    public static q2.s a(C0863m c0863m) {
        q2.s sVarF;
        c0863m.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C1251c.s(((File) c0863m.f9492g.f12320d).listFiles(f9485r))) {
            try {
                long j6 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    sVarF = f2.h.l(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    sVarF = f2.h.f(new ScheduledThreadPoolExecutor(1), new CallableC0862l(c0863m, j6));
                }
                arrayList.add(sVarF);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return f2.h.J(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f() throws java.io.IOException {
        /*
            java.lang.Class<j3.m> r0 = j3.C0863m.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L12
            java.lang.String r0 = "Couldn't get Class Loader"
            android.util.Log.w(r2, r0, r1)
        L10:
            r0 = r1
            goto L20
        L12:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L20
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r2, r0, r1)
            goto L10
        L20:
            if (r0 != 0) goto L23
            return r1
        L23:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = "Read version control info"
            android.util.Log.d(r2, r3, r1)
        L2f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L38:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L44
            r1.write(r2, r5, r3)
            goto L38
        L44:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C0863m.f():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x043d A[PHI: r0 r29
      0x043d: PHI (r0v92 java.lang.String) = (r0v91 java.lang.String), (r0v98 java.lang.String) binds: [B:142:0x0453, B:139:0x043b] A[DONT_GENERATE, DONT_INLINE]
      0x043d: PHI (r29v3 java.util.ArrayList) = (r29v2 java.util.ArrayList), (r29v4 java.util.ArrayList) binds: [B:142:0x0453, B:139:0x043b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r31, J0.l r32, boolean r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C0863m.b(boolean, J0.l, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        Integer num;
        Map mapUnmodifiableMap;
        List listUnmodifiableList;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strQ = AbstractC0628i.q("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strQ, null);
        }
        Locale locale = Locale.US;
        C0875y c0875y = this.f9491f;
        android.support.v4.media.b bVar = this.f9493h;
        C1114n0 c1114n0 = new C1114n0(c0875y.f9560c, (String) bVar.f5070f, (String) bVar.f5071g, c0875y.c().f9456a, AbstractC0628i.b(((String) bVar.f5068d) != null ? 4 : 1), (C0261b) bVar.f5072h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        C1118p0 c1118p0 = new C1118p0(str3, str4, AbstractC0857g.g());
        Context context = this.f9486a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        EnumC0856f enumC0856f = EnumC0856f.f9465w;
        String str5 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str5);
        EnumC0856f enumC0856f2 = EnumC0856f.f9465w;
        if (!zIsEmpty) {
            EnumC0856f enumC0856f3 = (EnumC0856f) EnumC0856f.f9466x.get(str5.toLowerCase(locale));
            if (enumC0856f3 != null) {
                enumC0856f2 = enumC0856f3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = enumC0856f2.ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = AbstractC0857g.a(context);
        boolean zF = AbstractC0857g.f();
        int iC = AbstractC0857g.c();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        ((C0730b) this.f9495j).d(str, "Crashlytics Android SDK/19.2.0", jCurrentTimeMillis, new C1112m0(c1114n0, c1118p0, new C1116o0(iOrdinal, str6, iAvailableProcessors, jA, blockCount, zF, iC, str7, str8)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
        } else {
            C1251c c1251c = this.f9489d;
            synchronized (((String) c1251c.f12318b)) {
                try {
                    c1251c.f12318b = str;
                    C0941d c0941d = (C0941d) ((AtomicMarkableReference) ((com.bumptech.glide.k) c1251c.f12321e).f6357x).getReference();
                    synchronized (c0941d) {
                        mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(c0941d.f10035a));
                    }
                    l3.m mVar = (l3.m) c1251c.f12323g;
                    synchronized (mVar) {
                        listUnmodifiableList = Collections.unmodifiableList(new ArrayList(mVar.f10061a));
                    }
                    str2 = str6;
                    ((C0899e) c1251c.f12320d).f9656b.a(new L1.a(c1251c, str, mapUnmodifiableMap, listUnmodifiableList, 1));
                } finally {
                }
            }
        }
        C0942e c0942e = this.f9494i;
        c0942e.f10040b.b();
        c0942e.f10040b = C0942e.f10038c;
        if (str != null) {
            c0942e.f10040b = new l3.k(c0942e.f10039a.n(str, "userlog"));
        }
        this.f9497l.a(str);
        C1251c c1251c2 = this.f9498m;
        C0869s c0869s = (C0869s) c1251c2.f12318b;
        c0869s.getClass();
        Charset charset = P0.f11400a;
        m3.B b6 = new m3.B();
        b6.f11290a = "19.2.0";
        android.support.v4.media.b bVar2 = c0869s.f9532c;
        String str9 = (String) bVar2.f5065a;
        if (str9 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        b6.f11291b = str9;
        C0875y c0875y2 = c0869s.f9531b;
        String str10 = c0875y2.c().f9456a;
        if (str10 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        b6.f11293d = str10;
        b6.f11294e = c0875y2.c().f9457b;
        b6.f11295f = c0875y2.c().f9458c;
        Object obj = bVar2.f5070f;
        String str11 = (String) obj;
        if (str11 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        b6.f11297h = str11;
        Object obj2 = bVar2.f5071g;
        String str12 = (String) obj2;
        if (str12 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        b6.f11298i = str12;
        b6.f11292c = 4;
        b6.f11302m = (byte) (b6.f11302m | 1);
        J j6 = new J();
        j6.f11348f = false;
        byte b7 = (byte) (j6.f11355m | 2);
        j6.f11346d = jCurrentTimeMillis;
        j6.f11355m = (byte) (b7 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        j6.f11344b = str;
        String str13 = C0869s.f9529g;
        if (str13 == null) {
            throw new NullPointerException("Null generator");
        }
        j6.f11343a = str13;
        String str14 = c0875y2.f9560c;
        if (str14 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str15 = (String) obj;
        if (str15 == null) {
            throw new NullPointerException("Null version");
        }
        j6.f11349g = new L(str14, str15, (String) obj2, c0875y2.c().f9456a, (String) ((C0261b) bVar2.f5072h).j().f5930w, (String) ((C0261b) bVar2.f5072h).j().f5931x);
        C1106j0 c1106j0 = new C1106j0();
        c1106j0.f11548a = 3;
        c1106j0.f11552e = (byte) (c1106j0.f11552e | 1);
        c1106j0.f11549b = str3;
        c1106j0.f11550c = str4;
        c1106j0.f11551d = AbstractC0857g.g();
        c1106j0.f11552e = (byte) (c1106j0.f11552e | 2);
        j6.f11351i = c1106j0.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str5) && (num = (Integer) C0869s.f9528f.get(str5.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = AbstractC0857g.a(c0869s.f9530a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = AbstractC0857g.f();
        int iC2 = AbstractC0857g.c();
        N n5 = new N();
        n5.f11374a = iIntValue;
        byte b8 = (byte) (n5.f11383j | 1);
        n5.f11375b = str2;
        n5.f11376c = iAvailableProcessors2;
        n5.f11377d = jA2;
        n5.f11378e = blockCount2;
        n5.f11379f = zF2;
        n5.f11380g = iC2;
        n5.f11383j = (byte) (((byte) (((byte) (((byte) (((byte) (2 | b8)) | 4)) | 8)) | 16)) | 32);
        n5.f11381h = str7;
        n5.f11382i = str8;
        j6.f11352j = n5.a();
        j6.f11354l = 3;
        j6.f11355m = (byte) (j6.f11355m | 4);
        b6.f11299j = j6.a();
        m3.C cA = b6.a();
        C1251c c1251c3 = ((C1249a) c1251c2.f12319c).f12313b;
        O0 o02 = cA.f11312k;
        if (o02 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((K) o02).f11357b;
        try {
            C1249a.f12309g.getClass();
            C1249a.e(c1251c3.n(str16, "report"), C1156c.f11702a.c(cA));
            File fileN = c1251c3.n(str16, "start-time");
            long j7 = ((K) o02).f11359d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileN), C1249a.f12307e);
            try {
                outputStreamWriter.write("");
                fileN.setLastModified(j7 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e6) {
            String strQ2 = AbstractC0628i.q("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strQ2, e6);
            }
        }
    }

    public final boolean d(J0.l lVar) throws Throwable {
        C0899e.a();
        C0870t c0870t = this.f9499n;
        if (c0870t != null && c0870t.f9539e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, lVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e6) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e6);
            return false;
        }
    }

    public final String e() {
        C1249a c1249a = (C1249a) this.f9498m.f12319c;
        c1249a.getClass();
        NavigableSet navigableSetDescendingSet = new TreeSet(C1251c.s(((File) c1249a.f12313b.f12321e).list())).descendingSet();
        if (navigableSetDescendingSet.isEmpty()) {
            return null;
        }
        return (String) navigableSetDescendingSet.first();
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.f9489d.u(strF);
                } catch (IllegalArgumentException e6) {
                    Context context = this.f9486a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e6;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e7);
        }
    }

    public final void h(q2.s sVar) {
        q2.s sVar2;
        q2.s sVarA;
        C1251c c1251c = ((C1249a) this.f9498m.f12319c).f12313b;
        boolean zIsEmpty = C1251c.s(((File) c1251c.f12322f).listFiles()).isEmpty();
        q2.j jVar = this.f9500o;
        if (zIsEmpty && C1251c.s(((File) c1251c.f12323g).listFiles()).isEmpty() && C1251c.s(((File) c1251c.f12324h).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            jVar.c(Boolean.FALSE);
            return;
        }
        C0731c c0731c = C0731c.f8531a;
        c0731c.g("Crash reports are available to be sent.");
        C0871u c0871u = this.f9487b;
        if (c0871u.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            jVar.c(Boolean.FALSE);
            sVarA = f2.h.l(Boolean.TRUE);
        } else {
            c0731c.c("Automatic data collection is disabled.");
            c0731c.g("Notifying that unsent reports are available.");
            jVar.c(Boolean.TRUE);
            synchronized (c0871u.f9545f) {
                sVar2 = ((q2.j) c0871u.f9546g).f12351a;
            }
            K1.b bVar = new K1.b(17, this);
            sVar2.getClass();
            q2.r rVar = q2.k.f12352a;
            q2.s sVar3 = new q2.s();
            sVar2.f12375b.k(new q2.p(rVar, bVar, sVar3));
            sVar2.p();
            c0731c.c("Waiting for send/deleteUnsentReports to be called.");
            sVarA = AbstractC0895a.a(sVar3, this.f9501p.f12351a);
        }
        sVarA.g(this.f9490e.f9655a, new C0261b(this, 4, sVar));
    }
}
