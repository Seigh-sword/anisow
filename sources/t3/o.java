package T3;

import d.AbstractC0628i;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S3.q f3494b;

    public o(S3.q qVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f3494b = qVar;
    }

    @Override // T3.n
    public final Object d() {
        return this.f3494b.h();
    }

    @Override // T3.n
    public final void f(Object obj, X3.a aVar, m mVar) throws IllegalAccessException {
        Object objB = mVar.f3488i.b(aVar);
        if (objB == null && mVar.f3491l) {
            return;
        }
        boolean z5 = mVar.f3485f;
        Field field = mVar.f3481b;
        if (z5) {
            q.b(obj, field);
        } else if (mVar.f3492m) {
            throw new Q3.q(AbstractC0628i.q("Cannot set value of 'static final' ", V3.c.d(field, false)));
        }
        field.set(obj, objB);
    }

    @Override // T3.n
    public final Object e(Object obj) {
        return obj;
    }
}
