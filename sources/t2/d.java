package t2;

import N.V;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12740d;

    public d(View view) {
        this.f12737a = view;
    }

    public final void a() {
        int i6 = this.f12740d;
        View view = this.f12737a;
        int top = i6 - (view.getTop() - this.f12738b);
        WeakHashMap weakHashMap = V.f1964a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f12739c));
    }
}
