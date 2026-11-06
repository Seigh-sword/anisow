package v0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13279a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f13280b;

    public x0(T t5) {
        this.f13280b = t5;
    }

    @Override // v0.j0
    public final void a(RecyclerView recyclerView, int i6) {
        if (i6 == 0 && this.f13279a) {
            this.f13279a = false;
            this.f13280b.f();
        }
    }

    @Override // v0.j0
    public final void b(RecyclerView recyclerView, int i6, int i7) {
        if (i6 == 0 && i7 == 0) {
            return;
        }
        this.f13279a = true;
    }
}
