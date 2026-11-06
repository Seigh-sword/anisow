package l1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Appendable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Appendable f10019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10020x = true;

    public z(Appendable appendable) {
        this.f10019w = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c6) throws IOException {
        boolean z5 = this.f10020x;
        Appendable appendable = this.f10019w;
        if (z5) {
            this.f10020x = false;
            appendable.append("  ");
        }
        this.f10020x = c6 == '\n';
        appendable.append(c6);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i6, int i7) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z5 = this.f10020x;
        Appendable appendable = this.f10019w;
        boolean z6 = false;
        if (z5) {
            this.f10020x = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i7 - 1) == '\n') {
            z6 = true;
        }
        this.f10020x = z6;
        appendable.append(charSequence, i6, i7);
        return this;
    }
}
