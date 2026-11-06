package V2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f3733w;

    public d(Object obj) {
        this.f3733w = obj;
    }

    @Override // V2.c
    public final Object a() {
        return this.f3733w;
    }

    @Override // V2.c
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3733w.equals(((d) obj).f3733w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3733w.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3733w);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
