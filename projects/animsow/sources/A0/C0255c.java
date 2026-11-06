package a0;

import C4.p;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: a0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0255c extends x4.h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4984A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4985B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p f4986C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0255c(p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4986C = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0255c) l((h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C0255c c0255c = new C0255c(this.f4986C, interfaceC1427e);
        c0255c.f4985B = obj;
        return c0255c;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4984A;
        if (i6 == 0) {
            S3.a.O(obj);
            h hVar = (h) this.f4985B;
            this.f4984A = 1;
            obj = this.f4986C.h(hVar, this);
            if (obj == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        h hVar2 = (h) obj;
        AbstractC1305a.m(hVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) ((C0254b) hVar2).f4983b.f3073x).set(true);
        return hVar2;
    }
}
