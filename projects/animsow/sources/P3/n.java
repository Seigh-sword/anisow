package P3;

import M4.InterfaceC0080z;
import P4.InterfaceC0146g;
import a0.C0254b;
import java.util.LinkedHashMap;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public q f2553A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2554B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ q f2555C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2555C = qVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((n) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new n(this.f2555C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        q qVar;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2554B;
        if (i6 == 0) {
            S3.a.O(obj);
            q qVar2 = this.f2555C;
            InterfaceC0146g interfaceC0146gB = qVar2.f2568a.b();
            this.f2553A = qVar2;
            this.f2554B = 1;
            Object objY = AbstractC1305a.y(interfaceC0146gB, this);
            if (objY == enumC1481a) {
                return enumC1481a;
            }
            qVar = qVar2;
            obj = objY;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = this.f2553A;
            S3.a.O(obj);
        }
        q.a(qVar, new C0254b(new LinkedHashMap(((a0.h) obj).a()), true));
        return C1316l.f12640a;
    }
}
