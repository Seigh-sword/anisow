package o0;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import s4.AbstractC1305a;
import s4.C1316l;
import t.C1325h;
import t.C1327j;
import t4.C1351h;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends D4.i implements C4.l {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11993y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f11994z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj, int i6, Object obj2) {
        super(1);
        this.f11992x = i6;
        this.f11994z = obj;
        this.f11993y = obj2;
    }

    public final void a(Throwable th) {
        int i6 = this.f11992x;
        Object obj = this.f11993y;
        Object obj2 = this.f11994z;
        switch (i6) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (th == null) {
                    C1325h c1325h = (C1325h) obj2;
                    Object objH = ((M4.E) obj).h();
                    c1325h.f12671d = true;
                    C1327j c1327j = c1325h.f12669b;
                    if (c1327j != null && c1327j.f12674x.i(objH)) {
                        c1325h.f12668a = null;
                        c1325h.f12669b = null;
                        c1325h.f12670c = null;
                        break;
                    }
                } else {
                    C1325h c1325h2 = (C1325h) obj2;
                    if (!(th instanceof CancellationException)) {
                        c1325h2.f12671d = true;
                        C1327j c1327j2 = c1325h2.f12669b;
                        if (c1327j2 != null && c1327j2.f12674x.j(th)) {
                            c1325h2.f12668a = null;
                            c1325h2.f12669b = null;
                            c1325h2.f12670c = null;
                            break;
                        }
                    } else {
                        c1325h2.f12671d = true;
                        C1327j c1327j3 = c1325h2.f12669b;
                        if (c1327j3 != null && c1327j3.f12674x.cancel(true)) {
                            c1325h2.f12668a = null;
                            c1325h2.f12669b = null;
                            c1325h2.f12670c = null;
                            break;
                        }
                    }
                }
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((N4.c) obj2).f2283y.removeCallbacks((Runnable) obj);
                break;
            default:
                ((T4.d) obj2).f(obj);
                break;
        }
    }

    @Override // C4.l
    public final Object j(Object obj) {
        Object next;
        C1316l c1316l = C1316l.f12640a;
        switch (this.f11992x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C1173b c1173b = (C1173b) obj;
                AbstractC1305a.o(c1173b, "it");
                I i6 = (I) this.f11994z;
                f1 f1Var = (f1) this.f11993y;
                AbstractC1305a.o(i6, "loadType");
                AbstractC1305a.o(f1Var, "pagingState");
                C1351h c1351h = c1173b.f11892c;
                Iterator it = c1351h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C1170a) next).f11887a == i6) {
                        }
                    } else {
                        next = null;
                    }
                }
                C1170a c1170a = (C1170a) next;
                boolean z5 = false;
                if (c1170a != null) {
                    c1170a.f11888b = f1Var;
                } else {
                    int i7 = c1173b.f11890a[i6.ordinal()];
                    I i8 = I.f11772w;
                    if (i7 == 3 && i6 != i8) {
                        c1351h.addLast(new C1170a(i6, f1Var));
                    } else if (i7 == 1 || i6 == i8) {
                        C1168D[] c1168dArr = c1173b.f11891b;
                        if (i6 == i8) {
                            c1168dArr[0] = null;
                        }
                        if (c1168dArr[i6.ordinal()] == null) {
                            c1351h.addLast(new C1170a(i6, f1Var));
                            z5 = true;
                        }
                    }
                }
                break;
            case 1:
            default:
                a((Throwable) obj);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                a((Throwable) obj);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                a((Throwable) obj);
                break;
        }
        return c1316l;
    }
}
