package h5;

import d2.AbstractC0651b;
import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0651b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0651b f9001i;

    public /* synthetic */ E(AbstractC0651b abstractC0651b, int i6) {
        this.f9000h = i6;
        this.f9001i = abstractC0651b;
    }

    @Override // d2.AbstractC0651b
    public final void a(Q q5, Object obj) {
        int i6 = this.f9000h;
        AbstractC0651b abstractC0651b = this.f9001i;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        abstractC0651b.a(q5, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i7 = 0; i7 < length; i7++) {
                        abstractC0651b.a(q5, Array.get(obj, i7));
                    }
                    break;
                }
                break;
        }
    }
}
