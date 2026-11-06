package Q3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class l extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f2809b;

    public l(A a6, int i6) {
        this.f2808a = i6;
        this.f2809b = a6;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) {
        int i6 = this.f2808a;
        A a6 = this.f2809b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new AtomicLong(((Number) a6.b(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.J()) {
                    arrayList.add(Long.valueOf(((Number) a6.b(aVar)).longValue()));
                }
                aVar.k();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i7 = 0; i7 < size; i7++) {
                    atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.W() != 9) {
                    return a6.b(aVar);
                }
                aVar.S();
                return null;
        }
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        int i6 = this.f2808a;
        A a6 = this.f2809b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                a6.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.c();
                int length = atomicLongArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    a6.c(bVar, Long.valueOf(atomicLongArray.get(i7)));
                }
                bVar.k();
                break;
            default:
                if (obj == null) {
                    bVar.J();
                } else {
                    a6.c(bVar, obj);
                }
                break;
        }
    }
}
