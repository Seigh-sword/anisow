package a0;

import C4.p;
import java.util.LinkedHashMap;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends x4.h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4991A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4992B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p f4993C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4993C = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((i) l((h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        i iVar = new i(this.f4993C, interfaceC1427e);
        iVar.f4992B = obj;
        return iVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4991A;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0254b c0254b = (C0254b) this.f4992B;
            S3.a.O(obj);
            return c0254b;
        }
        S3.a.O(obj);
        C0254b c0254b2 = new C0254b(new LinkedHashMap(((h) this.f4992B).a()), false);
        this.f4992B = c0254b2;
        this.f4991A = 1;
        return this.f4993C.h(c0254b2, this) == enumC1481a ? enumC1481a : c0254b2;
    }
}
