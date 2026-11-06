package m;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K0 f10127a;

    public I0(K0 k02) {
        this.f10127a = k02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i6) {
        if (i6 == 1) {
            K0 k02 = this.f10127a;
            if (k02.f10158V.getInputMethodMode() == 2 || k02.f10158V.getContentView() == null) {
                return;
            }
            Handler handler = k02.f10154R;
            D0 d02 = k02.f10150N;
            handler.removeCallbacks(d02);
            d02.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i6, int i7, int i8) {
    }
}
