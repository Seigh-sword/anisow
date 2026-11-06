package R2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f2951x;

    public /* synthetic */ f(j jVar, int i6) {
        this.f2950w = i6;
        this.f2951x = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        int i6 = this.f2950w;
        j jVar = this.f2951x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (jVar.f2979i != null && (context = jVar.f2978h) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    i iVar = jVar.f2979i;
                    iVar.getLocationInWindow(iArr);
                    int height = (iHeight - (iVar.getHeight() + iArr[1])) + ((int) iVar.getTranslationY());
                    int i7 = jVar.f2986p;
                    if (height < i7) {
                        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(j.f2970z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i8 = jVar.f2986p;
                            jVar.f2987q = i8;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i8 - height) + marginLayoutParams.bottomMargin;
                            iVar.requestLayout();
                        }
                    } else {
                        jVar.f2987q = i7;
                    }
                    break;
                }
                break;
            case 1:
                jVar.b();
                break;
            default:
                i iVar2 = jVar.f2979i;
                if (iVar2 != null) {
                    ViewParent parent = iVar2.getParent();
                    i iVar3 = jVar.f2979i;
                    if (parent != null) {
                        iVar3.setVisibility(0);
                    }
                    if (iVar3.getAnimationMode() != 1) {
                        int height2 = iVar3.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = iVar3.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        iVar3.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(jVar.f2975e);
                        valueAnimator.setDuration(jVar.f2973c);
                        valueAnimator.addListener(new c(jVar, 0));
                        valueAnimator.addUpdateListener(new d(jVar, height2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(jVar.f2974d);
                        valueAnimatorOfFloat.addUpdateListener(new b(jVar, 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(jVar.f2976f);
                        valueAnimatorOfFloat2.addUpdateListener(new b(jVar, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(jVar.f2971a);
                        animatorSet.addListener(new c(jVar, 1));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
