package J3;

import N.C0089e;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m.C0996y;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f1342i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1343j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0089e f1345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0996y f1346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f1347d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f1349f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B f1351h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1280b f1348e = new C1280b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1350g = false;

    public D(FirebaseMessaging firebaseMessaging, C0089e c0089e, B b6, C0996y c0996y, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f1347d = firebaseMessaging;
        this.f1345b = c0089e;
        this.f1351h = b6;
        this.f1346c = c0996y;
        this.f1344a = context;
        this.f1349f = scheduledExecutorService;
    }

    public static void a(q2.s sVar) throws IOException {
        try {
            f2.h.c(sVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            e = e6;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e7);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e8) {
            e = e8;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f1347d.a();
        C0996y c0996y = this.f1346c;
        c0996y.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(c0996y.c(c0996y.h(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f1347d.a();
        C0996y c0996y = this.f1346c;
        c0996y.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(c0996y.c(c0996y.h(strA, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.D.d():boolean");
    }

    public final void e(long j6) {
        this.f1349f.schedule(new F(this, this.f1344a, this.f1345b, Math.min(Math.max(30L, 2 * j6), f1342i)), j6, TimeUnit.SECONDS);
        synchronized (this) {
            this.f1350g = true;
        }
    }
}
