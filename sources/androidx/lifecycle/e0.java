package androidx.lifecycle;

import l0.C0921c;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public interface e0 {
    default b0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default b0 b(I4.b bVar, C0921c c0921c) {
        AbstractC1305a.o(bVar, "modelClass");
        return c(AbstractC1305a.D(bVar), c0921c);
    }

    default b0 c(Class cls, C0921c c0921c) {
        return a(cls);
    }
}
