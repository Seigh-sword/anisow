package h5;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ParameterizedType {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Type f9099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Type f9100x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Type[] f9101y;

    public b0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            d0.a(type3);
        }
        this.f9099w = type;
        this.f9100x = type2;
        this.f9101y = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d0.b(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f9101y.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f9099w;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f9100x;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f9101y) ^ this.f9100x.hashCode();
        Type type = this.f9099w;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f9101y;
        int length = typeArr.length;
        Type type = this.f9100x;
        if (length == 0) {
            return d0.o(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(d0.o(type));
        sb.append("<");
        sb.append(d0.o(typeArr[0]));
        for (int i6 = 1; i6 < typeArr.length; i6++) {
            sb.append(", ");
            sb.append(d0.o(typeArr[i6]));
        }
        sb.append(">");
        return sb.toString();
    }
}
