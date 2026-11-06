package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import m.W;

/* JADX INFO: renamed from: i.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0804d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9282y;

    public /* synthetic */ C0804d(Object obj, int i6, Object obj2) {
        this.f9280w = i6;
        this.f9282y = obj;
        this.f9281x = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        int i7 = this.f9280w;
        Object obj = this.f9282y;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0805e c0805e = (C0805e) obj;
                DialogInterface.OnClickListener onClickListener = c0805e.f9290h;
                C0808h c0808h = (C0808h) this.f9281x;
                onClickListener.onClick(c0808h.f9296b, i6);
                if (!c0805e.f9291i) {
                    c0808h.f9296b.dismiss();
                }
                break;
            default:
                m.T t5 = (m.T) obj;
                t5.f10196c0.setSelection(i6);
                W w5 = t5.f10196c0;
                if (w5.getOnItemClickListener() != null) {
                    w5.performItemClick(view, i6, t5.f10193Z.getItemId(i6));
                }
                t5.dismiss();
                break;
        }
    }
}
