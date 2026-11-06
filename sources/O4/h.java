package O4;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f2383a;

    public h(Throwable th) {
        this.f2383a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (AbstractC1305a.c(this.f2383a, ((h) obj).f2383a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f2383a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // O4.i
    public final String toString() {
        return "Closed(" + this.f2383a + ')';
    }
}
