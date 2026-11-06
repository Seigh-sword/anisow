package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f9823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f9827f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f9830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f9831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f9832k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9828g = 8388611;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f9833l = new x(this);

    public y(int i6, int i7, Context context, View view, o oVar, boolean z5) {
        this.f9822a = context;
        this.f9823b = oVar;
        this.f9827f = view;
        this.f9824c = z5;
        this.f9825d = i6;
        this.f9826e = i7;
    }

    public final w a() {
        w viewOnKeyListenerC0906F;
        if (this.f9831j == null) {
            Context context = this.f9822a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0906F = new ViewOnKeyListenerC0916i(this.f9822a, this.f9827f, this.f9825d, this.f9826e, this.f9824c);
            } else {
                View view = this.f9827f;
                viewOnKeyListenerC0906F = new ViewOnKeyListenerC0906F(this.f9825d, this.f9826e, this.f9822a, view, this.f9823b, this.f9824c);
            }
            viewOnKeyListenerC0906F.o(this.f9823b);
            viewOnKeyListenerC0906F.u(this.f9833l);
            viewOnKeyListenerC0906F.q(this.f9827f);
            viewOnKeyListenerC0906F.j(this.f9830i);
            viewOnKeyListenerC0906F.r(this.f9829h);
            viewOnKeyListenerC0906F.s(this.f9828g);
            this.f9831j = viewOnKeyListenerC0906F;
        }
        return this.f9831j;
    }

    public final boolean b() {
        w wVar = this.f9831j;
        return wVar != null && wVar.a();
    }

    public void c() {
        this.f9831j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9832k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i6, int i7, boolean z5, boolean z6) {
        w wVarA = a();
        wVarA.v(z6);
        if (z5) {
            if ((Gravity.getAbsoluteGravity(this.f9828g, this.f9827f.getLayoutDirection()) & 7) == 5) {
                i6 -= this.f9827f.getWidth();
            }
            wVarA.t(i6);
            wVarA.w(i7);
            int i8 = (int) ((this.f9822a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            wVarA.f9820w = new Rect(i6 - i8, i7 - i8, i6 + i8, i7 + i8);
        }
        wVarA.f();
    }
}
