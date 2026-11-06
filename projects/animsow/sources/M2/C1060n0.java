package m2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: m2.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1060n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1051k0 f11037a;

    public /* synthetic */ C1060n0(C1051k0 c1051k0) {
        this.f11037a = c1051k0;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        C1051k0 c1051k0 = this.f11037a;
        C1042h0 c1042h0 = c1051k0.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        if (c1051k0.j()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Y y5 = c1051k0.f10982D;
        C1051k0.e(y5);
        y5.f10820T.e(string);
        C1051k0.e(y5);
        c1051k0.f10988J.getClass();
        y5.f10821U.b(System.currentTimeMillis());
    }

    public final boolean b() {
        Y y5 = this.f11037a.f10982D;
        C1051k0.e(y5);
        return y5.f10821U.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        C1051k0 c1051k0 = this.f11037a;
        c1051k0.f10988J.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Y y5 = c1051k0.f10982D;
        C1051k0.e(y5);
        return jCurrentTimeMillis - y5.f10821U.a() > c1051k0.f10981C.y(null, AbstractC1078w.f11162V);
    }
}
