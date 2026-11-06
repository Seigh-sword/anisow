package o0;

import v0.AbstractC1414x;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends AbstractC1414x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f11959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f11960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1414x f11961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11963f;

    public i1(h1 h1Var, h1 h1Var2, AbstractC1414x abstractC1414x, int i6, int i7) {
        this.f11959b = h1Var;
        this.f11960c = h1Var2;
        this.f11961d = abstractC1414x;
        this.f11962e = i6;
        this.f11963f = i7;
    }

    @Override // v0.AbstractC1414x
    public final boolean a(int i6, int i7) {
        Object objB = ((G0) this.f11959b).b(i6);
        Object objB2 = ((G0) this.f11960c).b(i7);
        if (objB == objB2) {
            return true;
        }
        return this.f11961d.b(objB, objB2);
    }

    @Override // v0.AbstractC1414x
    public final boolean c(int i6, int i7) {
        Object objB = ((G0) this.f11959b).b(i6);
        Object objB2 = ((G0) this.f11960c).b(i7);
        if (objB == objB2) {
            return true;
        }
        return this.f11961d.d(objB, objB2);
    }

    @Override // v0.AbstractC1414x
    public final Object f(int i6, int i7) {
        if (((G0) this.f11959b).b(i6) == ((G0) this.f11960c).b(i7)) {
            return Boolean.TRUE;
        }
        this.f11961d.getClass();
        return null;
    }

    @Override // v0.AbstractC1414x
    public final int g() {
        return this.f11963f;
    }

    @Override // v0.AbstractC1414x
    public final int h() {
        return this.f11962e;
    }
}
