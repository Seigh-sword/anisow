package f5;

import j3.C0871u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.Inflater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f8437e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f8438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f8439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8440d;

    static {
        String str = w.f8492x;
        f8437e = B3.e.o("/", false);
    }

    public H(w wVar, s sVar, LinkedHashMap linkedHashMap) {
        this.f8438b = wVar;
        this.f8439c = sVar;
        this.f8440d = linkedHashMap;
    }

    @Override // f5.m
    public final void a(w wVar, w wVar2) throws IOException {
        AbstractC1305a.o(wVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // f5.m
    public final void b(w wVar) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // f5.m
    public final void c(w wVar) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // f5.m
    public final C0871u e(w wVar) throws Throwable {
        y yVarD;
        AbstractC1305a.o(wVar, "path");
        w wVar2 = f8437e;
        wVar2.getClass();
        g5.f fVar = (g5.f) this.f8440d.get(g5.c.b(wVar2, wVar, true));
        Throwable th = null;
        if (fVar == null) {
            return null;
        }
        boolean z5 = fVar.f8546b;
        C0871u c0871u = new C0871u(!z5, z5, null, z5 ? null : Long.valueOf(fVar.f8548d), null, fVar.f8550f, null);
        long j6 = fVar.f8551g;
        if (j6 == -1) {
            return c0871u;
        }
        r rVarF = this.f8439c.f(this.f8438b);
        try {
            yVarD = f2.h.d(rVarF.h(j6));
            try {
                rVarF.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (rVarF != null) {
                try {
                    rVarF.close();
                } catch (Throwable th4) {
                    AbstractC1305a.b(th3, th4);
                }
            }
            yVarD = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        AbstractC1305a.l(yVarD);
        C0871u c0871uF = g5.b.f(yVarD, c0871u);
        AbstractC1305a.l(c0871uF);
        return c0871uF;
    }

    @Override // f5.m
    public final r f(w wVar) {
        AbstractC1305a.o(wVar, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // f5.m
    public final r g(w wVar) throws IOException {
        throw new IOException("zip entries are not writable");
    }

    @Override // f5.m
    public final E h(w wVar) throws Throwable {
        Throwable th;
        y yVarD;
        AbstractC1305a.o(wVar, "file");
        w wVar2 = f8437e;
        wVar2.getClass();
        g5.f fVar = (g5.f) this.f8440d.get(g5.c.b(wVar2, wVar, true));
        if (fVar == null) {
            throw new FileNotFoundException("no such file: " + wVar);
        }
        r rVarF = this.f8439c.f(this.f8438b);
        try {
            yVarD = f2.h.d(rVarF.h(fVar.f8551g));
            try {
                rVarF.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (rVarF != null) {
                try {
                    rVarF.close();
                } catch (Throwable th4) {
                    AbstractC1305a.b(th3, th4);
                }
            }
            th = th3;
            yVarD = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC1305a.l(yVarD);
        g5.b.f(yVarD, null);
        int i6 = fVar.f8549e;
        long j6 = fVar.f8548d;
        if (i6 == 0) {
            return new g5.d(yVarD, j6, true);
        }
        return new g5.d(new q(f2.h.d(new g5.d(yVarD, fVar.f8547c, true)), new Inflater(true)), j6, false);
    }
}
