package L2;

import T.b;
import android.R;
import android.content.res.ColorStateList;
import m.J;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends J {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[][] f1725C = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f1726A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f1727B;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1726A == null) {
            int iF = C0.f(this, com.xo.anilab.R.attr.colorControlActivated);
            int iF2 = C0.f(this, com.xo.anilab.R.attr.colorOnSurface);
            int iF3 = C0.f(this, com.xo.anilab.R.attr.colorSurface);
            this.f1726A = new ColorStateList(f1725C, new int[]{C0.l(1.0f, iF3, iF), C0.l(0.54f, iF3, iF2), C0.l(0.38f, iF3, iF2), C0.l(0.38f, iF3, iF2)});
        }
        return this.f1726A;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1727B && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.f1727B = z5;
        b.c(this, z5 ? getMaterialThemeColorsTintList() : null);
    }
}
