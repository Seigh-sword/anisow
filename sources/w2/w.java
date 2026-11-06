package W2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w extends o {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Object[] f4457E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final w f4458F;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final transient int f4459A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final transient Object[] f4460B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final transient int f4461C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final transient int f4462D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient Object[] f4463z;

    static {
        Object[] objArr = new Object[0];
        f4458F = new w(0, 0, 0, objArr, objArr);
    }

    public w(int i6, int i7, int i8, Object[] objArr, Object[] objArr2) {
        this.f4463z = objArr;
        this.f4459A = i6;
        this.f4460B = objArr2;
        this.f4461C = i7;
        this.f4462D = i8;
    }

    @Override // W2.h
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f4463z;
        int i6 = this.f4462D;
        System.arraycopy(objArr2, 0, objArr, 0, i6);
        return i6;
    }

    @Override // W2.h
    public final Object[] c() {
        return this.f4463z;
    }

    @Override // W2.h, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f4460B;
            if (objArr.length != 0) {
                int iE = Y2.b.E(obj);
                while (true) {
                    int i6 = iE & this.f4461C;
                    Object obj2 = objArr[i6];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iE = i6 + 1;
                }
            }
        }
        return false;
    }

    @Override // W2.h
    public final int e() {
        return this.f4462D;
    }

    @Override // W2.h
    public final int f() {
        return 0;
    }

    @Override // W2.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4459A;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k kVarJ = this.f4437x;
        if (kVarJ == null) {
            kVarJ = j();
            this.f4437x = kVarJ;
        }
        return kVarJ.listIterator(0);
    }

    public final k j() {
        return k.g(this.f4462D, this.f4463z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4462D;
    }
}
