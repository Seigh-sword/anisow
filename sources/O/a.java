package O;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2287c;

    public a(int i6, i iVar, int i7) {
        this.f2285a = i6;
        this.f2286b = iVar;
        this.f2287c = i7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2285a);
        this.f2286b.f2303a.performAction(this.f2287c, bundle);
    }
}
