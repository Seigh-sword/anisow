package W0;

import android.view.View;
import android.widget.TextView;
import com.android.app.activities.PostActivity;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = PostActivity.f6281j0;
        AbstractC1305a.m(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        if (textView.getMaxLines() == 4) {
            textView.setMaxLines(1000);
        } else {
            textView.setMaxLines(4);
        }
    }
}
