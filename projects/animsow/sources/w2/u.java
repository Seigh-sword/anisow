package W2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u extends k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final transient int f4450A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient Object[] f4451y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient int f4452z;

    public u(int i6, int i7, Object[] objArr) {
        this.f4451y = objArr;
        this.f4452z = i6;
        this.f4450A = i7;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Y2.b.e(i6, this.f4450A);
        Object obj = this.f4451y[(i6 * 2) + this.f4452z];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4450A;
    }
}
