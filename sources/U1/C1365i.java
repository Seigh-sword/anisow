package u1;

import C1.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.m;
import com.bumptech.glide.o;
import i1.C0828b;
import i1.C0829c;
import i1.C0831e;
import i1.InterfaceC0827a;
import j1.q;
import java.util.ArrayList;
import l1.p;
import m1.InterfaceC1006d;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: u1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1365i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0827a f12845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f12846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f12848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1006d f12849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f12852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1362f f12853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1362f f12855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f12856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1362f f12857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12860p;

    public C1365i(com.bumptech.glide.b bVar, C0831e c0831e, int i6, int i7, r1.d dVar, Bitmap bitmap) {
        InterfaceC1006d interfaceC1006d = bVar.f6296w;
        com.bumptech.glide.f fVar = bVar.f6298y;
        Context baseContext = fVar.getBaseContext();
        AbstractC1332d.l(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        o oVarC = com.bumptech.glide.b.a(baseContext).f6293A.c(baseContext);
        Context baseContext2 = fVar.getBaseContext();
        AbstractC1332d.l(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m mVarB = com.bumptech.glide.b.a(baseContext2).f6293A.c(baseContext2).m().a(((y1.f) ((y1.f) ((y1.f) new y1.f().i(p.f9960a)).z()).w()).r(i6, i7));
        this.f12847c = new ArrayList();
        this.f12848d = oVarC;
        Handler handler = new Handler(Looper.getMainLooper(), new C1364h(0, this));
        this.f12849e = interfaceC1006d;
        this.f12846b = handler;
        this.f12852h = mVarB;
        this.f12845a = c0831e;
        c(dVar, bitmap);
    }

    public final void a() {
        int i6;
        if (!this.f12850f || this.f12851g) {
            return;
        }
        C1362f c1362f = this.f12857m;
        if (c1362f != null) {
            this.f12857m = null;
            b(c1362f);
            return;
        }
        this.f12851g = true;
        InterfaceC0827a interfaceC0827a = this.f12845a;
        C0831e c0831e = (C0831e) interfaceC0827a;
        C0829c c0829c = c0831e.f9398l;
        int i7 = c0829c.f9374c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i7 <= 0 || (i6 = c0831e.f9397k) < 0) ? 0 : (i6 < 0 || i6 >= i7) ? -1 : ((C0828b) c0829c.f9376e.get(i6)).f9369i));
        int i8 = (c0831e.f9397k + 1) % c0831e.f9398l.f9374c;
        c0831e.f9397k = i8;
        this.f12855k = new C1362f(this.f12846b, i8, jUptimeMillis);
        m mVarH = this.f12852h.a((y1.f) new y1.f().v(new B1.b(Double.valueOf(Math.random())))).H(interfaceC0827a);
        mVarH.F(this.f12855k, mVarH);
    }

    public final void b(C1362f c1362f) {
        this.f12851g = false;
        boolean z5 = this.f12854j;
        Handler handler = this.f12846b;
        if (z5) {
            handler.obtainMessage(2, c1362f).sendToTarget();
            return;
        }
        if (!this.f12850f) {
            this.f12857m = c1362f;
            return;
        }
        if (c1362f.f12838C != null) {
            Bitmap bitmap = this.f12856l;
            if (bitmap != null) {
                this.f12849e.d(bitmap);
                this.f12856l = null;
            }
            C1362f c1362f2 = this.f12853i;
            this.f12853i = c1362f;
            ArrayList arrayList = this.f12847c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1360d c1360d = (C1360d) ((InterfaceC1363g) arrayList.get(size));
                Object callback = c1360d.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c1360d.stop();
                    c1360d.invalidateSelf();
                } else {
                    c1360d.invalidateSelf();
                    C1362f c1362f3 = c1360d.f12831w.f12824a.f12853i;
                    if ((c1362f3 != null ? c1362f3.f12836A : -1) == ((C0831e) r5.f12845a).f9398l.f9374c - 1) {
                        c1360d.f12826B++;
                    }
                    int i6 = c1360d.f12827C;
                    if (i6 != -1 && c1360d.f12826B >= i6) {
                        c1360d.stop();
                    }
                }
            }
            if (c1362f2 != null) {
                handler.obtainMessage(2, c1362f2).sendToTarget();
            }
        }
        a();
    }

    public final void c(q qVar, Bitmap bitmap) {
        AbstractC1332d.l(qVar, "Argument must not be null");
        AbstractC1332d.l(bitmap, "Argument must not be null");
        this.f12856l = bitmap;
        this.f12852h = this.f12852h.a(new y1.f().x(qVar, true));
        this.f12858n = n.c(bitmap);
        this.f12859o = bitmap.getWidth();
        this.f12860p = bitmap.getHeight();
    }
}
