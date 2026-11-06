package e0;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class i extends B3.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f8248x;

    public i(TextView textView) {
        this.f8248x = new h(textView);
    }

    @Override // B3.e
    public final void B(boolean z5) {
        boolean z6 = !(c0.l.f6123k != null);
        h hVar = this.f8248x;
        if (z6) {
            hVar.f8247z = z5;
        } else {
            hVar.B(z5);
        }
    }

    @Override // B3.e
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        return (c0.l.f6123k != null) ^ true ? inputFilterArr : this.f8248x.r(inputFilterArr);
    }

    @Override // B3.e
    public final void y(boolean z5) {
        if (!(c0.l.f6123k != null)) {
            return;
        }
        this.f8248x.y(z5);
    }
}
