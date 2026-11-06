package v0;

import java.util.List;

/* JADX INFO: renamed from: v0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1394e extends AbstractC1414x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RunnableC1396f f13098b;

    public C1394e(RunnableC1396f runnableC1396f) {
        this.f13098b = runnableC1396f;
    }

    @Override // v0.AbstractC1414x
    public final boolean a(int i6, int i7) {
        RunnableC1396f runnableC1396f = this.f13098b;
        Object obj = ((List) runnableC1396f.f13107y).get(i6);
        Object obj2 = ((List) runnableC1396f.f13108z).get(i7);
        if (obj != null && obj2 != null) {
            return ((AbstractC1414x) ((C1399h) runnableC1396f.f13104B).f13131b.f13148d).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // v0.AbstractC1414x
    public final boolean c(int i6, int i7) {
        RunnableC1396f runnableC1396f = this.f13098b;
        Object obj = ((List) runnableC1396f.f13107y).get(i6);
        Object obj2 = ((List) runnableC1396f.f13108z).get(i7);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((AbstractC1414x) ((C1399h) runnableC1396f.f13104B).f13131b.f13148d).d(obj, obj2);
    }

    @Override // v0.AbstractC1414x
    public final Object f(int i6, int i7) {
        RunnableC1396f runnableC1396f = this.f13098b;
        Object obj = ((List) runnableC1396f.f13107y).get(i6);
        Object obj2 = ((List) runnableC1396f.f13108z).get(i7);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        ((AbstractC1414x) ((C1399h) runnableC1396f.f13104B).f13131b.f13148d).getClass();
        return null;
    }

    @Override // v0.AbstractC1414x
    public final int g() {
        return ((List) this.f13098b.f13108z).size();
    }

    @Override // v0.AbstractC1414x
    public final int h() {
        return ((List) this.f13098b.f13107y).size();
    }
}
