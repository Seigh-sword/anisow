package w4;

import C4.p;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ p f13597A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f13598B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13599z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC1427e interfaceC1427e, InterfaceC1432j interfaceC1432j, p pVar, Object obj) {
        super(interfaceC1427e, interfaceC1432j);
        this.f13597A = pVar;
        this.f13598B = obj;
        AbstractC1305a.m(interfaceC1427e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        int i6 = this.f13599z;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f13599z = 2;
            S3.a.O(obj);
            return obj;
        }
        this.f13599z = 1;
        S3.a.O(obj);
        p pVar = this.f13597A;
        AbstractC1305a.m(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        S3.a.f(2, pVar);
        return pVar.h(this.f13598B, this);
    }
}
