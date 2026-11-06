package androidx.lifecycle;

import android.app.Activity;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0307g {
    final /* synthetic */ L this$0;

    public I(L l5) {
        this.this$0 = l5;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        L l5 = this.this$0;
        int i6 = l5.f5566w + 1;
        l5.f5566w = i6;
        if (i6 == 1 && l5.f5569z) {
            l5.f5563B.e(EnumC0313m.ON_START);
            l5.f5569z = false;
        }
    }
}
