package v0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: v0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1402k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13148d;

    public C1402k(Executor executor, AbstractC1414x abstractC1414x) {
        this.f13145a = 1;
        this.f13146b = null;
        this.f13147c = executor;
        this.f13148d = abstractC1414x;
    }

    public final void a(View view, int i6, boolean z5) {
        Object obj = this.f13146b;
        int childCount = i6 < 0 ? ((V) obj).f13070a.getChildCount() : f(i6);
        ((C1401j) this.f13147c).e(childCount, z5);
        if (z5) {
            i(view);
        }
        ((V) obj).f13070a.addView(view, childCount);
        RecyclerView.I(view);
    }

    public final void b(View view, int i6, ViewGroup.LayoutParams layoutParams, boolean z5) {
        Object obj = this.f13146b;
        int childCount = i6 < 0 ? ((V) obj).f13070a.getChildCount() : f(i6);
        ((C1401j) this.f13147c).e(childCount, z5);
        if (z5) {
            i(view);
        }
        V v5 = (V) obj;
        v5.getClass();
        u0 u0VarI = RecyclerView.I(view);
        RecyclerView recyclerView = v5.f13070a;
        if (u0VarI != null) {
            if (!u0VarI.l() && !u0VarI.q()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + u0VarI + recyclerView.y());
            }
            u0VarI.f13257j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i6) {
        u0 u0VarI;
        int iF = f(i6);
        ((C1401j) this.f13147c).f(iF);
        RecyclerView recyclerView = ((V) this.f13146b).f13070a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (u0VarI = RecyclerView.I(childAt)) != null) {
            if (u0VarI.l() && !u0VarI.q()) {
                throw new IllegalArgumentException("called detach on an already detached child " + u0VarI + recyclerView.y());
            }
            u0VarI.b(256);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i6) {
        return ((V) this.f13146b).f13070a.getChildAt(f(i6));
    }

    public final int e() {
        return ((V) this.f13146b).f13070a.getChildCount() - ((List) this.f13148d).size();
    }

    public final int f(int i6) {
        if (i6 < 0) {
            return -1;
        }
        int childCount = ((V) this.f13146b).f13070a.getChildCount();
        int i7 = i6;
        while (i7 < childCount) {
            Object obj = this.f13147c;
            int iB = i6 - (i7 - ((C1401j) obj).b(i7));
            if (iB == 0) {
                while (((C1401j) obj).d(i7)) {
                    i7++;
                }
                return i7;
            }
            i7 += iB;
        }
        return -1;
    }

    public final View g(int i6) {
        return ((V) this.f13146b).f13070a.getChildAt(i6);
    }

    public final int h() {
        return ((V) this.f13146b).f13070a.getChildCount();
    }

    public final void i(View view) {
        ((List) this.f13148d).add(view);
        V v5 = (V) this.f13146b;
        v5.getClass();
        u0 u0VarI = RecyclerView.I(view);
        if (u0VarI != null) {
            int i6 = u0VarI.f13264q;
            View view2 = u0VarI.f13248a;
            if (i6 != -1) {
                u0VarI.f13263p = i6;
            } else {
                WeakHashMap weakHashMap = N.V.f1964a;
                u0VarI.f13263p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = v5.f13070a;
            if (recyclerView.L()) {
                u0VarI.f13264q = 4;
                recyclerView.f5717O0.add(u0VarI);
            } else {
                WeakHashMap weakHashMap2 = N.V.f1964a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final int j(View view) {
        int iIndexOfChild = ((V) this.f13146b).f13070a.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        Object obj = this.f13147c;
        if (((C1401j) obj).d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - ((C1401j) obj).b(iIndexOfChild);
    }

    public final boolean k(View view) {
        return ((List) this.f13148d).contains(view);
    }

    public final void l(View view) {
        if (((List) this.f13148d).remove(view)) {
            V v5 = (V) this.f13146b;
            v5.getClass();
            u0 u0VarI = RecyclerView.I(view);
            if (u0VarI != null) {
                int i6 = u0VarI.f13263p;
                RecyclerView recyclerView = v5.f13070a;
                if (recyclerView.L()) {
                    u0VarI.f13264q = i6;
                    recyclerView.f5717O0.add(u0VarI);
                } else {
                    WeakHashMap weakHashMap = N.V.f1964a;
                    u0VarI.f13248a.setImportantForAccessibility(i6);
                }
                u0VarI.f13263p = 0;
            }
        }
    }

    public final String toString() {
        switch (this.f13145a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C1401j) this.f13147c).toString() + ", hidden list:" + ((List) this.f13148d).size();
            default:
                return super.toString();
        }
    }

    public C1402k(V v5) {
        this.f13145a = 0;
        this.f13146b = v5;
        this.f13147c = new C1401j(0);
        this.f13148d = new ArrayList();
    }
}
