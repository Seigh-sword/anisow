package y2;

import android.view.View;

/* JADX INFO: renamed from: y2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1504f extends AbstractC1501c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13798b;

    public C1504f(int i6, DialogC1506h dialogC1506h) {
        this.f13797a = i6;
        this.f13798b = dialogC1506h;
    }

    @Override // y2.AbstractC1501c
    public final void c(View view, int i6) {
        int i7 = this.f13797a;
        Object obj = this.f13798b;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (i6 == 5) {
                    ((DialogC1506h) obj).cancel();
                }
                break;
            default:
                if (i6 == 5) {
                    int i8 = C1507i.f13814J0;
                    ((C1507i) obj).U(false, false);
                }
                break;
        }
    }

    @Override // y2.AbstractC1501c
    public final void b(View view) {
    }
}
