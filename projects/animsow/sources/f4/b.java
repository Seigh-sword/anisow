package F4;

import f2.j;
import java.util.Random;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f636y = new j(2);

    @Override // F4.a
    public final Random a() {
        Object obj = this.f636y.get();
        AbstractC1305a.n(obj, "get(...)");
        return (Random) obj;
    }
}
