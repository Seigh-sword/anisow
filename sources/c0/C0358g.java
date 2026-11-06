package c0;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import d0.C0647b;

/* JADX INFO: renamed from: c0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0358g extends L3.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile P0.h f6117A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile v f6118z;

    public final void H() {
        try {
            ((l) this.f1734x).f6129f.a(new C0357f(this));
        } catch (Throwable th) {
            ((l) this.f1734x).d(th);
        }
    }

    public final CharSequence I(CharSequence charSequence, int i6, int i7, boolean z5) {
        H h4;
        F[] fArr;
        v vVar = this.f6118z;
        vVar.getClass();
        boolean z6 = charSequence instanceof D;
        if (z6) {
            ((D) charSequence).a();
        }
        if (z6) {
            h4 = new H((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    h4 = new H((Spannable) charSequence);
                } else if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i6 - 1, i7 + 1, F.class) > i7) {
                    h4 = null;
                } else {
                    h4 = new H();
                    h4.f6111w = false;
                    h4.f6112x = new SpannableString(charSequence);
                }
            } finally {
                if (z6) {
                    ((D) charSequence).b();
                }
            }
        }
        if (h4 != null && (fArr = (F[]) h4.f6112x.getSpans(i6, i7, F.class)) != null && fArr.length > 0) {
            for (F f6 : fArr) {
                int spanStart = h4.f6112x.getSpanStart(f6);
                int spanEnd = h4.f6112x.getSpanEnd(f6);
                if (spanStart != i7) {
                    h4.removeSpan(f6);
                }
                i6 = Math.min(spanStart, i6);
                i7 = Math.max(spanEnd, i7);
            }
        }
        int i8 = i6;
        if (i8 != i7 && i8 < charSequence.length()) {
            H h6 = (H) vVar.f(charSequence, i8, i7, Integer.MAX_VALUE, z5, new r(h4, (P2.e) vVar.f6154b));
            if (h6 != null) {
                Spannable spannable = h6.f6112x;
                if (z6) {
                    ((D) charSequence).b();
                }
                return spannable;
            }
            if (!z6) {
                return charSequence;
            }
        } else if (!z6) {
            return charSequence;
        }
        return charSequence;
    }

    public final void J(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        C0647b c0647b = (C0647b) this.f6117A.f2407a;
        int iA = c0647b.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? c0647b.f8160b.getInt(iA + c0647b.f8159a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((l) this.f1734x).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
