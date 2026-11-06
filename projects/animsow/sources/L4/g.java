package l4;

import android.os.Looper;
import d.AbstractC0628i;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f10071a = new HashSet();

    public final void a() {
        if (Y2.b.f4806a == null) {
            Y2.b.f4806a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != Y2.b.f4806a) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f10071a.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
    }
}
