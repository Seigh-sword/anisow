package o0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends v0.Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11801b;

    public L0(int i6, Object obj) {
        this.f11800a = i6;
        this.f11801b = obj;
    }

    public final void a() {
        int[] iArr = RecyclerView.f5686U0;
        RecyclerView recyclerView = (RecyclerView) this.f11801b;
        if (!recyclerView.f5716O || !recyclerView.f5714N) {
            recyclerView.f5729V = true;
            recyclerView.requestLayout();
        } else {
            v0.U u5 = recyclerView.f5695D;
            WeakHashMap weakHashMap = N.V.f1964a;
            recyclerView.postOnAnimation(u5);
        }
    }
}
