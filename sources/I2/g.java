package I2;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f1148c;

    public g(BottomSheetBehavior bottomSheetBehavior, FrameLayout frameLayout) {
        int i6 = Build.VERSION.SDK_INT;
        this.f1146a = i6 >= 34 ? new f() : i6 >= 33 ? new d() : null;
        this.f1147b = bottomSheetBehavior;
        this.f1148c = frameLayout;
    }
}
