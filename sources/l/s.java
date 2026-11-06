package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import k.InterfaceC0881d;

/* JADX INFO: loaded from: classes.dex */
public final class s extends FrameLayout implements InterfaceC0881d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CollapsibleActionView f9813w;

    /* JADX WARN: Multi-variable type inference failed */
    public s(View view) {
        super(view.getContext());
        this.f9813w = (CollapsibleActionView) view;
        addView(view);
    }
}
