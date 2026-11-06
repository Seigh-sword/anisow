package i0;

import android.view.ViewGroup;
import h0.AbstractComponentCallbacksC0734B;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: i0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0824d extends AbstractC0825e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824d(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, ViewGroup viewGroup, int i6) {
        super(abstractComponentCallbacksC0734B, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0734B + " to container " + viewGroup);
        if (i6 != 1) {
            return;
        }
        AbstractC1305a.o(viewGroup, "container");
        super(abstractComponentCallbacksC0734B, "Attempting to add fragment " + abstractComponentCallbacksC0734B + " to container " + viewGroup + " which is not a FragmentContainerView");
    }
}
