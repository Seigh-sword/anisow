package l1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.g f9974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f9975b;

    public s(y1.g gVar, Executor executor) {
        this.f9974a = gVar;
        this.f9975b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f9974a.equals(((s) obj).f9974a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9974a.hashCode();
    }
}
