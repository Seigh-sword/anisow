package S3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3258a;

    static {
        int i6;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]");
            i6 = Integer.parseInt(strArrSplit[0]);
            if (i6 == 1 && strArrSplit.length > 1) {
                i6 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i6 = -1;
        }
        if (i6 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i7 = 0; i7 < property.length(); i7++) {
                    char cCharAt = property.charAt(i7);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i6 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i6 = -1;
            }
        }
        if (i6 == -1) {
            i6 = 6;
        }
        f3258a = i6;
    }
}
