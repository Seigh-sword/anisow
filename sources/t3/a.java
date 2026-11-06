package T3;

import Q3.A;
import Q3.B;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class a implements B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3451w;

    @Override // Q3.B
    public final A a(Q3.n nVar, TypeToken typeToken) {
        switch (this.f3451w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Type type = typeToken.f7457b;
                boolean z5 = type instanceof GenericArrayType;
                if (!z5 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z5 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new b(nVar, nVar.c(new TypeToken(genericComponentType)), S3.a.w(genericComponentType));
            case 1:
                if (typeToken.f7456a == Date.class) {
                    return new e();
                }
                return null;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                Class superclass = typeToken.f7456a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new s(superclass);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (typeToken.f7456a == java.sql.Date.class) {
                    return new W3.a();
                }
                return null;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                if (typeToken.f7456a == Time.class) {
                    return new W3.b();
                }
                return null;
            default:
                if (typeToken.f7456a != Timestamp.class) {
                    return null;
                }
                nVar.getClass();
                return new W3.c(nVar.c(new TypeToken(Date.class)));
        }
    }
}
