package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0474p2 implements InterfaceC0403d3 {
    protected int zza;

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Iterable iterable, R2 r22) {
        Charset charset = K2.f6615a;
        iterable.getClass();
        if (iterable instanceof U2) {
            List listM0a = ((U2) iterable).m0a();
            AbstractC0628i.p(r22);
            r22.size();
            Iterator it = listM0a.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof AbstractC0527y2) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                AbstractC0527y2.g(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof InterfaceC0433i3) {
            r22.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (r22 instanceof ArrayList) {
                ((ArrayList) r22).ensureCapacity(r22.size() + size);
            }
            if (r22 instanceof C0439j3) {
                C0439j3 c0439j3 = (C0439j3) r22;
                int size2 = r22.size() + size;
                Object[] objArr = c0439j3.f6850x;
                if (size2 > objArr.length) {
                    if (objArr.length == 0) {
                        c0439j3.f6850x = new Object[Math.max(size2, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < size2) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        c0439j3.f6850x = Arrays.copyOf(c0439j3.f6850x, length);
                    }
                }
            }
        }
        int size3 = r22.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC0480q2.a(size3, r22);
                    throw null;
                }
                r22.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size4 = list.size();
        for (int i6 = 0; i6 < size4; i6++) {
            Object obj2 = list.get(i6);
            if (obj2 == null) {
                AbstractC0480q2.a(size3, r22);
                throw null;
            }
            r22.add(obj2);
        }
    }

    public abstract int a(InterfaceC0457m3 interfaceC0457m3);

    public final byte[] c() {
        try {
            int iA = ((I2) this).a(null);
            byte[] bArr = new byte[iA];
            A2 a22 = new A2(bArr, iA);
            ((I2) this).g(a22);
            if (a22.k() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(AbstractC0628i.j("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }
}
