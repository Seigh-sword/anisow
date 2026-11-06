package F0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.xo.anilab.R;
import java.util.HashMap;

/* JADX INFO: renamed from: F0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0021h extends w {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String[] f527b0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f528a0;

    public C0021h(int i6) {
        this.f528a0 = i6;
    }

    public static void S(F f6) {
        int visibility = f6.f484b.getVisibility();
        HashMap map = f6.f483a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = f6.f484b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float U(F f6, float f7) {
        Float f8;
        return (f6 == null || (f8 = (Float) f6.f483a.get("android:fade:transitionAlpha")) == null) ? f7 : f8.floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r9 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r0.f507e == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.f505c == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F0.T V(F0.F r8, F0.F r9) {
        /*
            F0.T r0 = new F0.T
            r0.<init>()
            r1 = 0
            r0.f503a = r1
            r0.f504b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f483a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f505c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f507e = r6
            goto L33
        L2f:
            r0.f505c = r3
            r0.f507e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f483a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f506d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L4f:
            r0.f508f = r2
            goto L55
        L52:
            r0.f506d = r3
            goto L4f
        L55:
            r2 = 1
            if (r8 == 0) goto L7f
            if (r9 == 0) goto L7f
            int r8 = r0.f505c
            int r9 = r0.f506d
            if (r8 != r9) goto L67
            android.view.ViewGroup r3 = r0.f507e
            android.view.ViewGroup r4 = r0.f508f
            if (r3 != r4) goto L67
            goto L8d
        L67:
            if (r8 == r9) goto L75
            if (r8 != 0) goto L70
        L6b:
            r0.f504b = r1
        L6d:
            r0.f503a = r2
            goto L8d
        L70:
            if (r9 != 0) goto L8d
        L72:
            r0.f504b = r2
            goto L6d
        L75:
            android.view.ViewGroup r8 = r0.f508f
            if (r8 != 0) goto L7a
            goto L6b
        L7a:
            android.view.ViewGroup r8 = r0.f507e
            if (r8 != 0) goto L8d
            goto L72
        L7f:
            if (r8 != 0) goto L86
            int r8 = r0.f506d
            if (r8 != 0) goto L86
            goto L72
        L86:
            if (r9 != 0) goto L8d
            int r8 = r0.f505c
            if (r8 != 0) goto L8d
            goto L6b
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.C0021h.V(F0.F, F0.F):F0.T");
    }

    public final ObjectAnimator T(View view, float f6, float f7) {
        if (f6 == f7) {
            return null;
        }
        H.f486a.x(view, f6);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, H.f487b, f7);
        C0020g c0020g = new C0020g(view);
        objectAnimatorOfFloat.addListener(c0020g);
        s().a(c0020g);
        return objectAnimatorOfFloat;
    }

    @Override // F0.w
    public final void f(F f6) {
        S(f6);
    }

    @Override // F0.w
    public final void k(F f6) {
        S(f6);
        View view = f6.f484b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = Float.valueOf(view.getVisibility() == 0 ? H.f486a.p(view) : 0.0f);
        }
        f6.f483a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f7  */
    @Override // F0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator o(android.view.ViewGroup r21, F0.F r22, F0.F r23) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.C0021h.o(android.view.ViewGroup, F0.F, F0.F):android.animation.Animator");
    }

    @Override // F0.w
    public final /* bridge */ /* synthetic */ String[] u() {
        return f527b0;
    }

    @Override // F0.w
    public final boolean x() {
        return true;
    }

    @Override // F0.w
    public final boolean y(F f6, F f7) {
        if (f6 == null && f7 == null) {
            return false;
        }
        if (f6 != null && f7 != null && f7.f483a.containsKey("android:visibility:visibility") != f6.f483a.containsKey("android:visibility:visibility")) {
            return false;
        }
        T tV = V(f6, f7);
        if (tV.f503a) {
            return tV.f505c == 0 || tV.f506d == 0;
        }
        return false;
    }
}
