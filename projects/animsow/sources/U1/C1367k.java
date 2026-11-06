package u1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j1.m;
import j1.o;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import m1.C1010h;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: u1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1367k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1010h f12865c;

    public C1367k(ArrayList arrayList, C1357a c1357a, C1010h c1010h) {
        this.f12863a = arrayList;
        this.f12864b = c1357a;
        this.f12865c = c1010h;
    }

    @Override // j1.o
    public final boolean a(Object obj, m mVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) mVar.c(AbstractC1366j.f12862b)).booleanValue()) {
            if (AbstractC1332d.L(this.f12865c, inputStream, this.f12863a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // j1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l1.F b(java.lang.Object r6, int r7, int r8, j1.m r9) {
        /*
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L18
        Lc:
            int r3 = r6.read(r1)     // Catch: java.io.IOException -> L18
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.io.IOException -> L18
            goto Lc
        L18:
            r6 = move-exception
            goto L22
        L1a:
            r0.flush()     // Catch: java.io.IOException -> L18
            byte[] r6 = r0.toByteArray()
            goto L31
        L22:
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = "Error reading data from stream"
            android.util.Log.w(r1, r0, r6)
        L30:
            r6 = r2
        L31:
            if (r6 != 0) goto L34
            goto L3e
        L34:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            j1.o r0 = r5.f12864b
            l1.F r2 = r0.b(r6, r7, r8, r9)
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C1367k.b(java.lang.Object, int, int, j1.m):l1.F");
    }
}
