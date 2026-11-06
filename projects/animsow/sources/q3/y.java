package Q3;

import d.AbstractC0628i;
import h0.C0733A;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class y implements z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u f2821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v f2822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ y[] f2823y;

    static {
        u uVar = new u();
        f2821w = uVar;
        v vVar = new v();
        f2822x = vVar;
        f2823y = new y[]{uVar, vVar, new y() { // from class: Q3.w
            @Override // Q3.z
            public final Number a(X3.a aVar) throws IOException {
                String strU = aVar.U();
                try {
                    return Long.valueOf(Long.parseLong(strU));
                } catch (NumberFormatException unused) {
                    try {
                        Double dValueOf = Double.valueOf(strU);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!aVar.f4685x) {
                                throw new X3.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.u(true));
                            }
                        }
                        return dValueOf;
                    } catch (NumberFormatException e6) {
                        StringBuilder sbN = AbstractC0628i.n("Cannot parse ", strU, "; at path ");
                        sbN.append(aVar.u(true));
                        throw new C0733A(sbN.toString(), e6);
                    }
                }
            }
        }, new y() { // from class: Q3.x
            @Override // Q3.z
            public final Number a(X3.a aVar) throws IOException {
                String strU = aVar.U();
                try {
                    return new BigDecimal(strU);
                } catch (NumberFormatException e6) {
                    StringBuilder sbN = AbstractC0628i.n("Cannot parse ", strU, "; at path ");
                    sbN.append(aVar.u(true));
                    throw new C0733A(sbN.toString(), e6);
                }
            }
        }};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f2823y.clone();
    }
}
