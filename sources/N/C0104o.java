package N;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: N.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0104o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f2026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f2027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f2028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f2030e;

    public C0104o(View view) {
        this.f2028c = view;
    }

    public final boolean a(float f6, float f7, boolean z5) {
        ViewParent viewParentF;
        if (!this.f2029d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return AbstractC0084b0.a(viewParentF, this.f2028c, f6, f7, z5);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedFling", e6);
            return false;
        }
    }

    public final boolean b(float f6, float f7) {
        ViewParent viewParentF;
        if (!this.f2029d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return AbstractC0084b0.b(viewParentF, this.f2028c, f6, f7);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedPreFling", e6);
            return false;
        }
    }

    public final boolean c(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        ViewParent viewParentF;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f2029d || (viewParentF = f(i8)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f2028c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i9 = iArr2[0];
            i10 = iArr2[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr == null) {
            if (this.f2030e == null) {
                this.f2030e = new int[2];
            }
            iArr3 = this.f2030e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z5 = viewParentF instanceof InterfaceC0105p;
        View view2 = this.f2028c;
        if (z5) {
            ((InterfaceC0105p) viewParentF).c(view2, i6, i7, iArr3, i8);
        } else if (i8 == 0) {
            try {
                AbstractC0084b0.c(viewParentF, view2, i6, i7, iArr3);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedPreScroll", e6);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i9;
            iArr2[1] = iArr2[1] - i10;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i6, int i7, int i8, int[] iArr) {
        e(0, i6, 0, i7, null, i8, iArr);
    }

    public final boolean e(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        ViewParent viewParentF;
        int i11;
        int i12;
        int[] iArr3;
        if (!this.f2029d || (viewParentF = f(i10)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f2028c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i11 = iArr[0];
            i12 = iArr[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr2 == null) {
            if (this.f2030e == null) {
                this.f2030e = new int[2];
            }
            int[] iArr4 = this.f2030e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z5 = viewParentF instanceof InterfaceC0106q;
        View view2 = this.f2028c;
        if (z5) {
            ((InterfaceC0106q) viewParentF).d(view2, i6, i7, i8, i9, i10, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i8;
            iArr3[1] = iArr3[1] + i9;
            if (viewParentF instanceof InterfaceC0105p) {
                ((InterfaceC0105p) viewParentF).e(view2, i6, i7, i8, i9, i10);
            } else if (i10 == 0) {
                try {
                    AbstractC0084b0.d(viewParentF, view2, i6, i7, i8, i9);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedScroll", e6);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        }
        return true;
    }

    public final ViewParent f(int i6) {
        if (i6 == 0) {
            return this.f2026a;
        }
        if (i6 != 1) {
            return null;
        }
        return this.f2027b;
    }

    public final boolean g(int i6) {
        return f(i6) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.g(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.f2029d
            if (r0 == 0) goto L7c
            android.view.View r0 = r8.f2028c
            android.view.ViewParent r2 = r0.getParent()
            r3 = r0
        L13:
            if (r2 == 0) goto L7c
            boolean r4 = r2 instanceof N.InterfaceC0105p
            java.lang.String r5 = "ViewParentCompat"
            java.lang.String r6 = "ViewParent "
            if (r4 == 0) goto L25
            r7 = r2
            N.p r7 = (N.InterfaceC0105p) r7
            boolean r7 = r7.f(r3, r0, r9, r10)
            goto L2b
        L25:
            if (r10 != 0) goto L70
            boolean r7 = N.AbstractC0084b0.f(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L5b
        L2b:
            if (r7 == 0) goto L70
            if (r10 == 0) goto L35
            if (r10 == r1) goto L32
            goto L37
        L32:
            r8.f2027b = r2
            goto L37
        L35:
            r8.f2026a = r2
        L37:
            if (r4 == 0) goto L3f
            N.p r2 = (N.InterfaceC0105p) r2
            r2.a(r3, r0, r9, r10)
            goto L5a
        L3f:
            if (r10 != 0) goto L5a
            N.AbstractC0084b0.e(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L45
            goto L5a
        L45:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r5, r10, r9)
        L5a:
            return r1
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r2)
            java.lang.String r6 = " does not implement interface method onStartNestedScroll"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r5, r6, r4)
        L70:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L77
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L77:
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L7c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0104o.h(int, int):boolean");
    }

    public final void i(int i6) {
        ViewParent viewParentF = f(i6);
        if (viewParentF != null) {
            boolean z5 = viewParentF instanceof InterfaceC0105p;
            View view = this.f2028c;
            if (z5) {
                ((InterfaceC0105p) viewParentF).b(view, i6);
            } else if (i6 == 0) {
                try {
                    AbstractC0084b0.g(viewParentF, view);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onStopNestedScroll", e6);
                }
            }
            if (i6 == 0) {
                this.f2026a = null;
            } else {
                if (i6 != 1) {
                    return;
                }
                this.f2027b = null;
            }
        }
    }
}
