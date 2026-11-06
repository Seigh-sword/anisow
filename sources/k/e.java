package K;

import com.google.android.gms.internal.measurement.C0396c2;
import java.util.ArrayList;
import s.k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements M.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1480b;

    public /* synthetic */ e(int i6, Object obj) {
        this.f1479a = i6;
        this.f1480b = obj;
    }

    @Override // M.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f1479a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                b((f) obj);
                break;
            default:
                b((f) obj);
                break;
        }
    }

    public final void b(f fVar) {
        switch (this.f1479a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((C0396c2) this.f1480b).L(fVar);
                return;
            default:
                synchronized (g.f1485c) {
                    try {
                        k kVar = g.f1486d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f1480b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f1480b);
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            ((M.a) arrayList.get(i6)).a(fVar);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
