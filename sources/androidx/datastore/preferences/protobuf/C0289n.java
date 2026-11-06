package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import v0.AbstractC1397f0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0289n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5493d;

    public static void B(int i6) throws H {
        if ((i6 & 3) != 0) {
            throw new H("Failed to parse the message.");
        }
    }

    public static void C(int i6) throws H {
        if ((i6 & 7) != 0) {
            throw new H("Failed to parse the message.");
        }
    }

    public final boolean A() {
        int i6;
        if (((AbstractC0288m) this.f5493d).c() || (i6 = this.f5490a) == this.f5491b) {
            return false;
        }
        return ((AbstractC0288m) this.f5493d).x(i6);
    }

    public final void a(int i6, int i7) {
        if (i6 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i8 = this.f5492c;
        int i9 = i8 * 2;
        Object obj = this.f5493d;
        if (((int[]) obj) == null) {
            int[] iArr = new int[4];
            this.f5493d = iArr;
            Arrays.fill(iArr, -1);
        } else if (i9 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int[] iArr3 = new int[i8 * 4];
            this.f5493d = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        }
        Object obj2 = this.f5493d;
        ((int[]) obj2)[i9] = i6;
        ((int[]) obj2)[i9 + 1] = i7;
        this.f5492c++;
    }

    public final void b(RecyclerView recyclerView, boolean z5) {
        this.f5492c = 0;
        int[] iArr = (int[]) this.f5493d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC1397f0 abstractC1397f0 = recyclerView.f5704I;
        if (recyclerView.f5702H == null || abstractC1397f0 == null || !abstractC1397f0.f13117i) {
            return;
        }
        if (z5) {
            if (!recyclerView.f5759z.g()) {
                abstractC1397f0.i(recyclerView.f5702H.a(), this);
            }
        } else if (!recyclerView.K()) {
            abstractC1397f0.h(this.f5490a, this.f5491b, recyclerView.f5692B0, this);
        }
        int i6 = this.f5492c;
        if (i6 > abstractC1397f0.f13118j) {
            abstractC1397f0.f13118j = i6;
            abstractC1397f0.f13119k = z5;
            recyclerView.f5755x.k();
        }
    }

    public final int c() {
        int i6 = this.f5492c;
        if (i6 != 0) {
            this.f5490a = i6;
            this.f5492c = 0;
        } else {
            this.f5490a = ((AbstractC0288m) this.f5493d).u();
        }
        int i7 = this.f5490a;
        if (i7 == 0 || i7 == this.f5491b) {
            return Integer.MAX_VALUE;
        }
        return i7 >>> 3;
    }

    public final boolean d(int i6) {
        if (((int[]) this.f5493d) != null) {
            int i7 = this.f5492c * 2;
            for (int i8 = 0; i8 < i7; i8 += 2) {
                if (((int[]) this.f5493d)[i8] == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(Object obj, InterfaceC0283j0 interfaceC0283j0, C0294t c0294t) {
        int i6 = this.f5491b;
        this.f5491b = ((this.f5490a >>> 3) << 3) | 4;
        try {
            interfaceC0283j0.b(obj, this, c0294t);
            if (this.f5490a == this.f5491b) {
            } else {
                throw new H("Failed to parse the message.");
            }
        } finally {
            this.f5491b = i6;
        }
    }

    public final void f(Object obj, InterfaceC0283j0 interfaceC0283j0, C0294t c0294t) throws H {
        int iV = ((AbstractC0288m) this.f5493d).v();
        AbstractC0288m abstractC0288m = (AbstractC0288m) this.f5493d;
        if (abstractC0288m.f5486a >= abstractC0288m.f5487b) {
            throw new H("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = abstractC0288m.e(iV);
        ((AbstractC0288m) this.f5493d).f5486a++;
        interfaceC0283j0.b(obj, this, c0294t);
        ((AbstractC0288m) this.f5493d).a(0);
        r5.f5486a--;
        ((AbstractC0288m) this.f5493d).d(iE);
    }

    public final void g(List list) throws H {
        int iU;
        if (list instanceof AbstractC0272e) {
            int i6 = this.f5490a & 7;
            if (i6 == 0) {
                ((AbstractC0288m) this.f5493d).f();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            ((AbstractC0288m) this.f5493d).v();
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).f();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 0) {
            do {
                list.add(Boolean.valueOf(((AbstractC0288m) this.f5493d).f()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iB = ((AbstractC0288m) this.f5493d).b() + ((AbstractC0288m) this.f5493d).v();
        do {
            list.add(Boolean.valueOf(((AbstractC0288m) this.f5493d).f()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
        y(iB);
    }

    public final AbstractC0280i h() throws G {
        z(2);
        return ((AbstractC0288m) this.f5493d).g();
    }

    public final void i(List list) throws G {
        int iU;
        if ((this.f5490a & 7) != 2) {
            throw H.b();
        }
        do {
            list.add(h());
            if (((AbstractC0288m) this.f5493d).c()) {
                return;
            } else {
                iU = ((AbstractC0288m) this.f5493d).u();
            }
        } while (iU == this.f5490a);
        this.f5492c = iU;
    }

    public final void j(List list) throws H {
        int iU;
        if (list instanceof r) {
            int i6 = this.f5490a & 7;
            if (i6 == 1) {
                ((AbstractC0288m) this.f5493d).h();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            C(((AbstractC0288m) this.f5493d).v());
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).h();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 1) {
            do {
                list.add(Double.valueOf(((AbstractC0288m) this.f5493d).h()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iV = ((AbstractC0288m) this.f5493d).v();
        C(iV);
        int iB = ((AbstractC0288m) this.f5493d).b() + iV;
        do {
            list.add(Double.valueOf(((AbstractC0288m) this.f5493d).h()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
    }

    public final void k(List list) throws H {
        int iU;
        if (list instanceof D) {
            int i6 = this.f5490a & 7;
            if (i6 == 0) {
                ((AbstractC0288m) this.f5493d).i();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            ((AbstractC0288m) this.f5493d).v();
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).i();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).i()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iB = ((AbstractC0288m) this.f5493d).b() + ((AbstractC0288m) this.f5493d).v();
        do {
            list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).i()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
        y(iB);
    }

    public final Object l(K0 k02, Class cls, C0294t c0294t) throws H {
        switch (k02.ordinal()) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                z(1);
                return Double.valueOf(((AbstractC0288m) this.f5493d).h());
            case 1:
                z(5);
                return Float.valueOf(((AbstractC0288m) this.f5493d).l());
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                z(0);
                return Long.valueOf(((AbstractC0288m) this.f5493d).n());
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                z(0);
                return Long.valueOf(((AbstractC0288m) this.f5493d).w());
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                z(0);
                return Integer.valueOf(((AbstractC0288m) this.f5493d).m());
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                z(1);
                return Long.valueOf(((AbstractC0288m) this.f5493d).k());
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                z(5);
                return Integer.valueOf(((AbstractC0288m) this.f5493d).j());
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                z(0);
                return Boolean.valueOf(((AbstractC0288m) this.f5493d).f());
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                z(2);
                return ((AbstractC0288m) this.f5493d).t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                z(2);
                InterfaceC0283j0 interfaceC0283j0A = C0277g0.f5444c.a(cls);
                C cG = interfaceC0283j0A.g();
                f(cG, interfaceC0283j0A, c0294t);
                interfaceC0283j0A.h(cG);
                return cG;
            case 11:
                return h();
            case 12:
                z(0);
                return Integer.valueOf(((AbstractC0288m) this.f5493d).v());
            case 13:
                z(0);
                return Integer.valueOf(((AbstractC0288m) this.f5493d).i());
            case 14:
                z(5);
                return Integer.valueOf(((AbstractC0288m) this.f5493d).o());
            case 15:
                z(1);
                return Long.valueOf(((AbstractC0288m) this.f5493d).p());
            case 16:
                z(0);
                return Integer.valueOf(((AbstractC0288m) this.f5493d).q());
            case 17:
                z(0);
                return Long.valueOf(((AbstractC0288m) this.f5493d).r());
        }
    }

    public final void m(List list) throws H {
        int iU;
        if (list instanceof D) {
            int i6 = this.f5490a & 7;
            if (i6 != 2) {
                if (i6 != 5) {
                    throw H.b();
                }
                ((AbstractC0288m) this.f5493d).j();
                throw null;
            }
            B(((AbstractC0288m) this.f5493d).v());
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).j();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 2) {
            int iV = ((AbstractC0288m) this.f5493d).v();
            B(iV);
            int iB = ((AbstractC0288m) this.f5493d).b() + iV;
            do {
                list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).j()));
            } while (((AbstractC0288m) this.f5493d).b() < iB);
            return;
        }
        if (i7 != 5) {
            throw H.b();
        }
        do {
            list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).j()));
            if (((AbstractC0288m) this.f5493d).c()) {
                return;
            } else {
                iU = ((AbstractC0288m) this.f5493d).u();
            }
        } while (iU == this.f5490a);
        this.f5492c = iU;
    }

    public final void n(List list) throws H {
        int iU;
        if (list instanceof O) {
            int i6 = this.f5490a & 7;
            if (i6 == 1) {
                ((AbstractC0288m) this.f5493d).k();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            C(((AbstractC0288m) this.f5493d).v());
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).k();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 1) {
            do {
                list.add(Long.valueOf(((AbstractC0288m) this.f5493d).k()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iV = ((AbstractC0288m) this.f5493d).v();
        C(iV);
        int iB = ((AbstractC0288m) this.f5493d).b() + iV;
        do {
            list.add(Long.valueOf(((AbstractC0288m) this.f5493d).k()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
    }

    public final void o(List list) throws H {
        int iU;
        if (list instanceof AbstractC0299y) {
            int i6 = this.f5490a & 7;
            if (i6 != 2) {
                if (i6 != 5) {
                    throw H.b();
                }
                ((AbstractC0288m) this.f5493d).l();
                throw null;
            }
            B(((AbstractC0288m) this.f5493d).v());
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).l();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 2) {
            int iV = ((AbstractC0288m) this.f5493d).v();
            B(iV);
            int iB = ((AbstractC0288m) this.f5493d).b() + iV;
            do {
                list.add(Float.valueOf(((AbstractC0288m) this.f5493d).l()));
            } while (((AbstractC0288m) this.f5493d).b() < iB);
            return;
        }
        if (i7 != 5) {
            throw H.b();
        }
        do {
            list.add(Float.valueOf(((AbstractC0288m) this.f5493d).l()));
            if (((AbstractC0288m) this.f5493d).c()) {
                return;
            } else {
                iU = ((AbstractC0288m) this.f5493d).u();
            }
        } while (iU == this.f5490a);
        this.f5492c = iU;
    }

    public final void p(List list) throws H {
        int iU;
        if (list instanceof D) {
            int i6 = this.f5490a & 7;
            if (i6 == 0) {
                ((AbstractC0288m) this.f5493d).m();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            ((AbstractC0288m) this.f5493d).v();
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).m();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).m()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iB = ((AbstractC0288m) this.f5493d).b() + ((AbstractC0288m) this.f5493d).v();
        do {
            list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).m()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
        y(iB);
    }

    public final void q(List list) throws H {
        int iU;
        if (list instanceof O) {
            int i6 = this.f5490a & 7;
            if (i6 == 0) {
                ((AbstractC0288m) this.f5493d).n();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            ((AbstractC0288m) this.f5493d).v();
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).n();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(((AbstractC0288m) this.f5493d).n()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iB = ((AbstractC0288m) this.f5493d).b() + ((AbstractC0288m) this.f5493d).v();
        do {
            list.add(Long.valueOf(((AbstractC0288m) this.f5493d).n()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
        y(iB);
    }

    public final void r(List list) throws H {
        int iU;
        if (list instanceof D) {
            int i6 = this.f5490a & 7;
            if (i6 != 2) {
                if (i6 != 5) {
                    throw H.b();
                }
                ((AbstractC0288m) this.f5493d).o();
                throw null;
            }
            B(((AbstractC0288m) this.f5493d).v());
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).o();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 2) {
            int iV = ((AbstractC0288m) this.f5493d).v();
            B(iV);
            int iB = ((AbstractC0288m) this.f5493d).b() + iV;
            do {
                list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).o()));
            } while (((AbstractC0288m) this.f5493d).b() < iB);
            return;
        }
        if (i7 != 5) {
            throw H.b();
        }
        do {
            list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).o()));
            if (((AbstractC0288m) this.f5493d).c()) {
                return;
            } else {
                iU = ((AbstractC0288m) this.f5493d).u();
            }
        } while (iU == this.f5490a);
        this.f5492c = iU;
    }

    public final void s(List list) throws H {
        int iU;
        if (list instanceof O) {
            int i6 = this.f5490a & 7;
            if (i6 == 1) {
                ((AbstractC0288m) this.f5493d).p();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            C(((AbstractC0288m) this.f5493d).v());
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).p();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 1) {
            do {
                list.add(Long.valueOf(((AbstractC0288m) this.f5493d).p()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iV = ((AbstractC0288m) this.f5493d).v();
        C(iV);
        int iB = ((AbstractC0288m) this.f5493d).b() + iV;
        do {
            list.add(Long.valueOf(((AbstractC0288m) this.f5493d).p()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
    }

    public final void t(List list) throws H {
        int iU;
        if (list instanceof D) {
            int i6 = this.f5490a & 7;
            if (i6 == 0) {
                ((AbstractC0288m) this.f5493d).q();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            ((AbstractC0288m) this.f5493d).v();
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).q();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).q()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iB = ((AbstractC0288m) this.f5493d).b() + ((AbstractC0288m) this.f5493d).v();
        do {
            list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).q()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
        y(iB);
    }

    public final void u(List list) throws H {
        int iU;
        if (list instanceof O) {
            int i6 = this.f5490a & 7;
            if (i6 == 0) {
                ((AbstractC0288m) this.f5493d).r();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            ((AbstractC0288m) this.f5493d).v();
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).r();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(((AbstractC0288m) this.f5493d).r()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iB = ((AbstractC0288m) this.f5493d).b() + ((AbstractC0288m) this.f5493d).v();
        do {
            list.add(Long.valueOf(((AbstractC0288m) this.f5493d).r()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
        y(iB);
    }

    public final void v(List list, boolean z5) throws G {
        String strS;
        int iU;
        int iU2;
        if ((this.f5490a & 7) != 2) {
            throw H.b();
        }
        if ((list instanceof K) && !z5) {
            K k5 = (K) list;
            do {
                k5.k(h());
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU2 = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU2 == this.f5490a);
            this.f5492c = iU2;
            return;
        }
        do {
            if (z5) {
                z(2);
                strS = ((AbstractC0288m) this.f5493d).t();
            } else {
                z(2);
                strS = ((AbstractC0288m) this.f5493d).s();
            }
            list.add(strS);
            if (((AbstractC0288m) this.f5493d).c()) {
                return;
            } else {
                iU = ((AbstractC0288m) this.f5493d).u();
            }
        } while (iU == this.f5490a);
        this.f5492c = iU;
    }

    public final void w(List list) throws H {
        int iU;
        if (list instanceof D) {
            int i6 = this.f5490a & 7;
            if (i6 == 0) {
                ((AbstractC0288m) this.f5493d).v();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            ((AbstractC0288m) this.f5493d).v();
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).v();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).v()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iB = ((AbstractC0288m) this.f5493d).b() + ((AbstractC0288m) this.f5493d).v();
        do {
            list.add(Integer.valueOf(((AbstractC0288m) this.f5493d).v()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
        y(iB);
    }

    public final void x(List list) throws H {
        int iU;
        if (list instanceof O) {
            int i6 = this.f5490a & 7;
            if (i6 == 0) {
                ((AbstractC0288m) this.f5493d).w();
                throw null;
            }
            if (i6 != 2) {
                throw H.b();
            }
            ((AbstractC0288m) this.f5493d).v();
            ((AbstractC0288m) this.f5493d).getClass();
            ((AbstractC0288m) this.f5493d).w();
            throw null;
        }
        int i7 = this.f5490a & 7;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(((AbstractC0288m) this.f5493d).w()));
                if (((AbstractC0288m) this.f5493d).c()) {
                    return;
                } else {
                    iU = ((AbstractC0288m) this.f5493d).u();
                }
            } while (iU == this.f5490a);
            this.f5492c = iU;
            return;
        }
        if (i7 != 2) {
            throw H.b();
        }
        int iB = ((AbstractC0288m) this.f5493d).b() + ((AbstractC0288m) this.f5493d).v();
        do {
            list.add(Long.valueOf(((AbstractC0288m) this.f5493d).w()));
        } while (((AbstractC0288m) this.f5493d).b() < iB);
        y(iB);
    }

    public final void y(int i6) throws H {
        if (((AbstractC0288m) this.f5493d).b() != i6) {
            throw H.e();
        }
    }

    public final void z(int i6) throws G {
        if ((this.f5490a & 7) != i6) {
            throw H.b();
        }
    }
}
