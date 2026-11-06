package m4;

import D4.s;
import androidx.lifecycle.h0;
import d.AbstractActivityC0638s;
import i4.InterfaceC0834a;
import o4.InterfaceC1229b;

/* JADX INFO: renamed from: m4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1133f implements InterfaceC1229b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractActivityC0638s f11662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AbstractActivityC0638s f11663x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile InterfaceC0834a f11664y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f11665z = new Object();

    public C1133f(AbstractActivityC0638s abstractActivityC0638s) {
        this.f11662w = abstractActivityC0638s;
        this.f11663x = abstractActivityC0638s;
    }

    @Override // o4.InterfaceC1229b
    public final Object c() {
        if (this.f11664y == null) {
            synchronized (this.f11665z) {
                try {
                    if (this.f11664y == null) {
                        this.f11664y = ((C1131d) new h0(this.f11662w, new l4.d(this, 1, this.f11663x)).a(s.a(C1131d.class))).f11660b;
                    }
                } finally {
                }
            }
        }
        return this.f11664y;
    }
}
