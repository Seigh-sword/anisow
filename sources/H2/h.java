package H2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f1036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f1037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1039d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1046k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f1040e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1041f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1042g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1043h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1044i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1045j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f1047l = null;

    public h(CharSequence charSequence, TextPaint textPaint, int i6) {
        this.f1036a = charSequence;
        this.f1037b = textPaint;
        this.f1038c = i6;
        this.f1039d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f1036a == null) {
            this.f1036a = "";
        }
        int iMax = Math.max(0, this.f1038c);
        CharSequence charSequenceEllipsize = this.f1036a;
        int i6 = this.f1041f;
        TextPaint textPaint = this.f1037b;
        if (i6 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f1047l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f1039d);
        this.f1039d = iMin;
        if (this.f1046k && this.f1041f == 1) {
            this.f1040e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f1040e);
        builderObtain.setIncludePad(this.f1045j);
        builderObtain.setTextDirection(this.f1046k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f1047l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f1041f);
        float f6 = this.f1042g;
        if (f6 != 0.0f || this.f1043h != 1.0f) {
            builderObtain.setLineSpacing(f6, this.f1043h);
        }
        if (this.f1041f > 1) {
            builderObtain.setHyphenationFrequency(this.f1044i);
        }
        return builderObtain.build();
    }
}
