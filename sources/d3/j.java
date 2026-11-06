package d3;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f8202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8203b;

    public j(r rVar, boolean z5) {
        this.f8202a = rVar;
        this.f8203b = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f8202a.equals(this.f8202a) && jVar.f8203b == this.f8203b;
    }

    public final int hashCode() {
        return ((this.f8202a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8203b).hashCode();
    }
}
