package L3;

import F.h;
import N.q0;
import N.r0;
import N.s0;
import S.f;
import U1.i;
import android.content.ClipDescription;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.AbstractC0266b;
import androidx.datastore.preferences.protobuf.AbstractC0280i;
import androidx.datastore.preferences.protobuf.AbstractC0292q;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.InterfaceC0283j0;
import com.bumptech.glide.load.data.k;
import d2.AbstractC0651b;
import h0.M;
import i.C0803c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l.C0915h;
import l.RunnableC0914g;
import l.SubMenuC0907G;
import l.ViewOnKeyListenerC0916i;
import l.m;
import l.o;
import l.q;
import l.z;
import m.C0977o;
import m.InterfaceC0958e0;
import m.L0;
import n.AbstractC1141d;
import n1.C1152h;
import p1.C1234C;
import p1.C1236b;
import p1.InterfaceC1235a;
import p1.InterfaceC1237c;
import p1.x;
import p1.y;

/* JADX INFO: loaded from: classes.dex */
public class c implements L0, z, InterfaceC0958e0, m, G.m, D1.a, y, InterfaceC1235a, InterfaceC1237c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile c f1732y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f1734x;

    public c() {
        this.f1733w = 13;
        this.f1734x = new AtomicInteger(0);
    }

    public final void A(int i6, InterfaceC0283j0 interfaceC0283j0, Object obj) {
        ((AbstractC0292q) this.f1734x).M(i6, (AbstractC0266b) obj, interfaceC0283j0);
    }

    public final void B(int i6, int i7) {
        ((AbstractC0292q) this.f1734x).G(i6, i7);
    }

    public final void C(int i6, long j6) {
        ((AbstractC0292q) this.f1734x).I(i6, j6);
    }

    public final void D(int i6, int i7) {
        ((AbstractC0292q) this.f1734x).R(i6, (i7 >> 31) ^ (i7 << 1));
    }

    public final void E(int i6, long j6) {
        ((AbstractC0292q) this.f1734x).T(i6, (j6 >> 63) ^ (j6 << 1));
    }

    public final void F(int i6, int i7) {
        ((AbstractC0292q) this.f1734x).R(i6, i7);
    }

    public final void G(int i6, long j6) {
        ((AbstractC0292q) this.f1734x).T(i6, j6);
    }

    @Override // p1.InterfaceC1237c
    public final Class b() {
        return InputStream.class;
    }

    @Override // l.z
    public final void c(o oVar, boolean z5) {
        if (oVar instanceof SubMenuC0907G) {
            oVar.k().c(false);
        }
        z zVar = ((C0977o) this.f1734x).f10338A;
        if (zVar != null) {
            zVar.c(oVar, z5);
        }
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        return new C1236b((AssetManager) this.f1734x, this);
    }

    @Override // m.L0
    public final void e(o oVar, q qVar) {
        ((ViewOnKeyListenerC0916i) this.f1734x).f9715C.removeCallbacksAndMessages(null);
        int size = ((ViewOnKeyListenerC0916i) this.f1734x).f9717E.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (oVar == ((C0915h) ((ViewOnKeyListenerC0916i) this.f1734x).f9717E.get(i6)).f9711b) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 == -1) {
            return;
        }
        int i7 = i6 + 1;
        ((ViewOnKeyListenerC0916i) this.f1734x).f9715C.postAtTime(new RunnableC0914g(this, i7 < ((ViewOnKeyListenerC0916i) this.f1734x).f9717E.size() ? (C0915h) ((ViewOnKeyListenerC0916i) this.f1734x).f9717E.get(i7) : null, qVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l.z
    public final boolean f(o oVar) {
        Object obj = this.f1734x;
        if (oVar == ((C0977o) obj).f10361y) {
            return false;
        }
        ((C0977o) obj).f10358U = ((SubMenuC0907G) oVar).f9679A.f9784a;
        z zVar = ((C0977o) obj).f10338A;
        if (zVar != null) {
            return zVar.f(oVar);
        }
        return false;
    }

    @Override // p1.InterfaceC1237c
    public final Object g(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // m.L0
    public final void h(o oVar, MenuItem menuItem) {
        ((ViewOnKeyListenerC0916i) this.f1734x).f9715C.removeCallbacksAndMessages(oVar);
    }

    @Override // l.m
    public final boolean i(o oVar, MenuItem menuItem) {
        ((Toolbar) this.f1734x).getClass();
        return false;
    }

    @Override // l.m
    public final void j(o oVar) {
        C0977o c0977o = ((Toolbar) this.f1734x).f5257w.f5193P;
        if (c0977o == null || !c0977o.k()) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) this.f1734x).f5246f0.f9278y).iterator();
            while (it.hasNext()) {
                ((M) it.next()).f8668a.t();
            }
        }
        ((Toolbar) this.f1734x).getClass();
    }

    public final void m(int i6, boolean z5) {
        ((AbstractC0292q) this.f1734x).C(i6, z5);
    }

    public final void n(int i6, AbstractC0280i abstractC0280i) {
        ((AbstractC0292q) this.f1734x).E(i6, abstractC0280i);
    }

    public final void o(int i6, double d6) {
        AbstractC0292q abstractC0292q = (AbstractC0292q) this.f1734x;
        abstractC0292q.getClass();
        abstractC0292q.I(i6, Double.doubleToRawLongBits(d6));
    }

    public final void p(int i6, int i7) {
        ((AbstractC0292q) this.f1734x).K(i6, i7);
    }

    @Override // G.m
    public final int q(Object obj) {
        return ((h) obj).f438b;
    }

    @Override // p1.InterfaceC1235a
    public final k r(AssetManager assetManager, String str) {
        return new k(assetManager, str, 1);
    }

    @Override // D1.a
    public final Object s() {
        switch (this.f1733w) {
            case 25:
                F.d dVar = (F.d) this.f1734x;
                return new l1.m((i) dVar.f434y, (M.b) dVar.f435z);
            default:
                try {
                    return new C1152h(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e6) {
                    throw new RuntimeException(e6);
                }
        }
    }

    @Override // G.m
    public final boolean t(Object obj) {
        return ((h) obj).f439c;
    }

    public final void u(int i6, int i7) {
        ((AbstractC0292q) this.f1734x).G(i6, i7);
    }

    public final void v(int i6, long j6) {
        ((AbstractC0292q) this.f1734x).I(i6, j6);
    }

    public final void w(int i6, float f6) {
        AbstractC0292q abstractC0292q = (AbstractC0292q) this.f1734x;
        abstractC0292q.getClass();
        abstractC0292q.G(i6, Float.floatToRawIntBits(f6));
    }

    public final void x(int i6, InterfaceC0283j0 interfaceC0283j0, Object obj) {
        AbstractC0292q abstractC0292q = (AbstractC0292q) this.f1734x;
        abstractC0292q.Q(i6, 3);
        interfaceC0283j0.c((AbstractC0266b) obj, abstractC0292q.f5505c);
        abstractC0292q.Q(i6, 4);
    }

    public final void y(int i6, int i7) {
        ((AbstractC0292q) this.f1734x).K(i6, i7);
    }

    public final void z(int i6, long j6) {
        ((AbstractC0292q) this.f1734x).T(i6, j6);
    }

    public c(int i6) {
        this.f1733w = 14;
        this.f1734x = new AtomicBoolean(false);
    }

    public c(int i6, int i7) {
        Handler handler;
        Handler handlerB;
        this.f1733w = i6;
        if (i6 == 11) {
            int i8 = Build.VERSION.SDK_INT;
            this.f1734x = i8 >= 30 ? new s0() : i8 >= 29 ? new r0() : new q0();
            return;
        }
        if (i6 == 26) {
            this.f1734x = new ArrayDeque();
            return;
        }
        if (i6 == 20) {
            this.f1734x = new HashMap();
            return;
        }
        if (i6 != 21) {
            this.f1734x = new HashSet();
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handlerB = AbstractC1141d.b(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e6) {
                e = e6;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InstantiationException e7) {
                e = e7;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (NoSuchMethodException e8) {
                e = e8;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InvocationTargetException e9) {
                Throwable cause = e9.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                throw ((Error) cause);
            }
            handlerB = handler;
        }
        this.f1734x = handlerB;
    }

    public /* synthetic */ c(int i6, Object obj) {
        this.f1733w = i6;
        this.f1734x = obj;
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1733w = 12;
        this.f1734x = Build.VERSION.SDK_INT >= 25 ? new f(uri, clipDescription, uri2) : new C0803c(uri, clipDescription, uri2, 6);
    }

    public c(TextView textView) {
        this.f1733w = 18;
        AbstractC0651b.f(textView, "textView cannot be null");
        this.f1734x = new e0.i(textView);
    }

    public c(AbstractC0292q abstractC0292q) {
        this.f1733w = 15;
        F.a(abstractC0292q, "output");
        this.f1734x = abstractC0292q;
        abstractC0292q.f5505c = this;
    }

    public c(com.bumptech.glide.d dVar) {
        this.f1733w = 6;
        this.f1734x = dVar;
    }

    @Override // m.InterfaceC0958e0
    public void a(int i6) {
    }

    @Override // m.InterfaceC0958e0
    public void k(int i6) {
    }

    @Override // m.InterfaceC0958e0
    public void l(int i6, float f6) {
    }
}
