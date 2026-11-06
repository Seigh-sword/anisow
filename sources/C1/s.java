package c1;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class s implements TextWatcher {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f6225w;

    public s(t tVar) {
        this.f6225w = tVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = K4.h.l0(String.valueOf(editable)).toString();
        t tVar = this.f6225w;
        tVar.f6231F0 = string;
        tVar.f6232G0.cancel();
        Timer timer = new Timer();
        tVar.f6232G0 = timer;
        timer.schedule(new r(1, tVar), tVar.f6233H0);
        tVar.Z();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
    }
}
