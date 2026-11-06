package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0488s extends AbstractC0500u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6944b;

    public C0488s(int i6) {
        this.f6944b = i6;
        switch (i6) {
            case 1:
                ArrayList arrayList = this.f6963a;
                arrayList.add(F.EQUALS);
                arrayList.add(F.GREATER_THAN);
                arrayList.add(F.GREATER_THAN_EQUALS);
                arrayList.add(F.IDENTITY_EQUALS);
                arrayList.add(F.IDENTITY_NOT_EQUALS);
                arrayList.add(F.LESS_THAN);
                arrayList.add(F.LESS_THAN_EQUALS);
                arrayList.add(F.NOT_EQUALS);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ArrayList arrayList2 = this.f6963a;
                arrayList2.add(F.APPLY);
                arrayList2.add(F.BLOCK);
                arrayList2.add(F.BREAK);
                arrayList2.add(F.CASE);
                arrayList2.add(F.DEFAULT);
                arrayList2.add(F.CONTINUE);
                arrayList2.add(F.DEFINE_FUNCTION);
                arrayList2.add(F.FN);
                arrayList2.add(F.IF);
                arrayList2.add(F.QUOTE);
                arrayList2.add(F.RETURN);
                arrayList2.add(F.SWITCH);
                arrayList2.add(F.TERNARY);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                ArrayList arrayList3 = this.f6963a;
                arrayList3.add(F.AND);
                arrayList3.add(F.NOT);
                arrayList3.add(F.OR);
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                ArrayList arrayList4 = this.f6963a;
                arrayList4.add(F.FOR_IN);
                arrayList4.add(F.FOR_IN_CONST);
                arrayList4.add(F.FOR_IN_LET);
                arrayList4.add(F.FOR_LET);
                arrayList4.add(F.FOR_OF);
                arrayList4.add(F.FOR_OF_CONST);
                arrayList4.add(F.FOR_OF_LET);
                arrayList4.add(F.WHILE);
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                ArrayList arrayList5 = this.f6963a;
                arrayList5.add(F.ADD);
                arrayList5.add(F.DIVIDE);
                arrayList5.add(F.MODULUS);
                arrayList5.add(F.MULTIPLY);
                arrayList5.add(F.NEGATE);
                arrayList5.add(F.POST_DECREMENT);
                arrayList5.add(F.POST_INCREMENT);
                arrayList5.add(F.PRE_DECREMENT);
                arrayList5.add(F.PRE_INCREMENT);
                arrayList5.add(F.SUBTRACT);
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ArrayList arrayList6 = this.f6963a;
                arrayList6.add(F.ASSIGN);
                arrayList6.add(F.CONST);
                arrayList6.add(F.CREATE_ARRAY);
                arrayList6.add(F.CREATE_OBJECT);
                arrayList6.add(F.EXPRESSION_LIST);
                arrayList6.add(F.GET);
                arrayList6.add(F.GET_INDEX);
                arrayList6.add(F.GET_PROPERTY);
                arrayList6.add(F.NULL);
                arrayList6.add(F.SET_PROPERTY);
                arrayList6.add(F.TYPEOF);
                arrayList6.add(F.UNDEFINED);
                arrayList6.add(F.VAR);
                break;
            default:
                ArrayList arrayList7 = this.f6963a;
                arrayList7.add(F.BITWISE_AND);
                arrayList7.add(F.BITWISE_LEFT_SHIFT);
                arrayList7.add(F.BITWISE_NOT);
                arrayList7.add(F.BITWISE_OR);
                arrayList7.add(F.BITWISE_RIGHT_SHIFT);
                arrayList7.add(F.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList7.add(F.BITWISE_XOR);
                break;
        }
    }

    public static InterfaceC0459n b(B b6, Iterator it, InterfaceC0459n interfaceC0459n) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC0459n interfaceC0459n2 = (InterfaceC0459n) it.next();
                int i6 = b6.f6448a;
                P0.h hVarH = b6.f6449b;
                String str = b6.f6450c;
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        hVarH = hVarH.h();
                        hVarH.l(str, interfaceC0459n2);
                        ((Map) hVarH.f2410d).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        hVarH = hVarH.h();
                        hVarH.l(str, interfaceC0459n2);
                        break;
                    default:
                        hVarH.l(str, interfaceC0459n2);
                        break;
                }
                InterfaceC0459n interfaceC0459nI = hVarH.i((C0405e) interfaceC0459n);
                if (interfaceC0459nI instanceof C0423h) {
                    C0423h c0423h = (C0423h) interfaceC0459nI;
                    if ("break".equals(c0423h.f6833x)) {
                        return InterfaceC0459n.f6885n;
                    }
                    if ("return".equals(c0423h.f6833x)) {
                        return c0423h;
                    }
                }
            }
        }
        return InterfaceC0459n.f6885n;
    }

    public static C0465o c(P0.h hVar, ArrayList arrayList) {
        F2.r(F.FN, 2, arrayList);
        InterfaceC0459n interfaceC0459nJ = hVar.j((InterfaceC0459n) arrayList.get(0));
        InterfaceC0459n interfaceC0459nJ2 = hVar.j((InterfaceC0459n) arrayList.get(1));
        if (!(interfaceC0459nJ2 instanceof C0405e)) {
            throw new IllegalArgumentException(AbstractC0628i.q("FN requires an ArrayValue of parameter names found ", interfaceC0459nJ2.getClass().getCanonicalName()));
        }
        ArrayList arrayListY = ((C0405e) interfaceC0459nJ2).y();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new C0465o(interfaceC0459nJ.g(), arrayListY, arrayList2, hVar);
    }

    public static boolean d(InterfaceC0459n interfaceC0459n, InterfaceC0459n interfaceC0459n2) {
        InterfaceC0459n c0417g;
        InterfaceC0459n c0417g2;
        while (!interfaceC0459n.getClass().equals(interfaceC0459n2.getClass())) {
            if (((interfaceC0459n instanceof C0494t) || (interfaceC0459n instanceof C0447l)) && ((interfaceC0459n2 instanceof C0494t) || (interfaceC0459n2 instanceof C0447l))) {
                return true;
            }
            boolean z5 = interfaceC0459n instanceof C0417g;
            if (z5 && (interfaceC0459n2 instanceof C0471p)) {
                c0417g2 = new C0417g(interfaceC0459n2.p());
            } else {
                boolean z6 = interfaceC0459n instanceof C0471p;
                if (z6 && (interfaceC0459n2 instanceof C0417g)) {
                    c0417g = new C0417g(interfaceC0459n.p());
                } else if (interfaceC0459n instanceof C0411f) {
                    c0417g = new C0417g(interfaceC0459n.p());
                } else if (interfaceC0459n2 instanceof C0411f) {
                    c0417g2 = new C0417g(interfaceC0459n2.p());
                } else if ((z6 || z5) && (interfaceC0459n2 instanceof InterfaceC0429i)) {
                    c0417g2 = new C0471p(interfaceC0459n2.g());
                } else {
                    if (!(interfaceC0459n instanceof InterfaceC0429i) || (!(interfaceC0459n2 instanceof C0471p) && !(interfaceC0459n2 instanceof C0417g))) {
                        return false;
                    }
                    c0417g = new C0471p(interfaceC0459n.g());
                }
                interfaceC0459n = c0417g;
            }
            interfaceC0459n2 = c0417g2;
        }
        if ((interfaceC0459n instanceof C0494t) || (interfaceC0459n instanceof C0447l)) {
            return true;
        }
        return interfaceC0459n instanceof C0417g ? (Double.isNaN(interfaceC0459n.p().doubleValue()) || Double.isNaN(interfaceC0459n2.p().doubleValue()) || interfaceC0459n.p().doubleValue() != interfaceC0459n2.p().doubleValue()) ? false : true : interfaceC0459n instanceof C0471p ? interfaceC0459n.g().equals(interfaceC0459n2.g()) : interfaceC0459n instanceof C0411f ? interfaceC0459n.c().equals(interfaceC0459n2.c()) : interfaceC0459n == interfaceC0459n2;
    }

    public static InterfaceC0459n e(B b6, InterfaceC0459n interfaceC0459n, InterfaceC0459n interfaceC0459n2) {
        if (interfaceC0459n instanceof Iterable) {
            return b(b6, ((Iterable) interfaceC0459n).iterator(), interfaceC0459n2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(InterfaceC0459n interfaceC0459n, InterfaceC0459n interfaceC0459n2) {
        if (interfaceC0459n instanceof InterfaceC0429i) {
            interfaceC0459n = new C0471p(interfaceC0459n.g());
        }
        if (interfaceC0459n2 instanceof InterfaceC0429i) {
            interfaceC0459n2 = new C0471p(interfaceC0459n2.g());
        }
        if ((interfaceC0459n instanceof C0471p) && (interfaceC0459n2 instanceof C0471p)) {
            return interfaceC0459n.g().compareTo(interfaceC0459n2.g()) < 0;
        }
        double dDoubleValue = interfaceC0459n.p().doubleValue();
        double dDoubleValue2 = interfaceC0459n2.p().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean g(InterfaceC0459n interfaceC0459n, InterfaceC0459n interfaceC0459n2) {
        if (interfaceC0459n instanceof InterfaceC0429i) {
            interfaceC0459n = new C0471p(interfaceC0459n.g());
        }
        if (interfaceC0459n2 instanceof InterfaceC0429i) {
            interfaceC0459n2 = new C0471p(interfaceC0459n2.g());
        }
        return (((interfaceC0459n instanceof C0471p) && (interfaceC0459n2 instanceof C0471p)) || !(Double.isNaN(interfaceC0459n.p().doubleValue()) || Double.isNaN(interfaceC0459n2.p().doubleValue()))) && !f(interfaceC0459n2, interfaceC0459n);
    }
}
