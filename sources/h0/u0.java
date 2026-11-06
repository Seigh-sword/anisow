package h0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.xo.anilab.R;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f8901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8906f;

    public u0(ViewGroup viewGroup) {
        AbstractC1305a.o(viewGroup, "container");
        this.f8901a = viewGroup;
        this.f8902b = new ArrayList();
        this.f8903c = new ArrayList();
    }

    public static final u0 m(ViewGroup viewGroup, W w5) {
        AbstractC1305a.o(viewGroup, "container");
        AbstractC1305a.o(w5, "fragmentManager");
        AbstractC1305a.n(w5.I(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof u0) {
            return (u0) tag;
        }
        C0752q c0752q = new C0752q(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0752q);
        return c0752q;
    }

    public static boolean n(ArrayList arrayList) {
        boolean z5;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z5 = true;
            while (it.hasNext()) {
                s0 s0Var = (s0) it.next();
                if (!s0Var.f8896k.isEmpty()) {
                    ArrayList arrayList2 = s0Var.f8896k;
                    if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((q0) it2.next()).a()) {
                                break;
                            }
                        }
                    }
                }
                z5 = false;
            }
            break loop0;
        }
        if (z5) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                t4.m.X(((s0) it3.next()).f8896k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(s0 s0Var) {
        AbstractC1305a.o(s0Var, "operation");
        if (s0Var.f8894i) {
            AbstractC0628i.a(s0Var.f8886a, s0Var.f8888c.P(), this.f8901a);
            s0Var.f8894i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z5);

    public final void c(ArrayList arrayList) {
        AbstractC1305a.o(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t4.m.X(((s0) it.next()).f8896k, arrayList2);
        }
        List listK0 = t4.n.k0(t4.n.m0(arrayList2));
        int size = listK0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((q0) listK0.get(i6)).c(this.f8901a);
        }
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            a((s0) arrayList.get(i7));
        }
        List listK02 = t4.n.k0(arrayList);
        int size3 = listK02.size();
        for (int i8 = 0; i8 < size3; i8++) {
            s0 s0Var = (s0) listK02.get(i8);
            if (s0Var.f8896k.isEmpty()) {
                s0Var.b();
            }
        }
    }

    public final void d(int i6, int i7, c0 c0Var) {
        synchronized (this.f8902b) {
            try {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
                AbstractC1305a.n(abstractComponentCallbacksC0734B, "fragmentStateManager.fragment");
                s0 s0VarJ = j(abstractComponentCallbacksC0734B);
                if (s0VarJ == null) {
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = c0Var.f8787c;
                    s0VarJ = abstractComponentCallbacksC0734B2.f8598I ? k(abstractComponentCallbacksC0734B2) : null;
                }
                if (s0VarJ != null) {
                    s0VarJ.d(i6, i7);
                    return;
                }
                final r0 r0Var = new r0(i6, i7, c0Var);
                this.f8902b.add(r0Var);
                final int i8 = 0;
                r0Var.f8889d.add(new Runnable(this) { // from class: h0.p0

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public final /* synthetic */ u0 f8879x;

                    {
                        this.f8879x = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i9 = i8;
                        r0 r0Var2 = r0Var;
                        u0 u0Var = this.f8879x;
                        switch (i9) {
                            case com.bumptech.glide.d.f6312l /* 0 */:
                                AbstractC1305a.o(u0Var, "this$0");
                                AbstractC1305a.o(r0Var2, "$operation");
                                if (u0Var.f8902b.contains(r0Var2)) {
                                    int i10 = r0Var2.f8886a;
                                    View view = r0Var2.f8888c.f8618c0;
                                    AbstractC1305a.n(view, "operation.fragment.mView");
                                    AbstractC0628i.a(i10, view, u0Var.f8901a);
                                }
                                break;
                            default:
                                AbstractC1305a.o(u0Var, "this$0");
                                AbstractC1305a.o(r0Var2, "$operation");
                                u0Var.f8902b.remove(r0Var2);
                                u0Var.f8903c.remove(r0Var2);
                                break;
                        }
                    }
                });
                final int i9 = 1;
                r0Var.f8889d.add(new Runnable(this) { // from class: h0.p0

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public final /* synthetic */ u0 f8879x;

                    {
                        this.f8879x = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i92 = i9;
                        r0 r0Var2 = r0Var;
                        u0 u0Var = this.f8879x;
                        switch (i92) {
                            case com.bumptech.glide.d.f6312l /* 0 */:
                                AbstractC1305a.o(u0Var, "this$0");
                                AbstractC1305a.o(r0Var2, "$operation");
                                if (u0Var.f8902b.contains(r0Var2)) {
                                    int i10 = r0Var2.f8886a;
                                    View view = r0Var2.f8888c.f8618c0;
                                    AbstractC1305a.n(view, "operation.fragment.mView");
                                    AbstractC0628i.a(i10, view, u0Var.f8901a);
                                }
                                break;
                            default:
                                AbstractC1305a.o(u0Var, "this$0");
                                AbstractC1305a.o(r0Var2, "$operation");
                                u0Var.f8902b.remove(r0Var2);
                                u0Var.f8903c.remove(r0Var2);
                                break;
                        }
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i6, c0 c0Var) {
        AbstractC0628i.o(i6, "finalState");
        AbstractC1305a.o(c0Var, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0Var.f8787c);
        }
        d(i6, 2, c0Var);
    }

    public final void f(c0 c0Var) {
        AbstractC1305a.o(c0Var, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c0Var.f8787c);
        }
        d(3, 1, c0Var);
    }

    public final void g(c0 c0Var) {
        AbstractC1305a.o(c0Var, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c0Var.f8787c);
        }
        d(1, 3, c0Var);
    }

    public final void h(c0 c0Var) {
        AbstractC1305a.o(c0Var, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c0Var.f8787c);
        }
        d(2, 1, c0Var);
    }

    public final void i() {
        boolean z5;
        if (this.f8906f) {
            return;
        }
        if (!this.f8901a.isAttachedToWindow()) {
            l();
            this.f8905e = false;
            return;
        }
        synchronized (this.f8902b) {
            try {
                ArrayList<s0> arrayListL0 = t4.n.l0(this.f8903c);
                this.f8903c.clear();
                Iterator it = arrayListL0.iterator();
                while (true) {
                    z5 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    s0 s0Var = (s0) it.next();
                    if (!(!this.f8902b.isEmpty()) || !s0Var.f8888c.f8598I) {
                        z5 = false;
                    }
                    s0Var.f8892g = z5;
                }
                for (s0 s0Var2 : arrayListL0) {
                    if (this.f8904d) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + s0Var2);
                        }
                        s0Var2.b();
                    } else {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + s0Var2);
                        }
                        s0Var2.a(this.f8901a);
                    }
                    this.f8904d = false;
                    if (!s0Var2.f8891f) {
                        this.f8903c.add(s0Var2);
                    }
                }
                if (!this.f8902b.isEmpty()) {
                    q();
                    ArrayList arrayListL02 = t4.n.l0(this.f8902b);
                    if (arrayListL02.isEmpty()) {
                        return;
                    }
                    this.f8902b.clear();
                    this.f8903c.addAll(arrayListL02);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListL02, this.f8905e);
                    boolean zN = n(arrayListL02);
                    Iterator it2 = arrayListL02.iterator();
                    boolean z6 = true;
                    while (it2.hasNext()) {
                        if (!((s0) it2.next()).f8888c.f8598I) {
                            z6 = false;
                        }
                    }
                    if (!z6 || zN) {
                        z5 = false;
                    }
                    this.f8904d = z5;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zN + " \ntransition = " + z6);
                    }
                    if (!z6) {
                        p(arrayListL02);
                        c(arrayListL02);
                    } else if (zN) {
                        p(arrayListL02);
                        int size = arrayListL02.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            a((s0) arrayListL02.get(i6));
                        }
                    }
                    this.f8905e = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s0 j(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        Object next;
        Iterator it = this.f8902b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            s0 s0Var = (s0) next;
            if (AbstractC1305a.c(s0Var.f8888c, abstractComponentCallbacksC0734B) && !s0Var.f8890e) {
                break;
            }
        }
        return (s0) next;
    }

    public final s0 k(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        Object next;
        Iterator it = this.f8903c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            s0 s0Var = (s0) next;
            if (AbstractC1305a.c(s0Var.f8888c, abstractComponentCallbacksC0734B) && !s0Var.f8890e) {
                break;
            }
        }
        return (s0) next;
    }

    public final void l() {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f8901a.isAttachedToWindow();
        synchronized (this.f8902b) {
            try {
                q();
                p(this.f8902b);
                ArrayList<s0> arrayListL0 = t4.n.l0(this.f8903c);
                Iterator it = arrayListL0.iterator();
                while (it.hasNext()) {
                    ((s0) it.next()).f8892g = false;
                }
                for (s0 s0Var : arrayListL0) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f8901a + " is not attached to window. ") + "Cancelling running operation " + s0Var);
                    }
                    s0Var.a(this.f8901a);
                }
                ArrayList<s0> arrayListL02 = t4.n.l0(this.f8902b);
                Iterator it2 = arrayListL02.iterator();
                while (it2.hasNext()) {
                    ((s0) it2.next()).f8892g = false;
                }
                for (s0 s0Var2 : arrayListL02) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f8901a + " is not attached to window. ") + "Cancelling pending operation " + s0Var2);
                    }
                    s0Var2.a(this.f8901a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        Object objPrevious;
        synchronized (this.f8902b) {
            try {
                q();
                ArrayList arrayList = this.f8902b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    s0 s0Var = (s0) objPrevious;
                    View view = s0Var.f8888c.f8618c0;
                    AbstractC1305a.n(view, "operation.fragment.mView");
                    int iA = Y2.b.a(view);
                    if (s0Var.f8886a == 2 && iA != 2) {
                        break;
                    }
                }
                this.f8906f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            r0 r0Var = (r0) ((s0) arrayList.get(i6));
            if (!r0Var.f8893h) {
                r0Var.f8893h = true;
                int i7 = r0Var.f8887b;
                c0 c0Var = r0Var.f8884l;
                if (i7 == 2) {
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
                    AbstractC1305a.n(abstractComponentCallbacksC0734B, "fragmentStateManager.fragment");
                    View viewFindFocus = abstractComponentCallbacksC0734B.f8618c0.findFocus();
                    if (viewFindFocus != null) {
                        abstractComponentCallbacksC0734B.j().f8938m = viewFindFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0734B);
                        }
                    }
                    View viewP = r0Var.f8888c.P();
                    if (viewP.getParent() == null) {
                        c0Var.b();
                        viewP.setAlpha(0.0f);
                    }
                    if (viewP.getAlpha() == 0.0f && viewP.getVisibility() == 0) {
                        viewP.setVisibility(4);
                    }
                    C0760z c0760z = abstractComponentCallbacksC0734B.f8621f0;
                    viewP.setAlpha(c0760z == null ? 1.0f : c0760z.f8937l);
                } else if (i7 == 3) {
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = c0Var.f8787c;
                    AbstractC1305a.n(abstractComponentCallbacksC0734B2, "fragmentStateManager.fragment");
                    View viewP2 = abstractComponentCallbacksC0734B2.P();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewP2.findFocus() + " on view " + viewP2 + " for Fragment " + abstractComponentCallbacksC0734B2);
                    }
                    viewP2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t4.m.X(((s0) it.next()).f8896k, arrayList2);
        }
        List listK0 = t4.n.k0(t4.n.m0(arrayList2));
        int size2 = listK0.size();
        for (int i8 = 0; i8 < size2; i8++) {
            q0 q0Var = (q0) listK0.get(i8);
            q0Var.getClass();
            ViewGroup viewGroup = this.f8901a;
            AbstractC1305a.o(viewGroup, "container");
            if (!q0Var.f8881a) {
                q0Var.e(viewGroup);
            }
            q0Var.f8881a = true;
        }
    }

    public final void q() {
        for (s0 s0Var : this.f8902b) {
            int i6 = 2;
            if (s0Var.f8887b == 2) {
                int visibility = s0Var.f8888c.P().getVisibility();
                if (visibility != 0) {
                    i6 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC0628i.f("Unknown visibility ", visibility));
                        }
                        i6 = 3;
                    }
                }
                s0Var.d(i6, 1);
            }
        }
    }
}
