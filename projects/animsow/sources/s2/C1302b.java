package s2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import s.k;

/* JADX INFO: renamed from: s2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1302b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f12621a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12622b = new k();

    public static C1302b a(Context context, int i6) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i6);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e6) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i6), e6);
            return null;
        }
    }

    public static C1302b b(ArrayList arrayList) {
        C1302b c1302b = new C1302b();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Animator animator = (Animator) arrayList.get(i6);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1302b.f12622b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC1301a.f12618b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC1301a.f12619c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC1301a.f12620d;
            }
            C1303c c1303c = new C1303c();
            c1303c.f12626d = 0;
            c1303c.f12627e = 1;
            c1303c.f12623a = startDelay;
            c1303c.f12624b = duration;
            c1303c.f12625c = interpolator;
            c1303c.f12626d = objectAnimator.getRepeatCount();
            c1303c.f12627e = objectAnimator.getRepeatMode();
            c1302b.f12621a.put(propertyName, c1303c);
        }
        return c1302b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1302b) {
            return this.f12621a.equals(((C1302b) obj).f12621a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12621a.hashCode();
    }

    public final String toString() {
        return "\n" + C1302b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f12621a + "}\n";
    }
}
