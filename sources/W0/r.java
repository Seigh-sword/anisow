package w0;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class r implements A0.e, Closeable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final TreeMap f13543E = new TreeMap();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final byte[][] f13544A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int[] f13545B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f13546C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13547D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile String f13548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long[] f13549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final double[] f13550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String[] f13551z;

    public r(int i6) {
        this.f13546C = i6;
        int i7 = i6 + 1;
        this.f13545B = new int[i7];
        this.f13549x = new long[i7];
        this.f13550y = new double[i7];
        this.f13551z = new String[i7];
        this.f13544A = new byte[i7][];
    }

    public static r b(int i6, String str) {
        TreeMap treeMap = f13543E;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i6));
                if (entryCeilingEntry == null) {
                    r rVar = new r(i6);
                    rVar.f13548w = str;
                    rVar.f13547D = i6;
                    return rVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                r rVar2 = (r) entryCeilingEntry.getValue();
                rVar2.f13548w = str;
                rVar2.f13547D = i6;
                return rVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i6, long j6) {
        this.f13545B[i6] = 2;
        this.f13549x[i6] = j6;
    }

    @Override // A0.e
    public final void g(B0.f fVar) {
        for (int i6 = 1; i6 <= this.f13547D; i6++) {
            int i7 = this.f13545B[i6];
            if (i7 == 1) {
                fVar.h(i6);
            } else if (i7 == 2) {
                fVar.g(i6, this.f13549x[i6]);
            } else if (i7 == 3) {
                fVar.c(i6, this.f13550y[i6]);
            } else if (i7 == 4) {
                fVar.k(i6, this.f13551z[i6]);
            } else if (i7 == 5) {
                fVar.b(i6, this.f13544A[i6]);
            }
        }
    }

    public final void h(int i6) {
        this.f13545B[i6] = 1;
    }

    @Override // A0.e
    public final String k() {
        return this.f13548w;
    }

    public final void l(int i6, String str) {
        this.f13545B[i6] = 4;
        this.f13551z[i6] = str;
    }

    public final void n() {
        TreeMap treeMap = f13543E;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f13546C), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i6 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i6;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
