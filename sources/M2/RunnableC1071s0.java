package m2;

import android.os.Bundle;

/* JADX INFO: renamed from: m2.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1071s0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f11087A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f11088B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11090x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11091y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f11092z;

    public /* synthetic */ RunnableC1071s0(Object obj, Object obj2, Object obj3, Object obj4, long j6, int i6) {
        this.f11089w = i6;
        this.f11090x = obj2;
        this.f11091y = obj3;
        this.f11087A = obj4;
        this.f11092z = j6;
        this.f11088B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x1 x1Var;
        String str;
        V0 v02 = null;
        int i6 = this.f11089w;
        Object obj = this.f11087A;
        Object obj2 = this.f11091y;
        Object obj3 = this.f11090x;
        Object obj4 = this.f11088B;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                String str2 = (String) obj3;
                if (str2 == null) {
                    x1Var = ((BinderC1066p0) obj4).f11055c;
                    str = (String) obj2;
                    x1Var.g().r();
                    String str3 = x1Var.f11268b0;
                    if (str3 != null && !str3.equals(str)) {
                    }
                } else {
                    v02 = new V0(this.f11092z, (String) obj, str2);
                    x1Var = ((BinderC1066p0) obj4).f11055c;
                    str = (String) obj2;
                    x1Var.g().r();
                    String str4 = x1Var.f11268b0;
                    if (str4 != null) {
                        str4.equals(str);
                    }
                }
                x1Var.f11268b0 = str;
                x1Var.f11267a0 = v02;
                break;
            case 1:
                ((G0) obj4).H((String) obj3, (String) obj2, obj, this.f11092z);
                break;
            default:
                U0 u02 = (U0) obj4;
                Bundle bundle = (Bundle) obj3;
                V0 v03 = (V0) obj2;
                V0 v04 = (V0) obj;
                if (bundle != null) {
                    bundle.remove("screen_name");
                    bundle.remove("screen_class");
                }
                u02.F(v03, v04, this.f11092z, true, u02.q().B("screen_view", bundle, null, false));
                break;
        }
    }
}
