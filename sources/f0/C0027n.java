package F0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.xo.anilab.R;
import d.RunnableC0637r;
import h0.AbstractComponentCallbacksC0734B;
import h0.l0;
import java.util.ArrayList;
import m.Z0;

/* JADX INFO: renamed from: F0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0027n extends l0 {
    @Override // h0.l0
    public final void a(View view, Object obj) {
        ((w) obj).d(view);
    }

    @Override // h0.l0
    public final void b(Object obj, ArrayList arrayList) {
        w wVar = (w) obj;
        if (wVar == null) {
            return;
        }
        int i6 = 0;
        if (wVar instanceof C) {
            C c6 = (C) wVar;
            int size = c6.f477a0.size();
            while (i6 < size) {
                b(c6.T(i6), arrayList);
                i6++;
            }
            return;
        }
        if (l0.k(wVar.f569A) && l0.k(null) && l0.k(null) && l0.k(wVar.f570B)) {
            int size2 = arrayList.size();
            while (i6 < size2) {
                wVar.d((View) arrayList.get(i6));
                i6++;
            }
        }
    }

    @Override // h0.l0
    public final void c(Object obj) {
        C0032t c0032t = (C0032t) obj;
        c0032t.g();
        c0032t.f556d.a(c0032t.f559g.f588T + 1);
    }

    @Override // h0.l0
    public final void d(RunnableC0637r runnableC0637r, Object obj) {
        C0032t c0032t = (C0032t) obj;
        c0032t.f558f = runnableC0637r;
        c0032t.g();
        c0032t.f556d.a(0.0f);
    }

    @Override // h0.l0
    public final void e(ViewGroup viewGroup, Object obj) {
        A.a(viewGroup, (w) obj);
    }

    @Override // h0.l0
    public final boolean g(Object obj) {
        return obj instanceof w;
    }

    @Override // h0.l0
    public final Object h(Object obj) {
        if (obj != null) {
            return ((w) obj).clone();
        }
        return null;
    }

    @Override // h0.l0
    public final Object i(ViewGroup viewGroup, Object obj) {
        w wVar = (w) obj;
        ArrayList arrayList = A.f474c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!wVar.x()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        w wVarClone = wVar.clone();
        C c6 = new C();
        c6.S(wVarClone);
        A.c(viewGroup, c6);
        viewGroup.setTag(R.id.transition_current_scene, null);
        z zVar = new z();
        zVar.f598w = c6;
        zVar.f599x = viewGroup;
        viewGroup.addOnAttachStateChangeListener(zVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(zVar);
        viewGroup.invalidate();
        C0032t c0032t = new C0032t(c6);
        c6.f589U = c0032t;
        c6.a(c0032t);
        return c6.f589U;
    }

    @Override // h0.l0
    public final boolean l() {
        return true;
    }

    @Override // h0.l0
    public final boolean m(Object obj) {
        boolean zX = ((w) obj).x();
        if (!zX) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zX;
    }

    @Override // h0.l0
    public final Object n(Object obj, Object obj2, Object obj3) {
        w wVar = (w) obj;
        w wVar2 = (w) obj2;
        w wVar3 = (w) obj3;
        if (wVar != null && wVar2 != null) {
            C c6 = new C();
            c6.S(wVar);
            c6.S(wVar2);
            c6.W(1);
            wVar = c6;
        } else if (wVar == null) {
            wVar = wVar2 != null ? wVar2 : null;
        }
        if (wVar3 == null) {
            return wVar;
        }
        C c7 = new C();
        if (wVar != null) {
            c7.S(wVar);
        }
        c7.S(wVar3);
        return c7;
    }

    @Override // h0.l0
    public final Object o(Object obj, Object obj2) {
        C c6 = new C();
        if (obj != null) {
            c6.S((w) obj);
        }
        c6.S((w) obj2);
        return c6;
    }

    @Override // h0.l0
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((w) obj).a(new C0024k(view, arrayList));
    }

    @Override // h0.l0
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((w) obj).a(new C0025l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // h0.l0
    public final void r(Object obj, float f6) {
        C0032t c0032t = (C0032t) obj;
        boolean z5 = c0032t.f554b;
        if (z5) {
            w wVar = c0032t.f559g;
            long j6 = wVar.f588T;
            long j7 = (long) (f6 * j6);
            if (j7 == 0) {
                j7 = 1;
            }
            if (j7 == j6) {
                j7 = j6 - 1;
            }
            if (c0032t.f556d != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j8 = c0032t.f553a;
            if (j7 == j8 || !z5) {
                return;
            }
            if (!c0032t.f555c) {
                if (j7 == 0 && j8 > 0) {
                    j7 = -1;
                } else if (j7 == j6 && j8 < j6) {
                    j7 = j6 + 1;
                }
                if (j7 != j8) {
                    wVar.J(j7, j8);
                    c0032t.f553a = j7;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            F.d dVar = c0032t.f557e;
            int i6 = (dVar.f433x + 1) % 20;
            dVar.f433x = i6;
            ((long[]) dVar.f434y)[i6] = jCurrentAnimationTimeMillis;
            ((float[]) dVar.f435z)[i6] = j7;
        }
    }

    @Override // h0.l0
    public final void s(View view, Object obj) {
        if (view != null) {
            l0.j(new Rect(), view);
            ((w) obj).L(new C0023j());
        }
    }

    @Override // h0.l0
    public final void t(Object obj, Rect rect) {
        ((w) obj).L(new C0023j());
    }

    @Override // h0.l0
    public final void u(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, Object obj, Z0 z02, Runnable runnable) {
        v(obj, z02, null, runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[Catch: all -> 0x0018, DONT_GENERATE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0010, B:10:0x0016, B:14:0x001a, B:16:0x0020), top: B:26:0x0008 }] */
    @Override // h0.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.Object r2, m.Z0 r3, d.RunnableC0632m r4, java.lang.Runnable r5) {
        /*
            r1 = this;
            F0.w r2 = (F0.w) r2
            F0.i r0 = new F0.i
            r0.<init>(r4, r2, r5)
            monitor-enter(r3)
        L8:
            boolean r4 = r3.f10236b     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L10
            r3.wait()     // Catch: java.lang.InterruptedException -> L8 java.lang.Throwable -> L18
            goto L8
        L10:
            java.lang.Object r4 = r3.f10237c     // Catch: java.lang.Throwable -> L18
            F0.i r4 = (F0.C0022i) r4     // Catch: java.lang.Throwable -> L18
            if (r4 != r0) goto L1a
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            goto L39
        L18:
            r2 = move-exception
            goto L42
        L1a:
            r3.f10237c = r0     // Catch: java.lang.Throwable -> L18
            boolean r4 = r3.f10235a     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L16
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r0.f530x
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.lang.Object r4 = r0.f532z
            F0.w r4 = (F0.w) r4
            java.lang.Object r0 = r0.f531y
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r3 != 0) goto L36
            r4.cancel()
            r0.run()
            goto L39
        L36:
            r3.run()
        L39:
            F0.m r3 = new F0.m
            r3.<init>(r5)
            r2.a(r3)
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.C0027n.v(java.lang.Object, m.Z0, d.m, java.lang.Runnable):void");
    }

    @Override // h0.l0
    public final void w(Object obj, View view, ArrayList arrayList) {
        C c6 = (C) obj;
        ArrayList arrayList2 = c6.f570B;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            l0.f((View) arrayList.get(i6), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(c6, arrayList);
    }

    @Override // h0.l0
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C c6 = (C) obj;
        if (c6 != null) {
            ArrayList arrayList3 = c6.f570B;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(c6, arrayList, arrayList2);
        }
    }

    @Override // h0.l0
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        C c6 = new C();
        c6.S((w) obj);
        return c6;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        w wVar = (w) obj;
        int i6 = 0;
        if (wVar instanceof C) {
            C c6 = (C) wVar;
            int size = c6.f477a0.size();
            while (i6 < size) {
                z(c6.T(i6), arrayList, arrayList2);
                i6++;
            }
            return;
        }
        if (l0.k(wVar.f569A) && l0.k(null) && l0.k(null)) {
            ArrayList arrayList3 = wVar.f570B;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i6 < size2) {
                    wVar.d((View) arrayList2.get(i6));
                    i6++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    wVar.G((View) arrayList.get(size3));
                }
            }
        }
    }
}
