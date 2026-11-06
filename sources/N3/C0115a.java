package N3;

import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: N3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0115a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0134u f2199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f2200f;

    public C0115a(String str, String str2, String str3, String str4, C0134u c0134u, ArrayList arrayList) {
        AbstractC1305a.o(str2, "versionName");
        AbstractC1305a.o(str3, "appBuildVersion");
        this.f2195a = str;
        this.f2196b = str2;
        this.f2197c = str3;
        this.f2198d = str4;
        this.f2199e = c0134u;
        this.f2200f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0115a)) {
            return false;
        }
        C0115a c0115a = (C0115a) obj;
        return AbstractC1305a.c(this.f2195a, c0115a.f2195a) && AbstractC1305a.c(this.f2196b, c0115a.f2196b) && AbstractC1305a.c(this.f2197c, c0115a.f2197c) && AbstractC1305a.c(this.f2198d, c0115a.f2198d) && AbstractC1305a.c(this.f2199e, c0115a.f2199e) && AbstractC1305a.c(this.f2200f, c0115a.f2200f);
    }

    public final int hashCode() {
        return this.f2200f.hashCode() + ((this.f2199e.hashCode() + AbstractC0628i.e(this.f2198d, AbstractC0628i.e(this.f2197c, AbstractC0628i.e(this.f2196b, this.f2195a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f2195a + ", versionName=" + this.f2196b + ", appBuildVersion=" + this.f2197c + ", deviceManufacturer=" + this.f2198d + ", currentProcessDetails=" + this.f2199e + ", appProcessDetails=" + this.f2200f + ')';
    }
}
