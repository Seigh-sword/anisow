package o0;

import java.util.Iterator;
import s4.AbstractC1305a;
import s4.C1311g;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends D4.i implements C4.l {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d1 f11914y = new d1(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11915x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i6) {
        super(1);
        this.f11915x = i6;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        Object next;
        Object next2;
        C1316l c1316l = C1316l.f12640a;
        I i6 = I.f11773x;
        I i7 = I.f11774y;
        I i8 = I.f11772w;
        int i9 = this.f11915x;
        switch (i9) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C4.a aVar = (C4.a) obj;
                AbstractC1305a.o(aVar, "it");
                aVar.b();
                return c1316l;
            case 1:
                C1173b c1173b = (C1173b) obj;
                switch (i9) {
                    case 1:
                        AbstractC1305a.o(c1173b, "it");
                        c1173b.getClass();
                        return c1316l;
                    default:
                        AbstractC1305a.o(c1173b, "it");
                        c1173b.a(i7, 3);
                        c1173b.a(i6, 3);
                        return c1316l;
                }
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                C1173b c1173b2 = (C1173b) obj;
                switch (i9) {
                    case 1:
                        AbstractC1305a.o(c1173b2, "it");
                        c1173b2.getClass();
                        return c1316l;
                    default:
                        AbstractC1305a.o(c1173b2, "it");
                        c1173b2.a(i7, 3);
                        c1173b2.a(i6, 3);
                        return c1316l;
                }
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                C1173b c1173b3 = (C1173b) obj;
                AbstractC1305a.o(c1173b3, "it");
                Iterator it = c1173b3.f11892c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        I i10 = ((C1170a) next).f11887a;
                        if (i10 != i8) {
                            if (c1173b3.f11890a[i10.ordinal()] == 1) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                C1170a c1170a = (C1170a) next;
                if (c1170a == null) {
                    return null;
                }
                return new C1311g(c1170a.f11887a, c1170a.f11888b);
            default:
                C1173b c1173b4 = (C1173b) obj;
                AbstractC1305a.o(c1173b4, "it");
                Iterator it2 = c1173b4.f11892c.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (((C1170a) next2).f11887a == i8) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                C1170a c1170a2 = (C1170a) next2;
                if (c1170a2 != null) {
                    return c1170a2.f11888b;
                }
                return null;
        }
    }
}
