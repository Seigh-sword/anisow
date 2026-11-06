package w0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f13559a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f13560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile B0.g f13561c;

    public t(p pVar) {
        this.f13560b = pVar;
    }

    public final B0.g a() {
        this.f13560b.a();
        if (!this.f13559a.compareAndSet(false, true)) {
            String strB = b();
            p pVar = this.f13560b;
            pVar.a();
            pVar.b();
            return new B0.g(((B0.b) pVar.f13533c.C()).f62w.compileStatement(strB));
        }
        if (this.f13561c == null) {
            String strB2 = b();
            p pVar2 = this.f13560b;
            pVar2.a();
            pVar2.b();
            this.f13561c = new B0.g(((B0.b) pVar2.f13533c.C()).f62w.compileStatement(strB2));
        }
        return this.f13561c;
    }

    public abstract String b();

    public final void c(B0.g gVar) {
        if (gVar == this.f13561c) {
            this.f13559a.set(false);
        }
    }
}
