package p1;

import java.io.File;

/* JADX INFO: renamed from: p1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1241g implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12248a;

    public /* synthetic */ C1241g(int i6) {
        this.f12248a = i6;
    }

    @Override // p1.x
    public final boolean a(Object obj) {
        switch (this.f12248a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return true;
            default:
                return false;
        }
    }

    @Override // p1.x
    public final w b(Object obj, int i6, int i7, j1.m mVar) {
        switch (this.f12248a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                File file = (File) obj;
                return new w(new B1.b(file), new C1240f(0, file));
            default:
                return null;
        }
    }
}
