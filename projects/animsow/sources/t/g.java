package T;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import j.RunnableC0835a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f3350N = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float[] f3351A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float[] f3352B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f3353C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f3354D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float[] f3355E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final float[] f3356F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final float[] f3357G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f3358H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f3359I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f3360J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f3361K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f3362L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ListView f3363M;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f3364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AccelerateInterpolator f3365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f3366y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RunnableC0835a f3367z;

    public g(ListView listView) {
        a aVar = new a();
        aVar.f3345e = Long.MIN_VALUE;
        aVar.f3347g = -1L;
        aVar.f3346f = 0L;
        this.f3364w = aVar;
        this.f3365x = new AccelerateInterpolator();
        this.f3351A = new float[]{0.0f, 0.0f};
        this.f3352B = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3355E = new float[]{0.0f, 0.0f};
        this.f3356F = new float[]{0.0f, 0.0f};
        this.f3357G = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3366y = listView;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f3357G;
        float f7 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr[0] = f7;
        fArr[1] = f7;
        float[] fArr2 = this.f3356F;
        float f8 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f8;
        fArr2[1] = f8;
        this.f3353C = 1;
        float[] fArr3 = this.f3352B;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f3351A;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f3355E;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f3354D = f3350N;
        aVar.f3341a = 500;
        aVar.f3342b = 500;
        this.f3363M = listView;
    }

    public static float b(float f6, float f7, float f8) {
        return f6 > f8 ? f8 : f6 < f7 ? f7 : f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3351A
            r0 = r0[r7]
            float[] r1 = r3.f3352B
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f3365x
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f3355E
            r0 = r0[r7]
            float[] r1 = r3.f3356F
            r1 = r1[r7]
            float[] r2 = r3.f3357G
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = b(r4, r1, r7)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r2 = -r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.a(float, float, float, int):float");
    }

    public final float c(float f6, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        int i6 = this.f3353C;
        if (i6 == 0 || i6 == 1) {
            if (f6 < f7) {
                return f6 >= 0.0f ? 1.0f - (f6 / f7) : (this.f3361K && i6 == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i6 == 2 && f6 < 0.0f) {
            return f6 / (-f7);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f3362L
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.e()
            goto L7c
        L1a:
            r7.f3360J = r2
            r7.f3358H = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f3366y
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            T.a r9 = r7.f3364w
            r9.f3343c = r0
            r9.f3344d = r8
            boolean r8 = r7.f3361K
            if (r8 != 0) goto L7c
            boolean r8 = r7.f()
            if (r8 == 0) goto L7c
            j.a r8 = r7.f3367z
            if (r8 != 0) goto L60
            j.a r8 = new j.a
            r9 = 4
            r8.<init>(r9, r7)
            r7.f3367z = r8
        L60:
            r7.f3361K = r2
            r7.f3359I = r2
            boolean r8 = r7.f3358H
            if (r8 != 0) goto L75
            int r8 = r7.f3354D
            if (r8 <= 0) goto L75
            j.a r9 = r7.f3367z
            long r5 = (long) r8
            java.util.WeakHashMap r8 = N.V.f1964a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            j.a r8 = r7.f3367z
            r8.run()
        L7a:
            r7.f3358H = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i6 = 0;
        if (this.f3359I) {
            this.f3361K = false;
            return;
        }
        a aVar = this.f3364w;
        aVar.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i7 = (int) (jCurrentAnimationTimeMillis - aVar.f3345e);
        int i8 = aVar.f3342b;
        if (i7 > i8) {
            i6 = i8;
        } else if (i7 >= 0) {
            i6 = i7;
        }
        aVar.f3349i = i6;
        aVar.f3348h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f3347g = jCurrentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        a aVar = this.f3364w;
        float f6 = aVar.f3344d;
        int iAbs = (int) (f6 / Math.abs(f6));
        Math.abs(aVar.f3343c);
        if (iAbs == 0 || (count = (listView = this.f3363M).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i6 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i6 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
