package V;

import O.i;
import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f3653a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f3654b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P2.e f3656d;

    public c(boolean z5, P2.e eVar) {
        this.f3655c = z5;
        this.f3656d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f3656d.getClass();
        Rect rect = this.f3653a;
        ((i) obj).f(rect);
        Rect rect2 = this.f3654b;
        ((i) obj2).f(rect2);
        int i6 = rect.top;
        int i7 = rect2.top;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.left;
        int i9 = rect2.left;
        boolean z5 = this.f3655c;
        if (i8 < i9) {
            return z5 ? 1 : -1;
        }
        if (i8 > i9) {
            return z5 ? -1 : 1;
        }
        int i10 = rect.bottom;
        int i11 = rect2.bottom;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.right;
        int i13 = rect2.right;
        if (i12 < i13) {
            return z5 ? 1 : -1;
        }
        if (i12 > i13) {
            return z5 ? -1 : 1;
        }
        return 0;
    }
}
