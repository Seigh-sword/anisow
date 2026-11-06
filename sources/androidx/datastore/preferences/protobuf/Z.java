package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5416a;

    static {
        char[] cArr = new char[80];
        f5416a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i6, StringBuilder sb) {
        while (i6 > 0) {
            int i7 = 80;
            if (i6 <= 80) {
                i7 = i6;
            }
            sb.append(f5416a, 0, i7);
            i6 -= i7;
        }
    }

    public static void b(StringBuilder sb, int i6, String str, Object obj) {
        String strA;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i6, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i6, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i7 = 1; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0282j c0282j = AbstractC0280i.f5452x;
            strA = o0.a(new C0282j(((String) obj).getBytes(F.f5369a)));
        } else {
            if (!(obj instanceof AbstractC0280i)) {
                if (obj instanceof C) {
                    sb.append(" {");
                    c((C) obj, sb, i6 + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                } else {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i8 = i6 + 2;
                    b(sb, i8, "key", entry.getKey());
                    b(sb, i8, "value", entry.getValue());
                }
                sb.append("\n");
                a(i6, sb);
                sb.append("}");
                return;
            }
            sb.append(": \"");
            strA = o0.a((AbstractC0280i) obj);
        }
        sb.append(strA);
        sb.append('\"');
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(androidx.datastore.preferences.protobuf.AbstractC0266b r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Z.c(androidx.datastore.preferences.protobuf.b, java.lang.StringBuilder, int):void");
    }
}
