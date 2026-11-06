package d;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0319t;
import androidx.lifecycle.InterfaceC0321v;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0627h implements InterfaceC0319t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0618F f8103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0638s f8104x;

    public /* synthetic */ C0627h(AbstractActivityC0638s abstractActivityC0638s, C0618F c0618f) {
        this.f8103w = c0618f;
        this.f8104x = abstractActivityC0638s;
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        C0618F c0618f = this.f8103w;
        AbstractC1305a.o(c0618f, "$dispatcher");
        AbstractActivityC0638s abstractActivityC0638s = this.f8104x;
        AbstractC1305a.o(abstractActivityC0638s, "this$0");
        if (enumC0313m == EnumC0313m.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = C0630k.f8107a.a(abstractActivityC0638s);
            AbstractC1305a.o(onBackInvokedDispatcherA, "invoker");
            c0618f.f8087e = onBackInvokedDispatcherA;
            c0618f.d(c0618f.f8089g);
        }
    }
}
