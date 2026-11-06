package N;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: N.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0085c implements InterfaceC0087d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ContentInfo.Builder f1975w;

    public C0085c(ClipData clipData, int i6) {
        this.f1975w = M0.a.f(clipData, i6);
    }

    @Override // N.InterfaceC0087d
    public final C0093g a() {
        return new C0093g(new S0.f(this.f1975w.build()));
    }

    @Override // N.InterfaceC0087d
    public final void b(Bundle bundle) {
        this.f1975w.setExtras(bundle);
    }

    @Override // N.InterfaceC0087d
    public final void c(Uri uri) {
        this.f1975w.setLinkUri(uri);
    }

    @Override // N.InterfaceC0087d
    public final void d(int i6) {
        this.f1975w.setFlags(i6);
    }
}
