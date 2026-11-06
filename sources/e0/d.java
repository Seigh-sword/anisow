package e0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B3.e f8238b;

    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        B3.e eVar = new B3.e();
        super(inputConnection, false);
        this.f8237a = editText;
        this.f8238b = eVar;
        if (c0.l.f6123k != null) {
            c0.l lVarA = c0.l.a();
            if (lVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            lVarA.f6128e.J(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i6, int i7) {
        Editable editableText = this.f8237a.getEditableText();
        this.f8238b.getClass();
        return B3.e.t(this, editableText, i6, i7, false) || super.deleteSurroundingText(i6, i7);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i7) {
        Editable editableText = this.f8237a.getEditableText();
        this.f8238b.getClass();
        return B3.e.t(this, editableText, i6, i7, true) || super.deleteSurroundingTextInCodePoints(i6, i7);
    }
}
