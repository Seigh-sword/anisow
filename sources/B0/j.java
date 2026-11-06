package b0;

import F0.C0032t;
import F0.w;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0329a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0333e f5884p = new C0333e(8, "scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0333e f5885q = new C0333e(9, "scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0333e f5886r = new C0333e(10, "rotation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0333e f5887s = new C0333e(11, "rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0333e f5888t = new C0333e(12, "rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0333e f5889u = new C0333e(2, "alpha");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L.i f5894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f5900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f5901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f5902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5904o;

    public j(i iVar) {
        this.f5890a = 0.0f;
        this.f5891b = Float.MAX_VALUE;
        this.f5892c = false;
        this.f5895f = false;
        this.f5896g = Float.MAX_VALUE;
        this.f5897h = -3.4028235E38f;
        this.f5898i = 0L;
        this.f5900k = new ArrayList();
        this.f5901l = new ArrayList();
        this.f5893d = null;
        this.f5894e = new C0334f(iVar);
        this.f5899j = 1.0f;
        this.f5902m = null;
        this.f5903n = Float.MAX_VALUE;
        this.f5904o = false;
    }

    public final void a(float f6) {
        if (this.f5895f) {
            this.f5903n = f6;
            return;
        }
        if (this.f5902m == null) {
            this.f5902m = new k(f6);
        }
        k kVar = this.f5902m;
        double d6 = f6;
        kVar.f5913i = d6;
        double d7 = (float) d6;
        if (d7 > this.f5896g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d7 < this.f5897h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f5899j * 0.75f);
        kVar.f5908d = dAbs;
        kVar.f5909e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z5 = this.f5895f;
        if (z5 || z5) {
            return;
        }
        this.f5895f = true;
        if (!this.f5892c) {
            this.f5891b = this.f5894e.i(this.f5893d);
        }
        float f7 = this.f5891b;
        if (f7 > this.f5896g || f7 < this.f5897h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = C0332d.f5872g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0332d());
        }
        C0332d c0332d = (C0332d) threadLocal.get();
        ArrayList arrayList = c0332d.f5874b;
        if (arrayList.size() == 0) {
            if (c0332d.f5876d == null) {
                c0332d.f5876d = new C0331c(c0332d.f5875c);
            }
            c0332d.f5876d.s();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void b(float f6) {
        ArrayList arrayList;
        this.f5894e.m(this.f5893d, f6);
        int i6 = 0;
        while (true) {
            arrayList = this.f5901l;
            if (i6 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i6) != null) {
                C0032t c0032t = (C0032t) arrayList.get(i6);
                float f7 = this.f5891b;
                w wVar = c0032t.f559g;
                long jMax = Math.max(-1L, Math.min(wVar.f588T + 1, Math.round(f7)));
                wVar.J(jMax, c0032t.f553a);
                c0032t.f553a = jMax;
            }
            i6++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void c() {
        if (this.f5902m.f5906b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f5895f) {
            this.f5904o = true;
        }
    }

    public j(Object obj) {
        float f6;
        K2.f fVar = K2.g.f1558M;
        this.f5890a = 0.0f;
        this.f5891b = Float.MAX_VALUE;
        this.f5892c = false;
        this.f5895f = false;
        this.f5896g = Float.MAX_VALUE;
        this.f5897h = -3.4028235E38f;
        this.f5898i = 0L;
        this.f5900k = new ArrayList();
        this.f5901l = new ArrayList();
        this.f5893d = obj;
        this.f5894e = fVar;
        if (fVar == f5886r || fVar == f5887s || fVar == f5888t) {
            f6 = 0.1f;
        } else {
            if (fVar == f5889u || fVar == f5884p || fVar == f5885q) {
                this.f5899j = 0.00390625f;
                this.f5902m = null;
                this.f5903n = Float.MAX_VALUE;
                this.f5904o = false;
            }
            f6 = 1.0f;
        }
        this.f5899j = f6;
        this.f5902m = null;
        this.f5903n = Float.MAX_VALUE;
        this.f5904o = false;
    }
}
