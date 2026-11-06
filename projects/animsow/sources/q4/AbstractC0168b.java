package Q4;

import java.util.Arrays;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: Q4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0168b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d[] f2830w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2831x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2832y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public B f2833z;

    public final d e() {
        d dVarF;
        B b6;
        synchronized (this) {
            try {
                d[] dVarArrG = this.f2830w;
                if (dVarArrG == null) {
                    dVarArrG = g();
                    this.f2830w = dVarArrG;
                } else if (this.f2831x >= dVarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrG, dVarArrG.length * 2);
                    AbstractC1305a.n(objArrCopyOf, "copyOf(...)");
                    this.f2830w = (d[]) objArrCopyOf;
                    dVarArrG = (d[]) objArrCopyOf;
                }
                int i6 = this.f2832y;
                do {
                    dVarF = dVarArrG[i6];
                    if (dVarF == null) {
                        dVarF = f();
                        dVarArrG[i6] = dVarF;
                    }
                    i6++;
                    if (i6 >= dVarArrG.length) {
                        i6 = 0;
                    }
                } while (!dVarF.a(this));
                this.f2832y = i6;
                this.f2831x++;
                b6 = this.f2833z;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b6 != null) {
            b6.x(1);
        }
        return dVarF;
    }

    public abstract d f();

    public abstract d[] g();

    public final void h(d dVar) {
        B b6;
        int i6;
        InterfaceC1427e[] interfaceC1427eArrB;
        synchronized (this) {
            try {
                int i7 = this.f2831x - 1;
                this.f2831x = i7;
                b6 = this.f2833z;
                if (i7 == 0) {
                    this.f2832y = 0;
                }
                AbstractC1305a.m(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1427eArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1427e interfaceC1427e : interfaceC1427eArrB) {
            if (interfaceC1427e != null) {
                interfaceC1427e.o(C1316l.f12640a);
            }
        }
        if (b6 != null) {
            b6.x(-1);
        }
    }

    public final B i() {
        B b6;
        synchronized (this) {
            b6 = this.f2833z;
            if (b6 == null) {
                int i6 = this.f2831x;
                b6 = new B(1, Integer.MAX_VALUE, O4.a.f2343x);
                b6.c(Integer.valueOf(i6));
                this.f2833z = b6;
            }
        }
        return b6;
    }
}
