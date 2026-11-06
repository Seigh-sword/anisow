package N;

import android.R;
import android.view.View;
import d.RunnableC0632m;

/* JADX INFO: renamed from: N.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0112x extends P2.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f2061w;

    public C0112x(View view) {
        this.f2061w = view;
    }

    @Override // P2.e
    public void o() {
        View viewFindViewById;
        View view = this.f2061w;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC0632m(4, viewFindViewById));
    }
}
