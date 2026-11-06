package Q4;

import P4.c0;
import P4.o0;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class B extends c0 implements o0 {
    @Override // P4.o0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f2665D;
            AbstractC1305a.l(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f2666E + ((long) ((int) ((q() + ((long) this.f2668G)) - this.f2666E)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void x(int i6) {
        synchronized (this) {
            Object[] objArr = this.f2665D;
            AbstractC1305a.l(objArr);
            c(Integer.valueOf(((Number) objArr[((int) ((this.f2666E + ((long) ((int) ((q() + ((long) this.f2668G)) - this.f2666E)))) - 1)) & (objArr.length - 1)]).intValue() + i6));
        }
    }
}
