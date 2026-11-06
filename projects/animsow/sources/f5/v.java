package f5;

import java.util.RandomAccess;
import t4.AbstractC1348e;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC1348e implements RandomAccess {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j[] f8490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f8491x;

    public v(j[] jVarArr, int[] iArr) {
        this.f8490w = jVarArr;
        this.f8491x = iArr;
    }

    @Override // t4.AbstractC1344a
    public final int b() {
        return this.f8490w.length;
    }

    @Override // t4.AbstractC1344a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        return this.f8490w[i6];
    }

    @Override // t4.AbstractC1348e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // t4.AbstractC1348e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
