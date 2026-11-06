package s4;

import java.io.Serializable;

/* JADX INFO: renamed from: s4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1312h implements Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Throwable f12634w;

    public C1312h(Throwable th) {
        AbstractC1305a.o(th, "exception");
        this.f12634w = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1312h) {
            if (AbstractC1305a.c(this.f12634w, ((C1312h) obj).f12634w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12634w.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f12634w + ')';
    }
}
