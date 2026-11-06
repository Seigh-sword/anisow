package l3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f10043c = new g(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10045b;

    public g(int i6, int i7) {
        this.f10044a = i6;
        this.f10045b = i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(g.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f10044a);
        sb.append(", length = ");
        return AbstractC0628i.l(sb, this.f10045b, "]");
    }
}
