package W1;

import java.util.Arrays;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: W1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0207a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.d f4284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1.a f4285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4286d;

    public C0207a(V1.d dVar, V1.a aVar, String str) {
        this.f4284b = dVar;
        this.f4285c = aVar;
        this.f4286d = str;
        this.f4283a = Arrays.hashCode(new Object[]{dVar, aVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0207a)) {
            return false;
        }
        C0207a c0207a = (C0207a) obj;
        return AbstractC1332d.D(this.f4284b, c0207a.f4284b) && AbstractC1332d.D(this.f4285c, c0207a.f4285c) && AbstractC1332d.D(this.f4286d, c0207a.f4286d);
    }

    public final int hashCode() {
        return this.f4283a;
    }
}
