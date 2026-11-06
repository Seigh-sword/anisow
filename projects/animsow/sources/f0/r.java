package F0;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j6) {
        ((AnimatorSet) animator).setCurrentPlayTime(j6);
    }
}
