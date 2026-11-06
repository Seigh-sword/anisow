package h1;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: h1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0766f extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0767g f8968w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0766f(C0767g c0767g, int i6) {
        super(i6);
        this.f8968w = c0767g;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i6 = ((ByteArrayOutputStream) this).count;
        if (i6 > 0 && ((ByteArrayOutputStream) this).buf[i6 - 1] == 13) {
            i6--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i6, this.f8968w.f8971x.name());
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }
}
