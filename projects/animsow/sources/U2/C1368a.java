package u2;

import H2.i;
import H2.j;
import H2.m;
import M2.d;
import P2.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xo.anilab.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* JADX INFO: renamed from: u2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1368a extends Drawable implements i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final c f12866A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f12867B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f12868C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f12869D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f12870E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f12871F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f12872G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public WeakReference f12873H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public WeakReference f12874I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WeakReference f12875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f12876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f12877y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f12878z;

    public C1368a(Context context, b bVar) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f12875w = weakReference;
        m.c(context, m.f1056b, "Theme.MaterialComponents");
        this.f12878z = new Rect();
        j jVar = new j(this);
        this.f12877y = jVar;
        TextPaint textPaint = jVar.f1048a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, bVar);
        this.f12866A = cVar;
        boolean zE = e();
        b bVar2 = cVar.f12910b;
        g gVar = new g(P2.j.a(context, zE ? bVar2.f12881C.intValue() : bVar2.f12879A.intValue(), e() ? bVar2.f12882D.intValue() : bVar2.f12880B.intValue(), new P2.a(0)).a());
        this.f12876x = gVar;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && jVar.f1054g != (dVar = new d(context2, bVar2.f12908z.intValue()))) {
            jVar.b(dVar, context2);
            textPaint.setColor(bVar2.f12907y.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i6 = bVar2.f12886H;
        if (i6 != -2) {
            this.f12869D = ((int) Math.pow(10.0d, ((double) i6) - 1.0d)) - 1;
        } else {
            this.f12869D = bVar2.f12887I;
        }
        jVar.f1052e = true;
        i();
        invalidateSelf();
        jVar.f1052e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(bVar2.f12906x.intValue());
        if (gVar.f2457w.f2419c != colorStateListValueOf) {
            gVar.n(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f12907y.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f12873H;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f12873H.get();
            WeakReference weakReference3 = this.f12874I;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(bVar2.f12894P.booleanValue(), false);
    }

    @Override // H2.i
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        c cVar = this.f12866A;
        b bVar = cVar.f12910b;
        String str = bVar.f12884F;
        boolean z5 = str != null;
        WeakReference weakReference = this.f12875w;
        if (z5) {
            int i6 = bVar.f12886H;
            if (i6 == -2 || str == null || str.length() <= i6) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i6 - 1), "…");
        }
        if (!f()) {
            return null;
        }
        int i7 = this.f12869D;
        b bVar2 = cVar.f12910b;
        if (i7 == -2 || d() <= this.f12869D) {
            return NumberFormat.getInstance(bVar2.f12888J).format(d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(bVar2.f12888J, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f12869D), "+");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.f12874I;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i6 = this.f12866A.f12910b.f12885G;
        if (i6 != -1) {
            return i6;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f12876x.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        j jVar = this.f12877y;
        jVar.f1048a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.f12868C - rect.exactCenterY();
        canvas.drawText(strB, this.f12867B, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), jVar.f1048a);
    }

    public final boolean e() {
        return this.f12866A.f12910b.f12884F != null || f();
    }

    public final boolean f() {
        b bVar = this.f12866A.f12910b;
        return bVar.f12884F == null && bVar.f12885G != -1;
    }

    public final void g() {
        Context context = (Context) this.f12875w.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        c cVar = this.f12866A;
        this.f12876x.setShapeAppearanceModel(P2.j.a(context, zE ? cVar.f12910b.f12881C.intValue() : cVar.f12910b.f12879A.intValue(), e() ? cVar.f12910b.f12882D.intValue() : cVar.f12910b.f12880B.intValue(), new P2.a(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f12866A.f12910b.f12883E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f12878z.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f12878z.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f12873H = new WeakReference(view);
        this.f12874I = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C1368a.i():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, H2.i
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        c cVar = this.f12866A;
        cVar.f12909a.f12883E = i6;
        cVar.f12910b.f12883E = i6;
        this.f12877y.f1048a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
