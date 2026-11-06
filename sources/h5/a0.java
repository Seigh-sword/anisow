package h5;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements GenericArrayType {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Type f9097w;

    public a0(Type type) {
        this.f9097w = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d0.b(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f9097w;
    }

    public final int hashCode() {
        return this.f9097w.hashCode();
    }

    public final String toString() {
        return d0.o(this.f9097w) + "[]";
    }
}
