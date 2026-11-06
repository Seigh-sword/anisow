package e1;

import V4.G;
import V4.s;
import Z4.f;
import android.content.Context;
import android.os.Build;
import c0.t;
import com.onesignal.AbstractC0603w1;
import com.onesignal.C0594t1;
import s4.AbstractC1305a;
import x1.C1486b;

/* JADX INFO: renamed from: e1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0661b implements s {
    @Override // V4.s
    public final G a(f fVar) {
        String str;
        t tVar;
        p.b bVarA = fVar.f4973e.a();
        ((C1486b) bVarA.f12207c).a("Accept", "application/json");
        ((C1486b) bVarA.f12207c).a("Content-Type", "application/json");
        ((C1486b) bVarA.f12207c).a("os-version", String.valueOf(Build.VERSION.SDK_INT));
        ((C1486b) bVarA.f12207c).a("app-id", "com.xo.anilab");
        ((C1486b) bVarA.f12207c).a("app-version", "105");
        try {
            Context context = AbstractC0603w1.f8028b;
            if (context == null) {
                AbstractC0603w1.f8053s.getClass();
                C0594t1.e("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
                tVar = null;
            } else {
                tVar = new t(AbstractC0603w1.n(context), AbstractC0603w1.l(AbstractC0603w1.f8028b), AbstractC0603w1.k(AbstractC0603w1.f8028b), AbstractC0603w1.m(AbstractC0603w1.f8028b));
            }
            AbstractC1305a.l(tVar);
            str = tVar.f6144w;
            AbstractC1305a.l(str);
        } catch (Exception unused) {
            str = "";
        }
        ((C1486b) bVarA.f12207c).a("os-id", str);
        return fVar.a(bVarA.a());
    }
}
