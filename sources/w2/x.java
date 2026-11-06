package W2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class x extends A {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ y f4464A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4465w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f4466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Iterator f4467y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Iterator f4468z;

    public x(y yVar) {
        this.f4464A = yVar;
        this.f4467y = yVar.f4469w.iterator();
        this.f4468z = yVar.f4470x.iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        Object next;
        int i6 = this.f4465w;
        if (i6 == 4) {
            throw new IllegalStateException();
        }
        int iB = u.h.b(i6);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f4465w = 4;
        Iterator it = this.f4467y;
        if (!it.hasNext()) {
            while (true) {
                Iterator it2 = this.f4468z;
                if (!it2.hasNext()) {
                    this.f4465w = 3;
                    next = null;
                    break;
                }
                next = it2.next();
                if (!this.f4464A.f4469w.contains(next)) {
                    break;
                }
            }
        } else {
            next = it.next();
        }
        this.f4466x = next;
        if (this.f4465w == 3) {
            return false;
        }
        this.f4465w = 1;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4465w = 2;
        Object obj = this.f4466x;
        this.f4466x = null;
        return obj;
    }
}
