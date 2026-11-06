package W0;

import D4.s;
import a3.C0261b;
import android.os.Bundle;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import i.AbstractActivityC0812l;
import i.C0810j;
import i.C0811k;
import java.util.Map;
import k4.InterfaceC0900a;
import l4.InterfaceC0943a;
import m4.C1129b;
import m4.C1131d;
import m4.C1133f;
import m4.C1136i;
import o4.InterfaceC1229b;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends AbstractActivityC0812l implements InterfaceC1229b {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C1136i f4201W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public volatile C1129b f4202X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Object f4203Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f4204Z;

    public g() {
        b bVar = (b) this;
        this.f8142z.f14072b.c("androidx:appcompat", new C0810j(bVar));
        i(new C0811k(bVar, 0));
        this.f4203Y = new Object();
        this.f4204Z = false;
        i(new C0811k(bVar, 1));
    }

    @Override // o4.InterfaceC1229b
    public final Object c() {
        return m().c();
    }

    @Override // d.AbstractActivityC0638s, androidx.lifecycle.InterfaceC0309i
    public final e0 f() {
        e0 e0Var = (e0) this.f8138M.getValue();
        C0261b c0261bA = ((V0.a) ((InterfaceC0943a) S3.a.r(InterfaceC0943a.class, this))).a();
        Map map = (Map) c0261bA.f5011x;
        e0Var.getClass();
        return new l4.f(map, e0Var, (InterfaceC0900a) c0261bA.f5012y);
    }

    public final C1129b m() {
        if (this.f4202X == null) {
            synchronized (this.f4203Y) {
                try {
                    if (this.f4202X == null) {
                        this.f4202X = new C1129b(this);
                    }
                } finally {
                }
            }
        }
        return this.f4202X;
    }

    @Override // h0.E, d.AbstractActivityC0638s, D.AbstractActivityC0011l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC1229b) {
            C1133f c1133f = m().f11659z;
            C1136i c1136i = ((C1131d) new h0(c1133f.f11662w, new l4.d(c1133f, 1, c1133f.f11663x)).a(s.a(C1131d.class))).f11661c;
            this.f4201W = c1136i;
            if (c1136i.f11670a == null) {
                c1136i.f11670a = a();
            }
        }
    }

    @Override // i.AbstractActivityC0812l, h0.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1136i c1136i = this.f4201W;
        if (c1136i != null) {
            c1136i.f11670a = null;
        }
    }
}
