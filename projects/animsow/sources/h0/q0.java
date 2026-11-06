package h0;

import android.view.ViewGroup;
import d.C0621b;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8882b;

    public boolean a() {
        return this instanceof C0744i;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(C0621b c0621b, ViewGroup viewGroup) {
        AbstractC1305a.o(c0621b, "backEvent");
        AbstractC1305a.o(viewGroup, "container");
    }

    public void e(ViewGroup viewGroup) {
    }
}
