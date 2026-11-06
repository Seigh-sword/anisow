package m2;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0512w;
import java.util.LinkedHashMap;
import s.C1284f;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1036f0 extends C1284f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1033e0 f10906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036f0(C1033e0 c1033e0) {
        super(20);
        this.f10906f = c1033e0;
    }

    @Override // s.C1284f
    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        com.google.android.gms.internal.measurement.X0 x02;
        String str = (String) obj;
        AbstractC1332d.g(str);
        C1033e0 c1033e0 = this.f10906f;
        c1033e0.v();
        AbstractC1332d.g(str);
        boolean z5 = false;
        if (!TextUtils.isEmpty(str) && (x02 = (com.google.android.gms.internal.measurement.X0) c1033e0.f10891D.getOrDefault(str, null)) != null && x02.p() != 0) {
            z5 = true;
        }
        if (!z5) {
            return null;
        }
        if (!c1033e0.f10891D.containsKey(str) || c1033e0.f10891D.getOrDefault(str, null) == null) {
            c1033e0.P(str);
        } else {
            c1033e0.E(str, (com.google.android.gms.internal.measurement.X0) c1033e0.f10891D.getOrDefault(str, null));
        }
        C1036f0 c1036f0 = c1033e0.f10893F;
        synchronized (c1036f0) {
            linkedHashMap = new LinkedHashMap(c1036f0.f12511a);
        }
        return (C0512w) linkedHashMap.get(str);
    }
}
