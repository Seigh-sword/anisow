package e0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f8242b;

    public f(TextView textView) {
        this.f8241a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i6, int i7, Spanned spanned, int i8, int i9) {
        TextView textView = this.f8241a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = c0.l.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i9 == 0 && i8 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i6 != 0 || i7 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i6, i7);
                }
                return c0.l.a().f(0, charSequence.length(), charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        c0.l lVarA = c0.l.a();
        if (this.f8242b == null) {
            this.f8242b = new e(textView, this);
        }
        lVarA.g(this.f8242b);
        return charSequence;
    }
}
