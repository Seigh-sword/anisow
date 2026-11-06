package y1;

import C1.n;
import I0.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import i.r;
import j1.EnumC0843a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l1.C0922A;
import l1.F;
import l1.k;
import l1.q;
import l1.u;
import s4.AbstractC1305a;
import z1.InterfaceC1529d;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c, InterfaceC1529d, g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final boolean f13750D = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13751A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RuntimeException f13752B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f13753C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D1.e f13755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f13757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f13758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f13759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.f f13760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f13762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC1497a f13763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.g f13766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1.e f13767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f13768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f13769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Executor f13770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public F f13771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f13772s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13773t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile q f13774u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f13775v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f13776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f13777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13778y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13779z;

    public h(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class cls, AbstractC1497a abstractC1497a, int i6, int i7, com.bumptech.glide.g gVar, z1.e eVar, ArrayList arrayList, d dVar, q qVar, o oVar) {
        r rVar = C1.f.f120a;
        this.f13754a = f13750D ? String.valueOf(hashCode()) : null;
        this.f13755b = new D1.e();
        this.f13756c = obj;
        this.f13759f = context;
        this.f13760g = fVar;
        this.f13761h = obj2;
        this.f13762i = cls;
        this.f13763j = abstractC1497a;
        this.f13764k = i6;
        this.f13765l = i7;
        this.f13766m = gVar;
        this.f13767n = eVar;
        this.f13757d = null;
        this.f13768o = arrayList;
        this.f13758e = dVar;
        this.f13774u = qVar;
        this.f13769p = oVar;
        this.f13770q = rVar;
        this.f13753C = 1;
        if (this.f13752B == null && fVar.f6338h.f1097a.containsKey(com.bumptech.glide.d.class)) {
            this.f13752B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // y1.c
    public final boolean a() {
        boolean z5;
        synchronized (this.f13756c) {
            z5 = this.f13753C == 4;
        }
        return z5;
    }

    public final void b() {
        if (this.f13751A) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f13755b.a();
        this.f13767n.k(this);
        k kVar = this.f13772s;
        if (kVar != null) {
            synchronized (((q) kVar.f9918c)) {
                ((u) kVar.f9916a).h((g) kVar.f9917b);
            }
            this.f13772s = null;
        }
    }

    public final Drawable c() {
        int i6;
        if (this.f13776w == null) {
            AbstractC1497a abstractC1497a = this.f13763j;
            Drawable drawable = abstractC1497a.f13720C;
            this.f13776w = drawable;
            if (drawable == null && (i6 = abstractC1497a.f13721D) > 0) {
                Resources.Theme theme = abstractC1497a.f13734Q;
                Context context = this.f13759f;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f13776w = com.bumptech.glide.d.n(context, context, i6, theme);
            }
        }
        return this.f13776w;
    }

    @Override // y1.c
    public final void clear() {
        synchronized (this.f13756c) {
            try {
                if (this.f13751A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f13755b.a();
                if (this.f13753C == 6) {
                    return;
                }
                b();
                F f6 = this.f13771r;
                if (f6 != null) {
                    this.f13771r = null;
                } else {
                    f6 = null;
                }
                d dVar = this.f13758e;
                if (dVar == null || dVar.k(this)) {
                    this.f13767n.g(c());
                }
                this.f13753C = 6;
                if (f6 != null) {
                    this.f13774u.getClass();
                    q.f(f6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        d dVar = this.f13758e;
        return dVar == null || !dVar.b().a();
    }

    @Override // y1.c
    public final void e() {
        synchronized (this.f13756c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.c
    public final void f() {
        d dVar;
        int i6;
        synchronized (this.f13756c) {
            try {
                if (this.f13751A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f13755b.a();
                int i7 = C1.h.f123b;
                this.f13773t = SystemClock.elapsedRealtimeNanos();
                if (this.f13761h == null) {
                    if (n.j(this.f13764k, this.f13765l)) {
                        this.f13778y = this.f13764k;
                        this.f13779z = this.f13765l;
                    }
                    if (this.f13777x == null) {
                        AbstractC1497a abstractC1497a = this.f13763j;
                        Drawable drawable = abstractC1497a.f13728K;
                        this.f13777x = drawable;
                        if (drawable == null && (i6 = abstractC1497a.f13729L) > 0) {
                            Resources.Theme theme = abstractC1497a.f13734Q;
                            Context context = this.f13759f;
                            if (theme == null) {
                                theme = context.getTheme();
                            }
                            this.f13777x = com.bumptech.glide.d.n(context, context, i6, theme);
                        }
                    }
                    h(new C0922A("Received null model"), this.f13777x == null ? 5 : 3);
                    return;
                }
                int i8 = this.f13753C;
                if (i8 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i8 == 4) {
                    k(this.f13771r, EnumC0843a.f9422A, false);
                    return;
                }
                List<e> list = this.f13768o;
                if (list != null) {
                    for (e eVar : list) {
                    }
                }
                this.f13753C = 3;
                if (n.j(this.f13764k, this.f13765l)) {
                    n(this.f13764k, this.f13765l);
                } else {
                    this.f13767n.a(this);
                }
                int i9 = this.f13753C;
                if ((i9 == 2 || i9 == 3) && ((dVar = this.f13758e) == null || dVar.h(this))) {
                    this.f13767n.c(c());
                }
                if (f13750D) {
                    g("finished run method in " + C1.h.a(this.f13773t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str) {
        Log.v("GlideRequest", str + " this: " + this.f13754a);
    }

    public final void h(C0922A c0922a, int i6) {
        int i7;
        int i8;
        this.f13755b.a();
        synchronized (this.f13756c) {
            try {
                c0922a.getClass();
                int i9 = this.f13760g.f6339i;
                if (i9 <= i6) {
                    Log.w("Glide", "Load failed for [" + this.f13761h + "] with dimensions [" + this.f13778y + "x" + this.f13779z + "]", c0922a);
                    if (i9 <= 4) {
                        c0922a.e();
                    }
                }
                Drawable drawableC = null;
                this.f13772s = null;
                this.f13753C = 5;
                d dVar = this.f13758e;
                if (dVar != null) {
                    dVar.c(this);
                }
                this.f13751A = true;
                try {
                    List<e> list = this.f13768o;
                    if (list != null) {
                        for (e eVar : list) {
                            z1.e eVar2 = this.f13767n;
                            d();
                            switch (((W0.k) eVar).f4209a) {
                                case com.bumptech.glide.d.f6312l /* 0 */:
                                    AbstractC1305a.o(eVar2, "target");
                                    break;
                                default:
                                    AbstractC1305a.o(eVar2, "target");
                                    break;
                            }
                        }
                    }
                    e eVar3 = this.f13757d;
                    if (eVar3 != null) {
                        z1.e eVar4 = this.f13767n;
                        d();
                        switch (((W0.k) eVar3).f4209a) {
                            case com.bumptech.glide.d.f6312l /* 0 */:
                                AbstractC1305a.o(eVar4, "target");
                                break;
                            default:
                                AbstractC1305a.o(eVar4, "target");
                                break;
                        }
                    }
                    d dVar2 = this.f13758e;
                    if (dVar2 == null || dVar2.h(this)) {
                        if (this.f13761h == null) {
                            if (this.f13777x == null) {
                                AbstractC1497a abstractC1497a = this.f13763j;
                                Drawable drawable = abstractC1497a.f13728K;
                                this.f13777x = drawable;
                                if (drawable == null && (i8 = abstractC1497a.f13729L) > 0) {
                                    Resources.Theme theme = abstractC1497a.f13734Q;
                                    Context context = this.f13759f;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.f13777x = com.bumptech.glide.d.n(context, context, i8, theme);
                                }
                            }
                            drawableC = this.f13777x;
                        }
                        if (drawableC == null) {
                            if (this.f13775v == null) {
                                AbstractC1497a abstractC1497a2 = this.f13763j;
                                Drawable drawable2 = abstractC1497a2.f13718A;
                                this.f13775v = drawable2;
                                if (drawable2 == null && (i7 = abstractC1497a2.f13719B) > 0) {
                                    Resources.Theme theme2 = abstractC1497a2.f13734Q;
                                    Context context2 = this.f13759f;
                                    if (theme2 == null) {
                                        theme2 = context2.getTheme();
                                    }
                                    this.f13775v = com.bumptech.glide.d.n(context2, context2, i7, theme2);
                                }
                            }
                            drawableC = this.f13775v;
                        }
                        if (drawableC == null) {
                            drawableC = c();
                        }
                        this.f13767n.d(drawableC);
                    }
                    this.f13751A = false;
                } catch (Throwable th) {
                    this.f13751A = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y1.c
    public final boolean i() {
        boolean z5;
        synchronized (this.f13756c) {
            z5 = this.f13753C == 4;
        }
        return z5;
    }

    @Override // y1.c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f13756c) {
            int i6 = this.f13753C;
            z5 = i6 == 2 || i6 == 3;
        }
        return z5;
    }

    @Override // y1.c
    public final boolean j() {
        boolean z5;
        synchronized (this.f13756c) {
            z5 = this.f13753C == 6;
        }
        return z5;
    }

    public final void k(F f6, EnumC0843a enumC0843a, boolean z5) {
        this.f13755b.a();
        F f7 = null;
        try {
            synchronized (this.f13756c) {
                try {
                    this.f13772s = null;
                    if (f6 == null) {
                        h(new C0922A("Expected to receive a Resource<R> with an object of " + this.f13762i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object objA = f6.a();
                    try {
                        if (objA != null && this.f13762i.isAssignableFrom(objA.getClass())) {
                            d dVar = this.f13758e;
                            if (dVar == null || dVar.d(this)) {
                                m(f6, objA, enumC0843a);
                                return;
                            }
                            this.f13771r = null;
                            this.f13753C = 4;
                            this.f13774u.getClass();
                            q.f(f6);
                            return;
                        }
                        this.f13771r = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f13762i);
                        sb.append(" but instead got ");
                        sb.append(objA != null ? objA.getClass() : "");
                        sb.append("{");
                        sb.append(objA);
                        sb.append("} inside Resource{");
                        sb.append(f6);
                        sb.append("}.");
                        sb.append(objA != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        h(new C0922A(sb.toString()), 5);
                        this.f13774u.getClass();
                        q.f(f6);
                    } catch (Throwable th) {
                        f7 = f6;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (f7 != null) {
                this.f13774u.getClass();
                q.f(f7);
            }
            throw th3;
        }
    }

    @Override // y1.c
    public final boolean l(c cVar) {
        int i6;
        int i7;
        Object obj;
        Class cls;
        AbstractC1497a abstractC1497a;
        com.bumptech.glide.g gVar;
        int size;
        int i8;
        int i9;
        Object obj2;
        Class cls2;
        AbstractC1497a abstractC1497a2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f13756c) {
            try {
                i6 = this.f13764k;
                i7 = this.f13765l;
                obj = this.f13761h;
                cls = this.f13762i;
                abstractC1497a = this.f13763j;
                gVar = this.f13766m;
                List list = this.f13768o;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        h hVar = (h) cVar;
        synchronized (hVar.f13756c) {
            try {
                i8 = hVar.f13764k;
                i9 = hVar.f13765l;
                obj2 = hVar.f13761h;
                cls2 = hVar.f13762i;
                abstractC1497a2 = hVar.f13763j;
                gVar2 = hVar.f13766m;
                List list2 = hVar.f13768o;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i6 == i8 && i7 == i9) {
            char[] cArr = n.f134a;
            if (obj != null ? obj.equals(obj2) : obj2 == null) {
                if (cls.equals(cls2) && (abstractC1497a != null ? abstractC1497a.k(abstractC1497a2) : abstractC1497a2 == null) && gVar == gVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m(F f6, Object obj, EnumC0843a enumC0843a) {
        d();
        this.f13753C = 4;
        this.f13771r = f6;
        int i6 = this.f13760g.f6339i;
        Object obj2 = this.f13761h;
        if (i6 <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + enumC0843a + " for " + obj2 + " with size [" + this.f13778y + "x" + this.f13779z + "] in " + C1.h.a(this.f13773t) + " ms");
        }
        d dVar = this.f13758e;
        if (dVar != null) {
            dVar.g(this);
        }
        this.f13751A = true;
        try {
            List list = this.f13768o;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    W0.k kVar = (W0.k) ((e) it.next());
                    switch (kVar.f4209a) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            kVar.a((Drawable) obj, obj2, enumC0843a);
                            break;
                        default:
                            kVar.a((Drawable) obj, obj2, enumC0843a);
                            break;
                    }
                }
            }
            e eVar = this.f13757d;
            if (eVar != null) {
                W0.k kVar2 = (W0.k) eVar;
                switch (kVar2.f4209a) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        kVar2.a((Drawable) obj, obj2, enumC0843a);
                        break;
                    default:
                        kVar2.a((Drawable) obj, obj2, enumC0843a);
                        break;
                }
            }
            this.f13769p.getClass();
            this.f13767n.h(obj);
            this.f13751A = false;
        } catch (Throwable th) {
            this.f13751A = false;
            throw th;
        }
    }

    public final void n(int i6, int i7) {
        Object obj;
        int iRound = i6;
        this.f13755b.a();
        Object obj2 = this.f13756c;
        synchronized (obj2) {
            try {
                try {
                    boolean z5 = f13750D;
                    if (z5) {
                        g("Got onSizeReady in " + C1.h.a(this.f13773t));
                    }
                    if (this.f13753C == 3) {
                        this.f13753C = 2;
                        float f6 = this.f13763j.f13741x;
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * f6);
                        }
                        this.f13778y = iRound;
                        this.f13779z = i7 == Integer.MIN_VALUE ? i7 : Math.round(f6 * i7);
                        if (z5) {
                            g("finished setup for calling load in " + C1.h.a(this.f13773t));
                        }
                        q qVar = this.f13774u;
                        com.bumptech.glide.f fVar = this.f13760g;
                        Object obj3 = this.f13761h;
                        AbstractC1497a abstractC1497a = this.f13763j;
                        try {
                            obj = obj2;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                        }
                        try {
                            this.f13772s = qVar.a(fVar, obj3, abstractC1497a.f13725H, this.f13778y, this.f13779z, abstractC1497a.f13732O, this.f13762i, this.f13766m, abstractC1497a.f13742y, abstractC1497a.f13731N, abstractC1497a.f13726I, abstractC1497a.f13738U, abstractC1497a.f13730M, abstractC1497a.f13722E, abstractC1497a.f13736S, abstractC1497a.f13739V, abstractC1497a.f13737T, this, this.f13770q);
                            if (this.f13753C != 2) {
                                this.f13772s = null;
                            }
                            if (z5) {
                                g("finished onSizeReady in " + C1.h.a(this.f13773t));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f13756c) {
            obj = this.f13761h;
            cls = this.f13762i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
