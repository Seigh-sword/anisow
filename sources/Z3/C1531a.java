package z3;

/* JADX INFO: renamed from: z3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1531a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f14109b;

    public C1531a(int i6, d dVar) {
        this.f14108a = i6;
        this.f14109b = dVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14108a == ((C1531a) eVar).f14108a && this.f14109b.equals(((C1531a) eVar).f14109b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f14108a) + (this.f14109b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14108a + "intEncoding=" + this.f14109b + ')';
    }
}
