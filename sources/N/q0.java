package N;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f2036e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2037f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f2038g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2039h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f2040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G.c f2041d;

    public q0() {
        this.f2040c = i();
    }

    private static WindowInsets i() {
        if (!f2037f) {
            try {
                f2036e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f2037f = true;
        }
        Field field = f2036e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
            }
        }
        if (!f2039h) {
            try {
                f2038g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
            }
            f2039h = true;
        }
        Constructor constructor = f2038g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
            }
        }
        return null;
    }

    @Override // N.t0
    public C0 b() {
        a();
        C0 c0G = C0.g(null, this.f2040c);
        G.c[] cVarArr = this.f2046b;
        A0 a02 = c0G.f1943a;
        a02.o(cVarArr);
        a02.q(this.f2041d);
        return c0G;
    }

    @Override // N.t0
    public void e(G.c cVar) {
        this.f2041d = cVar;
    }

    @Override // N.t0
    public void g(G.c cVar) {
        WindowInsets windowInsets = this.f2040c;
        if (windowInsets != null) {
            this.f2040c = windowInsets.replaceSystemWindowInsets(cVar.f641a, cVar.f642b, cVar.f643c, cVar.f644d);
        }
    }

    public q0(C0 c02) {
        super(c02);
        this.f2040c = c02.f();
    }
}
