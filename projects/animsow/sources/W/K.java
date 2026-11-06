package W;

import java.io.Serializable;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class K extends x4.h implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Serializable f4032A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4033B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ D4.r f4034C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ W f4035D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ D4.p f4036E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(D4.r rVar, W w5, D4.p pVar, InterfaceC1427e interfaceC1427e) {
        super(1, interfaceC1427e);
        this.f4034C = rVar;
        this.f4035D = w5;
        this.f4036E = pVar;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        return new K(this.f4034C, this.f4035D, this.f4036E, (InterfaceC1427e) obj).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        D4.r rVar;
        D4.p pVar;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4033B;
        D4.p pVar2 = this.f4036E;
        D4.r rVar2 = this.f4034C;
        W w5 = this.f4035D;
        try {
        } catch (C0183b unused) {
            Object obj2 = rVar2.f377w;
            this.f4032A = pVar2;
            this.f4033B = 3;
            obj = w5.i(obj2, true, this);
            if (obj == enumC1481a) {
                return enumC1481a;
            }
        }
        if (i6 == 0) {
            S3.a.O(obj);
            this.f4032A = rVar2;
            this.f4033B = 1;
            obj = w5.h(this);
            if (obj == enumC1481a) {
                return enumC1481a;
            }
            rVar = rVar2;
        } else {
            if (i6 != 1) {
                if (i6 == 2) {
                    pVar = (D4.p) this.f4032A;
                    S3.a.O(obj);
                    pVar.f375w = ((Number) obj).intValue();
                    return C1316l.f12640a;
                }
                if (i6 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar2 = (D4.p) this.f4032A;
                S3.a.O(obj);
                pVar2.f375w = ((Number) obj).intValue();
                return C1316l.f12640a;
            }
            rVar = (D4.r) this.f4032A;
            S3.a.O(obj);
        }
        rVar.f377w = obj;
        i0 i0VarF = w5.f();
        this.f4032A = pVar2;
        this.f4033B = 2;
        obj = i0VarF.a();
        if (obj == enumC1481a) {
            return enumC1481a;
        }
        pVar = pVar2;
        pVar.f375w = ((Number) obj).intValue();
        return C1316l.f12640a;
    }
}
