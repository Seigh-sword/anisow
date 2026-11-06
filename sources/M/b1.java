package m;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10243w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Toolbar f10244x;

    public /* synthetic */ b1(Toolbar toolbar, int i6) {
        this.f10243w = i6;
        this.f10244x = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10243w;
        Toolbar toolbar = this.f10244x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                d1 d1Var = toolbar.f5251k0;
                l.q qVar = d1Var == null ? null : d1Var.f10264x;
                if (qVar != null) {
                    qVar.collapseActionView();
                }
                break;
            default:
                toolbar.n();
                break;
        }
    }
}
