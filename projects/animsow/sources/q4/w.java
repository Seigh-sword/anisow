package Q4;

import P4.InterfaceC0147h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0.C1166B;
import s4.AbstractC1305a;
import s4.AbstractC1313i;
import s4.C1316l;
import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class w extends x4.c implements InterfaceC0147h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC1432j f2876A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f2877B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC1432j f2878C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC1427e f2879D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC0147h f2880z;

    public w(InterfaceC0147h interfaceC0147h, InterfaceC1432j interfaceC1432j) {
        super(t.f2873w, C1433k.f13309w);
        this.f2880z = interfaceC0147h;
        this.f2876A = interfaceC1432j;
        this.f2877B = ((Number) interfaceC1432j.g(0, v.f2875x)).intValue();
    }

    @Override // x4.AbstractC1492a, x4.d
    public final x4.d e() {
        InterfaceC1427e interfaceC1427e = this.f2879D;
        if (interfaceC1427e instanceof x4.d) {
            return (x4.d) interfaceC1427e;
        }
        return null;
    }

    @Override // x4.c, v4.InterfaceC1427e
    public final InterfaceC1432j i() {
        InterfaceC1432j interfaceC1432j = this.f2878C;
        return interfaceC1432j == null ? C1433k.f13309w : interfaceC1432j;
    }

    @Override // P4.InterfaceC0147h
    public final Object k(Object obj, InterfaceC1427e interfaceC1427e) {
        try {
            Object objT = t(interfaceC1427e, obj);
            return objT == EnumC1481a.f13592w ? objT : C1316l.f12640a;
        } catch (Throwable th) {
            this.f2878C = new r(interfaceC1427e.i(), th);
            throw th;
        }
    }

    @Override // x4.AbstractC1492a
    public final StackTraceElement m() {
        return null;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        Throwable thA = AbstractC1313i.a(obj);
        if (thA != null) {
            this.f2878C = new r(i(), thA);
        }
        InterfaceC1427e interfaceC1427e = this.f2879D;
        if (interfaceC1427e != null) {
            interfaceC1427e.o(obj);
        }
        return EnumC1481a.f13592w;
    }

    @Override // x4.c, x4.AbstractC1492a
    public final void p() {
        super.p();
    }

    public final Object t(InterfaceC1427e interfaceC1427e, Object obj) {
        Comparable comparable;
        String strSubstring;
        InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
        S3.a.o(interfaceC1432jI);
        InterfaceC1432j interfaceC1432j = this.f2878C;
        if (interfaceC1432j != interfaceC1432jI) {
            int i6 = 1;
            int i7 = 0;
            if (interfaceC1432j instanceof r) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((r) interfaceC1432j).f2871w + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                AbstractC1305a.o(str, "<this>");
                List listF0 = K4.h.f0(str);
                List list = listF0;
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!K4.h.d0((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t4.k.W(arrayList));
                for (String str2 : arrayList) {
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        if (!AbstractC1305a.L(str2.charAt(length2))) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listF0.size();
                int iU = S3.a.u(listF0);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str3 = (String) obj3;
                    if ((i7 == 0 || i7 == iU) && K4.h.d0(str3)) {
                        strSubstring = null;
                    } else {
                        AbstractC1305a.o(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(H1.a.j("Requested character count ", iIntValue, " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        AbstractC1305a.n(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList3.add(strSubstring);
                    }
                    i7 = i8;
                }
                StringBuilder sb = new StringBuilder(length3);
                t4.n.d0(arrayList3, sb, "\n", "", "", -1, "...", null);
                String string = sb.toString();
                AbstractC1305a.n(string, "toString(...)");
                throw new IllegalStateException(string.toString());
            }
            if (((Number) interfaceC1432jI.g(0, new C1166B(i6, this))).intValue() != this.f2877B) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f2876A + ",\n\t\tbut emission happened in " + interfaceC1432jI + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f2878C = interfaceC1432jI;
        }
        this.f2879D = interfaceC1427e;
        C4.q qVar = y.f2882a;
        InterfaceC0147h interfaceC0147h = this.f2880z;
        AbstractC1305a.m(interfaceC0147h, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objG = qVar.g(interfaceC0147h, obj, this);
        if (!AbstractC1305a.c(objG, EnumC1481a.f13592w)) {
            this.f2879D = null;
        }
        return objG;
    }
}
