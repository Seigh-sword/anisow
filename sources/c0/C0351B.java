package c0;

import android.util.SparseArray;

/* JADX INFO: renamed from: c0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0351B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f6096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f6097b;

    public C0351B(int i6) {
        this.f6096a = new SparseArray(i6);
    }

    public final void a(E e6, int i6, int i7) {
        int iA = e6.a(i6);
        SparseArray sparseArray = this.f6096a;
        C0351B c0351b = sparseArray == null ? null : (C0351B) sparseArray.get(iA);
        if (c0351b == null) {
            c0351b = new C0351B(1);
            sparseArray.put(e6.a(i6), c0351b);
        }
        if (i7 > i6) {
            c0351b.a(e6, i6 + 1, i7);
        } else {
            c0351b.f6097b = e6;
        }
    }
}
