package b5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends S0.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f5994y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f5995z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar) {
        super("OkHttp %s ping", new Object[]{sVar.f6043z});
        this.f5994y = 1;
        this.f5995z = sVar;
    }

    @Override // S0.c
    public final void b() {
        Object obj;
        boolean z5;
        switch (this.f5994y) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                s sVar = (s) this.f5995z;
                sVar.getClass();
                try {
                    sVar.f6037Q.k(2, 0, false);
                    return;
                } catch (IOException e6) {
                    sVar.c(e6);
                    return;
                }
            case 1:
                synchronized (((s) this.f5995z)) {
                    obj = this.f5995z;
                    if (((s) obj).f6028H < ((s) obj).f6027G) {
                        z5 = true;
                    } else {
                        ((s) obj).f6027G++;
                        z5 = false;
                    }
                    break;
                }
                s sVar2 = (s) obj;
                if (z5) {
                    sVar2.c(null);
                    return;
                }
                sVar2.getClass();
                try {
                    sVar2.f6037Q.k(1, 0, false);
                    return;
                } catch (IOException e7) {
                    sVar2.c(e7);
                    return;
                }
            default:
                s sVar3 = (s) ((q) this.f5995z).f6014A;
                sVar3.f6041x.a(sVar3);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, String str, Object[] objArr, int i6) {
        super(str, objArr);
        this.f5994y = i6;
        this.f5995z = obj;
    }
}
