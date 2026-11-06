package Z0;

import androidx.lifecycle.b0;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f4953b;

    public p(e eVar) {
        AbstractC1305a.o(eVar, "repository");
        this.f4953b = eVar;
    }

    public final List e() {
        return (List) S3.a.J(new i(this, null));
    }

    public final boolean f(int i6) {
        return ((Boolean) S3.a.J(new j(this, i6, null))).booleanValue();
    }
}
