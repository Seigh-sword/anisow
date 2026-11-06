package d2;

import android.content.Context;
import p1.C1244j;

/* JADX INFO: renamed from: d2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0652c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0652c f8172b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1244j f8173a;

    static {
        C0652c c0652c = new C0652c();
        c0652c.f8173a = null;
        f8172b = c0652c;
    }

    public static C1244j a(Context context) {
        C1244j c1244j;
        C0652c c0652c = f8172b;
        synchronized (c0652c) {
            try {
                if (c0652c.f8173a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0652c.f8173a = new C1244j(context, 6);
                }
                c1244j = c0652c.f8173a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1244j;
    }
}
