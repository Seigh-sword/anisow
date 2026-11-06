package h5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import p1.C1243i;

/* JADX INFO: renamed from: h5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0780g extends AbstractC0789p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9110a;

    public C0780g(int i6) {
        this.f9110a = i6;
    }

    @Override // h5.AbstractC0789p
    public final InterfaceC0790q a(Type type) {
        switch (this.f9110a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (V4.E.class.isAssignableFrom(d0.e(type))) {
                    return C0775b.f9098w;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // h5.AbstractC0789p
    public final InterfaceC0790q b(Type type, Annotation[] annotationArr, W w5) {
        switch (this.f9110a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (type == V4.J.class) {
                    return d0.h(annotationArr, j5.w.class) ? C0776c.f9102w : C0774a.f9096w;
                }
                if (type == Void.class) {
                    return C0779f.f9109w;
                }
                if (d0.i(type)) {
                    return C0778e.f9108w;
                }
                return null;
            default:
                if (d0.e(type) != Optional.class) {
                    return null;
                }
                return new C1243i(29, w5.d(d0.d(0, (ParameterizedType) type), annotationArr));
        }
    }
}
