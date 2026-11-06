package p1;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
import s1.C1295d;
import v1.InterfaceC1417a;

/* JADX INFO: loaded from: classes.dex */
public final class E implements y, InterfaceC1417a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Resources f12229w;

    public E(Resources resources, int i6) {
        if (i6 != 1) {
            this.f12229w = resources;
        } else {
            this.f12229w = resources;
        }
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        return new m(this.f12229w, c1234c.b(Uri.class, InputStream.class));
    }

    @Override // v1.InterfaceC1417a
    public final l1.F f(l1.F f6, j1.m mVar) {
        if (f6 == null) {
            return null;
        }
        return new C1295d(this.f12229w, f6);
    }
}
