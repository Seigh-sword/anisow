package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0479q1 extends H2 {
    public final void k(C0502u1 c0502u1) {
        i();
        C0484r1.v((C0484r1) this.f6602x, (C0508v1) c0502u1.e());
    }

    public final void l(C0508v1 c0508v1) {
        i();
        C0484r1.v((C0484r1) this.f6602x, c0508v1);
    }

    public final long m() {
        return ((C0484r1) this.f6602x).A();
    }

    public final C0508v1 n(int i6) {
        return ((C0484r1) this.f6602x).q(i6);
    }

    public final long o() {
        return ((C0484r1) this.f6602x).B();
    }

    public final String p() {
        return ((C0484r1) this.f6602x).D();
    }

    public final List q() {
        return Collections.unmodifiableList(((C0484r1) this.f6602x).E());
    }
}
