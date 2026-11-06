package t4;

import java.util.Collection;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends S3.a {
    public static int W(Iterable iterable) {
        AbstractC1305a.o(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
