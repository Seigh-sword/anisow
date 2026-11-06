package e0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class k implements TextWatcher {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EditText f8250w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f8252y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8251x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8253z = true;

    public k(EditText editText) {
        this.f8250w = editText;
    }

    public static void a(EditText editText, int i6) {
        int length;
        if (i6 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            c0.l lVarA = c0.l.a();
            if (editableText == null) {
                length = 0;
            } else {
                lVarA.getClass();
                length = editableText.length();
            }
            lVarA.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        EditText editText = this.f8250w;
        if (editText.isInEditMode() || !this.f8253z) {
            return;
        }
        if ((this.f8251x || c0.l.f6123k != null) && i7 <= i8 && (charSequence instanceof Spannable)) {
            int iB = c0.l.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    c0.l.a().f(i6, i8 + i6, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            c0.l lVarA = c0.l.a();
            if (this.f8252y == null) {
                this.f8252y = new j(editText);
            }
            lVarA.g(this.f8252y);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
    }
}
