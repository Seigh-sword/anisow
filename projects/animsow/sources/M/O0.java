package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends C0995x0 {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f10170I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f10171J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public L0 f10172K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public l.q f10173L;

    public O0(Context context, boolean z5) {
        super(context, z5);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f10170I = 21;
            this.f10171J = 22;
        } else {
            this.f10170I = 22;
            this.f10171J = 21;
        }
    }

    @Override // m.C0995x0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.l lVar;
        int headersCount;
        int iPointToPosition;
        int i6;
        if (this.f10172K != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                lVar = (l.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (l.l) adapter;
                headersCount = 0;
            }
            l.q qVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i6 = iPointToPosition - headersCount) < 0 || i6 >= lVar.getCount()) ? null : lVar.getItem(i6);
            l.q qVar = this.f10173L;
            if (qVar != qVarB) {
                l.o oVar = lVar.f9747a;
                if (qVar != null) {
                    this.f10172K.h(oVar, qVar);
                }
                this.f10173L = qVarB;
                if (qVarB != null) {
                    this.f10172K.e(oVar, qVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i6 == this.f10170I) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i6 != this.f10171J) {
            return super.onKeyDown(i6, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        ((l.l) adapter).f9747a.c(false);
        return true;
    }

    public void setHoverListener(L0 l02) {
        this.f10172K = l02;
    }

    @Override // m.C0995x0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
