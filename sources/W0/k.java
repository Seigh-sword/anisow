package W0;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import c1.C0367h;
import com.android.app.activities.PostActivity;
import com.xo.anilab.R;
import j1.EnumC0843a;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements y1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4210b;

    public /* synthetic */ k(int i6, Object obj) {
        this.f4209a = i6;
        this.f4210b = obj;
    }

    public final void a(Drawable drawable, Object obj, EnumC0843a enumC0843a) {
        int i6 = this.f4209a;
        Object obj2 = this.f4210b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(obj, "model");
                AbstractC1305a.o(enumC0843a, "dataSource");
                PostActivity postActivity = (PostActivity) obj2;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(postActivity, R.anim.zoom_out);
                Y0.a aVar = postActivity.f6282c0;
                if (aVar != null) {
                    aVar.f4754e.startAnimation(animationLoadAnimation);
                    return;
                } else {
                    AbstractC1305a.W("binding");
                    throw null;
                }
            default:
                AbstractC1305a.o(obj, "model");
                AbstractC1305a.o(enumC0843a, "dataSource");
                C0367h c0367h = (C0367h) obj2;
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c0367h.O(), R.anim.zoom_out);
                Y0.c cVar = c0367h.f6193A0;
                if (cVar != null) {
                    cVar.f4785f.startAnimation(animationLoadAnimation2);
                    return;
                } else {
                    AbstractC1305a.W("binding");
                    throw null;
                }
        }
    }
}
