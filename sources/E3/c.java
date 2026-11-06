package E3;

import a3.C0261b;
import android.net.TrafficStats;
import android.util.Log;
import b3.C0343c;
import d.RunnableC0632m;
import d3.n;
import e3.ExecutorC0673j;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C1251c;
import q2.s;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f399m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y2.g f400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G3.c f401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0261b f402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f411l;

    static {
        new AtomicInteger(1);
    }

    public c(Y2.g gVar, D3.c cVar, ExecutorService executorService, ExecutorC0673j executorC0673j) {
        gVar.a();
        G3.c cVar2 = new G3.c(gVar.f4816a, cVar);
        C0261b c0261b = new C0261b(gVar);
        j jVarA = j.a();
        n nVar = new n(new d3.d(2, gVar));
        h hVar = new h();
        this.f406g = new Object();
        this.f410k = new HashSet();
        this.f411l = new ArrayList();
        this.f400a = gVar;
        this.f401b = cVar2;
        this.f402c = c0261b;
        this.f403d = jVarA;
        this.f404e = nVar;
        this.f405f = hVar;
        this.f407h = executorService;
        this.f408i = executorC0673j;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z5) {
        F3.a aVarP;
        synchronized (f399m) {
            try {
                Y2.g gVar = this.f400a;
                gVar.a();
                C0261b c0261bA = C0261b.a(gVar.f4816a);
                try {
                    aVarP = this.f402c.p();
                    F3.c cVar = F3.c.f633x;
                    F3.c cVar2 = aVarP.f621b;
                    if (cVar2 == cVar || cVar2 == F3.c.f632w) {
                        String strF = f(aVarP);
                        C0261b c0261b = this.f402c;
                        C1251c c1251cA = aVarP.a();
                        c1251cA.f12318b = strF;
                        c1251cA.v(F3.c.f634y);
                        aVarP = c1251cA.j();
                        c0261b.m(aVarP);
                    }
                    if (c0261bA != null) {
                        c0261bA.q();
                    }
                } catch (Throwable th) {
                    if (c0261bA != null) {
                        c0261bA.q();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            C1251c c1251cA2 = aVarP.a();
            c1251cA2.f12320d = null;
            aVarP = c1251cA2.j();
        }
        i(aVarP);
        this.f408i.execute(new b(1, this, z5));
    }

    public final F3.a b(F3.a aVar) throws e {
        int responseCode;
        G3.b bVarF;
        C0343c c0343cA;
        Y2.g gVar = this.f400a;
        gVar.a();
        String str = gVar.f4818c.f4831a;
        String str2 = aVar.f620a;
        Y2.g gVar2 = this.f400a;
        gVar2.a();
        String str3 = gVar2.f4818c.f4837g;
        String str4 = aVar.f623d;
        G3.c cVar = this.f401b;
        G3.e eVar = cVar.f880c;
        if (!eVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = G3.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i6 = 0; i6 <= 1; i6++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    G3.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar.b(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVarF = G3.c.f(httpURLConnectionC);
                } else {
                    G3.c.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        c0343cA = G3.b.a();
                        c0343cA.f5932y = G3.f.f891y;
                        bVarF = c0343cA.g();
                    } else {
                        if (responseCode == 429) {
                            throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            c0343cA = G3.b.a();
                            c0343cA.f5932y = G3.f.f890x;
                            bVarF = c0343cA.g();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                int iOrdinal = bVarF.f875c.ordinal();
                if (iOrdinal == 0) {
                    j jVar = this.f403d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f420a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    C1251c c1251cA = aVar.a();
                    c1251cA.f12320d = bVarF.f873a;
                    c1251cA.f12322f = Long.valueOf(bVarF.f874b);
                    c1251cA.f12323g = Long.valueOf(seconds);
                    return c1251cA.j();
                }
                if (iOrdinal == 1) {
                    C1251c c1251cA2 = aVar.a();
                    c1251cA2.f12324h = "BAD CONFIG";
                    c1251cA2.v(F3.c.f630A);
                    return c1251cA2.j();
                }
                if (iOrdinal != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.f409j = null;
                }
                C1251c c1251cA3 = aVar.a();
                c1251cA3.v(F3.c.f633x);
                return c1251cA3.j();
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final s c() {
        String str;
        e();
        synchronized (this) {
            str = this.f409j;
        }
        if (str != null) {
            return f2.h.l(str);
        }
        q2.j jVar = new q2.j();
        g gVar = new g(jVar);
        synchronized (this.f406g) {
            this.f411l.add(gVar);
        }
        s sVar = jVar.f12351a;
        this.f407h.execute(new RunnableC0632m(20, this));
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s d() {
        e();
        q2.j jVar = new q2.j();
        f fVar = new f(this.f403d, jVar);
        synchronized (this.f406g) {
            this.f411l.add(fVar);
        }
        this.f407h.execute(new b(0, this, 0 == true ? 1 : 0));
        return jVar.f12351a;
    }

    public final void e() {
        Y2.g gVar = this.f400a;
        gVar.a();
        AbstractC1332d.h("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f4818c.f4832b);
        gVar.a();
        AbstractC1332d.h("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f4818c.f4837g);
        gVar.a();
        AbstractC1332d.h("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", gVar.f4818c.f4831a);
        gVar.a();
        String str = gVar.f4818c.f4832b;
        Pattern pattern = j.f418c;
        AbstractC1332d.d("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        AbstractC1332d.d("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f418c.matcher(gVar.f4818c.f4831a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(F3.a r6) {
        /*
            r5 = this;
            Y2.g r0 = r5.f400a
            r0.a()
            java.lang.String r0 = r0.f4817b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            Y2.g r0 = r5.f400a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f4817b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            F3.c r0 = F3.c.f632w
            F3.c r6 = r6.f621b
            if (r6 != r0) goto L5c
            d3.n r6 = r5.f404e
            java.lang.Object r6 = r6.get()
            F3.b r6 = (F3.b) r6
            android.content.SharedPreferences r0 = r6.f628a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f628a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r2 = r6.f628a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L42
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r6 = move-exception
            goto L5a
        L42:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L40
            goto L3e
        L47:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            E3.h r6 = r5.f405f
            r6.getClass()
            java.lang.String r2 = E3.h.a()
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L40
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r6
        L5c:
            E3.h r6 = r5.f405f
            r6.getClass()
            java.lang.String r6 = E3.h.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.c.f(F3.a):java.lang.String");
    }

    public final F3.a g(F3.a aVar) throws e {
        int responseCode;
        G3.a aVarE;
        String str = aVar.f620a;
        String string = null;
        if (str != null && str.length() == 11) {
            F3.b bVar = (F3.b) this.f404e.get();
            synchronized (bVar.f628a) {
                try {
                    String[] strArr = F3.b.f627c;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= 4) {
                            break;
                        }
                        String str2 = strArr[i6];
                        String string2 = bVar.f628a.getString("|T|" + bVar.f629b + "|" + str2, null);
                        if (string2 == null || string2.isEmpty()) {
                            i6++;
                        } else if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            string = string2;
                        }
                    }
                } finally {
                }
            }
        }
        G3.c cVar = this.f401b;
        Y2.g gVar = this.f400a;
        gVar.a();
        String str3 = gVar.f4818c.f4831a;
        String str4 = aVar.f620a;
        Y2.g gVar2 = this.f400a;
        gVar2.a();
        String str5 = gVar2.f4818c.f4837g;
        Y2.g gVar3 = this.f400a;
        gVar3.a();
        String str6 = gVar3.f4818c.f4832b;
        G3.e eVar = cVar.f880c;
        if (!eVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = G3.c.a("projects/" + str5 + "/installations");
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    G3.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode < 200 || responseCode >= 300) {
                    G3.c.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        G3.a aVar2 = new G3.a(null, null, null, null, G3.d.f882x);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVarE = aVar2;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    aVarE = G3.c.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                int iOrdinal = aVarE.f872e.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    C1251c c1251cA = aVar.a();
                    c1251cA.f12324h = "BAD CONFIG";
                    c1251cA.v(F3.c.f630A);
                    return c1251cA.j();
                }
                String str7 = aVarE.f869b;
                String str8 = aVarE.f870c;
                j jVar = this.f403d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f420a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                G3.b bVar2 = aVarE.f871d;
                String str9 = bVar2.f873a;
                long j6 = bVar2.f874b;
                C1251c c1251cA2 = aVar.a();
                c1251cA2.f12318b = str7;
                c1251cA2.v(F3.c.f635z);
                c1251cA2.f12320d = str9;
                c1251cA2.f12321e = str8;
                c1251cA2.f12322f = Long.valueOf(j6);
                c1251cA2.f12323g = Long.valueOf(seconds);
                return c1251cA2.j();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f406g) {
            try {
                Iterator it = this.f411l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(F3.a aVar) {
        synchronized (this.f406g) {
            try {
                Iterator it = this.f411l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
