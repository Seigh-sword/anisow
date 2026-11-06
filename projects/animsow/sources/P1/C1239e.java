package p1;

import java.io.File;

/* JADX INFO: renamed from: p1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1239e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12245b;

    public /* synthetic */ C1239e(int i6, Object obj) {
        this.f12244a = i6;
        this.f12245b = obj;
    }

    @Override // p1.x
    public final boolean a(Object obj) {
        switch (this.f12244a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p1.x
    public final w b(Object obj, int i6, int i7, j1.m mVar) {
        int i8 = this.f12244a;
        Object obj2 = this.f12245b;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                byte[] bArr = (byte[]) obj;
                return new w(new B1.b(bArr), new C1238d(bArr, (InterfaceC1237c) obj2));
            case 1:
                return new w(new B1.b(obj), new C1242h(obj.toString(), 0, (S0.f) obj2));
            default:
                File file = (File) obj;
                return new w(new B1.b(file), new C1242h(file, 1, (n) obj2));
        }
    }
}
