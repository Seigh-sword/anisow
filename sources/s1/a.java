package S1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f3106c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f3107d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f3108a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f3109b;

    public a(Context context) {
        this.f3109b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        AbstractC1332d.m(context);
        ReentrantLock reentrantLock = f3106c;
        reentrantLock.lock();
        try {
            if (f3107d == null) {
                f3107d = new a(context.getApplicationContext());
            }
            a aVar = f3107d;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final String b(String str) {
        ReentrantLock reentrantLock = this.f3108a;
        reentrantLock.lock();
        try {
            return this.f3109b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
