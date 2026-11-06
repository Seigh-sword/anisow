package N3;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: N3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0116b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC0133t f2205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0115a f2206f;

    public C0116b(String str, String str2, String str3, C0115a c0115a) {
        EnumC0133t enumC0133t = EnumC0133t.LOG_ENVIRONMENT_PROD;
        this.f2201a = str;
        this.f2202b = str2;
        this.f2203c = "2.0.5";
        this.f2204d = str3;
        this.f2205e = enumC0133t;
        this.f2206f = c0115a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0116b)) {
            return false;
        }
        C0116b c0116b = (C0116b) obj;
        return AbstractC1305a.c(this.f2201a, c0116b.f2201a) && AbstractC1305a.c(this.f2202b, c0116b.f2202b) && AbstractC1305a.c(this.f2203c, c0116b.f2203c) && AbstractC1305a.c(this.f2204d, c0116b.f2204d) && this.f2205e == c0116b.f2205e && AbstractC1305a.c(this.f2206f, c0116b.f2206f);
    }

    public final int hashCode() {
        return this.f2206f.hashCode() + ((this.f2205e.hashCode() + AbstractC0628i.e(this.f2204d, AbstractC0628i.e(this.f2203c, AbstractC0628i.e(this.f2202b, this.f2201a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f2201a + ", deviceModel=" + this.f2202b + ", sessionSdkVersion=" + this.f2203c + ", osVersion=" + this.f2204d + ", logEnvironment=" + this.f2205e + ", androidAppInfo=" + this.f2206f + ')';
    }
}
