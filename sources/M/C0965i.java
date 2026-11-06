package m;

import android.content.Context;
import android.view.View;
import com.xo.anilab.R;
import l.SubMenuC0907G;

/* JADX INFO: renamed from: m.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0965i extends l.y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10281m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0977o f10282n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0965i(C0977o c0977o, Context context, l.o oVar, C0973m c0973m) {
        super(R.attr.actionOverflowMenuStyle, 0, context, c0973m, oVar, true);
        this.f10282n = c0977o;
        this.f9828g = 8388613;
        L3.c cVar = c0977o.f10357T;
        this.f9830i = cVar;
        l.w wVar = this.f9831j;
        if (wVar != null) {
            wVar.j(cVar);
        }
    }

    @Override // l.y
    public final void c() {
        int i6 = this.f10281m;
        C0977o c0977o = this.f10282n;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0977o.f10354Q = null;
                c0977o.f10358U = 0;
                super.c();
                break;
            default:
                l.o oVar = c0977o.f10361y;
                if (oVar != null) {
                    oVar.c(true);
                }
                c0977o.f10353P = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0965i(C0977o c0977o, Context context, SubMenuC0907G subMenuC0907G, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC0907G, false);
        this.f10282n = c0977o;
        if (!subMenuC0907G.f9679A.f()) {
            View view2 = c0977o.f10343F;
            this.f9827f = view2 == null ? (View) c0977o.f10341D : view2;
        }
        L3.c cVar = c0977o.f10357T;
        this.f9830i = cVar;
        l.w wVar = this.f9831j;
        if (wVar != null) {
            wVar.j(cVar);
        }
    }
}
