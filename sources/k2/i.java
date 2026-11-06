package K2;

import F0.C0015b;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends Drawable implements Animatable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0015b f1566G = new C0015b(Float.class, "growFraction", 11);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ValueAnimator f1567A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f1568B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f1569C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f1570D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f1572F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f1573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f1574x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ValueAnimator f1576z;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Paint f1571E = new Paint();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f1575y = new a();

    public i(Context context, q qVar) {
        this.f1573w = context;
        this.f1574x = qVar;
        setAlpha(255);
    }

    public final float b() {
        e eVar = this.f1574x;
        if (eVar.f1555e == 0 && eVar.f1556f == 0) {
            return 1.0f;
        }
        return this.f1570D;
    }

    public final boolean c(boolean z5, boolean z6, boolean z7) {
        a aVar = this.f1575y;
        ContentResolver contentResolver = this.f1573w.getContentResolver();
        aVar.getClass();
        return d(z5, z6, z7 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z5, boolean z6, boolean z7) {
        ValueAnimator valueAnimator = this.f1576z;
        int i6 = 0;
        C0015b c0015b = f1566G;
        if (valueAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c0015b, 0.0f, 1.0f);
            this.f1576z = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f1576z.setInterpolator(AbstractC1301a.f12618b);
            ValueAnimator valueAnimator2 = this.f1576z;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f1576z = valueAnimator2;
            valueAnimator2.addListener(new h(this, i6));
        }
        int i7 = 1;
        if (this.f1567A == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c0015b, 1.0f, 0.0f);
            this.f1567A = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f1567A.setInterpolator(AbstractC1301a.f12618b);
            ValueAnimator valueAnimator3 = this.f1567A;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f1567A = valueAnimator3;
            valueAnimator3.addListener(new h(this, i7));
        }
        if (!isVisible() && !z5) {
            return false;
        }
        ValueAnimator valueAnimator4 = z5 ? this.f1576z : this.f1567A;
        ValueAnimator valueAnimator5 = z5 ? this.f1567A : this.f1576z;
        if (!z7) {
            if (valueAnimator5.isRunning()) {
                boolean z8 = this.f1569C;
                this.f1569C = true;
                new ValueAnimator[]{valueAnimator5}[0].cancel();
                this.f1569C = z8;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z9 = this.f1569C;
                this.f1569C = true;
                new ValueAnimator[]{valueAnimator4}[0].end();
                this.f1569C = z9;
            }
            return super.setVisible(z5, false);
        }
        if (valueAnimator4.isRunning()) {
            return false;
        }
        boolean z10 = !z5 || super.setVisible(z5, false);
        e eVar = this.f1574x;
        if (!z5 ? eVar.f1556f != 0 : eVar.f1555e != 0) {
            boolean z11 = this.f1569C;
            this.f1569C = true;
            new ValueAnimator[]{valueAnimator4}[0].end();
            this.f1569C = z11;
            return z10;
        }
        if (z6 || !valueAnimator4.isPaused()) {
            valueAnimator4.start();
        } else {
            valueAnimator4.resume();
        }
        return z10;
    }

    public final void e(c cVar) {
        ArrayList arrayList = this.f1568B;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return;
        }
        this.f1568B.remove(cVar);
        if (this.f1568B.isEmpty()) {
            this.f1568B = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1572F;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f1576z;
        return (valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.f1567A) != null && valueAnimator.isRunning());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f1572F = i6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1571E.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        return c(z5, z6, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
