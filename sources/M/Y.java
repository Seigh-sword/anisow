package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ WeakReference f10227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0956d0 f10228q;

    public Y(C0956d0 c0956d0, int i6, int i7, WeakReference weakReference) {
        this.f10228q = c0956d0;
        this.f10225n = i6;
        this.f10226o = i7;
        this.f10227p = weakReference;
    }

    @Override // com.bumptech.glide.d
    public final void t(Typeface typeface) {
        int i6;
        if (Build.VERSION.SDK_INT >= 28 && (i6 = this.f10225n) != -1) {
            typeface = AbstractC0954c0.a(typeface, i6, (this.f10226o & 2) != 0);
        }
        C0956d0 c0956d0 = this.f10228q;
        if (c0956d0.f10262m) {
            c0956d0.f10261l = typeface;
            TextView textView = (TextView) this.f10227p.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new Z(c0956d0, textView, typeface, c0956d0.f10259j));
                } else {
                    textView.setTypeface(typeface, c0956d0.f10259j);
                }
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final void s(int i6) {
    }
}
