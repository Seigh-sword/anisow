package h5;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z f9095a = new Z();

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return Y.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof Y;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + Y.class.getName() + "()";
    }
}
