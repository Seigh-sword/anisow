package L;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f1663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f1664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1666d;

    public e(PrecomputedText.Params params) {
        this.f1663a = params.getTextPaint();
        this.f1664b = params.getTextDirection();
        this.f1665c = params.getBreakStrategy();
        this.f1666d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1665c == eVar.f1665c && this.f1666d == eVar.f1666d) {
            TextPaint textPaint = this.f1663a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = eVar.f1663a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f1664b == eVar.f1664b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f1663a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1664b, Integer.valueOf(this.f1665c), Integer.valueOf(this.f1666d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1663a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i6 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i6 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f1664b);
        sb.append(", breakStrategy=" + this.f1665c);
        sb.append(", hyphenationFrequency=" + this.f1666d);
        sb.append("}");
        return sb.toString();
    }

    public e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i6, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.j(textPaint).setBreakStrategy(i6).setHyphenationFrequency(i7).setTextDirection(textDirectionHeuristic).build();
        }
        this.f1663a = textPaint;
        this.f1664b = textDirectionHeuristic;
        this.f1665c = i6;
        this.f1666d = i7;
    }
}
