package P4;

import M4.C0063h;
import Q4.AbstractC0168b;
import Q4.AbstractC0169c;
import j3.C0848A;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends AbstractC0168b implements W, InterfaceC0146g, Q4.s {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2741B = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2742A;
    private volatile /* synthetic */ Object _state$volatile;

    public q0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // P4.V
    public final void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // Q4.s
    public final InterfaceC0146g b(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        return (((i6 < 0 || i6 >= 2) && i6 != -2) || aVar != O4.a.f2343x) ? d0.d(this, interfaceC1432j, i6, aVar) : this;
    }

    @Override // P4.V
    public final boolean c(Object obj) {
        l(obj);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0093, B:36:0x0096, B:46:0x00b7, B:49:0x00c7, B:50:0x00e1, B:56:0x00f3, B:53:0x00ea, B:55:0x00f0, B:38:0x009c, B:42:0x00a3, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0093, B:36:0x0096, B:46:0x00b7, B:49:0x00c7, B:50:0x00e1, B:56:0x00f3, B:53:0x00ea, B:55:0x00f0, B:38:0x009c, B:42:0x00a3, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0093, B:36:0x0096, B:46:0x00b7, B:49:0x00c7, B:50:0x00e1, B:56:0x00f3, B:53:0x00ea, B:55:0x00f0, B:38:0x009c, B:42:0x00a3, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c6 -> B:28:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // P4.InterfaceC0146g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(P4.InterfaceC0147h r17, v4.InterfaceC1427e r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.q0.d(P4.h, v4.e):java.lang.Object");
    }

    @Override // Q4.AbstractC0168b
    public final Q4.d f() {
        return new r0();
    }

    @Override // Q4.AbstractC0168b
    public final Q4.d[] g() {
        return new r0[2];
    }

    @Override // P4.o0
    public final Object getValue() {
        C0848A c0848a = AbstractC0169c.f2835b;
        Object obj = f2741B.get(this);
        if (obj == c0848a) {
            return null;
        }
        return obj;
    }

    public final boolean j(Object obj, Object obj2) {
        C0848A c0848a = AbstractC0169c.f2835b;
        if (obj == null) {
            obj = c0848a;
        }
        if (obj2 == null) {
            obj2 = c0848a;
        }
        return m(obj, obj2);
    }

    @Override // P4.InterfaceC0147h
    public final Object k(Object obj, InterfaceC1427e interfaceC1427e) {
        l(obj);
        return C1316l.f12640a;
    }

    public final void l(Object obj) {
        if (obj == null) {
            obj = AbstractC0169c.f2835b;
        }
        m(null, obj);
    }

    public final boolean m(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i6;
        Q4.d[] dVarArr;
        C0848A c0848a;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2741B;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC1305a.c(obj3, obj)) {
                return false;
            }
            if (AbstractC1305a.c(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i7 = this.f2742A;
            if ((i7 & 1) != 0) {
                this.f2742A = i7 + 2;
                return true;
            }
            int i8 = i7 + 1;
            this.f2742A = i8;
            Q4.d[] dVarArr2 = this.f2830w;
            while (true) {
                r0[] r0VarArr = (r0[]) dVarArr2;
                if (r0VarArr != null) {
                    for (r0 r0Var : r0VarArr) {
                        if (r0Var != null) {
                            AtomicReference atomicReference = r0Var.f2749a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c0848a = d0.f2675c)) {
                                    C0848A c0848a2 = d0.f2674b;
                                    if (obj4 != c0848a2) {
                                        while (!atomicReference.compareAndSet(obj4, c0848a2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0063h) obj4).o(C1316l.f12640a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c0848a)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i6 = this.f2742A;
                    if (i6 == i8) {
                        this.f2742A = i8 + 1;
                        return true;
                    }
                    dVarArr = this.f2830w;
                }
                dVarArr2 = dVarArr;
                i8 = i6;
            }
        }
    }
}
