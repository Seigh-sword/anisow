package m;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ K0 f10115w;

    public E0(K0 k02) {
        this.f10115w = k02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i6, long j6) {
        C0995x0 c0995x0;
        if (i6 == -1 || (c0995x0 = this.f10115w.f10161y) == null) {
            return;
        }
        c0995x0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
