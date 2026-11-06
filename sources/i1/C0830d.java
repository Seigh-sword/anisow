package i1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: i1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0830d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f9384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0829c f9385c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9383a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9386d = 0;

    public final boolean a() {
        return this.f9385c.f9373b != 0;
    }

    public final C0829c b() {
        byte[] bArr;
        if (this.f9384b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f9385c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < 6; i6++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f9385c.f9377f = this.f9384b.getShort();
            this.f9385c.f9378g = this.f9384b.getShort();
            int iC = c();
            C0829c c0829c = this.f9385c;
            c0829c.f9379h = (iC & 128) != 0;
            c0829c.f9380i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f9385c.f9381j = c();
            C0829c c0829c2 = this.f9385c;
            c();
            c0829c2.getClass();
            if (this.f9385c.f9379h && !a()) {
                C0829c c0829c3 = this.f9385c;
                c0829c3.f9372a = e(c0829c3.f9380i);
                C0829c c0829c4 = this.f9385c;
                c0829c4.f9382k = c0829c4.f9372a[c0829c4.f9381j];
            }
        } else {
            this.f9385c.f9373b = 1;
        }
        if (!a()) {
            boolean z5 = false;
            while (!z5 && !a() && this.f9385c.f9374c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 != 1) {
                        if (iC3 == 249) {
                            this.f9385c.f9375d = new C0828b();
                            c();
                            int iC4 = c();
                            C0828b c0828b = this.f9385c.f9375d;
                            int i7 = (iC4 & 28) >> 2;
                            c0828b.f9367g = i7;
                            if (i7 == 0) {
                                c0828b.f9367g = 1;
                            }
                            c0828b.f9366f = (iC4 & 1) != 0;
                            short s5 = this.f9384b.getShort();
                            if (s5 < 2) {
                                s5 = 10;
                            }
                            C0828b c0828b2 = this.f9385c.f9375d;
                            c0828b2.f9369i = s5 * 10;
                            c0828b2.f9368h = c();
                            c();
                        } else if (iC3 != 254 && iC3 == 255) {
                            d();
                            StringBuilder sb2 = new StringBuilder();
                            int i8 = 0;
                            while (true) {
                                bArr = this.f9383a;
                                if (i8 >= 11) {
                                    break;
                                }
                                sb2.append((char) bArr[i8]);
                                i8++;
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    if (bArr[0] == 1) {
                                        byte b6 = bArr[1];
                                        byte b7 = bArr[2];
                                        this.f9385c.getClass();
                                    }
                                    if (this.f9386d > 0) {
                                    }
                                } while (!a());
                            }
                        }
                    }
                    f();
                } else if (iC2 == 44) {
                    C0829c c0829c5 = this.f9385c;
                    if (c0829c5.f9375d == null) {
                        c0829c5.f9375d = new C0828b();
                    }
                    c0829c5.f9375d.f9361a = this.f9384b.getShort();
                    this.f9385c.f9375d.f9362b = this.f9384b.getShort();
                    this.f9385c.f9375d.f9363c = this.f9384b.getShort();
                    this.f9385c.f9375d.f9364d = this.f9384b.getShort();
                    int iC5 = c();
                    boolean z6 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    C0828b c0828b3 = this.f9385c.f9375d;
                    c0828b3.f9365e = (iC5 & 64) != 0;
                    if (z6) {
                        c0828b3.f9371k = e(iPow);
                    } else {
                        c0828b3.f9371k = null;
                    }
                    this.f9385c.f9375d.f9370j = this.f9384b.position();
                    c();
                    f();
                    if (!a()) {
                        C0829c c0829c6 = this.f9385c;
                        c0829c6.f9374c++;
                        c0829c6.f9376e.add(c0829c6.f9375d);
                    }
                } else if (iC2 != 59) {
                    this.f9385c.f9373b = 1;
                } else {
                    z5 = true;
                }
            }
            C0829c c0829c7 = this.f9385c;
            if (c0829c7.f9374c < 0) {
                c0829c7.f9373b = 1;
            }
        }
        return this.f9385c;
    }

    public final int c() {
        try {
            return this.f9384b.get() & 255;
        } catch (Exception unused) {
            this.f9385c.f9373b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f9386d = iC;
        if (iC <= 0) {
            return;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            try {
                i7 = this.f9386d;
                if (i6 >= i7) {
                    return;
                }
                i7 -= i6;
                this.f9384b.get(this.f9383a, i6, i7);
                i6 += i7;
            } catch (Exception e6) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i6 + " count: " + i7 + " blockSize: " + this.f9386d, e6);
                }
                this.f9385c.f9373b = 1;
                return;
            }
        }
    }

    public final int[] e(int i6) {
        byte[] bArr = new byte[i6 * 3];
        int[] iArr = null;
        try {
            this.f9384b.get(bArr);
            iArr = new int[256];
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6) {
                int i9 = bArr[i8] & 255;
                int i10 = i8 + 2;
                int i11 = bArr[i8 + 1] & 255;
                i8 += 3;
                int i12 = i7 + 1;
                iArr[i7] = (i11 << 8) | (i9 << 16) | (-16777216) | (bArr[i10] & 255);
                i7 = i12;
            }
        } catch (BufferUnderflowException e6) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e6);
            }
            this.f9385c.f9373b = 1;
        }
        return iArr;
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f9384b.position(Math.min(this.f9384b.position() + iC, this.f9384b.limit()));
        } while (iC > 0);
    }
}
