package h0;

import java.util.Objects;

/* JADX INFO: renamed from: h0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0733A extends RuntimeException {
    public C0733A(h5.U u5) {
        Objects.requireNonNull(u5, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        V4.G g4 = u5.f9084a;
        sb.append(g4.f3788y);
        sb.append(" ");
        sb.append(g4.f3789z);
        super(sb.toString());
        int i6 = g4.f3788y;
        String str = g4.f3789z;
    }
}
