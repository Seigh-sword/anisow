package S3;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Type f3239w;

    public b(Type type) {
        Objects.requireNonNull(type);
        this.f3239w = a.g(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && a.p(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f3239w;
    }

    public final int hashCode() {
        return this.f3239w.hashCode();
    }

    public final String toString() {
        return a.R(this.f3239w) + "[]";
    }
}
