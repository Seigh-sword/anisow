package L;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f1651e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f1652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f1655d;

    static {
        for (int i6 = 0; i6 < 1792; i6++) {
            f1651e[i6] = Character.getDirectionality(i6);
        }
    }

    public a(CharSequence charSequence) {
        this.f1652a = charSequence;
        this.f1653b = charSequence.length();
    }

    public final byte a() {
        int i6 = this.f1654c - 1;
        CharSequence charSequence = this.f1652a;
        char cCharAt = charSequence.charAt(i6);
        this.f1655d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f1654c);
            this.f1654c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f1654c--;
        char c6 = this.f1655d;
        return c6 < 1792 ? f1651e[c6] : Character.getDirectionality(c6);
    }
}
