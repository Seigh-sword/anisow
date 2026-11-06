package m;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K0 f10123a;

    public H0(K0 k02) {
        this.f10123a = k02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        K0 k02 = this.f10123a;
        if (k02.f10158V.isShowing()) {
            k02.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f10123a.dismiss();
    }
}
