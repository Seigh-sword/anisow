package C1;

import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C1280b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f114E;

    @Override // s.k, java.util.Map
    public final void clear() {
        this.f114E = 0;
        super.clear();
    }

    @Override // s.k, java.util.Map
    public final int hashCode() {
        if (this.f114E == 0) {
            this.f114E = super.hashCode();
        }
        return this.f114E;
    }

    @Override // s.k
    public final void i(C1280b c1280b) {
        this.f114E = 0;
        super.i(c1280b);
    }

    @Override // s.k
    public final Object j(int i6) {
        this.f114E = 0;
        return super.j(i6);
    }

    @Override // s.k
    public final Object k(int i6, Object obj) {
        this.f114E = 0;
        return super.k(i6, obj);
    }

    @Override // s.k, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f114E = 0;
        return super.put(obj, obj2);
    }
}
