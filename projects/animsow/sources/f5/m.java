package f5;

import j3.C0871u;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f8472a;

    static {
        s sVar;
        try {
            Class.forName("java.nio.file.Files");
            sVar = new t();
        } catch (ClassNotFoundException unused) {
            sVar = new s();
        }
        f8472a = sVar;
        String str = w.f8492x;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC1305a.n(property, "getProperty(\"java.io.tmpdir\")");
        B3.e.o(property, false);
        ClassLoader classLoader = g5.e.class.getClassLoader();
        AbstractC1305a.n(classLoader, "ResourceFileSystem::class.java.classLoader");
        new g5.e(classLoader);
    }

    public abstract void a(w wVar, w wVar2);

    public abstract void b(w wVar);

    public abstract void c(w wVar);

    public final boolean d(w wVar) {
        AbstractC1305a.o(wVar, "path");
        return e(wVar) != null;
    }

    public abstract C0871u e(w wVar);

    public abstract r f(w wVar);

    public abstract r g(w wVar);

    public abstract E h(w wVar);
}
