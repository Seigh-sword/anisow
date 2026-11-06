package w1;

import a3.C0261b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import c0.t;
import com.google.gson.reflect.TypeToken;
import com.onesignal.AbstractC0571l1;
import com.onesignal.P0;
import d.AbstractC0628i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import m2.C1017B;
import m2.C1018C;
import m3.v0;
import org.json.JSONArray;
import u1.C1358b;

/* JADX INFO: renamed from: w1.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1474r implements l3.i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static volatile C1474r f13582A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f13584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13585y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f13586z;

    public C1474r(int i6) {
        this.f13583w = i6;
        if (i6 == 3) {
            this.f13586z = new Object();
        } else {
            this.f13584x = Collections.newSetFromMap(new WeakHashMap());
            this.f13586z = new HashSet();
        }
    }

    public static String a(Class cls) {
        String name;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            name = cls.getName();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else {
            if (!Modifier.isAbstract(modifiers)) {
                return null;
            }
            name = cls.getName();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        return str.concat(name);
    }

    public static C1474r e(Context context) {
        if (f13582A == null) {
            synchronized (C1474r.class) {
                try {
                    if (f13582A == null) {
                        f13582A = new C1474r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f13582A;
    }

    public final boolean b(y1.c cVar) {
        boolean z5 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f13584x).remove(cVar);
        if (!((Set) this.f13586z).remove(cVar) && !zRemove) {
            z5 = false;
        }
        if (z5) {
            cVar.clear();
        }
        return z5;
    }

    @Override // l3.i
    public final void c(l3.h hVar, int i6) {
        if (this.f13585y) {
            this.f13585y = false;
        } else {
            ((StringBuilder) this.f13586z).append(", ");
        }
        ((StringBuilder) this.f13586z).append(i6);
    }

    public final S3.q d(TypeToken typeToken) {
        String str;
        S3.q tVar;
        C1017B c1017b;
        Type type = typeToken.f7457b;
        AbstractC0628i.p(((Map) this.f13586z).get(type));
        Map map = (Map) this.f13586z;
        Class cls = typeToken.f7456a;
        AbstractC0628i.p(map.get(cls));
        S3.q c1018c = null;
        S3.q fVar = EnumSet.class.isAssignableFrom(cls) ? new S3.f(type) : cls == EnumMap.class ? new S3.g(type) : null;
        if (fVar != null) {
            return fVar;
        }
        S3.a.s((List) this.f13584x);
        if (Modifier.isAbstract(cls.getModifiers())) {
            tVar = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                v0 v0Var = V3.c.f3745a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e6) {
                    str = "Failed making constructor '" + V3.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e6.getMessage();
                }
                tVar = str != null ? new t(str) : new K1.b(22, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                tVar = null;
            }
        }
        if (tVar != null) {
            return tVar;
        }
        int i6 = 15;
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                c1018c = new C1018C(13);
            } else {
                int i7 = 14;
                if (Set.class.isAssignableFrom(cls)) {
                    c1017b = new C1017B(i7, c1018c);
                } else if (Queue.class.isAssignableFrom(cls)) {
                    c1018c = new C1018C(i7);
                } else {
                    c1017b = new C1017B(i6, c1018c);
                }
                c1018c = c1017b;
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                c1018c = new C1018C(i6);
            } else {
                int i8 = 16;
                if (ConcurrentMap.class.isAssignableFrom(cls)) {
                    c1017b = new C1017B(i8, c1018c);
                } else if (SortedMap.class.isAssignableFrom(cls)) {
                    c1018c = new C1018C(i8);
                } else {
                    int i9 = 17;
                    if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new TypeToken(((ParameterizedType) type).getActualTypeArguments()[0]).f7456a)) {
                        c1018c = new C1018C(i9);
                    } else {
                        c1017b = new C1017B(i9, c1018c);
                    }
                }
                c1018c = c1017b;
            }
        }
        if (c1018c != null) {
            return c1018c;
        }
        String strA = a(cls);
        if (strA != null) {
            return new S3.e(strA, 1);
        }
        if (this.f13585y) {
            return new C0261b(this, 11, cls);
        }
        return new S3.e("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", 0);
    }

    public final void f() {
        if (this.f13585y || ((Set) this.f13584x).isEmpty()) {
            return;
        }
        com.bumptech.glide.k kVar = (com.bumptech.glide.k) ((InterfaceC1472p) this.f13586z);
        boolean z5 = false;
        kVar.f6356w = ((ConnectivityManager) ((C1.g) kVar.f6358y).a()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) ((C1.g) kVar.f6358y).a()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) kVar.f6359z);
            z5 = true;
        } catch (RuntimeException e6) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e6);
            }
        }
        this.f13585y = z5;
    }

    public final void g() {
        if (this.f13585y && ((Set) this.f13584x).isEmpty()) {
            com.bumptech.glide.k kVar = (com.bumptech.glide.k) ((InterfaceC1472p) this.f13586z);
            ((ConnectivityManager) ((C1.g) kVar.f6358y).a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) kVar.f6359z);
            this.f13585y = false;
        }
    }

    public final boolean h(Object obj) {
        boolean z5 = false;
        for (Object obj2 : (List) this.f13584x) {
            if (obj2 instanceof WeakReference) {
                obj2 = ((WeakReference) obj2).get();
            }
            if (obj2 != null) {
                try {
                    Method declaredMethod = obj2.getClass().getDeclaredMethod((String) this.f13586z, obj.getClass());
                    declaredMethod.setAccessible(true);
                    if (this.f13585y) {
                        AbstractC0571l1.P(new P0(this, declaredMethod, obj2, obj));
                    } else {
                        try {
                            declaredMethod.invoke(obj2, obj);
                        } catch (IllegalAccessException | InvocationTargetException e6) {
                            e6.printStackTrace();
                        }
                    }
                    z5 = true;
                } catch (NoSuchMethodException e7) {
                    e7.printStackTrace();
                }
            }
        }
        return z5;
    }

    public final void i() {
        for (y1.c cVar : C1.n.e((Set) this.f13584x)) {
            if (!cVar.i() && !cVar.j()) {
                cVar.clear();
                if (this.f13585y) {
                    ((Set) this.f13586z).add(cVar);
                } else {
                    cVar.f();
                }
            }
        }
    }

    public final void j() {
        this.f13585y = false;
        for (y1.c cVar : C1.n.e((Set) this.f13584x)) {
            if (!cVar.i() && !cVar.isRunning()) {
                cVar.f();
            }
        }
        ((Set) this.f13586z).clear();
    }

    public final void k(q2.q qVar) {
        synchronized (this.f13586z) {
            try {
                if (((Queue) this.f13584x) == null) {
                    this.f13584x = new ArrayDeque();
                }
                ((Queue) this.f13584x).add(qVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(q2.i iVar) {
        q2.q qVar;
        synchronized (this.f13586z) {
            if (((Queue) this.f13584x) != null && !this.f13585y) {
                this.f13585y = true;
                while (true) {
                    synchronized (this.f13586z) {
                        try {
                            qVar = (q2.q) ((Queue) this.f13584x).poll();
                            if (qVar == null) {
                                this.f13585y = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    qVar.a(iVar);
                }
            }
        }
    }

    public final String toString() {
        switch (this.f13583w) {
            case 1:
                return super.toString() + "{numRequests=" + ((Set) this.f13584x).size() + ", isPaused=" + this.f13585y + "}";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return ((Map) this.f13586z).toString();
            default:
                return super.toString();
        }
    }

    public C1474r(Context context) {
        this.f13583w = 0;
        this.f13584x = new HashSet();
        this.f13586z = new com.bumptech.glide.k(new U1.i(new C1358b(this, context, 3)), new C1471o(this));
    }

    public C1474r(String str, boolean z5) {
        this.f13583w = 7;
        this.f13586z = str;
        this.f13585y = z5;
        this.f13584x = new ArrayList();
    }

    public C1474r(String str, boolean z5, int i6) {
        this.f13583w = 2;
        this.f13584x = "com.google.android.gms";
        this.f13586z = str;
        this.f13585y = z5;
    }

    public C1474r(Map map, List list) {
        this.f13583w = 5;
        this.f13586z = map;
        this.f13585y = true;
        this.f13584x = list;
    }

    public C1474r(l3.j jVar, StringBuilder sb) {
        this.f13583w = 4;
        this.f13584x = jVar;
        this.f13586z = sb;
        this.f13585y = true;
    }

    public C1474r(JSONArray jSONArray) {
        this.f13583w = 8;
        this.f13586z = jSONArray;
    }
}
