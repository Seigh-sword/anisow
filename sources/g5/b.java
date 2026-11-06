package g5;

import C4.p;
import D4.o;
import D4.q;
import D4.r;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import d.AbstractC0628i;
import f5.C0710g;
import f5.w;
import f5.y;
import j3.C0871u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import s4.AbstractC1305a;
import s4.C1311g;
import t4.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f8534a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' <= c6 && c6 < 'G') {
            return c6 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c6);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = w.f8492x;
        w wVarO = B3.e.o("/", false);
        C1311g[] c1311gArr = {new C1311g(wVarO, new f(wVarO))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1305a.M(1));
        J4.g.b0(linkedHashMap, c1311gArr);
        for (f fVar : n.i0(arrayList, new B.h(7))) {
            if (((f) linkedHashMap.put(fVar.f8545a, fVar)) == null) {
                while (true) {
                    w wVar = fVar.f8545a;
                    w wVarC = wVar.c();
                    if (wVarC != null) {
                        f fVar2 = (f) linkedHashMap.get(wVarC);
                        if (fVar2 != null) {
                            fVar2.f8552h.add(wVar);
                            break;
                        }
                        f fVar3 = new f(wVarC);
                        linkedHashMap.put(wVarC, fVar3);
                        fVar3.f8552h.add(wVar);
                        fVar = fVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i6) {
        AbstractC1305a.p(16);
        String string = Integer.toString(i6, 16);
        AbstractC1305a.n(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    public static final f d(y yVar) throws IOException {
        Long lValueOf;
        int i6;
        long j6;
        int iA = yVar.A();
        if (iA != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iA));
        }
        yVar.a(4L);
        short sG = yVar.g();
        int i7 = sG & 65535;
        if ((sG & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i7));
        }
        int iG = yVar.g() & 65535;
        short sG2 = yVar.g();
        int i8 = sG2 & 65535;
        short sG3 = yVar.g();
        int i9 = sG3 & 65535;
        if (i8 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i9 >> 9) & ModuleDescriptor.MODULE_VERSION) + 1980, ((i9 >> 5) & 15) - 1, sG3 & 31, (i8 >> 11) & 31, (i8 >> 5) & 63, (sG2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l5 = lValueOf;
        yVar.A();
        q qVar = new q();
        qVar.f376w = ((long) yVar.A()) & 4294967295L;
        q qVar2 = new q();
        qVar2.f376w = ((long) yVar.A()) & 4294967295L;
        int iG2 = yVar.g() & 65535;
        int iG3 = yVar.g() & 65535;
        int iG4 = yVar.g() & 65535;
        yVar.a(8L);
        q qVar3 = new q();
        qVar3.f376w = ((long) yVar.A()) & 4294967295L;
        String strH = yVar.h(iG2);
        if (K4.h.c0(strH, (char) 0, false, 2) >= 0) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (qVar2.f376w == 4294967295L) {
            j6 = 8;
            i6 = iG;
        } else {
            i6 = iG;
            j6 = 0;
        }
        if (qVar.f376w == 4294967295L) {
            j6 += (long) 8;
        }
        if (qVar3.f376w == 4294967295L) {
            j6 += (long) 8;
        }
        long j7 = j6;
        o oVar = new o();
        e(yVar, iG3, new g(oVar, j7, qVar2, yVar, qVar, qVar3));
        if (j7 > 0 && !oVar.f374w) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strH2 = yVar.h(iG4);
        String str = w.f8492x;
        return new f(B3.e.o("/", false).d(strH), K4.h.X(strH, "/", false), strH2, qVar.f376w, qVar2.f376w, i6, l5, qVar3.f376w);
    }

    public static final void e(y yVar, int i6, p pVar) throws IOException {
        long j6 = i6;
        while (j6 != 0) {
            if (j6 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iG = yVar.g() & 65535;
            long jG = ((long) yVar.g()) & 65535;
            long j7 = j6 - ((long) 4);
            if (j7 < jG) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            yVar.y(jG);
            C0710g c0710g = yVar.f8498x;
            long j8 = c0710g.f8461x;
            pVar.h(Integer.valueOf(iG), Long.valueOf(jG));
            long j9 = (c0710g.f8461x + jG) - j8;
            if (j9 < 0) {
                throw new IOException(AbstractC0628i.f("unsupported zip: too many bytes processed for ", iG));
            }
            if (j9 > 0) {
                c0710g.a(j9);
            }
            j6 = j7 - jG;
        }
    }

    public static final C0871u f(y yVar, C0871u c0871u) throws IOException {
        r rVar = new r();
        rVar.f377w = c0871u != null ? (Long) c0871u.f9546g : null;
        r rVar2 = new r();
        r rVar3 = new r();
        int iA = yVar.A();
        if (iA != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iA));
        }
        yVar.a(2L);
        short sG = yVar.g();
        int i6 = sG & 65535;
        if ((sG & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i6));
        }
        yVar.a(18L);
        long jG = ((long) yVar.g()) & 65535;
        int iG = yVar.g() & 65535;
        yVar.a(jG);
        if (c0871u == null) {
            yVar.a(iG);
            return null;
        }
        e(yVar, iG, new h(yVar, rVar, rVar2, rVar3));
        return new C0871u(c0871u.f9541b, c0871u.f9542c, null, (Long) c0871u.f9544e, (Long) rVar3.f377w, (Long) rVar.f377w, (Long) rVar2.f377w);
    }
}
