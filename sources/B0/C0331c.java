package b0;

import android.view.Choreographer;

/* JADX INFO: renamed from: b0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0331c extends L.i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Choreographer f5870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ChoreographerFrameCallbackC0330b f5871y;

    public C0331c(L3.c cVar) {
        super(cVar);
        this.f5870x = Choreographer.getInstance();
        this.f5871y = new ChoreographerFrameCallbackC0330b(this);
    }

    public final void s() {
        this.f5870x.postFrameCallback(this.f5871y);
    }
}
