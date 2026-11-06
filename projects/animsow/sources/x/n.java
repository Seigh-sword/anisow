package x;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import w.C1436c;
import w.C1437d;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f13645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13646h;

    public n(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f13646h = constraintLayout;
        this.f13645g = constraintLayout2;
    }

    public static boolean a(int i6, int i7, int i8) {
        if (i6 == i7) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i6);
        View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i8 == size;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9 A[PHI: r7
      0x00f9: PHI (r7v1 int) = (r7v0 int), (r7v10 int) binds: [B:48:0x00a1, B:79:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w.C1437d r18, x.b r19) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.n.b(w.d, x.b):void");
    }

    public n(o oVar, C1437d c1437d, u.d dVar, int i6) {
        this.f13646h = oVar;
        this.f13645g = new WeakReference(c1437d);
        C1436c c1436c = c1437d.f13348I;
        dVar.getClass();
        this.f13639a = u.d.n(c1436c);
        this.f13640b = u.d.n(c1437d.f13349J);
        this.f13641c = u.d.n(c1437d.f13350K);
        this.f13642d = u.d.n(c1437d.f13351L);
        this.f13643e = u.d.n(c1437d.f13352M);
        this.f13644f = i6;
    }
}
