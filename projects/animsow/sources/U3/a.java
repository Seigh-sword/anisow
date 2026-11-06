package U3;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f3637a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i6, char c6) {
        return i6 < str.length() && str.charAt(i6) == c6;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(String str, int i6, int i7) {
        int i8;
        int i9;
        if (i6 < 0 || i7 > str.length() || i6 > i7) {
            throw new NumberFormatException(str);
        }
        if (i6 < i7) {
            i9 = i6 + 1;
            int iDigit = Character.digit(str.charAt(i6), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i6, i7));
            }
            i8 = -iDigit;
        } else {
            i8 = 0;
            i9 = i6;
        }
        while (i9 < i7) {
            int i10 = i9 + 1;
            int iDigit2 = Character.digit(str.charAt(i9), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i6, i7));
            }
            i8 = (i8 * 10) - iDigit2;
            i9 = i10;
        }
        return -i8;
    }
}
