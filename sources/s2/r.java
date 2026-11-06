package S2;

import android.view.View;
import android.widget.AdapterView;
import m.K0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f3207w;

    public r(t tVar) {
        this.f3207w = tVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        Object item;
        t tVar = this.f3207w;
        if (i6 < 0) {
            K0 k02 = tVar.f3211A;
            item = !k02.f10158V.isShowing() ? null : k02.f10161y.getSelectedItem();
        } else {
            item = tVar.getAdapter().getItem(i6);
        }
        t.a(tVar, item);
        AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
        K0 k03 = tVar.f3211A;
        if (onItemClickListener != null) {
            if (view == null || i6 < 0) {
                view = k03.f10158V.isShowing() ? k03.f10161y.getSelectedView() : null;
                i6 = !k03.f10158V.isShowing() ? -1 : k03.f10161y.getSelectedItemPosition();
                j6 = !k03.f10158V.isShowing() ? Long.MIN_VALUE : k03.f10161y.getSelectedItemId();
            }
            onItemClickListener.onItemClick(k03.f10161y, view, i6, j6);
        }
        k03.dismiss();
    }
}
