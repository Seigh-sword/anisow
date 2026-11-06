package v1;

import j1.p;
import java.util.ArrayList;
import java.util.List;
import x1.C1489e;

/* JADX INFO: renamed from: v1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1419c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13295a;

    public C1419c(int i6) {
        if (i6 == 1) {
            this.f13295a = new ArrayList();
        } else if (i6 == 2) {
            this.f13295a = new ArrayList();
        } else if (i6 != 3) {
            this.f13295a = new ArrayList();
        }
    }

    public final synchronized p a(Class cls) {
        int size = this.f13295a.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1489e c1489e = (C1489e) this.f13295a.get(i6);
            if (c1489e.f13674a.isAssignableFrom(cls)) {
                return c1489e.f13675b;
            }
        }
        return null;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1418b c1418b : this.f13295a) {
            if (c1418b.f13292a.isAssignableFrom(cls) && cls2.isAssignableFrom(c1418b.f13293b) && !arrayList.contains(c1418b.f13293b)) {
                arrayList.add(c1418b.f13293b);
            }
        }
        return arrayList;
    }
}
