package b3;

import P0.h;
import W2.o;
import a3.C0261b;
import android.os.Bundle;
import com.bumptech.glide.d;
import java.util.Set;
import m2.C0;
import m2.D0;

/* JADX INFO: renamed from: b3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0342b implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5929b;

    public /* synthetic */ C0342b(int i6, Object obj) {
        this.f5928a = i6;
        this.f5929b = obj;
    }

    @Override // m2.D0
    public final void a(long j6, Bundle bundle, String str, String str2) {
        int i6 = this.f5928a;
        Object obj = this.f5929b;
        switch (i6) {
            case d.f6312l /* 0 */:
                h hVar = (h) obj;
                if (((Set) hVar.f2407a).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    o oVar = AbstractC0341a.f5924a;
                    String strS = C0.s(str2, C0.f10532c, C0.f10530a);
                    if (strS != null) {
                        str2 = strS;
                    }
                    bundle2.putString("events", str2);
                    ((C0261b) hVar.f2408b).n(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && (!AbstractC0341a.f5924a.contains(str2))) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j6);
                    bundle3.putBundle("params", bundle);
                    ((C0261b) ((C0343c) obj).f5930w).n(3, bundle3);
                    break;
                }
                break;
        }
    }
}
