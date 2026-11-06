package w;

import d.AbstractC0628i;
import d2.AbstractC0651b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import x.o;

/* JADX INFO: renamed from: w.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1436c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1437d f13334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1436c f13336f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u.i f13339i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f13331a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13337g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13338h = Integer.MIN_VALUE;

    public C1436c(C1437d c1437d, int i6) {
        this.f13334d = c1437d;
        this.f13335e = i6;
    }

    public final void a(C1436c c1436c, int i6) {
        b(c1436c, i6, Integer.MIN_VALUE, false);
    }

    public final boolean b(C1436c c1436c, int i6, int i7, boolean z5) {
        if (c1436c == null) {
            j();
            return true;
        }
        if (!z5 && !i(c1436c)) {
            return false;
        }
        this.f13336f = c1436c;
        if (c1436c.f13331a == null) {
            c1436c.f13331a = new HashSet();
        }
        HashSet hashSet = this.f13336f.f13331a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f13337g = i6;
        this.f13338h = i7;
        return true;
    }

    public final void c(int i6, o oVar, ArrayList arrayList) {
        HashSet hashSet = this.f13331a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0651b.n(((C1436c) it.next()).f13334d, i6, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f13333c) {
            return this.f13332b;
        }
        return 0;
    }

    public final int e() {
        C1436c c1436c;
        if (this.f13334d.f13379g0 == 8) {
            return 0;
        }
        int i6 = this.f13338h;
        return (i6 == Integer.MIN_VALUE || (c1436c = this.f13336f) == null || c1436c.f13334d.f13379g0 != 8) ? this.f13337g : i6;
    }

    public final C1436c f() {
        int i6 = this.f13335e;
        int iB = u.h.b(i6);
        C1437d c1437d = this.f13334d;
        switch (iB) {
            case com.bumptech.glide.d.f6312l /* 0 */:
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
                return c1437d.f13350K;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return c1437d.f13351L;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return c1437d.f13348I;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return c1437d.f13349J;
            default:
                throw new AssertionError(AbstractC0628i.r(i6));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f13331a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1436c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f13336f != null;
    }

    public final boolean i(C1436c c1436c) {
        if (c1436c == null) {
            return false;
        }
        int i6 = this.f13335e;
        C1437d c1437d = c1436c.f13334d;
        int i7 = c1436c.f13335e;
        if (i7 == i6) {
            return i6 != 6 || (c1437d.f13344E && this.f13334d.f13344E);
        }
        switch (u.h.b(i6)) {
            case com.bumptech.glide.d.f6312l /* 0 */:
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return false;
            case 1:
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                boolean z5 = i7 == 2 || i7 == 4;
                if (c1437d instanceof C1441h) {
                    return z5 || i7 == 8;
                }
                return z5;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                boolean z6 = i7 == 3 || i7 == 5;
                if (c1437d instanceof C1441h) {
                    return z6 || i7 == 9;
                }
                return z6;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return (i7 == 2 || i7 == 4) ? false : true;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return (i7 == 6 || i7 == 8 || i7 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC0628i.r(i6));
        }
    }

    public final void j() {
        HashSet hashSet;
        C1436c c1436c = this.f13336f;
        if (c1436c != null && (hashSet = c1436c.f13331a) != null) {
            hashSet.remove(this);
            if (this.f13336f.f13331a.size() == 0) {
                this.f13336f.f13331a = null;
            }
        }
        this.f13331a = null;
        this.f13336f = null;
        this.f13337g = 0;
        this.f13338h = Integer.MIN_VALUE;
        this.f13333c = false;
        this.f13332b = 0;
    }

    public final void k() {
        u.i iVar = this.f13339i;
        if (iVar == null) {
            this.f13339i = new u.i(1);
        } else {
            iVar.c();
        }
    }

    public final void l(int i6) {
        this.f13332b = i6;
        this.f13333c = true;
    }

    public final String toString() {
        return this.f13334d.f13381h0 + ":" + AbstractC0628i.r(this.f13335e);
    }
}
