package N;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: N.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0114z {
    public static float a(VelocityTracker velocityTracker, int i6) {
        return velocityTracker.getAxisVelocity(i6);
    }

    public static float b(VelocityTracker velocityTracker, int i6, int i7) {
        return velocityTracker.getAxisVelocity(i6, i7);
    }

    public static boolean c(VelocityTracker velocityTracker, int i6) {
        return velocityTracker.isAxisSupported(i6);
    }
}
