package l1;

import android.util.Log;
import com.google.android.gms.internal.measurement.C0396c2;
import d.AbstractC0628i;
import i.C0803c;
import j1.EnumC0843a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC1332d;
import v1.InterfaceC1417a;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1417a f9956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M.b f9957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9958e;

    public n(Class cls, Class cls2, Class cls3, List list, InterfaceC1417a interfaceC1417a, C0803c c0803c) {
        this.f9954a = cls;
        this.f9955b = list;
        this.f9956c = interfaceC1417a;
        this.f9957d = c0803c;
        this.f9958e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final F a(int i6, int i7, j1.m mVar, com.bumptech.glide.load.data.g gVar, C0396c2 c0396c2) {
        F fA;
        j1.q qVar;
        int iE;
        boolean z5;
        boolean z6;
        boolean z7;
        Object c0932f;
        M.b bVar = this.f9957d;
        Object objH = bVar.h();
        AbstractC1332d.l(objH, "Argument must not be null");
        List list = (List) objH;
        try {
            F fB = b(gVar, i6, i7, mVar, list);
            bVar.d(list);
            m mVar2 = (m) c0396c2.f6776y;
            EnumC0843a enumC0843a = (EnumC0843a) c0396c2.f6775x;
            mVar2.getClass();
            Class<?> cls = fB.a().getClass();
            EnumC0843a enumC0843a2 = EnumC0843a.f9427z;
            C0935i c0935i = mVar2.f9950w;
            j1.p pVarA = null;
            if (enumC0843a != enumC0843a2) {
                j1.q qVarF = c0935i.f(cls);
                fA = qVarF.a(mVar2.f9925D, fB, mVar2.f9929H, mVar2.f9930I);
                qVar = qVarF;
            } else {
                fA = fB;
                qVar = null;
            }
            if (!fB.equals(fA)) {
                fB.f();
            }
            if (c0935i.f9900c.a().f6349d.a(fA.d()) != null) {
                com.bumptech.glide.j jVarA = c0935i.f9900c.a();
                jVarA.getClass();
                pVarA = jVarA.f6349d.a(fA.d());
                if (pVarA == null) {
                    throw new com.bumptech.glide.i(2, fA.d());
                }
                iE = pVarA.e(mVar2.f9932K);
            } else {
                iE = 3;
            }
            j1.i iVar = mVar2.f9939R;
            ArrayList arrayListB = c0935i.b();
            int size = arrayListB.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    z5 = false;
                    break;
                }
                if (((p1.w) arrayListB.get(i8)).f12286a.equals(iVar)) {
                    z5 = true;
                    break;
                }
                i8++;
            }
            boolean z8 = !z5;
            switch (((o) mVar2.f9931J).f9959d) {
                case 1:
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    break;
                default:
                    if (((z8 && enumC0843a == EnumC0843a.f9426y) || enumC0843a == EnumC0843a.f9424w) && iE == 2) {
                        if (pVarA == null) {
                            throw new com.bumptech.glide.i(2, fA.a().getClass());
                        }
                        int iB = u.h.b(iE);
                        if (iB == 0) {
                            z6 = true;
                            z7 = false;
                            c0932f = new C0932f(mVar2.f9939R, mVar2.f9926E);
                        } else {
                            if (iB != 1) {
                                throw new IllegalArgumentException("Unknown strategy: ".concat(AbstractC0628i.v(iE)));
                            }
                            z6 = true;
                            c0932f = new H(c0935i.f9900c.f6331a, mVar2.f9939R, mVar2.f9926E, mVar2.f9929H, mVar2.f9930I, qVar, cls, mVar2.f9932K);
                            z7 = false;
                        }
                        C0926E c0926e = (C0926E) C0926E.f9847A.h();
                        c0926e.f9851z = z7;
                        c0926e.f9850y = z6;
                        c0926e.f9849x = fA;
                        k kVar = mVar2.f9923B;
                        kVar.f9916a = c0932f;
                        kVar.f9917b = pVarA;
                        kVar.f9918c = c0926e;
                        fA = c0926e;
                    }
                    break;
            }
            return this.f9956c.f(fA, mVar);
        } catch (Throwable th) {
            bVar.d(list);
            throw th;
        }
    }

    public final F b(com.bumptech.glide.load.data.g gVar, int i6, int i7, j1.m mVar, List list) throws C0922A {
        List list2 = this.f9955b;
        int size = list2.size();
        F fB = null;
        for (int i8 = 0; i8 < size; i8++) {
            j1.o oVar = (j1.o) list2.get(i8);
            try {
                if (oVar.a(gVar.a(), mVar)) {
                    fB = oVar.b(gVar.a(), i6, i7, mVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + oVar, e6);
                }
                list.add(e6);
            }
            if (fB != null) {
                break;
            }
        }
        if (fB != null) {
            return fB;
        }
        throw new C0922A(this.f9958e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f9954a + ", decoders=" + this.f9955b + ", transcoder=" + this.f9956c + '}';
    }
}
