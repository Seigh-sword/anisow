package h5;

import b3.C0343c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: h5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0791s extends AbstractC0783j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9117a;

    public C0791s(Executor executor) {
        this.f9117a = executor;
    }

    @Override // h5.AbstractC0783j
    public final InterfaceC0784k a(Type type, Annotation[] annotationArr) {
        if (d0.e(type) != InterfaceC0782i.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C0343c(this, d0.d(0, (ParameterizedType) type), d0.h(annotationArr, Y.class) ? null : this.f9117a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
