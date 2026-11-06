package z0;

import android.os.Bundle;
import androidx.lifecycle.C0310j;
import i.C0810j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AbstractC1162e;
import o.C1160c;
import o.C1164g;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: z0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1523d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f14067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0810j f14069e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1164g f14065a = new C1164g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14070f = true;

    public final Bundle a(String str) {
        if (!this.f14068d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f14067c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f14067c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f14067c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f14067c = null;
        }
        return bundle2;
    }

    public final InterfaceC1522c b() {
        String str;
        InterfaceC1522c interfaceC1522c;
        Iterator it = this.f14065a.iterator();
        do {
            AbstractC1162e abstractC1162e = (AbstractC1162e) it;
            if (!abstractC1162e.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) abstractC1162e.next();
            AbstractC1305a.n(entry, "components");
            str = (String) entry.getKey();
            interfaceC1522c = (InterfaceC1522c) entry.getValue();
        } while (!AbstractC1305a.c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC1522c;
    }

    public final void c(String str, InterfaceC1522c interfaceC1522c) {
        Object obj;
        AbstractC1305a.o(str, "key");
        AbstractC1305a.o(interfaceC1522c, "provider");
        C1164g c1164g = this.f14065a;
        C1160c c1160cB = c1164g.b(str);
        if (c1160cB != null) {
            obj = c1160cB.f11707x;
        } else {
            C1160c c1160c = new C1160c(str, interfaceC1522c);
            c1164g.f11718z++;
            C1160c c1160c2 = c1164g.f11716x;
            if (c1160c2 == null) {
                c1164g.f11715w = c1160c;
            } else {
                c1160c2.f11708y = c1160c;
                c1160c.f11709z = c1160c2;
            }
            c1164g.f11716x = c1160c;
            obj = null;
        }
        if (((InterfaceC1522c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (!this.f14070f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        C0810j c0810j = this.f14069e;
        if (c0810j == null) {
            c0810j = new C0810j(this);
        }
        this.f14069e = c0810j;
        try {
            C0310j.class.getDeclaredConstructor(new Class[0]);
            C0810j c0810j2 = this.f14069e;
            if (c0810j2 != null) {
                ((Set) c0810j2.f9321b).add(C0310j.class.getName());
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + C0310j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }
}
