package b5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends S0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f5987A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ s f5988B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f5989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f5990z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(s sVar, String str, Object[] objArr, int i6, Object obj, int i7) {
        super(str, objArr);
        this.f5989y = i7;
        this.f5988B = sVar;
        this.f5990z = i6;
        this.f5987A = obj;
    }

    @Override // S0.c
    public final void b() {
        switch (this.f5989y) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                s sVar = this.f5988B;
                try {
                    sVar.f6037Q.l(this.f5990z, (EnumC0346b) this.f5987A);
                    return;
                } catch (IOException e6) {
                    sVar.c(e6);
                    return;
                }
            case 1:
                this.f5988B.f6026F.getClass();
                synchronized (this.f5988B) {
                    this.f5988B.f6039S.remove(Integer.valueOf(this.f5990z));
                    break;
                }
                return;
            default:
                this.f5988B.f6026F.getClass();
                try {
                    this.f5988B.f6037Q.l(this.f5990z, EnumC0346b.CANCEL);
                    synchronized (this.f5988B) {
                        this.f5988B.f6039S.remove(Integer.valueOf(this.f5990z));
                        break;
                    }
                    return;
                } catch (IOException unused) {
                    return;
                }
        }
    }
}
