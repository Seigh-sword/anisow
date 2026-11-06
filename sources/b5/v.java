package b5;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import v0.C1409s;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Logger f6058A = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f5.i f6059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u f6060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f6061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0348d f6062z;

    public v(f5.i iVar, boolean z5) {
        this.f6059w = iVar;
        this.f6061y = z5;
        u uVar = new u(iVar);
        this.f6060x = uVar;
        this.f6062z = new C0348d(uVar);
    }

    public static int b(int i6, byte b6, short s5) throws IOException {
        if ((b6 & 8) != 0) {
            i6--;
        }
        if (s5 <= i6) {
            return (short) (i6 - s5);
        }
        g.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s5), Integer.valueOf(i6));
        throw null;
    }

    public static int n(f5.i iVar) {
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public final boolean c(boolean z5, q qVar) throws IOException {
        EnumC0346b enumC0346b;
        EnumC0346b enumC0346b2;
        z[] zVarArr;
        try {
            this.f6059w.y(9L);
            int iN = n(this.f6059w);
            if (iN < 0 || iN > 16384) {
                g.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iN));
                throw null;
            }
            byte b6 = (byte) (this.f6059w.readByte() & 255);
            if (z5 && b6 != 4) {
                g.c("Expected a SETTINGS frame but was %s", Byte.valueOf(b6));
                throw null;
            }
            byte b7 = (byte) (this.f6059w.readByte() & 255);
            int i6 = this.f6059w.readInt();
            int i7 = i6 & Integer.MAX_VALUE;
            Logger logger = f6058A;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i7, iN, b6, b7));
            }
            switch (b6) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    h(qVar, iN, b7, i7);
                    return true;
                case 1:
                    l(qVar, iN, b7, i7);
                    return true;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    if (iN != 5) {
                        g.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iN));
                        throw null;
                    }
                    if (i7 == 0) {
                        g.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    f5.i iVar = this.f6059w;
                    iVar.readInt();
                    iVar.readByte();
                    qVar.getClass();
                    return true;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (iN != 4) {
                        g.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iN));
                        throw null;
                    }
                    if (i7 == 0) {
                        g.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i8 = this.f6059w.readInt();
                    EnumC0346b[] enumC0346bArrValues = EnumC0346b.values();
                    int length = enumC0346bArrValues.length;
                    while (true) {
                        if (i < length) {
                            enumC0346b = enumC0346bArrValues[i];
                            if (enumC0346b.f5955w != i8) {
                                i++;
                            }
                        } else {
                            enumC0346b = null;
                        }
                    }
                    if (enumC0346b == null) {
                        g.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i8));
                        throw null;
                    }
                    s sVar = (s) qVar.f6014A;
                    sVar.getClass();
                    if (i7 != 0 && (i6 & 1) == 0) {
                        sVar.k(new h(sVar, "OkHttp %s Push Reset[%s]", new Object[]{sVar.f6043z, Integer.valueOf(i7)}, i7, enumC0346b, 1));
                        return true;
                    }
                    z zVarL = sVar.l(i7);
                    if (zVarL == null) {
                        return true;
                    }
                    synchronized (zVarL) {
                        if (zVarL.f6084k == null) {
                            zVarL.f6084k = enumC0346b;
                            zVarL.notifyAll();
                        }
                        break;
                    }
                    return true;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    if (i7 != 0) {
                        g.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b7 & 1) != 0) {
                        if (iN == 0) {
                            qVar.getClass();
                            return true;
                        }
                        g.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    if (iN % 6 != 0) {
                        g.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iN));
                        throw null;
                    }
                    C1409s c1409s = new C1409s();
                    for (int i9 = 0; i9 < iN; i9 += 6) {
                        f5.i iVar2 = this.f6059w;
                        int i10 = iVar2.readShort() & 65535;
                        int i11 = iVar2.readInt();
                        if (i10 == 2) {
                            if (i11 != 0 && i11 != 1) {
                                g.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                        } else if (i10 == 3) {
                            i10 = 4;
                        } else if (i10 != 4) {
                            if (i10 == 5 && (i11 < 16384 || i11 > 16777215)) {
                                g.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i11));
                                throw null;
                            }
                        } else {
                            if (i11 < 0) {
                                g.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                            i10 = 7;
                        }
                        c1409s.b(i10, i11);
                    }
                    qVar.getClass();
                    Object obj = qVar.f6014A;
                    ((s) obj).f6024D.execute(new r(qVar, new Object[]{((s) obj).f6043z}, c1409s));
                    return true;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    u(qVar, iN, b7, i7);
                    return true;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (iN != 8) {
                        g.c("TYPE_PING length != 8: %s", Integer.valueOf(iN));
                        throw null;
                    }
                    if (i7 != 0) {
                        g.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i12 = this.f6059w.readInt();
                    int i13 = this.f6059w.readInt();
                    i = (b7 & 1) != 0 ? 1 : 0;
                    qVar.getClass();
                    if (i == 0) {
                        Object obj2 = qVar.f6014A;
                        ((s) obj2).f6024D.execute(new p((s) obj2, i12, i13));
                        return true;
                    }
                    synchronized (((s) qVar.f6014A)) {
                        try {
                            if (i12 == 1) {
                                ((s) qVar.f6014A).f6028H++;
                            } else if (i12 == 2) {
                                ((s) qVar.f6014A).f6030J++;
                            } else if (i12 == 3) {
                                Object obj3 = qVar.f6014A;
                                ((s) obj3).getClass();
                                ((s) obj3).notifyAll();
                            }
                        } finally {
                        }
                        break;
                    }
                    return true;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (iN < 8) {
                        g.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iN));
                        throw null;
                    }
                    if (i7 != 0) {
                        g.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i14 = this.f6059w.readInt();
                    int i15 = this.f6059w.readInt();
                    int i16 = iN - 8;
                    EnumC0346b[] enumC0346bArrValues2 = EnumC0346b.values();
                    int length2 = enumC0346bArrValues2.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 < length2) {
                            enumC0346b2 = enumC0346bArrValues2[i17];
                            if (enumC0346b2.f5955w != i15) {
                                i17++;
                            }
                        } else {
                            enumC0346b2 = null;
                        }
                    }
                    if (enumC0346b2 == null) {
                        g.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i15));
                        throw null;
                    }
                    f5.j jVarM = f5.j.f8462z;
                    if (i16 > 0) {
                        jVarM = this.f6059w.m(i16);
                    }
                    qVar.getClass();
                    jVarM.d();
                    synchronized (((s) qVar.f6014A)) {
                        zVarArr = (z[]) ((s) qVar.f6014A).f6042y.values().toArray(new z[((s) qVar.f6014A).f6042y.size()]);
                        ((s) qVar.f6014A).f6023C = true;
                        break;
                    }
                    int length3 = zVarArr.length;
                    while (i < length3) {
                        z zVar = zVarArr[i];
                        if (zVar.f6076c > i14 && zVar.g()) {
                            EnumC0346b enumC0346b3 = EnumC0346b.REFUSED_STREAM;
                            synchronized (zVar) {
                                if (zVar.f6084k == null) {
                                    zVar.f6084k = enumC0346b3;
                                    zVar.notifyAll();
                                }
                            }
                            ((s) qVar.f6014A).l(zVar.f6076c);
                        }
                        i++;
                    }
                    return true;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (iN != 4) {
                        g.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iN));
                        throw null;
                    }
                    long j6 = ((long) this.f6059w.readInt()) & 2147483647L;
                    if (j6 == 0) {
                        g.c("windowSizeIncrement was 0", Long.valueOf(j6));
                        throw null;
                    }
                    if (i7 != 0) {
                        z zVarG = ((s) qVar.f6014A).g(i7);
                        if (zVarG != null) {
                            synchronized (zVarG) {
                                zVarG.f6075b += j6;
                                if (j6 > 0) {
                                    zVarG.notifyAll();
                                }
                            }
                        }
                        break;
                    } else {
                        synchronized (((s) qVar.f6014A)) {
                            Object obj4 = qVar.f6014A;
                            ((s) obj4).f6033M += j6;
                            ((s) obj4).notifyAll();
                            break;
                        }
                    }
                    return true;
                default:
                    this.f6059w.a(iN);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6059w.close();
    }

    public final void g(q qVar) throws IOException {
        if (this.f6061y) {
            if (c(true, qVar)) {
                return;
            }
            g.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        f5.j jVar = g.f5983a;
        f5.j jVarM = this.f6059w.m(jVar.f8463w.length);
        Level level = Level.FINE;
        Logger logger = f6058A;
        if (logger.isLoggable(level)) {
            String strE = jVarM.e();
            byte[] bArr = W4.b.f4484a;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + strE);
        }
        if (jVar.equals(jVarM)) {
            return;
        }
        g.c("Expected a connection header but was %s", jVarM.q());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        if (r16 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
    
        r3.i(W4.b.f4486c, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(b5.q r18, int r19, byte r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.v.h(b5.q, int, byte, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        throw new java.io.IOException(d.AbstractC0628i.f("Header index too large ", r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList k(int r3, short r4, byte r5, int r6) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.v.k(int, short, byte, int):java.util.ArrayList");
    }

    public final void l(q qVar, int i6, byte b6, int i7) throws IOException {
        if (i7 == 0) {
            g.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z5 = (b6 & 1) != 0;
        short s5 = (b6 & 8) != 0 ? (short) (this.f6059w.readByte() & 255) : (short) 0;
        if ((b6 & 32) != 0) {
            f5.i iVar = this.f6059w;
            iVar.readInt();
            iVar.readByte();
            qVar.getClass();
            i6 -= 5;
        }
        ArrayList arrayListK = k(b(i6, b6, s5), s5, b6, i7);
        ((s) qVar.f6014A).getClass();
        if (i7 != 0 && (i7 & 1) == 0) {
            s sVar = (s) qVar.f6014A;
            sVar.getClass();
            try {
                sVar.k(new k(sVar, new Object[]{sVar.f6043z, Integer.valueOf(i7)}, i7, arrayListK, z5));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (((s) qVar.f6014A)) {
            try {
                z zVarG = ((s) qVar.f6014A).g(i7);
                if (zVarG != null) {
                    zVarG.i(W4.b.s(arrayListK), z5);
                    return;
                }
                Object obj = qVar.f6014A;
                if (!((s) obj).f6023C && i7 > ((s) obj).f6021A && i7 % 2 != ((s) obj).f6022B % 2) {
                    z zVar = new z(i7, (s) qVar.f6014A, false, z5, W4.b.s(arrayListK));
                    Object obj2 = qVar.f6014A;
                    ((s) obj2).f6021A = i7;
                    ((s) obj2).f6042y.put(Integer.valueOf(i7), zVar);
                    s.f6020T.execute(new q(qVar, new Object[]{((s) qVar.f6014A).f6043z, Integer.valueOf(i7)}, zVar));
                }
            } finally {
            }
        }
    }

    public final void u(q qVar, int i6, byte b6, int i7) throws IOException {
        if (i7 == 0) {
            g.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s5 = (b6 & 8) != 0 ? (short) (this.f6059w.readByte() & 255) : (short) 0;
        int i8 = this.f6059w.readInt() & Integer.MAX_VALUE;
        ArrayList arrayListK = k(b(i6 - 4, b6, s5), s5, b6, i7);
        s sVar = (s) qVar.f6014A;
        synchronized (sVar) {
            try {
                if (sVar.f6039S.contains(Integer.valueOf(i8))) {
                    sVar.K(i8, EnumC0346b.PROTOCOL_ERROR);
                    return;
                }
                sVar.f6039S.add(Integer.valueOf(i8));
                try {
                    sVar.k(new h(sVar, "OkHttp %s Push Request[%s]", new Object[]{sVar.f6043z, Integer.valueOf(i8)}, i8, arrayListK, 2));
                } catch (RejectedExecutionException unused) {
                }
            } finally {
            }
        }
    }
}
