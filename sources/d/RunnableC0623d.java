package d;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0623d implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0638s f8096x;

    public /* synthetic */ RunnableC0623d(AbstractActivityC0638s abstractActivityC0638s, int i6) {
        this.f8095w = i6;
        this.f8096x = abstractActivityC0638s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f8095w;
        AbstractActivityC0638s abstractActivityC0638s = this.f8096x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(abstractActivityC0638s, "this$0");
                abstractActivityC0638s.invalidateOptionsMenu();
                return;
            default:
                AbstractC1305a.o(abstractActivityC0638s, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e6) {
                    if (!AbstractC1305a.c(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e7) {
                    if (!AbstractC1305a.c(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
        }
    }
}
