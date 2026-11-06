package h5;

import d2.AbstractC0651b;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0651b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9026h;

    public L(boolean z5) {
        this.f9026h = z5;
    }

    @Override // d2.AbstractC0651b
    public final void a(Q q5, Object obj) {
        if (obj == null) {
            return;
        }
        q5.d(obj.toString(), null, this.f9026h);
    }
}
