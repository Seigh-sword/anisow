package h5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: h5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0781h extends P2.e {
    @Override // P2.e
    public final List d(Executor executor) {
        return Arrays.asList(new C0788o(), new C0791s(executor));
    }

    @Override // P2.e
    public final List e() {
        return Collections.singletonList(new C0780g(1));
    }
}
