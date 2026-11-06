package I0;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f1094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1095b;

    public d(boolean z5, Uri uri) {
        this.f1094a = uri;
        this.f1095b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1095b == dVar.f1095b && this.f1094a.equals(dVar.f1094a);
    }

    public final int hashCode() {
        return (this.f1094a.hashCode() * 31) + (this.f1095b ? 1 : 0);
    }
}
