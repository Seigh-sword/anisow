package J3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import b5.C0345a;
import b5.EnumC0346b;
import d.RunnableC0632m;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import m2.C1017B;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1450f;

    public x(Y4.i iVar, V4.A a6, V4.m mVar, Y4.c cVar, Z4.c cVar2) {
        this.f1446b = iVar;
        this.f1447c = a6;
        this.f1448d = mVar;
        this.f1449e = cVar;
        this.f1450f = cVar2;
    }

    public static x c(SharedPreferences sharedPreferences, Executor executor) {
        x xVar = new x(sharedPreferences, executor);
        synchronized (((ArrayDeque) xVar.f1449e)) {
            try {
                ((ArrayDeque) xVar.f1449e).clear();
                String string = ((SharedPreferences) xVar.f1446b).getString((String) xVar.f1447c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) xVar.f1448d)) {
                    String[] strArrSplit = string.split((String) xVar.f1448d, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) xVar.f1449e).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return xVar;
    }

    public final IOException a(boolean z5, boolean z6, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        Object obj = this.f1448d;
        if (z6) {
            ((V4.m) obj).getClass();
        }
        if (z5) {
            ((V4.m) obj).getClass();
        }
        return ((Y4.i) this.f1446b).c(this, z6, z5, iOException);
    }

    public final Y4.d b() {
        return ((Z4.c) this.f1450f).g();
    }

    public final V4.F d(boolean z5) throws IOException {
        try {
            V4.F fE = ((Z4.c) this.f1450f).e(z5);
            if (fE != null) {
                C1017B.f10489z.getClass();
                fE.f3776m = this;
            }
            return fE;
        } catch (IOException e6) {
            ((V4.m) this.f1448d).getClass();
            f(e6);
            throw e6;
        }
    }

    public final boolean e(String str) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.f1449e)) {
            zRemove = ((ArrayDeque) this.f1449e).remove(str);
            if (zRemove && !this.f1445a) {
                ((Executor) this.f1450f).execute(new RunnableC0632m(21, this));
            }
        }
        return zRemove;
    }

    public final void f(IOException iOException) {
        int i6;
        Y4.c cVar = (Y4.c) this.f1449e;
        synchronized (cVar.f4853c) {
            cVar.f4858h = true;
        }
        Y4.d dVarG = ((Z4.c) this.f1450f).g();
        synchronized (dVarG.f4860b) {
            try {
                if (iOException instanceof b5.D) {
                    EnumC0346b enumC0346b = ((b5.D) iOException).f5947w;
                    if (enumC0346b == EnumC0346b.REFUSED_STREAM) {
                        int i7 = dVarG.f4872n + 1;
                        dVarG.f4872n = i7;
                        if (i7 > 1) {
                            dVarG.f4869k = true;
                            i6 = dVarG.f4870l;
                            dVarG.f4870l = i6 + 1;
                        }
                    } else if (enumC0346b != EnumC0346b.CANCEL) {
                        dVarG.f4869k = true;
                        i6 = dVarG.f4870l;
                        dVarG.f4870l = i6 + 1;
                    }
                } else if (dVarG.f4866h == null || (iOException instanceof C0345a)) {
                    dVarG.f4869k = true;
                    if (dVarG.f4871m == 0) {
                        if (iOException != null) {
                            dVarG.f4860b.a(dVarG.f4861c, iOException);
                        }
                        i6 = dVarG.f4870l;
                        dVarG.f4870l = i6 + 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public x(SharedPreferences sharedPreferences, Executor executor) {
        this.f1449e = new ArrayDeque();
        this.f1445a = false;
        this.f1446b = sharedPreferences;
        this.f1447c = "topic_operation_queue";
        this.f1448d = ",";
        this.f1450f = executor;
    }
}
