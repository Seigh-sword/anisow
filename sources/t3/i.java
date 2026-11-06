package T3;

import Q3.A;
import Q3.B;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class i implements B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1474r f3471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3472x = false;

    public i(C1474r c1474r) {
        this.f3471w = c1474r;
    }

    @Override // Q3.B
    public final A a(Q3.n nVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.f7457b;
        Class cls = typeToken.f7456a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            S3.a.h(Map.class.isAssignableFrom(cls));
            Type typeI = S3.a.I(type, cls, S3.a.t(type, cls, Map.class), new HashMap());
            actualTypeArguments = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new h(this, nVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? w.f3520c : nVar.c(new TypeToken(type2)), actualTypeArguments[1], nVar.c(new TypeToken(actualTypeArguments[1])), this.f3471w.d(typeToken));
    }
}
