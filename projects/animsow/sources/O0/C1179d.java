package o0;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1179d extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ boolean f11907A;

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C1179d) l(bool, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1179d c1179d = new C1179d(2, interfaceC1427e);
        c1179d.f11907A = ((Boolean) obj).booleanValue();
        return c1179d;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        return Boolean.valueOf(!this.f11907A);
    }
}
