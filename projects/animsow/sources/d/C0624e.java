package d;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0319t;
import androidx.lifecycle.InterfaceC0321v;
import s4.AbstractC1305a;
import z0.C1523d;

/* JADX INFO: renamed from: d.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0624e implements InterfaceC0319t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8098x;

    public /* synthetic */ C0624e(int i6, Object obj) {
        this.f8097w = i6;
        this.f8098x = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        Window window;
        View viewPeekDecorView;
        boolean z5;
        switch (this.f8097w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractActivityC0638s abstractActivityC0638s = (AbstractActivityC0638s) this.f8098x;
                AbstractC1305a.o(abstractActivityC0638s, "this$0");
                if (enumC0313m == EnumC0313m.ON_STOP && (window = abstractActivityC0638s.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0638s abstractActivityC0638s2 = (AbstractActivityC0638s) this.f8098x;
                AbstractC1305a.o(abstractActivityC0638s2, "this$0");
                if (enumC0313m == EnumC0313m.ON_DESTROY) {
                    abstractActivityC0638s2.f8140x.f3596x = null;
                    if (!abstractActivityC0638s2.isChangingConfigurations()) {
                        abstractActivityC0638s2.e().a();
                    }
                    ViewTreeObserverOnDrawListenerC0633n viewTreeObserverOnDrawListenerC0633n = abstractActivityC0638s2.f8127B;
                    AbstractActivityC0638s abstractActivityC0638s3 = viewTreeObserverOnDrawListenerC0633n.f8114z;
                    abstractActivityC0638s3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0633n);
                    abstractActivityC0638s3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0633n);
                }
                break;
            default:
                C1523d c1523d = (C1523d) this.f8098x;
                AbstractC1305a.o(c1523d, "this$0");
                if (enumC0313m != EnumC0313m.ON_START) {
                    z5 = enumC0313m != EnumC0313m.ON_STOP;
                }
                c1523d.f14070f = z5;
                break;
        }
    }
}
