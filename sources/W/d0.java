package W;

import d.AbstractC0628i;
import h0.C0733A;
import java.lang.reflect.InvocationTargetException;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends D4.i implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f4097A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f4099y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f4100z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i6) {
        super(1);
        this.f4098x = i6;
        this.f4099y = obj;
        this.f4100z = obj2;
        this.f4097A = obj3;
    }

    public final void a(Throwable th) throws IllegalAccessException, InvocationTargetException {
        C1316l c1316l;
        int i6 = this.f4098x;
        Object obj = this.f4100z;
        Object obj2 = this.f4097A;
        Object obj3 = this.f4099y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C4.l) obj3).j(th);
                P0.h hVar = (P0.h) obj;
                ((O4.g) hVar.f2409c).j(th);
                do {
                    Object objF = ((O4.g) hVar.f2409c).f();
                    if (objF instanceof O4.i) {
                        objF = null;
                    }
                    if (objF != null) {
                        ((C4.p) obj2).h(objF, th);
                        c1316l = C1316l.f12640a;
                    } else {
                        c1316l = null;
                    }
                } while (c1316l != null);
                return;
            case 1:
            default:
                InterfaceC1432j interfaceC1432j = (InterfaceC1432j) obj2;
                C0733A c0733aI = AbstractC1305a.i((C4.l) obj3, obj, null);
                if (c0733aI != null) {
                    S3.a.x(interfaceC1432j, c0733aI);
                    return;
                }
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (obj3 == O4.e.f2372l) {
                    return;
                }
                C4.l lVar = ((O4.c) obj).f2359x;
                AbstractC0628i.p(obj2);
                throw null;
        }
    }

    @Override // C4.l
    public final Object j(Object obj) throws IllegalAccessException, InvocationTargetException {
        C1316l c1316l = C1316l.f12640a;
        switch (this.f4098x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                a((Throwable) obj);
                break;
            case 1:
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return c1316l;
    }
}
