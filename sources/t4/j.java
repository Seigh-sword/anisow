package T4;

import R4.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class j extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3567e;

    public j(long j6, j jVar, int i6) {
        super(j6, jVar, i6);
        this.f3567e = new AtomicReferenceArray(i.f3566f);
    }

    @Override // R4.u
    public final int f() {
        return i.f3566f;
    }

    @Override // R4.u
    public final void g(int i6, InterfaceC1432j interfaceC1432j) {
        this.f3567e.set(i6, i.f3565e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3041c + ", hashCode=" + hashCode() + ']';
    }
}
