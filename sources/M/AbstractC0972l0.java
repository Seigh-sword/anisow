package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: m.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0972l0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0974m0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
