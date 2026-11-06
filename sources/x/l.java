package x;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f13635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f13636b;

    public static long a(f fVar, long j6) {
        p pVar = fVar.f13623d;
        if (pVar instanceof j) {
            return j6;
        }
        ArrayList arrayList = fVar.f13630k;
        int size = arrayList.size();
        long jMin = j6;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f13623d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f13625f) + j6));
                }
            }
        }
        if (fVar != pVar.f13661i) {
            return jMin;
        }
        long j7 = pVar.j();
        f fVar3 = pVar.f13660h;
        long j8 = j6 - j7;
        return Math.min(Math.min(jMin, a(fVar3, j8)), j8 - ((long) fVar3.f13625f));
    }

    public static long b(f fVar, long j6) {
        p pVar = fVar.f13623d;
        if (pVar instanceof j) {
            return j6;
        }
        ArrayList arrayList = fVar.f13630k;
        int size = arrayList.size();
        long jMax = j6;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f13623d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f13625f) + j6));
                }
            }
        }
        if (fVar != pVar.f13660h) {
            return jMax;
        }
        long j7 = pVar.j();
        f fVar3 = pVar.f13661i;
        long j8 = j6 + j7;
        return Math.max(Math.max(jMax, b(fVar3, j8)), j8 - ((long) fVar3.f13625f));
    }
}
