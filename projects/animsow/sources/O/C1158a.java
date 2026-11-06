package o;

import java.util.HashMap;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1158a extends C1164g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final HashMap f11704A = new HashMap();

    @Override // o.C1164g
    public final C1160c b(Object obj) {
        return (C1160c) this.f11704A.get(obj);
    }

    @Override // o.C1164g
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.f11704A.remove(obj);
        return objC;
    }

    public final Object e(Object obj, Object obj2) {
        C1160c c1160cB = b(obj);
        if (c1160cB != null) {
            return c1160cB.f11707x;
        }
        HashMap map = this.f11704A;
        C1160c c1160c = new C1160c(obj, obj2);
        this.f11718z++;
        C1160c c1160c2 = this.f11716x;
        if (c1160c2 == null) {
            this.f11715w = c1160c;
        } else {
            c1160c2.f11708y = c1160c;
            c1160c.f11709z = c1160c2;
        }
        this.f11716x = c1160c;
        map.put(obj, c1160c);
        return null;
    }
}
