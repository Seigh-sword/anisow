package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f5609b;

    public C0303c(Method method, int i6) {
        this.f5608a = i6;
        this.f5609b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0303c)) {
            return false;
        }
        C0303c c0303c = (C0303c) obj;
        return this.f5608a == c0303c.f5608a && this.f5609b.getName().equals(c0303c.f5609b.getName());
    }

    public final int hashCode() {
        return this.f5609b.getName().hashCode() + (this.f5608a * 31);
    }
}
