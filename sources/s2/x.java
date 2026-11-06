package S2;

import N.C0083b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.C0964h0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends C0083b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3235d;

    public x(TextInputLayout textInputLayout) {
        this.f3235d = textInputLayout;
    }

    @Override // N.C0083b
    public final void d(View view, O.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1973a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3235d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z5 = !zIsEmpty;
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(hint);
        boolean z8 = !textInputLayout.f7334Q0;
        boolean z9 = !TextUtils.isEmpty(error);
        if (!z9 && TextUtils.isEmpty(counterOverflowDescription)) {
            z6 = false;
        }
        String string = z7 ? hint.toString() : "";
        v vVar = textInputLayout.f7372x;
        View view2 = vVar.f3229x;
        if (view2.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(view2);
        } else {
            view2 = vVar.f3231z;
        }
        accessibilityNodeInfo.setTraversalAfter(view2);
        if (z5) {
            iVar.j(text);
        } else if (!TextUtils.isEmpty(string)) {
            iVar.j(string);
            if (z8 && placeholderText != null) {
                placeholderText = string + ", " + ((Object) placeholderText);
                iVar.j(placeholderText);
            }
        } else if (placeholderText != null) {
            iVar.j(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 26) {
                iVar.i(string);
            } else {
                if (z5) {
                    string = ((Object) text) + ", " + string;
                }
                iVar.j(string);
            }
            if (i6 >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                iVar.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z6) {
            if (!z9) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0964h0 c0964h0 = textInputLayout.f7311F.f3205y;
        if (c0964h0 != null) {
            accessibilityNodeInfo.setLabelFor(c0964h0);
        }
        textInputLayout.f7374y.b().n(iVar);
    }

    @Override // N.C0083b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f3235d.f7374y.b().o(accessibilityEvent);
    }
}
