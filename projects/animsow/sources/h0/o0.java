package h0;

import android.util.Log;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends Writer {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8872w = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f8874y = new StringBuilder(128);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f8873x = "FragmentManager";

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        switch (this.f8872w) {
            case 1:
                ((Appendable) this.f8873x).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    public final void b() {
        if (((StringBuilder) this.f8874y).length() > 0) {
            Log.d((String) this.f8873x, ((StringBuilder) this.f8874y).toString());
            CharSequence charSequence = this.f8874y;
            ((StringBuilder) charSequence).delete(0, ((StringBuilder) charSequence).length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8872w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                b();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f8872w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                b();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(int i6) throws IOException {
        switch (this.f8872w) {
            case 1:
                ((Appendable) this.f8873x).append((char) i6);
                break;
            default:
                super.write(i6);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i6, int i7) throws IOException {
        switch (this.f8872w) {
            case 1:
                ((Appendable) this.f8873x).append(charSequence, i6, i7);
                return this;
            default:
                return super.append(charSequence, i6, i7);
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i6, int i7) throws IOException {
        switch (this.f8872w) {
            case 1:
                Objects.requireNonNull(str);
                ((Appendable) this.f8873x).append(str, i6, i7 + i6);
                break;
            default:
                super.write(str, i6, i7);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f8872w) {
            case 1:
                return append(charSequence);
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i6, int i7) throws IOException {
        switch (this.f8872w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                for (int i8 = 0; i8 < i7; i8++) {
                    char c6 = cArr[i6 + i8];
                    if (c6 == '\n') {
                        b();
                    } else {
                        ((StringBuilder) this.f8874y).append(c6);
                    }
                }
                break;
            default:
                S3.u uVar = (S3.u) this.f8874y;
                uVar.getClass();
                uVar.getClass();
                ((Appendable) this.f8873x).append(uVar, i6, i7 + i6);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i6, int i7) {
        switch (this.f8872w) {
            case 1:
                return append(charSequence, i6, i7);
            default:
                return super.append(charSequence, i6, i7);
        }
    }
}
