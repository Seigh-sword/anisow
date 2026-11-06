package h0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class U implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8676b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f8677c;

    public U(W w5, int i6) {
        this.f8677c = w5;
        this.f8675a = i6;
    }

    @Override // h0.T
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        W w5 = this.f8677c;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = w5.f8720z;
        int i6 = this.f8675a;
        if (abstractComponentCallbacksC0734B == null || i6 >= 0 || !abstractComponentCallbacksC0734B.l().R(-1, 0)) {
            return w5.S(arrayList, arrayList2, i6, this.f8676b);
        }
        return false;
    }
}
