package N;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {
    public static int a(int i6) {
        int iStatusBars;
        int i7 = 0;
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i6 & i8) != 0) {
                if (i8 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i8 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i8 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i8 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i8 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i8 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i8 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i8 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i7 |= iStatusBars;
            }
        }
        return i7;
    }
}
