package Y;

import f5.w;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4711x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f4712y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i6) {
        super(0);
        this.f4711x = i6;
        this.f4712y = fVar;
    }

    @Override // C4.a
    public final Object b() {
        switch (this.f4711x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                f fVar = this.f4712y;
                w wVar = (w) fVar.f4718d.b();
                wVar.getClass();
                if (g5.c.a(wVar) != -1) {
                    return B3.e.o(wVar.f8493w.q(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f4718d + ", instead got " + wVar).toString());
            default:
                B3.e eVar = f.f4714g;
                f fVar2 = this.f4712y;
                synchronized (eVar) {
                    f.f4713f.remove(((w) fVar2.f4719e.getValue()).f8493w.q());
                }
                return C1316l.f12640a;
        }
    }
}
