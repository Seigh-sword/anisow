package w4;

import C4.p;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import x4.g;

/* JADX INFO: renamed from: w4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1482b extends g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13594x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f13595y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f13596z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1482b(Object obj, InterfaceC1427e interfaceC1427e, p pVar) {
        super(interfaceC1427e);
        this.f13595y = pVar;
        this.f13596z = obj;
        AbstractC1305a.m(interfaceC1427e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        int i6 = this.f13594x;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f13594x = 2;
            S3.a.O(obj);
            return obj;
        }
        this.f13594x = 1;
        S3.a.O(obj);
        p pVar = this.f13595y;
        AbstractC1305a.m(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        S3.a.f(2, pVar);
        return pVar.h(this.f13596z, this);
    }
}
