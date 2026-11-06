package m2;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import l.RunnableC0914g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements T, J1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x1 f11288w;

    public /* synthetic */ z1(x1 x1Var) {
        this.f11288w = x1Var;
    }

    @Override // m2.J1
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        x1 x1Var = this.f11288w;
        if (!zIsEmpty) {
            x1Var.g().A(new RunnableC0914g(this, str, str2, bundle, 6));
            return;
        }
        C1051k0 c1051k0 = x1Var.f11248H;
        if (c1051k0 != null) {
            N n5 = c1051k0.f10983E;
            C1051k0.i(n5);
            n5.f10715B.c(str2, "AppId not known when logging event");
        }
    }

    @Override // m2.T
    public final void g(String str, int i6, Throwable th, byte[] bArr, Map map) {
        this.f11288w.I(str, i6, th, bArr, map);
    }
}
