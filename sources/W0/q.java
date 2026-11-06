package w0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13540a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13542c;

    public q(String str, boolean z5) {
        this.f13541b = str;
        this.f13542c = z5;
    }

    public final String toString() {
        switch (this.f13540a) {
            case 1:
                String str = this.f13541b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f13542c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public q(boolean z5, String str) {
        this.f13542c = z5;
        this.f13541b = str;
    }
}
