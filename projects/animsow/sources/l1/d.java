package L1;

import android.content.Context;
import i.C0803c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import q4.InterfaceC1266a;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements J1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1266a f1719b;

    public /* synthetic */ d(InterfaceC1266a interfaceC1266a, int i6) {
        this.f1718a = i6;
        this.f1719b = interfaceC1266a;
    }

    @Override // q4.InterfaceC1266a
    public final Object get() {
        int i6 = this.f1718a;
        InterfaceC1266a interfaceC1266a = this.f1719b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                P1.a aVar = (P1.a) interfaceC1266a.get();
                C1358b c1358b = new C1358b(12);
                E1.d dVar = E1.d.f385w;
                C0803c c0803c = new C0803c(25);
                Set setEmptySet = Collections.emptySet();
                if (setEmptySet == null) {
                    throw new NullPointerException("Null flags");
                }
                c0803c.f9279z = setEmptySet;
                c0803c.f9277x = 30000L;
                c0803c.f9278y = 86400000L;
                ((Map) c1358b.f12823y).put(dVar, c0803c.l());
                E1.d dVar2 = E1.d.f387y;
                C0803c c0803c2 = new C0803c(25);
                Set setEmptySet2 = Collections.emptySet();
                if (setEmptySet2 == null) {
                    throw new NullPointerException("Null flags");
                }
                c0803c2.f9279z = setEmptySet2;
                c0803c2.f9277x = 1000L;
                c0803c2.f9278y = 86400000L;
                ((Map) c1358b.f12823y).put(dVar2, c0803c2.l());
                E1.d dVar3 = E1.d.f386x;
                C0803c c0803c3 = new C0803c(25);
                Set setEmptySet3 = Collections.emptySet();
                if (setEmptySet3 == null) {
                    throw new NullPointerException("Null flags");
                }
                c0803c3.f9279z = setEmptySet3;
                c0803c3.f9277x = 86400000L;
                c0803c3.f9278y = 86400000L;
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(M1.e.f1768x)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                c0803c3.f9279z = setUnmodifiableSet;
                ((Map) c1358b.f12823y).put(dVar3, c0803c3.l());
                c1358b.f12822x = aVar;
                if (aVar == null) {
                    throw new NullPointerException("missing required property: clock");
                }
                if (((Map) c1358b.f12823y).keySet().size() < E1.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                Map map = (Map) c1358b.f12823y;
                c1358b.f12823y = new HashMap();
                return new M1.b((P1.a) c1358b.f12822x, map);
            default:
                String packageName = ((Context) interfaceC1266a.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
