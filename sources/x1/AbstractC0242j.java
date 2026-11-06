package X1;

import W1.InterfaceC0210d;
import W1.InterfaceC0216j;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p1.C1243i;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: X1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0242j extends AbstractC0238f implements V1.b, v {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Set f4619D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Account f4620E;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0242j(Context context, Looper looper, int i6, C0239g c0239g, InterfaceC0210d interfaceC0210d, InterfaceC0216j interfaceC0216j) {
        P pA = P.a(context);
        U1.e eVar = U1.e.f3586d;
        AbstractC1332d.m(interfaceC0210d);
        AbstractC1332d.m(interfaceC0216j);
        super(context, looper, pA, eVar, i6, new C1243i(5, interfaceC0210d), new K1.b(2, interfaceC0216j), c0239g.f4594f);
        this.f4620E = c0239g.f4589a;
        Set set = c0239g.f4591c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f4619D = set;
    }

    @Override // V1.b
    public final Set f() {
        return j() ? this.f4619D : Collections.emptySet();
    }

    @Override // X1.AbstractC0238f
    public final Account p() {
        return this.f4620E;
    }

    @Override // X1.AbstractC0238f
    public final Set s() {
        return this.f4619D;
    }
}
