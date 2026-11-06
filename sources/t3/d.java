package T3;

import Q3.A;
import Q3.B;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class d implements B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1474r f3459x;

    public /* synthetic */ d(C1474r c1474r, int i6) {
        this.f3458w = i6;
        this.f3459x = c1474r;
    }

    public static A b(C1474r c1474r, Q3.n nVar, TypeToken typeToken, R3.a aVar) {
        A a6;
        Object objH = c1474r.d(new TypeToken(aVar.value())).h();
        boolean zNullSafe = aVar.nullSafe();
        if (objH instanceof A) {
            a6 = (A) objH;
        } else {
            if (!(objH instanceof B)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objH.getClass().getName() + " as a @JsonAdapter for " + S3.a.R(typeToken.f7457b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a6 = ((B) objH).a(nVar, typeToken);
        }
        return (a6 == null || !zNullSafe) ? a6 : a6.a();
    }

    @Override // Q3.B
    public final A a(Q3.n nVar, TypeToken typeToken) {
        int i6 = this.f3458w;
        C1474r c1474r = this.f3459x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Type type = typeToken.f7457b;
                Class cls = typeToken.f7456a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                S3.a.h(Collection.class.isAssignableFrom(cls));
                Type typeI = S3.a.I(type, cls, S3.a.t(type, cls, Collection.class), new HashMap());
                Class cls2 = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments()[0] : Object.class;
                return new c(nVar, cls2, nVar.c(new TypeToken(cls2)), c1474r.d(typeToken));
            default:
                R3.a aVar = (R3.a) typeToken.f7456a.getAnnotation(R3.a.class);
                if (aVar == null) {
                    return null;
                }
                return b(c1474r, nVar, typeToken, aVar);
        }
    }
}
