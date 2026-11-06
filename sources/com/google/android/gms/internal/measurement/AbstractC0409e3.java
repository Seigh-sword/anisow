package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0409e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f6792a;

    static {
        char[] cArr = new char[80];
        f6792a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i6, StringBuilder sb) {
        while (i6 > 0) {
            int i7 = 80;
            if (i6 <= 80) {
                i7 = i6;
            }
            sb.append(f6792a, 0, i7);
            i6 -= i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.google.android.gms.internal.measurement.InterfaceC0403d3 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0409e3.b(com.google.android.gms.internal.measurement.d3, java.lang.StringBuilder, int):void");
    }

    public static void c(StringBuilder sb, int i6, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i6, str, (Map.Entry) it2.next());
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
            C0533z2 c0533z2 = AbstractC0527y2.f7008x;
            sb.append(F2.j(new C0533z2(((String) obj).getBytes(K2.f6615a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0527y2) {
            sb.append(": \"");
            sb.append(F2.j((AbstractC0527y2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof I2) {
            sb.append(" {");
            b((I2) obj, sb, i6 + 2);
            sb.append("\n");
            a(i6, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i8 = i6 + 2;
        c(sb, i8, "key", entry.getKey());
        c(sb, i8, "value", entry.getValue());
        sb.append("\n");
        a(i6, sb);
        sb.append("}");
    }
}
