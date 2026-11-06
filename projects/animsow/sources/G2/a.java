package G2;

import android.content.Context;
import com.xo.anilab.R;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f862f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f867e;

    public a(Context context) {
        boolean zP = C0.p(context, R.attr.elevationOverlayEnabled, false);
        int iE = C0.e(context, R.attr.elevationOverlayColor, 0);
        int iE2 = C0.e(context, R.attr.elevationOverlayAccentColor, 0);
        int iE3 = C0.e(context, R.attr.colorSurface, 0);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f863a = zP;
        this.f864b = iE;
        this.f865c = iE2;
        this.f866d = iE3;
        this.f867e = f6;
    }
}
