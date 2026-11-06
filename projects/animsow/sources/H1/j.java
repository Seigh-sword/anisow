package H1;

import android.util.Base64;
import i.C0803c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E1.d f936c;

    public j(String str, byte[] bArr, E1.d dVar) {
        this.f934a = str;
        this.f935b = bArr;
        this.f936c = dVar;
    }

    public static C0803c a() {
        C0803c c0803c = new C0803c(24);
        c0803c.R(E1.d.f385w);
        return c0803c;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        byte[] bArr = this.f935b;
        return "TransportContext(" + this.f934a + ", " + this.f936c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }

    public final j c(E1.d dVar) {
        C0803c c0803cA = a();
        c0803cA.Q(this.f934a);
        c0803cA.R(dVar);
        c0803cA.f9278y = this.f935b;
        return c0803cA.k();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f934a.equals(jVar.f934a) && Arrays.equals(this.f935b, jVar.f935b) && this.f936c.equals(jVar.f936c);
    }

    public final int hashCode() {
        return ((((this.f934a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f935b)) * 1000003) ^ this.f936c.hashCode();
    }
}
