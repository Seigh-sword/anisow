package W;

import d.AbstractC0628i;
import java.util.Iterator;
import java.util.List;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: W.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0189h extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Iterator f4123A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Object f4124B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4125C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public /* synthetic */ Object f4126D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ List f4127E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ List f4128F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189h(List list, List list2, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4127E = list;
        this.f4128F = list2;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0189h) l(obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C0189h c0189h = new C0189h(this.f4127E, this.f4128F, interfaceC1427e);
        c0189h.f4126D = obj;
        return c0189h;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        Iterator it;
        List list;
        int i6 = this.f4125C;
        if (i6 == 0) {
            S3.a.O(obj);
            obj = this.f4126D;
            it = this.f4127E.iterator();
            list = this.f4128F;
        } else if (i6 == 1) {
            Object obj2 = this.f4124B;
            Iterator it2 = this.f4123A;
            List list2 = (List) this.f4126D;
            S3.a.O(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0188g(1, null));
                this.f4126D = list2;
                this.f4123A = it2;
                this.f4124B = null;
                this.f4125C = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f4123A;
            list = (List) this.f4126D;
            S3.a.O(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        AbstractC0628i.p(it.next());
        this.f4126D = list;
        this.f4123A = it;
        this.f4124B = obj;
        this.f4125C = 1;
        throw null;
    }
}
