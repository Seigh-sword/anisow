package j3;

import java.io.File;
import m3.P0;

/* JADX INFO: renamed from: j3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0851a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0 f9453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f9455c;

    public C0851a(m3.C c6, String str, File file) {
        this.f9453a = c6;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f9454b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f9455c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0851a)) {
            return false;
        }
        C0851a c0851a = (C0851a) obj;
        return this.f9453a.equals(c0851a.f9453a) && this.f9454b.equals(c0851a.f9454b) && this.f9455c.equals(c0851a.f9455c);
    }

    public final int hashCode() {
        return ((((this.f9453a.hashCode() ^ 1000003) * 1000003) ^ this.f9454b.hashCode()) * 1000003) ^ this.f9455c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f9453a + ", sessionId=" + this.f9454b + ", reportFile=" + this.f9455c + "}";
    }
}
