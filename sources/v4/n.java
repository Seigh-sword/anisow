package V4;

import f5.C0710g;
import f5.InterfaceC0711h;
import java.io.EOFException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f3885c = t.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3887b;

    public n(List list, List list2) {
        this.f3886a = W4.b.j(list);
        this.f3887b = W4.b.j(list2);
    }

    @Override // V4.E
    public final long a() {
        return d(null, true);
    }

    @Override // V4.E
    public final t b() {
        return f3885c;
    }

    @Override // V4.E
    public final void c(InterfaceC0711h interfaceC0711h) throws EOFException {
        d(interfaceC0711h, false);
    }

    public final long d(InterfaceC0711h interfaceC0711h, boolean z5) throws EOFException {
        C0710g c0710g = z5 ? new C0710g() : interfaceC0711h.j();
        List list = this.f3886a;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (i6 > 0) {
                c0710g.X(38);
            }
            c0710g.c0((String) list.get(i6));
            c0710g.X(61);
            c0710g.c0((String) this.f3887b.get(i6));
        }
        if (!z5) {
            return 0L;
        }
        long j6 = c0710g.f8461x;
        c0710g.k();
        return j6;
    }
}
