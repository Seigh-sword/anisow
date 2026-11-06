package c0;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes.dex */
public final class r implements s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public H f6142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final P2.e f6143x;

    public r(H h4, P2.e eVar) {
        this.f6142w = h4;
        this.f6143x = eVar;
    }

    @Override // c0.s
    public final Object a() {
        return this.f6142w;
    }

    @Override // c0.s
    public final boolean b(CharSequence charSequence, int i6, int i7, E e6) {
        if ((e6.f6105c & 4) > 0) {
            return true;
        }
        if (this.f6142w == null) {
            this.f6142w = new H(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        this.f6143x.getClass();
        this.f6142w.setSpan(new F(e6), i6, i7, 33);
        return true;
    }
}
