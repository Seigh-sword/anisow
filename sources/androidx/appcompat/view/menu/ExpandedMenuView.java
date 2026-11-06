package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import i.C0803c;
import l.InterfaceC0903C;
import l.n;
import l.o;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements n, InterfaceC0903C, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f5110x = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f5111w;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0803c c0803cJ = C0803c.J(context, attributeSet, f5110x, R.attr.listViewStyle, 0);
        if (c0803cJ.G(0)) {
            setBackgroundDrawable(c0803cJ.v(0));
        }
        if (c0803cJ.G(1)) {
            setDivider(c0803cJ.v(1));
        }
        c0803cJ.M();
    }

    @Override // l.InterfaceC0903C
    public final void a(o oVar) {
        this.f5111w = oVar;
    }

    @Override // l.n
    public final boolean c(q qVar) {
        return this.f5111w.q(qVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        c((q) getAdapter().getItem(i6));
    }
}
