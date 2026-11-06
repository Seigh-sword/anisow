package T4;

import C4.l;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends D4.i implements l {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3544x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f3545y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f3546z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i6) {
        super(1);
        this.f3544x = i6;
        this.f3545y = dVar;
        this.f3546z = cVar;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        C1316l c1316l = C1316l.f12640a;
        c cVar = this.f3546z;
        d dVar = this.f3545y;
        int i6 = this.f3544x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        dVar.f(cVar.f3548x);
                        break;
                    default:
                        d.f3550h.set(dVar, cVar.f3548x);
                        dVar.f(cVar.f3548x);
                        break;
                }
                break;
            default:
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        dVar.f(cVar.f3548x);
                        break;
                    default:
                        d.f3550h.set(dVar, cVar.f3548x);
                        dVar.f(cVar.f3548x);
                        break;
                }
                break;
        }
        return c1316l;
    }
}
