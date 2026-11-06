package S3;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d implements WildcardType, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Type f3243w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Type f3244x;

    public d(Type[] typeArr, Type[] typeArr2) {
        a.h(typeArr2.length <= 1);
        a.h(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            a.i(typeArr[0]);
            this.f3244x = null;
            this.f3243w = a.g(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        a.i(typeArr2[0]);
        a.h(typeArr[0] == Object.class);
        this.f3244x = a.g(typeArr2[0]);
        this.f3243w = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && a.p(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f3244x;
        return type != null ? new Type[]{type} : a.f3238a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f3243w};
    }

    public final int hashCode() {
        Type type = this.f3244x;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f3243w.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f3244x;
        if (type != null) {
            return "? super " + a.R(type);
        }
        Type type2 = this.f3243w;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + a.R(type2);
    }
}
