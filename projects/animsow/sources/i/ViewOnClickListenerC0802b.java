package i;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import m.d1;
import y2.DialogC1506h;

/* JADX INFO: renamed from: i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0802b implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9274x;

    public /* synthetic */ ViewOnClickListenerC0802b(int i6, Object obj) {
        this.f9273w = i6;
        this.f9274x = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f9273w;
        Object obj = this.f9274x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0808h c0808h = (C0808h) obj;
                Button button = c0808h.f9300f;
                c0808h.f9317w.obtainMessage(1, c0808h.f9296b).sendToTarget();
                break;
            case 1:
                d1 d1Var = ((Toolbar) obj).f5251k0;
                l.q qVar = d1Var == null ? null : d1Var.f10264x;
                if (qVar != null) {
                    qVar.collapseActionView();
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                DialogC1506h dialogC1506h = (DialogC1506h) obj;
                if (dialogC1506h.f13807F && dialogC1506h.isShowing()) {
                    if (!dialogC1506h.f13809H) {
                        TypedArray typedArrayObtainStyledAttributes = dialogC1506h.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        dialogC1506h.f13808G = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        dialogC1506h.f13809H = true;
                    }
                    if (dialogC1506h.f13808G) {
                        dialogC1506h.cancel();
                    }
                    break;
                }
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) obj;
                int i7 = kVar.f7201x0;
                if (i7 == 2) {
                    kVar.V(1);
                } else if (i7 == 1) {
                    kVar.V(2);
                }
                break;
            default:
                l.q itemData = ((J2.c) view).getItemData();
                J2.e eVar = (J2.e) obj;
                if (!eVar.f1314d0.q(itemData, eVar.f1313c0, 0)) {
                    itemData.setChecked(true);
                }
                break;
        }
    }
}
