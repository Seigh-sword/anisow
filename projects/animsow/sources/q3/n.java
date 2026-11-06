package Q3;

import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f2811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1474r f2813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T3.d f2814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2816f;

    public n() {
        S3.i iVar = S3.i.f3255y;
        Map mapEmptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        this.f2811a = new ThreadLocal();
        this.f2812b = new ConcurrentHashMap();
        C1474r c1474r = new C1474r(mapEmptyMap, listEmptyList2);
        this.f2813c = c1474r;
        int i6 = 1;
        this.f2816f = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(T3.w.f3516A);
        arrayList.add(T3.l.f3477c);
        arrayList.add(iVar);
        arrayList.addAll(listEmptyList);
        arrayList.add(T3.w.f3533p);
        arrayList.add(T3.w.f3524g);
        arrayList.add(T3.w.f3521d);
        arrayList.add(T3.w.f3522e);
        arrayList.add(T3.w.f3523f);
        k kVar = T3.w.f3528k;
        arrayList.add(T3.w.b(Long.TYPE, Long.class, kVar));
        int i7 = 0;
        arrayList.add(T3.w.b(Double.TYPE, Double.class, new j(0)));
        arrayList.add(T3.w.b(Float.TYPE, Float.class, new j(1)));
        arrayList.add(T3.k.f3475b);
        arrayList.add(T3.w.f3525h);
        arrayList.add(T3.w.f3526i);
        arrayList.add(T3.w.a(AtomicLong.class, new l(kVar, 0).a()));
        arrayList.add(T3.w.a(AtomicLongArray.class, new l(kVar, 1).a()));
        arrayList.add(T3.w.f3527j);
        arrayList.add(T3.w.f3529l);
        arrayList.add(T3.w.f3534q);
        arrayList.add(T3.w.f3535r);
        arrayList.add(T3.w.a(BigDecimal.class, T3.w.f3530m));
        arrayList.add(T3.w.a(BigInteger.class, T3.w.f3531n));
        arrayList.add(T3.w.a(S3.k.class, T3.w.f3532o));
        arrayList.add(T3.w.f3536s);
        arrayList.add(T3.w.f3537t);
        arrayList.add(T3.w.f3539v);
        arrayList.add(T3.w.f3540w);
        arrayList.add(T3.w.f3542y);
        arrayList.add(T3.w.f3538u);
        arrayList.add(T3.w.f3519b);
        arrayList.add(T3.e.f3460b);
        arrayList.add(T3.w.f3541x);
        if (W3.d.f4478a) {
            arrayList.add(W3.d.f4480c);
            arrayList.add(W3.d.f4479b);
            arrayList.add(W3.d.f4481d);
        }
        arrayList.add(T3.b.f3452c);
        arrayList.add(T3.w.f3518a);
        arrayList.add(new T3.d(c1474r, i7));
        arrayList.add(new T3.i(c1474r));
        T3.d dVar = new T3.d(c1474r, i6);
        this.f2814d = dVar;
        arrayList.add(dVar);
        arrayList.add(T3.w.f3517B);
        arrayList.add(new T3.q(c1474r, iVar, dVar, listEmptyList2));
        this.f2815e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            throw new IllegalArgumentException(d6 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        TypeToken typeToken = new TypeToken(cls);
        Object objB = null;
        if (str != null) {
            X3.a aVar = new X3.a(new StringReader(str));
            boolean z5 = true;
            aVar.f4685x = true;
            try {
                try {
                    try {
                        try {
                            aVar.W();
                            try {
                                objB = c(typeToken).b(aVar);
                            } catch (EOFException e6) {
                                e = e6;
                                z5 = false;
                                if (!z5) {
                                    throw new q(e);
                                }
                            }
                        } catch (IOException e7) {
                            throw new q(e7);
                        }
                    } catch (AssertionError e8) {
                        throw new AssertionError("AssertionError (GSON 2.10.1): " + e8.getMessage(), e8);
                    } catch (IllegalStateException e9) {
                        throw new q(e9);
                    }
                } finally {
                    aVar.f4685x = false;
                }
            } catch (EOFException e10) {
                e = e10;
            }
            if (objB != null) {
                try {
                    if (aVar.W() != 10) {
                        throw new q("JSON document was not fully consumed.");
                    }
                } catch (X3.c e11) {
                    throw new q(e11);
                } catch (IOException e12) {
                    throw new q(e12);
                }
            }
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objB);
    }

    public final A c(TypeToken typeToken) {
        boolean z5;
        ConcurrentHashMap concurrentHashMap = this.f2812b;
        A a6 = (A) concurrentHashMap.get(typeToken);
        if (a6 != null) {
            return a6;
        }
        ThreadLocal threadLocal = this.f2811a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z5 = true;
        } else {
            A a7 = (A) map.get(typeToken);
            if (a7 != null) {
                return a7;
            }
            z5 = false;
        }
        try {
            m mVar = new m();
            A a8 = null;
            mVar.f2810a = null;
            map.put(typeToken, mVar);
            Iterator it = this.f2815e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a8 = ((B) it.next()).a(this, typeToken);
                if (a8 != null) {
                    if (mVar.f2810a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    mVar.f2810a = a8;
                    map.put(typeToken, a8);
                }
            }
            if (z5) {
                threadLocal.remove();
            }
            if (a8 != null) {
                if (z5) {
                    concurrentHashMap.putAll(map);
                }
                return a8;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z5) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final X3.b d(Writer writer) {
        X3.b bVar = new X3.b(writer);
        bVar.f4692B = this.f2816f;
        bVar.f4691A = false;
        bVar.f4694D = false;
        return bVar;
    }

    public final String e(Object obj) {
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            f(obj, cls, d(stringWriter));
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new q(e6);
        }
    }

    public final void f(Object obj, Class cls, X3.b bVar) {
        A aC = c(new TypeToken(cls));
        boolean z5 = bVar.f4691A;
        bVar.f4691A = true;
        boolean z6 = bVar.f4692B;
        bVar.f4692B = this.f2816f;
        boolean z7 = bVar.f4694D;
        bVar.f4694D = false;
        try {
            try {
                try {
                    aC.c(bVar, obj);
                } catch (IOException e6) {
                    throw new q(e6);
                }
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e7.getMessage(), e7);
            }
        } finally {
            bVar.f4691A = z5;
            bVar.f4692B = z6;
            bVar.f4694D = z7;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f2815e + ",instanceCreators:" + this.f2813c + "}";
    }
}
