package M4;

import s4.AbstractC1305a;
import v4.AbstractC1423a;
import v4.AbstractC1424b;
import v4.C1428f;
import v4.C1433k;
import v4.InterfaceC1429g;
import v4.InterfaceC1430h;
import v4.InterfaceC1431i;
import v4.InterfaceC1432j;

/* JADX INFO: renamed from: M4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0077w extends AbstractC1423a implements InterfaceC1429g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0076v f1927x = new C0076v(0);

    public AbstractC0077w() {
        super(C1428f.f13308w);
    }

    public abstract void J(InterfaceC1432j interfaceC1432j, Runnable runnable);

    public void K(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        J(interfaceC1432j, runnable);
    }

    public boolean L() {
        return !(this instanceof v0);
    }

    @Override // v4.AbstractC1423a, v4.InterfaceC1432j
    public final InterfaceC1432j l(InterfaceC1431i interfaceC1431i) {
        AbstractC1305a.o(interfaceC1431i, "key");
        boolean z5 = interfaceC1431i instanceof AbstractC1424b;
        C1433k c1433k = C1433k.f13309w;
        if (z5) {
            AbstractC1424b abstractC1424b = (AbstractC1424b) interfaceC1431i;
            InterfaceC1431i interfaceC1431i2 = this.f13300w;
            AbstractC1305a.o(interfaceC1431i2, "key");
            if ((interfaceC1431i2 == abstractC1424b || abstractC1424b.f13302x == interfaceC1431i2) && ((InterfaceC1430h) abstractC1424b.f13301w.j(this)) != null) {
                return c1433k;
            }
        } else if (C1428f.f13308w == interfaceC1431i) {
            return c1433k;
        }
        return this;
    }

    @Override // v4.AbstractC1423a, v4.InterfaceC1432j
    public final InterfaceC1430h n(InterfaceC1431i interfaceC1431i) {
        AbstractC1305a.o(interfaceC1431i, "key");
        if (!(interfaceC1431i instanceof AbstractC1424b)) {
            if (C1428f.f13308w == interfaceC1431i) {
                return this;
            }
            return null;
        }
        AbstractC1424b abstractC1424b = (AbstractC1424b) interfaceC1431i;
        InterfaceC1431i interfaceC1431i2 = this.f13300w;
        AbstractC1305a.o(interfaceC1431i2, "key");
        if (interfaceC1431i2 != abstractC1424b && abstractC1424b.f13302x != interfaceC1431i2) {
            return null;
        }
        InterfaceC1430h interfaceC1430h = (InterfaceC1430h) abstractC1424b.f13301w.j(this);
        if (interfaceC1430h instanceof InterfaceC1430h) {
            return interfaceC1430h;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + B.d(this);
    }
}
