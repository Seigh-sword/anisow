package u1;

import V0.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import i1.C0829c;
import i1.C0830d;
import i1.C0831e;
import j1.EnumC0844b;
import j1.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import l1.F;
import m1.C1010h;
import m1.InterfaceC1006d;
import t0.AbstractC1332d;
import t1.C1340c;

/* JADX INFO: renamed from: u1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1357a implements o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f12814f = new m(18);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S0.f f12815g = new S0.f(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S0.f f12818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f12819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1358b f12820e;

    public C1357a(Context context, ArrayList arrayList, InterfaceC1006d interfaceC1006d, C1010h c1010h) {
        S0.f fVar = f12815g;
        m mVar = f12814f;
        this.f12816a = context.getApplicationContext();
        this.f12817b = arrayList;
        this.f12819d = mVar;
        this.f12820e = new C1358b(interfaceC1006d, 0, c1010h);
        this.f12818c = fVar;
    }

    public static int d(C0829c c0829c, int i6, int i7) {
        int iMin = Math.min(c0829c.f9378g / i7, c0829c.f9377f / i6);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i6 + "x" + i7 + "], actual dimens: [" + c0829c.f9377f + "x" + c0829c.f9378g + "]");
        }
        return iMax;
    }

    @Override // j1.o
    public final boolean a(Object obj, j1.m mVar) {
        return !((Boolean) mVar.c(AbstractC1366j.f12862b)).booleanValue() && AbstractC1332d.K(this.f12817b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // j1.o
    public final F b(Object obj, int i6, int i7, j1.m mVar) {
        C0830d c0830d;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        S0.f fVar = this.f12818c;
        synchronized (fVar) {
            try {
                C0830d c0830d2 = (C0830d) ((Queue) fVar.f3073x).poll();
                if (c0830d2 == null) {
                    c0830d2 = new C0830d();
                }
                c0830d = c0830d2;
                c0830d.f9384b = null;
                Arrays.fill(c0830d.f9383a, (byte) 0);
                c0830d.f9385c = new C0829c();
                c0830d.f9386d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c0830d.f9384b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c0830d.f9384b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i6, i7, c0830d, mVar);
        } finally {
            this.f12818c.G(c0830d);
        }
    }

    public final C1340c c(ByteBuffer byteBuffer, int i6, int i7, C0830d c0830d, j1.m mVar) throws Throwable {
        C0829c c0829cB;
        Bitmap.Config config;
        int i8 = C1.h.f123b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i9 = 2;
        try {
            c0829cB = c0830d.b();
        } catch (Throwable th) {
            th = th;
            i9 = 2;
        }
        if (c0829cB.f9374c > 0 && c0829cB.f9373b == 0) {
            if (mVar.c(AbstractC1366j.f12861a) == EnumC0844b.f9429x) {
                try {
                    config = Bitmap.Config.RGB_565;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            int iD = d(c0829cB, i6, i7);
            m mVar2 = this.f12819d;
            C1358b c1358b = this.f12820e;
            mVar2.getClass();
            C0831e c0831e = new C0831e(c1358b, c0829cB, byteBuffer, iD);
            c0831e.c(config);
            c0831e.f9397k = (c0831e.f9397k + 1) % c0831e.f9398l.f9374c;
            Bitmap bitmapB = c0831e.b();
            if (bitmapB == null) {
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1.h.a(jElapsedRealtimeNanos));
                }
                return null;
            }
            C1340c c1340c = new C1340c(new C1360d(new C1359c(new C1365i(com.bumptech.glide.b.a(this.f12816a), c0831e, i6, i7, r1.d.f12436b, bitmapB))), 1);
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1.h.a(jElapsedRealtimeNanos));
            }
            return c1340c;
            if (Log.isLoggable("BufferGifDecoder", i9)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1.h.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
        if (Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1.h.a(jElapsedRealtimeNanos));
        }
        return null;
    }
}
