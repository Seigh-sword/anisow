package P4;

import Q4.AbstractC0169c;
import d.AbstractC0628i;
import j3.C0848A;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0848A f2673a = new C0848A(2, "NO_VALUE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0848A f2674b = new C0848A(2, "NONE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0848A f2675c = new C0848A(2, "PENDING");

    public static final c0 a(int i6, int i7, O4.a aVar) {
        if (i6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.f("replay cannot be negative, but was ", i6).toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.f("extraBufferCapacity cannot be negative, but was ", i7).toString());
        }
        if (i6 <= 0 && i7 <= 0 && aVar != O4.a.f2342w) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i8 = i7 + i6;
        if (i8 < 0) {
            i8 = Integer.MAX_VALUE;
        }
        return new c0(i6, i8, aVar);
    }

    public static final q0 b(Object obj) {
        if (obj == null) {
            obj = AbstractC0169c.f2835b;
        }
        return new q0(obj);
    }

    public static final void c(Object[] objArr, long j6, Object obj) {
        objArr[((int) j6) & (objArr.length - 1)] = obj;
    }

    public static final InterfaceC0146g d(Z z5, InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        return ((i6 == 0 || i6 == -3) && aVar == O4.a.f2342w) ? z5 : new Q4.j(i6, interfaceC1432j, aVar, z5);
    }
}
