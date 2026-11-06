package I2;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.xo.anilab.R;
import d.C0621b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f1137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0621b f1142f;

    public a(View view) {
        this.f1138b = view;
        Context context = view.getContext();
        this.f1137a = Y2.b.A(context, R.attr.motionEasingStandardDecelerateInterpolator, P.a.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f1139c = Y2.b.z(context, R.attr.motionDurationMedium2, 300);
        this.f1140d = Y2.b.z(context, R.attr.motionDurationShort3, 150);
        this.f1141e = Y2.b.z(context, R.attr.motionDurationShort2, 100);
    }
}
