package L;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ PrecomputedText.Params.Builder j(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean x(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
