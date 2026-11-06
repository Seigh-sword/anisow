package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5266x;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5265w = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f5266x = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f5265w * 2), this.f5266x), 1073741824), i7);
    }
}
