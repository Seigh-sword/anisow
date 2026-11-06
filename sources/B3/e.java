package B3;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0321v;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import com.google.android.gms.internal.measurement.C0396c2;
import f5.C0707d;
import f5.C0710g;
import f5.j;
import f5.w;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import l.o;
import l.z;
import m1.InterfaceC1006d;
import r.C1267a;
import s4.AbstractC1305a;
import t0.InterfaceC1331c;

/* JADX INFO: loaded from: classes.dex */
public class e implements z, InterfaceC1331c, A0.c, InterfaceC1006d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static e f99w;

    public static final boolean b(w wVar) {
        w wVar2 = g5.e.f8543c;
        return !K4.h.X(wVar.b(), ".class", true);
    }

    public static C0707d k() throws InterruptedException {
        C0707d c0707d = C0707d.f8452l;
        AbstractC1305a.l(c0707d);
        C0707d c0707d2 = c0707d.f8454f;
        long jNanoTime = System.nanoTime();
        if (c0707d2 == null) {
            C0707d.f8449i.await(C0707d.f8450j, TimeUnit.MILLISECONDS);
            C0707d c0707d3 = C0707d.f8452l;
            AbstractC1305a.l(c0707d3);
            if (c0707d3.f8454f != null || System.nanoTime() - jNanoTime < C0707d.f8451k) {
                return null;
            }
            return C0707d.f8452l;
        }
        long j6 = c0707d2.f8455g - jNanoTime;
        if (j6 > 0) {
            C0707d.f8449i.await(j6, TimeUnit.NANOSECONDS);
            return null;
        }
        C0707d c0707d4 = C0707d.f8452l;
        AbstractC1305a.l(c0707d4);
        c0707d4.f8454f = c0707d2.f8454f;
        c0707d2.f8454f = null;
        return c0707d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(Activity activity, EnumC0313m enumC0313m) {
        AbstractC1305a.o(activity, "activity");
        AbstractC1305a.o(enumC0313m, "event");
        if (activity instanceof InterfaceC0321v) {
            C0323x c0323xG = ((InterfaceC0321v) activity).g();
            if (c0323xG instanceof C0323x) {
                c0323xG.e(enumC0313m);
            }
        }
    }

    public static w o(String str, boolean z5) {
        AbstractC1305a.o(str, "<this>");
        j jVar = g5.c.f8535a;
        C0710g c0710g = new C0710g();
        c0710g.c0(str);
        return g5.c.d(c0710g, z5);
    }

    public static w p(File file) {
        String str = w.f8492x;
        String string = file.toString();
        AbstractC1305a.n(string, "toString()");
        return o(string, false);
    }

    public static r.b q(C0396c2 c0396c2) {
        return (r.b) ((Drawable) c0396c2.f6775x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0088, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0072 A[EDGE_INSN: B:91:0x0072->B:48:0x0072 BREAK  A[LOOP:2: B:49:0x0074->B:60:0x008b, LOOP_LABEL: LOOP:2: B:49:0x0074->B:60:0x008b], EDGE_INSN: B:94:0x0072->B:48:0x0072 BREAK  A[LOOP:2: B:49:0x0074->B:60:0x008b]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean t(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.e.t(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void u(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            N.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new N());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new O(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void C(C0396c2 c0396c2, float f6) {
        r.b bVarQ = q(c0396c2);
        boolean useCompatPadding = ((C1267a) c0396c2.f6776y).getUseCompatPadding();
        boolean zH = c0396c2.H();
        if (f6 != bVarQ.f12411e || bVarQ.f12412f != useCompatPadding || bVarQ.f12413g != zH) {
            bVarQ.f12411e = f6;
            bVarQ.f12412f = useCompatPadding;
            bVarQ.f12413g = zH;
            bVarQ.b(null);
            bVarQ.invalidateSelf();
        }
        if (!((C1267a) c0396c2.f6776y).getUseCompatPadding()) {
            c0396c2.Q(0, 0, 0, 0);
            return;
        }
        r.b bVar = (r.b) ((Drawable) c0396c2.f6775x);
        float f7 = bVar.f12411e;
        float f8 = bVar.f12407a;
        int iCeil = (int) Math.ceil(r.c.a(f7, f8, c0396c2.H()));
        int iCeil2 = (int) Math.ceil(r.c.b(f7, f8, c0396c2.H()));
        c0396c2.Q(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // m1.InterfaceC1006d
    public Bitmap a(int i6, int i7, Bitmap.Config config) {
        return Bitmap.createBitmap(i6, i7, config);
    }

    @Override // m1.InterfaceC1006d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // l.z
    public boolean f(o oVar) {
        return false;
    }

    @Override // m1.InterfaceC1006d
    public Bitmap g(int i6, int i7, Bitmap.Config config) {
        return Bitmap.createBitmap(i6, i7, config);
    }

    @Override // A0.c
    public A0.d j(A0.b bVar) {
        return new B0.e(bVar.f2a, bVar.f3b, bVar.f4c, bVar.f5d);
    }

    public String l(Method method, int i6) {
        return "parameter #" + (i6 + 1);
    }

    public Signature[] s(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public Object v(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean w() {
        return false;
    }

    public boolean x(Method method) {
        return false;
    }

    public void D() {
    }

    @Override // t0.InterfaceC1331c
    public void h() {
    }

    @Override // m1.InterfaceC1006d
    public void i() {
    }

    public void A(boolean z5) {
    }

    public void B(boolean z5) {
    }

    @Override // m1.InterfaceC1006d
    public void e(int i6) {
    }

    public InputFilter[] r(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public void y(boolean z5) {
    }

    public void z(boolean z5) {
    }

    @Override // l.z
    public void c(o oVar, boolean z5) {
    }

    @Override // t0.InterfaceC1331c
    public void m(int i6, Object obj) {
    }
}
