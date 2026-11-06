package S0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f3059A = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ J0.k f3060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f3061z;

    public b(J0.k kVar, String str) {
        this.f3060y = kVar;
        this.f3061z = str;
    }

    @Override // S0.c
    public final void c() {
        J0.k kVar = this.f3060y;
        WorkDatabase workDatabase = kVar.f1208j;
        workDatabase.c();
        try {
            Iterator it = workDatabase.n().i(this.f3061z).iterator();
            while (it.hasNext()) {
                c.a(kVar, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f3059A) {
                J0.d.a(kVar.f1207i, kVar.f1208j, kVar.f1210l);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
