package N3;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import m2.C1017B;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class U extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2189c;

    public U(Looper looper) {
        super(looper);
        this.f2189c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        if (this.f2187a) {
            c(messenger, C1017B.p().b().f2136a);
            return;
        }
        Object objB = Y2.g.c().b(InterfaceC0136w.class);
        AbstractC1305a.n(objB, "Firebase.app[SessionDatastore::class.java]");
        C0130p c0130p = (C0130p) ((F) ((InterfaceC0136w) objB)).f2134c.get();
        String str = c0130p != null ? c0130p.f2260a : null;
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        O oP = C1017B.p();
        int i6 = oP.f2169d + 1;
        oP.f2169d = i6;
        String strA = i6 == 0 ? oP.f2168c : oP.a();
        int i7 = oP.f2169d;
        ((Z) oP.f2166a).getClass();
        oP.f2170e = new G(strA, oP.f2168c, i7, 1000 * System.currentTimeMillis());
        oP.b();
        Log.d("SessionLifecycleService", "Generated new session " + C1017B.p().b().f2136a);
        Log.d("SessionLifecycleService", "Broadcasting new session: " + C1017B.p().b());
        Object objB = Y2.g.c().b(J.class);
        AbstractC1305a.n(objB, "Firebase.app[SessionFirelogPublisher::class.java]");
        M m5 = (M) ((J) objB);
        S3.a.B(S3.a.c(m5.f2164e), null, null, new K(m5, C1017B.p().b(), null), 3);
        for (Messenger messenger : new ArrayList(this.f2189c)) {
            AbstractC1305a.n(messenger, "it");
            a(messenger);
        }
        Object objB2 = Y2.g.c().b(InterfaceC0136w.class);
        AbstractC1305a.n(objB2, "Firebase.app[SessionDatastore::class.java]");
        F f6 = (F) ((InterfaceC0136w) objB2);
        String str = C1017B.p().b().f2136a;
        AbstractC1305a.o(str, "sessionId");
        S3.a.B(S3.a.c(f6.f2133b), null, null, new E(f6, str, null), 3);
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f2189c.remove(messenger);
        } catch (Exception e6) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.U.handleMessage(android.os.Message):void");
    }
}
