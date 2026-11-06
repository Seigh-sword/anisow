package y1;

import C1.n;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j1.l;
import j1.m;
import j1.q;
import l1.o;
import l1.p;
import s1.AbstractC1296e;
import s1.C1299h;
import s1.C1300i;
import s1.u;
import s1.w;
import t0.AbstractC1332d;
import u1.C1360d;
import u1.C1361e;

/* JADX INFO: renamed from: y1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1497a implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f13718A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f13719B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f13720C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13721D;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f13726I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Drawable f13728K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f13729L;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f13733P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Resources.Theme f13734Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f13735R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f13736S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f13737T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f13739V;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13741x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p f13742y = p.f9962c;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.bumptech.glide.g f13743z = com.bumptech.glide.g.f6344y;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f13722E = true;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f13723F = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f13724G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public j1.i f13725H = B1.a.f77b;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f13727J = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public m f13730M = new m();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C1.c f13731N = new C1.c();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Class f13732O = Object.class;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f13738U = true;

    public static boolean l(int i6, int i7) {
        return (i6 & i7) != 0;
    }

    public AbstractC1497a a(AbstractC1497a abstractC1497a) {
        if (this.f13735R) {
            return clone().a(abstractC1497a);
        }
        if (l(abstractC1497a.f13740w, 2)) {
            this.f13741x = abstractC1497a.f13741x;
        }
        if (l(abstractC1497a.f13740w, 262144)) {
            this.f13736S = abstractC1497a.f13736S;
        }
        if (l(abstractC1497a.f13740w, 1048576)) {
            this.f13739V = abstractC1497a.f13739V;
        }
        if (l(abstractC1497a.f13740w, 4)) {
            this.f13742y = abstractC1497a.f13742y;
        }
        if (l(abstractC1497a.f13740w, 8)) {
            this.f13743z = abstractC1497a.f13743z;
        }
        if (l(abstractC1497a.f13740w, 16)) {
            this.f13718A = abstractC1497a.f13718A;
            this.f13719B = 0;
            this.f13740w &= -33;
        }
        if (l(abstractC1497a.f13740w, 32)) {
            this.f13719B = abstractC1497a.f13719B;
            this.f13718A = null;
            this.f13740w &= -17;
        }
        if (l(abstractC1497a.f13740w, 64)) {
            this.f13720C = abstractC1497a.f13720C;
            this.f13721D = 0;
            this.f13740w &= -129;
        }
        if (l(abstractC1497a.f13740w, 128)) {
            this.f13721D = abstractC1497a.f13721D;
            this.f13720C = null;
            this.f13740w &= -65;
        }
        if (l(abstractC1497a.f13740w, 256)) {
            this.f13722E = abstractC1497a.f13722E;
        }
        if (l(abstractC1497a.f13740w, 512)) {
            this.f13724G = abstractC1497a.f13724G;
            this.f13723F = abstractC1497a.f13723F;
        }
        if (l(abstractC1497a.f13740w, 1024)) {
            this.f13725H = abstractC1497a.f13725H;
        }
        if (l(abstractC1497a.f13740w, 4096)) {
            this.f13732O = abstractC1497a.f13732O;
        }
        if (l(abstractC1497a.f13740w, 8192)) {
            this.f13728K = abstractC1497a.f13728K;
            this.f13729L = 0;
            this.f13740w &= -16385;
        }
        if (l(abstractC1497a.f13740w, 16384)) {
            this.f13729L = abstractC1497a.f13729L;
            this.f13728K = null;
            this.f13740w &= -8193;
        }
        if (l(abstractC1497a.f13740w, 32768)) {
            this.f13734Q = abstractC1497a.f13734Q;
        }
        if (l(abstractC1497a.f13740w, 65536)) {
            this.f13727J = abstractC1497a.f13727J;
        }
        if (l(abstractC1497a.f13740w, 131072)) {
            this.f13726I = abstractC1497a.f13726I;
        }
        if (l(abstractC1497a.f13740w, 2048)) {
            this.f13731N.putAll(abstractC1497a.f13731N);
            this.f13738U = abstractC1497a.f13738U;
        }
        if (l(abstractC1497a.f13740w, 524288)) {
            this.f13737T = abstractC1497a.f13737T;
        }
        if (!this.f13727J) {
            this.f13731N.clear();
            int i6 = this.f13740w;
            this.f13726I = false;
            this.f13740w = i6 & (-133121);
            this.f13738U = true;
        }
        this.f13740w |= abstractC1497a.f13740w;
        this.f13730M.f9442b.i(abstractC1497a.f13730M.f9442b);
        t();
        return this;
    }

    public AbstractC1497a d() {
        if (this.f13733P && !this.f13735R) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f13735R = true;
        return m();
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC1497a clone() {
        try {
            AbstractC1497a abstractC1497a = (AbstractC1497a) super.clone();
            m mVar = new m();
            abstractC1497a.f13730M = mVar;
            mVar.f9442b.i(this.f13730M.f9442b);
            C1.c cVar = new C1.c();
            abstractC1497a.f13731N = cVar;
            cVar.putAll(this.f13731N);
            abstractC1497a.f13733P = false;
            abstractC1497a.f13735R = false;
            return abstractC1497a;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC1497a) {
            return k((AbstractC1497a) obj);
        }
        return false;
    }

    public AbstractC1497a f(Class cls) {
        if (this.f13735R) {
            return clone().f(cls);
        }
        this.f13732O = cls;
        this.f13740w |= 4096;
        t();
        return this;
    }

    public int hashCode() {
        float f6 = this.f13741x;
        char[] cArr = n.f134a;
        return n.h(n.h(n.h(n.h(n.h(n.h(n.h(n.i(n.i(n.i(n.i(n.g(this.f13724G, n.g(this.f13723F, n.i(n.h(n.g(this.f13729L, n.h(n.g(this.f13721D, n.h(n.g(this.f13719B, n.g(Float.floatToIntBits(f6), 17)), this.f13718A)), this.f13720C)), this.f13728K), this.f13722E))), this.f13726I), this.f13727J), this.f13736S), this.f13737T), this.f13742y), this.f13743z), this.f13730M), this.f13731N), this.f13732O), this.f13725H), this.f13734Q);
    }

    public AbstractC1497a i(o oVar) {
        if (this.f13735R) {
            return clone().i(oVar);
        }
        this.f13742y = oVar;
        this.f13740w |= 4;
        t();
        return this;
    }

    public AbstractC1497a j(s1.n nVar) {
        return u(s1.o.f12584f, nVar);
    }

    public final boolean k(AbstractC1497a abstractC1497a) {
        return Float.compare(abstractC1497a.f13741x, this.f13741x) == 0 && this.f13719B == abstractC1497a.f13719B && n.b(this.f13718A, abstractC1497a.f13718A) && this.f13721D == abstractC1497a.f13721D && n.b(this.f13720C, abstractC1497a.f13720C) && this.f13729L == abstractC1497a.f13729L && n.b(this.f13728K, abstractC1497a.f13728K) && this.f13722E == abstractC1497a.f13722E && this.f13723F == abstractC1497a.f13723F && this.f13724G == abstractC1497a.f13724G && this.f13726I == abstractC1497a.f13726I && this.f13727J == abstractC1497a.f13727J && this.f13736S == abstractC1497a.f13736S && this.f13737T == abstractC1497a.f13737T && this.f13742y.equals(abstractC1497a.f13742y) && this.f13743z == abstractC1497a.f13743z && this.f13730M.equals(abstractC1497a.f13730M) && this.f13731N.equals(abstractC1497a.f13731N) && this.f13732O.equals(abstractC1497a.f13732O) && n.b(this.f13725H, abstractC1497a.f13725H) && n.b(this.f13734Q, abstractC1497a.f13734Q);
    }

    public AbstractC1497a m() {
        this.f13733P = true;
        return this;
    }

    public AbstractC1497a n() {
        return q(s1.o.f12581c, new C1299h(0));
    }

    public AbstractC1497a o() {
        AbstractC1497a abstractC1497aQ = q(s1.o.f12580b, new C1300i(0));
        abstractC1497aQ.f13738U = true;
        return abstractC1497aQ;
    }

    public AbstractC1497a p() {
        AbstractC1497a abstractC1497aQ = q(s1.o.f12579a, new w(0));
        abstractC1497aQ.f13738U = true;
        return abstractC1497aQ;
    }

    public final AbstractC1497a q(s1.n nVar, AbstractC1296e abstractC1296e) {
        if (this.f13735R) {
            return clone().q(nVar, abstractC1296e);
        }
        j(nVar);
        return x(abstractC1296e, false);
    }

    public AbstractC1497a r(int i6, int i7) {
        if (this.f13735R) {
            return clone().r(i6, i7);
        }
        this.f13724G = i6;
        this.f13723F = i7;
        this.f13740w |= 512;
        t();
        return this;
    }

    public AbstractC1497a s() {
        com.bumptech.glide.g gVar = com.bumptech.glide.g.f6345z;
        if (this.f13735R) {
            return clone().s();
        }
        this.f13743z = gVar;
        this.f13740w |= 8;
        t();
        return this;
    }

    public final void t() {
        if (this.f13733P) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public AbstractC1497a u(l lVar, s1.n nVar) {
        if (this.f13735R) {
            return clone().u(lVar, nVar);
        }
        AbstractC1332d.k(lVar);
        this.f13730M.f9442b.put(lVar, nVar);
        t();
        return this;
    }

    public AbstractC1497a v(B1.b bVar) {
        if (this.f13735R) {
            return clone().v(bVar);
        }
        this.f13725H = bVar;
        this.f13740w |= 1024;
        t();
        return this;
    }

    public AbstractC1497a w() {
        if (this.f13735R) {
            return clone().w();
        }
        this.f13722E = false;
        this.f13740w |= 256;
        t();
        return this;
    }

    public final AbstractC1497a x(q qVar, boolean z5) {
        if (this.f13735R) {
            return clone().x(qVar, z5);
        }
        u uVar = new u(qVar, z5);
        y(Bitmap.class, qVar, z5);
        y(Drawable.class, uVar, z5);
        y(BitmapDrawable.class, uVar, z5);
        y(C1360d.class, new C1361e(qVar), z5);
        t();
        return this;
    }

    public final AbstractC1497a y(Class cls, q qVar, boolean z5) {
        if (this.f13735R) {
            return clone().y(cls, qVar, z5);
        }
        AbstractC1332d.k(qVar);
        this.f13731N.put(cls, qVar);
        int i6 = this.f13740w;
        this.f13727J = true;
        this.f13740w = 67584 | i6;
        this.f13738U = false;
        if (z5) {
            this.f13740w = i6 | 198656;
            this.f13726I = true;
        }
        t();
        return this;
    }

    public AbstractC1497a z() {
        if (this.f13735R) {
            return clone().z();
        }
        this.f13739V = true;
        this.f13740w |= 1048576;
        t();
        return this;
    }
}
