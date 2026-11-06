package N;

import android.view.View;
import com.xo.anilab.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static void a(View view, T t5) {
        s.k kVar = (s.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null) {
            kVar = new s.k();
            view.setTag(R.id.tag_unhandled_key_listeners, kVar);
        }
        Objects.requireNonNull(t5);
        View.OnUnhandledKeyEventListener m5 = new M();
        kVar.put(t5, m5);
        view.addOnUnhandledKeyEventListener(m5);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, T t5) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        s.k kVar = (s.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(t5, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i6) {
        return (T) view.requireViewById(i6);
    }

    public static void g(View view, boolean z5) {
        view.setAccessibilityHeading(z5);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, Q.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z5) {
        view.setScreenReaderFocusable(z5);
    }
}
