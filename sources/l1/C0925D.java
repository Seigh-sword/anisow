package l1;

import com.google.android.gms.internal.measurement.C0396c2;
import i.C0803c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: l1.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0925D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M.b f9844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9846c;

    public C0925D(Class cls, Class cls2, Class cls3, List list, C0803c c0803c) {
        this.f9844a = c0803c;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f9845b = list;
        this.f9846c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final F a(int i6, int i7, j1.m mVar, com.bumptech.glide.load.data.g gVar, C0396c2 c0396c2) {
        M.b bVar = this.f9844a;
        Object objH = bVar.h();
        AbstractC1332d.l(objH, "Argument must not be null");
        List list = (List) objH;
        try {
            List list2 = this.f9845b;
            int size = list2.size();
            F fA = null;
            for (int i8 = 0; i8 < size; i8++) {
                try {
                    fA = ((n) list2.get(i8)).a(i6, i7, mVar, gVar, c0396c2);
                } catch (C0922A e6) {
                    list.add(e6);
                }
                if (fA != null) {
                    break;
                }
            }
            if (fA != null) {
                return fA;
            }
            throw new C0922A(this.f9846c, new ArrayList(list));
        } finally {
            bVar.d(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f9845b.toArray()) + '}';
    }
}
