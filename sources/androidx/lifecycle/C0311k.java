package androidx.lifecycle;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0311k {
    public static EnumC0313m a(EnumC0314n enumC0314n) {
        AbstractC1305a.o(enumC0314n, "state");
        int iOrdinal = enumC0314n.ordinal();
        if (iOrdinal == 1) {
            return EnumC0313m.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0313m.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0313m.ON_RESUME;
    }
}
