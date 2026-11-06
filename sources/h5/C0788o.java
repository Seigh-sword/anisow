package h5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: h5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788o extends AbstractC0783j {
    @Override // h5.AbstractC0783j
    public final InterfaceC0784k a(Type type, Annotation[] annotationArr) {
        if (d0.e(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeD = d0.d(0, (ParameterizedType) type);
        if (d0.e(typeD) != U.class) {
            return new S3.g(typeD);
        }
        if (typeD instanceof ParameterizedType) {
            return new S3.f(d0.d(0, (ParameterizedType) typeD));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
