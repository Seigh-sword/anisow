package H1;

import android.content.Context;
import d.RunnableC0632m;
import i.C0803c;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import p1.C1244j;

/* JADX INFO: loaded from: classes.dex */
public final class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile k f958e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P1.a f959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P1.a f960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L1.c f961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M1.j f962d;

    public u(P1.a aVar, P1.a aVar2, L1.c cVar, M1.j jVar, M1.l lVar) {
        this.f959a = aVar;
        this.f960b = aVar2;
        this.f961c = cVar;
        this.f962d = jVar;
        lVar.getClass();
        lVar.f1804a.execute(new RunnableC0632m(12, lVar));
    }

    public static u a() {
        k kVar = f958e;
        if (kVar != null) {
            return (u) kVar.f938B.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f958e == null) {
            synchronized (u.class) {
                try {
                    if (f958e == null) {
                        C1244j c1244j = new C1244j(0);
                        context.getClass();
                        c1244j.f12256x = context;
                        f958e = c1244j.a();
                    }
                } finally {
                }
            }
        }
    }

    public final r c(F1.a aVar) {
        Set setSingleton;
        byte[] bytes;
        if (aVar instanceof l) {
            aVar.getClass();
            setSingleton = Collections.unmodifiableSet(F1.a.f601d);
        } else {
            setSingleton = Collections.singleton(new E1.c("proto"));
        }
        C0803c c0803cA = j.a();
        aVar.getClass();
        c0803cA.Q("cct");
        String str = aVar.f604a;
        String str2 = aVar.f605b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        c0803cA.f9278y = bytes;
        return new r(setSingleton, c0803cA.k(), this);
    }
}
