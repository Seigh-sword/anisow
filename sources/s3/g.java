package S3;

import h5.C0786m;
import h5.C0787n;
import h5.D;
import h5.InterfaceC0784k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements q, InterfaceC0784k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Type f3248w;

    public /* synthetic */ g(Type type) {
        this.f3248w = type;
    }

    @Override // h5.InterfaceC0784k
    public final Type a() {
        return this.f3248w;
    }

    @Override // h5.InterfaceC0784k
    public final Object b(D d6) {
        C0787n c0787n = new C0787n(d6);
        d6.c(new C0786m(this, 0, c0787n));
        return c0787n;
    }

    @Override // S3.q
    public final Object h() {
        Type type = this.f3248w;
        if (!(type instanceof ParameterizedType)) {
            throw new Q3.q("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new Q3.q("Invalid EnumMap type: " + type.toString());
    }
}
