package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.xo.anilab.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import s.AbstractC1282d;
import s.C1283e;

/* JADX INFO: loaded from: classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static R0 f10183g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f10185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f10186b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f10187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0996y f10189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f10182f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q0 f10184h = new Q0(6);

    public static synchronized R0 c() {
        try {
            if (f10183g == null) {
                f10183g = new R0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10183g;
    }

    public static synchronized PorterDuffColorFilter g(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        Q0 q02 = f10184h;
        q02.getClass();
        int i7 = (31 + i6) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) q02.b(Integer.valueOf(mode.hashCode() + i7));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i6, mode);
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j6, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C1283e c1283e = (C1283e) this.f10186b.get(context);
                if (c1283e == null) {
                    c1283e = new C1283e();
                    this.f10186b.put(context, c1283e);
                }
                c1283e.i(j6, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i6) {
        int i7;
        if (this.f10187c == null) {
            this.f10187c = new TypedValue();
        }
        TypedValue typedValue = this.f10187c;
        context.getResources().getValue(i6, typedValue, true);
        long j6 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableD = d(context, j6);
        if (drawableD != null) {
            return drawableD;
        }
        LayerDrawable layerDrawableD = null;
        if (this.f10189e != null) {
            if (i6 == R.drawable.abc_cab_background_top_material) {
                layerDrawableD = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i6 == R.drawable.abc_ratingbar_material) {
                    i7 = R.dimen.abc_star_big;
                } else if (i6 == R.drawable.abc_ratingbar_indicator_material) {
                    i7 = R.dimen.abc_star_medium;
                } else if (i6 == R.drawable.abc_ratingbar_small_material) {
                    i7 = R.dimen.abc_star_small;
                }
                layerDrawableD = C0996y.d(this, context, i7);
            }
        }
        if (layerDrawableD != null) {
            layerDrawableD.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j6, layerDrawableD);
        }
        return layerDrawableD;
    }

    public final synchronized Drawable d(Context context, long j6) {
        C1283e c1283e = (C1283e) this.f10186b.get(context);
        if (c1283e == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1283e.f(j6, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = AbstractC1282d.b(c1283e.f12508x, c1283e.f12510z, j6);
            if (iB >= 0) {
                Object[] objArr = c1283e.f12509y;
                Object obj = objArr[iB];
                Object obj2 = C1283e.f12506A;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    c1283e.f12507w = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i6) {
        return f(context, i6, false);
    }

    public final synchronized Drawable f(Context context, int i6, boolean z5) {
        Drawable drawableB;
        PorterDuff.Mode mode;
        Drawable drawableFindDrawableByLayerId;
        int iC;
        if (!this.f10188d) {
            this.f10188d = true;
            Drawable drawableE = e(context, R.drawable.abc_vector_test);
            if (drawableE == null || (!(drawableE instanceof G0.p) && !"android.graphics.drawable.VectorDrawable".equals(drawableE.getClass().getName()))) {
                this.f10188d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableB = b(context, i6);
        if (drawableB == null) {
            Object obj = E.f.f379a;
            drawableB = E.a.b(context, i6);
        }
        if (drawableB != null) {
            ColorStateList colorStateListH = h(context, i6);
            PorterDuff.Mode mode2 = null;
            if (colorStateListH != null) {
                drawableB = drawableB.mutate();
                H.a.h(drawableB, colorStateListH);
                if (this.f10189e != null && i6 == R.drawable.abc_switch_thumb_material) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                }
                if (mode2 != null) {
                    H.a.i(drawableB, mode2);
                }
            } else if (this.f10189e != null) {
                if (i6 == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawableB;
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int iC2 = X0.c(context, R.attr.colorControlNormal);
                    mode = C0998z.f10427b;
                    C0996y.g(drawableFindDrawableByLayerId2, iC2, mode);
                    C0996y.g(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), X0.c(context, R.attr.colorControlNormal), mode);
                    drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
                    iC = X0.c(context, R.attr.colorControlActivated);
                } else {
                    if (i6 == R.drawable.abc_ratingbar_material || i6 == R.drawable.abc_ratingbar_indicator_material || i6 == R.drawable.abc_ratingbar_small_material) {
                        LayerDrawable layerDrawable2 = (LayerDrawable) drawableB;
                        Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                        int iB = X0.b(context, R.attr.colorControlNormal);
                        mode = C0998z.f10427b;
                        C0996y.g(drawableFindDrawableByLayerId3, iB, mode);
                        C0996y.g(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), X0.c(context, R.attr.colorControlActivated), mode);
                        drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(android.R.id.progress);
                        iC = X0.c(context, R.attr.colorControlActivated);
                    }
                    if (!i(context, i6, drawableB)) {
                        drawableB = null;
                    }
                }
                C0996y.g(drawableFindDrawableByLayerId, iC, mode);
            } else if (!i(context, i6, drawableB) && z5) {
                drawableB = null;
            }
        }
        if (drawableB != null) {
            AbstractC0983r0.a(drawableB);
        }
        return drawableB;
    }

    public final synchronized ColorStateList h(Context context, int i6) {
        ColorStateList colorStateList;
        s.l lVar;
        WeakHashMap weakHashMap = this.f10185a;
        ColorStateList colorStateListE = null;
        colorStateList = (weakHashMap == null || (lVar = (s.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.e(i6, null);
        if (colorStateList == null) {
            C0996y c0996y = this.f10189e;
            if (c0996y != null) {
                colorStateListE = c0996y.e(context, i6);
            }
            if (colorStateListE != null) {
                if (this.f10185a == null) {
                    this.f10185a = new WeakHashMap();
                }
                s.l lVar2 = (s.l) this.f10185a.get(context);
                if (lVar2 == null) {
                    lVar2 = new s.l();
                    this.f10185a.put(context, lVar2);
                }
                lVar2.a(i6, colorStateListE);
            }
            colorStateList = colorStateListE;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            m.y r0 = r7.f10189e
            r1 = 0
            if (r0 == 0) goto L74
            android.graphics.PorterDuff$Mode r2 = m.C0998z.f10427b
            java.lang.Object r3 = r0.f10421a
            int[] r3 = (int[]) r3
            boolean r3 = m.C0996y.a(r3, r9)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L19
            r9 = 2130903291(0x7f0300fb, float:1.7413396E38)
        L16:
            r3 = r4
        L17:
            r0 = r5
            goto L55
        L19:
            java.lang.Object r3 = r0.f10423c
            int[] r3 = (int[]) r3
            boolean r3 = m.C0996y.a(r3, r9)
            if (r3 == 0) goto L27
            r9 = 2130903289(0x7f0300f9, float:1.7413392E38)
            goto L16
        L27:
            java.lang.Object r0 = r0.f10424d
            int[] r0 = (int[]) r0
            boolean r0 = m.C0996y.a(r0, r9)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L38
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L36:
            r9 = r3
            goto L16
        L38:
            r0 = 2131165261(0x7f07004d, float:1.7944734E38)
            if (r9 != r0) goto L4c
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r4
            r6 = r0
            r0 = r9
            r9 = r6
            goto L55
        L4c:
            r0 = 2131165243(0x7f07003b, float:1.7944698E38)
            if (r9 != r0) goto L52
            goto L36
        L52:
            r9 = r1
            r3 = r9
            goto L17
        L55:
            if (r3 == 0) goto L74
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = m.X0.c(r8, r9)
            java.lang.Class<m.z> r9 = m.C0998z.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r8 = g(r8, r2)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r9)
            r10.setColorFilter(r8)
            if (r0 == r5) goto L6f
            r10.setAlpha(r0)
        L6f:
            r1 = r4
            goto L74
        L71:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.R0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
