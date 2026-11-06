package l4;

import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import java.util.Map;
import k4.InterfaceC0900a;
import l0.C0921c;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B3.e f10067d = new B3.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f10069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f10070c;

    public f(Map map, e0 e0Var, InterfaceC0900a interfaceC0900a) {
        this.f10068a = map;
        this.f10069b = e0Var;
        this.f10070c = new d(this, 0, interfaceC0900a);
    }

    @Override // androidx.lifecycle.e0
    public final b0 a(Class cls) {
        if (!this.f10068a.containsKey(cls)) {
            return this.f10069b.a(cls);
        }
        this.f10070c.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.e0
    public final b0 c(Class cls, C0921c c0921c) {
        return this.f10068a.containsKey(cls) ? this.f10070c.c(cls, c0921c) : this.f10069b.c(cls, c0921c);
    }
}
