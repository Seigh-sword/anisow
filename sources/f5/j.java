package f5;

import d2.AbstractC0651b;
import java.io.Serializable;
import java.util.Arrays;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class j implements Serializable, Comparable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j f8462z = new j(new byte[0]);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f8463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient int f8464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public transient String f8465y;

    public j(byte[] bArr) {
        AbstractC1305a.o(bArr, "data");
        this.f8463w = bArr;
    }

    public static final j c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 * 2;
            bArr[i6] = (byte) (g5.b.a(str.charAt(i7 + 1)) + (g5.b.a(str.charAt(i7)) << 4));
        }
        return new j(bArr);
    }

    public static int g(j jVar, j jVar2) {
        jVar.getClass();
        AbstractC1305a.o(jVar2, "other");
        return jVar.f(0, jVar2.f8463w);
    }

    public static int k(j jVar, j jVar2) {
        jVar.getClass();
        AbstractC1305a.o(jVar2, "other");
        return jVar.j(-1234567890, jVar2.f8463w);
    }

    public static /* synthetic */ j o(j jVar, int i6, int i7, int i8) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = -1234567890;
        }
        return jVar.n(i6, i7);
    }

    public String a() {
        byte[] bArr = AbstractC0704a.f8441a;
        byte[] bArr2 = this.f8463w;
        AbstractC1305a.o(bArr2, "<this>");
        AbstractC1305a.o(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            byte b6 = bArr2[i6];
            int i8 = i6 + 2;
            byte b7 = bArr2[i6 + 1];
            i6 += 3;
            byte b8 = bArr2[i8];
            bArr3[i7] = bArr[(b6 & 255) >> 2];
            bArr3[i7 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            int i9 = i7 + 3;
            bArr3[i7 + 2] = bArr[((b7 & 15) << 2) | ((b8 & 255) >> 6)];
            i7 += 4;
            bArr3[i9] = bArr[b8 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b9 = bArr2[i6];
            bArr3[i7] = bArr[(b9 & 255) >> 2];
            bArr3[i7 + 1] = bArr[(b9 & 3) << 4];
            bArr3[i7 + 2] = 61;
            bArr3[i7 + 3] = 61;
        } else if (length2 == 2) {
            int i10 = i6 + 1;
            byte b10 = bArr2[i6];
            byte b11 = bArr2[i10];
            bArr3[i7] = bArr[(b10 & 255) >> 2];
            bArr3[i7 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            bArr3[i7 + 2] = bArr[(b11 & 15) << 2];
            bArr3[i7 + 3] = 61;
        }
        return new String(bArr3, K4.a.f1637a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(f5.j r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            s4.AbstractC1305a.o(r10, r0)
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.j.compareTo(f5.j):int");
    }

    public int d() {
        return this.f8463w.length;
    }

    public String e() {
        byte[] bArr = this.f8463w;
        char[] cArr = new char[bArr.length * 2];
        int i6 = 0;
        for (byte b6 : bArr) {
            int i7 = i6 + 1;
            char[] cArr2 = g5.b.f8534a;
            cArr[i6] = cArr2[(b6 >> 4) & 15];
            i6 += 2;
            cArr[i7] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int iD = jVar.d();
            byte[] bArr = this.f8463w;
            if (iD == bArr.length && jVar.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i6, byte[] bArr) {
        AbstractC1305a.o(bArr, "other");
        byte[] bArr2 = this.f8463w;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i6, 0);
        if (iMax <= length) {
            while (!AbstractC0651b.c(iMax, 0, bArr.length, bArr2, bArr)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public byte[] h() {
        return this.f8463w;
    }

    public int hashCode() {
        int i6 = this.f8464x;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = Arrays.hashCode(this.f8463w);
        this.f8464x = iHashCode;
        return iHashCode;
    }

    public byte i(int i6) {
        return this.f8463w[i6];
    }

    public int j(int i6, byte[] bArr) {
        AbstractC1305a.o(bArr, "other");
        int iY = AbstractC0651b.y(this, i6);
        byte[] bArr2 = this.f8463w;
        for (int iMin = Math.min(iY, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC0651b.c(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean l(int i6, int i7, int i8, byte[] bArr) {
        AbstractC1305a.o(bArr, "other");
        if (i6 >= 0) {
            byte[] bArr2 = this.f8463w;
            if (i6 <= bArr2.length - i8 && i7 >= 0 && i7 <= bArr.length - i8 && AbstractC0651b.c(i6, i7, i8, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean m(int i6, j jVar, int i7) {
        AbstractC1305a.o(jVar, "other");
        return jVar.l(0, i6, i7, this.f8463w);
    }

    public j n(int i6, int i7) {
        int iY = AbstractC0651b.y(this, i7);
        if (i6 < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        byte[] bArr = this.f8463w;
        if (iY > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (iY - i6 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (i6 == 0 && iY == bArr.length) {
            return this;
        }
        AbstractC1305a.t(iY, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i6, iY);
        AbstractC1305a.n(bArrCopyOfRange, "copyOfRange(...)");
        return new j(bArrCopyOfRange);
    }

    public j p() {
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f8463w;
            if (i6 >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i6];
            if (b6 >= 65 && b6 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC1305a.n(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i6] = (byte) (b6 + 32);
                for (int i7 = i6 + 1; i7 < bArrCopyOf.length; i7++) {
                    byte b7 = bArrCopyOf[i7];
                    if (b7 >= 65 && b7 <= 90) {
                        bArrCopyOf[i7] = (byte) (b7 + 32);
                    }
                }
                return new j(bArrCopyOf);
            }
            i6++;
        }
    }

    public final String q() {
        String str = this.f8465y;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        AbstractC1305a.o(bArrH, "<this>");
        String str2 = new String(bArrH, K4.a.f1637a);
        this.f8465y = str2;
        return str2;
    }

    public void r(C0710g c0710g, int i6) {
        AbstractC1305a.o(c0710g, "buffer");
        c0710g.V(this.f8463w, 0, i6);
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        j jVar;
        byte b6;
        int i6;
        byte[] bArr = this.f8463w;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        loop0: while (true) {
            if (i7 >= length) {
                break;
            }
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                int i10 = i9 + 1;
                if (i9 == 64) {
                    break;
                }
                if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (127 <= b7 && b7 < 160))) || b7 == 65533) {
                    break;
                }
                i8 += b7 < 65536 ? 1 : 2;
                i7++;
                while (true) {
                    i9 = i10;
                    if (i7 < length && (b6 = bArr[i7]) >= 0) {
                        i7++;
                        i10 = i9 + 1;
                        if (i9 == 64) {
                            break loop0;
                        }
                        if ((b6 != 10 && b6 != 13 && ((b6 >= 0 && b6 < 32) || (127 <= b6 && b6 < 160))) || b6 == 65533) {
                            break loop0;
                        }
                        i8 += b6 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b7 >> 5) == -2) {
                int i11 = i7 + 1;
                if (length > i11) {
                    byte b8 = bArr[i11];
                    if ((b8 & 192) == 128) {
                        int i12 = (b8 ^ 3968) ^ (b7 << 6);
                        if (i12 >= 128) {
                            i6 = i9 + 1;
                            if (i9 == 64) {
                                break;
                            }
                            if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                break;
                            }
                            i8 += i12 < 65536 ? 1 : 2;
                            i7 += 2;
                            i9 = i6;
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if ((b7 >> 4) == -2) {
                int i13 = i7 + 2;
                if (length > i13) {
                    byte b9 = bArr[i7 + 1];
                    if ((b9 & 192) == 128) {
                        byte b10 = bArr[i13];
                        if ((b10 & 192) == 128) {
                            int i14 = ((b10 ^ (-123008)) ^ (b9 << 6)) ^ (b7 << 12);
                            if (i14 < 2048) {
                                if (i9 != 64) {
                                    break;
                                }
                            } else if (55296 > i14 || i14 >= 57344) {
                                i6 = i9 + 1;
                                if (i9 == 64) {
                                    break;
                                }
                                if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                    break;
                                }
                                i8 += i14 < 65536 ? 1 : 2;
                                i7 += 3;
                                i9 = i6;
                            } else if (i9 != 64) {
                                break;
                            }
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if ((b7 >> 3) == -2) {
                int i15 = i7 + 3;
                if (length > i15) {
                    byte b11 = bArr[i7 + 1];
                    if ((b11 & 192) == 128) {
                        byte b12 = bArr[i7 + 2];
                        if ((b12 & 192) == 128) {
                            byte b13 = bArr[i15];
                            if ((b13 & 192) == 128) {
                                int i16 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b7 << 18);
                                if (i16 > 1114111) {
                                    if (i9 != 64) {
                                        break;
                                    }
                                } else if (55296 > i16 || i16 >= 57344) {
                                    if (i16 >= 65536) {
                                        i6 = i9 + 1;
                                        if (i9 == 64) {
                                            break;
                                        }
                                        if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                            break;
                                        }
                                        i8 += i16 < 65536 ? 1 : 2;
                                        i7 += 4;
                                        i9 = i6;
                                    } else if (i9 != 64) {
                                        break;
                                    }
                                } else if (i9 != 64) {
                                    break;
                                }
                            } else if (i9 != 64) {
                                break;
                            }
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if (i9 != 64) {
                break;
            }
        }
        i8 = -1;
        if (i8 != -1) {
            String strQ = q();
            String strSubstring = strQ.substring(0, i8);
            AbstractC1305a.n(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strI0 = K4.h.i0(K4.h.i0(K4.h.i0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i8 >= strQ.length()) {
                sb = new StringBuilder("[text=");
                sb.append(strI0);
                sb.append(']');
                return sb.toString();
            }
            sb2 = new StringBuilder("[size=");
            sb2.append(bArr.length);
            sb2.append(" text=");
            sb2.append(strI0);
            sb2.append("…]");
            return sb2.toString();
        }
        if (bArr.length <= 64) {
            sb = new StringBuilder("[hex=");
            sb.append(e());
            sb.append(']');
            return sb.toString();
        }
        sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        int iY = AbstractC0651b.y(this, 64);
        if (iY > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (iY < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (iY == bArr.length) {
            jVar = this;
        } else {
            AbstractC1305a.t(iY, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, iY);
            AbstractC1305a.n(bArrCopyOfRange, "copyOfRange(...)");
            jVar = new j(bArrCopyOfRange);
        }
        sb2.append(jVar.e());
        sb2.append("…]");
        return sb2.toString();
    }
}
