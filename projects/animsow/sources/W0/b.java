package W0;

import D.AbstractC0005f;
import D4.s;
import Z0.p;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.c0;
import d.C0618F;
import d.C0636q;
import d.C0644y;
import h0.L;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends g {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f4192b0 = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final c0 f4193a0 = new c0(s.a(p.class), new C0636q(this, 5), new C0636q(this, 4), new a(this, 0));

    public abstract void n();

    public final p o() {
        return (p) this.f4193a0.getValue();
    }

    @Override // W0.g, h0.E, d.AbstractActivityC0638s, D.AbstractActivityC0011l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new C0644y(3, this));
        } else {
            ((C0618F) this.f8139N.getValue()).a(this, new L(this));
        }
        try {
            if (E.f.a(this, "112") == 0 || i6 <= 32 || shouldShowRequestPermissionRationale("112")) {
                return;
            }
            try {
                AbstractC0005f.c(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 112);
            } catch (Exception e6) {
                C0.h().a(e6);
                e6.printStackTrace();
            }
        } catch (Exception e7) {
            C0.h().a(e7);
            e7.printStackTrace();
        }
    }
}
