package W0;

import C4.p;
import M4.InterfaceC0080z;
import android.os.Bundle;
import com.android.app.activities.CategoryActivity;
import d1.AbstractC0649a;
import g1.C0716b;
import g1.C0717c;
import o0.C1180d0;
import o0.I0;
import o0.J0;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends x4.h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4199A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ CategoryActivity f4200B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CategoryActivity categoryActivity, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4200B = categoryActivity;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((f) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new f(this.f4200B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4199A;
        if (i6 == 0) {
            S3.a.O(obj);
            CategoryActivity categoryActivity = this.f4200B;
            C0717c c0717c = (C0717c) categoryActivity.f6268e0.getValue();
            Bundle extras = categoryActivity.getIntent().getExtras();
            Integer numValueOf = extras != null ? Integer.valueOf(extras.getInt("CATEGORY_ID")) : null;
            AbstractC1305a.l(numValueOf);
            int iIntValue = numValueOf.intValue();
            c0717c.getClass();
            J0 j02 = AbstractC0649a.f8163a;
            C0716b c0716b = new C0716b(iIntValue);
            AbstractC1305a.o(j02, "config");
            C1180d0 c1180d0 = new C1180d0(new I0(c0716b, null), null, j02);
            e eVar = new e(categoryActivity, null);
            this.f4199A = 1;
            if (AbstractC1305a.q(c1180d0.f11913f, eVar, this) == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        return C1316l.f12640a;
    }
}
