package h5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: h5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f9127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9128d;

    public C0795w(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f9125a = cls;
        this.f9126b = obj;
        this.f9127c = method;
        this.f9128d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f9125a.getName(), this.f9127c.getName(), this.f9128d);
    }
}
