package k;

import N.C0090e0;
import N.InterfaceC0092f0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f9628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0092f0 f9629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9630e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9627b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f9631f = new k(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9626a = new ArrayList();

    public final void a() {
        if (this.f9630e) {
            Iterator it = this.f9626a.iterator();
            while (it.hasNext()) {
                ((C0090e0) it.next()).b();
            }
            this.f9630e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f9630e) {
            return;
        }
        for (C0090e0 c0090e0 : this.f9626a) {
            long j6 = this.f9627b;
            if (j6 >= 0) {
                c0090e0.c(j6);
            }
            Interpolator interpolator = this.f9628c;
            if (interpolator != null && (view = (View) c0090e0.f1987a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f9629d != null) {
                c0090e0.d(this.f9631f);
            }
            View view2 = (View) c0090e0.f1987a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f9630e = true;
    }
}
