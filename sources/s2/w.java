package S2;

import N.V;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w implements TextWatcher {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ EditText f3233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3234y;

    public w(TextInputLayout textInputLayout, EditText editText) {
        this.f3234y = textInputLayout;
        this.f3233x = editText;
        this.f3232w = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f3234y;
        textInputLayout.u(!textInputLayout.f7346W0, false);
        if (textInputLayout.f7313G) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f7329O) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f3233x;
        int lineCount = editText.getLineCount();
        int i6 = this.f3232w;
        if (lineCount != i6) {
            if (lineCount < i6) {
                WeakHashMap weakHashMap = V.f1964a;
                int minimumHeight = editText.getMinimumHeight();
                int i7 = textInputLayout.f7332P0;
                if (minimumHeight != i7) {
                    editText.setMinimumHeight(i7);
                }
            }
            this.f3232w = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
    }
}
