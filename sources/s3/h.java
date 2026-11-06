package S3;

import Q3.A;
import Q3.B;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A f3249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q3.n f3252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TypeToken f3253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f3254f;

    public h(i iVar, boolean z5, boolean z6, Q3.n nVar, TypeToken typeToken) {
        this.f3254f = iVar;
        this.f3250b = z5;
        this.f3251c = z6;
        this.f3252d = nVar;
        this.f3253e = typeToken;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        if (this.f3250b) {
            aVar.c0();
            return null;
        }
        A a6 = this.f3249a;
        if (a6 == null) {
            Q3.n nVar = this.f3252d;
            List list = nVar.f2815e;
            B b6 = this.f3254f;
            if (!list.contains(b6)) {
                b6 = nVar.f2814d;
            }
            Iterator it = list.iterator();
            boolean z5 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                TypeToken typeToken = this.f3253e;
                if (!zHasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
                }
                B b7 = (B) it.next();
                if (z5) {
                    A a7 = b7.a(nVar, typeToken);
                    if (a7 != null) {
                        this.f3249a = a7;
                        a6 = a7;
                        break;
                    }
                } else if (b7 == b6) {
                    z5 = true;
                }
            }
        }
        return a6.b(aVar);
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        if (this.f3251c) {
            bVar.J();
            return;
        }
        A a6 = this.f3249a;
        if (a6 == null) {
            Q3.n nVar = this.f3252d;
            List list = nVar.f2815e;
            B b6 = this.f3254f;
            if (!list.contains(b6)) {
                b6 = nVar.f2814d;
            }
            Iterator it = list.iterator();
            boolean z5 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                TypeToken typeToken = this.f3253e;
                if (!zHasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
                }
                B b7 = (B) it.next();
                if (z5) {
                    A a7 = b7.a(nVar, typeToken);
                    if (a7 != null) {
                        this.f3249a = a7;
                        a6 = a7;
                        break;
                    }
                } else if (b7 == b6) {
                    z5 = true;
                }
            }
        }
        a6.c(bVar, obj);
    }
}
