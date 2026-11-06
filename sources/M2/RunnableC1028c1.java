package m2;

import M4.AbstractC0077w;
import M4.InterfaceC0062g;
import android.content.ComponentName;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import b2.C0337b;
import i.C0803c;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q2.InterfaceC1260c;
import q2.InterfaceC1261d;
import q2.InterfaceC1262e;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import u1.C1358b;
import v4.C1433k;
import v4.InterfaceC1427e;
import w0.C1452g;

/* JADX INFO: renamed from: m2.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1028c1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f10862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f10863y;

    public /* synthetic */ RunnableC1028c1(Object obj, int i6, Object obj2) {
        this.f10861w = i6;
        this.f10862x = obj2;
        this.f10863y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        q2.n nVar;
        q2.s sVar;
        q2.n nVar2;
        q2.s sVar2;
        q2.p pVar;
        C1358b c1358b;
        Throwable e6;
        int i6 = 0;
        switch (this.f10861w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object obj = this.f10863y;
                Y0 y02 = (Y0) obj;
                G g4 = y02.f10831z;
                if (g4 == null) {
                    y02.f().f10715B.d("Failed to send current screen to service");
                    return;
                }
                try {
                    Object obj2 = this.f10862x;
                    if (((V0) obj2) == null) {
                        g4.v(0L, null, null, ((Y0) obj).a().getPackageName());
                    } else {
                        g4.v(((V0) obj2).f10786c, ((V0) obj2).f10784a, ((V0) obj2).f10785b, ((Y0) obj).a().getPackageName());
                    }
                    ((Y0) obj).M();
                    return;
                } catch (RemoteException e7) {
                    y02.f().f10715B.c(e7, "Failed to send current screen to the service");
                    return;
                }
            case 1:
                Y0 y03 = ((ServiceConnectionC1040g1) this.f10863y).f10916y;
                ComponentName componentName = (ComponentName) this.f10862x;
                y03.r();
                if (y03.f10831z != null) {
                    y03.f10831z = null;
                    y03.f().f10723J.c(componentName, "Disconnected from device MeasurementService");
                    y03.r();
                    y03.G();
                    return;
                }
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((x1) this.f10862x).b0();
                x1 x1Var = (x1) this.f10862x;
                Runnable runnable = (Runnable) this.f10863y;
                x1Var.g().r();
                if (x1Var.f11252L == null) {
                    x1Var.f11252L = new ArrayList();
                }
                x1Var.f11252L.add(runnable);
                ((x1) this.f10862x).d0();
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                x1 x1Var2 = (x1) this.f10863y;
                x1Var2.g().r();
                x1Var2.f11247G = new C1021a0(x1Var2);
                C1044i c1044i = new C1044i(x1Var2);
                c1044i.w();
                x1Var2.f11272y = c1044i;
                C1032e c1032eQ = x1Var2.Q();
                C1033e0 c1033e0 = x1Var2.f11270w;
                AbstractC1332d.m(c1033e0);
                c1032eQ.f10887z = c1033e0;
                C1049j1 c1049j1 = new C1049j1(x1Var2);
                c1049j1.w();
                x1Var2.f11245E = c1049j1;
                L1 l12 = new L1(x1Var2);
                l12.w();
                x1Var2.f11242B = l12;
                T0 t02 = new T0(x1Var2);
                t02.w();
                x1Var2.f11244D = t02;
                s1 s1Var = new s1(x1Var2);
                s1Var.w();
                x1Var2.f11241A = s1Var;
                x1Var2.f11273z = new V(x1Var2);
                if (x1Var2.f11254N != x1Var2.f11255O) {
                    N nF = x1Var2.f();
                    nF.f10715B.b(Integer.valueOf(x1Var2.f11254N), Integer.valueOf(x1Var2.f11255O), "Not all upload components initialized");
                }
                x1Var2.f11249I = true;
                x1Var2.g().r();
                C1044i c1044i2 = x1Var2.f11272y;
                x1.x(c1044i2);
                c1044i2.E0();
                C1044i c1044i3 = x1Var2.f11272y;
                x1.x(c1044i3);
                c1044i3.r();
                c1044i3.v();
                if (c1044i3.e0()) {
                    E e8 = AbstractC1078w.f11193h0;
                    if (((Long) e8.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseZ = c1044i3.z();
                        ((C0337b) c1044i3.h()).getClass();
                        int iDelete = sQLiteDatabaseZ.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(e8.a(null))});
                        if (iDelete > 0) {
                            N nF2 = c1044i3.f();
                            nF2.f10723J.c(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (x1Var2.f11245E.f10967D.a() == 0) {
                    Z z5 = x1Var2.f11245E.f10967D;
                    ((C0337b) x1Var2.h()).getClass();
                    z5.b(System.currentTimeMillis());
                }
                x1Var2.F();
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                if (((q2.s) ((q2.i) this.f10862x)).f12377d) {
                    ((q2.n) this.f10863y).f12367z.m();
                    return;
                }
                try {
                    ((q2.n) this.f10863y).f12367z.l(((q2.n) this.f10863y).f12366y.b((q2.i) this.f10862x));
                    return;
                } catch (q2.g e9) {
                    e = e9;
                    if (e.getCause() instanceof Exception) {
                        sVar = ((q2.n) this.f10863y).f12367z;
                        e = (Exception) e.getCause();
                        sVar.k(e);
                        return;
                    } else {
                        nVar = (q2.n) this.f10863y;
                        sVar = nVar.f12367z;
                        sVar.k(e);
                        return;
                    }
                } catch (Exception e10) {
                    e = e10;
                    nVar = (q2.n) this.f10863y;
                    sVar = nVar.f12367z;
                    sVar.k(e);
                    return;
                }
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                Object obj3 = this.f10863y;
                try {
                    q2.i iVar = (q2.i) ((q2.n) obj3).f12366y.b((q2.i) this.f10862x);
                    q2.n nVar3 = (q2.n) obj3;
                    if (iVar == null) {
                        nVar3.g(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    i.r rVar = q2.k.f12353b;
                    iVar.b(rVar, nVar3);
                    iVar.a(rVar, nVar3);
                    q2.s sVar3 = (q2.s) iVar;
                    sVar3.f12375b.k(new q2.p(rVar, (InterfaceC1260c) nVar3));
                    sVar3.p();
                    return;
                } catch (q2.g e11) {
                    e = e11;
                    nVar2 = (q2.n) obj3;
                    if (e.getCause() instanceof Exception) {
                        sVar2 = nVar2.f12367z;
                        e = (Exception) e.getCause();
                    } else {
                        sVar2 = nVar2.f12367z;
                    }
                    sVar2.k(e);
                    return;
                } catch (Exception e12) {
                    e = e12;
                    nVar2 = (q2.n) obj3;
                    sVar2 = nVar2.f12367z;
                    sVar2.k(e);
                    return;
                }
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                synchronized (((q2.p) this.f10863y).f12371y) {
                    try {
                        Object obj4 = ((q2.p) this.f10863y).f12372z;
                        if (((InterfaceC1261d) obj4) != null) {
                            ((InterfaceC1261d) obj4).c((q2.i) this.f10862x);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                synchronized (((q2.p) this.f10863y).f12371y) {
                    try {
                        Object obj5 = ((q2.p) this.f10863y).f12372z;
                        if (((InterfaceC1262e) obj5) != null) {
                            Exception excC = ((q2.i) this.f10862x).c();
                            AbstractC1332d.m(excC);
                            ((InterfaceC1262e) obj5).g(excC);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                synchronized (((q2.p) this.f10863y).f12371y) {
                    try {
                        Object obj6 = ((q2.p) this.f10863y).f12372z;
                        if (((q2.f) obj6) != null) {
                            ((q2.f) obj6).c(((q2.i) this.f10862x).d());
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 9:
                Object obj7 = this.f10863y;
                try {
                    q2.s sVarL = ((q2.h) ((q2.p) obj7).f12371y).l(((q2.i) this.f10862x).d());
                    q2.p pVar2 = (q2.p) obj7;
                    i.r rVar2 = q2.k.f12353b;
                    sVarL.b(rVar2, pVar2);
                    sVarL.a(rVar2, pVar2);
                    sVarL.f12375b.k(new q2.p(rVar2, (InterfaceC1260c) pVar2));
                    sVarL.p();
                    return;
                } catch (CancellationException unused) {
                    ((q2.p) obj7).b();
                    return;
                } catch (q2.g e13) {
                    e = e13;
                    if (e.getCause() instanceof Exception) {
                        pVar = (q2.p) obj7;
                        e = (Exception) e.getCause();
                    } else {
                        pVar = (q2.p) obj7;
                    }
                    pVar.g(e);
                    return;
                } catch (Exception e14) {
                    e = e14;
                    pVar = (q2.p) obj7;
                    pVar.g(e);
                    return;
                }
            case 10:
                try {
                    ((q2.s) this.f10862x).l(((Callable) this.f10863y).call());
                    return;
                } catch (Exception e15) {
                    ((q2.s) this.f10862x).k(e15);
                    return;
                } catch (Throwable th) {
                    ((q2.s) this.f10862x).k(new RuntimeException(th));
                    return;
                }
            case 11:
                Object obj8 = this.f10863y;
                try {
                    Y2.b.m((Future) this.f10862x);
                    C1358b c1358b2 = (C1358b) obj8;
                    ((G0) c1358b2.f12823y).r();
                    if (!((G0) c1358b2.f12823y).n().D(null, AbstractC1078w.f11145M0)) {
                        G0 g02 = (G0) c1358b2.f12823y;
                        g02.f10616E = false;
                        g02.U();
                        N nF3 = ((G0) c1358b2.f12823y).f();
                        nF3.f10722I.c(((r1) c1358b2.f12822x).f11073w, "registerTriggerAsync ran. uri");
                        return;
                    }
                    c1358b2.o();
                    G0 g03 = (G0) c1358b2.f12823y;
                    g03.f10616E = false;
                    g03.f10617F = 1;
                    N nF4 = g03.f();
                    nF4.f10722I.c(((r1) c1358b2.f12822x).f11073w, "Successfully registered trigger URI");
                    ((G0) c1358b2.f12823y).U();
                    return;
                } catch (Error e16) {
                    e6 = e16;
                    c1358b = (C1358b) obj8;
                    c1358b.i(e6);
                    return;
                } catch (RuntimeException e17) {
                    e6 = e17;
                    c1358b = (C1358b) obj8;
                    c1358b.i(e6);
                    return;
                } catch (ExecutionException e18) {
                    c1358b = (C1358b) obj8;
                    e6 = e18.getCause();
                    c1358b.i(e6);
                    return;
                }
            case 12:
                ((InterfaceC0062g) this.f10863y).d((AbstractC0077w) this.f10862x);
                return;
            case 13:
                ((InterfaceC0062g) this.f10862x).d((N4.c) this.f10863y);
                return;
            case 14:
                break;
            default:
                AbstractC1305a.H((InterfaceC1427e) this.f10862x).o(S3.a.m((Throwable) this.f10863y));
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f10862x).run();
            } catch (Throwable th2) {
                S3.a.x(C1433k.f13309w, th2);
            }
            R4.i iVar2 = (R4.i) this.f10863y;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = R4.i.f3019D;
            Runnable runnableM = iVar2.M();
            if (runnableM == null) {
                return;
            }
            this.f10862x = runnableM;
            i6++;
            if (i6 >= 16 && iVar2.f3023y.L()) {
                iVar2.f3023y.J(iVar2, this);
                return;
            }
        }
    }

    public final String toString() {
        switch (this.f10861w) {
            case 11:
                C1452g c1452g = new C1452g(RunnableC1028c1.class.getSimpleName(), 0);
                C1358b c1358b = (C1358b) this.f10863y;
                C0803c c0803c = new C0803c();
                ((C0803c) c1452g.f13503f).f9279z = c0803c;
                c1452g.f13503f = c0803c;
                c0803c.f9278y = c1358b;
                return c1452g.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC1028c1(Object obj, Object obj2, int i6) {
        this.f10861w = i6;
        this.f10862x = obj;
        this.f10863y = obj2;
    }

    public RunnableC1028c1(x1 x1Var, Runnable runnable) {
        this.f10861w = 2;
        this.f10862x = x1Var;
        this.f10863y = runnable;
    }
}
