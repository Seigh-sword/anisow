package D4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f368a = new Object[0];

    public static final Object[] a(Collection collection) {
        AbstractC1305a.o(collection, "collection");
        int size = collection.size();
        Object[] objArr = f368a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i6 = 0;
        while (true) {
            int i7 = i6 + 1;
            objArrCopyOf[i6] = it.next();
            if (i7 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i8 = ((i7 * 3) + 1) >>> 1;
                if (i8 <= i7) {
                    i8 = 2147483645;
                    if (i7 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
                AbstractC1305a.n(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i7);
                AbstractC1305a.n(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i6 = i7;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        AbstractC1305a.o(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i6 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            AbstractC1305a.m(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i7 = i6 + 1;
            objArrCopyOf[i6] = it.next();
            if (i7 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i8 = ((i7 * 3) + 1) >>> 1;
                if (i8 <= i7) {
                    i8 = 2147483645;
                    if (i7 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
                AbstractC1305a.n(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i7] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i7);
                AbstractC1305a.n(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i6 = i7;
        }
    }
}
