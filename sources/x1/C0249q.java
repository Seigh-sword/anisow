package X1;

import java.util.Arrays;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: X1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0249q implements V1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0249q f4640b = new C0249q(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4641a;

    public /* synthetic */ C0249q(String str) {
        this.f4641a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0249q) {
            return AbstractC1332d.D(this.f4641a, ((C0249q) obj).f4641a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4641a});
    }
}
