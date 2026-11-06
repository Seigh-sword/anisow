package G4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends F4.a {
    @Override // F4.a
    public final Random a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC1305a.n(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
