package S2;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f3111b;

    public /* synthetic */ a(n nVar, int i6) {
        this.f3110a = i6;
        this.f3111b = nVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        int i6 = this.f3110a;
        n nVar = this.f3111b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                d dVar = (d) nVar;
                dVar.t(dVar.u());
                break;
            default:
                j jVar = (j) nVar;
                jVar.f3137l = z5;
                jVar.q();
                if (!z5) {
                    jVar.t(false);
                    jVar.f3138m = false;
                }
                break;
        }
    }
}
