package t;

/* JADX INFO: renamed from: t.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1325h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1327j f12669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1328k f12670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12671d;

    public final void finalize() {
        C1328k c1328k;
        C1327j c1327j = this.f12669b;
        if (c1327j != null) {
            C1326i c1326i = c1327j.f12674x;
            if (!c1326i.isDone()) {
                c1326i.j(new C1319b(1, "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f12668a));
            }
        }
        if (this.f12671d || (c1328k = this.f12670c) == null) {
            return;
        }
        c1328k.i(null);
    }
}
