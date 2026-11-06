package N;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0093g b(View view, C0093g c0093g) {
        ContentInfo contentInfoL = c0093g.f1988a.l();
        Objects.requireNonNull(contentInfoL);
        ContentInfo contentInfoH = M0.a.h(contentInfoL);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoH);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoH ? c0093g : new C0093g(new S0.f(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0108t interfaceC0108t) {
        if (interfaceC0108t == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new S(interfaceC0108t));
        }
    }
}
