package W2;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4429c;

    public l(Object obj, Object obj2, Object obj3) {
        this.f4427a = obj;
        this.f4428b = obj2;
        this.f4429c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f4427a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f4428b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f4429c);
        StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
