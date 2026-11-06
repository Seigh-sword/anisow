package x1;

import V4.p;
import java.util.ArrayList;

/* JADX INFO: renamed from: x1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13667a;

    public C1486b(int i6) {
        if (i6 == 1) {
            this.f13667a = new ArrayList();
        } else if (i6 != 2) {
            this.f13667a = new ArrayList();
        } else {
            this.f13667a = new ArrayList(20);
        }
    }

    public final void a(String str, String str2) {
        p.a(str);
        p.b(str2, str);
        b(str, str2);
    }

    public final void b(String str, String str2) {
        ArrayList arrayList = this.f13667a;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public final void c(String str) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f13667a;
            if (i6 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i6))) {
                arrayList.remove(i6);
                arrayList.remove(i6);
                i6 -= 2;
            }
            i6 += 2;
        }
    }

    public final void d(String str, String str2) {
        p.a(str);
        p.b(str2, str);
        c(str);
        b(str, str2);
    }
}
