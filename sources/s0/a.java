package S0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f3056A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f3057y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ J0.k f3058z;

    public /* synthetic */ a(J0.k kVar, Object obj, int i6) {
        this.f3057y = i6;
        this.f3058z = kVar;
        this.f3056A = obj;
    }

    @Override // S0.c
    public final void c() {
        WorkDatabase workDatabase;
        int i6 = this.f3057y;
        Object obj = this.f3056A;
        J0.k kVar = this.f3058z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                workDatabase = kVar.f1208j;
                workDatabase.c();
                try {
                    c.a(kVar, ((UUID) obj).toString());
                    workDatabase.h();
                    workDatabase.f();
                    J0.d.a(kVar.f1207i, kVar.f1208j, kVar.f1210l);
                    return;
                } finally {
                    workDatabase.f();
                }
            default:
                workDatabase = kVar.f1208j;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().j((String) obj).iterator();
                    while (it.hasNext()) {
                        c.a(kVar, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    J0.d.a(kVar.f1207i, kVar.f1208j, kVar.f1210l);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
