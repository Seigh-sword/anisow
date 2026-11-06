package p1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class K implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f12236b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f12237a;

    public K(J j6) {
        this.f12237a = j6;
    }

    @Override // p1.x
    public final boolean a(Object obj) {
        return f12236b.contains(((Uri) obj).getScheme());
    }

    @Override // p1.x
    public final w b(Object obj, int i6, int i7, j1.m mVar) {
        Uri uri = (Uri) obj;
        return new w(new B1.b(uri), this.f12237a.h(uri));
    }
}
