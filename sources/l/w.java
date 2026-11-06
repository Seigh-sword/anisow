package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements InterfaceC0905E, InterfaceC0901A, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rect f9820w;

    public static int p(l lVar, Context context, int i6) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = lVar.getCount();
        int i7 = 0;
        int i8 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = lVar.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = lVar.getView(i9, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i6) {
                return i6;
            }
            if (measuredWidth > i7) {
                i7 = measuredWidth;
            }
        }
        return i7;
    }

    public static boolean x(o oVar) {
        int size = oVar.f9759f.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = oVar.getItem(i6);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC0901A
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0901A
    public final boolean l(q qVar) {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final boolean m(q qVar) {
        return false;
    }

    public abstract void o(o oVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (l) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (l) listAdapter).f9747a.q((MenuItem) listAdapter.getItem(i6), this, (this instanceof ViewOnKeyListenerC0916i) ^ true ? 0 : 4);
    }

    public abstract void q(View view);

    public abstract void r(boolean z5);

    public abstract void s(int i6);

    public abstract void t(int i6);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z5);

    public abstract void w(int i6);

    @Override // l.InterfaceC0901A
    public final void b(Context context, o oVar) {
    }
}
