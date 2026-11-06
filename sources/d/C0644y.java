package d;

import android.window.OnBackInvokedCallback;
import i.H;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0644y implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8157b;

    public /* synthetic */ C0644y(int i6, Object obj) {
        this.f8156a = i6;
        this.f8157b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f8156a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C4.a aVar = (C4.a) this.f8157b;
                AbstractC1305a.o(aVar, "$onBackInvoked");
                aVar.b();
                break;
            case 1:
                ((H) this.f8157b).C();
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((Runnable) this.f8157b).run();
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                W0.b bVar = (W0.b) this.f8157b;
                int i6 = W0.b.f4192b0;
                AbstractC1305a.o(bVar, "this$0");
                bVar.n();
                break;
            default:
                ((I2.b) this.f8157b).c();
                break;
        }
    }
}
