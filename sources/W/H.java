package W;

import s4.C1311g;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Throwable f4013A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4014B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ boolean f4015C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ W f4016D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f4017E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(W w5, int i6, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4016D = w5;
        this.f4017E = i6;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((H) l(bool, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        H h4 = new H(this.f4016D, this.f4017E, interfaceC1427e);
        h4.f4015C = ((Boolean) obj).booleanValue();
        return h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        Throwable th;
        int iIntValue;
        ?? r02;
        ?? r03;
        j0 j0Var;
        ?? r12;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        ?? r13 = this.f4014B;
        W w5 = this.f4016D;
        try {
        } catch (Throwable th2) {
            if (r13 == 0) {
                ?? r5 = r13;
                th = th2;
                iIntValue = this.f4017E;
                r02 = r5 == true ? 1 : 0;
                Z z5 = new Z(th, iIntValue);
                r12 = r02;
                j0Var = z5;
                return new C1311g(j0Var, Boolean.valueOf((boolean) r12));
            }
            i0 i0VarF = w5.f();
            this.f4013A = th2;
            this.f4015C = r13;
            this.f4014B = 2;
            Integer numA = i0VarF.a();
            if (numA == enumC1481a) {
                return enumC1481a;
            }
            r03 = r13;
            th = th2;
            obj = numA;
        }
        if (r13 == 0) {
            S3.a.O(obj);
            boolean z6 = this.f4015C;
            this.f4015C = z6;
            this.f4014B = 1;
            obj = W.e(w5, z6, this);
            r13 = z6;
            if (obj == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (r13 != 1) {
                if (r13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z7 = this.f4015C;
                th = this.f4013A;
                S3.a.O(obj);
                r03 = z7;
                iIntValue = ((Number) obj).intValue();
                r02 = r03;
                Z z52 = new Z(th, iIntValue);
                r12 = r02;
                j0Var = z52;
                return new C1311g(j0Var, Boolean.valueOf((boolean) r12));
            }
            boolean z8 = this.f4015C;
            S3.a.O(obj);
            r13 = z8;
        }
        j0Var = (j0) obj;
        r12 = r13;
        return new C1311g(j0Var, Boolean.valueOf((boolean) r12));
    }
}
