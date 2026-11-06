package Z0;

import M4.InterfaceC0080z;
import com.android.app.models.MyList;
import java.util.ArrayList;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Q3.n f4935A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4936B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p f4937C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4937C = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((i) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new i(this.f4937C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        Q3.n nVar;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4936B;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                Q3.n nVar2 = new Q3.n();
                e eVar = this.f4937C.f4953b;
                this.f4935A = nVar2;
                this.f4936B = 1;
                Object objB = eVar.b("MY_LIST", this);
                if (objB == enumC1481a) {
                    return enumC1481a;
                }
                nVar = nVar2;
                obj = objB;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = this.f4935A;
                S3.a.O(obj);
            }
            return t4.n.l0(((MyList) nVar.b(MyList.class, (String) obj)).getIds());
        } catch (Exception unused) {
            return new ArrayList();
        }
    }
}
