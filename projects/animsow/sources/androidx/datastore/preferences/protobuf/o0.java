package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f5494a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f5495b = new n0();

    public static String a(AbstractC0280i abstractC0280i) {
        String str;
        StringBuilder sb = new StringBuilder(abstractC0280i.size());
        for (int i6 = 0; i6 < abstractC0280i.size(); i6++) {
            int iB = abstractC0280i.b(i6);
            if (iB == 34) {
                str = "\\\"";
            } else if (iB == 39) {
                str = "\\'";
            } else if (iB != 92) {
                switch (iB) {
                    case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "\\a";
                        break;
                    case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iB < 32 || iB > 126) {
                            sb.append('\\');
                            sb.append((char) (((iB >>> 6) & 3) + 48));
                            sb.append((char) (((iB >>> 3) & 7) + 48));
                            iB = (iB & 7) + 48;
                        }
                        sb.append((char) iB);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean b(byte b6) {
        return b6 > -65;
    }

    public abstract void c(byte[] bArr, int i6, int i7);
}
