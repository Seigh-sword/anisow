package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class O extends Fragment {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f5570x = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public K f5571w;

    public final void a(EnumC0313m enumC0313m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC1305a.n(activity, "activity");
            B3.e.n(activity, enumC0313m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0313m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0313m.ON_DESTROY);
        this.f5571w = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0313m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        K k5 = this.f5571w;
        if (k5 != null) {
            k5.f5560a.a();
        }
        a(EnumC0313m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        K k5 = this.f5571w;
        if (k5 != null) {
            L l5 = k5.f5560a;
            int i6 = l5.f5566w + 1;
            l5.f5566w = i6;
            if (i6 == 1 && l5.f5569z) {
                l5.f5563B.e(EnumC0313m.ON_START);
                l5.f5569z = false;
            }
        }
        a(EnumC0313m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0313m.ON_STOP);
    }
}
