package i;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import s4.AbstractC1305a;
import z0.C1523d;
import z0.InterfaceC1522c;

/* JADX INFO: renamed from: i.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0810j implements InterfaceC1522c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9320a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9321b;

    public C0810j(W0.b bVar) {
        this.f9321b = bVar;
    }

    @Override // z0.InterfaceC1522c
    public final Bundle a() {
        int i6 = this.f9320a;
        Object obj = this.f9321b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0812l) obj).k().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public C0810j(C1523d c1523d) {
        AbstractC1305a.o(c1523d, "registry");
        this.f9321b = new LinkedHashSet();
        c1523d.c("androidx.savedstate.Restarter", this);
    }
}
