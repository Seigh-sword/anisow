package v0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import o0.L0;

/* JADX INFO: loaded from: classes.dex */
public final class X extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b(int i6, int i7) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            L0 l02 = (L0) ((Y) ((Observable) this).mObservers.get(size));
            switch (l02.f11800a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) l02.f11801b;
                    recyclerView.i(null);
                    C1388b c1388b = recyclerView.f5759z;
                    c1388b.getClass();
                    if (i6 != i7) {
                        ArrayList arrayList = c1388b.f13079b;
                        arrayList.add(c1388b.h(null, 8, i6, i7));
                        c1388b.f13083f |= 8;
                        if (arrayList.size() == 1) {
                            l02.a();
                        }
                    }
                    break;
            }
        }
    }

    public final void c(int i6, int i7, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            L0 l02 = (L0) ((Y) ((Observable) this).mObservers.get(size));
            switch (l02.f11800a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) l02.f11801b;
                    recyclerView.i(null);
                    C1388b c1388b = recyclerView.f5759z;
                    if (i7 < 1) {
                        c1388b.getClass();
                    } else {
                        ArrayList arrayList = c1388b.f13079b;
                        arrayList.add(c1388b.h(obj, 4, i6, i7));
                        c1388b.f13083f = 4 | c1388b.f13083f;
                        if (arrayList.size() == 1) {
                            l02.a();
                        }
                    }
                    break;
            }
        }
    }

    public final void d(int i6, int i7) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            L0 l02 = (L0) ((Y) ((Observable) this).mObservers.get(size));
            int i8 = l02.f11800a;
            Object obj = l02.f11801b;
            switch (i8) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    X0.e eVar = (X0.e) obj;
                    X0.e.e(eVar);
                    eVar.f13071a.unregisterObserver(l02);
                    break;
                default:
                    RecyclerView recyclerView = (RecyclerView) obj;
                    recyclerView.i(null);
                    C1388b c1388b = recyclerView.f5759z;
                    if (i7 < 1) {
                        c1388b.getClass();
                    } else {
                        ArrayList arrayList = c1388b.f13079b;
                        arrayList.add(c1388b.h(null, 1, i6, i7));
                        c1388b.f13083f |= 1;
                        if (arrayList.size() == 1) {
                            l02.a();
                        }
                    }
                    break;
            }
        }
    }

    public final void e(int i6, int i7) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            L0 l02 = (L0) ((Y) ((Observable) this).mObservers.get(size));
            switch (l02.f11800a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) l02.f11801b;
                    recyclerView.i(null);
                    C1388b c1388b = recyclerView.f5759z;
                    if (i7 < 1) {
                        c1388b.getClass();
                    } else {
                        ArrayList arrayList = c1388b.f13079b;
                        arrayList.add(c1388b.h(null, 2, i6, i7));
                        c1388b.f13083f |= 2;
                        if (arrayList.size() == 1) {
                            l02.a();
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.mObservers
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L3f
            java.util.ArrayList r2 = r5.mObservers
            java.lang.Object r2 = r2.get(r0)
            v0.Y r2 = (v0.Y) r2
            o0.L0 r2 = (o0.L0) r2
            int r3 = r2.f11800a
            switch(r3) {
                case 1: goto L1a;
                default: goto L19;
            }
        L19:
            goto L3c
        L1a:
            java.lang.Object r2 = r2.f11801b
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            v0.o0 r3 = r2.f5757y
            if (r3 != 0) goto L23
            goto L3c
        L23:
            v0.W r3 = r2.f5702H
            if (r3 == 0) goto L3c
            int r4 = r3.f13073c
            int r4 = u.h.b(r4)
            if (r4 == r1) goto L33
            r3 = 2
            if (r4 == r3) goto L3c
            goto L39
        L33:
            int r3 = r3.a()
            if (r3 <= 0) goto L3c
        L39:
            r2.requestLayout()
        L3c:
            int r0 = r0 + (-1)
            goto L8
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.X.f():void");
    }
}
