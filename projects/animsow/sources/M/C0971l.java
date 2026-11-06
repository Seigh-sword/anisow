package m;

import android.view.View;
import l.InterfaceC0905E;

/* JADX INFO: renamed from: m.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0971l extends A0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ int f10304F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ Object f10305G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ View f10306H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0971l(View view, View view2, Object obj, int i6) {
        super(view2);
        this.f10304F = i6;
        this.f10306H = view;
        this.f10305G = obj;
    }

    @Override // m.A0
    public final InterfaceC0905E b() {
        switch (this.f10304F) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0965i c0965i = ((C0973m) this.f10306H).f10319z.f10353P;
                if (c0965i == null) {
                    return null;
                }
                return c0965i.a();
            default:
                return (T) this.f10305G;
        }
    }

    @Override // m.A0
    public final boolean c() {
        int i6 = this.f10304F;
        View view = this.f10306H;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0973m) view).f10319z.o();
                break;
            default:
                W w5 = (W) view;
                if (!w5.getInternalPopup().a()) {
                    w5.f10211B.d(w5.getTextDirection(), w5.getTextAlignment());
                }
                break;
        }
        return true;
    }

    @Override // m.A0
    public final boolean d() {
        switch (this.f10304F) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0977o c0977o = ((C0973m) this.f10306H).f10319z;
                if (c0977o.f10355R == null) {
                    c0977o.f();
                    break;
                }
                break;
            default:
                super.d();
                break;
        }
        return true;
    }
}
