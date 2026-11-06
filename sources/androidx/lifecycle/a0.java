package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p1.C1243i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5601w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f5603y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f5604z;

    public a0(C0323x c0323x, EnumC0313m enumC0313m) {
        AbstractC1305a.o(c0323x, "registry");
        AbstractC1305a.o(enumC0313m, "event");
        this.f5603y = c0323x;
        this.f5604z = enumC0313m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1243i c1243i;
        int i6 = this.f5601w;
        Object obj = this.f5603y;
        Object obj2 = this.f5604z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!this.f5602x) {
                    ((C0323x) obj).e((EnumC0313m) obj2);
                    this.f5602x = true;
                }
                break;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj2;
                V.e eVar = swipeDismissBehavior.f7043a;
                if (eVar != null && eVar.f()) {
                    WeakHashMap weakHashMap = N.V.f1964a;
                    ((View) obj).postOnAnimation(this);
                    break;
                } else if (this.f5602x && (c1243i = swipeDismissBehavior.f7044b) != null) {
                    c1243i.o((View) obj);
                    break;
                }
                break;
        }
    }

    public a0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z5) {
        this.f5604z = swipeDismissBehavior;
        this.f5603y = view;
        this.f5602x = z5;
    }
}
