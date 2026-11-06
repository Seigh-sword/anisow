package m;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class M0 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
