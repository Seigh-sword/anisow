package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0307g {
    final /* synthetic */ L this$0;

    public J(L l5) {
        this.this$0 = l5;
    }

    @Override // androidx.lifecycle.AbstractC0307g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1305a.o(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i6 = O.f5570x;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC1305a.m(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((O) fragmentFindFragmentByTag).f5571w = this.this$0.f5565D;
        }
    }

    @Override // androidx.lifecycle.AbstractC0307g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        L l5 = this.this$0;
        int i6 = l5.f5567x - 1;
        l5.f5567x = i6;
        if (i6 == 0) {
            Handler handler = l5.f5562A;
            AbstractC1305a.l(handler);
            handler.postDelayed(l5.f5564C, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC1305a.o(activity, "activity");
        H.a(activity, new I(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0307g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        L l5 = this.this$0;
        int i6 = l5.f5566w - 1;
        l5.f5566w = i6;
        if (i6 == 0 && l5.f5568y) {
            l5.f5563B.e(EnumC0313m.ON_STOP);
            l5.f5569z = true;
        }
    }
}
