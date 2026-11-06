package p1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class o implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f12265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f12266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f12269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f12270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12271h;

    public o(String str) {
        s sVar = p.f12272a;
        this.f12266c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f12267d = str;
        AbstractC1332d.l(sVar, "Argument must not be null");
        this.f12265b = sVar;
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        if (this.f12270g == null) {
            this.f12270g = c().getBytes(j1.i.f9435a);
        }
        messageDigest.update(this.f12270g);
    }

    public final String c() {
        String str = this.f12267d;
        if (str != null) {
            return str;
        }
        URL url = this.f12266c;
        AbstractC1332d.l(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f12269f == null) {
            if (TextUtils.isEmpty(this.f12268e)) {
                String string = this.f12267d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f12266c;
                    AbstractC1332d.l(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f12268e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f12269f = new URL(this.f12268e);
        }
        return this.f12269f;
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return c().equals(oVar.c()) && this.f12265b.equals(oVar.f12265b);
    }

    @Override // j1.i
    public final int hashCode() {
        if (this.f12271h == 0) {
            int iHashCode = c().hashCode();
            this.f12271h = iHashCode;
            this.f12271h = this.f12265b.hashCode() + (iHashCode * 31);
        }
        return this.f12271h;
    }

    public final String toString() {
        return c();
    }

    public o(URL url) {
        s sVar = p.f12272a;
        AbstractC1332d.l(url, "Argument must not be null");
        this.f12266c = url;
        this.f12267d = null;
        AbstractC1332d.l(sVar, "Argument must not be null");
        this.f12265b = sVar;
    }
}
