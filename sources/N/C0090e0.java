package N;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: N.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0090e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1987a;

    public C0090e0(View view) {
        this.f1987a = new WeakReference(view);
    }

    public final void a(float f6) {
        View view = (View) this.f1987a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
    }

    public final void b() {
        View view = (View) this.f1987a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j6) {
        View view = (View) this.f1987a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
    }

    public final void d(InterfaceC0092f0 interfaceC0092f0) {
        View view = (View) this.f1987a.get();
        if (view != null) {
            if (interfaceC0092f0 != null) {
                view.animate().setListener(new C0088d0(this, interfaceC0092f0, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f6) {
        View view = (View) this.f1987a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
    }
}
