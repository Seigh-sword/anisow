package m;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC0881d;
import l.InterfaceC0901A;
import l.SubMenuC0907G;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements InterfaceC0901A {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l.o f10263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l.q f10264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Toolbar f10265y;

    public d1(Toolbar toolbar) {
        this.f10265y = toolbar;
    }

    @Override // l.InterfaceC0901A
    public final void b(Context context, l.o oVar) {
        l.q qVar;
        l.o oVar2 = this.f10263w;
        if (oVar2 != null && (qVar = this.f10264x) != null) {
            oVar2.d(qVar);
        }
        this.f10263w = oVar;
    }

    @Override // l.InterfaceC0901A
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0901A
    public final boolean e() {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final Parcelable g() {
        return null;
    }

    @Override // l.InterfaceC0901A
    public final boolean i(SubMenuC0907G subMenuC0907G) {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final boolean l(l.q qVar) {
        Toolbar toolbar = this.f10265y;
        toolbar.c();
        ViewParent parent = toolbar.f5221D.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f5221D);
            }
            toolbar.addView(toolbar.f5221D);
        }
        View actionView = qVar.getActionView();
        toolbar.f5222E = actionView;
        this.f10264x = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f5222E);
            }
            e1 e1VarH = Toolbar.h();
            e1VarH.f9272a = (toolbar.f5227J & 112) | 8388611;
            e1VarH.f10268b = 2;
            toolbar.f5222E.setLayoutParams(e1VarH);
            toolbar.addView(toolbar.f5222E);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((e1) childAt.getLayoutParams()).f10268b != 2 && childAt != toolbar.f5257w) {
                toolbar.removeViewAt(childCount);
                toolbar.f5244d0.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.f9783C = true;
        qVar.f9797n.p(false);
        KeyEvent.Callback callback = toolbar.f5222E;
        if (callback instanceof InterfaceC0881d) {
            ((l.s) ((InterfaceC0881d) callback)).f9813w.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // l.InterfaceC0901A
    public final boolean m(l.q qVar) {
        Toolbar toolbar = this.f10265y;
        KeyEvent.Callback callback = toolbar.f5222E;
        if (callback instanceof InterfaceC0881d) {
            ((l.s) ((InterfaceC0881d) callback)).f9813w.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f5222E);
        toolbar.removeView(toolbar.f5221D);
        toolbar.f5222E = null;
        ArrayList arrayList = toolbar.f5244d0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f10264x = null;
        toolbar.requestLayout();
        qVar.f9783C = false;
        qVar.f9797n.p(false);
        toolbar.u();
        return true;
    }

    @Override // l.InterfaceC0901A
    public final void n(boolean z5) {
        if (this.f10264x != null) {
            l.o oVar = this.f10263w;
            if (oVar != null) {
                int size = oVar.f9759f.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (this.f10263w.getItem(i6) == this.f10264x) {
                        return;
                    }
                }
            }
            m(this.f10264x);
        }
    }

    @Override // l.InterfaceC0901A
    public final void h(Parcelable parcelable) {
    }

    @Override // l.InterfaceC0901A
    public final void c(l.o oVar, boolean z5) {
    }
}
