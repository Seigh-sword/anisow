package m;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class G0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z5) {
        popupWindow.setIsClippedToScreen(z5);
    }
}
