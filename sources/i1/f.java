package I1;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1358b f1132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1134c;

    public f(Context context, d dVar) {
        C1358b c1358b = new C1358b(context);
        this.f1134c = new HashMap();
        this.f1132a = c1358b;
        this.f1133b = dVar;
    }

    public final synchronized h a(String str) {
        if (this.f1134c.containsKey(str)) {
            return (h) this.f1134c.get(str);
        }
        CctBackendFactory cctBackendFactoryD = this.f1132a.d(str);
        if (cctBackendFactoryD == null) {
            return null;
        }
        d dVar = this.f1133b;
        h hVarCreate = cctBackendFactoryD.create(new b(dVar.f1125a, dVar.f1126b, dVar.f1127c, str));
        this.f1134c.put(str, hVarCreate);
        return hVarCreate;
    }
}
