package y2;

import N.C0;
import N.o0;
import android.view.View;
import android.view.WindowInsets;
import java.util.Iterator;
import java.util.List;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsets f13815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f13816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f13819e = new int[2];

    public j(View view) {
        this.f13816b = view;
    }

    public final void a(C0 c02, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((o0) it.next()).f2031a.c() & 8) != 0) {
                this.f13816b.setTranslationY(AbstractC1301a.c(r3.f2031a.b(), this.f13818d, 0));
                return;
            }
        }
    }
}
