package l;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S0.f f9810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f9811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f9812c;

    public r(v vVar, ActionProvider actionProvider) {
        this.f9812c = vVar;
        this.f9811b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z5) {
        S0.f fVar = this.f9810a;
        if (fVar != null) {
            o oVar = ((q) fVar.f3073x).f9797n;
            oVar.f9761h = true;
            oVar.p(true);
        }
    }
}
