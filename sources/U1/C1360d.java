package u1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import i1.C0831e;
import java.util.ArrayList;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: u1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1360d extends Drawable implements InterfaceC1363g, Animatable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12826B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12828D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Paint f12829E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Rect f12830F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1359c f12831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12833y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12834z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12825A = true;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f12827C = -1;

    public C1360d(C1359c c1359c) {
        AbstractC1332d.l(c1359c, "Argument must not be null");
        this.f12831w = c1359c;
    }

    public final void a() {
        AbstractC1332d.b("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f12834z);
        C1365i c1365i = this.f12831w.f12824a;
        if (((C0831e) c1365i.f12845a).f9398l.f9374c != 1) {
            if (this.f12832x) {
                return;
            }
            this.f12832x = true;
            if (c1365i.f12854j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            ArrayList arrayList = c1365i.f12847c;
            if (arrayList.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean zIsEmpty = arrayList.isEmpty();
            arrayList.add(this);
            if (zIsEmpty && !c1365i.f12850f) {
                c1365i.f12850f = true;
                c1365i.f12854j = false;
                c1365i.a();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f12834z) {
            return;
        }
        if (this.f12828D) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f12830F == null) {
                this.f12830F = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f12830F);
            this.f12828D = false;
        }
        C1365i c1365i = this.f12831w.f12824a;
        C1362f c1362f = c1365i.f12853i;
        Bitmap bitmap = c1362f != null ? c1362f.f12838C : c1365i.f12856l;
        if (this.f12830F == null) {
            this.f12830F = new Rect();
        }
        Rect rect = this.f12830F;
        if (this.f12829E == null) {
            this.f12829E = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f12829E);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f12831w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f12831w.f12824a.f12860p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f12831w.f12824a.f12859o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f12832x;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12828D = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (this.f12829E == null) {
            this.f12829E = new Paint(2);
        }
        this.f12829E.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f12829E == null) {
            this.f12829E = new Paint(2);
        }
        this.f12829E.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        AbstractC1332d.b("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f12834z);
        this.f12825A = z5;
        if (!z5) {
            this.f12832x = false;
            C1365i c1365i = this.f12831w.f12824a;
            ArrayList arrayList = c1365i.f12847c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c1365i.f12850f = false;
            }
        } else if (this.f12833y) {
            a();
        }
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f12833y = true;
        this.f12826B = 0;
        if (this.f12825A) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f12833y = false;
        this.f12832x = false;
        C1365i c1365i = this.f12831w.f12824a;
        ArrayList arrayList = c1365i.f12847c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c1365i.f12850f = false;
        }
    }
}
