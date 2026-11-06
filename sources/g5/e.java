package g5;

import androidx.lifecycle.V;
import f5.C0710g;
import f5.E;
import f5.j;
import f5.m;
import f5.r;
import f5.w;
import j3.C0871u;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import s4.AbstractC1305a;
import s4.C1311g;
import s4.C1314j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f8543c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1314j f8544b;

    static {
        String str = w.f8492x;
        f8543c = B3.e.o("/", false);
    }

    public e(ClassLoader classLoader) {
        this.f8544b = new C1314j(new V(7, classLoader));
    }

    public static String i(w wVar) throws EOFException {
        w wVarD;
        w wVar2 = f8543c;
        wVar2.getClass();
        AbstractC1305a.o(wVar, "child");
        w wVarB = c.b(wVar2, wVar, true);
        int iA = c.a(wVarB);
        j jVar = wVarB.f8493w;
        w wVar3 = iA == -1 ? null : new w(jVar.n(0, iA));
        int iA2 = c.a(wVar2);
        j jVar2 = wVar2.f8493w;
        if (!AbstractC1305a.c(wVar3, iA2 != -1 ? new w(jVar2.n(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + wVarB + " and " + wVar2).toString());
        }
        ArrayList arrayListA = wVarB.a();
        ArrayList arrayListA2 = wVar2.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i6 = 0;
        while (i6 < iMin && AbstractC1305a.c(arrayListA.get(i6), arrayListA2.get(i6))) {
            i6++;
        }
        if (i6 == iMin && jVar.d() == jVar2.d()) {
            String str = w.f8492x;
            wVarD = B3.e.o(".", false);
        } else {
            if (arrayListA2.subList(i6, arrayListA2.size()).indexOf(c.f8539e) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + wVarB + " and " + wVar2).toString());
            }
            C0710g c0710g = new C0710g();
            j jVarC = c.c(wVar2);
            if (jVarC == null && (jVarC = c.c(wVarB)) == null) {
                jVarC = c.f(w.f8492x);
            }
            int size = arrayListA2.size();
            for (int i7 = i6; i7 < size; i7++) {
                c0710g.U(c.f8539e);
                c0710g.U(jVarC);
            }
            int size2 = arrayListA.size();
            while (i6 < size2) {
                c0710g.U((j) arrayListA.get(i6));
                c0710g.U(jVarC);
                i6++;
            }
            wVarD = c.d(c0710g, false);
        }
        return wVarD.f8493w.q();
    }

    @Override // f5.m
    public final void a(w wVar, w wVar2) throws IOException {
        AbstractC1305a.o(wVar2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // f5.m
    public final void b(w wVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // f5.m
    public final void c(w wVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // f5.m
    public final C0871u e(w wVar) throws EOFException {
        AbstractC1305a.o(wVar, "path");
        if (!B3.e.b(wVar)) {
            return null;
        }
        String strI = i(wVar);
        for (C1311g c1311g : (List) this.f8544b.getValue()) {
            C0871u c0871uE = ((m) c1311g.f12632w).e(((w) c1311g.f12633x).d(strI));
            if (c0871uE != null) {
                return c0871uE;
            }
        }
        return null;
    }

    @Override // f5.m
    public final r f(w wVar) throws EOFException, FileNotFoundException {
        AbstractC1305a.o(wVar, "file");
        if (!B3.e.b(wVar)) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        String strI = i(wVar);
        for (C1311g c1311g : (List) this.f8544b.getValue()) {
            try {
                return ((m) c1311g.f12632w).f(((w) c1311g.f12633x).d(strI));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }

    @Override // f5.m
    public final r g(w wVar) throws IOException {
        throw new IOException("resources are not writable");
    }

    @Override // f5.m
    public final E h(w wVar) throws EOFException, FileNotFoundException {
        AbstractC1305a.o(wVar, "file");
        if (!B3.e.b(wVar)) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        String strI = i(wVar);
        for (C1311g c1311g : (List) this.f8544b.getValue()) {
            try {
                return ((m) c1311g.f12632w).h(((w) c1311g.f12633x).d(strI));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }
}
