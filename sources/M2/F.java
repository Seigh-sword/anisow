package m2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Long f10566A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Long f10567B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f10568C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f10569D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f10570E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f10571F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f10572G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f10573H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public byte[] f10574I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f10575J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f10576K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10577L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f10578M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f10579N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f10580O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f10581P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f10582Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f10583R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f10584S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1051k0 f10585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f10596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f10601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f10602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f10603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f10604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f10605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f10607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f10608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10609y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10610z;

    public F(C1051k0 c1051k0, String str) {
        AbstractC1332d.m(c1051k0);
        AbstractC1332d.g(str);
        this.f10585a = c1051k0;
        this.f10586b = str;
        C1042h0 c1042h0 = c1051k0.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
    }

    public final void A(String str) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= !Objects.equals(this.f10590f, str);
        this.f10590f = str;
    }

    public final void B(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10579N != j6;
        this.f10579N = j6;
    }

    public final void C(String str) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10582Q |= !Objects.equals(this.f10588d, str);
        this.f10588d = str;
    }

    public final void D(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10577L != j6;
        this.f10577L = j6;
    }

    public final void E(String str) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= !Objects.equals(this.f10581P, str);
        this.f10581P = str;
    }

    public final void F(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10576K != j6;
        this.f10576K = j6;
    }

    public final void G(String str) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= !Objects.equals(this.f10589e, str);
        this.f10589e = str;
    }

    public final void H(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10580O != j6;
        this.f10580O = j6;
    }

    public final void I(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10575J != j6;
        this.f10575J = j6;
    }

    public final void J(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10598n != j6;
        this.f10598n = j6;
    }

    public final void K(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10603s != j6;
        this.f10603s = j6;
    }

    public final void L(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10584S != j6;
        this.f10584S = j6;
    }

    public final void M(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10597m != j6;
        this.f10597m = j6;
    }

    public final long N() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10603s;
    }

    public final void O(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10572G != j6;
        this.f10572G = j6;
    }

    public final void P(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10593i != j6;
        this.f10593i = j6;
    }

    public final void Q(long j6) {
        AbstractC1332d.c(j6 >= 0);
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10591g != j6;
        this.f10591g = j6;
    }

    public final void R(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10592h != j6;
        this.f10592h = j6;
    }

    public final void S(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10608x != j6;
        this.f10608x = j6;
    }

    public final void T(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10607w != j6;
        this.f10607w = j6;
    }

    public final Boolean U() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10602r;
    }

    public final void a(long j6) {
        C1051k0 c1051k0 = this.f10585a;
        C1042h0 c1042h0 = c1051k0.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        long j7 = this.f10591g + j6;
        N n5 = c1051k0.f10983E;
        String str = this.f10586b;
        if (j7 > 2147483647L) {
            C1051k0.i(n5);
            n5.f10718E.c(N.x(str), "Bundle index overflow. appId");
            j7 = j6 - 1;
        }
        long j8 = this.f10572G + 1;
        if (j8 > 2147483647L) {
            C1051k0.i(n5);
            n5.f10718E.c(N.x(str), "Delivery index overflow. appId");
            j8 = 0;
        }
        this.f10582Q = true;
        this.f10591g = j7;
        this.f10572G = j8;
    }

    public final void b(String str) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10582Q |= !Objects.equals(this.f10601q, str);
        this.f10601q = str;
    }

    public final void c(List list) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        if (Objects.equals(this.f10604t, list)) {
            return;
        }
        this.f10582Q = true;
        this.f10604t = list != null ? new ArrayList(list) : null;
    }

    public final String d() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10601q;
    }

    public final String e() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        String str = this.f10581P;
        E(null);
        return str;
    }

    public final String f() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10586b;
    }

    public final String g() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10587c;
    }

    public final String h() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10594j;
    }

    public final String i() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10590f;
    }

    public final String j() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10588d;
    }

    public final String k() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10573H;
    }

    public final String l() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10569D;
    }

    public final void m() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q = false;
    }

    public final boolean n() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10582Q;
    }

    public final boolean o() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10606v;
    }

    public final void p(int i6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10571F != i6;
        this.f10571F = i6;
    }

    public final void q(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10595k != j6;
        this.f10595k = j6;
    }

    public final void r(String str) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= !Objects.equals(this.f10587c, str);
        this.f10587c = str;
    }

    public final void s(boolean z5) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10599o != z5;
        this.f10599o = z5;
    }

    public final void t(int i6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10570E != i6;
        this.f10570E = i6;
    }

    public final void u(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10568C != j6;
        this.f10568C = j6;
    }

    public final void v(String str) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= !Objects.equals(this.f10596l, str);
        this.f10596l = str;
    }

    public final void w(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10583R != j6;
        this.f10583R = j6;
    }

    public final void x(String str) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= !Objects.equals(this.f10594j, str);
        this.f10594j = str;
    }

    public final long y() {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        return this.f10595k;
    }

    public final void z(long j6) {
        C1042h0 c1042h0 = this.f10585a.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        this.f10582Q |= this.f10578M != j6;
        this.f10578M = j6;
    }
}
