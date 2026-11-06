package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import i.C0805e;
import i.DialogInterfaceC0809i;

/* JADX INFO: loaded from: classes.dex */
public final class P implements V, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DialogInterfaceC0809i f10174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f10175x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f10176y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ W f10177z;

    public P(W w5) {
        this.f10177z = w5;
    }

    @Override // m.V
    public final boolean a() {
        DialogInterfaceC0809i dialogInterfaceC0809i = this.f10174w;
        if (dialogInterfaceC0809i != null) {
            return dialogInterfaceC0809i.isShowing();
        }
        return false;
    }

    @Override // m.V
    public final void b(int i6) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.V
    public final int c() {
        return 0;
    }

    @Override // m.V
    public final void d(int i6, int i7) {
        if (this.f10175x == null) {
            return;
        }
        W w5 = this.f10177z;
        T1.j jVar = new T1.j(w5.getPopupContext());
        CharSequence charSequence = this.f10176y;
        if (charSequence != null) {
            ((C0805e) jVar.f3425x).f9286d = charSequence;
        }
        ListAdapter listAdapter = this.f10175x;
        int selectedItemPosition = w5.getSelectedItemPosition();
        C0805e c0805e = (C0805e) jVar.f3425x;
        c0805e.f9289g = listAdapter;
        c0805e.f9290h = this;
        c0805e.f9292j = selectedItemPosition;
        c0805e.f9291i = true;
        DialogInterfaceC0809i dialogInterfaceC0809iG = jVar.g();
        this.f10174w = dialogInterfaceC0809iG;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0809iG.f9319B.f9299e;
        alertController$RecycleListView.setTextDirection(i6);
        alertController$RecycleListView.setTextAlignment(i7);
        this.f10174w.show();
    }

    @Override // m.V
    public final void dismiss() {
        DialogInterfaceC0809i dialogInterfaceC0809i = this.f10174w;
        if (dialogInterfaceC0809i != null) {
            dialogInterfaceC0809i.dismiss();
            this.f10174w = null;
        }
    }

    @Override // m.V
    public final int g() {
        return 0;
    }

    @Override // m.V
    public final Drawable i() {
        return null;
    }

    @Override // m.V
    public final CharSequence j() {
        return this.f10176y;
    }

    @Override // m.V
    public final void l(CharSequence charSequence) {
        this.f10176y = charSequence;
    }

    @Override // m.V
    public final void m(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.V
    public final void n(int i6) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.V
    public final void o(ListAdapter listAdapter) {
        this.f10175x = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        W w5 = this.f10177z;
        w5.setSelection(i6);
        if (w5.getOnItemClickListener() != null) {
            w5.performItemClick(null, i6, this.f10175x.getItemId(i6));
        }
        dismiss();
    }

    @Override // m.V
    public final void p(int i6) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
