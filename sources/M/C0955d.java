package m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import d.AbstractC0628i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: m.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0955d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10249b;

    public /* synthetic */ C0955d(int i6, Object obj) {
        this.f10248a = i6;
        this.f10249b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f10248a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f10249b;
                actionBarOverlayLayout.f5179S = null;
                actionBarOverlayLayout.f5166F = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6 = this.f10248a;
        Object obj = this.f10249b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f5179S = null;
                actionBarOverlayLayout.f5166F = false;
                return;
            case 1:
                ((F0.w) obj).q();
                animator.removeListener(this);
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                G0.f fVar = (G0.f) obj;
                ArrayList arrayList = new ArrayList(fVar.f679A);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((G0.c) arrayList.get(i7)).a(fVar);
                }
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((HideBottomViewOnScrollBehavior) obj).f7042h = null;
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
            default:
                super.onAnimationEnd(animator);
                return;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.I(5);
                WeakReference weakReference = bottomSheetBehavior.f7072U;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) bottomSheetBehavior.f7072U.get()).requestLayout();
                return;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0628i.p(obj);
                throw null;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                I2.h hVar = (I2.h) obj;
                hVar.f1138b.setTranslationY(0.0f);
                hVar.b(0.0f);
                return;
            case 9:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.f7286p;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.f7286p.get()).requestLayout();
                return;
            case 10:
                S2.j jVar = (S2.j) obj;
                jVar.q();
                jVar.f3143r.start();
                return;
            case 11:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f10248a) {
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                super.onAnimationRepeat(animator);
                K2.n nVar = (K2.n) this.f10249b;
                nVar.f1591B = (nVar.f1591B + 1) % nVar.f1590A.f1553c.length;
                nVar.f1592C = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i6 = this.f10248a;
        Object obj = this.f10249b;
        switch (i6) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                G0.f fVar = (G0.f) obj;
                ArrayList arrayList = new ArrayList(fVar.f679A);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((G0.c) arrayList.get(i7)).b(fVar);
                }
                return;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0628i.p(obj);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
