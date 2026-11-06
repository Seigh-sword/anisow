package c0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Spannable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6111w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Spannable f6112x;

    public H(Spannable spannable) {
        this.f6112x = spannable;
    }

    public final void a() {
        Spannable spannable = this.f6112x;
        if (!this.f6111w) {
            if ((Build.VERSION.SDK_INT < 28 ? new P2.e() : new G()).k(spannable)) {
                this.f6112x = new SpannableString(spannable);
            }
        }
        this.f6111w = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        return this.f6112x.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f6112x.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f6112x.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f6112x.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f6112x.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f6112x.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i6, int i7, Class cls) {
        return this.f6112x.getSpans(i6, i7, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6112x.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i6, int i7, Class cls) {
        return this.f6112x.nextSpanTransition(i6, i7, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f6112x.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        a();
        this.f6112x.setSpan(obj, i6, i7, i8);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i7) {
        return this.f6112x.subSequence(i6, i7);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6112x.toString();
    }
}
