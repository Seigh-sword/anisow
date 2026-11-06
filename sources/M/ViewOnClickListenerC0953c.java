package m;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;
import k.AbstractC0880c;
import l.C0908a;

/* JADX INFO: renamed from: m.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0953c implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10245w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f10246x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f10247y;

    public ViewOnClickListenerC0953c(ActionBarContextView actionBarContextView, AbstractC0880c abstractC0880c) {
        this.f10247y = actionBarContextView;
        this.f10246x = abstractC0880c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f10245w;
        Object obj = this.f10246x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((AbstractC0880c) obj).a();
                break;
            default:
                i1 i1Var = (i1) this.f10247y;
                Window.Callback callback = i1Var.f10293k;
                if (callback != null && i1Var.f10294l) {
                    callback.onMenuItemSelected(0, (C0908a) obj);
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC0953c(i1 i1Var) {
        this.f10247y = i1Var;
        this.f10246x = new C0908a(i1Var.f10283a.getContext(), i1Var.f10290h);
    }
}
