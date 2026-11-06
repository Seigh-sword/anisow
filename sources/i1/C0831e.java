package i1;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import m1.C1010h;
import m1.InterfaceC1006d;
import u1.C1358b;

/* JADX INFO: renamed from: i1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831e implements InterfaceC0827a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f9387a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1358b f9389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f9390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f9391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f9392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f9393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f9394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f9395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f9396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0829c f9398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f9399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f9405s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9388b = new int[256];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f9406t = Bitmap.Config.ARGB_8888;

    public C0831e(C1358b c1358b, C0829c c0829c, ByteBuffer byteBuffer, int i6) {
        this.f9389c = c1358b;
        this.f9398l = new C0829c();
        synchronized (this) {
            try {
                if (i6 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i6);
                }
                int iHighestOneBit = Integer.highestOneBit(i6);
                this.f9401o = 0;
                this.f9398l = c0829c;
                this.f9397k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f9390d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f9390d.order(ByteOrder.LITTLE_ENDIAN);
                this.f9400n = false;
                Iterator it = c0829c.f9376e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C0828b) it.next()).f9367g == 3) {
                        this.f9400n = true;
                        break;
                    }
                }
                this.f9402p = iHighestOneBit;
                int i7 = c0829c.f9377f;
                this.f9404r = i7 / iHighestOneBit;
                int i8 = c0829c.f9378g;
                this.f9403q = i8 / iHighestOneBit;
                this.f9395i = this.f9389c.h(i7 * i8);
                C1358b c1358b2 = this.f9389c;
                int i9 = this.f9404r * this.f9403q;
                Object obj = c1358b2.f12823y;
                this.f9396j = ((C1010h) obj) == null ? new int[i9] : (int[]) ((C1010h) obj).c(i9, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f9405s;
        Bitmap bitmapG = ((InterfaceC1006d) this.f9389c.f12822x).g(this.f9404r, this.f9403q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f9406t);
        bitmapG.setHasAlpha(true);
        return bitmapG;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.f9398l.f9374c <= 0 || this.f9397k < 0) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "Unable to decode frame, frameCount=" + this.f9398l.f9374c + ", framePointer=" + this.f9397k);
                }
                this.f9401o = 1;
            }
            int i6 = this.f9401o;
            if (i6 != 1 && i6 != 2) {
                this.f9401o = 0;
                if (this.f9391e == null) {
                    this.f9391e = this.f9389c.h(255);
                }
                C0828b c0828b = (C0828b) this.f9398l.f9376e.get(this.f9397k);
                int i7 = this.f9397k - 1;
                C0828b c0828b2 = i7 >= 0 ? (C0828b) this.f9398l.f9376e.get(i7) : null;
                int[] iArr = c0828b.f9371k;
                if (iArr == null) {
                    iArr = this.f9398l.f9372a;
                }
                this.f9387a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("e", 3)) {
                        Log.d("e", "No valid color table found for frame #" + this.f9397k);
                    }
                    this.f9401o = 1;
                    return null;
                }
                if (c0828b.f9366f) {
                    System.arraycopy(iArr, 0, this.f9388b, 0, iArr.length);
                    int[] iArr2 = this.f9388b;
                    this.f9387a = iArr2;
                    iArr2[c0828b.f9368h] = 0;
                    if (c0828b.f9367g == 2 && this.f9397k == 0) {
                        this.f9405s = Boolean.TRUE;
                    }
                }
                return d(c0828b, c0828b2);
            }
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, status=" + this.f9401o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f9406t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v32, types: [short] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(i1.C0828b r34, i1.C0828b r35) {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C0831e.d(i1.b, i1.b):android.graphics.Bitmap");
    }
}
