package v0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12979a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12980b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12981c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12982d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f12984f;

    public C0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i6) {
        this.f12984f = staggeredGridLayoutManager;
        this.f12983e = i6;
    }

    public final void a() {
        View view = (View) this.f12979a.get(r0.size() - 1);
        z0 z0Var = (z0) view.getLayoutParams();
        this.f12981c = this.f12984f.f5774r.b(view);
        z0Var.getClass();
    }

    public final void b() {
        this.f12979a.clear();
        this.f12980b = Integer.MIN_VALUE;
        this.f12981c = Integer.MIN_VALUE;
        this.f12982d = 0;
    }

    public final int c() {
        return this.f12984f.f5779w ? e(r1.size() - 1, -1) : e(0, this.f12979a.size());
    }

    public final int d() {
        return this.f12984f.f5779w ? e(0, this.f12979a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i6, int i7) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f12984f;
        int iF = staggeredGridLayoutManager.f5774r.f();
        int iE = staggeredGridLayoutManager.f5774r.e();
        int i8 = i7 > i6 ? 1 : -1;
        while (i6 != i7) {
            View view = (View) this.f12979a.get(i6);
            int iD = staggeredGridLayoutManager.f5774r.d(view);
            int iB = staggeredGridLayoutManager.f5774r.b(view);
            boolean z5 = iD <= iE;
            boolean z6 = iB >= iF;
            if (z5 && z6 && (iD < iF || iB > iE)) {
                return AbstractC1397f0.H(view);
            }
            i6 += i8;
        }
        return -1;
    }

    public final int f(int i6) {
        int i7 = this.f12981c;
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (this.f12979a.size() == 0) {
            return i6;
        }
        a();
        return this.f12981c;
    }

    public final View g(int i6, int i7) {
        ArrayList arrayList = this.f12979a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f12984f;
        View view = null;
        if (i7 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f5779w && AbstractC1397f0.H(view2) >= i6) || ((!staggeredGridLayoutManager.f5779w && AbstractC1397f0.H(view2) <= i6) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                View view3 = (View) arrayList.get(i8);
                if ((staggeredGridLayoutManager.f5779w && AbstractC1397f0.H(view3) <= i6) || ((!staggeredGridLayoutManager.f5779w && AbstractC1397f0.H(view3) >= i6) || !view3.hasFocusable())) {
                    break;
                }
                i8++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i6) {
        int i7 = this.f12980b;
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (this.f12979a.size() == 0) {
            return i6;
        }
        View view = (View) this.f12979a.get(0);
        z0 z0Var = (z0) view.getLayoutParams();
        this.f12980b = this.f12984f.f5774r.d(view);
        z0Var.getClass();
        return this.f12980b;
    }
}
