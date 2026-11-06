package d;

import android.window.BackEvent;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0621b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8094d;

    public C0621b(BackEvent backEvent) {
        AbstractC1305a.o(backEvent, "backEvent");
        C0620a c0620a = C0620a.f8090a;
        float fD = c0620a.d(backEvent);
        float fE = c0620a.e(backEvent);
        float fB = c0620a.b(backEvent);
        int iC = c0620a.c(backEvent);
        this.f8091a = fD;
        this.f8092b = fE;
        this.f8093c = fB;
        this.f8094d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f8091a + ", touchY=" + this.f8092b + ", progress=" + this.f8093c + ", swipeEdge=" + this.f8094d + '}';
    }
}
