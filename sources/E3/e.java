package E3;

import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str);
        AbstractC1332d.h("Detail message must not be empty", str);
    }
}
