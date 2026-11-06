package I0;

import androidx.work.OverwritingInputMerger;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class p extends v {
    public p(Class cls) {
        this.f1114c = new HashSet();
        this.f1112a = UUID.randomUUID();
        this.f1113b = new R0.i(this.f1112a.toString(), cls.getName());
        this.f1114c.add(cls.getName());
        this.f1113b.f2903d = OverwritingInputMerger.class.getName();
    }
}
