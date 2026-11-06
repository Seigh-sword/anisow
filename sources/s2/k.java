package S2;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class k extends H2.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f3144w;

    public k(m mVar) {
        this.f3144w = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f3144w.b().a();
    }

    @Override // H2.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        this.f3144w.b().b();
    }
}
