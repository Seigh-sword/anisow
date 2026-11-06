package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: m.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0970k0 extends C0968j0 {
    @Override // m.C0968j0, m.AbstractC0972l0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // m.AbstractC0972l0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
