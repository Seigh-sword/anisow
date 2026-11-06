package Q0;

import W1.E;
import Z.j;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.k;
import com.onesignal.AbstractC0603w1;
import com.onesignal.C0572m;
import com.onesignal.EnumC0600v1;
import com.onesignal.F;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2791y;

    public /* synthetic */ e(int i6, int i7, Object obj) {
        this.f2789w = i7;
        this.f2791y = obj;
        this.f2790x = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i6 = this.f2789w;
        int i7 = this.f2790x;
        Object obj = this.f2791y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((SystemForegroundService) obj).f5854A.cancel(i7);
                break;
            case 1:
                ((E) obj).h(i7);
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                ((k) obj).f7194A0.c0(i7);
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                int[] iArr = J2.c.f1249f0;
                ((J2.c) obj).j(i7);
                break;
            default:
                F f6 = (F) obj;
                WebView webView = f6.f7539q;
                EnumC0600v1 enumC0600v1 = EnumC0600v1.f7998z;
                if (webView != null) {
                    ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = i7;
                        f6.f7539q.setLayoutParams(layoutParams);
                        C0572m c0572m = f6.f7541s;
                        if (c0572m != null) {
                            c0572m.a(f6.c(i7, f6.f7538p, f6.f7536n));
                        }
                    } else {
                        str = "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.";
                    }
                } else {
                    str = "WebView height update skipped, new height will be used once it is displayed.";
                }
                AbstractC0603w1.b(enumC0600v1, str, null);
                break;
        }
    }
}
