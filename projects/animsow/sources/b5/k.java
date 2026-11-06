package b5;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends S0.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f5996y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ s f5997z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, Object[] objArr, int i6, ArrayList arrayList, boolean z5) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f5997z = sVar;
        this.f5996y = i6;
    }

    @Override // S0.c
    public final void b() {
        this.f5997z.f6026F.getClass();
        try {
            this.f5997z.f6037Q.l(this.f5996y, EnumC0346b.CANCEL);
            synchronized (this.f5997z) {
                this.f5997z.f6039S.remove(Integer.valueOf(this.f5996y));
            }
        } catch (IOException unused) {
        }
    }
}
