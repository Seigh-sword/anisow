package K4;

import W.Q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends f {
    public static boolean W(String str, String str2) {
        return b0(str, str2, 0, false, 2) >= 0;
    }

    public static boolean X(String str, String str2, boolean z5) {
        return !z5 ? str.endsWith(str2) : g0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final int Y(CharSequence charSequence) {
        AbstractC1305a.o(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Z(CharSequence charSequence, String str, int i6, boolean z5) {
        AbstractC1305a.o(charSequence, "<this>");
        AbstractC1305a.o(str, "string");
        return (z5 || !(charSequence instanceof String)) ? a0(charSequence, str, i6, charSequence.length(), z5, false) : ((String) charSequence).indexOf(str, i6);
    }

    public static final int a0(CharSequence charSequence, CharSequence charSequence2, int i6, int i7, boolean z5, boolean z6) {
        H4.a aVar;
        if (z6) {
            int iY = Y(charSequence);
            if (i6 > iY) {
                i6 = iY;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            aVar = new H4.a(i6, i7, -1);
        } else {
            if (i6 < 0) {
                i6 = 0;
            }
            int length = charSequence.length();
            if (i7 > length) {
                i7 = length;
            }
            aVar = new H4.c(i6, i7, 1);
        }
        boolean z7 = charSequence instanceof String;
        int i8 = aVar.f1062y;
        int i9 = aVar.f1061x;
        int i10 = aVar.f1060w;
        if (z7 && (charSequence2 instanceof String)) {
            if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
                while (!g0(0, i10, charSequence2.length(), (String) charSequence2, (String) charSequence, z5)) {
                    if (i10 != i9) {
                        i10 += i8;
                    }
                }
                return i10;
            }
        } else if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
            while (!h0(charSequence2, charSequence, i10, charSequence2.length(), z5)) {
                if (i10 != i9) {
                    i10 += i8;
                }
            }
            return i10;
        }
        return -1;
    }

    public static /* synthetic */ int b0(CharSequence charSequence, String str, int i6, boolean z5, int i7) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        return Z(charSequence, str, i6, z5);
    }

    public static int c0(String str, char c6, boolean z5, int i6) {
        char upperCase;
        char upperCase2;
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        if (!z5) {
            return str.indexOf(c6, 0);
        }
        char[] cArr = {c6};
        if (!z5) {
            return str.indexOf(cArr[0], 0);
        }
        H4.b it = new H4.c(0, Y(str), 1).iterator();
        while (it.f1065y) {
            int iB = it.b();
            char cCharAt = str.charAt(iB);
            char c7 = cArr[0];
            if (c7 == cCharAt || (z5 && ((upperCase = Character.toUpperCase(c7)) == (upperCase2 = Character.toUpperCase(cCharAt)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                return iB;
            }
        }
        return -1;
    }

    public static boolean d0(CharSequence charSequence) {
        AbstractC1305a.o(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable cVar = new H4.c(0, charSequence.length() - 1, 1);
        if ((cVar instanceof Collection) && ((Collection) cVar).isEmpty()) {
            return true;
        }
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            if (!AbstractC1305a.L(charSequence.charAt(((H4.b) it).b()))) {
                return false;
            }
        }
        return true;
    }

    public static int e0(String str, String str2, int i6) {
        int iY = (i6 & 2) != 0 ? Y(str) : 0;
        AbstractC1305a.o(str, "<this>");
        AbstractC1305a.o(str2, "string");
        return str.lastIndexOf(str2, iY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List f0(CharSequence charSequence) {
        AbstractC1305a.o(charSequence, "<this>");
        List listAsList = Arrays.asList("\r\n", "\n", "\r");
        AbstractC1305a.n(listAsList, "asList(...)");
        return J4.e.e0(new J4.c(new c(charSequence, 0, 0, new g(0, listAsList, 0 == true ? 1 : 0)), new Q(18, charSequence)));
    }

    public static final boolean g0(int i6, int i7, int i8, String str, String str2, boolean z5) {
        AbstractC1305a.o(str, "<this>");
        AbstractC1305a.o(str2, "other");
        return !z5 ? str.regionMatches(i6, str2, i7, i8) : str.regionMatches(z5, i6, str2, i7, i8);
    }

    public static final boolean h0(CharSequence charSequence, CharSequence charSequence2, int i6, int i7, boolean z5) {
        char upperCase;
        char upperCase2;
        AbstractC1305a.o(charSequence, "<this>");
        AbstractC1305a.o(charSequence2, "other");
        if (i6 < 0 || charSequence.length() - i7 < 0 || i6 > charSequence2.length() - i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            char cCharAt = charSequence.charAt(i8);
            char cCharAt2 = charSequence2.charAt(i6 + i8);
            if (cCharAt != cCharAt2 && (!z5 || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String i0(String str, String str2, String str3) {
        int iZ = Z(str, str2, 0, false);
        if (iZ < 0) {
            return str;
        }
        int length = str2.length();
        int i6 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i7 = 0;
        do {
            sb.append((CharSequence) str, i7, iZ);
            sb.append(str3);
            i7 = iZ + length;
            if (iZ >= str.length()) {
                break;
            }
            iZ = Z(str, str2, iZ + i6, false);
        } while (iZ > 0);
        sb.append((CharSequence) str, i7, str.length());
        String string = sb.toString();
        AbstractC1305a.n(string, "toString(...)");
        return string;
    }

    public static String j0(String str, String str2) {
        AbstractC1305a.o(str2, "delimiter");
        int iB0 = b0(str, str2, 0, false, 6);
        if (iB0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iB0, str.length());
        AbstractC1305a.n(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String k0(String str, String str2) {
        AbstractC1305a.o(str, "<this>");
        AbstractC1305a.o(str2, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, Y(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC1305a.n(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence l0(String str) {
        int length = str.length() - 1;
        int i6 = 0;
        boolean z5 = false;
        while (i6 <= length) {
            boolean zL = AbstractC1305a.L(str.charAt(!z5 ? i6 : length));
            if (z5) {
                if (!zL) {
                    break;
                }
                length--;
            } else if (zL) {
                i6++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i6, length + 1);
    }
}
