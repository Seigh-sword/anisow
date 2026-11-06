package G0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f739l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f728a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
