package F0;

import java.util.ArrayList;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class y extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f597c;

    public y(Object obj, int i6, Object obj2) {
        this.f595a = i6;
        this.f597c = obj;
        this.f596b = obj2;
    }

    @Override // F0.x, F0.u
    public final void a(w wVar) {
        int i6 = this.f595a;
        Object obj = this.f596b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((ArrayList) ((C1280b) obj).getOrDefault(((z) this.f597c).f599x, null)).remove(wVar);
                wVar.F(this);
                break;
            default:
                ((w) obj).I();
                wVar.F(this);
                break;
        }
    }
}
