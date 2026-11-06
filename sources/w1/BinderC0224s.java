package W1;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: W1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0224s extends o2.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f4348c;

    public BinderC0224s(C0226u c0226u) {
        this.f4348c = new WeakReference(c0226u);
    }

    @Override // o2.e
    public final void n(o2.i iVar) {
        C0226u c0226u = (C0226u) this.f4348c.get();
        if (c0226u == null) {
            return;
        }
        C0223q c0223q = new C0223q(c0226u, c0226u, iVar);
        HandlerC0227v handlerC0227v = c0226u.f4350a.f4215g;
        handlerC0227v.sendMessage(handlerC0227v.obtainMessage(1, c0223q));
    }
}
