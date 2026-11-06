package m1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: m1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1011i implements InterfaceC1006d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Bitmap.Config f10457F = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f10458A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10459B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10460C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10461D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f10462E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1012j f10463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Set f10464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final V0.m f10465y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f10466z;

    public C1011i(long j6) {
        n nVar = new n();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i6 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i6 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f10466z = j6;
        this.f10463w = nVar;
        this.f10464x = setUnmodifiableSet;
        this.f10465y = new V0.m(7);
    }

    @Override // m1.InterfaceC1006d
    public final Bitmap a(int i6, int i7, Bitmap.Config config) {
        Bitmap bitmapC = c(i6, i7, config);
        if (bitmapC != null) {
            bitmapC.eraseColor(0);
            return bitmapC;
        }
        if (config == null) {
            config = f10457F;
        }
        return Bitmap.createBitmap(i6, i7, config);
    }

    public final void b() {
        Log.v("LruBitmapPool", "Hits=" + this.f10459B + ", misses=" + this.f10460C + ", puts=" + this.f10461D + ", evictions=" + this.f10462E + ", currentSize=" + this.f10458A + ", maxSize=" + this.f10466z + "\nStrategy=" + this.f10463w);
    }

    public final synchronized Bitmap c(int i6, int i7, Bitmap.Config config) {
        Bitmap bitmapA;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapA = this.f10463w.a(i6, i7, config != null ? config : f10457F);
            if (bitmapA == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f10463w.f(i6, i7, config));
                }
                this.f10460C++;
            } else {
                this.f10459B++;
                this.f10458A -= (long) this.f10463w.c(bitmapA);
                this.f10465y.getClass();
                bitmapA.setHasAlpha(true);
                bitmapA.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f10463w.f(i6, i7, config));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapA;
    }

    @Override // m1.InterfaceC1006d
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f10463w.c(bitmap) <= this.f10466z && this.f10464x.contains(bitmap.getConfig())) {
                int iC = this.f10463w.c(bitmap);
                this.f10463w.d(bitmap);
                this.f10465y.getClass();
                this.f10461D++;
                this.f10458A += (long) iC;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f10463w.i(bitmap));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    b();
                }
                f(this.f10466z);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f10463w.i(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f10464x.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // m1.InterfaceC1006d
    public final void e(int i6) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i6);
        }
        if (i6 >= 40 || i6 >= 20) {
            i();
        } else if (i6 >= 20 || i6 == 15) {
            f(this.f10466z / 2);
        }
    }

    public final synchronized void f(long j6) {
        while (this.f10458A > j6) {
            try {
                Bitmap bitmapRemoveLast = this.f10463w.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        b();
                    }
                    this.f10458A = 0L;
                    return;
                }
                this.f10465y.getClass();
                this.f10458A -= (long) this.f10463w.c(bitmapRemoveLast);
                this.f10462E++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f10463w.i(bitmapRemoveLast));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    b();
                }
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m1.InterfaceC1006d
    public final Bitmap g(int i6, int i7, Bitmap.Config config) {
        Bitmap bitmapC = c(i6, i7, config);
        if (bitmapC != null) {
            return bitmapC;
        }
        if (config == null) {
            config = f10457F;
        }
        return Bitmap.createBitmap(i6, i7, config);
    }

    @Override // m1.InterfaceC1006d
    public final void i() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        f(0L);
    }
}
