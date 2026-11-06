package h5;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements WildcardType {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Type f9103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Type f9104x;

    public c0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            d0.a(typeArr[0]);
            this.f9104x = null;
            this.f9103w = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        d0.a(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f9104x = typeArr2[0];
        this.f9103w = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d0.b(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f9104x;
        return type != null ? new Type[]{type} : d0.f9106a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f9103w};
    }

    public final int hashCode() {
        Type type = this.f9104x;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f9103w.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f9104x;
        if (type != null) {
            return "? super " + d0.o(type);
        }
        Type type2 = this.f9103w;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d0.o(type2);
    }
}
