package S2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f3145a;

    public l(m mVar) {
        this.f3145a = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.f3145a;
        if (mVar.f3161O == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.f3161O;
        k kVar = mVar.f3164R;
        if (editText != null) {
            editText.removeTextChangedListener(kVar);
            if (mVar.f3161O.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.f3161O.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.f3161O = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(kVar);
        }
        mVar.b().m(mVar.f3161O);
        mVar.j(mVar.b());
    }
}
