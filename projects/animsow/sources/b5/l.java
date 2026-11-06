package b5;

import f5.C0710g;
import java.io.IOException;
import m2.C1018C;

/* JADX INFO: loaded from: classes.dex */
public final class l extends S0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f5998A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ s f5999B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f6000y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0710g f6001z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, Object[] objArr, int i6, C0710g c0710g, int i7, boolean z5) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f5999B = sVar;
        this.f6000y = i6;
        this.f6001z = c0710g;
        this.f5998A = i7;
    }

    @Override // S0.c
    public final void b() {
        try {
            C1018C c1018c = this.f5999B.f6026F;
            C0710g c0710g = this.f6001z;
            int i6 = this.f5998A;
            c1018c.getClass();
            c0710g.a(i6);
            this.f5999B.f6037Q.l(this.f6000y, EnumC0346b.CANCEL);
            synchronized (this.f5999B) {
                this.f5999B.f6039S.remove(Integer.valueOf(this.f6000y));
            }
        } catch (IOException unused) {
        }
    }
}
