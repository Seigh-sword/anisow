package p1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class L implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f12238b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f12239a;

    public L(x xVar) {
        this.f12239a = xVar;
    }

    @Override // p1.x
    public final boolean a(Object obj) {
        return f12238b.contains(((Uri) obj).getScheme());
    }

    @Override // p1.x
    public final w b(Object obj, int i6, int i7, j1.m mVar) {
        return this.f12239a.b(new o(((Uri) obj).toString()), i6, i7, mVar);
    }
}
