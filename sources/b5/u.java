package b5;

import f5.C0710g;
import f5.E;
import f5.G;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class u implements E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6052A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public short f6053B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f5.i f6054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte f6056y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6057z;

    public u(f5.i iVar) {
        this.f6054w = iVar;
    }

    @Override // f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        int i6;
        int i7;
        do {
            int i8 = this.f6052A;
            f5.i iVar = this.f6054w;
            if (i8 != 0) {
                long jG = iVar.G(c0710g, Math.min(j6, i8));
                if (jG == -1) {
                    return -1L;
                }
                this.f6052A = (int) (((long) this.f6052A) - jG);
                return jG;
            }
            iVar.a(this.f6053B);
            this.f6053B = (short) 0;
            if ((this.f6056y & 4) != 0) {
                return -1L;
            }
            i6 = this.f6057z;
            int iN = v.n(iVar);
            this.f6052A = iN;
            this.f6055x = iN;
            byte b6 = (byte) (iVar.readByte() & 255);
            this.f6056y = (byte) (iVar.readByte() & 255);
            Logger logger = v.f6058A;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, this.f6057z, this.f6055x, b6, this.f6056y));
            }
            i7 = iVar.readInt() & Integer.MAX_VALUE;
            this.f6057z = i7;
            if (b6 != 9) {
                g.c("%s != TYPE_CONTINUATION", Byte.valueOf(b6));
                throw null;
            }
        } while (i7 == i6);
        g.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // f5.E
    public final G d() {
        return this.f6054w.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
