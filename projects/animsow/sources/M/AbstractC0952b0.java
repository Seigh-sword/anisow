package m;

import android.widget.TextView;

/* JADX INFO: renamed from: m.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0952b0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i6, int i7, int i8, int i9) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
    }

    public static void c(TextView textView, int[] iArr, int i6) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
