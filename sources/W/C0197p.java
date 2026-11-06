package W;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: W.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0197p extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4165x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ W f4166y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0197p(W w5, int i6) {
        super(0);
        this.f4165x = i6;
        this.f4166y = w5;
    }

    @Override // C4.a
    public final Object b() {
        switch (this.f4165x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((Y.i) this.f4166y.f4079i.getValue()).f4736d;
            default:
                Y.f fVar = (Y.f) this.f4166y.f4071a;
                String strQ = ((f5.w) fVar.f4719e.getValue()).f8493w.q();
                synchronized (Y.f.f4714g) {
                    LinkedHashSet linkedHashSet = Y.f.f4713f;
                    if (!(!linkedHashSet.contains(strQ))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strQ + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(strQ);
                }
                return new Y.i(fVar.f4715a, (f5.w) fVar.f4719e.getValue(), fVar.f4716b, (i0) fVar.f4717c.h((f5.w) fVar.f4719e.getValue(), fVar.f4715a), new Y.e(fVar, 1));
        }
    }
}
