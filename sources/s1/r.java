package s1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import i.C0803c;
import j1.EnumC0844b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import m1.C1010h;
import m1.InterfaceC1006d;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j1.l f12586f = j1.l.a(EnumC0844b.f9430y, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j1.l f12587g = new j1.l("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, j1.l.f9437e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j1.l f12588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j1.l f12589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final I0.o f12590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f12591k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1006d f12592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f12593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1010h f12594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f12596e = x.a();

    static {
        n nVar = o.f12579a;
        Boolean bool = Boolean.FALSE;
        f12588h = j1.l.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f12589i = j1.l.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f12590j = new I0.o(16);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = C1.n.f134a;
        f12591k = new ArrayDeque(0);
    }

    public r(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC1006d interfaceC1006d, C1010h c1010h) {
        this.f12595d = arrayList;
        AbstractC1332d.l(displayMetrics, "Argument must not be null");
        this.f12593b = displayMetrics;
        AbstractC1332d.l(interfaceC1006d, "Argument must not be null");
        this.f12592a = interfaceC1006d;
        AbstractC1332d.l(c1010h, "Argument must not be null");
        this.f12594c = c1010h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(i.C0803c r5, android.graphics.BitmapFactory.Options r6, s1.q r7, m1.InterfaceC1006d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L22
            r7.t()
            int r1 = r5.f9276w
            switch(r1) {
                case 20: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r5.f9277x
            com.bumptech.glide.load.data.n r1 = (com.bumptech.glide.load.data.n) r1
            java.lang.Object r1 = r1.f6388b
            s1.y r1 = (s1.y) r1
            monitor-enter(r1)
            byte[] r2 = r1.f12611w     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f12613y = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L22:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = s1.C.f12543b
            r4.lock()
            android.graphics.Bitmap r5 = r5.n(r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L47
            r4.unlock()
            return r5
        L35:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L49
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r5 = move-exception
            goto L5f
        L49:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L5e
            r8.d(r0)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L5d
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L5d
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L5d
            java.util.concurrent.locks.Lock r6 = s1.C.f12543b
            r6.unlock()
            return r5
        L5d:
            throw r1     // Catch: java.lang.Throwable -> L47
        L5e:
            throw r1     // Catch: java.lang.Throwable -> L47
        L5f:
            java.util.concurrent.locks.Lock r6 = s1.C.f12543b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.r.c(i.c, android.graphics.BitmapFactory$Options, s1.q, m1.d):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i6, int i7, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i6 + ", outHeight: " + i7 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C1295d a(C0803c c0803c, int i6, int i7, j1.m mVar, q qVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f12594c.c(65536, byte[].class);
        synchronized (r.class) {
            arrayDeque = f12591k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC0844b enumC0844b = (EnumC0844b) mVar.c(f12586f);
        j1.n nVar = (j1.n) mVar.c(f12587g);
        o oVar = (o) mVar.c(o.f12584f);
        boolean zBooleanValue = ((Boolean) mVar.c(f12588h)).booleanValue();
        j1.l lVar = f12589i;
        try {
            C1295d c1295dE = C1295d.e(b(c0803c, options2, oVar, enumC0844b, nVar, mVar.c(lVar) != null && ((Boolean) mVar.c(lVar)).booleanValue(), i6, i7, zBooleanValue, qVar), this.f12592a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f12594c.g(bArr);
            return c1295dE;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = f12591k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f12594c.g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0486, code lost:
    
        if (r0 >= 26) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0439 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022b  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [m1.d] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r48v0, types: [s1.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(i.C0803c r39, android.graphics.BitmapFactory.Options r40, s1.o r41, j1.EnumC0844b r42, j1.n r43, boolean r44, int r45, int r46, boolean r47, s1.q r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.r.b(i.c, android.graphics.BitmapFactory$Options, s1.o, j1.b, j1.n, boolean, int, int, boolean, s1.q):android.graphics.Bitmap");
    }
}
