package L4;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f1738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f1739y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1740z = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f1741w;

    static {
        int i6 = b.f1742a;
        f1738x = Long.MAX_VALUE;
        f1739y = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb, int i6, int i7, int i8, String str) {
        CharSequence charSequenceSubSequence;
        sb.append(i6);
        if (i7 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i7);
            AbstractC1305a.o(strValueOf, "<this>");
            if (i8 < 0) {
                throw new IllegalArgumentException(H1.a.j("Desired length ", i8, " is less than zero."));
            }
            if (i8 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i8);
                H4.b it = new H4.c(1, i8 - strValueOf.length(), 1).iterator();
                while (it.f1065y) {
                    it.b();
                    sb2.append('0');
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i9 = -1;
            int length = string.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (string.charAt(length) != '0') {
                        i9 = length;
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        length = i10;
                    }
                }
            }
            int i11 = i9 + 1;
            if (i11 < 3) {
                sb.append((CharSequence) string, 0, i11);
            } else {
                sb.append((CharSequence) string, 0, ((i9 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static final long b(long j6) {
        return ((((int) j6) & 1) == 1 && (c(j6) ^ true)) ? j6 >> 1 : d(j6, c.MILLISECONDS);
    }

    public static final boolean c(long j6) {
        return j6 == f1738x || j6 == f1739y;
    }

    public static final long d(long j6, c cVar) {
        AbstractC1305a.o(cVar, "unit");
        if (j6 == f1738x) {
            return Long.MAX_VALUE;
        }
        if (j6 == f1739y) {
            return Long.MIN_VALUE;
        }
        long j7 = j6 >> 1;
        c cVar2 = (((int) j6) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS;
        AbstractC1305a.o(cVar2, "sourceUnit");
        return cVar.f1750w.convert(j7, cVar2.f1750w);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = ((a) obj).f1741w;
        long j7 = this.f1741w;
        long j8 = j7 ^ j6;
        int i6 = 1;
        if (j8 >= 0 && (((int) j8) & 1) != 0) {
            int i7 = (((int) j7) & 1) - (((int) j6) & 1);
            return j7 < 0 ? -i7 : i7;
        }
        if (j7 < j6) {
            i6 = -1;
        } else if (j7 == j6) {
            i6 = 0;
        }
        return i6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f1741w == ((a) obj).f1741w;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1741w);
    }

    public final String toString() {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        long j6 = this.f1741w;
        if (j6 == 0) {
            return "0s";
        }
        if (j6 == f1738x) {
            return "Infinity";
        }
        if (j6 == f1739y) {
            return "-Infinity";
        }
        boolean z5 = j6 < 0;
        StringBuilder sb = new StringBuilder();
        if (z5) {
            sb.append('-');
        }
        if (j6 < 0) {
            j6 = ((long) (((int) j6) & 1)) + ((-(j6 >> 1)) << 1);
            int i11 = b.f1742a;
        }
        long jD = d(j6, c.DAYS);
        int iD = c(j6) ? 0 : (int) (d(j6, c.HOURS) % ((long) 24));
        int iD2 = c(j6) ? 0 : (int) (d(j6, c.MINUTES) % ((long) 60));
        int iD3 = c(j6) ? 0 : (int) (d(j6, c.SECONDS) % ((long) 60));
        if (c(j6)) {
            i6 = 0;
        } else {
            i6 = (int) ((((int) j6) & 1) == 1 ? ((j6 >> 1) % ((long) 1000)) * ((long) 1000000) : (j6 >> 1) % ((long) 1000000000));
        }
        boolean z6 = jD != 0;
        boolean z7 = iD != 0;
        boolean z8 = iD2 != 0;
        boolean z9 = (iD3 == 0 && i6 == 0) ? false : true;
        if (z6) {
            sb.append(jD);
            sb.append('d');
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (z7 || (z6 && (z8 || z9))) {
            int i12 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(iD);
            sb.append('h');
            i7 = i12;
        }
        if (z8 || (z9 && (z7 || z6))) {
            int i13 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(iD2);
            sb.append('m');
            i7 = i13;
        }
        if (z9) {
            int i14 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            if (iD3 != 0 || z6 || z7 || z8) {
                a(sb, iD3, i6, 9, "s");
            } else {
                if (i6 >= 1000000) {
                    i8 = i6 / 1000000;
                    i9 = i6 % 1000000;
                    i10 = 6;
                    str = "ms";
                } else if (i6 >= 1000) {
                    i8 = i6 / 1000;
                    i9 = i6 % 1000;
                    i10 = 3;
                    str = "us";
                } else {
                    sb.append(i6);
                    sb.append("ns");
                }
                a(sb, i8, i9, i10, str);
            }
            i7 = i14;
        }
        if (z5 && i7 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        AbstractC1305a.n(string, "toString(...)");
        return string;
    }
}
