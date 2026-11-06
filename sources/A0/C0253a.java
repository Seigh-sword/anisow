package a0;

import C4.l;
import java.util.Map;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0253a extends D4.i implements l {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0253a f4981x = new C0253a(1);

    @Override // C4.l
    public final Object j(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        AbstractC1305a.o(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            AbstractC1305a.o(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i6 = 0;
            for (byte b6 : bArr) {
                i6++;
                if (i6 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b6));
            }
            sb.append((CharSequence) "]");
            strValueOf = sb.toString();
            AbstractC1305a.n(strValueOf, "toString(...)");
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((f) entry.getKey()).f4990a + " = " + strValueOf;
    }
}
