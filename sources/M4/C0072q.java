package M4;

import java.util.concurrent.CancellationException;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: M4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0072q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0061f f1911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4.l f1912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f1914e;

    public C0072q(Object obj, InterfaceC0061f interfaceC0061f, C4.l lVar, Object obj2, Throwable th) {
        this.f1910a = obj;
        this.f1911b = interfaceC0061f;
        this.f1912c = lVar;
        this.f1913d = obj2;
        this.f1914e = th;
    }

    public static C0072q a(C0072q c0072q, InterfaceC0061f interfaceC0061f, CancellationException cancellationException, int i6) {
        Object obj = c0072q.f1910a;
        if ((i6 & 2) != 0) {
            interfaceC0061f = c0072q.f1911b;
        }
        InterfaceC0061f interfaceC0061f2 = interfaceC0061f;
        C4.l lVar = c0072q.f1912c;
        Object obj2 = c0072q.f1913d;
        Throwable th = cancellationException;
        if ((i6 & 16) != 0) {
            th = c0072q.f1914e;
        }
        c0072q.getClass();
        return new C0072q(obj, interfaceC0061f2, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0072q)) {
            return false;
        }
        C0072q c0072q = (C0072q) obj;
        return AbstractC1305a.c(this.f1910a, c0072q.f1910a) && AbstractC1305a.c(this.f1911b, c0072q.f1911b) && AbstractC1305a.c(this.f1912c, c0072q.f1912c) && AbstractC1305a.c(this.f1913d, c0072q.f1913d) && AbstractC1305a.c(this.f1914e, c0072q.f1914e);
    }

    public final int hashCode() {
        Object obj = this.f1910a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0061f interfaceC0061f = this.f1911b;
        int iHashCode2 = (iHashCode + (interfaceC0061f == null ? 0 : interfaceC0061f.hashCode())) * 31;
        C4.l lVar = this.f1912c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f1913d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1914e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1910a + ", cancelHandler=" + this.f1911b + ", onCancellation=" + this.f1912c + ", idempotentResume=" + this.f1913d + ", cancelCause=" + this.f1914e + ')';
    }

    public /* synthetic */ C0072q(Object obj, InterfaceC0061f interfaceC0061f, C4.l lVar, CancellationException cancellationException, int i6) {
        this(obj, (i6 & 2) != 0 ? null : interfaceC0061f, (i6 & 4) != 0 ? null : lVar, (Object) null, (i6 & 16) != 0 ? null : cancellationException);
    }
}
