package W2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q extends k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final q f4440A = new q(0, new Object[0]);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient Object[] f4441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient int f4442z;

    public q(int i6, Object[] objArr) {
        this.f4441y = objArr;
        this.f4442z = i6;
    }

    @Override // W2.k, W2.h
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f4441y;
        int i6 = this.f4442z;
        System.arraycopy(objArr2, 0, objArr, 0, i6);
        return i6;
    }

    @Override // W2.h
    public final Object[] c() {
        return this.f4441y;
    }

    @Override // W2.h
    public final int e() {
        return this.f4442z;
    }

    @Override // W2.h
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Y2.b.e(i6, this.f4442z);
        Object obj = this.f4441y[i6];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4442z;
    }
}
