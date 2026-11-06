package s1;

import android.util.Log;
import c0.C0350A;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import m1.C1010h;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class m implements j1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f12576a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f12577b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(l lVar, C1010h c1010h) {
        try {
            int iC = lVar.c();
            if ((iC & 65496) != 65496 && iC != 19789 && iC != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iC);
                }
                return -1;
            }
            int iG = g(lVar);
            if (iG == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) c1010h.c(iG, byte[].class);
            try {
                return h(lVar, bArr, iG);
            } finally {
                c1010h.g(bArr);
            }
        } catch (k unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(l lVar) {
        try {
            int iC = lVar.c();
            if (iC == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iO = (iC << 8) | lVar.o();
            if (iO == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iO2 = (iO << 8) | lVar.o();
            if (iO2 == -1991225785) {
                lVar.a(21L);
                try {
                    return lVar.o() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (k unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iO2 == 1380533830) {
                lVar.a(4L);
                if (((lVar.c() << 16) | lVar.c()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iC2 = (lVar.c() << 16) | lVar.c();
                if ((iC2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i6 = iC2 & 255;
                if (i6 == 88) {
                    lVar.a(4L);
                    short sO = lVar.o();
                    return (sO & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sO & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i6 != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                lVar.a(4L);
                return (lVar.o() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((lVar.c() << 16) | lVar.c()) == 1718909296) {
                int iC3 = (lVar.c() << 16) | lVar.c();
                if (iC3 != 1635150195) {
                    int i7 = 0;
                    boolean z5 = iC3 == 1635150182;
                    lVar.a(4L);
                    int i8 = iO2 - 16;
                    if (i8 % 4 == 0) {
                        while (i7 < 5 && i8 > 0) {
                            int iC4 = (lVar.c() << 16) | lVar.c();
                            if (iC4 != 1635150195) {
                                if (iC4 == 1635150182) {
                                    z5 = true;
                                }
                                i7++;
                                i8 -= 4;
                            }
                        }
                    }
                    if (z5) {
                        return ImageHeaderParser$ImageType.AVIF;
                    }
                }
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            return ImageHeaderParser$ImageType.UNKNOWN;
        } catch (k unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(l lVar) {
        short sO;
        int iC;
        long j6;
        long jA;
        do {
            short sO2 = lVar.o();
            if (sO2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sO2));
                }
                return -1;
            }
            sO = lVar.o();
            if (sO == 218) {
                return -1;
            }
            if (sO == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iC = lVar.c() - 2;
            if (sO == 225) {
                return iC;
            }
            j6 = iC;
            jA = lVar.a(j6);
        } while (jA == j6);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sO) + ", wanted to skip: " + iC + ", but actually skipped: " + jA);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(s1.l r16, byte[] r17, int r18) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.m.h(s1.l, byte[], int):int");
    }

    @Override // j1.f
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        AbstractC1332d.l(byteBuffer, "Argument must not be null");
        return f(new C0350A(2, byteBuffer));
    }

    @Override // j1.f
    public final int b(ByteBuffer byteBuffer, C1010h c1010h) {
        AbstractC1332d.l(byteBuffer, "Argument must not be null");
        C0350A c0350a = new C0350A(2, byteBuffer);
        AbstractC1332d.l(c1010h, "Argument must not be null");
        return e(c0350a, c1010h);
    }

    @Override // j1.f
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        AbstractC1332d.l(inputStream, "Argument must not be null");
        return f(new S0.f(27, inputStream));
    }

    @Override // j1.f
    public final int d(InputStream inputStream, C1010h c1010h) {
        AbstractC1332d.l(inputStream, "Argument must not be null");
        S0.f fVar = new S0.f(27, inputStream);
        AbstractC1332d.l(c1010h, "Argument must not be null");
        return e(fVar, c1010h);
    }
}
