package o0;

import android.util.Log;
import i.C0803c;
import java.util.concurrent.CopyOnWriteArrayList;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1432j f11860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1167C f11861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G0 f11862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0803c f11863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f11864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1 f11865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f11866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f11867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P4.q0 f11868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P4.o0 f11869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final P4.c0 f11870k;

    public V0(InterfaceC1432j interfaceC1432j) {
        this.f11860a = interfaceC1432j;
        G0 g02 = G0.f11762e;
        AbstractC1305a.m(g02, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        this.f11862c = g02;
        C0803c c0803c = new C0803c(10);
        this.f11863d = c0803c;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f11864e = copyOnWriteArrayList;
        this.f11865f = new w1(true);
        this.f11868i = P4.d0.b(Boolean.FALSE);
        this.f11869j = (P4.o0) c0803c.f9279z;
        this.f11870k = P4.d0.a(0, 64, O4.a.f2343x);
        copyOnWriteArrayList.add(new androidx.lifecycle.V(2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(o0.V0 r5, java.util.List r6, int r7, int r8, boolean r9, o0.H r10, o0.H r11, o0.InterfaceC1167C r12, v4.InterfaceC1427e r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.V0.a(o0.V0, java.util.List, int, int, boolean, o0.H, o0.H, o0.C, v4.e):java.lang.Object");
    }

    public final Object b(int i6) {
        Object value;
        Object value2;
        P4.q0 q0Var = this.f11868i;
        do {
            value = q0Var.getValue();
            ((Boolean) value).getClass();
        } while (!q0Var.j(value, Boolean.TRUE));
        this.f11866g = true;
        this.f11867h = i6;
        Object objB = null;
        if (Log.isLoggable("Paging", 2)) {
            String str = "Accessing item index[" + i6 + ']';
            AbstractC1305a.o(str, "message");
            Log.v("Paging", str, null);
        }
        InterfaceC1167C interfaceC1167C = this.f11861b;
        if (interfaceC1167C != null) {
            interfaceC1167C.a(this.f11862c.a(i6));
        }
        G0 g02 = this.f11862c;
        if (i6 < 0) {
            g02.getClass();
        } else if (i6 < g02.e()) {
            int i7 = i6 - g02.f11765c;
            if (i7 >= 0 && i7 < g02.f11764b) {
                objB = g02.b(i7);
            }
            P4.q0 q0Var2 = this.f11868i;
            do {
                value2 = q0Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!q0Var2.j(value2, Boolean.FALSE));
            return objB;
        }
        StringBuilder sbL = H1.a.l("Index: ", i6, ", Size: ");
        sbL.append(g02.e());
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public abstract Object c(m3.v0 v0Var, InterfaceC1427e interfaceC1427e);
}
