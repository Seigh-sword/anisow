package N;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class S implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0108t f1959a;

    public S(InterfaceC0108t interfaceC0108t) {
        this.f1959a = interfaceC0108t;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0093g c0093g = new C0093g(new S0.f(contentInfo));
        C0093g c0093gA = ((T.r) this.f1959a).a(view, c0093g);
        if (c0093gA == null) {
            return null;
        }
        if (c0093gA == c0093g) {
            return contentInfo;
        }
        ContentInfo contentInfoL = c0093gA.f1988a.l();
        Objects.requireNonNull(contentInfoL);
        return M0.a.h(contentInfoL);
    }
}
