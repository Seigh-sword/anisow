package n1;

import C1.j;
import java.util.ArrayDeque;
import l1.F;
import l1.q;
import p1.v;

/* JADX INFO: renamed from: n1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1149e extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11689d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11690e;

    public C1149e(long j6) {
        super(j6);
    }

    @Override // C1.j
    public final int b(Object obj) {
        switch (this.f11689d) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                F f6 = (F) obj;
                if (f6 == null) {
                    return 1;
                }
                return f6.c();
            default:
                return 1;
        }
    }

    @Override // C1.j
    public final void c(Object obj, Object obj2) {
        switch (this.f11689d) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                F f6 = (F) obj2;
                InterfaceC1150f interfaceC1150f = (InterfaceC1150f) this.f11690e;
                if (interfaceC1150f == null || f6 == null) {
                    return;
                }
                ((q) interfaceC1150f).f9968e.a(f6, true);
                return;
            default:
                v vVar = (v) obj;
                vVar.getClass();
                ArrayDeque arrayDeque = v.f12282d;
                synchronized (arrayDeque) {
                    arrayDeque.offer(vVar);
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1149e(S0.f fVar) {
        super(500L);
        this.f11690e = fVar;
    }
}
