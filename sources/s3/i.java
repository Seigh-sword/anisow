package S3;

import Q3.A;
import Q3.B;
import com.google.gson.reflect.TypeToken;
import d.AbstractC0628i;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements B, Cloneable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i f3255y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f3256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f3257x;

    static {
        i iVar = new i();
        iVar.f3256w = Collections.emptyList();
        iVar.f3257x = Collections.emptyList();
        f3255y = iVar;
    }

    public static boolean e(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // Q3.B
    public final A a(Q3.n nVar, TypeToken typeToken) {
        boolean z5;
        boolean z6;
        boolean zE = e(typeToken.f7456a);
        if (zE) {
            z5 = true;
        } else {
            d(true);
            z5 = false;
        }
        if (zE) {
            z6 = true;
        } else {
            d(false);
            z6 = false;
        }
        if (z5 || z6) {
            return new h(this, z6, z5, nVar, typeToken);
        }
        return null;
    }

    public final Object clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final void d(boolean z5) {
        Iterator it = (z5 ? this.f3256w : this.f3257x).iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
    }
}
