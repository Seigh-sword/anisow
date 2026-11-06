package f1;

import com.android.app.models.MyList;
import o0.C1175b1;
import o0.e1;
import o0.f1;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8394b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8395c;

    public f(MyList myList) {
        AbstractC1305a.o(myList, "myList");
        this.f8395c = myList;
    }

    @Override // o0.e1
    public final /* bridge */ /* synthetic */ Integer a(f1 f1Var) {
        switch (this.f8394b) {
        }
        return d(f1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // o0.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(o0.Z0 r14, v4.InterfaceC1427e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.f.c(o0.Z0, v4.e):java.lang.Object");
    }

    public final Integer d(f1 f1Var) {
        Integer num;
        int iIntValue;
        Integer num2;
        Integer num3;
        int iIntValue2;
        Integer num4;
        Integer num5 = f1Var.f11934b;
        switch (this.f8394b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (num5 != null) {
                    int iIntValue3 = num5.intValue();
                    C1175b1 c1175b1A = f1Var.a(iIntValue3);
                    if (c1175b1A == null || (num2 = (Integer) c1175b1A.f11898x) == null) {
                        C1175b1 c1175b1A2 = f1Var.a(iIntValue3);
                        if (c1175b1A2 != null && (num = (Integer) c1175b1A2.f11899y) != null) {
                            iIntValue = num.intValue() - 1;
                        }
                    } else {
                        iIntValue = num2.intValue() + 1;
                    }
                }
                break;
            default:
                if (num5 != null) {
                    int iIntValue4 = num5.intValue();
                    C1175b1 c1175b1A3 = f1Var.a(iIntValue4);
                    if (c1175b1A3 == null || (num4 = (Integer) c1175b1A3.f11898x) == null) {
                        C1175b1 c1175b1A4 = f1Var.a(iIntValue4);
                        if (c1175b1A4 != null && (num3 = (Integer) c1175b1A4.f11899y) != null) {
                            iIntValue2 = num3.intValue() - 1;
                        }
                    } else {
                        iIntValue2 = num4.intValue() + 1;
                    }
                }
                break;
        }
        return null;
    }

    public f(String str) {
        AbstractC1305a.o(str, "query");
        this.f8395c = str;
    }
}
