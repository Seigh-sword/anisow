package g;

import O.i;
import O.j;
import O.k;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: g.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0712a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8507a;

    public C0712a() {
        this.f8507a = Build.VERSION.SDK_INT >= 26 ? new k(this) : new j(this);
    }

    public i a(int i6) {
        return null;
    }

    public i b(int i6) {
        return null;
    }

    public boolean c(int i6, int i7, Bundle bundle) {
        return false;
    }
}
