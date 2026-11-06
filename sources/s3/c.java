package S3;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Type f3240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Type f3241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Type[] f3242y;

    public c(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z5 = true;
            boolean z6 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z6) {
                z5 = false;
            }
            a.h(z5);
        }
        this.f3240w = type == null ? null : a.g(type);
        this.f3241x = a.g(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f3242y = typeArr2;
        int length = typeArr2.length;
        for (int i6 = 0; i6 < length; i6++) {
            Objects.requireNonNull(this.f3242y[i6]);
            a.i(this.f3242y[i6]);
            Type[] typeArr3 = this.f3242y;
            typeArr3[i6] = a.g(typeArr3[i6]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && a.p(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f3242y.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f3240w;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f3241x;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f3242y) ^ this.f3241x.hashCode();
        Type type = this.f3240w;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f3242y;
        int length = typeArr.length;
        Type type = this.f3241x;
        if (length == 0) {
            return a.R(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(a.R(type));
        sb.append("<");
        sb.append(a.R(typeArr[0]));
        for (int i6 = 1; i6 < length; i6++) {
            sb.append(", ");
            sb.append(a.R(typeArr[i6]));
        }
        sb.append(">");
        return sb.toString();
    }
}
