package C0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.xo.anilab.R;
import h0.C0733A;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f107e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f110c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f109b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f108a = new HashMap();

    public a(Context context) {
        this.f110c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f106d == null) {
            synchronized (f107e) {
                try {
                    if (f106d == null) {
                        f106d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f106d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f110c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f109b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new C0733A(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (AbstractC1332d.T()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f108a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f110c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new C0733A(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
