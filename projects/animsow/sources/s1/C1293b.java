package s1;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import m1.C1010h;

/* JADX INFO: renamed from: s1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1293b implements j1.p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j1.l f12560x = j1.l.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j1.l f12561y = new j1.l("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, j1.l.f9437e);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1010h f12562w;

    public C1293b(C1010h c1010h) {
        this.f12562w = c1010h;
    }

    @Override // j1.p
    public final int e(j1.m mVar) {
        return 2;
    }

    @Override // j1.InterfaceC0845c
    public final boolean m(Object obj, File file, j1.m mVar) throws Throwable {
        boolean z5;
        Bitmap bitmap = (Bitmap) ((l1.F) obj).a();
        j1.l lVar = f12561y;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) mVar.c(lVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i6 = C1.h.f123b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) mVar.c(f12560x)).intValue();
        OutputStream cVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C1010h c1010h = this.f12562w;
                if (c1010h != null) {
                    try {
                        cVar = new com.bumptech.glide.load.data.c(fileOutputStream, c1010h);
                    } catch (IOException e6) {
                        e = e6;
                        cVar = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused) {
                            }
                        }
                        z5 = false;
                    } catch (Throwable th) {
                        th = th;
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    cVar = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, cVar);
                cVar.close();
                try {
                    cVar.close();
                } catch (IOException unused3) {
                }
                z5 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e = e7;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + C1.n.c(bitmap) + " in " + C1.h.a(jElapsedRealtimeNanos) + ", options format: " + mVar.c(lVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z5;
    }
}
