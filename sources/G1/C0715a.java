package g1;

import C4.p;
import M4.InterfaceC0080z;
import androidx.lifecycle.E;
import com.android.app.models.Category;
import com.android.app.models.Resource;
import com.android.app.network.responses.CategoriesResponse;
import e1.AbstractC0660a;
import e1.InterfaceC0662c;
import java.util.List;
import m2.C0;
import s4.AbstractC1305a;
import s4.C1316l;
import t0.AbstractC1332d;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0715a extends x4.h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f8510A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0717c f8511B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0715a(C0717c c0717c, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f8511B = c0717c;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0715a) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C0715a(this.f8511B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f8510A;
        C0717c c0717c = this.f8511B;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                E e6 = c0717c.f8513b;
                Object objD = e6.d();
                AbstractC1305a.l(objD);
                e6.f(((Resource) objD).copy(true, null, null));
                InterfaceC0662c interfaceC0662c = AbstractC0660a.f8255a;
                this.f8510A = 1;
                obj = AbstractC0660a.f8255a.d(this);
                if (obj == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
            List<Category> categories = ((CategoriesResponse) obj).getCategories();
            E e7 = c0717c.f8513b;
            Object objD2 = e7.d();
            AbstractC1305a.l(objD2);
            e7.f(((Resource) objD2).copy(false, categories, null));
        } catch (Exception e8) {
            C0.h().a(e8);
            e8.printStackTrace();
            E e9 = c0717c.f8513b;
            Object objD3 = e9.d();
            AbstractC1305a.l(objD3);
            e9.f(((Resource) objD3).copy(false, null, e8.getMessage()));
            AbstractC1332d.X("CategoriesViewModel ## fetchCategories ## " + e8.getMessage());
        }
        return C1316l.f12640a;
    }
}
