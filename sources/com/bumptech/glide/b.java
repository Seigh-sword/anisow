package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.D;
import com.google.android.gms.internal.measurement.C0396c2;
import d.AbstractC0628i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l1.ThreadFactoryC0927a;
import l1.q;
import m1.C1010h;
import m1.C1011i;
import m1.InterfaceC1006d;
import n1.C1148d;
import n1.C1149e;
import n1.C1151g;
import o1.ThreadFactoryC1225b;
import p1.C1244j;
import s.C1280b;
import w1.C1469m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static volatile b f6291D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static volatile boolean f6292E;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1469m f6293A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final V0.m f6294B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f6295C = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1006d f6296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1149e f6297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f6298y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1010h f6299z;

    public b(Context context, q qVar, C1149e c1149e, InterfaceC1006d interfaceC1006d, C1010h c1010h, C1469m c1469m, V0.m mVar, int i6, S0.f fVar, C1280b c1280b, List list, List list2, d dVar, I0.f fVar2) {
        this.f6296w = interfaceC1006d;
        this.f6299z = c1010h;
        this.f6297x = c1149e;
        this.f6293A = c1469m;
        this.f6294B = mVar;
        this.f6298y = new f(context, c1010h, new k(this, list2, dVar), new V0.m(22), fVar, c1280b, list, qVar, fVar2, i6);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f6291D == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            }
            synchronized (b.class) {
                if (f6291D == null) {
                    if (f6292E) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f6292E = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f6292E = false;
                    } catch (Throwable th) {
                        f6292E = false;
                        throw th;
                    }
                }
            }
        }
        return f6291D;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        String str;
        e eVar = new e();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.q();
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str2 : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str2))) {
                        C1244j.i(str2);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    str = "Finished loading Glide modules";
                    Log.d("ManifestParser", str);
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                str = "Got null app info metadata";
                Log.d("ManifestParser", str);
            }
        } catch (PackageManager.NameNotFoundException e6) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e6);
            }
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.A().isEmpty()) {
            generatedAppGlideModule.A();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC0628i.p(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                AbstractC0628i.p(it2.next());
                throw null;
            }
        }
        eVar.f6327n = generatedAppGlideModule != null ? generatedAppGlideModule.B() : null;
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            AbstractC0628i.p(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b();
        }
        if (eVar.f6320g == null) {
            ThreadFactoryC0927a threadFactoryC0927a = new ThreadFactoryC0927a();
            if (o1.d.f12181y == 0) {
                o1.d.f12181y = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i6 = o1.d.f12181y;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            eVar.f6320g = new o1.d(new ThreadPoolExecutor(i6, i6, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC1225b(threadFactoryC0927a, "source", false)));
        }
        if (eVar.f6321h == null) {
            int i7 = o1.d.f12181y;
            ThreadFactoryC0927a threadFactoryC0927a2 = new ThreadFactoryC0927a();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            eVar.f6321h = new o1.d(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC1225b(threadFactoryC0927a2, "disk-cache", true)));
        }
        if (eVar.f6328o == null) {
            if (o1.d.f12181y == 0) {
                o1.d.f12181y = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i8 = o1.d.f12181y >= 4 ? 2 : 1;
            ThreadFactoryC0927a threadFactoryC0927a3 = new ThreadFactoryC0927a();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            eVar.f6328o = new o1.d(new ThreadPoolExecutor(i8, i8, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC1225b(threadFactoryC0927a3, "animation", true)));
        }
        if (eVar.f6323j == null) {
            eVar.f6323j = new f2.d(new C1151g(applicationContext));
        }
        if (eVar.f6324k == null) {
            eVar.f6324k = new V0.m(20);
        }
        if (eVar.f6317d == null) {
            int i9 = eVar.f6323j.f8400a;
            if (i9 > 0) {
                eVar.f6317d = new C1011i(i9);
            } else {
                eVar.f6317d = new B3.e();
            }
        }
        if (eVar.f6318e == null) {
            eVar.f6318e = new C1010h(eVar.f6323j.f8402c);
        }
        if (eVar.f6319f == null) {
            eVar.f6319f = new C1149e(eVar.f6323j.f8401b);
        }
        if (eVar.f6322i == null) {
            eVar.f6322i = new C1148d(new C0396c2(applicationContext, 24, "image_manager_disk_cache"));
        }
        if (eVar.f6316c == null) {
            eVar.f6316c = new q(eVar.f6319f, eVar.f6322i, eVar.f6321h, eVar.f6320g, new o1.d(new ThreadPoolExecutor(0, Integer.MAX_VALUE, o1.d.f12180x, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC1225b(new ThreadFactoryC0927a(), "source-unlimited", false))), eVar.f6328o);
        }
        List list = eVar.f6329p;
        eVar.f6329p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        D d6 = eVar.f6315b;
        d6.getClass();
        I0.f fVar = new I0.f();
        fVar.f1097a = Collections.unmodifiableMap(new HashMap(d6.f5548a));
        b bVar = new b(applicationContext, eVar.f6316c, eVar.f6319f, eVar.f6317d, eVar.f6318e, new C1469m(eVar.f6327n), eVar.f6324k, eVar.f6325l, eVar.f6326m, eVar.f6314a, eVar.f6329p, arrayList, generatedAppGlideModule, fVar);
        applicationContext.registerComponentCallbacks(bVar);
        f6291D = bVar;
    }

    public final void c(o oVar) {
        synchronized (this.f6295C) {
            try {
                if (!this.f6295C.contains(oVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f6295C.remove(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C1.n.a();
        this.f6297x.e(0L);
        this.f6296w.i();
        C1010h c1010h = this.f6299z;
        synchronized (c1010h) {
            c1010h.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        long j6;
        C1.n.a();
        synchronized (this.f6295C) {
            try {
                Iterator it = this.f6295C.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).getClass();
                }
            } finally {
            }
        }
        C1149e c1149e = this.f6297x;
        c1149e.getClass();
        if (i6 >= 40) {
            c1149e.e(0L);
        } else if (i6 >= 20 || i6 == 15) {
            synchronized (c1149e) {
                j6 = c1149e.f127b;
            }
            c1149e.e(j6 / 2);
        }
        this.f6296w.e(i6);
        C1010h c1010h = this.f6299z;
        synchronized (c1010h) {
            if (i6 >= 40) {
                synchronized (c1010h) {
                    c1010h.b(0);
                }
            } else if (i6 >= 20 || i6 == 15) {
                c1010h.b(c1010h.f10455e / 2);
            }
        }
    }
}
