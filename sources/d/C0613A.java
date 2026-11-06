package d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613A implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4.l f8071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4.l f8072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4.a f8073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4.a f8074d;

    public C0613A(C4.l lVar, C4.l lVar2, C4.a aVar, C4.a aVar2) {
        this.f8071a = lVar;
        this.f8072b = lVar2;
        this.f8073c = aVar;
        this.f8074d = aVar2;
    }

    public final void onBackCancelled() {
        this.f8074d.b();
    }

    public final void onBackInvoked() {
        this.f8073c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC1305a.o(backEvent, "backEvent");
        this.f8072b.j(new C0621b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC1305a.o(backEvent, "backEvent");
        this.f8071a.j(new C0621b(backEvent));
    }
}
