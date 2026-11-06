package m3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: m3.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1098f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I0 f11504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f11508e;

    public final C1100g0 a() {
        I0 i02;
        String str;
        String str2;
        if (this.f11508e == 1 && (i02 = this.f11504a) != null && (str = this.f11505b) != null && (str2 = this.f11506c) != null) {
            return new C1100g0(i02, str, str2, this.f11507d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11504a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f11505b == null) {
            sb.append(" parameterKey");
        }
        if (this.f11506c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f11508e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
