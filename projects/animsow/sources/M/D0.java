package m;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ K0 f10109x;

    public /* synthetic */ D0(K0 k02, int i6) {
        this.f10108w = i6;
        this.f10109x = k02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10108w;
        K0 k02 = this.f10109x;
        switch (i6) {
            case 1:
                C0995x0 c0995x0 = k02.f10161y;
                if (c0995x0 != null) {
                    c0995x0.setListSelectionHidden(true);
                    c0995x0.requestLayout();
                }
                break;
            default:
                C0995x0 c0995x02 = k02.f10161y;
                if (c0995x02 != null && c0995x02.isAttachedToWindow() && k02.f10161y.getCount() > k02.f10161y.getChildCount() && k02.f10161y.getChildCount() <= k02.f10145I) {
                    k02.f10158V.setInputMethodMode(2);
                    k02.f();
                    break;
                }
                break;
        }
    }
}
