package v0;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f13156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13157b;

    public final k0 a(int i6) {
        SparseArray sparseArray = this.f13156a;
        k0 k0Var = (k0) sparseArray.get(i6);
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0();
        sparseArray.put(i6, k0Var2);
        return k0Var2;
    }
}
