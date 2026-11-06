package l1;

import N.V;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Handler.Callback {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9871w;

    public /* synthetic */ I(int i6) {
        this.f9871w = i6;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i6 = 1;
        int i7 = 0;
        switch (this.f9871w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (message.what != 1) {
                    return false;
                }
                ((F) message.obj).f();
                return true;
            default:
                int i8 = message.what;
                if (i8 == 0) {
                    R2.j jVar = (R2.j) message.obj;
                    R2.i iVar = jVar.f2979i;
                    if (iVar.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
                        if (layoutParams instanceof B.e) {
                            B.e eVar = (B.e) layoutParams;
                            BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            K1.b bVar = baseTransientBottomBar$Behavior.f7294j;
                            bVar.getClass();
                            bVar.f1515x = jVar.f2990t;
                            baseTransientBottomBar$Behavior.f7044b = new C1243i(17, jVar);
                            B.b bVar2 = eVar.f37a;
                            if (bVar2 != baseTransientBottomBar$Behavior) {
                                if (bVar2 != null) {
                                    bVar2.i();
                                }
                                eVar.f37a = baseTransientBottomBar$Behavior;
                                eVar.f38b = true;
                            }
                            eVar.f43g = 80;
                        }
                        iVar.f2960G = true;
                        jVar.f2977g.addView(iVar);
                        iVar.f2960G = false;
                        jVar.e();
                        iVar.setVisibility(4);
                    }
                    WeakHashMap weakHashMap = V.f1964a;
                    if (iVar.isLaidOut()) {
                        jVar.d();
                        return true;
                    }
                    jVar.f2988r = true;
                    return true;
                }
                if (i8 != 1) {
                    return false;
                }
                R2.j jVar2 = (R2.j) message.obj;
                int i9 = message.arg1;
                AccessibilityManager accessibilityManager = jVar2.f2989s;
                if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                    R2.i iVar2 = jVar2.f2979i;
                    if (iVar2.getVisibility() == 0) {
                        if (iVar2.getAnimationMode() == 1) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            valueAnimatorOfFloat.setInterpolator(jVar2.f2974d);
                            valueAnimatorOfFloat.addUpdateListener(new R2.b(jVar2, 0));
                            valueAnimatorOfFloat.setDuration(jVar2.f2972b);
                            valueAnimatorOfFloat.addListener(new R2.a(jVar2, i9, i7));
                            valueAnimatorOfFloat.start();
                            return true;
                        }
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int height = iVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = iVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        valueAnimator.setIntValues(0, height);
                        valueAnimator.setInterpolator(jVar2.f2975e);
                        valueAnimator.setDuration(jVar2.f2973c);
                        valueAnimator.addListener(new R2.a(jVar2, i9, i6));
                        valueAnimator.addUpdateListener(new R2.e(jVar2));
                        valueAnimator.start();
                        return true;
                    }
                }
                jVar2.b();
                return true;
        }
    }
}
