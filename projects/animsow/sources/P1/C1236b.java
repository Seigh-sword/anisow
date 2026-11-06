package p1;

import android.content.res.AssetManager;
import android.net.Uri;

/* JADX INFO: renamed from: p1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1236b implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f12240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1235a f12241b;

    public C1236b(AssetManager assetManager, InterfaceC1235a interfaceC1235a) {
        this.f12240a = assetManager;
        this.f12241b = interfaceC1235a;
    }

    @Override // p1.x
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // p1.x
    public final w b(Object obj, int i6, int i7, j1.m mVar) {
        Uri uri = (Uri) obj;
        return new w(new B1.b(uri), this.f12241b.r(this.f12240a, uri.toString().substring(22)));
    }
}
