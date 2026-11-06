package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import s.C1281c;

/* JADX INFO: renamed from: i.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0818s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ExecutorC0817q f9337w = new ExecutorC0817q(new r(0));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f9338x = -100;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static J.i f9339y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static J.i f9340z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static Boolean f9332A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static boolean f9333B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C1281c f9334C = new C1281c(0);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Object f9335D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Object f9336E = new Object();

    public static boolean b(Context context) {
        if (f9332A == null) {
            try {
                int i6 = O.f9232w;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) O.class), N.a() | 128).metaData;
                if (bundle != null) {
                    f9332A = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f9332A = Boolean.FALSE;
            }
        }
        return f9332A.booleanValue();
    }

    public static void e(AbstractC0818s abstractC0818s) {
        synchronized (f9335D) {
            try {
                Iterator it = f9334C.iterator();
                while (it.hasNext()) {
                    AbstractC0818s abstractC0818s2 = (AbstractC0818s) ((WeakReference) it.next()).get();
                    if (abstractC0818s2 == abstractC0818s || abstractC0818s2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i6);

    public abstract void g(int i6);

    public abstract void h(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
