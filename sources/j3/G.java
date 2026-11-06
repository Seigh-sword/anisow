package J3;

import F0.C0022i;
import N.C0085c;
import N.C0089e;
import N.C0095h;
import N.InterfaceC0087d;
import N.V;
import N3.C0125k;
import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import d.AbstractC0628i;
import g3.C0730b;
import g3.C0731c;
import g3.InterfaceC0729a;
import j3.AbstractC0850C;
import j3.C0851a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m.C0996y;
import p3.C1251c;
import q2.InterfaceC1258a;
import q2.InterfaceC1261d;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import w3.C1478b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements InterfaceC1261d, D0.j, J2.i, O1.b, N1.j, D3.a, InterfaceC1258a, E1.e, d3.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1363x;

    public /* synthetic */ G(int i6, Object obj) {
        this.f1362w = i6;
        this.f1363x = obj;
    }

    public boolean a(L3.c cVar, int i6, Bundle bundle) {
        View view = (View) this.f1363x;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 25 && (i6 & 1) != 0) {
            try {
                ((S.g) cVar.f1734x).a();
                Parcelable parcelable = (Parcelable) ((S.g) cVar.f1734x).e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        ClipData clipData = new ClipData(((S.g) cVar.f1734x).c(), new ClipData.Item(((S.g) cVar.f1734x).g()));
        InterfaceC0087d c0085c = i7 >= 31 ? new C0085c(clipData, 2) : new C0089e(clipData, 2);
        c0085c.c(((S.g) cVar.f1734x).b());
        c0085c.b(bundle);
        return V.h(view, c0085c.a()) == null;
    }

    @Override // N1.j
    public Object apply(Object obj) throws IOException {
        int i6 = this.f1362w;
        Object obj2 = this.f1363x;
        switch (i6) {
            case 9:
                F1.d dVar = (F1.d) obj2;
                F1.b bVar = (F1.b) obj;
                dVar.getClass();
                URL url = bVar.f606a;
                String strJ = AbstractC1332d.J("CctTransportBackend");
                if (Log.isLoggable(strJ, 4)) {
                    Log.i(strJ, String.format("Making request to: %s", url));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f606a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(dVar.f618g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = bVar.f608c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            dVar.f612a.d(bVar.f607b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer numValueOf = Integer.valueOf(responseCode);
                            String strJ2 = AbstractC1332d.J("CctTransportBackend");
                            if (Log.isLoggable(strJ2, 4)) {
                                Log.i(strJ2, String.format("Status Code: %d", numValueOf));
                            }
                            AbstractC1332d.z("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                            AbstractC1332d.z("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                return new F1.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            }
                            if (responseCode != 200) {
                                return new F1.c(responseCode, null, 0L);
                            }
                            InputStream inputStream = httpURLConnection.getInputStream();
                            try {
                                InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                try {
                                    F1.c cVar = new F1.c(responseCode, null, G1.w.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f857a);
                                    if (gZIPInputStream != null) {
                                        gZIPInputStream.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    return cVar;
                                } finally {
                                    if (gZIPInputStream != null) {
                                        try {
                                            break;
                                        } catch (Throwable th) {
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    break;
                                }
                                throw th2;
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th4) {
                            }
                        }
                    } catch (Throwable th5) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            break;
                        }
                        throw th5;
                    }
                } catch (ConnectException e6) {
                    e = e6;
                    AbstractC1332d.B("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new F1.c(500, null, 0L);
                } catch (UnknownHostException e7) {
                    e = e7;
                    AbstractC1332d.B("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new F1.c(500, null, 0L);
                } catch (IOException e8) {
                    e = e8;
                    AbstractC1332d.B("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new F1.c(400, null, 0L);
                } catch (C1478b e9) {
                    e = e9;
                    AbstractC1332d.B("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new F1.c(400, null, 0L);
                }
            case 16:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                E1.c cVar2 = N1.l.f2100B;
                while (cursor.moveToNext()) {
                    long j6 = cursor.getLong(0);
                    Set hashSet = (Set) map.get(Long.valueOf(j6));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j6), hashSet);
                    }
                    hashSet.add(new N1.k(cursor.getString(1), cursor.getString(2)));
                }
                return null;
            default:
                ((C0125k) obj2).getClass();
                String strC = N3.I.f2144b.c((N3.H) obj);
                AbstractC1305a.n(strC, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                Log.d("EventGDTLogger", "Session Event: ".concat(strC));
                byte[] bytes = strC.getBytes(K4.a.f1637a);
                AbstractC1305a.n(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
        }
    }

    @Override // q2.InterfaceC1258a
    public Object b(q2.i iVar) throws IOException {
        boolean z5;
        Object obj;
        switch (this.f1362w) {
            case 20:
                ((C1251c) this.f1363x).getClass();
                if (iVar.f()) {
                    C0851a c0851a = (C0851a) iVar.d();
                    C0731c c0731c = C0731c.f8531a;
                    c0731c.c("Crashlytics report successfully enqueued to DataTransport: " + c0851a.f9454b);
                    File file = c0851a.f9455c;
                    if (file.delete()) {
                        c0731c.c("Deleted report file: " + file.getPath());
                    } else {
                        c0731c.h("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z5 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", iVar.c());
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 21:
                CountDownLatch countDownLatch = (CountDownLatch) this.f1363x;
                ExecutorService executorService = AbstractC0850C.f9452a;
                countDownLatch.countDown();
                return null;
            case 22:
                return (q2.i) ((Callable) this.f1363x).call();
            case 23:
                ((Runnable) this.f1363x).run();
                return f2.h.l(null);
            default:
                ((C0996y) this.f1363x).getClass();
                q2.s sVar = (q2.s) iVar;
                synchronized (sVar.f12374a) {
                    AbstractC1332d.o("Task is not yet complete", sVar.f12376c);
                    if (sVar.f12377d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(sVar.f12379f)) {
                        throw ((Throwable) IOException.class.cast(sVar.f12379f));
                    }
                    Exception exc = sVar.f12379f;
                    if (exc != null) {
                        throw new q2.g(exc);
                    }
                    obj = sVar.f12378e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // q2.InterfaceC1261d
    public void c(q2.i iVar) {
        int i6 = this.f1362w;
        Object obj = this.f1363x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                H.b((Intent) obj);
                break;
            case 1:
                int i7 = I.f1367d;
                ((J) obj).f1370b.c(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // O1.b
    public Object d() {
        int i6 = this.f1362w;
        int i7 = 0;
        Object obj = this.f1363x;
        switch (i6) {
            case 10:
                N1.l lVar = (N1.l) ((N1.d) obj);
                Integer num = (Integer) lVar.g(new N1.f(lVar, ((P1.c) lVar.f2103x).a() - lVar.f2105z.f2080d));
                num.getClass();
                return num;
            case 11:
                N1.l lVar2 = (N1.l) ((M1.j) obj).f1794i;
                lVar2.getClass();
                lVar2.g(new N1.h(lVar2, i7));
                return null;
            case 12:
                N1.l lVar3 = (N1.l) ((N1.c) obj);
                lVar3.getClass();
                int i8 = K1.a.f1509e;
                P0.h hVar = new P0.h(9);
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseB = lVar3.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    K1.a aVar = (K1.a) N1.l.n(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0022i(lVar3, map, hVar, 5));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            default:
                M1.l lVar4 = (M1.l) obj;
                N1.l lVar5 = (N1.l) lVar4.f1805b;
                lVar5.getClass();
                Iterator it = ((Iterable) lVar5.g(new C0095h(11))).iterator();
                while (it.hasNext()) {
                    ((M1.d) lVar4.f1806c).a((H1.j) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // D3.a
    public void e(D3.c cVar) {
        switch (this.f1362w) {
            case 18:
                C0730b c0730b = (C0730b) this.f1363x;
                c0730b.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                c0730b.f8530b.set((InterfaceC0729a) cVar.get());
                return;
            default:
                AbstractC0628i.p(cVar.get());
                throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:4|(1:6)(1:7)|8|(1:10)|(1:12)(1:13)|14|(39:18|34|(1:36)|37|(1:39)|40|(4:43|(3:183|45|186)(1:185)|184|41)|182|46|169|47|(1:49)(1:51)|50|52|(1:54)|55|56|177|57|58|(1:60)|(1:62)(1:63)|64|(4:67|(2:69|188)(1:189)|70|65)|187|71|(2:74|72)|190|75|(1:77)(1:78)|79|(1:81)(1:82)|83|(5:88|(1:90)|91|40f|95)(1:87)|96|(14:106|107|(2:109|(1:111))(2:112|(2:149|150))|114|179|115|116|171|117|175|118|119|120|(5:129|141|(1:143)|144|148)(9:122|(7:124|(2:126|(1:128))|129|141|(0)|144|148)|130|131|173|132|(1:134)|135|148))(15:100|(1:102)(2:103|(1:105)(0))|107|(0)(0)|114|179|115|116|171|117|175|118|119|120|(0)(0))|159|(2:161|(1:163))|164)(3:19|(3:23|31|(1:33))(4:24|(2:27|25)|181|28)|29)|30|37|(0)|40|(1:41)|182|46|169|47|(0)(0)|50|52|(0)|55|56|177|57|58|(0)|(0)(0)|64|(1:65)|187|71|(1:72)|190|75|(0)(0)|79|(0)(0)|83|(5:85|88|(0)|91|40f)(0)|159|(0)|164) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:122|(7:124|(2:126|(1:128))|129|141|(0)|144|148)|130|131|173|132|(1:134)|135|148) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x05ca, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x05ea, code lost:
    
        android.util.Log.e(r1, "Crashlytics was not started due to an exception during initialization", r0);
        r13.f9519g = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0653, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0654, code lost:
    
        r1 = "FirebaseCrashlytics";
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0657, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0658, code lost:
    
        r1 = "FirebaseCrashlytics";
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0659, code lost:
    
        android.util.Log.e(r1, "Error retrieving app package info.", r0);
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0594 A[Catch: Exception -> 0x05cc, TryCatch #2 {Exception -> 0x05cc, blocks: (B:117:0x0509, B:119:0x0564, B:120:0x0569, B:122:0x0594, B:124:0x059e, B:126:0x05ac), top: B:171:0x0509 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0410 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x023c A[Catch: NameNotFoundException -> 0x0657, TryCatch #1 {NameNotFoundException -> 0x0657, blocks: (B:47:0x0225, B:49:0x023c, B:52:0x024d, B:55:0x0253, B:51:0x0246), top: B:169:0x0225 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0246 A[Catch: NameNotFoundException -> 0x0657, TryCatch #1 {NameNotFoundException -> 0x0657, blocks: (B:47:0x0225, B:49:0x023c, B:52:0x024d, B:55:0x0253, B:51:0x0246), top: B:169:0x0225 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0341 A[LOOP:3: B:72:0x033b->B:74:0x0341, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ef  */
    @Override // d3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(p3.C1251c r47) {
        /*
            Method dump skipped, instruction units count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.G.f(p3.c):java.lang.Object");
    }
}
