package m2;

import com.google.android.gms.internal.measurement.C0387b;
import com.google.android.gms.internal.measurement.O2;
import java.util.HashMap;
import java.util.concurrent.Callable;
import u1.C1358b;

/* JADX INFO: renamed from: m2.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1030d0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1033e0 f10876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10877c;

    public /* synthetic */ CallableC1030d0(C1033e0 c1033e0, String str, int i6) {
        this.f10875a = i6;
        this.f10876b = c1033e0;
        this.f10877c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f10877c;
        C1033e0 c1033e0 = this.f10876b;
        switch (this.f10875a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                F fQ0 = c1033e0.t().q0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                map.put("gmp_version", 106000L);
                if (fQ0 != null) {
                    String strH = fQ0.h();
                    if (strH != null) {
                        map.put("app_version", strH);
                    }
                    map.put("app_version_int", Long.valueOf(fQ0.y()));
                    map.put("dynamite_version", Long.valueOf(fQ0.N()));
                }
                return map;
            case 1:
                return new O2(new CallableC1030d0(c1033e0, str, 0));
            default:
                return new C0387b(new C1358b(c1033e0, str, 24));
        }
    }
}
