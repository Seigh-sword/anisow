package G;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f640e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f644d;

    public c(int i6, int i7, int i8, int i9) {
        this.f641a = i6;
        this.f642b = i7;
        this.f643c = i8;
        this.f644d = i9;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f641a, cVar2.f641a), Math.max(cVar.f642b, cVar2.f642b), Math.max(cVar.f643c, cVar2.f643c), Math.max(cVar.f644d, cVar2.f644d));
    }

    public static c b(int i6, int i7, int i8, int i9) {
        return (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) ? f640e : new c(i6, i7, i8, i9);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f641a, this.f642b, this.f643c, this.f644d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f644d == cVar.f644d && this.f641a == cVar.f641a && this.f643c == cVar.f643c && this.f642b == cVar.f642b;
    }

    public final int hashCode() {
        return (((((this.f641a * 31) + this.f642b) * 31) + this.f643c) * 31) + this.f644d;
    }

    public final String toString() {
        return "Insets{left=" + this.f641a + ", top=" + this.f642b + ", right=" + this.f643c + ", bottom=" + this.f644d + '}';
    }
}
