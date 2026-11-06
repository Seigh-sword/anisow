package S;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InputContentInfo f3055w;

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3055w = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // S.g
    public final void a() {
        this.f3055w.requestPermission();
    }

    @Override // S.g
    public final Uri b() {
        return this.f3055w.getLinkUri();
    }

    @Override // S.g
    public final ClipDescription c() {
        return this.f3055w.getDescription();
    }

    @Override // S.g
    public final Object e() {
        return this.f3055w;
    }

    @Override // S.g
    public final Uri g() {
        return this.f3055w.getContentUri();
    }

    public f(Object obj) {
        this.f3055w = (InputContentInfo) obj;
    }
}
