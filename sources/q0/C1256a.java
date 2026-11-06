package q0;

import D3.c;
import J3.v;
import K1.d;
import M1.j;
import N1.l;
import O1.b;
import java.util.Map;
import q2.InterfaceC1258a;
import q2.i;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1256a implements b, D3.a, InterfaceC1258a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f12332y;

    public /* synthetic */ C1256a(Object obj, int i6, Object obj2) {
        this.f12330w = i6;
        this.f12331x = obj;
        this.f12332y = obj2;
    }

    @Override // q2.InterfaceC1258a
    public final Object b(i iVar) {
        v vVar = (v) this.f12331x;
        String str = (String) this.f12332y;
        synchronized (vVar) {
            vVar.f1439b.remove(str);
        }
        return iVar;
    }

    @Override // O1.b
    public final Object d() {
        int i6 = this.f12330w;
        Object obj = this.f12332y;
        j jVar = (j) this.f12331x;
        switch (i6) {
            case 1:
                Iterable iterable = (Iterable) obj;
                l lVar = (l) jVar.f1788c;
                lVar.getClass();
                if (iterable.iterator().hasNext()) {
                    lVar.b().compileStatement("DELETE FROM events WHERE _id in " + l.l(iterable)).execute();
                }
                break;
            default:
                jVar.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    long jIntValue = ((Integer) entry.getValue()).intValue();
                    d dVar = d.INVALID_PAYLOD;
                    String str = (String) entry.getKey();
                    l lVar2 = (l) jVar.f1794i;
                    lVar2.getClass();
                    lVar2.g(new M1.i(jIntValue, str, dVar));
                }
                break;
        }
        return null;
    }

    @Override // D3.a
    public final void e(c cVar) {
        D3.a aVar = (D3.a) this.f12331x;
        D3.a aVar2 = (D3.a) this.f12332y;
        aVar.e(cVar);
        aVar2.e(cVar);
    }
}
