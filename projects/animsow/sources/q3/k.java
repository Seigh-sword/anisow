package Q3;

import d.AbstractC0628i;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public final class k extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2807a;

    public k(int i6) {
        this.f2807a = i6;
    }

    public static p f(X3.a aVar, int i6) {
        int iB = u.h.b(i6);
        if (iB == 5) {
            return new t(aVar.U());
        }
        if (iB == 6) {
            return new t(new S3.k(aVar.U()));
        }
        if (iB == 7) {
            return new t(Boolean.valueOf(aVar.M()));
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(H1.a.D(i6)));
        }
        aVar.S();
        return r.f2818w;
    }

    public static void g(p pVar, X3.b bVar) throws IOException {
        if (pVar == null || (pVar instanceof r)) {
            bVar.J();
            return;
        }
        boolean z5 = pVar instanceof t;
        if (z5) {
            if (!z5) {
                throw new IllegalStateException("Not a JSON Primitive: " + pVar);
            }
            t tVar = (t) pVar;
            Serializable serializable = tVar.f2820w;
            if (serializable instanceof Number) {
                bVar.P(tVar.b());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.R(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(tVar.c()));
                return;
            } else {
                bVar.Q(tVar.c());
                return;
            }
        }
        boolean z6 = pVar instanceof o;
        if (z6) {
            bVar.c();
            if (!z6) {
                throw new IllegalStateException("Not a JSON Array: " + pVar);
            }
            Iterator it = ((o) pVar).f2817w.iterator();
            while (it.hasNext()) {
                g((p) it.next(), bVar);
            }
            bVar.k();
            return;
        }
        boolean z7 = pVar instanceof s;
        if (!z7) {
            throw new IllegalArgumentException("Couldn't write " + pVar.getClass());
        }
        bVar.g();
        if (!z7) {
            throw new IllegalStateException("Not a JSON Object: " + pVar);
        }
        Iterator it2 = ((S3.m) ((s) pVar).f2819w.entrySet()).iterator();
        while (((S3.n) it2).hasNext()) {
            Map.Entry entry = (Map.Entry) ((S3.l) it2).next();
            bVar.n((String) entry.getKey());
            g((p) entry.getValue(), bVar);
        }
        bVar.l();
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        p oVar;
        p oVar2;
        switch (this.f2807a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return e(aVar);
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.J()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.O()));
                    } catch (NumberFormatException e6) {
                        throw new q(e6);
                    }
                }
                aVar.k();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i6 = 0; i6 < size; i6++) {
                    atomicIntegerArray.set(i6, ((Integer) arrayList.get(i6)).intValue());
                }
                return atomicIntegerArray;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return e(aVar);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return e(aVar);
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return e(aVar);
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                String strU = aVar.U();
                if (strU.length() == 1) {
                    return Character.valueOf(strU.charAt(0));
                }
                StringBuilder sbN = AbstractC0628i.n("Expecting character, got: ", strU, "; at ");
                sbN.append(aVar.u(true));
                throw new q(sbN.toString());
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                int iW = aVar.W();
                if (iW != 9) {
                    return iW == 8 ? Boolean.toString(aVar.M()) : aVar.U();
                }
                aVar.S();
                return null;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                String strU2 = aVar.U();
                try {
                    return new BigDecimal(strU2);
                } catch (NumberFormatException e7) {
                    StringBuilder sbN2 = AbstractC0628i.n("Failed parsing '", strU2, "' as BigDecimal; at path ");
                    sbN2.append(aVar.u(true));
                    throw new q(sbN2.toString(), e7);
                }
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                String strU3 = aVar.U();
                try {
                    return new BigInteger(strU3);
                } catch (NumberFormatException e8) {
                    StringBuilder sbN3 = AbstractC0628i.n("Failed parsing '", strU3, "' as BigInteger; at path ");
                    sbN3.append(aVar.u(true));
                    throw new q(sbN3.toString(), e8);
                }
            case 9:
                if (aVar.W() != 9) {
                    return new S3.k(aVar.U());
                }
                aVar.S();
                return null;
            case 10:
                if (aVar.W() != 9) {
                    return new StringBuilder(aVar.U());
                }
                aVar.S();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (aVar.W() != 9) {
                    return new StringBuffer(aVar.U());
                }
                aVar.S();
                return null;
            case 13:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                String strU4 = aVar.U();
                if ("null".equals(strU4)) {
                    return null;
                }
                return new URL(strU4);
            case 14:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                try {
                    String strU5 = aVar.U();
                    if ("null".equals(strU5)) {
                        return null;
                    }
                    return new URI(strU5);
                } catch (URISyntaxException e9) {
                    throw new q(e9);
                }
            case 15:
                if (aVar.W() != 9) {
                    return InetAddress.getByName(aVar.U());
                }
                aVar.S();
                return null;
            case 16:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                String strU6 = aVar.U();
                try {
                    return UUID.fromString(strU6);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbN4 = AbstractC0628i.n("Failed parsing '", strU6, "' as UUID; at path ");
                    sbN4.append(aVar.u(true));
                    throw new q(sbN4.toString(), e10);
                }
            case 17:
                String strU7 = aVar.U();
                try {
                    return Currency.getInstance(strU7);
                } catch (IllegalArgumentException e11) {
                    StringBuilder sbN5 = AbstractC0628i.n("Failed parsing '", strU7, "' as Currency; at path ");
                    sbN5.append(aVar.u(true));
                    throw new q(sbN5.toString(), e11);
                }
            case 18:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                aVar.c();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (aVar.W() != 4) {
                    String strQ = aVar.Q();
                    int iO = aVar.O();
                    if ("year".equals(strQ)) {
                        i7 = iO;
                    } else if ("month".equals(strQ)) {
                        i8 = iO;
                    } else if ("dayOfMonth".equals(strQ)) {
                        i9 = iO;
                    } else if ("hourOfDay".equals(strQ)) {
                        i10 = iO;
                    } else if ("minute".equals(strQ)) {
                        i11 = iO;
                    } else if ("second".equals(strQ)) {
                        i12 = iO;
                    }
                }
                aVar.l();
                return new GregorianCalendar(i7, i8, i9, i10, i11, i12);
            case 19:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.U(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 20:
                int iW2 = aVar.W();
                int iB = u.h.b(iW2);
                if (iB == 0) {
                    aVar.b();
                    oVar = new o();
                } else if (iB != 2) {
                    oVar = null;
                } else {
                    aVar.c();
                    oVar = new s();
                }
                if (oVar == null) {
                    return f(aVar, iW2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.J()) {
                        String strQ2 = oVar instanceof s ? aVar.Q() : null;
                        int iW3 = aVar.W();
                        int iB2 = u.h.b(iW3);
                        if (iB2 == 0) {
                            aVar.b();
                            oVar2 = new o();
                        } else if (iB2 != 2) {
                            oVar2 = null;
                        } else {
                            aVar.c();
                            oVar2 = new s();
                        }
                        boolean z5 = oVar2 != null;
                        if (oVar2 == null) {
                            oVar2 = f(aVar, iW3);
                        }
                        if (oVar instanceof o) {
                            ((o) oVar).f2817w.add(oVar2);
                        } else {
                            ((s) oVar).f2819w.put(strQ2, oVar2);
                        }
                        if (z5) {
                            arrayDeque.addLast(oVar);
                            oVar = oVar2;
                        }
                    } else {
                        if (oVar instanceof o) {
                            aVar.k();
                        } else {
                            aVar.l();
                        }
                        if (arrayDeque.isEmpty()) {
                            return oVar;
                        }
                        oVar = (p) arrayDeque.removeLast();
                    }
                }
                break;
            case 21:
                BitSet bitSet = new BitSet();
                aVar.b();
                int iW4 = aVar.W();
                int i13 = 0;
                while (iW4 != 2) {
                    int iB3 = u.h.b(iW4);
                    if (iB3 == 5 || iB3 == 6) {
                        int iO2 = aVar.O();
                        if (iO2 != 0) {
                            if (iO2 != 1) {
                                StringBuilder sbL = H1.a.l("Invalid bitset value ", iO2, ", expected 0 or 1; at path ");
                                sbL.append(aVar.u(true));
                                throw new q(sbL.toString());
                            }
                            bitSet.set(i13);
                        } else {
                            continue;
                        }
                    } else {
                        if (iB3 != 7) {
                            throw new q("Invalid bitset value type: " + H1.a.D(iW4) + "; at path " + aVar.u(false));
                        }
                        if (aVar.M()) {
                            bitSet.set(i13);
                        }
                    }
                    i13++;
                    iW4 = aVar.W();
                }
                aVar.k();
                return bitSet;
            case 22:
                return d(aVar);
            case 23:
                return d(aVar);
            case 24:
                return e(aVar);
            case 25:
                return e(aVar);
            case 26:
                return e(aVar);
            case 27:
                try {
                    return new AtomicInteger(aVar.O());
                } catch (NumberFormatException e12) {
                    throw new q(e12);
                }
            default:
                return new AtomicBoolean(aVar.M());
        }
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        int i6 = this.f2807a;
        int i7 = 0;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                h(bVar, (Number) obj);
                return;
            case 1:
                bVar.c();
                int length = ((AtomicIntegerArray) obj).length();
                while (i7 < length) {
                    bVar.N(r7.get(i7));
                    i7++;
                }
                bVar.k();
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                h(bVar, (Number) obj);
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                h(bVar, (Number) obj);
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                h(bVar, (Number) obj);
                return;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                Character ch = (Character) obj;
                bVar.Q(ch != null ? String.valueOf(ch) : null);
                return;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                bVar.Q((String) obj);
                return;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                bVar.P((BigDecimal) obj);
                return;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                bVar.P((BigInteger) obj);
                return;
            case 9:
                bVar.P((S3.k) obj);
                return;
            case 10:
                StringBuilder sb = (StringBuilder) obj;
                bVar.Q(sb != null ? sb.toString() : null);
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.Q(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case 13:
                URL url = (URL) obj;
                bVar.Q(url != null ? url.toExternalForm() : null);
                return;
            case 14:
                URI uri = (URI) obj;
                bVar.Q(uri != null ? uri.toASCIIString() : null);
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                bVar.Q(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case 16:
                UUID uuid = (UUID) obj;
                bVar.Q(uuid != null ? uuid.toString() : null);
                return;
            case 17:
                bVar.Q(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                if (((Calendar) obj) == null) {
                    bVar.J();
                    return;
                }
                bVar.g();
                bVar.n("year");
                bVar.N(r7.get(1));
                bVar.n("month");
                bVar.N(r7.get(2));
                bVar.n("dayOfMonth");
                bVar.N(r7.get(5));
                bVar.n("hourOfDay");
                bVar.N(r7.get(11));
                bVar.n("minute");
                bVar.N(r7.get(12));
                bVar.n("second");
                bVar.N(r7.get(13));
                bVar.l();
                return;
            case 19:
                Locale locale = (Locale) obj;
                bVar.Q(locale != null ? locale.toString() : null);
                return;
            case 20:
                g((p) obj, bVar);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                bVar.c();
                int length2 = bitSet.length();
                while (i7 < length2) {
                    bVar.N(bitSet.get(i7) ? 1L : 0L);
                    i7++;
                }
                bVar.k();
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                switch (i6) {
                    case 22:
                        bVar.O(bool);
                        return;
                    default:
                        bVar.Q(bool != null ? bool.toString() : "null");
                        return;
                }
            case 23:
                Boolean bool2 = (Boolean) obj;
                switch (i6) {
                    case 22:
                        bVar.O(bool2);
                        return;
                    default:
                        bVar.Q(bool2 != null ? bool2.toString() : "null");
                        return;
                }
            case 24:
                h(bVar, (Number) obj);
                return;
            case 25:
                h(bVar, (Number) obj);
                return;
            case 26:
                h(bVar, (Number) obj);
                return;
            case 27:
                bVar.N(((AtomicInteger) obj).get());
                return;
            default:
                bVar.R(((AtomicBoolean) obj).get());
                return;
        }
    }

    public final Boolean d(X3.a aVar) throws IOException {
        switch (this.f2807a) {
            case 22:
                int iW = aVar.W();
                if (iW != 9) {
                    return Boolean.valueOf(iW == 6 ? Boolean.parseBoolean(aVar.U()) : aVar.M());
                }
                aVar.S();
                return null;
            default:
                if (aVar.W() != 9) {
                    return Boolean.valueOf(aVar.U());
                }
                aVar.S();
                return null;
        }
    }

    public final Number e(X3.a aVar) throws IOException {
        switch (this.f2807a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (aVar.W() != 9) {
                    return Long.valueOf(aVar.P());
                }
                aVar.S();
                return null;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.P());
                } catch (NumberFormatException e6) {
                    throw new q(e6);
                }
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (aVar.W() != 9) {
                    return Float.valueOf((float) aVar.N());
                }
                aVar.S();
                return null;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                if (aVar.W() != 9) {
                    return Double.valueOf(aVar.N());
                }
                aVar.S();
                return null;
            case 24:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                try {
                    int iO = aVar.O();
                    if (iO <= 255 && iO >= -128) {
                        return Byte.valueOf((byte) iO);
                    }
                    StringBuilder sbL = H1.a.l("Lossy conversion from ", iO, " to byte; at path ");
                    sbL.append(aVar.u(true));
                    throw new q(sbL.toString());
                } catch (NumberFormatException e7) {
                    throw new q(e7);
                }
            case 25:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                try {
                    int iO2 = aVar.O();
                    if (iO2 <= 65535 && iO2 >= -32768) {
                        return Short.valueOf((short) iO2);
                    }
                    StringBuilder sbL2 = H1.a.l("Lossy conversion from ", iO2, " to short; at path ");
                    sbL2.append(aVar.u(true));
                    throw new q(sbL2.toString());
                } catch (NumberFormatException e8) {
                    throw new q(e8);
                }
            default:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.O());
                } catch (NumberFormatException e9) {
                    throw new q(e9);
                }
        }
    }

    public final void h(X3.b bVar, Number number) throws IOException {
        switch (this.f2807a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (number != null) {
                    bVar.Q(number.toString());
                } else {
                    bVar.J();
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (number != null) {
                    bVar.N(number.longValue());
                } else {
                    bVar.J();
                }
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (number != null) {
                    if (!(number instanceof Float)) {
                        number = Float.valueOf(number.floatValue());
                    }
                    bVar.P(number);
                } else {
                    bVar.J();
                }
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                if (number != null) {
                    bVar.M(number.doubleValue());
                } else {
                    bVar.J();
                }
                break;
            case 24:
                if (number != null) {
                    bVar.N(number.byteValue());
                } else {
                    bVar.J();
                }
                break;
            case 25:
                if (number != null) {
                    bVar.N(number.shortValue());
                } else {
                    bVar.J();
                }
                break;
            default:
                if (number != null) {
                    bVar.N(number.intValue());
                } else {
                    bVar.J();
                }
                break;
        }
    }
}
